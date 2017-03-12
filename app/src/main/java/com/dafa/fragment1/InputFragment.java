package com.dafa.fragment1;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class InputFragment extends Fragment {

    EditText enama;
    EditText eumur;
    IListener mlistener;

    public InputFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_input, container, false);

        enama = (EditText) view.findViewById(R.id.etnama);
        eumur = (EditText) view.findViewById(R.id.etumur);

        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                doProses();

            }
        });

        return view;
    }

    private void doProses() {

        if (mlistener != null) {

            mlistener.doProses(enama.getText().toString(), eumur.getText().toString());

        }

    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
        if (context instanceof InputFragment.IListener) {

            mlistener = (InputFragment.IListener) context;

        } else {

            throw new RuntimeException(context.toString() + "must inplement Input.Ilestener");

        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mlistener = null;

    }

    public interface IListener {

        void doProses(String nama, String umur);

    }
}
