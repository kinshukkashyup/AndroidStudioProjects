package com.example.kingbradley.exercise8;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.kingbradley.exercise8.R;



/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FinalFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FinalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FinalFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_final_fragment, container, false);
    }
}