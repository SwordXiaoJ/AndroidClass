package com.example.homework1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.homework1.Course;

import java.util.List;
public class CourseAdapter extends ArrayAdapter<Course> {
    private int resoureId;

    public CourseAdapter(Context context,int textViewResoureceId,List<Course> objects)
    {
        super(context,textViewResoureceId,objects);
        resoureId=textViewResoureceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Course course = getItem(position);
        View view= LayoutInflater.from((getContext())).inflate(resoureId,parent,false);
        TextView courseName=(TextView) view.findViewById(R.id.course_name);
        courseName.setText(course.getCoursename());
        return view;
    }
}
