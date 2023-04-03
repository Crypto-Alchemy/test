package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: o9 */
/* compiled from: ActivityAktImportExistingWalletsBinding */
public final class C6309o9 {

    /* renamed from: a */
    public final ConstraintLayout f32301a;

    /* renamed from: b */
    public final MaterialButton f32302b;

    /* renamed from: c */
    public final MaterialButton f32303c;

    /* renamed from: d */
    public final MaterialButton f32304d;

    /* renamed from: e */
    public final MaterialCheckBox f32305e;

    /* renamed from: f */
    public final LinearLayout f32306f;

    /* renamed from: g */
    public final LinearLayoutCompat f32307g;

    /* renamed from: h */
    public final AppCompatImageView f32308h;

    /* renamed from: i */
    public final c36 f32309i;

    /* renamed from: j */
    public final TextView f32310j;

    /* renamed from: k */
    public final TextView f32311k;

    /* renamed from: l */
    public final TextView f32312l;

    /* renamed from: m */
    public final TextView f32313m;

    public C6309o9(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialCheckBox materialCheckBox, LinearLayout linearLayout, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, c36 c36, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f32301a = constraintLayout;
        this.f32302b = materialButton;
        this.f32303c = materialButton2;
        this.f32304d = materialButton3;
        this.f32305e = materialCheckBox;
        this.f32306f = linearLayout;
        this.f32307g = linearLayoutCompat;
        this.f32308h = appCompatImageView;
        this.f32309i = c36;
        this.f32310j = textView;
        this.f32311k = textView2;
        this.f32312l = textView3;
        this.f32313m = textView4;
    }

    /* renamed from: a */
    public static C6309o9 m49216a(View view) {
        View view2 = view;
        int i = R.id.btnContinue;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnContinue);
        if (materialButton != null) {
            i = R.id.btnNo;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.btnNo);
            if (materialButton2 != null) {
                i = R.id.btnYes;
                MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view2, R.id.btnYes);
                if (materialButton3 != null) {
                    i = R.id.chkTermsAgree;
                    MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view2, R.id.chkTermsAgree);
                    if (materialCheckBox != null) {
                        i = R.id.content_layout;
                        LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.content_layout);
                        if (linearLayout != null) {
                            i = R.id.contentWrapper;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view2, R.id.contentWrapper);
                            if (linearLayoutCompat != null) {
                                i = R.id.img_logo;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.img_logo);
                                if (appCompatImageView != null) {
                                    i = R.id.toolbar;
                                    View a = ca7.m11819a(view2, R.id.toolbar);
                                    if (a != null) {
                                        c36 a2 = c36.m32847a(a);
                                        i = R.id.tvExistingWalletsHeader;
                                        TextView textView = (TextView) ca7.m11819a(view2, R.id.tvExistingWalletsHeader);
                                        if (textView != null) {
                                            i = R.id.tvLoginConfirm;
                                            TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvLoginConfirm);
                                            if (textView2 != null) {
                                                i = R.id.tvLoginNote;
                                                TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvLoginNote);
                                                if (textView3 != null) {
                                                    i = R.id.tvNoticeContent;
                                                    TextView textView4 = (TextView) ca7.m11819a(view2, R.id.tvNoticeContent);
                                                    if (textView4 != null) {
                                                        return new C6309o9((ConstraintLayout) view2, materialButton, materialButton2, materialButton3, materialCheckBox, linearLayout, linearLayoutCompat, appCompatImageView, a2, textView, textView2, textView3, textView4);
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
    public static C6309o9 m49217c(LayoutInflater layoutInflater) {
        return m49218d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6309o9 m49218d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_akt_import_existing_wallets, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m49216a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo46356b() {
        return this.f32301a;
    }
}
