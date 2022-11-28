package com.example.ageconv;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_calculate=findViewById(R.id.btn_calculate);
        TextView textView=findViewById(R.id.tv_result);
        EditText editText=findViewById(R.id.by);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int birthY=Integer.parseInt(editText.getText().toString());
                int r=year-birthY;

                textView.setText(String.valueOf(r+" years"));
            }
        });



    }
}
