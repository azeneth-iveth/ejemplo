package com.example.inmc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imc()
    }

    fun imc() {
        calcular.setOnClickListener() {
            try {
                var cm1: Double = (altura.text.toString()).toDouble()
                var kg: Double = (peso.text.toString()).toDouble()

                var cm: Double = (cm1/100).toDouble()
                var masa: Double = (kg / (cm * cm)).toDouble()
                var masa1: String = (kg / (cm * cm)).toString()

                if (masa < 18.5) {
                    txtinforme.setText("Tienes bajo peso");
                    txtresultado.setText(masa1);

                } else if (masa >= 18.5 && masa <= 24.9) {
                    txtinforme.setText("Peso normal");
                    txtresultado.setText(masa1);

                } else if (masa >= 25 && masa <= 29.9) {
                    txtinforme.setText("Tinene sobrepeso");
                    txtresultado.setText(masa1);

                } else if (masa >= 30 && masa <= 39.9) {
                    txtinforme.setText("Tienes Obesidad1");
                    txtresultado.setText(masa1);

                } else {
                    txtinforme.setText("Tienes Obesidad2");
                    txtresultado.setText(masa1);
                }
            } catch (e: Exception) {
                Toast.makeText(applicationContext, "Faltan datos", Toast.LENGTH_SHORT).show()


            };
        }
    }

}
