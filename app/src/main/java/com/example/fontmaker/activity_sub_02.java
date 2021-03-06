package com.example.fontmaker;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_sub_02 extends AppCompatActivity {
    ImageView imageView1, imageView2, imageView3;
    private String currentPhotoPath = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_02);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Mydata.data_count++;
                Intent intent = new Intent(getApplicationContext(), activity_sub_02_01.class);
                startActivityForResult(intent, 1);
            }
        });

        ImageButton imageButton_1 = findViewById(R.id.imageButton_1); // 도움말 표시하기
        imageButton_1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                setContentView(new SomeView(activity_sub_02.this));
            }
        });

        if(Mydata.myletter_element[0][0] != null) {
            Uri imageUri = Uri.parse(Mydata.myletter_element[0][0]);
            imageView1 = (ImageView) findViewById(R.id.imageView1);
            imageView1.setImageURI(imageUri);
        }

        if(Mydata.myletter_element[0][1] != null) {
            Uri imageUri = Uri.parse(Mydata.myletter_element[0][1]);
            imageView2 = (ImageView) findViewById(R.id.imageView2);
            imageView2.setImageURI(imageUri);
        }

        if(Mydata.myletter_element[0][2] != null) {
            Uri imageUri = Uri.parse(Mydata.myletter_element[0][2]);
            imageView3 = (ImageView) findViewById(R.id.imageView3);
            imageView3.setImageURI(imageUri);
        }



    }



}
