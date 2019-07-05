package com.vijay.fragmetn;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment3 extends Fragment {


    View view;
    Button button;

    public Fragment3() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Fragmen3 ", "onAttach");
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Fragmen3 ", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment3, container, false);
        Log.e("Fragmen3 ", "onCreateView");
        Log.e("Fragment3 getBackStackEntryCount ", String.valueOf(getActivity().getSupportFragmentManager().getBackStackEntryCount()));

        button = view.findViewById(R.id.button);//Find textview Id
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment4()).addToBackStack("Fragment3").commit();
                /*if (getActivity().getSupportFragmentManager().getBackStackEntryAt(0).getName().equals("DefaultFragment")) {
                    getActivity().getSupportFragmentManager().popBackStack("DefaultFragment", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                } else {
                    Log.e("Fragment3  ", "else part executed");
                }
*/

            }
        });
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Fragmen3 ", "onActivityCreated");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Fragmen3 ", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Fragmen3 ", "onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Fragmen3 ", "onStop");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Fragmen3 ", "onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Fragmen3 ", "onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Fragmen3 ", "onDetach");
    }
}