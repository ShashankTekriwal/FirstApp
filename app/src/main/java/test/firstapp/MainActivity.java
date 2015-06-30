package test.firstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends ActionBarActivity {

    public final static String FNAME = "test.firstapp.FNAME";
    public final static String LNAME = "test.firstapp.LNAME";
    public final static String EMAIL = "test.firstapp.EMAIL";
    public final static String PASSWORD = "test.firstapp.PASSWORD";
    public final static String GENDER = "test.firstapp.GENDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSubmit(View view){
        Intent intent = new Intent(this, FormSubmit.class);
        Bundle bundle = new Bundle();

        EditText editText = (EditText) findViewById(R.id.firstName);
        String temp = editText.getText().toString();
        bundle.putString(FNAME, temp);

        editText = (EditText) findViewById(R.id.lastName);
        temp = editText.getText().toString();
        bundle.putString(LNAME, temp);

        editText = (EditText) findViewById(R.id.email);
        temp = editText.getText().toString();
        bundle.putString(EMAIL, temp);

        editText = (EditText) findViewById(R.id.password);
        temp = editText.getText().toString();
        bundle.putString(PASSWORD, temp);

        RadioGroup rg = (RadioGroup) findViewById(R.id.gender);
        int selectedId = rg.getCheckedRadioButtonId();
        temp = ((RadioButton) findViewById(selectedId)).getText().toString();
        bundle.putString(GENDER,temp);

        intent.putExtras(bundle);
        startActivity(intent);
    }
}
