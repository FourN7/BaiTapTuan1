package com.example.giaiphuongtrinhbac1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView ketqua;
EditText nhapa, nhapb;
Button tinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ketqua=(TextView) findViewById(R.id.textView_kq);
        nhapa=findViewById(R.id.editText_nhapa);
        nhapb=findViewById(R.id.editText_nhapb);
        tinh=findViewById(R.id.button_kq);
        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(nhapa.getText().toString());
                int b=Integer.parseInt(nhapb.getText().toString());
                if(b%a==0){
                    ketqua.setText("Kết quả là : X="+(-b/a));
                }else {
                    ketqua.setText("Kết quả là :X="+(-b)+"/"+a);
                }

            }
        });
    }
}
