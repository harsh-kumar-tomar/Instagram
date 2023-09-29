package com.example.javaappversion21.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.javaappversion21.Adapters.Stories_Adapter;
import com.example.javaappversion21.Models.StoriesModel;
import com.example.javaappversion21.R;

import java.util.ArrayList;

public class Profile_Fragment extends Fragment {

    ArrayList<StoriesModel> dataList ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_, container, false);
        RecyclerView recyclerViewProfile = view.findViewById(R.id.recyclerViewProfile);
        dataList = new ArrayList<>();
        dataList.add(new StoriesModel(R.drawable.small_icon , "India"));
        dataList.add(new StoriesModel(R.drawable.small_icon1 , "UK"));
        dataList.add(new StoriesModel(R.drawable.small_icon2 , "Japan"));
        dataList.add(new StoriesModel(R.drawable.small_icon3 , "America"));
        dataList.add(new StoriesModel(R.drawable.small_icon4 , "China"));
        dataList.add(new StoriesModel(R.drawable.small_icon5 , "Sri Lanka"));
        dataList.add(new StoriesModel(R.drawable.small_icon , "India"));
        dataList.add(new StoriesModel(R.drawable.small_icon1 , "UK"));
        dataList.add(new StoriesModel(R.drawable.small_icon2 , "Japan"));
        dataList.add(new StoriesModel(R.drawable.small_icon3 , "America"));
        dataList.add(new StoriesModel(R.drawable.small_icon4 , "China"));
        dataList.add(new StoriesModel(R.drawable.small_icon5 , "Sri Lanka"));

        Stories_Adapter stories_adapter = new Stories_Adapter(getContext() , dataList);
        recyclerViewProfile.setNestedScrollingEnabled(false);
        recyclerViewProfile.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL , false));
        recyclerViewProfile.setAdapter(stories_adapter);
//        recyclerViewProfile.setHasFixedSize(true);









        return view;
    }
}