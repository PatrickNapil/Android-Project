package napil.androidapp.Activities;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import napil.androidapp.R;


public class MainActivity extends TabActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources ressources = getResources();
        TabHost tabHost = getTabHost();


        Intent intentAndroid = new Intent().setClass(this, Homepage.class);
        TabSpec tabSpecAndroid = tabHost
                .newTabSpec("Android")
                .setIndicator("", ressources.getDrawable(R.drawable.icon_android_config))
                .setContent(intentAndroid);


        Intent intentApple = new Intent().setClass(this, Profile.class);
        TabSpec tabSpecApple = tabHost
                .newTabSpec("Apple")
                .setIndicator("", ressources.getDrawable(R.drawable.icon_apple_config))
                .setContent(intentApple);


        Intent intentWindows = new Intent().setClass(this, Search.class);
        TabSpec tabSpecWindows = tabHost
                .newTabSpec("Windows")
                .setIndicator("", ressources.getDrawable(R.drawable.icon_windows_config))
                .setContent(intentWindows);


        Intent intentBerry = new Intent().setClass(this, Logout.class);
        TabSpec tabSpecBerry = tabHost
                .newTabSpec("Berry")
                .setIndicator("", ressources.getDrawable(R.drawable.icon_blackberry_config))
                .setContent(intentBerry);

        // add all tabs
        tabHost.addTab(tabSpecAndroid);
        tabHost.addTab(tabSpecApple);
        tabHost.addTab(tabSpecWindows);
        tabHost.addTab(tabSpecBerry);

        //set Windows tab as default (zero based)
        tabHost.setCurrentTab(0);
    }

}