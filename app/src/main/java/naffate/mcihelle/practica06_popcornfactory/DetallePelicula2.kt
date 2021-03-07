package naffate.mcihelle.practica06_popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_pelicula2.*

class DetallePelicula2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula2)
        val bundle = intent.extras

        if (bundle !=null){
            this.iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            this.tv_nombre.setText(bundle.getString("Nombre"))
            this.tv_pelicula_desc.setText(bundle.getString("sinopsis"))

        }
    }
}