package com.example.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class fragment_my extends Fragment implements View.OnClickListener{
    private FragmentManager fManager;
    private Button login;
    public fragment_my(FragmentManager fManager) {
        this.fManager=fManager;
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my,container,false);

        login=view.findViewById(R.id.button_login);
        login.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button_login:
                Intent intent=new Intent(getActivity(),LoginActivity.class);
                startActivity(intent);
                break;
        }
    }
}
