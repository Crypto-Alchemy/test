package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: ga */
/* compiled from: ActivityImportWalletOptionBinding */
public final class C5859ga {

    /* renamed from: a */
    public final ConstraintLayout f29133a;

    /* renamed from: b */
    public final MaterialButton f29134b;

    /* renamed from: c */
    public final ConstraintLayout f29135c;

    /* renamed from: d */
    public final ImageView f29136d;

    /* renamed from: e */
    public final AppCompatImageView f29137e;

    /* renamed from: f */
    public final AppCompatImageView f29138f;

    /* renamed from: g */
    public final AppCompatImageView f29139g;

    /* renamed from: h */
    public final LinearLayoutCompat f29140h;

    /* renamed from: i */
    public final AppCompatTextView f29141i;

    /* renamed from: j */
    public final MaterialTextView f29142j;

    /* renamed from: k */
    public final MaterialTextView f29143k;

    /* renamed from: l */
    public final TextView f29144l;

    /* renamed from: m */
    public final TextView f29145m;

    public C5859ga(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, MaterialTextView materialTextView, MaterialTextView materialTextView2, TextView textView, TextView textView2) {
        this.f29133a = constraintLayout;
        this.f29134b = materialButton;
        this.f29135c = constraintLayout2;
        this.f29136d = imageView;
        this.f29137e = appCompatImageView;
        this.f29138f = appCompatImageView2;
        this.f29139g = appCompatImageView3;
        this.f29140h = linearLayoutCompat;
        this.f29141i = appCompatTextView;
        this.f29142j = materialTextView;
        this.f29143k = materialTextView2;
        this.f29144l = textView;
        this.f29145m = textView2;
    }

    /* renamed from: a */
    public static C5859ga m44669a(View view) {
        View view2 = view;
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnBack);
        if (materialButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view2;
            i = R.id.imageView16;
            ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.imageView16);
            if (imageView != null) {
                i = R.id.img_logo;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.img_logo);
                if (appCompatImageView != null) {
                    i = R.id.img_safemoon;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view2, R.id.img_safemoon);
                    if (appCompatImageView2 != null) {
                        i = R.id.img_wallet;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ca7.m11819a(view2, R.id.img_wallet);
                        if (appCompatImageView3 != null) {
                            i = R.id.img_wallet_parent;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view2, R.id.img_wallet_parent);
                            if (linearLayoutCompat != null) {
                                i = R.id.importPrivateKey;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view2, R.id.importPrivateKey);
                                if (appCompatTextView != null) {
                                    i = R.id.openExtWallet12;
                                    MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.openExtWallet12);
                                    if (materialTextView != null) {
                                        i = R.id.openExtWallet24;
                                        MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.openExtWallet24);
                                        if (materialTextView2 != null) {
                                            i = R.id.textView;
                                            TextView textView = (TextView) ca7.m11819a(view2, R.id.textView);
                                            if (textView != null) {
                                                i = R.id.textView2;
                                                TextView textView2 = (TextView) ca7.m11819a(view2, R.id.textView2);
                                                if (textView2 != null) {
                                                    return new C5859ga(constraintLayout, materialButton, constraintLayout, imageView, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayoutCompat, appCompatTextView, materialTextView, materialTextView2, textView, textView2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C5859ga m44670c(LayoutInflater layoutInflater) {
        return m44671d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C5859ga m44671d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_import_wallet_option, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m44669a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo42857b() {
        return this.f29133a;
    }
}
