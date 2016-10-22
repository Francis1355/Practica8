package com.example.francisco.practica8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView inPul, inYar,inMts, inMilla;
    private EditText etPies,etMts;
    private Button btnConvertir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inPul = (TextView)findViewById(R.id.tvpul);
        inYar = (TextView)findViewById(R.id.tvyar);
        inMts = (TextView)findViewById(R.id.tvmts);
        inMilla = (TextView)findViewById(R.id.tvmilla);
        etPies = (EditText)findViewById(R.id.edtPies);
        etMts = (EditText)findViewById(R.id.edtMetros);
        btnConvertir = (Button)findViewById(R.id.btn1);


        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pies = etPies.getText().toString();
                String metros = etMts.getText().toString();

                Double pi = Double.parseDouble(pies);
                Double mt = Double.parseDouble(metros);
                Double suma = pi + (mt*3.2808);
                Double pul = (suma*12);
                Double yar = (suma*0.333);
                Double mto = (suma*0.3048);
                Double mil = (suma*0.0002);
                String resP = "";
                String resY = "";
                String resMto = "";
                String resMil = "";
                String rp = String.format("%2.2f",pul);
                String ry = String.format("%2.2f",yar);
                String rm = String.format("%2.2f",mto);
                String rmil = String.format("%2.2f",mil);
                resP = "La suma en pulgadas es = " + rp + "";
                resY = "La suma en yardas es = " + ry + "";
                resMto = "La suma en metros es = " + rm + "";
                resMil = "La suma en millas es = " + rmil + "";

                inPul.setText(resP);
                inYar.setText(resY);
                inMts.setText(resMto);
                inMilla.setText(resMil);



            }
        });
    }
}
