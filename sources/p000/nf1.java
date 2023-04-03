package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: nf1 */
/* compiled from: DialogPurchaseMethodBinding */
public final class nf1 {

    /* renamed from: a */
    public final ConstraintLayout f32104a;

    /* renamed from: b */
    public final MaterialButton f32105b;

    /* renamed from: c */
    public final MaterialButton f32106c;

    /* renamed from: d */
    public final MaterialButton f32107d;

    /* renamed from: e */
    public final AppCompatImageView f32108e;

    /* renamed from: f */
    public final AppCompatTextView f32109f;

    /* renamed from: g */
    public final AppCompatTextView f32110g;

    public nf1(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f32104a = constraintLayout;
        this.f32105b = materialButton;
        this.f32106c = materialButton2;
        this.f32107d = materialButton3;
        this.f32108e = appCompatImageView;
        this.f32109f = appCompatTextView;
        this.f32110g = appCompatTextView2;
    }

    /* renamed from: a */
    public static nf1 m48752a(View view) {
        int i = R.id.btn_buy;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btn_buy);
        if (materialButton != null) {
            i = R.id.btn_sell;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btn_sell);
            if (materialButton2 != null) {
                i = R.id.dialog_cross;
                MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
                if (materialButton3 != null) {
                    i = R.id.img_mp_logo;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.img_mp_logo);
                    if (appCompatImageView != null) {
                        i = R.id.tv_buy_content;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.tv_buy_content);
                        if (appCompatTextView != null) {
                            i = R.id.tv_sell_content;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view, R.id.tv_sell_content);
                            if (appCompatTextView2 != null) {
                                return new nf1((ConstraintLayout) view, materialButton, materialButton2, materialButton3, appCompatImageView, appCompatTextView, appCompatTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo46068b() {
        return this.f32104a;
    }
}
