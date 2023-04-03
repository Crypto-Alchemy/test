package zendesk.support.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.slf4j.Marker;
import zendesk.support.UiUtils;

public class ViewAttachmentsIndicator extends FrameLayout {
    private static final int COUNT_THRESHOLD = 9;
    private static final String COUNT_THRESHOLD_TEXT = (String.valueOf(9) + Marker.ANY_NON_NULL_MARKER);
    private int attachmentsCount;
    private View attachmentsIndicatorBottomBorder;
    private TextView attachmentsIndicatorCounter;
    private ImageView attachmentsIndicatorIcon;
    private int colorActive;
    private int colorInactive;

    public ViewAttachmentsIndicator(Context context) {
        super(context);
        init(context);
    }

    public void enableActiveState(boolean z) {
        int i;
        Drawable mutate = ij1.m19659r(this.attachmentsIndicatorIcon.getDrawable()).mutate();
        if (z) {
            i = this.colorActive;
        } else {
            i = this.colorInactive;
        }
        ij1.m19655n(mutate, i);
        this.attachmentsIndicatorIcon.invalidate();
    }

    public int getAttachmentsCount() {
        return this.attachmentsCount;
    }

    public void init(Context context) {
        View.inflate(context, g45.zs_view_request_attachments_indicator, this);
        if (!isInEditMode()) {
            this.attachmentsIndicatorIcon = (ImageView) findViewById(l35.attachments_indicator_icon);
            this.attachmentsIndicatorBottomBorder = findViewById(l35.attachments_indicator_bottom_border);
            this.attachmentsIndicatorCounter = (TextView) findViewById(l35.attachments_indicator_counter);
            this.colorActive = UiUtils.themeAttributeToColor(l15.colorPrimary, context, y15.zs_request_fallback_color_primary);
            this.colorInactive = UiUtils.resolveColor(y15.zs_request_attachment_indicator_color_inactive, context);
            ((GradientDrawable) ((LayerDrawable) this.attachmentsIndicatorCounter.getBackground()).findDrawableByLayerId(l35.inner_circle)).setColor(this.colorActive);
            getContext().getString(o45.zs_request_attachment_indicator_accessibility);
            setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), getAttachmentsCount()));
        }
    }

    public void reset() {
        setCounterVisible(false);
        setAttachmentsCount(0);
        setBottomBorderVisible(false);
        enableActiveState(false);
    }

    public void setAttachmentsCount(int i) {
        int i2;
        String str;
        boolean z;
        this.attachmentsCount = i;
        if (i > 9) {
            i2 = m25.zs_request_attachment_indicator_counter_width_double_digit;
        } else {
            i2 = m25.zs_request_attachment_indicator_counter_width_single_digit;
        }
        ViewGroup.LayoutParams layoutParams = this.attachmentsIndicatorCounter.getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(i2);
        this.attachmentsIndicatorCounter.setLayoutParams(layoutParams);
        TextView textView = this.attachmentsIndicatorCounter;
        if (i > 9) {
            str = COUNT_THRESHOLD_TEXT;
        } else {
            str = String.valueOf(i);
        }
        textView.setText(str);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        setCounterVisible(z);
        setBottomBorderVisible(z);
        enableActiveState(z);
        setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), getAttachmentsCount()));
    }

    public void setBottomBorderVisible(boolean z) {
        int i;
        View view = this.attachmentsIndicatorBottomBorder;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
    }

    public void setCounterVisible(boolean z) {
        int i;
        TextView textView = this.attachmentsIndicatorCounter;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        textView.setVisibility(i);
    }

    public ViewAttachmentsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ViewAttachmentsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public ViewAttachmentsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
