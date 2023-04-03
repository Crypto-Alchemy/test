package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: qm2 */
/* compiled from: HolderReflectionTokenBinding */
public final class qm2 {

    /* renamed from: a */
    public final ConstraintLayout f33158a;

    /* renamed from: b */
    public final MaterialButton f33159b;

    /* renamed from: c */
    public final MaterialButton f33160c;

    /* renamed from: d */
    public final ImageView f33161d;

    /* renamed from: e */
    public final ConstraintLayout f33162e;

    /* renamed from: f */
    public final ConstraintLayout f33163f;

    /* renamed from: g */
    public final ConstraintLayout f33164g;

    /* renamed from: h */
    public final TextView f33165h;

    /* renamed from: i */
    public final TextView f33166i;

    /* renamed from: j */
    public final TextView f33167j;

    /* renamed from: k */
    public final TextView f33168k;

    /* renamed from: l */
    public final TextView f33169l;

    /* renamed from: m */
    public final AppCompatTextView f33170m;

    /* renamed from: n */
    public final View f33171n;

    /* renamed from: o */
    public final LinearLayout f33172o;

    public qm2(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, AppCompatTextView appCompatTextView, View view, LinearLayout linearLayout) {
        this.f33158a = constraintLayout;
        this.f33159b = materialButton;
        this.f33160c = materialButton2;
        this.f33161d = imageView;
        this.f33162e = constraintLayout2;
        this.f33163f = constraintLayout3;
        this.f33164g = constraintLayout4;
        this.f33165h = textView;
        this.f33166i = textView2;
        this.f33167j = textView3;
        this.f33168k = textView4;
        this.f33169l = textView5;
        this.f33170m = appCompatTextView;
        this.f33171n = view;
        this.f33172o = linearLayout;
    }

    /* renamed from: a */
    public static qm2 m50637a(View view) {
        View view2 = view;
        int i = R.id.btnDelete;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnDelete);
        if (materialButton != null) {
            i = R.id.btnEnableAdvancedDataMode;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.btnEnableAdvancedDataMode);
            if (materialButton2 != null) {
                i = R.id.ivTokenIcon;
                ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.ivTokenIcon);
                if (imageView != null) {
                    i = R.id.rowBG;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.rowBG);
                    if (constraintLayout != null) {
                        i = R.id.rowFG;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ca7.m11819a(view2, R.id.rowFG);
                        if (constraintLayout2 != null) {
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) view2;
                            i = R.id.tvStartDate;
                            TextView textView = (TextView) ca7.m11819a(view2, R.id.tvStartDate);
                            if (textView != null) {
                                i = R.id.tvTokenName;
                                TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvTokenName);
                                if (textView2 != null) {
                                    i = R.id.tvTokenNativeBalance;
                                    TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvTokenNativeBalance);
                                    if (textView3 != null) {
                                        i = R.id.tvTokenNativeBalanceInFiat;
                                        TextView textView4 = (TextView) ca7.m11819a(view2, R.id.tvTokenNativeBalanceInFiat);
                                        if (textView4 != null) {
                                            i = R.id.tvTokenSymbol;
                                            TextView textView5 = (TextView) ca7.m11819a(view2, R.id.tvTokenSymbol);
                                            if (textView5 != null) {
                                                i = R.id.txtNoteAllTime;
                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view2, R.id.txtNoteAllTime);
                                                if (appCompatTextView != null) {
                                                    i = R.id.vDivider;
                                                    View a = ca7.m11819a(view2, R.id.vDivider);
                                                    if (a != null) {
                                                        i = R.id.vTokenNameContainer;
                                                        LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.vTokenNameContainer);
                                                        if (linearLayout != null) {
                                                            return new qm2(constraintLayout3, materialButton, materialButton2, imageView, constraintLayout, constraintLayout2, constraintLayout3, textView, textView2, textView3, textView4, textView5, appCompatTextView, a, linearLayout);
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
    public ConstraintLayout mo47129b() {
        return this.f33158a;
    }
}
