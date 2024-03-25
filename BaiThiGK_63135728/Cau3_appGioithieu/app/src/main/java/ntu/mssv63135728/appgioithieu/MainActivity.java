package ntu.mssv63135728.appgioithieu;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private TextView nameTextView, ageTextView, hobbyTextView, genderTextView, majorTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        nameTextView = findViewById(R.id.nameTextView);
        ageTextView = findViewById(R.id.ageTextView);
        hobbyTextView = findViewById(R.id.hobbyTextView);
        genderTextView = findViewById(R.id.genderTextView);
        majorTextView = findViewById(R.id.majorTextView);
        Button showInfoButton = findViewById(R.id.showInfoButton);
        ageTextView.setVisibility(View.GONE);
        hobbyTextView.setVisibility(View.GONE);
        genderTextView.setVisibility(View.GONE);
        majorTextView.setVisibility(View.GONE);
        showInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hiện thông tin khi nút được nhấn
                nameTextView.setText("Tên: Trần Trung Tín");
                ageTextView.setVisibility(View.VISIBLE);
                hobbyTextView.setVisibility(View.VISIBLE);
                genderTextView.setVisibility(View.VISIBLE);
                majorTextView.setVisibility(View.VISIBLE);
            }
        });
    }
}