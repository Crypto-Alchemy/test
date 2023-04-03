package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import net.safemoon.androidwallet.R;

/* renamed from: fa */
/* compiled from: ActivityImportPrivateKeyBinding */
public final class C5837fa {

    /* renamed from: a */
    public final ConstraintLayout f28794a;

    /* renamed from: b */
    public final MaterialButton f28795b;

    /* renamed from: c */
    public final MaterialButton f28796c;

    /* renamed from: d */
    public final TextInputEditText f28797d;

    /* renamed from: e */
    public final MaterialCardView f28798e;

    /* renamed from: f */
    public final ImageView f28799f;

    /* renamed from: g */
    public final AppCompatImageView f28800g;

    /* renamed from: h */
    public final AppCompatImageView f28801h;

    /* renamed from: i */
    public final AppCompatImageView f28802i;

    /* renamed from: j */
    public final LinearLayoutCompat f28803j;

    /* renamed from: k */
    public final ScrollView f28804k;

    /* renamed from: l */
    public final TextView f28805l;

    /* renamed from: m */
    public final ba7 f28806m;

    public C5837fa(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, TextInputEditText textInputEditText, MaterialCardView materialCardView, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, LinearLayoutCompat linearLayoutCompat, ScrollView scrollView, TextView textView, ba7 ba7) {
        this.f28794a = constraintLayout;
        this.f28795b = materialButton;
        this.f28796c = materialButton2;
        this.f28797d = textInputEditText;
        this.f28798e = materialCardView;
        this.f28799f = imageView;
        this.f28800g = appCompatImageView;
        this.f28801h = appCompatImageView2;
        this.f28802i = appCompatImageView3;
        this.f28803j = linearLayoutCompat;
        this.f28804k = scrollView;
        this.f28805l = textView;
        this.f28806m = ba7;
    }

    /* renamed from: a */
    public static C5837fa m44239a(View view) {
        View view2 = view;
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.btnConfirm;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.btnConfirm);
            if (materialButton2 != null) {
                i = R.id.editPrivateKey;
                TextInputEditText textInputEditText = (TextInputEditText) ca7.m11819a(view2, R.id.editPrivateKey);
                if (textInputEditText != null) {
                    i = R.id.editPrivateKeyParent;
                    MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view2, R.id.editPrivateKeyParent);
                    if (materialCardView != null) {
                        i = R.id.imageView4;
                        ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.imageView4);
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
                                            i = R.id.scrollView4;
                                            ScrollView scrollView = (ScrollView) ca7.m11819a(view2, R.id.scrollView4);
                                            if (scrollView != null) {
                                                i = R.id.textView;
                                                TextView textView = (TextView) ca7.m11819a(view2, R.id.textView);
                                                if (textView != null) {
                                                    i = R.id.view_barcode_component_layout;
                                                    View a = ca7.m11819a(view2, R.id.view_barcode_component_layout);
                                                    if (a != null) {
                                                        return new C5837fa((ConstraintLayout) view2, materialButton, materialButton2, textInputEditText, materialCardView, imageView, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayoutCompat, scrollView, textView, ba7.m32448a(a));
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
    public static C5837fa m44240c(LayoutInflater layoutInflater) {
        return m44241d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C5837fa m44241d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_import_private_key, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m44239a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo42542b() {
        return this.f28794a;
    }
}
