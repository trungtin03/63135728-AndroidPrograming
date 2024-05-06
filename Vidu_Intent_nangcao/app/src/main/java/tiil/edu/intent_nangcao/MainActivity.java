package tiil.edu.intent_nangcao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
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
    public void NhapLieu(View v){
        Intent intent = new Intent(this, activity_nhap_lieu.class);
        startActivityForResult(intent, 8000);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 8000){
            if(resultCode == RESULT_OK){
                String hoTen = data.getStringExtra("HT");
                int namSinh = data.getIntExtra("NS", 0);

                TextView tvHT = findViewById(R.id.hoTen);
                TextView tvNS = findViewById(R.id.namSinh);
                tvHT.setText(hoTen);
                tvNS.setText(String.valueOf(namSinh));
            }
            else {
                Toast.makeText(this, "Trả về thất bại", Toast.LENGTH_LONG).show();
            }
        }
        else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}