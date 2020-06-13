# Alcohol or gas app
![](https://img.shields.io/github/languages/count/diegobpaula/alcool-gasolina) ![](https://img.shields.io/github/languages/top/diegobpaula/alcool-gasolina)	![](https://img.shields.io/github/last-commit/diegobpaula/alcool-gasolina)	![](https://img.shields.io/github/repo-size/diegobpaula/alcool-gasolina)

The app was developed in Kotlin language, the purpose of the app is to calculate which is the best option for supplying the vehicle.

## Screenshots

![](https://github.com/diegobpaula/alcool-gasolina/blob/master/screenshots/printOne.jpg?raw=true)	![](https://github.com/diegobpaula/alcool-gasolina/blob/master/screenshots/printTwo.jpg?raw=true)	![](https://github.com/diegobpaula/alcool-gasolina/blob/master/screenshots/printThree.jpg?raw=true)

## Field validation code
Below I show the validation code for EditText for alcohol or gasoline:



    fun validarCampos(alcool: String, gasolina: String): Boolean {
    
            var camposValidados: Boolean = true
    
            if (alcool == null || alcool.equals("")) {
    
                camposValidados = false
    
            } else if (gasolina == null || gasolina.equals("")) {
    
                camposValidados = false
            }
    
            return camposValidados
        }

## Development steps
- Android Studio 3.5.3

## I, Diego
- [Linkedln](http://https://www.linkedin.com/in/diegobpaula/ "Linkedln")
- Email: diego.paula@live.com
