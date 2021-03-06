package com.andrealiznm.sesion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText eCorreo, eNombre;
    Button bGuardar;
    String nombre, correo, data="";
    CheckBox cCine, cNadar, cGym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eCorreo = findViewById(R.id.eCorreo);
        eNombre = findViewById(R.id.eNombre);
        cCine = findViewById(R.id.cCine);
        cNadar = findViewById(R.id.cNadar);
        cGym = findViewById(R.id.cGym);
       /* bGuardar = findViewById(R.id.bGuardar);

        bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre = eNombre.getText().toString();
                eCorreo.setText(nombre);
            }
        }); */

    }

    public void guardar(View view) {
        int id = view.getId();

        if (id == R.id.bGuardar){
            data = data + eNombre.getText().toString();
            eCorreo.setText(data);
        }

    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();

        if(id == R.id.rMasculino){
            data = data + " sexo: Masculino";
        } else {
            data = data + " sexo: Femenino";
        }
    }

    public void onCheckBoxClicked(View view) {
        int id = view.getId();

        switch(id) {
            case R.id.cCine:
                if (cCine.isChecked())
                    data = data + " Cine";
            else
                // Remove the meat
                break;
            case R.id.cGym:
                if (cGym.isChecked())
                    data = data + " Gym";
            else
                // I'm lactose intolerant
                break;
            case R.id.cNadar:
                if (cNadar.isChecked())
                    data = data + " Nadar";
            else
                // I'm lactose intolerant
                break;
        }
    }
    //Agregar fecha de nacimiento,
}
