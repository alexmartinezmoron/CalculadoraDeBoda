package com.example.calculadoradeboda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private EditText edad, altura;
    private TextView tv1;
    private RadioButton rv, ro, ri, rp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edad=findViewById(R.id.edad);
        altura=findViewById(R.id.altura);
        tv1=findViewById(R.id.tv1);
        rv=findViewById(R.id.rv);
        rp=findViewById(R.id.rp);
        ro=findViewById(R.id.ro);
        ri=findViewById(R.id.ri);

    }

    public void  presion(View v){
        Toast.makeText(this,"Pensando, porque el que piensa es Sabio y nadie nacio sabiendo :)",Toast.LENGTH_LONG).show();
        String v1=edad.getText().toString();
        String v2=altura.getText().toString();

        // Convertimos a un int

        int r1 = Integer.parseInt(v1);
        float r2 = Float.parseFloat(v2);

        int totalCabras = r1*3;
        float totalPollos = r2*9;

        int totalPollossinDecimal = Float.valueOf(totalPollos).intValue();

        String fraseEstacion = "";

        if (rv.isChecked()){
            fraseEstacion = "Al ser en verano tendras que comprar un par de camellos tambien";
        } else if (ri.isChecked()) {
            fraseEstacion = "Al ser en invierno tendras que comprar un par de alces tambien";
        } else if (ro.isChecked()) {
            fraseEstacion = "Al ser en otoño tendras que comprar ... quien cojones se casa en otoño tu eres tonto, pues te toca comprar un dragon";
        } else if (rp.isChecked()) {
            fraseEstacion = "Al ser en primavera tendras que comprar un par de vacas";
        }else {
            fraseEstacion = "Si te da igual la estacion esque tiene billetes, Pagame por la app perro!!!";
        }

        tv1.setText("Tendras que pagar: " + totalCabras + " cabras y " + totalPollossinDecimal + " pollos para poder pedirle la mano a tus suegros . \n" + fraseEstacion );
    }

}