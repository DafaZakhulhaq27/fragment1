package com.dafa.fragment1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OutputFragment extends Fragment {

    TextView hasil;

    public OutputFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_output, container, false);

        hasil = (TextView) view.findViewById(R.id.tvhasil);

        return view;

    }

    public void doProses(String nama, String umur) {

        hasil.setText("Nama = " + nama + " " + umur);

    }

}
