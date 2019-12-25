package id.ac.polinema.uts.fragment;


import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import id.ac.polinema.uts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SegitigaHitungFragment extends Fragment {

    private EditText inputanA, inputanB, inputanC, inputanD, inputanE;
    private Button btnKeliling, btnLuas;

    private TextView hasil, hasil2;

    public SegitigaHitungFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_segitiga_hitung, container, false);
        hasil = view.findViewById(R.id.fragmentSegitigaHitung_hasilKelilingText);
        hasil2 = view.findViewById(R.id.outputLuas);
        btnKeliling = view.findViewById(R.id.fragmentSegitigaHitung_hasilKeliling);
        btnLuas = view.findViewById(R.id.hasilLuas);
        inputanA = view.findViewById(R.id.fragmentSegitigaHitung_inputA);
        inputanB = view.findViewById(R.id.fragmentSegitigaHitung_inputB);
        inputanC = view.findViewById(R.id.fragmentSegitigaHitung_inputC);
        inputanD = view.findViewById(R.id.editText4);
        inputanE = view.findViewById(R.id.editText5);


        btnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputanA.getText() != null || inputanB.getText() != null || inputanC.getText() != null){

                    hasil.setText(String.valueOf((Float.parseFloat(inputanA.getText().toString()) + Float.parseFloat(inputanB.getText().toString()) + Float.parseFloat(inputanC.getText().toString()))));
                }
            }
        });

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputanD.getText() != null || inputanE.getText() != null){

                    hasil2.setText(String.valueOf((Float.parseFloat(inputanD.getText().toString()) * Float.parseFloat(inputanE.getText().toString()) /2)));
                }
            }
        });
        return view;
    }

}
