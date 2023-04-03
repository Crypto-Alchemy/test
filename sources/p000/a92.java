package p000;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.MyTextInputLayout;

/* renamed from: a92 */
/* compiled from: FragmentAddCustomContractBinding */
public final class a92 {

    /* renamed from: a */
    public final FrameLayout f20832a;

    /* renamed from: b */
    public final MaterialButton f20833b;

    /* renamed from: c */
    public final MaterialButton f20834c;

    /* renamed from: d */
    public final FrameLayout f20835d;

    /* renamed from: e */
    public final AppCompatImageView f20836e;

    /* renamed from: f */
    public final AppCompatImageView f20837f;

    /* renamed from: g */
    public final ConstraintLayout f20838g;

    /* renamed from: h */
    public final MyTextInputLayout f20839h;

    /* renamed from: i */
    public final TextInputLayout f20840i;

    /* renamed from: j */
    public final TextInputLayout f20841j;

    /* renamed from: k */
    public final TextInputLayout f20842k;

    /* renamed from: l */
    public final MaterialTextView f20843l;

    /* renamed from: m */
    public final MaterialTextView f20844m;

    /* renamed from: n */
    public final b36 f20845n;

    /* renamed from: o */
    public final MaterialTextView f20846o;

    public a92(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, FrameLayout frameLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, MyTextInputLayout myTextInputLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, MaterialTextView materialTextView, MaterialTextView materialTextView2, b36 b36, MaterialTextView materialTextView3) {
        this.f20832a = frameLayout;
        this.f20833b = materialButton;
        this.f20834c = materialButton2;
        this.f20835d = frameLayout2;
        this.f20836e = appCompatImageView;
        this.f20837f = appCompatImageView2;
        this.f20838g = constraintLayout;
        this.f20839h = myTextInputLayout;
        this.f20840i = textInputLayout;
        this.f20841j = textInputLayout2;
        this.f20842k = textInputLayout3;
        this.f20843l = materialTextView;
        this.f20844m = materialTextView2;
        this.f20845n = b36;
        this.f20846o = materialTextView3;
    }

    /* renamed from: a */
    public static a92 m31752a(View view) {
        View view2 = view;
        int i = R.id.btnNetwork;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnNetwork);
        if (materialButton != null) {
            i = R.id.clkAddToken;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.clkAddToken);
            if (materialButton2 != null) {
                FrameLayout frameLayout = (FrameLayout) view2;
                i = R.id.imgChain;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.imgChain);
                if (appCompatImageView != null) {
                    i = R.id.imgToken;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view2, R.id.imgToken);
                    if (appCompatImageView2 != null) {
                        i = R.id.parentNetWork;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.parentNetWork);
                        if (constraintLayout != null) {
                            i = R.id.tilContractAddress;
                            MyTextInputLayout myTextInputLayout = (MyTextInputLayout) ca7.m11819a(view2, R.id.tilContractAddress);
                            if (myTextInputLayout != null) {
                                i = R.id.tilContractDecimal;
                                TextInputLayout textInputLayout = (TextInputLayout) ca7.m11819a(view2, R.id.tilContractDecimal);
                                if (textInputLayout != null) {
                                    i = R.id.tilContractName;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) ca7.m11819a(view2, R.id.tilContractName);
                                    if (textInputLayout2 != null) {
                                        i = R.id.tilContractSymbol;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) ca7.m11819a(view2, R.id.tilContractSymbol);
                                        if (textInputLayout3 != null) {
                                            i = R.id.tilImportantDetails;
                                            MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.tilImportantDetails);
                                            if (materialTextView != null) {
                                                i = R.id.tilImportantTitle;
                                                MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.tilImportantTitle);
                                                if (materialTextView2 != null) {
                                                    i = R.id.toolbar;
                                                    View a = ca7.m11819a(view2, R.id.toolbar);
                                                    if (a != null) {
                                                        b36 a2 = b36.m32346a(a);
                                                        i = R.id.txtTokenLabel;
                                                        MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view2, R.id.txtTokenLabel);
                                                        if (materialTextView3 != null) {
                                                            return new a92(frameLayout, materialButton, materialButton2, frameLayout, appCompatImageView, appCompatImageView2, constraintLayout, myTextInputLayout, textInputLayout, textInputLayout2, textInputLayout3, materialTextView, materialTextView2, a2, materialTextView3);
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
}
