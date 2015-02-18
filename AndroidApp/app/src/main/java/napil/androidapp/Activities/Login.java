package napil.androidapp.Activities;

/**
 * Created by Napil on 2/12/2015.
 */
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import napil.androidapp.R;


public class Login extends ActionBarActivity {
    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getSupportActionBar().hide();

        TextView txt1 = (TextView) findViewById(R.id.textView1);
        TextView txt2 = (TextView) findViewById(R.id.textView2);
        user=(EditText) findViewById(R.id.editText1);
        pass=(EditText) findViewById(R.id.editText2);
        txt1.setPaintFlags(txt1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
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


    public void signUp (View view){
        Intent iN = new Intent(this, Signup.class);
        startActivity(iN);
    }

    public void homepage (View view){
        Intent iN = new Intent(this, MainActivity.class);
        startActivity(iN);
    }

    public void retrievePassword (View view){
        Intent iN = new Intent(this, Retrieve.class);
        startActivity(iN);
    }
}

