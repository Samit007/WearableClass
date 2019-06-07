package com.example.wearableclass;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView tvoutput;
    private Button btnshow;
    private EditText etfirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvoutput=findViewById(R.id.tvoutput);
        etfirst=findViewById(R.id.etfirst);
        btnshow=findViewById(R.id.btnshow);

        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=etfirst.getText().toString();
                tvoutput.setText(a);
            }
        });
        // Enables Always-on
        setAmbientEnabled();
    }
}
