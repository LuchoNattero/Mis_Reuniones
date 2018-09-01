package com.example.asus.misreuniones.Fragmento;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.misreuniones.R;

public class Fragmento_Mi_Cuenta extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View miInflater = inflater.inflate(R.layout.layout_fragment_mi_cuenta, container, false);

        return miInflater;
    }
}
