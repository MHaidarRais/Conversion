package com.example.macosx.conversion;

import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TemperatureActivity extends Fragment {
    Spinner sp1, sp2;
    EditText etConvert;
    TextView txtHasil;
    Button btnHitung;
    BottomNavigationView bottomNavigationView;
    String[] datafrom = new String[]{
            "Fahrenheit", "Celcius", "Kelvin"
    };
    String jenisFrom;
    String[] dataTo = new String[]{
            "Fahrenheit", "Celcius", "Kelvin"
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
                if (jenisFrom.equalsIgnoreCase("Fahrenheit") && jenisTo.equalsIgnoreCase("Celcius")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = (gHitung - 32.0) * 5/9;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Fahrenheit") && jenisTo.equalsIgnoreCase("Kelvin")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = (gHitung - 32) * 5/9 + 273.15;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Fahrenheit") && jenisTo.equalsIgnoreCase("Fahrenheit")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }
//                -------------------------------FROM KILOGRAM
                else if (jenisFrom.equalsIgnoreCase("Celcius") && jenisTo.equalsIgnoreCase("Fahrenheit")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = (gHitung * 9.0/5) + 32;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Celcius") && jenisTo.equalsIgnoreCase("Kelvin")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung + 273.15;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Celcius") && jenisTo.equalsIgnoreCase("Celcius")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }
//                  -------------------------------FROM TON
                else if (jenisFrom.equalsIgnoreCase("Kelvin") && jenisTo.equalsIgnoreCase("Fahrenheit")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = (gHitung - 273.15) * 9/5 + 32;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Kelvin") && jenisTo.equalsIgnoreCase("Celcius")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung - 273.15;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Kelvin") && jenisTo.equalsIgnoreCase("Kelvin")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }

            }

        });

        return v;
    }
}

