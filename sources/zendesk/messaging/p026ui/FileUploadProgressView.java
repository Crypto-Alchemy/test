package zendesk.messaging.p026ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;

/* renamed from: zendesk.messaging.ui.FileUploadProgressView */
public class FileUploadProgressView extends ProgressBar {
    public FileUploadProgressView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setIndeterminate(true);
        getIndeterminateDrawable().setColorFilter(k37.m75281e(R$attr.colorPrimary, getContext(), R$color.zui_color_primary), PorterDuff.Mode.SRC_IN);
    }

    public FileUploadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public FileUploadProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
