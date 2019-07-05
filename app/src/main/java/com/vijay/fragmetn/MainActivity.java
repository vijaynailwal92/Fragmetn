package com.vijay.fragmetn;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static Button defaultFragment, argumentFragment;
    private static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.e("MainActivity", "onCreate");

        fragmentManager = getSupportFragmentManager();//Get Fragment Manager

        defaultFragment = findViewById(R.id.setDefaultFragment);
        argumentFragment = findViewById(R.id.setArgumentFragment);
        defaultFragment.setOnClickListener(this);
        argumentFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.setDefaultFragment:

                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new DefaultFragment()).commit();
                break;
            case R.id.setArgumentFragment:
                Fragment fragment = new ArgumentFragment();
                Bundle bundle = new Bundle();
                bundle.putString("data", "This is Argument Fragment");
                fragment.setArguments(bundle);
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit();//now replace the argument fragment

                /**  Note: If you are passing argument in fragment then don't use below code always replace fragment
                 * instance where we had set bundle as argument as we had done above else it will give exception  **/
                //   fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new ArgumentFragment()).commit();
                break;
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity", "onDestroy");
    }
    //    animation
//    back button
//    fragment flush
//    add and back fragment navigate
}