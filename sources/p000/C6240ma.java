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
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: ma */
/* compiled from: ActivityMainBinding */
public final class C6240ma {

    /* renamed from: a */
    public final ConstraintLayout f31606a;

    /* renamed from: b */
    public final MaterialCheckBox f31607b;

    /* renamed from: c */
    public final MaterialTextView f31608c;

    /* renamed from: d */
    public final ConstraintLayout f31609d;

    /* renamed from: e */
    public final AppCompatTextView f31610e;

    /* renamed from: f */
    public final ImageView f31611f;

    /* renamed from: g */
    public final AppCompatImageView f31612g;

    /* renamed from: h */
    public final AppCompatImageView f31613h;

    /* renamed from: i */
    public final AppCompatImageView f31614i;

    /* renamed from: j */
    public final LinearLayoutCompat f31615j;

    /* renamed from: k */
    public final MaterialButton f31616k;

    /* renamed from: l */
    public final MaterialTextView f31617l;

    /* renamed from: m */
    public final TextView f31618m;

    /* renamed from: n */
    public final TextView f31619n;

    public C6240ma(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, MaterialTextView materialTextView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, LinearLayoutCompat linearLayoutCompat, MaterialButton materialButton, MaterialTextView materialTextView2, TextView textView, TextView textView2) {
        this.f31606a = constraintLayout;
        this.f31607b = materialCheckBox;
        this.f31608c = materialTextView;
        this.f31609d = constraintLayout2;
        this.f31610e = appCompatTextView;
        this.f31611f = imageView;
        this.f31612g = appCompatImageView;
        this.f31613h = appCompatImageView2;
        this.f31614i = appCompatImageView3;
        this.f31615j = linearLayoutCompat;
        this.f31616k = materialButton;
        this.f31617l = materialTextView2;
        this.f31618m = textView;
        this.f31619n = textView2;
    }

    /* renamed from: a */
    public static C6240ma m48197a(View view) {
        View view2 = view;
        int i = R.id.chkTermsAgree;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view2, R.id.chkTermsAgree);
        if (materialCheckBox != null) {
            i = R.id.chkTermsAgreeTC;
            MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.chkTermsAgreeTC);
            if (materialTextView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                i = R.id.create_wallet;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view2, R.id.create_wallet);
                if (appCompatTextView != null) {
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
                                        i = R.id.iv_back;
                                        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.iv_back);
                                        if (materialButton != null) {
                                            i = R.id.openExtWallet;
                                            MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.openExtWallet);
                                            if (materialTextView2 != null) {
                                                i = R.id.textView;
                                                TextView textView = (TextView) ca7.m11819a(view2, R.id.textView);
                                                if (textView != null) {
                                                    i = R.id.textView2;
                                                    TextView textView2 = (TextView) ca7.m11819a(view2, R.id.textView2);
                                                    if (textView2 != null) {
                                                        return new C6240ma(constraintLayout, materialCheckBox, materialTextView, constraintLayout, appCompatTextView, imageView, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayoutCompat, materialButton, materialTextView2, textView, textView2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6240ma m48198c(LayoutInflater layoutInflater) {
        return m48199d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6240ma m48199d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48197a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo45729b() {
        return this.f31606a;
    }
}
