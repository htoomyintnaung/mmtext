package mm.technomation.mmtextsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import mm.technomation.mmtext.MMToast;
import mm.technomation.mmtext.mmtext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llViewGroup = (LinearLayout) findViewById(R.id.linearlayout_mmtextviewgroup);
        mmtext.prepareViewGroup(this, llViewGroup, mmtext.TEXT_UNICODE, true, true);

        Button mButton = (Button) findViewById(R.id.btnStart);
        mmtext.prepareView(this, mButton, mmtext.TEXT_UNICODE, true, true);
    }

    public void onButtonClicked(View v) {
        startActivity(new Intent(getBaseContext(), EmbedActivity.class));
    }

    public void showMMToast(View view) {
        String text = "မင်္ဂလာပါ ကျေးဇူးတင်ပါတယ်";
        MMToast.makeMMText(this, text, Toast.LENGTH_LONG).show();
    }
}
