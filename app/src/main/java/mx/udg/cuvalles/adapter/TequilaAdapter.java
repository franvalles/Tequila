package mx.udg.cuvalles.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import mx.udg.cuvalles.tequila.R;
import mx.udg.cuvalles.tequila.detalle;

/**
 * Created by francisco raul on 10/11/2017.
 */

public class TequilaAdapter extends RecyclerView.Adapter<TequilaAdapter.ViewHolder> {
    //Array list sera donde se guardara basicamente los datos
    ArrayList<Tequila> tequilas;// como vez no tenemos la clase tequila la creams
    Context context;
    public TequilaAdapter(ArrayList<Tequila> tequilas, Context context) {
        this.tequilas = tequilas;
        this.context = context;
    }


    @Override
    public TequilaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vistaTequila = LayoutInflater.from(context).inflate(R.layout.layout_tequila,parent,false);
        ViewHolder TequilaViewHolder = new ViewHolder(vistaTequila);
        vistaTequila.setTag(TequilaViewHolder);

        return TequilaViewHolder;
    }

    @Override
    public void onBindViewHolder(TequilaAdapter.ViewHolder holder, final int position) {
        holder.Nombre.setText(tequilas.get(position).getNombre());
        Picasso.with(context).load(tequilas.get(position).getFoto()).into(holder.fondo);
        holder.btnDetalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(context, detalle.class);
                i.putExtra("Tequila",tequilas.get(position));
                context.startActivity(i);
            }
        });

    }



    @Override
    public int getItemCount() {
        return tequilas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView fondo;
        ImageView imageView2;
        TextView Nombre;
        Button btnDetalles;
        public ViewHolder(View itemView) {
            super(itemView);
            fondo = (ImageView) itemView.findViewById(R.id.fondo);
            Nombre = (TextView) itemView.findViewById(R.id.Nombre);
            btnDetalles =(Button) itemView.findViewById(R.id.btnDetalle);
            imageView2 = (ImageView) itemView.findViewById(R.id.imageView2);
        }
    }
}
