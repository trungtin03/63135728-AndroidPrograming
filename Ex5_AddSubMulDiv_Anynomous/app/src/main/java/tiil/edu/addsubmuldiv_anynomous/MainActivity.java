package tiil.edu.addsubmuldiv_anynomous;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Edittextso1;
    EditText Edittextso2;
    EditText EdittextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    void TimDieuKhien(){
        Edittextso1 = (EditText) findViewById(R.id.edtSo1);
        Edittextso2 = (EditText) findViewById(R.id.edtSo2);
        EdittextKQ = (EditText) findViewById(R.id.edtKQ);
        nutCong = (Button)  findViewById(R.id.btnCong);
        nutTru = (Button)  findViewById(R.id.btnTru);
        nutNhan = (Button)  findViewById(R.id.btnNhan);
        nutChia = (Button)  findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        //gan bo lang nghe su kien va code xu ly cho tung nut
        View.OnClickListener BoLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //XuLyCong();
                String str1 = Edittextso1.getText().toString();
                String str2 = Edittextso2.getText().toString();
                //chuyen sang so
                float soA = Float.parseFloat(str1);
                float soB = Float.parseFloat(str2);
                // tinh tong
                float Tong = soA + soB;
                // xuat ket qua

                String KetQua = String.valueOf(Tong);
                EdittextKQ.setText(KetQua);

            }
        };
        nutCong.setOnClickListener(BoLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //XuLyTru();
                // lay du lieu
                String str1 = Edittextso1.getText().toString();
                String str2 = Edittextso2.getText().toString();
                //chuyen sang so
                float soA = Float.parseFloat(str1);
                float soB = Float.parseFloat(str2);
                // tinh tong
                float Tong = soA - soB;
                // xuat ket qua

                String KetQua = String.valueOf(Tong);
                EdittextKQ.setText(KetQua);
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //XuLyNhan();
                // lay du lieu
                String str1 = Edittextso1.getText().toString();
                String str2 = Edittextso2.getText().toString();
                //chuyen sang so
                float soA = Float.parseFloat(str1);
                float soB = Float.parseFloat(str2);
                // tinh tong
                float Tong = soA * soB;
                // xuat ket qua

                String KetQua = String.valueOf(Tong);
                EdittextKQ.setText(KetQua);
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //XuLyChia();
                // lay du lieu
                String str1 = Edittextso1.getText().toString();
                String str2 = Edittextso2.getText().toString();
                //chuyen sang so
                float soA = Float.parseFloat(str1);
                float soB = Float.parseFloat(str2);
                // tinh tong
                float Tong = soA / soB;
                // xuat ket qua

                String KetQua = String.valueOf(Tong);
                EdittextKQ.setText(KetQua);
            }
        });
    }
    //xu ly cong
    public void XuLyCong(View v){

        // lay du lieu
        String str1 = Edittextso1.getText().toString();
        String str2 = Edittextso2.getText().toString();
        //chuyen sang so
        float soA = Float.parseFloat(str1);
        float soB = Float.parseFloat(str2);
        // tinh tong
        float Tong = soA + soB;
        // xuat ket qua

        String KetQua = String.valueOf(Tong);
        EdittextKQ.setText(KetQua);

    }
    public void XuLyTru(View v){

        // lay du lieu
        String str1 = Edittextso1.getText().toString();
        String str2 = Edittextso2.getText().toString();
        //chuyen sang so
        float soA = Float.parseFloat(str1);
        float soB = Float.parseFloat(str2);
        // tinh tong
        float Tong = soA - soB;
        // xuat ket qua

        String KetQua = String.valueOf(Tong);
        EdittextKQ.setText(KetQua);

    }
    public void XuLyNhan(View v){

        // lay du lieu
        String str1 = Edittextso1.getText().toString();
        String str2 = Edittextso2.getText().toString();
        //chuyen sang so
        float soA = Float.parseFloat(str1);
        float soB = Float.parseFloat(str2);
        // tinh tong
        float Tong = soA * soB;
        // xuat ket qua

        String KetQua = String.valueOf(Tong);
        EdittextKQ.setText(KetQua);

    }
    public void XuLyChia(View v){

        // lay du lieu
        String str1 = Edittextso1.getText().toString();
        String str2 = Edittextso2.getText().toString();
        //chuyen sang so
        float soA = Float.parseFloat(str1);
        float soB = Float.parseFloat(str2);
        // tinh tong
        float Tong = soA / soB;
        // xuat ket qua

        String KetQua = String.valueOf(Tong);
        EdittextKQ.setText(KetQua);

    }
}