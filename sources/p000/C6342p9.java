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

/* renamed from: p9 */
/* compiled from: ActivityAktImportWalletOptionBinding */
public final class C6342p9 {

    /* renamed from: a */
    public final ConstraintLayout f32593a;

    /* renamed from: b */
    public final MaterialButton f32594b;

    /* renamed from: c */
    public final ConstraintLayout f32595c;

    /* renamed from: d */
    public final ImageView f32596d;

    /* renamed from: e */
    public final AppCompatImageView f32597e;

    /* renamed from: f */
    public final AppCompatImageView f32598f;

    /* renamed from: g */
    public final AppCompatImageView f32599g;

    /* renamed from: h */
    public final LinearLayoutCompat f32600h;

    /* renamed from: i */
    public final AppCompatTextView f32601i;

    /* renamed from: j */
    public final MaterialTextView f32602j;

    /* renamed from: k */
    public final MaterialTextView f32603k;

    /* renamed from: l */
    public final TextView f32604l;

    /* renamed from: m */
    public final TextView f32605m;

    public C6342p9(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, MaterialTextView materialTextView, MaterialTextView materialTextView2, TextView textView, TextView textView2) {
        this.f32593a = constraintLayout;
        this.f32594b = materialButton;
        this.f32595c = constraintLayout2;
        this.f32596d = imageView;
        this.f32597e = appCompatImageView;
        this.f32598f = appCompatImageView2;
        this.f32599g = appCompatImageView3;
        this.f32600h = linearLayoutCompat;
        this.f32601i = appCompatTextView;
        this.f32602j = materialTextView;
        this.f32603k = materialTextView2;
        this.f32604l = textView;
        this.f32605m = textView2;
    }

    /* renamed from: a */
    public static C6342p9 m49827a(View view) {
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
                                                    return new C6342p9(constraintLayout, materialButton, constraintLayout, imageView, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayoutCompat, appCompatTextView, materialTextView, materialTextView2, textView, textView2);
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
    public static C6342p9 m49828c(LayoutInflater layoutInflater) {
        return m49829d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6342p9 m49829d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_akt_import_wallet_option, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m49827a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo46668b() {
        return this.f32593a;
    }
}
