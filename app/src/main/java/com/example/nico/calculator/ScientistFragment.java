package com.example.nico.calculator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ScientistFragment extends Fragment {

    private Calculator calc = new Calculator();
    private CalculTextView calculTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_scientist, container, false);
        calculTextView = (MainActivity) getActivity();
        initButtons(view);
        return view;
    }

    /**
     * init all buttons
     * @param view
     */
    private void initButtons(View view) {
        Button sin = (Button) view.findViewById(R.id.sin);
        sin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });

        Button tan = (Button) view.findViewById(R.id.tan);
        tan.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });

        Button cos = (Button) view.findViewById(R.id.cos);
        cos.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                String originText = calculTextView.getOriginText();
                calculTextView.setCalculText(Entry.checkText(tag, originText));
            }
        });
    }
}