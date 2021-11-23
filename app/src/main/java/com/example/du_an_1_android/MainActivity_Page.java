package com.example.du_an_1_android;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity_Page extends AppCompatActivity {
    private BottomNavigationView mBottomNav;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_page);

        mBottomNav = findViewById(R.id.bottomNavigationView);
        mViewPager = findViewById(R.id.view_pager_page);

        setUpViewPager();

        mBottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.Home_fragment:
                        mViewPager.setCurrentItem(0);
                        break;
                    case  R.id.Ib_fragment:
                        mViewPager.setCurrentItem(1);
                        break;
                    case  R.id.Iam_fragment:
                        mViewPager.setCurrentItem(2);
                        break;
                }
                return true;
            }
        });

    }
    private void setUpViewPager(){
        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        mViewPager.setAdapter(pageAdapter);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        mBottomNav.getMenu().findItem(R.id.Home_fragment).setChecked(true);
                        break;
                    case 1:
                        mBottomNav.getMenu().findItem(R.id.Ib_fragment).setChecked(true);
                        break;
                    case 2:
                        mBottomNav.getMenu().findItem(R.id.Iam_fragment).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}