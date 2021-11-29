package com.example.du_an_1_android;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class thongtin_sothich extends AppCompatActivity {
    Button tieptuc_sothich;
    Button btnTheThao,btnVeDem,btnAmNhac,btnDulich,btnCafe,btnDocsach,btnCauca,btnDientu,btnPhim,btnNauan,btnXemay;
    ImageView trove_sothich;
    String sothich1,sothich2,sothich3,sothich4,sothich5,sothich6,sothich7,sothich8,sothich9,sothich10,sothich11;
    int dem = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_thongtin_sothich);
        Anhxa();
        //                 tiếp tục


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

        btnTheThao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    sothich1 = "Thể thao";
                    btnTheThao.setBackground(ContextCompat.getDrawable(thongtin_sothich.this, R.drawable.boder_onclick_btn));
                    btnTheThao.setTextColor(Color.parseColor("#F288AF"));
                    dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnVeDem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich2 = "Sống về đêm";
                btnVeDem.setBackground(ContextCompat.getDrawable(thongtin_sothich.this, R.drawable.boder_onclick_btn));
                btnVeDem.setTextColor(Color.parseColor("#F288AF"));
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnAmNhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich3 = "Âm nhạc";
                btnAmNhac.setBackground(ContextCompat.getDrawable(thongtin_sothich.this, R.drawable.boder_onclick_btn));
                btnAmNhac.setTextColor(Color.parseColor("#F288AF"));
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnDulich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich4 = "Du lịch";
                btnDulich.setBackground(ContextCompat.getDrawable(thongtin_sothich.this, R.drawable.boder_onclick_btn));
                btnDulich.setTextColor(Color.parseColor("#F288AF"));
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich5 = "Cafe";
                btnCafe.setBackground(ContextCompat.getDrawable(thongtin_sothich.this, R.drawable.boder_onclick_btn));
                btnCafe.setTextColor(Color.parseColor("#F288AF"));
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });

        tieptuc_sothich = findViewById(R.id.btnTT_sothich);
        tieptuc_sothich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dem<=3){

                }else{
                    Intent intent = new Intent(thongtin_sothich.this, com.example.du_an_1_android.thongtin_mota.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

            }
        });




    }
    public void Anhxa(){
        btnTheThao = findViewById(R.id.btnTheThao);
        btnVeDem = findViewById(R.id.btnVeDem);
        btnAmNhac = findViewById(R.id.btnAmNhac);
        btnDulich = findViewById(R.id.btnDulich);
        btnCafe = findViewById(R.id.btnCafe);
        btnDocsach = findViewById(R.id.btnDocsach);
        btnCauca = findViewById(R.id.btnCauca);
        btnDientu = findViewById(R.id.btnDientu);
        btnPhim = findViewById(R.id.btnPhim);
        btnNauan = findViewById(R.id.btnNauan);
        btnXemay = findViewById(R.id.btnXemay);
    }
}