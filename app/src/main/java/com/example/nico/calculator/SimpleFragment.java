package com.example.nico.calculator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SimpleFragment extends Fragment {

    private Calculator calc = new Calculator();
    private CalculTextView calculTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple, container, false);
        calculTextView = (CalculTextView) getActivity();
        initButtons(view);
        return view;
    }

    /**
     * init all buttons
     * @param view
     */
    private void initButtons(View view) {
        Button b1 = (Button) view.findViewById(R.id.b1);
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });
        Button b2 = (Button) view.findViewById(R.id.b2);
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });
        Button b3 = (Button) view.findViewById(R.id.b3);
        b3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });
        Button b4 = (Button) view.findViewById(R.id.b4);
        b4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });
        Button b5 = (Button) view.findViewById(R.id.b5);
        b5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });
        Button b6 = (Button) view.findViewById(R.id.b6);
        b6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });
        Button b7 = (Button) view.findViewById(R.id.b7);
        b7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });
        Button b8 = (Button) view.findViewById(R.id.b8);
        b8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });
        Button b9 = (Button) view.findViewById(R.id.b9);
        b9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });
        Button b0 = (Button) view.findViewById(R.id.b0);
        b0.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });

        Button add = (Button) view.findViewById(R.id.add);
        add.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });

        Button min = (Button) view.findViewById(R.id.min);
        min.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });

        Button div = (Button) view.findViewById(R.id.div);
        div.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });

        Button mult = (Button) view.findViewById(R.id.mult);
        mult.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });

        Button eq = (Button) view.findViewById(R.id.eq);
        eq.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = calc.calculate(calculTextView.getOriginText());
                calculTextView.setCalculText(String.valueOf(result));

            }
        });

        Button dot = (Button) view.findViewById(R.id.dot);
        dot.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });




    }

}