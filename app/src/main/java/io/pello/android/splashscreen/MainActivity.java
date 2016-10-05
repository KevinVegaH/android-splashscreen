package io.pello.android.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // From Nexus 5.x onwards ()
        getSupportActionBar().hide();

        /**
         * Other Alternative, via Manifest
         <activity android:name=".MainActivity"
         android:label="@string/app_name"
         android:theme="@android:style/Theme.NoTitleBar.Fullscreen"/>

         or via values/styles.xml

         <item name="android:windowNoTitle">true</item>
         <item name="android:windowFullscreen">true</item>

         */


        setContentView(R.layout.activity_main);
    }

    /**
     * starts default full screen activity
     * @param v
     */
    public void openDefaultFull (View v) {
        Intent intent = new Intent(MainActivity.this, DefaultFullscreenActivity.class);
        startActivity(intent);
    }
}
