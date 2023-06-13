package com.hwido.listview_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<ListViewModel>) : BaseAdapter(){
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var converView = convertView

        if (converView == null) {
            converView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }

        val title = converView!!.findViewById<TextView>(R.id.listviewItem)
        title.text = List[position].title

        val content = converView!!.findViewById<TextView>(R.id.listviewItem2)
        content.text = List[position].content

        //List[0] -> ListViewModel("a", "b") => .title일때는 a, .content일때는 b
        //List[1] -> ListViewModel("c", "d") => .title일때는 c, .content일때는 d
        //List[2] -> ListViewModel("e", "f") => .title일때는 e, .content일때는 f

        return converView!!

    }
}