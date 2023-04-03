package p000;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import net.safemoon.androidwallet.R;

/* renamed from: g92 */
/* compiled from: FragmentChangePasswordBinding */
public final class g92 {

    /* renamed from: a */
    public final ConstraintLayout f29115a;

    /* renamed from: b */
    public final AppCompatButton f29116b;

    /* renamed from: c */
    public final ConstraintLayout f29117c;

    /* renamed from: d */
    public final MaterialCardView f29118d;

    /* renamed from: e */
    public final MaterialCardView f29119e;

    /* renamed from: f */
    public final AppCompatEditText f29120f;

    /* renamed from: g */
    public final AppCompatEditText f29121g;

    /* renamed from: h */
    public final AppCompatEditText f29122h;

    /* renamed from: i */
    public final bf3 f29123i;

    /* renamed from: j */
    public final TextInputLayout f29124j;

    /* renamed from: k */
    public final TextInputLayout f29125k;

    /* renamed from: l */
    public final TextInputLayout f29126l;

    /* renamed from: m */
    public final b36 f29127m;

    /* renamed from: n */
    public final TextView f29128n;

    /* renamed from: o */
    public final TextView f29129o;

    /* renamed from: p */
    public final TextView f29130p;

    public g92(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, ConstraintLayout constraintLayout2, MaterialCardView materialCardView, MaterialCardView materialCardView2, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, bf3 bf3, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, b36 b36, TextView textView, TextView textView2, TextView textView3) {
        this.f29115a = constraintLayout;
        this.f29116b = appCompatButton;
        this.f29117c = constraintLayout2;
        this.f29118d = materialCardView;
        this.f29119e = materialCardView2;
        this.f29120f = appCompatEditText;
        this.f29121g = appCompatEditText2;
        this.f29122h = appCompatEditText3;
        this.f29123i = bf3;
        this.f29124j = textInputLayout;
        this.f29125k = textInputLayout2;
        this.f29126l = textInputLayout3;
        this.f29127m = b36;
        this.f29128n = textView;
        this.f29129o = textView2;
        this.f29130p = textView3;
    }

    /* renamed from: a */
    public static g92 m44666a(View view) {
        View view2 = view;
        int i = R.id.btnSave;
        AppCompatButton appCompatButton = (AppCompatButton) ca7.m11819a(view2, R.id.btnSave);
        if (appCompatButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view2;
            i = R.id.cvCurrentPassword;
            MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view2, R.id.cvCurrentPassword);
            if (materialCardView != null) {
                i = R.id.cvNewPassword;
                MaterialCardView materialCardView2 = (MaterialCardView) ca7.m11819a(view2, R.id.cvNewPassword);
                if (materialCardView2 != null) {
                    i = R.id.etConfirmNewPassword;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) ca7.m11819a(view2, R.id.etConfirmNewPassword);
                    if (appCompatEditText != null) {
                        i = R.id.etCurrentPassword;
                        AppCompatEditText appCompatEditText2 = (AppCompatEditText) ca7.m11819a(view2, R.id.etCurrentPassword);
                        if (appCompatEditText2 != null) {
                            i = R.id.etNewPassword;
                            AppCompatEditText appCompatEditText3 = (AppCompatEditText) ca7.m11819a(view2, R.id.etNewPassword);
                            if (appCompatEditText3 != null) {
                                i = R.id.lPasswordRequirements;
                                View a = ca7.m11819a(view2, R.id.lPasswordRequirements);
                                if (a != null) {
                                    bf3 a2 = bf3.m32510a(a);
                                    i = R.id.tilConfirmNewPassword;
                                    TextInputLayout textInputLayout = (TextInputLayout) ca7.m11819a(view2, R.id.tilConfirmNewPassword);
                                    if (textInputLayout != null) {
                                        i = R.id.tilCurrentPassword;
                                        TextInputLayout textInputLayout2 = (TextInputLayout) ca7.m11819a(view2, R.id.tilCurrentPassword);
                                        if (textInputLayout2 != null) {
                                            i = R.id.tilNewPassword;
                                            TextInputLayout textInputLayout3 = (TextInputLayout) ca7.m11819a(view2, R.id.tilNewPassword);
                                            if (textInputLayout3 != null) {
                                                i = R.id.toolbar;
                                                View a3 = ca7.m11819a(view2, R.id.toolbar);
                                                if (a3 != null) {
                                                    b36 a4 = b36.m32346a(a3);
                                                    i = R.id.tvConfirmNewPassTitle;
                                                    TextView textView = (TextView) ca7.m11819a(view2, R.id.tvConfirmNewPassTitle);
                                                    if (textView != null) {
                                                        i = R.id.tvCurrentPassTitle;
                                                        TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvCurrentPassTitle);
                                                        if (textView2 != null) {
                                                            i = R.id.tvNewPassTitle;
                                                            TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvNewPassTitle);
                                                            if (textView3 != null) {
                                                                return new g92(constraintLayout, appCompatButton, constraintLayout, materialCardView, materialCardView2, appCompatEditText, appCompatEditText2, appCompatEditText3, a2, textInputLayout, textInputLayout2, textInputLayout3, a4, textView, textView2, textView3);
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

    /* renamed from: b */
    public ConstraintLayout mo42855b() {
        return this.f29115a;
    }
}
