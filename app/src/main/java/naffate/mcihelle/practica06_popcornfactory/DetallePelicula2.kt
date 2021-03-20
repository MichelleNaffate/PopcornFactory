package naffate.mcihelle.practica06_popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_pelicula2.*
import kotlinx.android.synthetic.main.pelicula.*

class DetallePelicula2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula2)
        val bundle = intent.extras
        var ns = 0
        var pos = -1
        var title =""
        if (bundle !=null){
            ns = bundle.getInt("numberSeats")
            title = bundle.getString("Nombre")!!
            this.iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            this.tv_nombre.setText(bundle.getString("Nombre"))
            this.tv_pelicula_desc.setText(bundle.getString("sinopsis"))
            this.seatsLeft.setText("$ns seats available")
            pos = bundle.getInt("pos")

        }
        if(ns==0){
            buy_ticket.isEnabled = false
        }else{
            buy_ticket.setOnClickListener {
                val intent: Intent = Intent(this, SeatSelection::class.java)
                intent.putExtra("pos", pos)
                intent.putExtra("name", title)
                intent.putExtra("header", bundle?.getInt("header"))
                this.startActivity(intent)
            }
        }
    }
    }
