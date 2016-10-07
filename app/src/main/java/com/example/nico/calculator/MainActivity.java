package com.example.nico.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculator calc = new Calculator();
    private TextView calculText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculText = (TextView)findViewById(R.id.calcul_text);
        calculText.setText(calc.getSave());
    }

    /**
     * add clicked number button value on textview
     * @param v
     */
    public void onButtonClick(View v) {
        String buttonValue = getButtonValue(v);
        addText(buttonValue, calculText);
    }

    /**
     * get clicked number button value
     * @param v
     * @return string
     */
    public String getButtonValue(View v) {
        return  v.getTag().toString();
    }

    /**
     * add text on targeted texview
     * @param text
     * @param target
     */
    public void addText(String text, TextView target) {
        String originText = target.getText().toString();
        if (originText.equals("0")){
            target.setText(text);
        } else {
            target.setText(originText + text);
        }
        saveText(target.getText().toString());
    }

    /**
     * get result on textview when equal is clicked
     * @param v
     */
    public void onResultClick(View v) {
        double result = calc.calculate(calculText.getText().toString());
        calculText.setText(Double.toString(result));
    }

    /**
     * clear textview on clear button clicked
     * @param v
     */
    public void onClearClick(View v) {
        calculText.setText("0");
        saveText("0");
    }

    /**
     * on operator button clicked
     * @param v
     */
    public void onOperatorClick(View v) {
        String text = calculText.getText().toString();
        String originText = calculText.getText().toString();
        if (!originText.equals("0")){
            if (calc.checkTwoNumbers(text)) {
                double result = calc.calculate(text);
                calculText.setText(Double.toString(result));
                String buttonValue = getButtonValue(v);
                addText(buttonValue, calculText);
            } else {
                String buttonValue = getButtonValue(v);
                addText(buttonValue, calculText);
            }
        }
    }

    /**
     * save textview value for orientation change
     * @param text
     */
    public void saveText(String text) {
        calc.setSave(text);
    }
}
