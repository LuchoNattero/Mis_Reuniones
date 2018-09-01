package com.example.asus.misreuniones;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdaptadorGrupos extends BaseAdapter {

    Context context;
    List<Grupo> lista_grupo;

    public AdaptadorGrupos(Context context, List<Grupo> lista) {

        this.context = context;
        this.lista_grupo = lista;

    }
    class ViewHolder {

        TextView titulo;


        private ViewHolder(View view){

           titulo = view.findViewById(R.id.gr_tv_nombre);

        }

    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.layout_grupo, viewGroup, false);
        }

        ViewHolder holder = (ViewHolder) view.getTag();

        if (holder == null) {
            holder = new ViewHolder(view);
            view.setTag(holder);
        }


        Grupo item = (Grupo) getItem(i);

        holder.titulo.setText(item.getNombre());




        return view;
    }
}
