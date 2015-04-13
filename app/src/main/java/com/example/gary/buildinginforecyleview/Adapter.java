package com.example.gary.buildinginforecyleview;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Gary on 08/04/2015.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private  LayoutInflater inflator;
    List<Structure> data = Collections.emptyList();

    public Adapter(Context context, List<Structure> data){

        inflator = LayoutInflater.from(context);
        this.data = data;

    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

           View view = inflator.inflate(R.layout.rowdesign, parent,false);
           MyViewHolder holder = new MyViewHolder(view);


        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Structure current = data.get(position);
        holder.title.setText(current.buildingName);
        holder.image.setImageResource(current.image);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id.buildingTitle);
            image = (ImageView)itemView.findViewById(R.id.buildingImage);
        }
    }
}
