package com.davidgrajales.calculadoraderesistencias

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import java.security.AccessControlContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var color1:String
        var color2:String
        var color3:String
        val spinner = findViewById(R.id.sp_color1) as Spinner
        val spinner2=findViewById(R.id.sp_color2) as Spinner
        val spinner3=findViewById(R.id.sp_color3) as Spinner
        val imageName = arrayOf("Negro","Café","Rojo","Naranja","Amarillo","Verde","Azul","Violeta","Gris","Blanco")
        val image =intArrayOf(R.drawable.negro, R.drawable.cafe, R.drawable.rojo, R.drawable.naranja,R.drawable.amarillo,R.drawable.verde,R.drawable.azul,R.drawable.morado,R.drawable.gris,R.drawable.blanco)
        //val arrayAdapter=ArrayAdapter(this,R.layout.sp_colors_david,imageName)
        val spinnerCustomAdapter = SpinnerCustomAdapter(applicationContext, image, imageName)
        spinner3.adapter=spinnerCustomAdapter
        spinner2.adapter=spinnerCustomAdapter
        spinner.adapter = spinnerCustomAdapter
        spinner.onItemSelectedListener=object :

            AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                color1=imageName[position]

                if (color1=="Negro"){
                    tv_result.text="0"
                }
                else if(color1=="Café"){
                    tv_result.text="1"
                }
                else if(color1=="Rojo"){
                    tv_result.text="2"
                }
                else if(color1=="Naranja"){
                    tv_result.text="3"
                }
                else if(color1=="Amarillo"){
                    tv_result.text="4"
                }
                else if(color1=="Verde"){
                    tv_result.text="5"
                }
                else if(color1=="Azul"){
                    tv_result.text="6"
                }
                else if(color1=="Violeta"){
                    tv_result.text="7"
                }
                else if(color1=="Gris"){
                    tv_result.text="8"
                }
                else{
                    tv_result.text="9"
                }

            }


        }
        spinner2.onItemSelectedListener=object :

            AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                color2=imageName[position]

                if (color2=="Negro"){
                    tv_result2.text="0"
                }
                else if(color2=="Café"){
                    tv_result2.text="1"
                }
                else if(color2=="Rojo"){
                    tv_result2.text="2"
                }
                else if(color2=="Naranja"){
                    tv_result2.text="3"
                }
                else if(color2=="Amarillo"){
                    tv_result2.text="4"
                }
                else if(color2=="Verde"){
                    tv_result2.text="5"
                }
                else if(color2=="Azul"){
                    tv_result2.text="6"
                }
                else if(color2=="Violeta"){
                    tv_result2.text="7"
                }
                else if(color2=="Gris"){
                    tv_result2.text="8"
                }
                else{
                    tv_result2.text="9"
                }
            }

        }

        spinner3.onItemSelectedListener=object :

            AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                color3=imageName[position]

                if (color3=="Negro"){
                    tv_decimals.text=" Ohm"
                }
                else if(color3=="Café"){
                    tv_decimals.text="0 Ohm"
                }
                else if(color3=="Rojo"){
                    tv_decimals.text="00 Ohm"
                }
                else if(color3=="Naranja"){
                    tv_decimals.text="000 Ohm"
                }
                else if(color3=="Amarillo"){
                    tv_decimals.text="0000 Ohm"
                }
                else if(color3=="Verde"){
                   tv_decimals.text="00000 Ohm"
                }
                else if(color3=="Azul"){
                    tv_decimals.text="000000 Ohm"
                }
                else if(color3=="Violeta"){
                    tv_decimals.text="0000000 Ohm"
                }
                else if(color3=="Gris"){
                    tv_decimals.text="00000000 Ohm"
                }
                else{
                    tv_decimals.text="000000000 Ohm"
                }
            }

        }


    }

    class SpinnerCustomAdapter(
        internal var context: Context,
        internal var flags: IntArray,
        internal var Network: Array<String>
    ) : BaseAdapter() {
        internal var inflter: LayoutInflater

        init {
            inflter = LayoutInflater.from(context)
        }

        override fun getCount(): Int {
            return flags.size
        }

        override fun getItem(i: Int): Any? {
            return null
        }

        override fun getItemId(i: Int): Long {
            return 0
        }

        override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {
            var view = view
            view = inflter.inflate(R.layout.sp_colors_david, null)
            val icon = view?.findViewById(R.id.spinner_image) as ImageView
            val names = view?.findViewById(R.id.spinner_text) as TextView
            icon.setImageResource(flags[i])
            names.text = Network[i]
            return view
        }
    }
}