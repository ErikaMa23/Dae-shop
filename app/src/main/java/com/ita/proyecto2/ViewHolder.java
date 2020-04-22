package com.ita.proyecto2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {

    View view;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        view = itemView;
    }

    public void SetDetails(Context ctx, String Titulo, String Descripcion, String Imagen){

        TextView mTitulo = view.findViewById(R.id.Titulotv);
        TextView mDescripcion = view.findViewById(R.id.Descripciontv);
        ImageView mImagen = view.findViewById(R.id.Imagenview);

        mTitulo.setText(Titulo);
        mDescripcion.setText(Descripcion);
        Picasso.get().load(Imagen).into(mImagen);
    }
}
