package com.example.homework1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.ListView;
import android.text.TextUtils;
import android.widget.ArrayAdapter;

public class fragment_infor extends Fragment implements View.OnClickListener{

    private FragmentManager fManager;
    private Button look;
    public fragment_infor(FragmentManager fManager) {
        this.fManager=fManager;
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_infor,container,false);

        look=view.findViewById(R.id.look_for);
        look.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.look_for:
                Intent intent=new Intent(getActivity(),LookforActivity.class);
                startActivity(intent);
                break;
        }
    }



















}
