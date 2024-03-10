package tiil.edu.simplesumapp;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public void XuLyCong(View view){
        EditText editTextSoA = findViewById(R.id.edTA);
        EditText editTextSoB = findViewById(R.id.edTB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //lay du lieu ve
        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        //chuyen sang dang so
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);
        //tinh tong
        int tong = soA + soB;
        String strTong = String.valueOf(tong);
        //in rar mang hinh
        editTextKetQua.setText(strTong);
    }
}