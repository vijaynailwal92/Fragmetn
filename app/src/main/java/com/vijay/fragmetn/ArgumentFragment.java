package com.vijay.fragmetn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ArgumentFragment extends Fragment {



    public ArgumentFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentlayout, container, false);//Inflate Layout
        TextView text =  view.findViewById(R.id.fragmentText);//Find textview Id


        //Get Argument that passed from activity in "data" key value
        String getArgument = getArguments().getString("data");
        text.setText(getArgument);//set string over textview





        return view;//return view
    }
}