package com.example.t_eventbus;/*
 *  @项目名：  xDemo 
 *  @包名：    com.example.t_eventbus
 *  @文件名:   SecondActivity
 *  @创建者:   zcj
 *  @创建时间:  2016/10/20 9:38
 *  @描述：    TODO
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity
        extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttton = (Button) findViewById(R.id.btn);

    }
}
