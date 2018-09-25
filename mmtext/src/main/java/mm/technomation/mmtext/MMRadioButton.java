package mm.technomation.mmtext;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RadioButton;

/**
 *Created by khunzohn on 2/26/16.
 */
public class MMRadioButton extends RadioButton {
    public MMRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TextHelper.setTypeface(context, this);
    }

    public MMRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TextHelper.setTypeface(context, this);
    }

    public MMRadioButton(Context context) {
        super(context);
        TextHelper.setTypeface(context, this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public CharSequence getMyanmarText() {
        return mmtext.getMMText(this);
    }

    public void setMyanmarText(String text) {
        setText(mmtext.processText(text, mmtext.TEXT_UNICODE, true, true));
    }
}
