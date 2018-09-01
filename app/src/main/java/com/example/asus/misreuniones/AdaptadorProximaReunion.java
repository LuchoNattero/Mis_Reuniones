package com.example.asus.misreuniones;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class AdaptadorProximaReunion extends BaseAdapter {

    Context context;
    List<Reuniones> lista_reuniones;

    public AdaptadorProximaReunion(Context c, List<Reuniones> lista){

        context = c;
        lista_reuniones = lista;
    }

    public AdaptadorProximaReunion(Context c){
        context = c;
    }


    class ViewHolder {

        TextView titulo;
        TextView hora;
        TextView lugar;
        TextView motivo;

        private ViewHolder(View view){

            titulo = view.findViewById(R.id.pr_tv_titulo);
            hora = view.findViewById(R.id.pr_tv_hora);
            lugar = view.findViewById(R.id.pr_tv_lugar);
            motivo = view.findViewById(R.id.pr_tv_motivo);

        }

    }


        @Override
    public int getCount() {
        return lista_reuniones.size();
    }

    @Override
    public Object getItem(int i) {
        return lista_reuniones.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {



        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.layout_proxima_reunion, viewGroup, false);
        }


        ViewHolder holder = (ViewHolder) view.getTag();

        if (holder == null) {
            holder = new ViewHolder(view);
            view.setTag(holder);
        }


        Reuniones item = (Reuniones) getItem(i);

        holder.titulo.setText(item.getTitulo());
        holder.hora.setText(item.getHora());
        holder.lugar.setText(item.getLugar());
        holder.motivo.setText(item.getMotivo());




        return view;
    }
}
