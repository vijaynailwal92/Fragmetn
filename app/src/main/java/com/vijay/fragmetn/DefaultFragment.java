package com.vijay.fragmetn;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class DefaultFragment extends Fragment {
    Button button;
    View view;
    TextView fragmentText;

    public DefaultFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("DefaultFragment ", "onAttach");
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("DefaultFragment ", "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmentlayout, container, false);
        button = view.findViewById(R.id.button);//Find textview Id
        fragmentText = view.findViewById(R.id.fragmentText);//Find textview Id
        fragmentText.setText(" DefaultFragment ");


        Log.e("DefaultFragment ", "onCreateView");


        Log.e("DefaultFragment getBackStackEntryCount ", String.valueOf(getActivity().getSupportFragmentManager().getBackStackEntryCount()));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment1())
                        .addToBackStack("DefaultFragment").commit();

            }
        });
        return view;


    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("DefaultFragment ", "onActivityCreated");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("DefaultFragment ", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("DefaultFragment ", "onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("DefaultFragment ", "onStop");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("DefaultFragment ", "onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("DefaultFragment ", "onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("DefaultFragment ", "onDetach");
    }
}