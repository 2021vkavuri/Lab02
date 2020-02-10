package com.kavurivinay.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView myText;
    EditText myEditText;
    Button myButton;
    String[] myStrings;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = findViewById(R.id.textView);
        myEditText = findViewById(R.id.editText);
        Resources res = getResources();
        myStrings = res.getStringArray(R.array.my_strings);
        counter = -1;
        myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Log.i("app","Increment Counter");
                counter++;
                if(counter >= myStrings.length)
                {
                    counter = 0;
                }
                myText.setText("" + myStrings[counter]);
            }
        });
    }
    public void displayName(View view)
    {
        myText.setText(myEditText.getText());
    }
}
