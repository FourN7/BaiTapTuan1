package com.example.inbangcuuchuong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText soN;
    TextView bang;
    Button ketqua ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soN=(EditText)findViewById(R.id.editText_nhapn);
        bang=(TextView)findViewById(R.id.textView_Ketqua);
        ketqua=(Button)findViewById(R.id.button_ketqua);
        ketqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi="";
                int n=Integer.parseInt(soN.getText().toString());
                for(int i=1;i<10;i++){
                    chuoi+=n+"x"+i+"=";
                    chuoi+=String.valueOf(n*i)+"\n";
                }
                bang.setText("Bảng cửu chương:"+"\n"+chuoi);
            }
        });
}
}
