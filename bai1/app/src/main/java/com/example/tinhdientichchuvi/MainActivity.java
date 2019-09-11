package com.example.tinhdientichchuvi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText chieudai,chieurong;
    TextView chuvi,dientich,hinh;
    Button bt_ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chieudai=(EditText)findViewById(R.id.editText_chieudai);
        chieurong=(EditText)findViewById(R.id.editText_chieurong);
        chuvi=(TextView)findViewById(R.id.textView_chuvi);
        dientich=(TextView)findViewById(R.id.textView_dientich);
        hinh=findViewById(R.id.textView_hinh);
        bt_ketqua=(Button)findViewById(R.id.button_Ketqua);

        bt_ketqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float d=Float.parseFloat( chieudai.getText().toString());
                float r=Float.parseFloat( chieurong.getText().toString());
                HinhChuNhat hcn=new HinhChuNhat(d,r);
                if (d==r){
                    hinh.setText("--Hình Vuông--");
                    chuvi.setText("Chu Vi:"+hcn.tinhDTV(d));
                    dientich.setText("Diện Tích:"+hcn.chuviV(d));


                }else if(d<r){
                    hinh.setText("--Hình ???--");
                    chuvi.setText("Nhập sai chiều dài chiều rộng");
                    dientich.setText("Nhập sai chiều dài chiều rộng");
                }else{
                    hinh.setText("--Hình Chữ Nhật--");
                    chuvi.setText("Chu vi:"+hcn.tinhChuVi(d,r));
                    dientich.setText("Diện Tích:"+hcn.tinhDienTich(d,r));}


            }
        });
    }
}
