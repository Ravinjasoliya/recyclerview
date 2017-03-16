package com.example.recyclerravin;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by RAVIN on 03-03-2017.
 */

public class apdt extends RecyclerView.Adapter<apdt.myholderview>{
   // ArrayList<HashMap<String,String>> arrayList;
    ArrayList arrayList1;


    public apdt(ArrayList arrayList)//ArrayList<HashMap<String,String>> arrayList)
    {
        this.arrayList1=arrayList;

    }

    @Override
    public myholderview onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.mylayout,parent,false);
        return new myholderview(view);
    }

    @Override
    public void onBindViewHolder(myholderview holder, int position) {
        holder.textView.setText(arrayList1.get(position).toString());

    }


    @Override
    public int getItemCount() {
        return arrayList1.size();
    }

    class myholderview extends  RecyclerView.ViewHolder implements View.OnClickListener
    {

        TextView  textView;
        public myholderview(View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.txt1);


        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();

            Log.e("pos",+position+" p");
        }
    }
}
