package com.example.homework1;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Bundle;

public class fragment_bases extends Fragment {
    private String content;
    public fragment_bases(String content) {
        this.content = content;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_basis,container,false);
        TextView txt_content = (TextView) view.findViewById(R.id.fragment_content);
        txt_content.setText(content);
        return view;
    }
}
