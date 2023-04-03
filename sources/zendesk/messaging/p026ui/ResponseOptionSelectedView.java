package zendesk.messaging.p026ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$drawable;

/* renamed from: zendesk.messaging.ui.ResponseOptionSelectedView */
public class ResponseOptionSelectedView extends AppCompatTextView {
    public ResponseOptionSelectedView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setTextColor(zr0.m31440c(getContext(), R$color.zui_color_white_100));
        setBackgroundDrawable(zr0.m31442e(getContext(), R$drawable.zui_background_response_option_selected));
        getBackground().mutate().setColorFilter(new PorterDuffColorFilter(k37.m75281e(R$attr.colorPrimary, getContext(), R$color.zui_color_primary), PorterDuff.Mode.SRC_ATOP));
    }

    public ResponseOptionSelectedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ResponseOptionSelectedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
