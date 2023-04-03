package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import net.safemoon.androidwallet.R;

/* renamed from: qa */
/* compiled from: ActivityRegisterBinding */
public final class C6398qa {

    /* renamed from: a */
    public final ConstraintLayout f33005a;

    /* renamed from: b */
    public final MaterialButton f33006b;

    /* renamed from: c */
    public final LinearLayout f33007c;

    /* renamed from: d */
    public final ConstraintLayout f33008d;

    /* renamed from: e */
    public final TextInputLayout f33009e;

    /* renamed from: f */
    public final TextInputLayout f33010f;

    /* renamed from: g */
    public final TextInputLayout f33011g;

    /* renamed from: h */
    public final ImageView f33012h;

    /* renamed from: i */
    public final ImageView f33013i;

    /* renamed from: j */
    public final ImageView f33014j;

    /* renamed from: k */
    public final TextView f33015k;

    /* renamed from: l */
    public final TextView f33016l;

    /* renamed from: m */
    public final c36 f33017m;

    /* renamed from: n */
    public final TextView f33018n;

    /* renamed from: o */
    public final TextView f33019o;

    /* renamed from: p */
    public final TextView f33020p;

    /* renamed from: q */
    public final TextView f33021q;

    /* renamed from: r */
    public final AppCompatTextView f33022r;

    /* renamed from: s */
    public final TextView f33023s;

    /* renamed from: t */
    public final TextView f33024t;

    /* renamed from: u */
    public final TextView f33025u;

    /* renamed from: v */
    public final TextView f33026v;

    public C6398qa(ConstraintLayout constraintLayout, MaterialButton materialButton, LinearLayout linearLayout, ConstraintLayout constraintLayout2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, c36 c36, TextView textView3, TextView textView4, TextView textView5, TextView textView6, AppCompatTextView appCompatTextView, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        this.f33005a = constraintLayout;
        this.f33006b = materialButton;
        this.f33007c = linearLayout;
        this.f33008d = constraintLayout2;
        this.f33009e = textInputLayout;
        this.f33010f = textInputLayout2;
        this.f33011g = textInputLayout3;
        this.f33012h = imageView;
        this.f33013i = imageView2;
        this.f33014j = imageView3;
        this.f33015k = textView;
        this.f33016l = textView2;
        this.f33017m = c36;
        this.f33018n = textView3;
        this.f33019o = textView4;
        this.f33020p = textView5;
        this.f33021q = textView6;
        this.f33022r = appCompatTextView;
        this.f33023s = textView7;
        this.f33024t = textView8;
        this.f33025u = textView9;
        this.f33026v = textView10;
    }

    /* renamed from: a */
    public static C6398qa m50485a(View view) {
        View view2 = view;
        int i = R.id.btnContinue;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnContinue);
        if (materialButton != null) {
            i = R.id.content_layout;
            LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.content_layout);
            if (linearLayout != null) {
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
                                                                    i = R.id.txt_email;
                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view2, R.id.txt_email);
                                                                    if (appCompatTextView != null) {
                                                                        i = R.id.txt_email_header;
                                                                        TextView textView7 = (TextView) ca7.m11819a(view2, R.id.txt_email_header);
                                                                        if (textView7 != null) {
                                                                            i = R.id.txt_password_header;
                                                                            TextView textView8 = (TextView) ca7.m11819a(view2, R.id.txt_password_header);
                                                                            if (textView8 != null) {
                                                                                i = R.id.txt_username_header;
                                                                                TextView textView9 = (TextView) ca7.m11819a(view2, R.id.txt_username_header);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.txt_username_invalid;
                                                                                    TextView textView10 = (TextView) ca7.m11819a(view2, R.id.txt_username_invalid);
                                                                                    if (textView10 != null) {
                                                                                        return new C6398qa(constraintLayout, materialButton, linearLayout, constraintLayout, textInputLayout, textInputLayout2, textInputLayout3, imageView, imageView2, imageView3, textView, textView2, a2, textView3, textView4, textView5, textView6, appCompatTextView, textView7, textView8, textView9, textView10);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6398qa m50486c(LayoutInflater layoutInflater) {
        return m50487d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6398qa m50487d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_register, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m50485a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo47037b() {
        return this.f33005a;
    }
}
