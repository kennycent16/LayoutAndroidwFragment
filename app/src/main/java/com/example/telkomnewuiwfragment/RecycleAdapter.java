package com.example.telkomnewuiwfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.telkomnewuiwfragment.R;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder>{

    private List<com.example.telkomnewui.Item> itemList;

    class ViewHolder extends  RecyclerView.ViewHolder{
        ImageView image;
        TextView judul,judul2,content,content2,price,pricedisc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image =itemView.findViewById(R.id.image);
            judul = itemView.findViewById(R.id.judul);
            judul2=itemView.findViewById(R.id.judul2);
            content=itemView.findViewById(R.id.content);
            content2=itemView.findViewById(R.id.content2);
            price=itemView.findViewById(R.id.price);
            pricedisc=itemView.findViewById(R.id.pricedisc);
        }
    }

    public RecycleAdapter (List<com.example.telkomnewui.Item> itemList)
    {
        this.itemList = itemList;
    }
    @NonNull
    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemviewrecycle,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.ViewHolder holder, int position) {
    com.example.telkomnewui.Item item = itemList.get(position);
    holder.image.setImageResource(item.getImage());
    holder.judul.setText(item.getJudul());
    holder.judul2.setText(item.getJudul2());
    holder.content.setText(item.getContent());
    holder.content2.setText(item.getContent2());
    holder.price.setText(item.getPrice());
    holder.pricedisc.setText(item.getPricedisc());
    }

    @Override
    public int getItemCount() {

        return itemList.size();
    }
}
