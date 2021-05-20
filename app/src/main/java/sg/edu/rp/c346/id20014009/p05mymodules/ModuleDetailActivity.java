package sg.edu.rp.c346.id20014009.p05mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
TextView tvAnswer;
Button buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        tvAnswer=findViewById(R.id.tvmodule1);
        buttonback=findViewById(R.id.buttonback);

        Intent intentReceived=getIntent();
        String  value=intentReceived.getStringExtra("app");


        Intent intentReceived1=getIntent();
        String  value1=intentReceived.getStringExtra("soft");


        if(value!=null){
            tvAnswer.setText(value);
        }
        else if(value1!=null){
            tvAnswer.setText(value1);
        }

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }



}