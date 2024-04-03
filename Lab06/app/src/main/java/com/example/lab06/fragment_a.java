package com.example.lab06;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lab06.fragment_b;
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_a#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_a extends Fragment {
    private EditText editTextA, editTextB;
    private Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;
    private TextView textViewResult;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_a() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_a.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_a newInstance(String param1, String param2) {
        fragment_a fragment = new fragment_a();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        editTextA = view.findViewById(R.id.editTextA);
        editTextB = view.findViewById(R.id.editTextB);
        buttonAdd = view.findViewById(R.id.buttonAdd);
        buttonSubtract = view.findViewById(R.id.buttonSubtract);
        buttonMultiply = view.findViewById(R.id.buttonMultiply);
        buttonDivide = view.findViewById(R.id.buttonDivide);
        textViewResult = view.findViewById(R.id.textViewResult);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("+");
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("-");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("*");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("/");
            }
        });

        return view;
    }

    private void calculate(String operation) {
        double numA = Double.parseDouble(editTextA.getText().toString());
        double numB = Double.parseDouble(editTextB.getText().toString());
        double result = 0;

        switch (operation) {
            case "+":
                result = numA + numB;
                break;
            case "-":
                result = numA - numB;
                break;
            case "*":
                result = numA * numB;
                break;
            case "/":
                if (numB != 0) {
                    result = numA / numB;
                } else {
                    Toast.makeText(getActivity(), "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                }
                break;
        }

        textViewResult.setText(String.valueOf(result));
        sendHistory(operation, numA, numB, result);
    }

    public interface OnCalculationListener {
        void onCalculationResult(String history);
    }
    private OnCalculationListener onCalculationListener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            onCalculationListener = (OnCalculationListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement OnCalculationListener");
        }
    }
    private void sendHistory(String operation, double numA, double numB, double result) {
        String history = numA + operation + numB + " = " + result;
        onCalculationListener.onCalculationResult(history);
    }
}