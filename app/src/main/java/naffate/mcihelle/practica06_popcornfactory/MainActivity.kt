package naffate.mcihelle.practica06_popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.ButtonStart)

        button.setOnClickListener {
            var intent : Intent = Intent(this, Catalogo2:: class.java)
            startActivity(intent)


        }
    }
}