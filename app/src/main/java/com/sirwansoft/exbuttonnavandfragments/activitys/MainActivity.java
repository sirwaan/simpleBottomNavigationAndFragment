package com.sirwansoft.exbuttonnavandfragments.activitys;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sirwansoft.exbuttonnavandfragments.R;
import com.sirwansoft.exbuttonnavandfragments.fragments.Frag_one;
import com.sirwansoft.exbuttonnavandfragments.fragments.Frag_three;
import com.sirwansoft.exbuttonnavandfragments.fragments.Frag_two;


public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;
    private Frag_one frag_one;
    private Frag_two frag_two;
    private Frag_three frag_three;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag_one = new Frag_one();
        frag_two = new Frag_two();
        frag_three = new Frag_three();

        frameLayout = findViewById(R.id.mainfream);
        bottomNavigationView = findViewById(R.id.mainnav);

        //default fragment before click on etch bottom navigation menu item by this :  setFragment(first_fragment);
        setFragment(frag_one);




        // when we click on itch item in bottom navigation , what to do ?
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();

                switch (id) {

                    case R.id.nav_one:
                        //set background color if you need use
//                        bottomNavigationView.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(frag_one);
                        return true;

                    case R.id.nav_two:

                        setFragment(frag_two);
                        return true;
                    case R.id.nav_three:

                        setFragment(frag_three);
                        return true;

                    default:
                        return false;


                }


            }
        });


    }

    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainfream, fragment);
        fragmentTransaction.commit();
    }
}
