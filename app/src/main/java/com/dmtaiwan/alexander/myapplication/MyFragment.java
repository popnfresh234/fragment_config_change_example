package com.dmtaiwan.alexander.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Alexander on 7/28/2017.
 */

public class MyFragment extends Fragment {
    public static final String STRING_KEY = "my_string_key";
    private String myMessage;

    public static MyFragment newInstance(String message) {
        MyFragment myFragment = new MyFragment();
        myFragment.myMessage = message;
        return myFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView myTextView = (TextView) rootView.findViewById(R.id.my_text_view);
        myTextView.setText("This fragment was created: " +myMessage);
        return rootView;
    }

    public void setMessage(String message) {
        this.myMessage = message;
    }
}
