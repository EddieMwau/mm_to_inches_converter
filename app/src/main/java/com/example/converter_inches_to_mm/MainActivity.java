package com.example.converter_inches_to_mm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button convert_btn, exit_btn;
    EditText input_text, output_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert_btn.findViewById(R.id.convert);
        exit_btn.findViewById(R.id.exit);

        input_text.findViewById(R.id.input);
        output_text.findViewById(R.id.output);

        convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inp_mm = input_text.getText().toString();
                int mm = Integer.parseInt(inp_mm);

                double inches;
                inches = mm / 25.4;

                String inches_op = Double.toString(inches);
                output_text.setText(inches_op);
            }
        });
        exit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
