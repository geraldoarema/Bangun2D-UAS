package id.ac.polinema.uts.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import id.ac.polinema.uts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LingkaranHitungFragment extends Fragment {
    private EditText inputanR, inputanR2;
    private Button btnKeliling, btnLuas;

    private TextView hasil, hasil2;


    public LingkaranHitungFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lingkaran_hitung, container, false);

        hasil = view.findViewById(R.id.fragmentSegitigaHitung_hasilKelilingText);
        hasil2 = view.findViewById(R.id.outputLuas);
        btnKeliling = view.findViewById(R.id.fragmentSegitigaHitung_hasilKeliling);
        btnLuas = view.findViewById(R.id.hasilLuas);
        inputanR = view.findViewById(R.id.fragmentSegitigaHitung_inputB);
        inputanR2 = view.findViewById(R.id.editText4);

        btnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputanR != null){
                    hasil.setText(String.valueOf((Float.parseFloat(inputanR.getText().toString())) * 3.14 * 2));
                }
            }
        });

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputanR2 != null){
                    hasil2.setText(String.valueOf((Float.parseFloat(inputanR2.getText().toString())) * 3.14 * (Float.parseFloat(inputanR2.getText().toString()))));
                }
            }
        });
        return view;
    }

}
