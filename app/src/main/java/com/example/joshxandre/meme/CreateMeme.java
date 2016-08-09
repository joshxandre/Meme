package com.example.joshxandre.meme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import org.w3c.dom.Text;

public class CreateMeme extends AppCompatActivity {
    TextView txttop;
    TextView txtbottom;
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_meme);
        txttop = (TextView)findViewById(R.id.txttop);
        txtbottom = (TextView)findViewById(R.id.txtbottom);
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.meme);
        Intent intent = getIntent();

        String upper = intent.getStringExtra("upper");
        String bottom  = intent.getStringExtra("bottom");

        txttop.setText( upper );
        txtbottom.setText( bottom );


    }


}
