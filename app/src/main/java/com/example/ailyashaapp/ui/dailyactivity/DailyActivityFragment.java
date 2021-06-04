package com.example.ailyashaapp.ui.dailyactivity;

//29 May 2021
//10118070
//Aufa Ilyasha
//IF-2

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ailyashaapp.R;
import com.example.ailyashaapp.ui.gallery.RecyclerViewAdapter;

public class DailyActivityFragment extends Fragment {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter recyclerViewAdapter;

    int []arr={R.drawable.act1,R.drawable.act2,R.drawable.act3,R.drawable.act4,R.drawable.act5};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daily_activity, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recylcerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter=new RecyclerViewAdapter(arr);

        recyclerView.setAdapter(recyclerViewAdapter);

        recyclerView.setHasFixedSize(true);

        return view;
    }
}