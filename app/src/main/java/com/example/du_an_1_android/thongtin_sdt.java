package com.example.du_an_1_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class thongtin_sdt extends AppCompatActivity {
    Button tieptuc_sdt;
    ImageView trove_sdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_thongtin_sdt);
        //         tiếp tục
        tieptuc_sdt = findViewById(R.id.btnTT_sdt);
        tieptuc_sdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtin_sdt.this, com.example.du_an_1_android.thongtin_Name.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

//        Trờ về
        trove_sdt = findViewById(R.id.back_sdt);
        trove_sdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtin_sdt.this, com.example.du_an_1_android.thongtin_email.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });
    }
}