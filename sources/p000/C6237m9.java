package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import net.safemoon.androidwallet.R;

/* renamed from: m9 */
/* compiled from: ActivityAktChangePasswordBinding */
public final class C6237m9 {

    /* renamed from: a */
    public final ConstraintLayout f31550a;

    /* renamed from: b */
    public final AppCompatButton f31551b;

    /* renamed from: c */
    public final ConstraintLayout f31552c;

    /* renamed from: d */
    public final ConstraintLayout f31553d;

    /* renamed from: e */
    public final MaterialCardView f31554e;

    /* renamed from: f */
    public final MaterialCardView f31555f;

    /* renamed from: g */
    public final AppCompatEditText f31556g;

    /* renamed from: h */
    public final AppCompatEditText f31557h;

    /* renamed from: i */
    public final AppCompatEditText f31558i;

    /* renamed from: j */
    public final bf3 f31559j;

    /* renamed from: k */
    public final TextInputLayout f31560k;

    /* renamed from: l */
    public final TextInputLayout f31561l;

    /* renamed from: m */
    public final TextInputLayout f31562m;

    /* renamed from: n */
    public final b36 f31563n;

    /* renamed from: o */
    public final TextView f31564o;

    /* renamed from: p */
    public final TextView f31565p;

    /* renamed from: q */
    public final TextView f31566q;

    /* renamed from: r */
    public final TextView f31567r;

    public C6237m9(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, MaterialCardView materialCardView, MaterialCardView materialCardView2, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, bf3 bf3, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, b36 b36, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f31550a = constraintLayout;
        this.f31551b = appCompatButton;
        this.f31552c = constraintLayout2;
        this.f31553d = constraintLayout3;
        this.f31554e = materialCardView;
        this.f31555f = materialCardView2;
        this.f31556g = appCompatEditText;
        this.f31557h = appCompatEditText2;
        this.f31558i = appCompatEditText3;
        this.f31559j = bf3;
        this.f31560k = textInputLayout;
        this.f31561l = textInputLayout2;
        this.f31562m = textInputLayout3;
        this.f31563n = b36;
        this.f31564o = textView;
        this.f31565p = textView2;
        this.f31566q = textView3;
        this.f31567r = textView4;
    }

    /* renamed from: a */
    public static C6237m9 m48174a(View view) {
        View view2 = view;
        int i = R.id.btnSave;
        AppCompatButton appCompatButton = (AppCompatButton) ca7.m11819a(view2, R.id.btnSave);
        if (appCompatButton != null) {
            i = R.id.content_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.content_layout);
            if (constraintLayout != null) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view2;
                i = R.id.cvCurrentPassword;
                MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view2, R.id.cvCurrentPassword);
                if (materialCardView != null) {
                    i = R.id.cvNewPassword;
                    MaterialCardView materialCardView2 = (MaterialCardView) ca7.m11819a(view2, R.id.cvNewPassword);
                    if (materialCardView2 != null) {
                        i = R.id.etConfirmNewPassword;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) ca7.m11819a(view2, R.id.etConfirmNewPassword);
                        if (appCompatEditText != null) {
                            i = R.id.etNewPassword;
                            AppCompatEditText appCompatEditText2 = (AppCompatEditText) ca7.m11819a(view2, R.id.etNewPassword);
                            if (appCompatEditText2 != null) {
                                i = R.id.etUsername;
                                AppCompatEditText appCompatEditText3 = (AppCompatEditText) ca7.m11819a(view2, R.id.etUsername);
                                if (appCompatEditText3 != null) {
                                    i = R.id.lPasswordRequirements;
                                    View a = ca7.m11819a(view2, R.id.lPasswordRequirements);
                                    if (a != null) {
                                        bf3 a2 = bf3.m32510a(a);
                                        i = R.id.tilConfirmNewPassword;
                                        TextInputLayout textInputLayout = (TextInputLayout) ca7.m11819a(view2, R.id.tilConfirmNewPassword);
                                        if (textInputLayout != null) {
                                            i = R.id.tilNewPassword;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ca7.m11819a(view2, R.id.tilNewPassword);
                                            if (textInputLayout2 != null) {
                                                i = R.id.tilUsername;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) ca7.m11819a(view2, R.id.tilUsername);
                                                if (textInputLayout3 != null) {
                                                    i = R.id.toolbar;
                                                    View a3 = ca7.m11819a(view2, R.id.toolbar);
                                                    if (a3 != null) {
                                                        b36 a4 = b36.m32346a(a3);
                                                        i = R.id.tvConfirmNewPassTitle;
                                                        TextView textView = (TextView) ca7.m11819a(view2, R.id.tvConfirmNewPassTitle);
                                                        if (textView != null) {
                                                            i = R.id.tvNewPassTitle;
                                                            TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvNewPassTitle);
                                                            if (textView2 != null) {
                                                                i = R.id.tvUsernameTitle;
                                                                TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvUsernameTitle);
                                                                if (textView3 != null) {
                                                                    i = R.id.txt_username_invalid;
                                                                    TextView textView4 = (TextView) ca7.m11819a(view2, R.id.txt_username_invalid);
                                                                    if (textView4 != null) {
                                                                        return new C6237m9(constraintLayout2, appCompatButton, constraintLayout, constraintLayout2, materialCardView, materialCardView2, appCompatEditText, appCompatEditText2, appCompatEditText3, a2, textInputLayout, textInputLayout2, textInputLayout3, a4, textView, textView2, textView3, textView4);
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
    public static C6237m9 m48175c(LayoutInflater layoutInflater) {
        return m48176d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6237m9 m48176d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_akt_change_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48174a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo45703b() {
        return this.f31550a;
    }
}
