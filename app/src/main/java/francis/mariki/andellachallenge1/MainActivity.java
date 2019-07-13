package francis.mariki.andellachallenge1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
public static final String TAG=MainActivity.class.getSimpleName();
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      launchProfileActivity();
      launchACAboutActivity();
    }

    private void launchProfileActivity() {
        Button profileButton= findViewById(R.id.profile_button);
        profileButton.setOnClickListener((v)->{
            Log.v(TAG,"Profile Button i have been clicked");
            intent=new Intent(MainActivity.this,MyProfile.class);
            startActivity(intent);
        });



    }

    private void launchACAboutActivity() {
        Button aboutButton=findViewById(R.id.about_acl_button);
        aboutButton.setOnClickListener((v)->{
            Log.v(TAG,"About button clicked");
            intent=new Intent(MainActivity.this,AboutAndela.class);
            startActivity(intent);
        });

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
}
