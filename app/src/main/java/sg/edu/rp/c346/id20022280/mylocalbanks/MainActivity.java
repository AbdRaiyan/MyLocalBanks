package sg.edu.rp.c346.id20022280.mylocalbanks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvDBS;
    TextView tvOCBC;
    TextView tvUOB;

    String buttonPressed = "";

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
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"Website");
        menu.add(0,1,1,"Contact the bank");

        if(v == tvDBS){
            buttonPressed = "selectedDBS";
        }else if(v == tvOCBC){
            buttonPressed = "selectedOCBC";
        }else if(v == tvUOB){
            buttonPressed = "selectedUOB";
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(buttonPressed.equalsIgnoreCase("SelectedDBS")){
            switch(item.getItemId()){
                case 0:
                    Intent intentWeb = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.dbs.com.sg"));
                    startActivity(intentWeb);
                    break;
                case 1:
                    Intent intentDial = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:18001111111"));
                    startActivity(intentDial);
                    break;
            }
        } else if(buttonPressed.equalsIgnoreCase("SelectedOCBC")){
            switch(item.getItemId()){
                case 0:
                    Intent intentWeb = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ocbc.com"));
                    startActivity(intentWeb);
                    break;
                case 1:
                    Intent intentDial = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:18003633333"));
                    startActivity(intentDial);
                    break;
            }
        } else if(buttonPressed.equalsIgnoreCase("SelectedUOB")){
            switch(item.getItemId()){
                case 0:
                    Intent intentWeb = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.uob.com.sg"));
                    startActivity(intentWeb);
                    break;
                case 1:
                    Intent intentDial = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:18002222121"));
                    startActivity(intentDial);
                    break;
            }
        }

        return super.onContextItemSelected(item);
    }
}