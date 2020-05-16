package com.example.widgettest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgettest);

    }

    // create menu
    // res file xml -> set
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//       super.onCreateOptionsMenu(menu);

        MenuInflater inflater = this.getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);

        return true;
    }

    // menu item event
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int color = Color.WHITE;
        switch(item.getItemId()){
            case R.id.menu_red:
                color = Color.RED; break;
            case R.id.menu_green:
                color = Color.GREEN; break;
            case R.id.menu_blue:
                color = Color.BLUE; break;
        }

        View v = findViewById(R.id.editText);
        View v2 = findViewById(R.id.editText2);
        v.setBackgroundColor(color);
        v2.setBackgroundColor(color);


        return super.onOptionsItemSelected(item);
    }

    public void onBtnClicked(View v){
        EditText ed1 = findViewById(R.id.editText);
        EditText ed2 = findViewById(R.id.editText2);

        String str1 = ed1.getText().toString();
        String str2 = ed2.getText().toString();

        ed1.setText("");
        ed2.setText("");
        Toast.makeText(this,str1+":"+str2, Toast.LENGTH_LONG).show();
    }
}
