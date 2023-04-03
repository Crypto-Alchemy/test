package p000;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: nb4 */
/* compiled from: NotificationHistoryItemBinding */
public final class nb4 {

    /* renamed from: a */
    public final LinearLayout f32079a;

    /* renamed from: b */
    public final CheckBox f32080b;

    /* renamed from: c */
    public final ConstraintLayout f32081c;

    /* renamed from: d */
    public final ImageView f32082d;

    /* renamed from: e */
    public final ImageView f32083e;

    /* renamed from: f */
    public final TextView f32084f;

    /* renamed from: g */
    public final TextView f32085g;

    /* renamed from: h */
    public final TextView f32086h;

    public nb4(LinearLayout linearLayout, CheckBox checkBox, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        this.f32079a = linearLayout;
        this.f32080b = checkBox;
        this.f32081c = constraintLayout;
        this.f32082d = imageView;
        this.f32083e = imageView2;
        this.f32084f = textView;
        this.f32085g = textView2;
        this.f32086h = textView3;
    }

    /* renamed from: a */
    public static nb4 m48718a(View view) {
        int i = R.id.checkbox;
        CheckBox checkBox = (CheckBox) ca7.m11819a(view, R.id.checkbox);
        if (checkBox != null) {
            i = R.id.itemParent;
            ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view, R.id.itemParent);
            if (constraintLayout != null) {
                i = R.id.ivArrow;
                ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivArrow);
                if (imageView != null) {
                    i = R.id.iv_status;
                    ImageView imageView2 = (ImageView) ca7.m11819a(view, R.id.iv_status);
                    if (imageView2 != null) {
                        i = R.id.tvNotificationText;
                        TextView textView = (TextView) ca7.m11819a(view, R.id.tvNotificationText);
                        if (textView != null) {
                            i = R.id.tvNotificationTime;
                            TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvNotificationTime);
                            if (textView2 != null) {
                                i = R.id.tvNotificationTitle;
                                TextView textView3 = (TextView) ca7.m11819a(view, R.id.tvNotificationTitle);
                                if (textView3 != null) {
                                    return new nb4((LinearLayout) view, checkBox, constraintLayout, imageView, imageView2, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public LinearLayout mo46049b() {
        return this.f32079a;
    }
}
