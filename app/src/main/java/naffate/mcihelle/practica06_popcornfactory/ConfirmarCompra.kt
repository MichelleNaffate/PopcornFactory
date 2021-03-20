package naffate.mcihelle.practica06_popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ConfirmarCompra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar_compra)

        val bundle = intent.extras

        val txtTitle: TextView = findViewById(R.id.titlePelicula) as TextView
        val imgPelicula: ImageView = findViewById(R.id.img_pelicula) as ImageView
        val txtasiento: TextView = findViewById(R.id.seat) as TextView
        val btnConfirm: Button = findViewById(R.id.btnConfirm) as Button

        txtasiento.setText(bundle?.getString("asiento"))
        txtTitle.setText(bundle?.getString("name"))
        imgPelicula.setImageResource(bundle!!.getInt("header"))

        btnConfirm.setOnClickListener {
            var intent = Intent(this, Catalogo2::class.java)
            intent.putExtra("posConfirm", bundle!!.getInt("asiento"))

            Toast.makeText(this,"enjoy the movie", Toast.LENGTH_LONG).show()
            this.startActivity(intent)
        }

    }
}