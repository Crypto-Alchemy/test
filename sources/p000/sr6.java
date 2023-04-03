package p000;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: sr6 */
/* compiled from: ToolbarUtils */
public class sr6 {
    /* renamed from: a */
    public static TextView m51889a(Toolbar toolbar) {
        return m51890b(toolbar, toolbar.getSubtitle());
    }

    /* renamed from: b */
    public static TextView m51890b(Toolbar toolbar, CharSequence charSequence) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static TextView m51891c(Toolbar toolbar) {
        return m51890b(toolbar, toolbar.getTitle());
    }
}
