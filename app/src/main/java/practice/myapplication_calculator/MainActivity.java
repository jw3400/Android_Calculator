package practice.myapplication_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    TextView label1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label1 = (TextView) findViewById(R.id.textView);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);

        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String input1 = e1.getText().toString();
                String input2 = e2.getText().toString();
                double result;

                if (e1.getText().toString().equals("") || e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하지 않았습니다.", Toast.LENGTH_LONG).show();
                    label1.setText("계산 결과는 : 알 수 없습니다.");
                }
                else {
                    result = Double.parseDouble(input1) + Double.parseDouble(input2);
                    label1.setText("계산 결과는 : "+result+" ");
                }
            }
        });

        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String input1 = e1.getText().toString();
                String input2 = e2.getText().toString();
                double result;

                if (e1.getText().toString().equals("") || e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하지 않았습니다.", Toast.LENGTH_LONG).show();
                    label1.setText("계산 결과는 : 알 수 없습니다.");
                }
                else {
                    result = Double.parseDouble(input1) - Double.parseDouble(input2);
                    label1.setText("계산 결과는 : "+result+" ");
                }


            }
        });

        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String input1 = e1.getText().toString();
                String input2 = e2.getText().toString();
                double result;

                if (e1.getText().toString().equals("") || e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하지 않았습니다.", Toast.LENGTH_LONG).show();
                    label1.setText("계산 결과는 : 알 수 없습니다.");
                }
                else {
                    result =  Double.parseDouble(input1) * Double.parseDouble(input2);
                    label1.setText("계산 결과는 : " + result + " ");
                }
            }

        });

        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String input1 = e1.getText().toString();
                String input2 = e2.getText().toString();
                double result;

                if (e1.getText().toString().equals("") || e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하지 않았습니다.", Toast.LENGTH_LONG).show();
                    label1.setText("계산 결과는 : 알 수 없습니다.");
                }
                else if (e2.getText().toString().equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_LONG).show();
                    label1.setText("계산 결과는 : 알 수 없습니다.");
                }
                else {
                    result = Double.parseDouble(input1) / Double.parseDouble(input2);
                    label1.setText("계산 결과는 : " + result + " ");
                }


            }
        });

        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String input1 = e1.getText().toString();
                String input2 = e2.getText().toString();
                double result;

                if (e1.getText().toString().equals("") || e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하지 않았습니다.", Toast.LENGTH_LONG).show();
                    label1.setText("계산 결과는 : 알 수 없습니다.");
                }
                else if (e2.getText().toString().equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나머지를 못 구합니다.", Toast.LENGTH_LONG).show();
                    label1.setText("계산 결과는 : 알 수 없습니다.");
                }
                else {
                    result = Double.parseDouble(input1) % Double.parseDouble(input2);
                    label1.setText("계산 결과는 : "+result+" ");
                }
            }
        });
    }
}
