package com.example.lab06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Bai07 extends AppCompatActivity implements fragment_a.OnCalculationListener {
    ViewPager viewPager;
    private fragment_b fragmentB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai07);
        viewPager = findViewById(R.id.viewPager);
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
    @Override
    public void onCalculationResult(String history) {
        if (fragmentB == null) {
            fragmentB = (fragment_b) getSupportFragmentManager().findFragmentByTag("android:switcher:" + R.id.viewPager + ":" + 1);
        }
        if (fragmentB != null) {
            fragmentB.updateHistory(history);
        }
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new fragment_a();
                case 1:
                    return new fragment_b();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 2; // Số lượng Fragment
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Fragment A";
                case 1:
                    return "Fragment B";
                default:
                    return null;
            }
        }
    }
}
