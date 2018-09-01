package com.example.asus.misreuniones.Fragmento;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.asus.misreuniones.AdaptadorProximaReunion;
import com.example.asus.misreuniones.R;
import com.example.asus.misreuniones.Reuniones;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Fragmento_Inicio extends Fragment {

    View miInflater;
    List<Reuniones> lista_reunion;
    AdaptadorProximaReunion adaptador;
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        miInflater = inflater.inflate(R.layout.layout_fragment_inicio, container, false);
        listView = miInflater.findViewById(R.id.frg_list_inicio);


       lista_reunion = new LinkedList<>(Arrays.asList(Reuniones.ITEMS));
       adaptador = new AdaptadorProximaReunion(getContext(),lista_reunion);

        listView.setAdapter(adaptador);
        registerForContextMenu(listView);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listView.setClickable(true);
//      Toast.makeText(getContext(), Reuniones.getItem(1).getTitulo(),Toast.LENGTH_SHORT).show();

        return miInflater;
    }
}
