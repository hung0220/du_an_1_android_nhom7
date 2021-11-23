package com.example.du_an_1_android;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class thongtin_addArt extends AppCompatActivity {
    ImageView troVe_mota;
    private static final int REQUEST_IMAGE_OPEN = 1;
    private static final int REQUEST_IMAGE_OPEN_2 = 2;
    private static final int REQUEST_IMAGE_OPEN_3 = 3;
    private static final int REQUEST_IMAGE_OPEN_4 = 4;
    private static final int REQUEST_IMAGE_OPEN_5 = 5;
    private static final int REQUEST_IMAGE_OPEN_6 = 6;
    private static final int REQUEST_IMAGE_OPEN_7 = 7;
    private static final int REQUEST_IMAGE_OPEN_8 = 8;
    private static final int REQUEST_IMAGE_OPEN_9 = 9;
    ImageView addCase1;
    ImageView addCase2;
    ImageView addCase3;
    ImageView addCase4;
    ImageView addCase5;
    ImageView addCase6;
    ImageView addCase7;
    ImageView addCase8;
    ImageView addCase9;
    ImageView case1;
    ImageView case2;
    ImageView case3;
    ImageView case4;
    ImageView case5;
    ImageView case6;
    ImageView case7;
    ImageView case8;
    ImageView case9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_thongtin_add_art);
        //setOnclick để mở file ảnh
        addCase1 = findViewById(R.id.addcase1);
        addCase1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent, REQUEST_IMAGE_OPEN);
            }
        });
        addCase2 = findViewById(R.id.addcase2);
        addCase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent, REQUEST_IMAGE_OPEN_2);
            }
        });
        addCase3 = findViewById(R.id.addcase3);
        addCase3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent, REQUEST_IMAGE_OPEN_3);
            }
        });
        addCase4 = findViewById(R.id.addcase4);
        addCase4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent, REQUEST_IMAGE_OPEN_4);
            }
        });
        addCase5 = findViewById(R.id.addcase5);
        addCase5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent, REQUEST_IMAGE_OPEN_5);
            }
        });
        addCase6 = findViewById(R.id.addcase6);
        addCase6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent, REQUEST_IMAGE_OPEN_6);
            }
        });
        addCase7 = findViewById(R.id.addcase7);
        addCase7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent, REQUEST_IMAGE_OPEN_7);
            }
        });
        addCase8 = findViewById(R.id.addcase8);
        addCase8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent, REQUEST_IMAGE_OPEN_8);
            }
        });
        addCase9 = findViewById(R.id.addcase9);
        addCase9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent, REQUEST_IMAGE_OPEN_9);
            }
        });
        //setOnclick để mở file ảnh
        //        Trờ về
        troVe_mota = findViewById(R.id.back_Art);
        troVe_mota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtin_addArt.this, com.example.du_an_1_android.thongtin_mota.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        //        Trờ về
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_OPEN && resultCode == RESULT_OK) {
            case1 = (ImageView) findViewById(R.id.case1);
            Uri full1 = data.getData();
            case1.setImageURI(full1);

        }
        if (requestCode == REQUEST_IMAGE_OPEN_2 && resultCode == RESULT_OK) {
            case2 = (ImageView) findViewById(R.id.case2);
            Uri full2 = data.getData();
            case2.setImageURI(full2);

        }
        if (requestCode == REQUEST_IMAGE_OPEN_3 && resultCode == RESULT_OK) {
            case3 = (ImageView) findViewById(R.id.case3);
            Uri full3 = data.getData();
            case3.setImageURI(full3);

        }
        if (requestCode == REQUEST_IMAGE_OPEN_4 && resultCode == RESULT_OK) {
            case4 = (ImageView) findViewById(R.id.case4);
            Uri full4 = data.getData();
            case4.setImageURI(full4);

        }
        if (requestCode == REQUEST_IMAGE_OPEN_5 && resultCode == RESULT_OK) {
            case5 = (ImageView) findViewById(R.id.case5);
            Uri full5 = data.getData();
            case5.setImageURI(full5);

        }
        if (requestCode == REQUEST_IMAGE_OPEN_6 && resultCode == RESULT_OK) {
            case6 = (ImageView) findViewById(R.id.case6);
            Uri full6 = data.getData();
            case6.setImageURI(full6);

        }
        if (requestCode == REQUEST_IMAGE_OPEN_7 && resultCode == RESULT_OK) {
            case7 = (ImageView) findViewById(R.id.case7);
            Uri full7 = data.getData();
            case7.setImageURI(full7);

        }
        if (requestCode == REQUEST_IMAGE_OPEN_8 && resultCode == RESULT_OK) {
            case8 = (ImageView) findViewById(R.id.case8);
            Uri full8 = data.getData();
            case8.setImageURI(full8);

        }
        if (requestCode == REQUEST_IMAGE_OPEN_9 && resultCode == RESULT_OK) {
            case9 = (ImageView) findViewById(R.id.case9);
            Uri full9 = data.getData();
            case9.setImageURI(full9);

        }


        super.onActivityResult(requestCode, resultCode, data);
    }

}