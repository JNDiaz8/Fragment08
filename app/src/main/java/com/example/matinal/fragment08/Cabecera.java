package com.example.matinal.fragment08;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cabecera extends ListFragment {

    CabeceraListener mCallBack;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,
                Elementos.Cabeceras));

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mCallBack = (CabeceraListener) context;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        mCallBack.tocado(position);
    }

    public interface CabeceraListener {
        public void tocado(int position);
    }
}
