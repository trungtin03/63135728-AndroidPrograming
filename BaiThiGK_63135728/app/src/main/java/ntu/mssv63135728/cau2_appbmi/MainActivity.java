package ntu.mssv63135728.cau2_appbmi;

import android.os.Bundle;
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

    }
}