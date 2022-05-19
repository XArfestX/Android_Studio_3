package ru.mirea.burmakin.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = (TextView) findViewById(R.id.textView2);
        String text = (String) getIntent().getSerializableExtra("key");
        textView2.setText(text);
    }
    public void onClickButton(View view){
        Intent intent = new Intent(this, DataActivity.class);
        startActivity(intent);
    }
}