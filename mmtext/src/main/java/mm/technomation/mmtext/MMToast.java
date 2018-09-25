package mm.technomation.mmtext;

import android.content.Context;
import android.support.annotation.IntDef;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by khunzohn on 2/26/16.
 */
public class MMToast extends Toast {

    public MMToast(Context context) {
        super(context);
    }

    /**
     * Make a standard myanmar toast that just contains a text view.
     *
     * @param context  The context to use.  Usually your {@link android.app.Application}
     *                 or {@link android.app.Activity} object.
     * @param text     The text to show.  Can be formatted text.Use unicode only in case of myanmar text.
     * @param duration How long to display the message.  Either {@link #LENGTH_SHORT} or
     *                 {@link #LENGTH_LONG}
     */
    public static Toast makeMMText(Context context, CharSequence text, @Duration int duration) {
        Toast result = new Toast(context);
        LayoutInflater inflate = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflate.inflate(R.layout.transient_notification, null);
        TextView tv = (TextView) v.findViewById(R.id.message);
        TextHelper.setTypeface(context, tv);
        tv.setText(mmtext.processText(text.toString(), mmtext.TEXT_UNICODE, true, true));
        result.setView(v);
        result.setDuration(duration);
        return result;
    }

    @IntDef({LENGTH_SHORT, LENGTH_LONG})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }
}
