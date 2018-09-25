package mm.technomation.mmtext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by myatminsoe on 9/27/15.
 */
public class MMEditText extends EditText {

    public MMEditText(final Context context) {
        super(context);
        final Typeface tf = Typeface.createFromAsset(context.getAssets(), "mymm.ttf");
        this.setHint(mmtext.processText(getHint().toString(), mmtext.TEXT_UNICODE, true, false));
        this.setTypeface(tf);
        this.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    MMEditText.this.setTypeface(null);
                } else {
                    MMEditText.this.setTypeface(tf);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public MMEditText(final Context context, AttributeSet attrs) {
        super(context, attrs);
        final Typeface tf = Typeface.createFromAsset(context.getAssets(), "mymm.ttf");
        this.setHint(mmtext.processText(getHint().toString(), mmtext.TEXT_UNICODE, true, false));
        this.setTypeface(tf);
        this.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    MMEditText.this.setTypeface(null);

                } else {
                    MMEditText.this.setTypeface(tf);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public MMEditText(final Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        final Typeface tf = Typeface.createFromAsset(context.getAssets(), "mymm.ttf");
        this.setHint(mmtext.processText(getHint().toString(), mmtext.TEXT_UNICODE, true, false));
        this.setTypeface(tf);
        this.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    MMEditText.this.setTypeface(null);
                } else {
                    MMEditText.this.setTypeface(tf);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void setMyanmarHint(String st) {
        setHint(mmtext.processText(st, mmtext.TEXT_UNICODE, true, true));
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
