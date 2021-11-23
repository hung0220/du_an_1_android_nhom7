package com.example.du_an_1_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class thongtin_gioitinh extends AppCompatActivity {
    Button tieptuc_gioitinh;
    ImageView trove_gioitinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_thongtin_gioitinh);
//                 tiếp tục
        tieptuc_gioitinh = findViewById(R.id.btnTT_gioitinh);
        tieptuc_gioitinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtin_gioitinh.this, thongtin_sothich.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

//        Trờ về
        trove_gioitinh = findViewById(R.id.back_gioitinh);
        trove_gioitinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtin_gioitinh.this, com.example.du_an_1_android.thongtin_ngaysinh.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }
}