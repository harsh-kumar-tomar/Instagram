package com.example.javaappversion21.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javaappversion21.Models.PostsModel;
import com.example.javaappversion21.R;

import java.util.ArrayList;

public class Posts_Adapter extends RecyclerView.Adapter<Posts_Adapter.ViewHolder> {

    Context context;
    ArrayList<PostsModel> dataList;

    public Posts_Adapter(Context context, ArrayList<PostsModel> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_post_view , parent , false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.postImage.setImageResource(dataList.get(position).getPostImage());
        holder.accountName.setText(dataList.get(position).getAccountName());
        holder.location.setText(dataList.get(position).getLocation());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView accountName;
        TextView location;
        ImageView postImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            accountName = itemView.findViewById(R.id.accountName);
            location = itemView.findViewById(R.id.location);
            postImage = itemView.findViewById(R.id.postImage);

        }
    }
}
