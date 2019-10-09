package com.sirwansoft.exbuttonnavandfragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sirwansoft.exbuttonnavandfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_two extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag_two, container, false);
        //add your code here => to findViewById use view.findViewByID

        return view;


    }

}
