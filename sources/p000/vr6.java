package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: vr6 */
/* compiled from: ToolbarWithTitleAndActionTitleBinding */
public final class vr6 {

    /* renamed from: a */
    public final Toolbar f34991a;

    /* renamed from: b */
    public final MaterialButton f34992b;

    /* renamed from: c */
    public final ImageView f34993c;

    /* renamed from: d */
    public final TextView f34994d;

    public vr6(Toolbar toolbar, MaterialButton materialButton, ImageView imageView, TextView textView) {
        this.f34991a = toolbar;
        this.f34992b = materialButton;
        this.f34993c = imageView;
        this.f34994d = textView;
    }

    /* renamed from: a */
    public static vr6 m53455a(View view) {
        int i = R.id.ivToolbarAction;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.ivToolbarAction);
        if (materialButton != null) {
            i = R.id.ivToolbarBack;
            ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivToolbarBack);
            if (imageView != null) {
                i = R.id.tvToolbarTitle;
                TextView textView = (TextView) ca7.m11819a(view, R.id.tvToolbarTitle);
                if (textView != null) {
                    return new vr6((Toolbar) view, materialButton, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
