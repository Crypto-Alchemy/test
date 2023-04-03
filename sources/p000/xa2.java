package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: xa2 */
/* compiled from: FragmentSwapBinding */
public final class xa2 {

    /* renamed from: A */
    public final MaterialTextView f35558A;

    /* renamed from: B */
    public final MaterialTextView f35559B;

    /* renamed from: C */
    public final MaterialTextView f35560C;

    /* renamed from: D */
    public final MaterialTextView f35561D;

    /* renamed from: E */
    public final TextView f35562E;

    /* renamed from: a */
    public final FrameLayout f35563a;

    /* renamed from: b */
    public final MaterialButton f35564b;

    /* renamed from: c */
    public final MaterialButton f35565c;

    /* renamed from: d */
    public final MaterialButton f35566d;

    /* renamed from: e */
    public final MaterialButton f35567e;

    /* renamed from: f */
    public final AppCompatImageView f35568f;

    /* renamed from: g */
    public final ConstraintLayout f35569g;

    /* renamed from: h */
    public final ConstraintLayout f35570h;

    /* renamed from: i */
    public final View f35571i;

    /* renamed from: j */
    public final ChipGroup f35572j;

    /* renamed from: k */
    public final HorizontalScrollView f35573k;

    /* renamed from: l */
    public final Chip f35574l;

    /* renamed from: m */
    public final Chip f35575m;

    /* renamed from: n */
    public final Chip f35576n;

    /* renamed from: o */
    public final FrameLayout f35577o;

    /* renamed from: p */
    public final Flow f35578p;

    /* renamed from: q */
    public final ImageButton f35579q;

    /* renamed from: r */
    public final AppCompatImageView f35580r;

    /* renamed from: s */
    public final cf3 f35581s;

    /* renamed from: t */
    public final ConstraintLayout f35582t;

    /* renamed from: u */
    public final View f35583u;

    /* renamed from: v */
    public final View f35584v;

    /* renamed from: w */
    public final CircularProgressIndicator f35585w;

    /* renamed from: x */
    public final Chip f35586x;

    /* renamed from: y */
    public final NestedScrollView f35587y;

    /* renamed from: z */
    public final View f35588z;

    public xa2(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, ChipGroup chipGroup, HorizontalScrollView horizontalScrollView, Chip chip, Chip chip2, Chip chip3, FrameLayout frameLayout2, Flow flow, ImageButton imageButton, AppCompatImageView appCompatImageView2, cf3 cf3, ConstraintLayout constraintLayout3, View view2, View view3, CircularProgressIndicator circularProgressIndicator, Chip chip4, NestedScrollView nestedScrollView, View view4, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, TextView textView) {
        this.f35563a = frameLayout;
        this.f35564b = materialButton;
        this.f35565c = materialButton2;
        this.f35566d = materialButton3;
        this.f35567e = materialButton4;
        this.f35568f = appCompatImageView;
        this.f35569g = constraintLayout;
        this.f35570h = constraintLayout2;
        this.f35571i = view;
        this.f35572j = chipGroup;
        this.f35573k = horizontalScrollView;
        this.f35574l = chip;
        this.f35575m = chip2;
        this.f35576n = chip3;
        this.f35577o = frameLayout2;
        this.f35578p = flow;
        this.f35579q = imageButton;
        this.f35580r = appCompatImageView2;
        this.f35581s = cf3;
        this.f35582t = constraintLayout3;
        this.f35583u = view2;
        this.f35584v = view3;
        this.f35585w = circularProgressIndicator;
        this.f35586x = chip4;
        this.f35587y = nestedScrollView;
        this.f35588z = view4;
        this.f35558A = materialTextView;
        this.f35559B = materialTextView2;
        this.f35560C = materialTextView3;
        this.f35561D = materialTextView4;
        this.f35562E = textView;
    }

    /* renamed from: a */
    public static xa2 m54332a(View view) {
        View view2 = view;
        int i = R.id.btnApprove;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnApprove);
        if (materialButton != null) {
            i = R.id.btnEnterValue;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.btnEnterValue);
            if (materialButton2 != null) {
                i = R.id.btnSwap;
                MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view2, R.id.btnSwap);
                if (materialButton3 != null) {
                    i = R.id.btnV2PopupLaunch;
                    MaterialButton materialButton4 = (MaterialButton) ca7.m11819a(view2, R.id.btnV2PopupLaunch);
                    if (materialButton4 != null) {
                        i = R.id.bubble;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.bubble);
                        if (appCompatImageView != null) {
                            i = R.id.ccDestination;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.ccDestination);
                            if (constraintLayout != null) {
                                i = R.id.ccSource;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ca7.m11819a(view2, R.id.ccSource);
                                if (constraintLayout2 != null) {
                                    i = R.id.centerToolbar;
                                    View a = ca7.m11819a(view2, R.id.centerToolbar);
                                    if (a != null) {
                                        i = R.id.cgSetting;
                                        ChipGroup chipGroup = (ChipGroup) ca7.m11819a(view2, R.id.cgSetting);
                                        if (chipGroup != null) {
                                            i = R.id.cgSettingParent;
                                            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ca7.m11819a(view2, R.id.cgSettingParent);
                                            if (horizontalScrollView != null) {
                                                i = R.id.chipSwapMinTxn;
                                                Chip chip = (Chip) ca7.m11819a(view2, R.id.chipSwapMinTxn);
                                                if (chip != null) {
                                                    i = R.id.chipSwapSlipPage;
                                                    Chip chip2 = (Chip) ca7.m11819a(view2, R.id.chipSwapSlipPage);
                                                    if (chip2 != null) {
                                                        i = R.id.chipSwapStandardSpeed;
                                                        Chip chip3 = (Chip) ca7.m11819a(view2, R.id.chipSwapStandardSpeed);
                                                        if (chip3 != null) {
                                                            FrameLayout frameLayout = (FrameLayout) view2;
                                                            i = R.id.dummyForSwapButton;
                                                            Flow flow = (Flow) ca7.m11819a(view2, R.id.dummyForSwapButton);
                                                            if (flow != null) {
                                                                i = R.id.imgArrow;
                                                                ImageButton imageButton = (ImageButton) ca7.m11819a(view2, R.id.imgArrow);
                                                                if (imageButton != null) {
                                                                    i = R.id.iv_back;
                                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view2, R.id.iv_back);
                                                                    if (appCompatImageView2 != null) {
                                                                        i = R.id.lSelectTokenType;
                                                                        View a2 = ca7.m11819a(view2, R.id.lSelectTokenType);
                                                                        if (a2 != null) {
                                                                            cf3 a3 = cf3.m32978a(a2);
                                                                            i = R.id.lWalletBalance;
                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ca7.m11819a(view2, R.id.lWalletBalance);
                                                                            if (constraintLayout3 != null) {
                                                                                i = R.id.paddingEnd;
                                                                                View a4 = ca7.m11819a(view2, R.id.paddingEnd);
                                                                                if (a4 != null) {
                                                                                    i = R.id.paddingStart;
                                                                                    View a5 = ca7.m11819a(view2, R.id.paddingStart);
                                                                                    if (a5 != null) {
                                                                                        i = R.id.progressLoading;
                                                                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ca7.m11819a(view2, R.id.progressLoading);
                                                                                        if (circularProgressIndicator != null) {
                                                                                            i = R.id.requireGasFee;
                                                                                            Chip chip4 = (Chip) ca7.m11819a(view2, R.id.requireGasFee);
                                                                                            if (chip4 != null) {
                                                                                                i = R.id.swapCardWrapper;
                                                                                                NestedScrollView nestedScrollView = (NestedScrollView) ca7.m11819a(view2, R.id.swapCardWrapper);
                                                                                                if (nestedScrollView != null) {
                                                                                                    i = R.id.toolbar;
                                                                                                    View a6 = ca7.m11819a(view2, R.id.toolbar);
                                                                                                    if (a6 != null) {
                                                                                                        i = R.id.tvMainWallet;
                                                                                                        MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.tvMainWallet);
                                                                                                        if (materialTextView != null) {
                                                                                                            i = R.id.tv_total;
                                                                                                            MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.tv_total);
                                                                                                            if (materialTextView2 != null) {
                                                                                                                i = R.id.txtGasFee;
                                                                                                                MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view2, R.id.txtGasFee);
                                                                                                                if (materialTextView3 != null) {
                                                                                                                    i = R.id.txtSwapTitle;
                                                                                                                    MaterialTextView materialTextView4 = (MaterialTextView) ca7.m11819a(view2, R.id.txtSwapTitle);
                                                                                                                    if (materialTextView4 != null) {
                                                                                                                        i = R.id.txtSymbol;
                                                                                                                        TextView textView = (TextView) ca7.m11819a(view2, R.id.txtSymbol);
                                                                                                                        if (textView != null) {
                                                                                                                            return new xa2(frameLayout, materialButton, materialButton2, materialButton3, materialButton4, appCompatImageView, constraintLayout, constraintLayout2, a, chipGroup, horizontalScrollView, chip, chip2, chip3, frameLayout, flow, imageButton, appCompatImageView2, a3, constraintLayout3, a4, a5, circularProgressIndicator, chip4, nestedScrollView, a6, materialTextView, materialTextView2, materialTextView3, materialTextView4, textView);
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
    public FrameLayout mo49440b() {
        return this.f35563a;
    }
}
