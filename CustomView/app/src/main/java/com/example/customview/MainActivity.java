package com.example.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mListView = null;
    BaseAdapterEx mAdapter = null;
    ArrayList<Student> mData =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mData = new ArrayList<Student>();

        for (int i=0; i<100;i++){
            Student std = new Student();
            std.mName = "슈퍼성근"+i;
            std.mNum = "95000"+i;
            std.mDept = "컴퓨터공학" + i;

            mData.add(std);
        }

        mAdapter = new BaseAdapterEx(this, mData);
        mListView = (ListView) findViewById(R.id.lt_listview);
        mListView.setAdapter(mAdapter);
    }

    public void mOnClick(View v){
        switch(v.getId()){
            case R.id.b_add:
                EditText nameEt = (EditText) findViewById(R.id.et_name);
                EditText numberEt = (EditText) findViewById(R.id.et_number);
                EditText deptEt = (EditText) findViewById(R.id.et_dept);

                // 생성자
                Student addData = new Student(nameEt.getText().toString(),
                                            numberEt.getText().toString(),
                                            deptEt.getText().toString());

                mAdapter.add(0,addData);

                nameEt.setText("");
                numberEt.setText("");
                deptEt.setText("");
                break;

            case R.id.b_del:
                EditText item = (EditText) findViewById(R.id.et_del_item_index);
                int idx = Integer.parseInt(item.getText().toString());
                mAdapter.delete(idx);
                item.setText("");
                break;
            case R.id.b_all_del:
                mAdapter.clear();
        }
    }
}
