//package test.firstapp;
//
//import android.content.Intent;
//import android.support.v7.app.ActionBarActivity;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.TextView;
//
//
//public class FormSubmit extends ActionBarActivity {
//    Intent intent;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_form_submit);
//        intent = getIntent();
////        String fName = intent.getStringExtra(MainActivity.FNAME);
////        TextView textView = new TextView(this);
////        textView.setTextSize(40);
////        textView.setText(fName);
//        setContentView(R.layout.activity_form_submit);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_form_submit, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        switch(id){
//            case R.id.firstName:
//                showText(MainActivity.FNAME);
//                return true;
//            case R.id.lastName:
//                showText(MainActivity.LNAME);
//                return true;
//            case R.id.password:
//                showText(MainActivity.PASSWORD);
//                return true;
//            case R.id.email:
//                showText(MainActivity.EMAIL);
//                return true;
//            case R.id.gender:
//                showText(MainActivity.GENDER);
//                return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    private void showText(String text) {
//        Bundle bundle = getIntent().getExtras();
//        text = bundle.getString(text);
//        TextView textView = (TextView) findViewById(R.id.display);
//        textView.setText(text);
//    }
//}
