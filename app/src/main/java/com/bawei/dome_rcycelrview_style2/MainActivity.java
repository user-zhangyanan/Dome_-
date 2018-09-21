package com.bawei.dome_rcycelrview_style2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity  extends AppCompatActivity {

    private FlowLikeView likeViewLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        likeViewLayout = (FlowLikeView) findViewById(R.id.flowLikeView);
    }

    public void addLikeView(View view) {
        likeViewLayout.addLikeView();
    }
}