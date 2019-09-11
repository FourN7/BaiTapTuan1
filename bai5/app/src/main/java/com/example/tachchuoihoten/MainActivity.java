package com.example.tachchuoihoten;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText hoten;
    TextView ten,ho,tendem;
   Button tach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hoten=(EditText)findViewById(R.id.editText_nhaphoten);
        tach=(Button)findViewById(R.id.button_tach);
        ten=(TextView)findViewById(R.id.textView_ten);
        ho=(TextView)findViewById(R.id.textView_ho);
        tendem=(TextView)findViewById(R.id.textView_tendem);
        tach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nhaphoten=hoten.getText().toString();
                nhaphoten=nhaphoten.trim();
                String hod=nhaphoten.substring(0,nhaphoten.indexOf(" "));
                ho.setText("Họ:"+hod);
                ten.setText("Tên:"+nhaphoten.substring(nhaphoten.lastIndexOf(" ")+1,nhaphoten.length()));

            }

        });
    }
}
