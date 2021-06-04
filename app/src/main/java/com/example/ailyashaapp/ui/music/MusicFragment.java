package com.example.ailyashaapp.ui.music;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

//29 May 2021
//10118070
//Aufa Ilyasha
//IF-2

import com.example.ailyashaapp.R;
import com.example.ailyashaapp.ui.gallery.RecyclerViewAdapter;

public class MusicFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_music, container, false);


        return view;
    }


}