package com.example.du_an_1_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class thongtin_email extends AppCompatActivity {
    Button tieptuc_email;
    ImageView troVe1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_thongtin_email);

//        Tiếp tục
        tieptuc_email = findViewById(R.id.btnTT_email);
        tieptuc_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtin_email.this, thongtin_sdt.class);
                Toast.makeText(thongtin_email.this, "chuyển thành công", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

////        Trở về
//        troVe1 = findViewById(R.id.back_email);
//        troVe1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Intent intent = new Intent(thongTin_1_email.this, thongTin_1_email.class);
////                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
////                startActivity(intent);
//            }
//        });
    }
}