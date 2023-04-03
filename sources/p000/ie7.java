package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: ie7 */
/* compiled from: ViewTilEndLayoutBinding */
public final class ie7 {

    /* renamed from: a */
    public final LinearLayoutCompat f29912a;

    /* renamed from: b */
    public final MaterialButton f29913b;

    /* renamed from: c */
    public final MaterialButton f29914c;

    /* renamed from: d */
    public final AppCompatImageView f29915d;

    public ie7(LinearLayoutCompat linearLayoutCompat, MaterialButton materialButton, MaterialButton materialButton2, AppCompatImageView appCompatImageView) {
        this.f29912a = linearLayoutCompat;
        this.f29913b = materialButton;
        this.f29914c = materialButton2;
        this.f29915d = appCompatImageView;
    }

    /* renamed from: a */
    public static ie7 m45706a(View view) {
        int i = R.id.btnClear;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnClear);
        if (materialButton != null) {
            i = R.id.btnPaste;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnPaste);
            if (materialButton2 != null) {
                i = R.id.btnQr;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.btnQr);
                if (appCompatImageView != null) {
                    return new ie7((LinearLayoutCompat) view, materialButton, materialButton2, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
