package p000;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: ba7 */
/* compiled from: ViewBarcodeComponentLayoutBinding */
public final class ba7 {

    /* renamed from: a */
    public final RelativeLayout f21211a;

    /* renamed from: b */
    public final MaterialButton f21212b;

    /* renamed from: c */
    public final MaterialButton f21213c;

    /* renamed from: d */
    public final AppCompatImageView f21214d;

    public ba7(RelativeLayout relativeLayout, MaterialButton materialButton, MaterialButton materialButton2, AppCompatImageView appCompatImageView) {
        this.f21211a = relativeLayout;
        this.f21212b = materialButton;
        this.f21213c = materialButton2;
        this.f21214d = appCompatImageView;
    }

    /* renamed from: a */
    public static ba7 m32448a(View view) {
        int i = R.id.btnClear;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnClear);
        if (materialButton != null) {
            i = R.id.btnPaste;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnPaste);
            if (materialButton2 != null) {
                i = R.id.btnQr;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.btnQr);
                if (appCompatImageView != null) {
                    return new ba7((RelativeLayout) view, materialButton, materialButton2, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
