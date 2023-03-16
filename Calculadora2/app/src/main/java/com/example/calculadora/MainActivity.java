package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText et1, et2;
    TextView tv1;
    TextView tv2;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.txtNumero1);
        et2 = (EditText)findViewById(R.id.txtNumero2);
        tv1 = (TextView)findViewById(R.id.lblresultado);
        tv2 = (TextView)findViewById(R.id.lblresultado2);


        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        float n1, n2, resultado, multiplicacion;
        n1 = Float.parseFloat(et1.getText().toString());
        n2 = Float.parseFloat(et2.getText().toString());
        resultado = n1 + n2;
        multiplicacion = n1 * n2;
        tv1.setText("El resultado de la suma es: "+resultado);

        Toast.makeText(getApplicationContext(), "La suma es  "+resultado, Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "La multiplicacion es:  "+multiplicacion, Toast.LENGTH_LONG).show();

    }
}

