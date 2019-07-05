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

public class Fragment1 extends Fragment {

    View view;
    Button button;

    public Fragment1() {
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Fragment1 ", "onAttach");
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Fragment1 ", "onCreate");
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        button = view.findViewById(R.id.button);
        Log.e("Fragment1 ", "onCreateView");
        Log.e("Fragment1 getBackStackEntryCount ", String.valueOf(getActivity().getSupportFragmentManager().getBackStackEntryCount()));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_in_right,
                        R.anim.slide_out_left, R.anim.slide_in_left,
                        R.anim.slide_out_right).replace(R.id.fragment_container,
                        new Fragment2()).addToBackStack("Fragment1").commit();

            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Fragment1 ", "onActivityCreated");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Fragment1 ", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Fragment1 ", "onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Fragment1 ", "onStop");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Fragment1 ", "onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Fragment1 ", "onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Fragment1 ", "onDetach");
    }
}