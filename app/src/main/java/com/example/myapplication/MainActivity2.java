package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    // RadioButton capucino, raf, latte, cacao;
    TextView select;
    CheckBox sugar, korica, milk;

    RadioGroup radio;

    RadioButton capucino, raf, cacao;

    private  int priceSum = 0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        select = findViewById(R.id.select);
        sugar = findViewById(R.id.sugar);
        korica = findViewById(R.id.korica);
        milk = findViewById(R.id.milk);
        capucino = findViewById(R.id.capucino);
        raf = findViewById(R.id.raf);
        cacao = findViewById(R.id.cacao);

        capucino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (capucino.isChecked() ){
                    priceSum += 250;
                    select.setText(priceSum + " Рублей");

                }
                else  {
                    priceSum -= 250;
                    select.setText(priceSum + " Рублей");
                }
            }
        });

        raf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(raf.isChecked() == true){
                    priceSum += 175;
                    select.setText(priceSum + " Рублей");

                }
                else {
                    select.setText(priceSum + "Рублей");
                }

            }
        });

        cacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cacao.isChecked()){
                    priceSum += 225;
                    select.setText(priceSum + " Рублей");
                }
                else{
                    select.setText(priceSum + "Рублей");
                }
            }
        });


        sugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sugar.isChecked()){
                    priceSum += 55;
                    select.setText( priceSum + " Рублей");
                    sugar.setText("Убрать сахар ( - 55 рублей) ");



                }
                else {
                    priceSum -= 55;
                    select.setText (priceSum + " Рублей");
                    sugar.setText("Добавить сахар ( + 55 рублей)");
                }

            }
        });

        korica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (korica.isChecked()){
                    priceSum += 45;
                    select.setText(priceSum + "Рублей");
                    korica.setText(" Убрать корицу ( - 45 Рублей)");

                }

                else{
                    priceSum -= 45;
                    select.setText(priceSum + " Рублей");
                    korica.setText(" Добавить корицу ( + 45 Рублей)");
                }
            }
        });

        milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (milk.isChecked()){
                    priceSum += 99;
                    select.setText(priceSum + " Рублей");
                    milk.setText(" Убрать соевое молоко ( - 99 рублей)");

                }
                else {
                    priceSum -= 99;
                    select.setText(priceSum + " Рублей");
                    milk.setText(" Добавить соевое молоко ( + 99 Рублей) ");
                }
            }
        });




    }

    public void back (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}

