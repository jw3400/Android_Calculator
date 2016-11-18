package practice.myapplication_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    TextView label1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label1 = (TextView) findViewById(R.id.textView);

        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                e1 = (EditText) findViewById(R.id.editText);
                e2 = (EditText) findViewById(R.id.editText2);
                int input1 = Integer.parseInt(e1.getText().toString());
                int input2 = Integer.parseInt(e2.getText().toString());
                int result;
                result = input1 + input2;
                label1.setText("계산 결과는 : "+result+" ");


            }
        });

        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                e1 = (EditText) findViewById(R.id.editText);
                e2 = (EditText) findViewById(R.id.editText2);
                int input1 = Integer.parseInt(e1.getText().toString());
                int input2 = Integer.parseInt(e2.getText().toString());
                int result;
                result = input1 - input2;
                label1.setText("계산 결과는 : "+result+" ");

            }
        });

        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                e1 = (EditText) findViewById(R.id.editText);
                e2 = (EditText) findViewById(R.id.editText2);
                int input1 = Integer.parseInt(e1.getText().toString());
                int input2 = Integer.parseInt(e2.getText().toString());
                int result;
                result = input1 * input2;
                label1.setText("계산 결과는 : "+result+" ");
            }
        });

        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                e1 = (EditText) findViewById(R.id.editText);
                e2 = (EditText) findViewById(R.id.editText2);
                int input1 = Integer.parseInt(e1.getText().toString());
                int input2 = Integer.parseInt(e2.getText().toString());
                int result;
                result = input1 / input2;
                label1.setText("계산 결과는 : "+result+" ");
            }
        });
    }
}
