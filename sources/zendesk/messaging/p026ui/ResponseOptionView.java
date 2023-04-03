package zendesk.messaging.p026ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.zendesk.logger.Logger;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$dimen;
import zendesk.messaging.R$drawable;

/* renamed from: zendesk.messaging.ui.ResponseOptionView */
public class ResponseOptionView extends AppCompatTextView {
    public ResponseOptionView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setBackgroundDrawable(zr0.m31442e(getContext(), R$drawable.zui_background_response_option));
        int e = k37.m75281e(R$attr.colorPrimary, getContext(), R$color.zui_color_primary);
        setTextColor(e);
        Drawable mutate = getBackground().mutate();
        if (mutate instanceof GradientDrawable) {
            ((GradientDrawable) mutate).setStroke((int) getResources().getDimension(R$dimen.zui_cell_response_option_stroke_width), e);
            return;
        }
        Logger.m43087k("ResponseOptionView", "Unable to set stroke on background as background is not of type GradientDrawable", new Object[0]);
    }

    public ResponseOptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ResponseOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
