package com.dreamers.shiweitian.News_page;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dreamers.shiweitian.QandA_page.QandA_detail;
import com.dreamers.shiweitian.QandA_page.QandA_page;
import com.dreamers.shiweitian.R;

/**
 * Created by stzha on 2017/1/8.
 */

public class RecommendFragment extends Fragment {

    private RelativeLayout layout1,layout2,layout3,layout4,layout5,layout6,layout7,layout8,layout9;


    public RecommendFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //动态加载if
//        View rootView = inflater.inflate(R.layout.recommend,container,false);
//        TextView tv=(TextView)rootView.findViewById(R.id.aa);
//        tv.setText("lalala");
//        return rootView;

        View rootView = inflater.inflate(R.layout.recommend_load,container,false);
        layout1=(RelativeLayout)rootView.findViewById(R.id.layout1);
        layout2=(RelativeLayout)rootView.findViewById(R.id.layout2);
        layout3=(RelativeLayout)rootView.findViewById(R.id.layout3);
        layout4=(RelativeLayout)rootView.findViewById(R.id.layout4);
        layout5=(RelativeLayout)rootView.findViewById(R.id.layout5);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent();
                it.setClass(getActivity(), News_detail.class);
//                it.putExtra("str1",listItems.get(position).get("title1").toString() );//给intent添加额外数据，key为“str”,key值为"Intent Demo"
//                it.putExtra("str2",listItems.get(position).get("title2").toString() );
                startActivity(it);
            }
        });

        return rootView;


    }


}