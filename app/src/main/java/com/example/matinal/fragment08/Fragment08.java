package com.example.matinal.fragment08;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class Fragment08 extends AppCompatActivity implements Cabecera.CabeceraListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment08);

        Cabecera primerFragmento = new Cabecera();
        primerFragmento.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction()
                .add(R.id.contenedor, primerFragmento).commit();

        if (savedInstanceState != null) {
            return;
        }
    }

    public void tocado(int position) {
        Contenido detalle = new Contenido();
        Bundle args = new Bundle();
        args.putInt(Contenido.ARG_POSITION, position);
        detalle.setArguments(args);

        FragmentTransaction FT = getSupportFragmentManager().beginTransaction();
        FT.replace(R.id.contenedor, detalle);
        FT.addToBackStack(null);
        FT.commit();

    }
}
