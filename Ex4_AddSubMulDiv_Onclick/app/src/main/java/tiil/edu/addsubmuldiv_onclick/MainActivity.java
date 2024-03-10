package tiil.edu.addsubmuldiv_onclick;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Edittextso1;
    EditText Edittextso2;
    EditText EdittextKQ;
    void TimDieuKhien(){
        Edittextso1 = (EditText) findViewById(R.id.edtSo1);
        Edittextso2 = (EditText) findViewById(R.id.edtSo2);
        EdittextKQ = (EditText) findViewById(R.id.edtKQ);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
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