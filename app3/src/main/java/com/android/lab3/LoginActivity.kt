package com.android.lab3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.EditText
import android.widget.TextView
import kotlin.concurrent.thread
import android.R.attr.name
import android.content.Intent


class LoginActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /*val db = App.getInstance().getDatabase()
        val UserDAO = db.UserDAO()
*/


        val login_edittext = findViewById<TextView>(R.id.login_edittext)
        val password_eddittext = findViewById<TextView>(R.id.password_eddittext)
        val button_login = findViewById<TextView>(R.id.button_login)

        /*if (login_edittext!=null){

        }*/

        button_login.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val user1 = User(1, login_edittext.text.toString(), password_eddittext.text.toString())
        /*user1.id = 1
        user1.name = login_edittext.text.toString()
        user1.password = password_eddittext.text.toString()*/

        //val user = TaskModelEntity(1, "Bob", "A")

        /*thread {
            val userDao = (applicationContext as App).database.userdao()

            (applicationContext as App).database.runInTransaction(object : Runnable {

                override fun run() {
                    userDao.insertUser(user1)
                    //val users = userDao.getTasks()
                }
            })
        }*/

    }
}

