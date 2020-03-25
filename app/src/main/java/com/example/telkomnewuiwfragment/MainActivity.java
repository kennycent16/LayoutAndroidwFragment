package com.example.telkomnewuiwfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.btm_nav);

        bottomNavigationView.setOnNavigationItemReselectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemReselectedListener navListener = new BottomNavigationView.OnNavigationItemReselectedListener() {
        @Override
        public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;

            switch (menuItem.getItemId())
            {
                case R.id.nav_home:
                    selectedFragment= new com.example.telkomnewuiwfragment.HomeFragment();
                    break;
                case R.id.nav_hadiah:
                    selectedFragment= new com.example.telkomnewuiwfragment.HadiahFragment();
                    break;
                case R.id.nav_belanja:
                    selectedFragment= new com.example.telkomnewuiwfragment.BelanjaFragment();
                    break;
                case R.id.nav_jelajah:
                    selectedFragment= new com.example.telkomnewuiwfragment.JelajahFragment();
                    break;
                case R.id.nav_account:
                    selectedFragment= new com.example.telkomnewuiwfragment.AccountFragment();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,selectedFragment).commit();
            return;
        }

    };
}
