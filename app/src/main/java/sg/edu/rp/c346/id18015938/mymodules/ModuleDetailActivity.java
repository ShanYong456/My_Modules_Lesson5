package sg.edu.rp.c346.id18015938.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView code;
    TextView name;
    TextView year;
    TextView sem;
    TextView credit;
    TextView venue;
    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        code = findViewById(R.id.textViewCode);
        name = findViewById(R.id.textViewName);
        year = findViewById(R.id.textViewYear);
        sem = findViewById(R.id.textViewSem);
        credit = findViewById(R.id.textViewCredit);
        venue = findViewById(R.id.textViewVenue);
        backbtn = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String Code = intentReceived.getStringExtra("Module Code");
        code.setText("Module Code: "+Code);

        String Name = intentReceived.getStringExtra("Module Name");
        name.setText("Module Name: "+Name);

        String Year = intentReceived.getStringExtra("Year");
        year.setText("Year: "+Year);

        int Sem = intentReceived.getIntExtra("Semester", 1);
        sem.setText("Semester: "+Sem);

        int Credit = intentReceived.getIntExtra("Module Credit", 0);
        credit.setText("Module Credit: "+Credit);

        String Venue = intentReceived.getStringExtra("Venue");
        venue.setText("Venue: "+Venue);

        backbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ModuleDetailActivity.this,MainActivity.class);
                startActivity(intent);
            }

        });

    }
}
