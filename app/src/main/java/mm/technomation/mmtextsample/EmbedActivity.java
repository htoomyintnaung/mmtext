package mm.technomation.mmtextsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import mm.technomation.mmtext.mmtext;

public class EmbedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embed);
    /*
    your code
     */

        //use mmtext.prepareActivity() on last line of onCreate()
        mmtext.prepareActivity(this, mmtext.TEXT_UNICODE, true, true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_embed, menu);
        MenuItem[] items = {menu.findItem(R.id.action_settings), menu.findItem(R.id.action_about)};
        mmtext.prepareMenuItem(this, mmtext.TEXT_UNICODE, true, true, menu, items);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
