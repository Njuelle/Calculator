package com.example.nico.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator calc = new Calculator();
        TextView calculText = (TextView)findViewById(R.id.calcul_text);
        calculText.setText(calc.getSave());

    }

    public void onButtonClick(View v) {
        String buttonValue = getButtonValue(v);
        TextView calculText = (TextView)findViewById(R.id.calcul_text);
        addText(buttonValue, calculText);
    }

    public String getButtonValue(View v) {
        return  v.getTag().toString();
    }

    public void addText(String text, TextView target) {
        String originText = target.getText().toString();
        if (originText.equals("0")){
            target.setText(text);
        } else {
            target.setText(originText + text);
        }
        saveText(target.getText().toString());
    }

    public void onResultClick() {
        Calculator calc = new Calculator();
    }

    public void onClearClick(View v) {
        TextView calculText = (TextView)findViewById(R.id.calcul_text);
        calculText.setText("0");
        saveText("0");
    }

    public void saveText(String text) {
        Calculator calc = new Calculator();
        calc.setSave(text);
    }
}
