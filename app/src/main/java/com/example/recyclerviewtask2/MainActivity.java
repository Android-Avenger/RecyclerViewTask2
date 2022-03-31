package com.example.recyclerviewtask2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import com.example.recyclerviewtask2.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        List<Model> modelsData = new ArrayList<>();


        modelsData.add(new Model("3847","XYZ","03122323455","67"));
        modelsData.add(new Model("3847","XYZ","03122323455","67"));
        modelsData.add(new Model("3847","XYZ","03122323455","67"));
        modelsData.add(new Model("3847","XYZ","03122323455","67"));
        modelsData.add(new Model("3847","XYZ","03122323455","67"));
        modelsData.add(new Model("3847","XYZ","03122323455","67"));
        modelsData.add(new Model("3847","XYZ","03122323455","67"));
        modelsData.add(new Model("3847","XYZ","03122323455","67"));
        modelsData.add(new Model("3847","XYZ","03122323455","67"));
        modelsData.add(new Model("3847","XYZ","03122323455","67"));

      ListAdapter listAdapter = new ListAdapter();
      mBinding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
      mBinding.recyclerview.setAdapter(listAdapter);
      listAdapter.setData(modelsData);






    }

}