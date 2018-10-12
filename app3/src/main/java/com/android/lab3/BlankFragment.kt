package com.android.lab3


import android.content.Context
import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.media.Image
import android.support.design.widget.TabItem
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank.*
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import android.widget.Toast
import android.widget.AdapterView.OnItemClickListener

import android.support.v7.widget.RecyclerView.OnItemTouchListener
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class BlankFragment : Fragment() {

    val todo_tasks = ArrayList<TaskModelEntity>()
    val todo_task2 = ArrayList<NewsModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_blank, container, false)

        todo_task2.add(NewsModel("Task 1", "Task1 Task1"))
        todo_task2.add(NewsModel("Task 2", "Task2 Task2"))

        var adapter2 = NewsAdapter(todo_task2)

        val recycler = root.findViewById(R.id.recycler) as RecyclerView

        recycler.adapter = adapter2

        recycler.layoutManager = LinearLayoutManager(activity)


        recycler.addOnItemTouchListener(RecyclerTouchListener(getActivity()!!.getApplicationContext(), recycler, object : RecyclerTouchListener.ClickListener {
            override fun onClick(view: View, position: Int) {
//                Toast.makeText(context,"is selected!", Toast.LENGTH_SHORT).show()
                val intent = Intent(context, Activity2::class.java)
                //intent.putExtra( "ExampleItem", actors[position])

                startActivity(intent)
            }

        }))

        /*adapter2.run {
            setOnItemClickListener(object : NewsAdapter.OnItemClickListener {
                @Override
                override fun onItemClick(position: Int) {

                    val toast = Toast.makeText(activity,
                            "Проверка2", Toast.LENGTH_SHORT)
                    toast.show()

                    val toast2 = Toast.makeText(context,
                            "Проверка", Toast.LENGTH_SHORT)
                    toast2.show()


                    val intent = Intent(context, Activity2::class.java)
                    intent.putExtra("Example Item", actors.get(position))

                    startActivity(intent)
                }
            })

        }*/


        /*recycler.setOnClickListener(View.OnClickListener {

            val toast = Toast.makeText(activity,
                    "Проверка", Toast.LENGTH_SHORT)
            toast.show()

            val intent = Intent(activity, Activity2::class.java)

            *//*val args =Bundle()
            args.putSerializable("Arraylist", actors)
            intent.putExtra("Bundle", args)*//*
            intent.putParcelableArrayListExtra("aa", actors)
            startActivity(intent)
        })*/

        //recycler.layoutManager = GridLayoutManager(activity, 2)

        return root
    }

}
