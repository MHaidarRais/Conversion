package com.example.macosx.conversion;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {





    Spinner sp1, sp2;
    EditText etConvert;
    TextView txtHasil;
    Button btnHitung;
    BottomNavigationView bottomNavigationView;
    String[] datafrom = new String[]{
            "Meter", "Centimeter", "Kilometer", "Yard", "Feet", "Inch"
    };
    String jenisFrom;
    String[] dataTo = new String[]{
            "Meter", "Centimeter", "Kilometer", "Yard", "Feet", "Inch"
    };
    String jenisTo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etConvert = findViewById(R.id.etConvert);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.navigation);




        sp1 = (Spinner) findViewById(R.id.sp1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
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
        sp2 = (Spinner) findViewById(R.id.sp2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
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

                //-------------------------------FROM METER
                if (jenisFrom.equalsIgnoreCase("Meter") && jenisTo.equalsIgnoreCase("Centimeter")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 100.00;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Meter") && jenisTo.equalsIgnoreCase("Kilometer")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.001;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Meter") && jenisTo.equalsIgnoreCase("Yard")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 1.096;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Meter") && jenisTo.equalsIgnoreCase("Feet")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 3.28084;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Meter") && jenisTo.equalsIgnoreCase("Inch")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 39.3701;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Meter") && jenisTo.equalsIgnoreCase("Meter")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }
//                -------------------------------FROM CENTIMETER
                else if (jenisFrom.equalsIgnoreCase("Centimeter") && jenisTo.equalsIgnoreCase("Meter")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.01;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Centimeter") && jenisTo.equalsIgnoreCase("Kilometer")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.00001;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Centimeter") && jenisTo.equalsIgnoreCase("Yard")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.0109361;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                } else if (jenisFrom.equalsIgnoreCase("Centimeter") && jenisTo.equalsIgnoreCase("Feet")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.0328084;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Centimeter") && jenisTo.equalsIgnoreCase("Inch")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.393701;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Centimeter") && jenisTo.equalsIgnoreCase("Centimeter")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }
//                  -------------------------------FROM KILOMETER
                else if (jenisFrom.equalsIgnoreCase("Kilometer") && jenisTo.equalsIgnoreCase("Meter")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 1000.00;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Kilometer") && jenisTo.equalsIgnoreCase("Centimeter")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 100000.00;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Kilometer") && jenisTo.equalsIgnoreCase("Yard")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 1093.61;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Kilometer") && jenisTo.equalsIgnoreCase("Feet")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 3280.84;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Kilometer") && jenisTo.equalsIgnoreCase("Inch")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 39370.10;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Kilometer") && jenisTo.equalsIgnoreCase("Kilometer")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }
//                 -------------------------------FROM YARD
                else if (jenisFrom.equalsIgnoreCase("Yard") && jenisTo.equalsIgnoreCase("Meter")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.9144;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Yard") && jenisTo.equalsIgnoreCase("Centimeter")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 91.44;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Yard") && jenisTo.equalsIgnoreCase("Kilometer")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.0009144;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Yard") && jenisTo.equalsIgnoreCase("Feet")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 3.00;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Yard") && jenisTo.equalsIgnoreCase("Inch")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 36.00;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Yard") && jenisTo.equalsIgnoreCase("Yard")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }
//                -------------------------------FROM FEET
                else if (jenisFrom.equalsIgnoreCase("Feet") && jenisTo.equalsIgnoreCase("Centimeter")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 30.48;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Feet") && jenisTo.equalsIgnoreCase("Meter")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.3048;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Feet") && jenisTo.equalsIgnoreCase("Kilometer")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.0003048;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Feet") && jenisTo.equalsIgnoreCase("Yard")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.30;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Feet") && jenisTo.equalsIgnoreCase("Inch")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 12.00;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Feet") && jenisTo.equalsIgnoreCase("Feet")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }
//                -------------------------------FROM INCH
                else if (jenisFrom.equalsIgnoreCase("Inch") && jenisTo.equalsIgnoreCase("Centimeter")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 2.54;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Inch") && jenisTo.equalsIgnoreCase("Meter")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.0254;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Inch") && jenisTo.equalsIgnoreCase("Kilometer")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.00025400;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Inch") && jenisTo.equalsIgnoreCase("Yard")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.0277778;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Inch") && jenisTo.equalsIgnoreCase("Feet")) {
                    String hitung = etConvert.getText().toString();
                    int gHitung = Integer.parseInt(hitung);
                    Double hasil = gHitung * 0.0833333;
                    String hhasil = hasil.toString();
                    txtHasil.setText(hhasil);
                }else if (jenisFrom.equalsIgnoreCase("Inch") && jenisTo.equalsIgnoreCase("Inch")) {
                    String hitung = etConvert.getText().toString();
                    txtHasil.setText(hitung);
                }

            }

        });

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_Length:
                                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);

                            case R.id.action_Weight:

                                Intent intent2 = new Intent(MainActivity.this, WeightActivity.class);
                                startActivity(intent2);
                            case R.id.action_Temperature:
                                Intent intent3 = new Intent(MainActivity.this, TemperatureActivity.class);
                                startActivity(intent3);



                        }
                        return true;
                    }
                });

    }
}
