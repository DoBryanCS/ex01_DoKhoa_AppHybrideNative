package com.example.ex01_dokhoa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)

        val show1: ImageButton = this.findViewById(R.id.imageButton1)
        val show2: ImageButton = this.findViewById(R.id.imageButton2)
        val show3: ImageButton = this.findViewById(R.id.imageButton3)


        show1.setOnClickListener { detailShow(1) }
        show2.setOnClickListener { detailShow(2) }
        show3.setOnClickListener { detailShow(3) }

    }
    private fun detailShow(v: Int) {
        val titles = arrayOf("Attack on Titan", "B the Beginning", "Black Clover")
        val plots = arrayOf(
            """Several hundred years ago, humans were nearly exterminated by the Titans. Titans are typically several stories tall, seem to have no intelligence, devour human beings and, worst of all, seem to do it for the pleasure rather than as a food source. A small percentage of humanity survived by building a city protected by extremely high walls, even taller than the largest of Titans. Flash forward to the present and the city has not seen a Titan in over a hundred years, until one day, a Colossal Titan appears out of thin air and destroys part of the city wall. As teenage boy Eren Jaeger and his foster sister Mikasa Ackerman witness the destruction of their town and death of their mother at the hands of the Titans, Eren vows to kill every single Titan and take revenge for all of mankind.""",
            """In a world powered by advanced technology, crime and action unfold in the archipelagic nation of Cremona. Koku, the protagonist. Keith, the legendary investigator of the royal police force RIS. A mysterious criminal organization. A wide variety of characters race through the fortified city as it is beset by the serial killer, Killer B, and a chain of crimes in this suspense drama by director Kazuto Nakazawa and Production I.G.""",
            """Asta and Yuno were abandoned together as babies in baskets in the same church the same day, and since then they have been inseparable. When they were children, they promised that they would compete to see who would become the next Wizard King. However, as they grew, some differences between them became clear: Yuno was a magical prodigy, while Asta could not use magic at all. In a country where magic is everything and athletic ability is nothing, Asta tried every day to provoke even the simplest magic of himself with physical training and strong proclamations of his will.""")
        val genres = arrayOf(
            """Action, Animation, Drama, Fantasy""",
            """Science Fiction, Suspense, Thriller""",
            """Action, Animation, Comedy, Fantasy"""
        )
        val studios = arrayOf(
            "NHK",
            "Netflix",
            "TV Tokyo"
        )

        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        if (v == 1) {
            intent.putExtra("title", titles[0])
            intent.putExtra("plot", plots[0])
            intent.putExtra("genre", genres[0])
            intent.putExtra("studio", studios[0])
        }
        else if (v == 2) {
            intent.putExtra("title", titles[1])
            intent.putExtra("plot", plots[1])
            intent.putExtra("genre", genres[1])
            intent.putExtra("studio", studios[1])

        } else {
            intent.putExtra("title", titles[2])
            intent.putExtra("plot", plots[2])
            intent.putExtra("genre", genres[2])
            intent.putExtra("studio", studios[2])
        }

        startActivity(intent)
    }

}

