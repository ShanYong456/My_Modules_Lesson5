package sg.edu.rp.c346.id18015938.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView module1;
    TextView module2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        module1 = findViewById(R.id.textView1);
        module2 = findViewById(R.id.textView2);

        module1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("Module Code","C346");
                intent.putExtra("Module Name","Android Programming");
                intent.putExtra("Year","2020");
                intent.putExtra("Semester",1);
                intent.putExtra("Module Credit",4);
                intent.putExtra("Venue","W66M");
                startActivity(intent);
            }

        });

        module2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("Module Code","C349");
                intent.putExtra("Module Name","iPad Programming");
                intent.putExtra("Year","2020");
                intent.putExtra("Semester",2);
                intent.putExtra("Module Credit",4);
                intent.putExtra("Venue","W64C");
                startActivity(intent);
            }

        });
    }
}
