package com.example.asus.misreuniones;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.asus.misreuniones.Fragmento.Fragmento_Inicio;
import com.example.asus.misreuniones.Fragmento.Fragmento_Mi_Cuenta;
import com.example.asus.misreuniones.Fragmento.Fragmento_grupos;

public class Inicio extends AppCompatActivity  {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_grupos:
                    Fragmento_grupos in = new Fragmento_grupos();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fm_principal,in).commit();

                    return true;
                case R.id.navigation_home:
                    Fragmento_Inicio fm = new Fragmento_Inicio();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fm_principal,fm).commit();
                    return true;
                case R.id.navigation_perfil:
                    Fragmento_Mi_Cuenta mc = new Fragmento_Mi_Cuenta();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fm_principal,mc).commit();

                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_inicio);


        BottomNavigationView navigation =  findViewById(R.id.navegationBottom);

//        Toolbar myToolbar =  findViewById(R.id.tb_main_activity);
//        setSupportActionBar(myToolbar);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_home);
        Fragmento_Inicio fm = new Fragmento_Inicio();
        getSupportFragmentManager().beginTransaction().replace(R.id.fm_principal,fm).commit();
    }
}
