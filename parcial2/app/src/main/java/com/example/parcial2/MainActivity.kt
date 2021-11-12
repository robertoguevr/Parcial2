package com.example.parcial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var Perro =  Mascota()
    var Gato =  Mascota()
    var Tortuga =  Mascota()
    var Perico =  Mascota()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Perro.especie = "Pug"
        Perro.color = "Cafe"
        Perro.sexo = "Masculino"
        Perro.peso = 10.0
        Gato.especie = "Gato"
        Gato.color = "Negro"
        Gato.sexo = "Masculino"
        Gato.peso = 15.0
        Tortuga.especie = "De rio"
        Tortuga.color = "Marron"
        Tortuga.sexo = "Feminino"
        Tortuga.peso = 10.0
        Perico.especie = "Australiano"
        Perico.color = "Celeste"
        Perico.sexo = "Femenino"
        Perico.peso = 0.3
    }
    fun SelectMascota(Vista: View){
        when(Vista.id){
            R.id.imgbPerro -> Toast.makeText(this,"Especie: " +
                    Perro.especie + ", Color: " + Perro.color + ", Sexo: " +
                    Perro.sexo + ", Peso: " + Perro.peso + "Kg",
                Toast.LENGTH_SHORT).show()
            R.id.imgB_Gato -> Toast.makeText(this,"Especie: " +
                    Gato.especie + ", Color: " + Gato.color + ", Sexo: " +
                    Gato.sexo + ", Peso: " + Gato.peso + "KG",
                Toast.LENGTH_SHORT).show()
            R.id.imgBTortuga -> Toast.makeText(this,"Especie: " +
                    Tortuga.especie + ", Color: " + Tortuga.color + ", Sexo: " +
                    Tortuga.sexo + ", Peso: " + Tortuga.peso + "Kg",
                Toast.LENGTH_SHORT).show()
            R.id.imgBPerico -> Toast.makeText(this,"Especie: " +
                    Perico.especie + ", Color: " + Perico.color + ", Sexo: " +
                    Perico.sexo + ", Peso: " + Perico.peso + "Kg",
                Toast.LENGTH_SHORT).show()

        }
    }
}