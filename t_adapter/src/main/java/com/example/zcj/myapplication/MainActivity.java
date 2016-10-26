package com.example.zcj.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity
        extends AppCompatActivity
{

    private ListView          mListView;
    private ArrayList<String> mList1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();

    }

    private void initData() {

        SharedPreferences        preferences = getPreferences("testjiajia");
        SharedPreferences.Editor editor      = preferences.edit();
        editor.putString("11111", "2222");
        editor.apply();

        mList1 = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            mList1.add("haah" + i);
        }
        ListAdapter adapter = new TestAdapter(mList1);
        mListView.setAdapter(adapter);
    }

    private SharedPreferences getPreferences(String testjiajia) {
        return getSharedPreferences(testjiajia, Context.MODE_PRIVATE);
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.list_view);
    }

    private class TestAdapter
            extends BaseAdapter
    {
        private final ArrayList<String> mDatas;

        public TestAdapter(ArrayList<String> list1) {
            this.mDatas = list1;
        }

        @Override
        public int getCount() {
            return mDatas.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = View.inflate(MainActivity.this,
                                           android.R.layout.simple_list_item_2,
                                           null);
                TextView tv = (TextView) convertView.findViewById(android.R.id.text1);
                tv.setText(mDatas.get(position));
            }
            return convertView;
        }
    }
}
