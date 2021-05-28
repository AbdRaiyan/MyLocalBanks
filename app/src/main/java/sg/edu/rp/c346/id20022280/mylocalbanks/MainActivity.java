package sg.edu.rp.c346.id20022280.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDBS;
    TextView tvOCBC;
    TextView tvUOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDBS=findViewById(R.id.textViewDBS);
        tvOCBC=findViewById(R.id.textViewOCBC);
        tvUOB=findViewById(R.id.textViewUOB);

        registerForContextMenu(tvDBS);
        registerForContextMenu(tvOCBC);
        registerForContextMenu(tvUOB);



    }
}