package com.ferratone.gasolinaoulcool


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun calcularPreco(view: View) {

        // Recuperar valores digitados

        val precoAlcool = edtPrecoAlcoolId.text.toString()
        val precoGasolina = edtPrecoGasolinaId.text.toString()

        val validaCampos = validarCampos(precoAlcool, precoGasolina)

        if (validaCampos) {

            calcularMelhorPreco(precoAlcool, precoGasolina)

        } else {

            Toast.makeText(applicationContext, "Preencha os preços primeiro", Toast.LENGTH_LONG)
                .show()
        }

    }


    fun validarCampos(alcool: String, gasolina: String): Boolean {

        var camposValidados: Boolean = true

        if (alcool == null || alcool.equals("")) {

            camposValidados = false

        } else if (gasolina == null || gasolina.equals("")) {

            camposValidados = false
        }

        return camposValidados
    }

    fun calcularMelhorPreco(alcool: String, gasolina: String) {

        // Converter valores string para números
        val valorAlcool: Double = alcool.toDouble()
        val valorGasolina: Double = gasolina.toDouble()

        val resultoPreco: Double = valorAlcool / valorGasolina

        if (resultoPreco > 0.7) {
            txtResultadoId.text = "Melhor utilizar gasolina."
        } else {
            txtResultadoId.text = "Melhor utilizar álcool."
        }
    }

}
