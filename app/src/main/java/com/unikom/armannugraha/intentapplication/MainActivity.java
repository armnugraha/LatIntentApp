package com.unikom.armannugraha.intentapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    //Id unik untuk putekstra (melempar nilai ke activity lain)
    public static final String ID_EXTRA_MSG = "com.unikom.armannugraha.intentapplication";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickMoveActivity(View view) {

        EditText setTextName = (EditText)findViewById(R.id.name);

        String getTextName = setTextName.getText().toString();

        Intent intent = new Intent(this, MoveActivity.class);
        //Melempar isi nama biodata ke kelas DoneActivity
        intent.putExtra(ID_EXTRA_MSG, getTextName);
        startActivity(intent);

    }

}
