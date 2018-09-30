package com.fm.primerparcial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionFragment extends Fragment
{
    public static DescriptionFragment newInstance()
    {
        DescriptionFragment newFragment = new DescriptionFragment();
        return newFragment;
    }
    public DescriptionFragment()
    {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        //TextView lblTechSpec1 = getView().findViewById(R.id.lblTechSpec1);
        //lblTechSpec1.setText("RIVER");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description, container, false);
    }

}
