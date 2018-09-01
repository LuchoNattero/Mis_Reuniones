package com.example.asus.misreuniones.Fragmento;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.misreuniones.R;


public class Fragmento_grupos extends Fragment {

    View miInflater;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        miInflater = inflater.inflate(R.layout.layout_fragment_grupo, container, false);



        return miInflater;
    }
}
