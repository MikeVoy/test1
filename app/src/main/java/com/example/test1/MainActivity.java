package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 *
 * @author： faith
 * @Time： 2021/5/10 16:27
 * @EditVersion：2.0.1
 * @description： 项目描述
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        initView();
        //初始化数据
        initData();

    }

    private void initData() {
        //初始化数据请求

    }

    private void initView() {
    }
}