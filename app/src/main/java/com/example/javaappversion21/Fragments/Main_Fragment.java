package com.example.javaappversion21.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.javaappversion21.Adapters.Main_Stories_Adapter;
import com.example.javaappversion21.Adapters.Posts_Adapter;
import com.example.javaappversion21.Adapters.Stories_Adapter;
import com.example.javaappversion21.Models.PostsModel;
import com.example.javaappversion21.Models.StoriesModel;
import com.example.javaappversion21.R;

import java.util.ArrayList;


public class Main_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_main_, container, false);
        RecyclerView recyclerViewPost = view.findViewById(R.id.recyclerViewPost);
        ArrayList<PostsModel> dataList = new ArrayList<>();

        dataList.add(new PostsModel("Aries Spring" , "India" , R.drawable.konosuba));
        dataList.add(new PostsModel("Kanata" , "Germany" , R.drawable.darlinginthefranxx));
        dataList.add(new PostsModel("Yulgar" , "Australia" , R.drawable.demonslayer));
        dataList.add(new PostsModel("Sachin" , "South Korea" , R.drawable.deathnote));
        dataList.add(new PostsModel("Shinna" , "Pakistan" , R.drawable.journeyofelaina));
        dataList.add(new PostsModel("Ben Tennison" , "China" , R.drawable.classroomofelite));
        dataList.add(new PostsModel("Gwen" , "U.S.A" , R.drawable.classroomofelite1));
        dataList.add(new PostsModel("Max" , "U.K" , R.drawable.konosuba));
        dataList.add(new PostsModel("Dr. Oak" , "India" , R.drawable.classroomofelite));
        dataList.add(new PostsModel("Garry" , "South Africa" , R.drawable.darlinginthefranxx));


        Posts_Adapter adapter = new Posts_Adapter(getContext() , dataList);

        recyclerViewPost.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewPost.setAdapter(adapter);



        ArrayList<StoriesModel> List = new ArrayList<>();

        RecyclerView recyclerViewProfile = view.findViewById(R.id.recyclerViewMainStories);
        List = new ArrayList<>();
        List.add(new StoriesModel(R.drawable.small_icon , "India"));
        List.add(new StoriesModel(R.drawable.small_icon1 , "UK"));
        List.add(new StoriesModel(R.drawable.small_icon2 , "Japan"));
        List.add(new StoriesModel(R.drawable.small_icon3 , "America"));
        List.add(new StoriesModel(R.drawable.small_icon4 , "China"));
        List.add(new StoriesModel(R.drawable.small_icon5 , "Sri Lanka"));

        Main_Stories_Adapter stories_adapter = new Main_Stories_Adapter(getContext() , List);

        recyclerViewProfile.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL  , false));
        recyclerViewProfile.setAdapter(stories_adapter);





        return view;
    }
}