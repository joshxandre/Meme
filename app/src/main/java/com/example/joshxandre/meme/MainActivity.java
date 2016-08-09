package com.example.joshxandre.meme;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.drawable.RippleDrawable;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{

    private EditText edtxtTop;
    private Button btnCreate;
    private EditText edtxtBottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxtTop =(EditText)findViewById(R.id.edtxtTop);
       edtxtBottom =(EditText)findViewById(R.id.edtxtBottom);
        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
            Intent intent = new Intent(this, CreateMeme.class);
            intent.putExtra("upper", edtxtTop.getText().toString());
            intent.putExtra("bottom", edtxtBottom.getText().toString());
            startActivity(intent);
        }


}