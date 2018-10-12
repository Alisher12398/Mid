package com.android.lab3

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.TextView
import kotlinx.android.synthetic.main.news_layout.view.*
import android.support.v4.content.ContextCompat.startActivity
import android.content.Intent
import android.widget.Toast
import android.support.v7.widget.CardView
import android.widget.ImageView


//private val mContext: Context? = null
//val actors = ArrayList<NewsModel>()

/*
interface OnItemClickListener {
    fun onItemClick(item: NewsModel)
}

*/


class NewsAdapter(var persons:ArrayList<NewsModel>):RecyclerView.Adapter<NewsAdapter.ViewHolder>(){


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = persons[position].title
    }

    override fun onCreateViewHolder(holder: ViewGroup, position: Int): ViewHolder {
        val inflater = LayoutInflater.from(holder.context)
        val view = inflater.inflate(R.layout.news_layout, holder, false)
        return ViewHolder(view)
    }
    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun getItemCount(): Int {
        return persons.size
    }

    /*fun NewsAdapter(exampleList: ArrayList<NewsModel>) {
        mExampleList = exampleList
    }*/

//    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var title: TextView = itemView.primary_text
        //var image: ImageView  = itemView.media_image

       /* fun ViewHolder(itemView: View) {
            //super(itemView)
            val cvItem : CardView
            cvItem = itemView.findViewById(R.id.parent_layout) as CardView
            itemView.setOnClickListener(this)
        }

        override fun onClick(view: View) {
            mOnClickListener!!.onItemClick(adapterPosition)
        }*/

    }

    /*class ExampleViewHolder(itemView: View, listener: OnItemClickListener?) : RecyclerView.ViewHolder(itemView) {
        var mTextView1: TextView
        var mTextView2: TextView

        init {
            mTextView1 = itemView.findViewById(R.id.primary_text)
            mTextView2 = itemView.findViewById(R.id.sub_text)

            itemView.setOnClickListener {
                if (listener != null) {
                    val position = adapterPosition
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position)

                    }
                }
            }
        }
    }*/
}