package p000;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: om2 */
/* compiled from: HolderRecoveryWalletBinding */
public final class om2 {

    /* renamed from: a */
    public final LinearLayoutCompat f32400a;

    /* renamed from: b */
    public final AppCompatImageView f32401b;

    /* renamed from: c */
    public final AppCompatImageView f32402c;

    /* renamed from: d */
    public final ConstraintLayout f32403d;

    /* renamed from: e */
    public final ConstraintLayout f32404e;

    /* renamed from: f */
    public final TextView f32405f;

    /* renamed from: g */
    public final TextView f32406g;

    /* renamed from: h */
    public final TextView f32407h;

    /* renamed from: i */
    public final TextView f32408i;

    /* renamed from: j */
    public final TextView f32409j;

    /* renamed from: k */
    public final TextView f32410k;

    /* renamed from: l */
    public final TextView f32411l;

    /* renamed from: m */
    public final TextView f32412m;

    /* renamed from: n */
    public final TextView f32413n;

    public om2(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.f32400a = linearLayoutCompat;
        this.f32401b = appCompatImageView;
        this.f32402c = appCompatImageView2;
        this.f32403d = constraintLayout;
        this.f32404e = constraintLayout2;
        this.f32405f = textView;
        this.f32406g = textView2;
        this.f32407h = textView3;
        this.f32408i = textView4;
        this.f32409j = textView5;
        this.f32410k = textView6;
        this.f32411l = textView7;
        this.f32412m = textView8;
        this.f32413n = textView9;
    }

    /* renamed from: a */
    public static om2 m49356a(View view) {
        View view2 = view;
        int i = R.id.imPrivateKeyDropdown;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.imPrivateKeyDropdown);
        if (appCompatImageView != null) {
            i = R.id.imRecoveryPhraseDropdown;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view2, R.id.imRecoveryPhraseDropdown);
            if (appCompatImageView2 != null) {
                i = R.id.layoutPrivateKey;
                ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.layoutPrivateKey);
                if (constraintLayout != null) {
                    i = R.id.layoutRecoveryPhase;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ca7.m11819a(view2, R.id.layoutRecoveryPhase);
                    if (constraintLayout2 != null) {
                        i = R.id.tvExistingWalletsHeader;
                        TextView textView = (TextView) ca7.m11819a(view2, R.id.tvExistingWalletsHeader);
                        if (textView != null) {
                            i = R.id.tvPrivateKeyContent;
                            TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvPrivateKeyContent);
                            if (textView2 != null) {
                                i = R.id.tvPrivateKeyHeader;
                                TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvPrivateKeyHeader);
                                if (textView3 != null) {
                                    i = R.id.tvPrivateKeyNotice;
                                    TextView textView4 = (TextView) ca7.m11819a(view2, R.id.tvPrivateKeyNotice);
                                    if (textView4 != null) {
                                        i = R.id.tvRecoveryPhraseContent;
                                        TextView textView5 = (TextView) ca7.m11819a(view2, R.id.tvRecoveryPhraseContent);
                                        if (textView5 != null) {
                                            i = R.id.tvRecoveryPhraseHeader;
                                            TextView textView6 = (TextView) ca7.m11819a(view2, R.id.tvRecoveryPhraseHeader);
                                            if (textView6 != null) {
                                                i = R.id.tvRecoveryPhraseNotice;
                                                TextView textView7 = (TextView) ca7.m11819a(view2, R.id.tvRecoveryPhraseNotice);
                                                if (textView7 != null) {
                                                    i = R.id.tvRevealPrivateKey;
                                                    TextView textView8 = (TextView) ca7.m11819a(view2, R.id.tvRevealPrivateKey);
                                                    if (textView8 != null) {
                                                        i = R.id.tvRevealRecoveryPhrase;
                                                        TextView textView9 = (TextView) ca7.m11819a(view2, R.id.tvRevealRecoveryPhrase);
                                                        if (textView9 != null) {
                                                            return new om2((LinearLayoutCompat) view2, appCompatImageView, appCompatImageView2, constraintLayout, constraintLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
