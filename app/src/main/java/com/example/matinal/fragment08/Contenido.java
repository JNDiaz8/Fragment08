package com.example.matinal.fragment08;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Contenido extends Fragment {
    final static String ARG_POSITION = "position";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmentos, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        Bundle args = getArguments();
        TextView contenido = (TextView) getActivity().findViewById(R.id.contenido);
        contenido.setText(Elementos.Contenidos[args.getInt(ARG_POSITION)]);
    }
}
