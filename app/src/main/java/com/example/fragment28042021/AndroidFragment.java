package com.example.fragment28042021;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AndroidFragment extends Fragment {

    EditText mEdt;
    Button mBtn;
    TextView mTv;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_android, container, false);
        mEdt = view.findViewById(R.id.edittextAndroid);
        mBtn = view.findViewById(R.id.buttonSendText);
        mTv = view.findViewById(R.id.textViewDataActivity);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//
//        if(getArguments() != null){
//            Bundle bundle = getArguments();
//            String chuoi = bundle.getString("string");
//            mTv.setText(chuoi);
//        }

    }

    public void putArgument(Bundle bundle){
        String name = bundle.getString("name");
        mTv.setText(name);
    }
}