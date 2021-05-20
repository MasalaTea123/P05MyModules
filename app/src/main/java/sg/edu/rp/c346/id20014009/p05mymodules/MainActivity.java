package sg.edu.rp.c346.id20014009.p05mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvClickModule1;
    TextView tvClickModule2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvClickModule1=findViewById(R.id.tvClickModule1);
        tvClickModule2=findViewById(R.id.tvClickModule2);

        tvClickModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity.this, ModuleDetailActivity.class );
                k.putExtra("app","ModuleCode: C346 \n ModuleName: Android Programming\n AcademicYear: 2021\n Semester: 1\n ModuleCredit: 4\n Venue:E62E");



                startActivity(k);
            }
        });

        tvClickModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ModuleDetailActivity.class );
                i.putExtra("soft","ModuleCode: C206 \n ModuleName: Software Development\n AcademicYear: 2021\n Semester: 1\n ModuleCredit: 4\n Venue:E62E");



                startActivity(i);
            }
        });


    }
}