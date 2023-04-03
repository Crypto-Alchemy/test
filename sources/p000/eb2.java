package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: eb2 */
/* compiled from: FragmentTransferNftBinding */
public final class eb2 {

    /* renamed from: a */
    public final ConstraintLayout f28530a;

    /* renamed from: b */
    public final MaterialButton f28531b;

    /* renamed from: c */
    public final FrameLayout f28532c;

    /* renamed from: d */
    public final NestedScrollView f28533d;

    /* renamed from: e */
    public final MaterialTextView f28534e;

    /* renamed from: f */
    public final AppCompatImageView f28535f;

    /* renamed from: g */
    public final ProgressBar f28536g;

    /* renamed from: h */
    public final b36 f28537h;

    /* renamed from: i */
    public final CardView f28538i;

    /* renamed from: j */
    public final CardView f28539j;

    /* renamed from: k */
    public final MaterialTextView f28540k;

    /* renamed from: l */
    public final MaterialTextView f28541l;

    /* renamed from: m */
    public final MaterialTextView f28542m;

    /* renamed from: n */
    public final MaterialTextView f28543n;

    /* renamed from: o */
    public final MaterialTextView f28544o;

    public eb2(ConstraintLayout constraintLayout, MaterialButton materialButton, FrameLayout frameLayout, NestedScrollView nestedScrollView, MaterialTextView materialTextView, AppCompatImageView appCompatImageView, ProgressBar progressBar, b36 b36, CardView cardView, CardView cardView2, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6) {
        this.f28530a = constraintLayout;
        this.f28531b = materialButton;
        this.f28532c = frameLayout;
        this.f28533d = nestedScrollView;
        this.f28534e = materialTextView;
        this.f28535f = appCompatImageView;
        this.f28536g = progressBar;
        this.f28537h = b36;
        this.f28538i = cardView;
        this.f28539j = cardView2;
        this.f28540k = materialTextView2;
        this.f28541l = materialTextView3;
        this.f28542m = materialTextView4;
        this.f28543n = materialTextView5;
        this.f28544o = materialTextView6;
    }

    /* renamed from: a */
    public static eb2 m43886a(View view) {
        View view2 = view;
        int i = R.id.btnSendNew;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnSendNew);
        if (materialButton != null) {
            i = R.id.btnSendParent;
            FrameLayout frameLayout = (FrameLayout) ca7.m11819a(view2, R.id.btnSendParent);
            if (frameLayout != null) {
                i = R.id.nestedScrollView;
                NestedScrollView nestedScrollView = (NestedScrollView) ca7.m11819a(view2, R.id.nestedScrollView);
                if (nestedScrollView != null) {
                    i = R.id.networkFeeInfo;
                    MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.networkFeeInfo);
                    if (materialTextView != null) {
                        i = R.id.nftDetailImage;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.nftDetailImage);
                        if (appCompatImageView != null) {
                            i = R.id.progressBar;
                            ProgressBar progressBar = (ProgressBar) ca7.m11819a(view2, R.id.progressBar);
                            if (progressBar != null) {
                                i = R.id.toolbarWrapper;
                                View a = ca7.m11819a(view2, R.id.toolbarWrapper);
                                if (a != null) {
                                    b36 a2 = b36.m32346a(a);
                                    i = R.id.transferAddress;
                                    CardView cardView = (CardView) ca7.m11819a(view2, R.id.transferAddress);
                                    if (cardView != null) {
                                        i = R.id.transferDetails;
                                        CardView cardView2 = (CardView) ca7.m11819a(view2, R.id.transferDetails);
                                        if (cardView2 != null) {
                                            i = R.id.txtCollectionName;
                                            MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.txtCollectionName);
                                            if (materialTextView2 != null) {
                                                i = R.id.txtMaxTotal;
                                                MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view2, R.id.txtMaxTotal);
                                                if (materialTextView3 != null) {
                                                    i = R.id.txtNetWorkFee;
                                                    MaterialTextView materialTextView4 = (MaterialTextView) ca7.m11819a(view2, R.id.txtNetWorkFee);
                                                    if (materialTextView4 != null) {
                                                        i = R.id.txtWalletFrom;
                                                        MaterialTextView materialTextView5 = (MaterialTextView) ca7.m11819a(view2, R.id.txtWalletFrom);
                                                        if (materialTextView5 != null) {
                                                            i = R.id.txtWalletTo;
                                                            MaterialTextView materialTextView6 = (MaterialTextView) ca7.m11819a(view2, R.id.txtWalletTo);
                                                            if (materialTextView6 != null) {
                                                                return new eb2((ConstraintLayout) view2, materialButton, frameLayout, nestedScrollView, materialTextView, appCompatImageView, progressBar, a2, cardView, cardView2, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6);
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
    public static eb2 m43887c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_transfer_nft, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43886a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo42201b() {
        return this.f28530a;
    }
}
