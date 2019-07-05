package com.vijay.fragmetn;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment9 extends Fragment {

    View view;
    Button button;

    public Fragment9() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment9, container, false);
        button = view.findViewById(R.id.button);

        Log.e("Fragment9 getBackStackEntryCount ", String.valueOf(getActivity().getSupportFragmentManager().getBackStackEntryCount()));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getActivity().getSupportFragmentManager().getBackStackEntryAt(0).getName().equals("DefaultFragment")) {
                    getActivity().getSupportFragmentManager().popBackStack("DefaultFragment", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                } else {
                    Log.e("Fragment9  ", "else part executed");
                }
            }
        });


        //back button pressed
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    if (keyCode == KeyEvent.KEYCODE_BACK) {

                        Log.e("Fragment9", "back button pressed");
                        return true;
                    }
                }
                return false;
            }
        });
        return view;
    }


    //hide toolbar in fragment
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
    }



}



