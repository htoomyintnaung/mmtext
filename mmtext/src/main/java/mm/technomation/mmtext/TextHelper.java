package mm.technomation.mmtext;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by myatminsoe on 9/27/15.
 */
public class TextHelper {

  private static Typeface typeface = null;

  public static void setTypeface(Context context, TextView textview) {
    if (TextHelper.typeface == null) {
      TextHelper.typeface = Typeface.createFromAsset(context.getAssets(), "mymm.ttf");
    }
    textview.setText(mmtext.processText(textview.getText().toString(), mmtext.TEXT_UNICODE, true, true));
    textview.setTypeface(typeface);
  }
}
