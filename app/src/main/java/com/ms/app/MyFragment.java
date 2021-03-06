package com.ms.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ms.view.loading.page.StatusPageHelper;

public class MyFragment extends BaseFragment {

    private TextView textViewShow;
    private TextView textViewHide;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initView() {

        textViewShow = view.findViewById(R.id.textViewShow);
        textViewHide = view.findViewById(R.id.textViewHide);
        textViewShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLoading();
            }
        });

        textViewHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideAllStatus();
            }
        });
    }


    //    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_my, container, false);
//        return view;
//    }

    public static MyFragment newInstance() {

        Bundle args = new Bundle();

        MyFragment fragment = new MyFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
