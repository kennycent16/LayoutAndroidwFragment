package com.example.telkomnewuiwfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.telkomnewuiwfragment.R;

import java.util.List;

public class RecycleAdapter2 extends RecyclerView.Adapter<RecycleAdapter2.ViewHolder>{

    private List<com.example.telkomnewui.Item2> itemList2;

    class ViewHolder extends  RecyclerView.ViewHolder{
        ImageView image1;
        TextView judul1,judul2,content1,content2,price1,pricedisc1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image1 =itemView.findViewById(R.id.image1);
            judul1 = itemView.findViewById(R.id.judul1);
            judul2=itemView.findViewById(R.id.judul2);
            content1=itemView.findViewById(R.id.content1);
            content2=itemView.findViewById(R.id.content2);
            price1=itemView.findViewById(R.id.price1);
            pricedisc1=itemView.findViewById(R.id.pricedisc1);
        }
    }

    public RecycleAdapter2 (List<com.example.telkomnewui.Item2> itemList)
    {
        this.itemList2 = itemList;
    }
    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemviewrecycle2,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter2.ViewHolder holder, int position) {
        com.example.telkomnewui.Item2 item = itemList2.get(position);
        holder.image1.setImageResource(item.getImage1());
        holder.judul1.setText(item.getJudul1());
        holder.judul2.setText(item.getJudul2());
        holder.content1.setText(item.getContent1());
        holder.content2.setText(item.getContent2());
        holder.price1.setText(item.getPrice1());
        holder.pricedisc1.setText(item.getPricedisc1());
    }

    @Override
    public int getItemCount() {
        return itemList2.size();
    }


}
