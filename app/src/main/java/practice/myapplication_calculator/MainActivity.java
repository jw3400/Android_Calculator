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

        e1 = (EditText) findViewById(R.id.editText);  //밑줄 표시
        e1.setHint("첫 번째 숫자를 입력하세요.");
        InputFilter[] EditFilter = new InputFilter[1];
        EditFilter[0] = new InputFilter.LengthFilter(10);
        e1.setFilters(EditFilter);                      //최대 10글자 표시
        e1.setFocusable(false);                        //처음 시작될 때 포커스 지정 안하도록 설정
        e1.setInputType(InputType.TYPE_CLASS_NUMBER);//숫자만 입력할 수 있게 설정

        e2 = (EditText) findViewById(R.id.editText2);   //밑줄 표시
        e2.setHint("두 번째 숫자를 입력하세요.");
        InputFilter[] EditFilter2 = new InputFilter[1];
        EditFilter2[0] = new InputFilter.LengthFilter(10);
        e2.setFilters(EditFilter2);                     //최대 10글자 표시
        e2.setFocusable(false);                        //처음 시작될 때 포커스 지정 안하도록 설정
        e2.setInputType(InputType.TYPE_CLASS_NUMBER);//숫자만 입력할 수 있게 설정

        label1 = (TextView) findViewById(R.id.textView);

        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int input1 = Integer.parseInt(e1.getText().toString());
                int input2 = Integer.parseInt(e2.getText().toString());
                int result;
                result = input1 + input2;
                label1.setText(" "+result+" ");
            }
        });

        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int input1 = Integer.parseInt(e1.getText().toString());
                int input2 = Integer.parseInt(e2.getText().toString());
                int result;
                result = input1 - input2;
                label1.setText(" "+result+" ");
            }
        });

        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int input1 = Integer.parseInt(e1.getText().toString());
                int input2 = Integer.parseInt(e2.getText().toString());
                int result;
                result = input1 * input2;
                label1.setText(" "+result+" ");
            }
        });

        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int input1 = Integer.parseInt(e1.getText().toString());
                int input2 = Integer.parseInt(e2.getText().toString());
                int result;
                result = input1 / input2;
                label1.setText(" "+result+" ");
            }
        });
    }
}
