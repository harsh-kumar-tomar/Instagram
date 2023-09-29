package com.example.javaappversion21.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javaappversion21.Models.StoriesModel;
import com.example.javaappversion21.R;

import java.util.ArrayList;

public class Main_Stories_Adapter extends RecyclerView.Adapter<Main_Stories_Adapter.MyViewHolder> {


    Context context ;
    ArrayList<StoriesModel> dataList;

    public Main_Stories_Adapter(Context context, ArrayList<StoriesModel> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_main_story_view , parent , false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.storiesImageView.setImageResource(dataList.get(position).getImg());
        holder.storiesTV.setText(dataList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView storiesImageView;
        TextView storiesTV;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            storiesImageView = itemView.findViewById(R.id.Stories);
            storiesTV = itemView.findViewById(R.id.storiesTV);
        }
    }
}
