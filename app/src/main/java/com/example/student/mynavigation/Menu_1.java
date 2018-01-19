package com.example.student.mynavigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by student on 2018-01-11.
 */

public class Menu_1 extends Fragment {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup view  = (ViewGroup)layoutInflater.inflate(R.layout.menu_1,container,false);
        String userid = getArguments().getString("userid");
        TextView tv = (TextView) view.findViewById(R.id.firstmainText);
        tv.setText(userid);
        return view;
    }
}
