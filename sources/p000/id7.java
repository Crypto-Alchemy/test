package p000;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: id7 */
/* compiled from: ViewNftContactEndLayoutBinding */
public final class id7 {

    /* renamed from: a */
    public final LinearLayoutCompat f29893a;

    /* renamed from: b */
    public final MaterialButton f29894b;

    /* renamed from: c */
    public final MaterialButton f29895c;

    /* renamed from: d */
    public final AppCompatImageView f29896d;

    /* renamed from: e */
    public final ImageView f29897e;

    public id7(LinearLayoutCompat linearLayoutCompat, MaterialButton materialButton, MaterialButton materialButton2, AppCompatImageView appCompatImageView, ImageView imageView) {
        this.f29893a = linearLayoutCompat;
        this.f29894b = materialButton;
        this.f29895c = materialButton2;
        this.f29896d = appCompatImageView;
        this.f29897e = imageView;
    }

    /* renamed from: a */
    public static id7 m45672a(View view) {
        int i = R.id.btnClear;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnClear);
        if (materialButton != null) {
            i = R.id.btnPaste;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnPaste);
            if (materialButton2 != null) {
                i = R.id.btnQr;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.btnQr);
                if (appCompatImageView != null) {
                    i = R.id.btnSelectContact;
                    ImageView imageView = (ImageView) ca7.m11819a(view, R.id.btnSelectContact);
                    if (imageView != null) {
                        return new id7((LinearLayoutCompat) view, materialButton, materialButton2, appCompatImageView, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
