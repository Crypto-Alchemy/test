package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: l9 */
/* compiled from: ActivityAktBinding */
public final class C6208l9 {

    /* renamed from: a */
    public final ConstraintLayout f31216a;

    /* renamed from: b */
    public final MaterialButton f31217b;

    /* renamed from: c */
    public final MaterialButton f31218c;

    /* renamed from: d */
    public final ImageView f31219d;

    /* renamed from: e */
    public final it2 f31220e;

    /* renamed from: f */
    public final AppCompatTextView f31221f;

    public C6208l9(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, it2 it2, AppCompatTextView appCompatTextView) {
        this.f31216a = constraintLayout;
        this.f31217b = materialButton;
        this.f31218c = materialButton2;
        this.f31219d = imageView;
        this.f31220e = it2;
        this.f31221f = appCompatTextView;
    }

    /* renamed from: a */
    public static C6208l9 m47662a(View view) {
        int i = R.id.btnLogin;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnLogin);
        if (materialButton != null) {
            i = R.id.btnRegister;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnRegister);
            if (materialButton2 != null) {
                i = R.id.imgBack;
                ImageView imageView = (ImageView) ca7.m11819a(view, R.id.imgBack);
                if (imageView != null) {
                    i = R.id.layoutSafeMoonBrand;
                    View a = ca7.m11819a(view, R.id.layoutSafeMoonBrand);
                    if (a != null) {
                        it2 a2 = it2.m45959a(a);
                        i = R.id.orTxt;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.orTxt);
                        if (appCompatTextView != null) {
                            return new C6208l9((ConstraintLayout) view, materialButton, materialButton2, imageView, a2, appCompatTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6208l9 m47663c(LayoutInflater layoutInflater) {
        return m47664d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6208l9 m47664d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_akt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m47662a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo45389b() {
        return this.f31216a;
    }
}
