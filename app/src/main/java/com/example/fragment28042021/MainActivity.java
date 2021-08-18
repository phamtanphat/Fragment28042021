package com.example.fragment28042021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    FragmentManager mFragmentManager;
    Button mBtnAddFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","Activity : onCreate");

        mFragmentManager = getSupportFragmentManager();
        mBtnAddFragment = findViewById(R.id.buttonAddFragmentAndroid);

//        mBtnAddFragment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        // th1 : khi fragment chưa từng tồn tại trong activity
        mBtnAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                AndroidFragment androidFragment = new AndroidFragment();
                Bundle bundle = new Bundle();
                bundle.putString("string","Hello fragment android");
                androidFragment.setArguments(bundle);
                fragmentTransaction.add(R.id.linearlayoutContainer,androidFragment);
                fragmentTransaction.commit();
            }
        });

    }


}