package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import net.safemoon.androidwallet.R;

/* renamed from: r9 */
/* compiled from: ActivityAktResetPasswordBinding */
public final class C6431r9 {

    /* renamed from: a */
    public final ConstraintLayout f33338a;

    /* renamed from: b */
    public final MaterialButton f33339b;

    /* renamed from: c */
    public final LinearLayoutCompat f33340c;

    /* renamed from: d */
    public final ConstraintLayout f33341d;

    /* renamed from: e */
    public final TextInputLayout f33342e;

    /* renamed from: f */
    public final TextInputLayout f33343f;

    /* renamed from: g */
    public final TextInputLayout f33344g;

    /* renamed from: h */
    public final ImageView f33345h;

    /* renamed from: i */
    public final ImageView f33346i;

    /* renamed from: j */
    public final ImageView f33347j;

    /* renamed from: k */
    public final TextView f33348k;

    /* renamed from: l */
    public final TextView f33349l;

    /* renamed from: m */
    public final c36 f33350m;

    /* renamed from: n */
    public final TextView f33351n;

    /* renamed from: o */
    public final TextView f33352o;

    /* renamed from: p */
    public final TextView f33353p;

    /* renamed from: q */
    public final TextView f33354q;

    /* renamed from: r */
    public final TextView f33355r;

    /* renamed from: s */
    public final TextView f33356s;

    /* renamed from: t */
    public final TextView f33357t;

    public C6431r9(ConstraintLayout constraintLayout, MaterialButton materialButton, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, c36 c36, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.f33338a = constraintLayout;
        this.f33339b = materialButton;
        this.f33340c = linearLayoutCompat;
        this.f33341d = constraintLayout2;
        this.f33342e = textInputLayout;
        this.f33343f = textInputLayout2;
        this.f33344g = textInputLayout3;
        this.f33345h = imageView;
        this.f33346i = imageView2;
        this.f33347j = imageView3;
        this.f33348k = textView;
        this.f33349l = textView2;
        this.f33350m = c36;
        this.f33351n = textView3;
        this.f33352o = textView4;
        this.f33353p = textView5;
        this.f33354q = textView6;
        this.f33355r = textView7;
        this.f33356s = textView8;
        this.f33357t = textView9;
    }

    /* renamed from: a */
    public static C6431r9 m50989a(View view) {
        View view2 = view;
        int i = R.id.btnSave;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnSave);
        if (materialButton != null) {
            i = R.id.content_layout;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view2, R.id.content_layout);
            if (linearLayoutCompat != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                i = R.id.et_confirm_password;
                TextInputLayout textInputLayout = (TextInputLayout) ca7.m11819a(view2, R.id.et_confirm_password);
                if (textInputLayout != null) {
                    i = R.id.et_password;
                    TextInputLayout textInputLayout2 = (TextInputLayout) ca7.m11819a(view2, R.id.et_password);
                    if (textInputLayout2 != null) {
                        i = R.id.et_username;
                        TextInputLayout textInputLayout3 = (TextInputLayout) ca7.m11819a(view2, R.id.et_username);
                        if (textInputLayout3 != null) {
                            i = R.id.iv_1;
                            ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.iv_1);
                            if (imageView != null) {
                                i = R.id.iv_2;
                                ImageView imageView2 = (ImageView) ca7.m11819a(view2, R.id.iv_2);
                                if (imageView2 != null) {
                                    i = R.id.iv_4;
                                    ImageView imageView3 = (ImageView) ca7.m11819a(view2, R.id.iv_4);
                                    if (imageView3 != null) {
                                        i = R.id.min_char;
                                        TextView textView = (TextView) ca7.m11819a(view2, R.id.min_char);
                                        if (textView != null) {
                                            i = R.id.textView21;
                                            TextView textView2 = (TextView) ca7.m11819a(view2, R.id.textView21);
                                            if (textView2 != null) {
                                                i = R.id.toolbar;
                                                View a = ca7.m11819a(view2, R.id.toolbar);
                                                if (a != null) {
                                                    c36 a2 = c36.m32847a(a);
                                                    i = R.id.tv_not;
                                                    TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tv_not);
                                                    if (textView3 != null) {
                                                        i = R.id.tv_number;
                                                        TextView textView4 = (TextView) ca7.m11819a(view2, R.id.tv_number);
                                                        if (textView4 != null) {
                                                            i = R.id.tv_special;
                                                            TextView textView5 = (TextView) ca7.m11819a(view2, R.id.tv_special);
                                                            if (textView5 != null) {
                                                                i = R.id.txt_confirm_password_header;
                                                                TextView textView6 = (TextView) ca7.m11819a(view2, R.id.txt_confirm_password_header);
                                                                if (textView6 != null) {
                                                                    i = R.id.txt_password_header;
                                                                    TextView textView7 = (TextView) ca7.m11819a(view2, R.id.txt_password_header);
                                                                    if (textView7 != null) {
                                                                        i = R.id.txt_username_header;
                                                                        TextView textView8 = (TextView) ca7.m11819a(view2, R.id.txt_username_header);
                                                                        if (textView8 != null) {
                                                                            i = R.id.txt_username_invalid;
                                                                            TextView textView9 = (TextView) ca7.m11819a(view2, R.id.txt_username_invalid);
                                                                            if (textView9 != null) {
                                                                                return new C6431r9(constraintLayout, materialButton, linearLayoutCompat, constraintLayout, textInputLayout, textInputLayout2, textInputLayout3, imageView, imageView2, imageView3, textView, textView2, a2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6431r9 m50990c(LayoutInflater layoutInflater) {
        return m50991d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6431r9 m50991d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_akt_reset_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m50989a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo47348b() {
        return this.f33338a;
    }
}
