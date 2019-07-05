package com.vijay.fragmetn;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment8 extends Fragment {


    View view;
    Button button;

    public Fragment8() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment8, container, false);
        button = view.findViewById(R.id.button);

        Log.e("Fragment8 getBackStackEntryCount ", String.valueOf(getActivity().getSupportFragmentManager().getBackStackEntryCount()));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment9()).addToBackStack("Fragment8").commit();
            }
        });
        return view;
    }
}
