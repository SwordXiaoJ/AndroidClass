package com.example.homework1;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;



import java.util.ArrayList;


public class fragment_main extends Fragment implements AdapterView.OnItemClickListener{
    private String content;
    private ArrayList<Course>  courseList = new ArrayList<>();
    private FragmentManager fManager;
    private ListView list_view1;

    public fragment_main(FragmentManager fManager) {
        this.fManager=fManager;
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_main,container,false);

        initCourse();

        CourseAdapter adapter = new CourseAdapter(getActivity(),R.layout.course_item,courseList);

        ListView list_view1 = (ListView) view.findViewById(R.id.list_view);

        list_view1.setAdapter(adapter);
        list_view1.setOnItemClickListener(this);

        return view;

    }
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        FragmentTransaction fTransaction = fManager.beginTransaction();
        fragment_infor ncFragment = new fragment_infor (fManager);
        Bundle bd = new Bundle();
        bd.putString("content",courseList.get(position).getCoursename());
        ncFragment.setArguments(bd);
        //获取Activity的控件
        TextView txt_title = (TextView) getActivity().findViewById(R.id.txt_title);
        txt_title.setText(courseList.get(position).getCoursename());
        //加上Fragment替换动画
        fTransaction.setCustomAnimations(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit);
        fTransaction.replace(R.id.ly_content, ncFragment);
        //调用addToBackStack将Fragment添加到栈中
        fTransaction.addToBackStack(null);
        fTransaction.commit();
    }

    private void initCourse()
    {
        Course CH = new Course("Chinese");
        courseList.add(CH);
        Course MA = new Course("Math");
        courseList.add(MA);
        Course EG = new Course("English");
        courseList.add(EG);
        Course DA = new Course("Data structure");
        courseList.add(DA);
        Course C = new Course("C language");
        courseList.add(C);
    }
}
