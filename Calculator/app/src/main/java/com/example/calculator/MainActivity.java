package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnCal;
    private EditText input, input1;
    private TextView output, tvList;
    Spinner spin;
    private int val1=0;
    private int val2=0,result;
    ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findUIview();
        list=new ArrayList<>();
        list.add("Add");
        list.add("Subtract");
        list.add("Multiply");
        list.add("Divide");
        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,R.layout.text_list,R.id.tvList,list);
        spin.setAdapter(adapter);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(input.getText().toString());
                val2=Integer.parseInt(input1.getText().toString());
                if(spin.getSelectedItem().toString()=="Add"){
                    result=val1+val2;
                    output.setText("Addition is: "+String.valueOf(result));
                }

                else if(spin.getSelectedItem().toString()=="Subtract"){
                    result=val1-val2;
                    output.setText("Subtraction is: "+String.valueOf(result));
                }

                else if(spin.getSelectedItem().toString()=="Multiply"){
                    result=val1*val2;
                    output.setText("Product is: "+String.valueOf(result));
                }
                else if(spin.getSelectedItem().toString()=="Divide"){
                    if(val2==0){
                        output.setText("Cannot divide a number by zero");
                    }
                    else{
                        result=val1/val2;
                        output.setText("Qoutient: "+String.valueOf(result)+"    Reminder: "+String.valueOf(val1%val2));
                    }
                }
                else{
                    Toast.makeText(MainActivity.this,"Invalid",Toast.LENGTH_LONG).show();
                }
            }
        });
            }






    private void findUIview(){
        spin=findViewById(R.id.spin);
        input=findViewById(R.id.etNum1);
        input1=findViewById(R.id.etNum2);
        output=findViewById(R.id.tvOutput);
        btnCal=findViewById(R.id.button);

    }
}