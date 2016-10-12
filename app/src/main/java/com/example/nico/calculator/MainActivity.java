package com.example.nico.calculator;

import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculTextView {

    private TextView calculText;
    private Button clearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manageDrawer();

        calculText = (TextView) findViewById(R.id.calcul_text);
        setCalculText(Entry.getSave());

        clearButton = (Button) findViewById(R.id.clear);
        clearButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCalculText("0");

            }
        });
    }

    public void setCalculText(String text){
        calculText.setText(text);
        Entry.setSave(text);
    }

    public String getOriginText() {
        return calculText.getText().toString();
    }

    public void manageDrawer(){
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        final LinearLayout leftDrawer = (LinearLayout) findViewById(R.id.left_drawer);

        Button black = (Button) findViewById(R.id.black);
        black.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculText.setBackgroundColor(Color.BLACK);
                leftDrawer.setBackgroundColor(Color.BLACK);

            }
        });

        Button blue = (Button) findViewById(R.id.blue);
        blue.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculText.setBackgroundColor(Color.BLUE);
                leftDrawer.setBackgroundColor(Color.BLUE);

            }
        });
    }

}
