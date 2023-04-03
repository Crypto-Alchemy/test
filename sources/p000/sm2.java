package p000;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import net.safemoon.androidwallet.R;

/* renamed from: sm2 */
/* compiled from: HolderWalletBinding */
public final class sm2 {

    /* renamed from: a */
    public final ConstraintLayout f33946a;

    /* renamed from: b */
    public final MaterialButton f33947b;

    /* renamed from: c */
    public final AppCompatImageView f33948c;

    /* renamed from: d */
    public final ConstraintLayout f33949d;

    /* renamed from: e */
    public final AppCompatImageView f33950e;

    /* renamed from: f */
    public final MaterialCardView f33951f;

    /* renamed from: g */
    public final MaterialCardView f33952g;

    /* renamed from: h */
    public final TextView f33953h;

    public sm2(ConstraintLayout constraintLayout, MaterialButton materialButton, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView2, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView) {
        this.f33946a = constraintLayout;
        this.f33947b = materialButton;
        this.f33948c = appCompatImageView;
        this.f33949d = constraintLayout2;
        this.f33950e = appCompatImageView2;
        this.f33951f = materialCardView;
        this.f33952g = materialCardView2;
        this.f33953h = textView;
    }

    /* renamed from: a */
    public static sm2 m51858a(View view) {
        int i = R.id.btnDelete;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnDelete);
        if (materialButton != null) {
            i = R.id.cbAddToken;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.cbAddToken);
            if (appCompatImageView != null) {
                i = R.id.fgContentLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view, R.id.fgContentLayout);
                if (constraintLayout != null) {
                    i = R.id.imWalletLink;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view, R.id.imWalletLink);
                    if (appCompatImageView2 != null) {
                        i = R.id.rowBG;
                        MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view, R.id.rowBG);
                        if (materialCardView != null) {
                            i = R.id.rowFG;
                            MaterialCardView materialCardView2 = (MaterialCardView) ca7.m11819a(view, R.id.rowFG);
                            if (materialCardView2 != null) {
                                i = R.id.txtName;
                                TextView textView = (TextView) ca7.m11819a(view, R.id.txtName);
                                if (textView != null) {
                                    return new sm2((ConstraintLayout) view, materialButton, appCompatImageView, constraintLayout, appCompatImageView2, materialCardView, materialCardView2, textView);
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
    public ConstraintLayout mo47831b() {
        return this.f33946a;
    }
}
