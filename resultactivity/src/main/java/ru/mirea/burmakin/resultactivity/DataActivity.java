package ru.mirea.burmakin.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    private EditText editTextTextPersonName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
    }
    public void onClickButton2(View view){
        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        Intent intent = new Intent(DataActivity.this, MainActivity.class);
        intent.putExtra("key", editTextTextPersonName.getText().toString());
        startActivity(intent);
    }
}