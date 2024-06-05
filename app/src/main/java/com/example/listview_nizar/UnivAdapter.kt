package com.example.listview_nizar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class UnivAdapter(var mContext: Context, var resource: Int, var items:List<Universitas>): ArrayAdapter<Universitas>(mContext, resource, items ) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mContext)
        val view:View = layoutInflater.inflate(resource, null)


        val imageView:ImageView = view.findViewById(R.id.photo)
        val namaUniversitas: TextView = view.findViewById(R.id.tvNama)
        val deskripsi: TextView = view.findViewById(R.id.tvDeskripsi)

        var mItem:Universitas = items[position]
        imageView.setImageDrawable(mContext.resources.getDrawable(mItem.photo))
        namaUniversitas.text = mItem.nama
        deskripsi.text = mItem.deskripsi

        return view
    }

}
