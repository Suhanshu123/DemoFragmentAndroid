package com.example.suhanshu.fragmentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by suhanshu on 01-Jun-18.
 */

public class FragmentOne extends Fragment {

    View view;
    public static FragmentOne newInstance(String s) {

        Bundle args = new Bundle();
        args.putString("hello",s);
        FragmentOne fragment = new FragmentOne();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_one,container,false);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView textView= (TextView) view.findViewById(R.id.text_onw);
        textView.setText(getArguments().getString("hello"));

    }
}
