package napil.androidapp.Activities;

/**
 * Created by Napil on 2/12/2015.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import napil.androidapp.R;


public class Signup extends ActionBarActivity {

    EditText user,name,email, pass,repass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        user=(EditText) findViewById(R.id.editText1);
        name=(EditText) findViewById(R.id.editText2);
        email=(EditText) findViewById(R.id.editText3);
        pass=(EditText) findViewById(R.id.editText4);
        repass=(EditText) findViewById(R.id.editText5);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.signup, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void login (View view){
        Intent iN = new Intent(this, Login.class);
        startActivity(iN);
    }
}
