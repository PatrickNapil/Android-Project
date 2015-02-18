package napil.androidapp.Activities;

/**
 * Created by Napil on 2/12/2015.
 */
import android.app.ActionBar;
import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.view.MenuInflater;

import napil.androidapp.R;


public class Homepage extends ListActivity {

    String val[]={"Star Wars: The Force Awakens", "Avengers: Age of Ultron", "Jurassic World", "The SpongeBob Movie: Sponge out of Water", "Taken 3", "American Sniper", "Guardians of the Galaxy", "Captain American: Winter Solder", "Whiplash", "The Lego Movie"};

    String msg[]={"Action, Adventure, Fantasy", "Action, Adventure, Fantasy", "Action, Adventure, Sci-fi", "Animation, Adventure, Comedy", "Action, Thriller", "Action, Briography, Drama", "Action, Adventure, Sci-fi", "Action, Adventure, Sci-fi", "Drama, Music", "Animation, Adventure, Comedy"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.list);



        OwnAdapter ow = new OwnAdapter(this, val, msg);
        View header = getLayoutInflater().inflate(R.layout.header, null);
        View header2 = getLayoutInflater().inflate(R.layout.header2, null);
        ListView lv = getListView();

        lv.addHeaderView(header);
        lv.addHeaderView(header2);
        setListAdapter(ow);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_page, menu);
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




}
