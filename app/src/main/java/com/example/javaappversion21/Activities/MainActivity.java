package com.example.javaappversion21.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.javaappversion21.Fragments.Main_Fragment;
import com.example.javaappversion21.Fragments.Profile_Fragment;
import com.example.javaappversion21.Fragments.Search_Fragment;
import com.example.javaappversion21.R;
import com.example.javaappversion21.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;
    int homeInt , searchInt = 0 , loveInt = 0 ;
    ArrayList<ImageView> navigation = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, new Profile_Fragment()).commit();

        navigation.add(binding.homeButton);
        navigation.add(binding.searchButton);
        navigation.add(binding.addStoriesButton);
        navigation.add(binding.loveButton);
        navigation.add(binding.profileButton);




    }

    public void navigationBottom(View view) {
        ImageView imageView = (ImageView) view;

        if (imageView == binding.homeButton) {
            binding.homeButton.setImageResource(R.drawable.home_instagram_tap);
            binding.searchButton.setImageResource(R.drawable.search_instagram);
            binding.loveButton.setImageResource(R.drawable.love_instagram);
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Main_Fragment()).commit();

        } else if (imageView == binding.searchButton) {

            binding.homeButton.setImageResource(R.drawable.home_instagram);
            binding.searchButton.setImageResource(R.drawable.search_instagram_tap);
            binding.loveButton.setImageResource(R.drawable.love_instagram);
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Search_Fragment()).commit();

        } else if (imageView == binding.addStoriesButton) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Profile_Fragment()).commit();
        } else if (imageView == binding.loveButton) {

            binding.homeButton.setImageResource(R.drawable.home_instagram);
            binding.searchButton.setImageResource(R.drawable.search_instagram);
            binding.loveButton.setImageResource(R.drawable.love_instagram_tap);
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Profile_Fragment()).commit();

        } else if (imageView == binding.profileButton) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Profile_Fragment()).commit();
        }
    }




}