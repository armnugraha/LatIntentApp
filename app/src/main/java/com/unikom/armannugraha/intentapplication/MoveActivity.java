package com.unikom.armannugraha.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MoveActivity extends AppCompatActivity {

    TextView tvDataName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        //start set text dinamis
        tvDataName = findViewById(R.id.getText);

        String name = getIntent().getStringExtra(MainActivity.ID_EXTRA_MSG);
        String text = "Beres! Sekarang " + name + " udah bisa ngecek penggunaan HP mu tiap hari buat bantu " + name + " ngatur waktu :)";
        tvDataName.setText(text);
        //end set text dinamis

    }
}
