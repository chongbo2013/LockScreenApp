package com.askhmer.mobileapp.activity;

import android.os.Bundle;

import com.askhmer.mobileapp.R;
import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class ChangePwd extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pwd);

        //swipe back
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);
    }
}
