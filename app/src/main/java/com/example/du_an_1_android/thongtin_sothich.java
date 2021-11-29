package com.example.du_an_1_android;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class thongtin_sothich extends AppCompatActivity {
    Button tieptuc_sothich;
    Button btnTheThao,btnVeDem,btnAmNhac,btnDulich,btnCafe,btnDocsach,btnCauca,btnDientu,btnAmThuc,btnNauan,btnXemay;
    Button btnTheThao2,btnVeDem2,btnAmNhac2,btnDulich2,btnCafe2,btnDocsach2,btnCauca2,btnDientu2,btnAmThuc2,btnNauan2,btnXemay2;
    ImageView trove_sothich;
    String sothich1,sothich2,sothich3,sothich4,sothich5,sothich6,sothich7,sothich8,sothich9,sothich10,sothich11;
    TextView txtErroSoThich;
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
                btnTheThao.setVisibility(View.INVISIBLE);
                btnTheThao2.setVisibility(View.VISIBLE);
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnTheThao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich1 = "";
                btnTheThao2.setVisibility(View.INVISIBLE);
                btnTheThao.setVisibility(View.VISIBLE);
                dem--;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnVeDem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich2 = "Sống về đêm";
                btnVeDem.setVisibility(View.INVISIBLE);
                btnVeDem2.setVisibility(View.VISIBLE);
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnVeDem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich2 = "";
                btnVeDem2.setVisibility(View.INVISIBLE);
                btnVeDem.setVisibility(View.VISIBLE);
                dem--;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnAmNhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich3 = "Âm nhạc";
                btnAmNhac.setVisibility(View.INVISIBLE);
                btnAmNhac2.setVisibility(View.VISIBLE);
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnAmNhac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich3 = "";
                btnAmNhac2.setVisibility(View.INVISIBLE);
                btnAmNhac.setVisibility(View.VISIBLE);
                dem--;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnDulich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich4 = "Du lịch";
                btnDulich.setVisibility(View.INVISIBLE);
                btnDulich2.setVisibility(View.VISIBLE);
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnDulich2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich4 = "";
                btnDulich2.setVisibility(View.INVISIBLE);
                btnDulich.setVisibility(View.VISIBLE);
                dem--;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich5 = "Cafe";
                btnCafe.setVisibility(View.INVISIBLE);
                btnCafe2.setVisibility(View.VISIBLE);
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnCafe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich5 = "";
                btnCafe2.setVisibility(View.INVISIBLE);
                btnCafe.setVisibility(View.VISIBLE);
                dem--;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnDocsach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich6 = "Đọc sách";
                btnDocsach.setVisibility(View.INVISIBLE);
                btnDocsach2.setVisibility(View.VISIBLE);
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnDocsach2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich6 = "";
                btnDocsach2.setVisibility(View.INVISIBLE);
                btnDocsach.setVisibility(View.VISIBLE);
                dem--;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnCauca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich7 = "Câu cá";
                btnCauca.setVisibility(View.INVISIBLE);
                btnCauca2.setVisibility(View.VISIBLE);
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnCauca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich7 = "";
                btnCauca2.setVisibility(View.INVISIBLE);
                btnCauca.setVisibility(View.VISIBLE);
                dem--;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnDientu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich8 = "Thể thao điện tử";
                btnDientu.setVisibility(View.INVISIBLE);
                btnDientu2.setVisibility(View.VISIBLE);
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnDientu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich8 = "";
                btnDientu2.setVisibility(View.INVISIBLE);
                btnDientu.setVisibility(View.VISIBLE);
                dem--;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnAmThuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich9 = "Ẩm thực";
                btnAmThuc.setVisibility(View.INVISIBLE);
                btnAmThuc2.setVisibility(View.VISIBLE);
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnAmThuc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich9 = "";
                btnAmThuc2.setVisibility(View.INVISIBLE);
                btnAmThuc.setVisibility(View.VISIBLE);
                dem--;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnNauan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich10 = "Nấu ăn";
                btnNauan.setVisibility(View.INVISIBLE);
                btnNauan2.setVisibility(View.VISIBLE);
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnNauan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich10 = "";
                btnNauan2.setVisibility(View.INVISIBLE);
                btnNauan.setVisibility(View.VISIBLE);
                dem--;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnXemay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich11 = "Xe máy";
                btnXemay.setVisibility(View.INVISIBLE);
                btnXemay2.setVisibility(View.VISIBLE);
                dem++;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });
        btnXemay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sothich11 = "";
                btnXemay2.setVisibility(View.INVISIBLE);
                btnXemay.setVisibility(View.VISIBLE);
                dem--;
                tieptuc_sothich.setText("Tiếp tục "+dem+"/3");
            }
        });


        tieptuc_sothich = findViewById(R.id.btnTT_sothich);
        tieptuc_sothich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dem>3){
                    txtErroSoThich.setVisibility(View.VISIBLE);
                }else{
                    txtErroSoThich.setVisibility(View.INVISIBLE);
                    Intent intent = new Intent(thongtin_sothich.this, com.example.du_an_1_android.thongtin_mota.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
//                    Toast.makeText(thongtin_sothich.this, ""+sothich3, Toast.LENGTH_SHORT).show();
//                    Toast.makeText(thongtin_sothich.this, ""+sothich5, Toast.LENGTH_SHORT).show();
//                    Toast.makeText(thongtin_sothich.this, ""+sothich7, Toast.LENGTH_SHORT).show();
//                    Toast.makeText(thongtin_sothich.this, ""+sothich1, Toast.LENGTH_SHORT).show();
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
        btnAmThuc = findViewById(R.id.btnAmtThuc);
        btnNauan = findViewById(R.id.btnNauan);
        btnXemay = findViewById(R.id.btnXemay);

        btnTheThao2 = findViewById(R.id.btnTheThao2);
        btnVeDem2 = findViewById(R.id.btnVeDem2);
        btnAmNhac2 = findViewById(R.id.btnAmNhac2);
        btnDulich2 = findViewById(R.id.btnDulich2);
        btnCafe2 = findViewById(R.id.btnCafe2);
        btnDocsach2 = findViewById(R.id.btnDocsach2);
        btnCauca2 = findViewById(R.id.btnCauca2);
        btnDientu2 = findViewById(R.id.btnDientu2);
        btnAmThuc2 = findViewById(R.id.btnAmtThuc2);
        btnNauan2 = findViewById(R.id.btnNauan2);
        btnXemay2 = findViewById(R.id.btnXemay2);

        txtErroSoThich = findViewById(R.id.txtErroSoThich);
    }
}