package ntu.mssv63135728.cau2_appbmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etChieuCao;
    EditText etCanNang;
    RadioButton rbNam, rbNu;
    Button btnTinhBMI;
    TextView txtChiso, txtNhanXet;
    double chiso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        etChieuCao = findViewById(R.id.et_chieucao);
        etCanNang = findViewById(R.id.et_cannang);
        rbNam = findViewById(R.id. btn_nam);
        rbNu = findViewById(R.id.btn_nư);
        btnTinhBMI = findViewById(R.id.btn_TinhBMI);
        txtChiso = findViewById(R. id.txt_ketqua);
        txtNhanXet = findViewById(R.id.txt_nhanxet);
        txtChiso = findViewById(R.id.txt_ketqua);
        txtNhanXet = findViewById(R.id. txt_nhanxet);
        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double  chieucao = Double.parseDouble(etChieuCao.getText().toString())/100;
                double  cannang = Double.parseDouble(etCanNang.getText().toString());
                chiso = Math.round((cannang/Math.pow(chieucao,2))*10.0)/10.0;
                if (rbNam.isChecked()){
                    if(chiso < 18.5){
                        txtChiso.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if(chiso < 18.5 && chiso <=24.9){
                        txtChiso.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn có chỉ số BMI bình thường");
                    }
                    else if(chiso == 25){
                        txtChiso.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn đang bị thừa cân");
                    }
                    else if(chiso > 25 && chiso <=29.9){
                        txtChiso.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn đang ở giai đoạn tiền béo phì/béo phì mức độ thấp");
                    }
                    else if(chiso ==40){
                        txtChiso.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn đang béo phì cấp độ 3");
                    }
                    else if(chiso >= 30 && chiso <=34.5){
                        txtChiso.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn đang béo phì cấp độ 1");
                    }
                    else if(chiso >=35 && chiso <=39.9){
                        txtChiso.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn đang béo phì cấp độ 2");
                    }
    }
}