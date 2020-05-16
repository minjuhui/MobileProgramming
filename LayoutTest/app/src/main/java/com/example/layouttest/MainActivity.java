package com.example.layouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private View p1, p2, p3;
    FrameLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab);
        root=findViewById(R.id.frame);

        p1 =  View.inflate(this,R.layout.page1,null);
        p2 = View.inflate(this,R.layout.page2,null);
        p3 =  View.inflate(this,R.layout.page3,null);

        root.addView(p1);
        root.addView(p2);
        root.addView(p3);

        p2.setVisibility(View.INVISIBLE);
        p3.setVisibility(View.INVISIBLE);






    }

    public void onClicked(View v){
        switch (v.getId()){
            case R.id.btnPage1:
                p1.setVisibility(View.VISIBLE);
                p2.setVisibility(View.INVISIBLE);
                p3.setVisibility(View.INVISIBLE);
                break;
            case R.id.btnPage2:
                p2.setVisibility(View.VISIBLE);
                p1.setVisibility(View.INVISIBLE);
                p3.setVisibility(View.INVISIBLE);
                break;
            case R.id.btnPage3:
                p3.setVisibility(View.VISIBLE);
                p1.setVisibility(View.INVISIBLE);
                p2.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
