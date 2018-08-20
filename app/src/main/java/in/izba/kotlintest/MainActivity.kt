package `in`.izba.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // first kotlin programme for testing
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.helloClick) as Button
        button.setOnClickListener{
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }

        val text: TextView = findViewById<TextView>(R.id.headerText) as TextView
        text.setOnClickListener {
            text.setText(getString(R.string.name))
        }

        val imageView: ImageView = findViewById<ImageView>(R.id.myImage) as ImageView
        imageView.setOnClickListener{
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }

    }
}
