package test.firstapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Shashank on 6/30/2015.
 */
public class Form extends Fragment {
    Bundle bundle;

    public final static String FNAME = "test.firstapp.FNAME";
    public final static String LNAME = "test.firstapp.LNAME";
    public final static String EMAIL = "test.firstapp.EMAIL";
    public final static String PASSWORD = "test.firstapp.PASSWORD";
    public final static String GENDER = "test.firstapp.GENDER";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.form, container, false);
    }

    public void onSubmit(View view){
        bundle = new Bundle();

        EditText editText = (EditText) getView().findViewById(R.id.firstName);
        String temp = editText.getText().toString();
        bundle.putString(FNAME, temp);

        editText = (EditText) getView().findViewById(R.id.lastName);
        temp = editText.getText().toString();
        bundle.putString(LNAME, temp);

        editText = (EditText) getView().findViewById(R.id.email);
        temp = editText.getText().toString();
        bundle.putString(EMAIL, temp);

        editText = (EditText) getView().findViewById(R.id.password);
        temp = editText.getText().toString();
        bundle.putString(PASSWORD, temp);

        RadioGroup rg = (RadioGroup) getView().findViewById(R.id.gender);
        int selectedId = rg.getCheckedRadioButtonId();
        temp = ((RadioButton) getView().findViewById(selectedId)).getText().toString();
        bundle.putString(GENDER, temp);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main, fragmentManager.findFragmentById(R.id.check));
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
