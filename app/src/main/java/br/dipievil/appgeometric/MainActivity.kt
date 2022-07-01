package br.dipievil.appgeometric

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var rbRectangle : RadioButton
    lateinit var rbTriangle : RadioButton
    lateinit var etField1 : EditText
    lateinit var etField2: EditText
    lateinit var etField3 : EditText
    lateinit var rgForms : RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var geometric = GeoForm(3.0,4.0);

        //Log.i("area",">>>>>>> Área: "+ geometric.area);

        //var tr = Triangle(3.0, 4.0, 5.0);

        //Log.i("area",">>>>>>> Hipotenusa: "+ tr.hipotenusa);

        rbRectangle = findViewById(R.id.rbRectangle);
        rbTriangle = findViewById(R.id.rbTriangle)

        etField1 = findViewById(R.id.etField1)
        etField2 = findViewById(R.id.etField2)
        etField3 = findViewById(R.id.etField3)

        rgForms = findViewById(R.id.rgForms)

        //hide()

        rgForms.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{
            radioGroup, i ->
            if(rbRectangle.isChecked){
                etField1.visibility = View.VISIBLE
                etField2.visibility = View.VISIBLE
                etField1.hint = "Base: "
                etField2.setHint("Altura: ")
            }

            if(rbTriangle.isChecked){
                etField1.visibility = View.VISIBLE
                etField2.visibility = View.VISIBLE
                etField3.visibility = View.VISIBLE
                etField1.setHint("Cateto A: ")
                etField2.setHint("Cateto B: ")
                etField3.setHint("Hipotenusa: ")
            }
        })
    }

    fun hide(){
        etField1.visibility = View.INVISIBLE
        etField2.visibility = View.INVISIBLE
        etField3.visibility = View.INVISIBLE
        etField1.setText("");
        etField2.setText("");
        etField3.setText("");

        //rgForms.clearCheck()
    }

    fun calculate(view: View){
        if(!etField1.text.isEmpty() || etField2.text.isEmpty()){


        } else {
            var area: Double = 0.0
            var valor1 = etField1.text.toString().toDouble()

            var valor2 = etField2.text.toString().toDouble()

            if(rbRectangle.isChecked){
                var rectangle = Rectangle(valor1, valor2);
                area = rectangle.CalculateArea();
            } else if(rbTriangle.isChecked){
                if (!etField3.text.isEmpty()){
                    var valor3 = etField3.text.toString().toDouble()
                    var triangle = Triangle(valor1, valor2, valor3)
                   // area = Triangle.Cal
                   area = 5.0;
                }
            }
            var tvArea = findViewById<TextView>(R.id.tvArea)
            tvArea.text = area.toString()
        }
    }
}

