package com.example.macosx.conversion;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class WeightActivity extends Fragment {


    Spinner sp1, sp2;
    EditText etConvert;
    TextView txtHasil;
    Button btnHitung;
    BottomNavigationView bottomNavigationView;
    String[] datafrom = new String[]{
            "Gram", "Kilogram", "Ton", "Pounds", "Ounce", "Stone"
    };
    String jenisFrom;
    String[] dataTo = new String[]{
            "Gram", "Kilogram", "Ton", "Pounds", "Ounce", "Stone"
    };
    String jenisTo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_weight, null);




        etConvert = (EditText)v.findViewById(R.id.etConvert);
        txtHasil = v.findViewById(R.id.txtHasil);
        btnHitung = v.findViewById(R.id.btnHitung);




        sp1 = (Spinner) v.findViewById(R.id.sp1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,
                datafrom);
        sp1.setAdapter(adapter);

        //aksi ketika spinner di pencet
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                jenisFrom = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        sp2 = (Spinner)v. findViewById(R.id.sp2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,
                dataTo);
        sp2.setAdapter(adapter1);

        //aksi ketika spinner di pencet
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                jenisTo = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //-------------------------------FROM GRAM
                if (jenisFrom.equalsIgnoreCase("Gram") && jenisTo.equalsIgnoreCase("Kilogram")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.001;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Gram") && jenisTo.equalsIgnoreCase("Ton")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 1e-6;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Gram") && jenisTo.equalsIgnoreCase("Pounds")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.00220462;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Gram") && jenisTo.equalsIgnoreCase("Ounce")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.035274;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Gram") && jenisTo.equalsIgnoreCase("Stone")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.000157473;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Gram") && jenisTo.equalsIgnoreCase("Gram")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }
//                -------------------------------FROM KILOGRAM
                else if (jenisFrom.equalsIgnoreCase("Kilogram") && jenisTo.equalsIgnoreCase("Gram")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 1000.00;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Kilogram") && jenisTo.equalsIgnoreCase("Ton")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.001;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Kilogram") && jenisTo.equalsIgnoreCase("Pounds")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 2.20462;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Kilogram") && jenisTo.equalsIgnoreCase("Ounce")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 35.274;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Kilogram") && jenisTo.equalsIgnoreCase("Stone")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.157473;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Kilogram") && jenisTo.equalsIgnoreCase("Kilogram")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }
//                  -------------------------------FROM TON
                else if (jenisFrom.equalsIgnoreCase("Ton") && jenisTo.equalsIgnoreCase("Gram")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 1e+6;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Ton") && jenisTo.equalsIgnoreCase("Kilogram")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 1000000.00;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Ton") && jenisTo.equalsIgnoreCase("Pounds")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 2204.62;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Ton") && jenisTo.equalsIgnoreCase("Ounce")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 35274.00;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Ton") && jenisTo.equalsIgnoreCase("Stone")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 157.473;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Ton") && jenisTo.equalsIgnoreCase("Ton")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }
//                 -------------------------------FROM POUNDS
                else if (jenisFrom.equalsIgnoreCase("Pounds") && jenisTo.equalsIgnoreCase("Gram")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 453.592;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Pounds") && jenisTo.equalsIgnoreCase("Kilogram")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.453592;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Pounds") && jenisTo.equalsIgnoreCase("Ton")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.000453592;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Pounds") && jenisTo.equalsIgnoreCase("Ounce")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 16.00;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Pounds") && jenisTo.equalsIgnoreCase("Stone")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.0714286;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Pounds") && jenisTo.equalsIgnoreCase("Pounds")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }
//                -------------------------------FROM OUNCE
                else if (jenisFrom.equalsIgnoreCase("Ounce") && jenisTo.equalsIgnoreCase("Gram")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 28.3495;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Ounce") && jenisTo.equalsIgnoreCase("Kilogram")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.0283495;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Ounce") && jenisTo.equalsIgnoreCase("Ton")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 2.835e-5;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Ounce") && jenisTo.equalsIgnoreCase("Pounds")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.0625;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Ounce") && jenisTo.equalsIgnoreCase("Stone")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.00446429;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Ounce") && jenisTo.equalsIgnoreCase("Ounce")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }
//                -------------------------------FROM STONE
                else if (jenisFrom.equalsIgnoreCase("Stone") && jenisTo.equalsIgnoreCase("Gram")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 6350.29;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Stone") && jenisTo.equalsIgnoreCase("Kilogram")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 6.35029;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Stone") && jenisTo.equalsIgnoreCase("Ton")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.00635029;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Stone") && jenisTo.equalsIgnoreCase("Pounds")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 14.00;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Stone") && jenisTo.equalsIgnoreCase("Ounce")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 224.00;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Stone") && jenisTo.equalsIgnoreCase("Stone")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }

            }

        });

        return v;
    }
}
