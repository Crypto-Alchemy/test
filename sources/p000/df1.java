package p000;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: df1 */
/* compiled from: DialogBestMaxFragmentBinding */
public final class df1 {

    /* renamed from: a */
    public final ConstraintLayout f28171a;

    /* renamed from: b */
    public final MaterialButton f28172b;

    /* renamed from: c */
    public final MaterialButton f28173c;

    /* renamed from: d */
    public final MaterialTextView f28174d;

    /* renamed from: e */
    public final MaterialTextView f28175e;

    /* renamed from: f */
    public final MaterialTextView f28176f;

    /* renamed from: g */
    public final MaterialTextView f28177g;

    /* renamed from: h */
    public final MaterialTextView f28178h;

    /* renamed from: i */
    public final MaterialTextView f28179i;

    /* renamed from: j */
    public final AppCompatImageView f28180j;

    /* renamed from: k */
    public final FrameLayout f28181k;

    public df1(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, AppCompatImageView appCompatImageView, FrameLayout frameLayout) {
        this.f28171a = constraintLayout;
        this.f28172b = materialButton;
        this.f28173c = materialButton2;
        this.f28174d = materialTextView;
        this.f28175e = materialTextView2;
        this.f28176f = materialTextView3;
        this.f28177g = materialTextView4;
        this.f28178h = materialTextView5;
        this.f28179i = materialTextView6;
        this.f28180j = appCompatImageView;
        this.f28181k = frameLayout;
    }

    /* renamed from: a */
    public static df1 m43476a(View view) {
        int i = R.id.clkCancel;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.clkCancel);
        if (materialButton != null) {
            i = R.id.clkOk;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.clkOk);
            if (materialButton2 != null) {
                i = R.id.dialog_result1;
                MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.dialog_result1);
                if (materialTextView != null) {
                    i = R.id.dialog_result2;
                    MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.dialog_result2);
                    if (materialTextView2 != null) {
                        i = R.id.dialog_result3;
                        MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view, R.id.dialog_result3);
                        if (materialTextView3 != null) {
                            i = R.id.dialog_result4;
                            MaterialTextView materialTextView4 = (MaterialTextView) ca7.m11819a(view, R.id.dialog_result4);
                            if (materialTextView4 != null) {
                                i = R.id.dialog_result5;
                                MaterialTextView materialTextView5 = (MaterialTextView) ca7.m11819a(view, R.id.dialog_result5);
                                if (materialTextView5 != null) {
                                    i = R.id.dialog_title;
                                    MaterialTextView materialTextView6 = (MaterialTextView) ca7.m11819a(view, R.id.dialog_title);
                                    if (materialTextView6 != null) {
                                        i = R.id.progressLoading;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.progressLoading);
                                        if (appCompatImageView != null) {
                                            i = R.id.progressLoadingParent;
                                            FrameLayout frameLayout = (FrameLayout) ca7.m11819a(view, R.id.progressLoadingParent);
                                            if (frameLayout != null) {
                                                return new df1((ConstraintLayout) view, materialButton, materialButton2, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6, appCompatImageView, frameLayout);
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
