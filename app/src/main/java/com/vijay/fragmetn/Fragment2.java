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

public class Fragment2 extends Fragment {

    View view;
    Button button;

    public Fragment2() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Fragmen2 ", "onAttach");
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Fragmen2 ", "onCreate");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        button = view.findViewById(R.id.button);//Find textview Id
        Log.e("Fragmen2 ", "onCreateView");

        Log.e("Fragment2 getBackStackEntryCount ", String.valueOf(getActivity().getSupportFragmentManager().getBackStackEntryCount()));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment3()).addToBackStack("Fragment2").commit();
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Fragmen2 ", "onActivityCreated");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Fragmen2 ", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Fragmen2 ", "onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Fragmen2 ", "onStop");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Fragmen2 ", "onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Fragmen2 ", "onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Fragmen2 ", "onDetach");
    }
}