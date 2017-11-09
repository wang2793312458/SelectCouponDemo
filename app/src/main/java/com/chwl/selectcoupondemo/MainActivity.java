package com.chwl.selectcoupondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRv;
    private CouponAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRv = (RecyclerView) findViewById(R.id.rv);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        adapter=new CouponAdapter(this, mRv);
        mRv.setAdapter(adapter);
        adapter.setData(initDatas());

    }


    public List<TestBean> initDatas() {

        List<TestBean> datas = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            datas.add(new TestBean("满100减99"));

            datas.add(new TestBean("满100减98"));

            datas.add(new TestBean("满100减97"));

            datas.add(new TestBean("满100减96"));

            datas.add(new TestBean("满100减95"));

        }

        return datas;

    }
}
