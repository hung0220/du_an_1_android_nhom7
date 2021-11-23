package com.example.du_an_1_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class thongtin_sothich extends AppCompatActivity {
    Button tieptuc_sothich;
    ImageView trove_sothich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_thongtin_sothich);
        //                 tiếp tục
        tieptuc_sothich = findViewById(R.id.btnTT_sothich);
        tieptuc_sothich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtin_sothich.this, com.example.du_an_1_android.thongtin_mota.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

//        Trờ về
        trove_sothich = findViewById(R.id.back_sothich);
        trove_sothich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtin_sothich.this, com.example.du_an_1_android.thongtin_gioitinh.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }
}