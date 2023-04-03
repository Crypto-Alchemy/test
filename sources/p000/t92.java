package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: t92 */
/* compiled from: FragmentGoogleAuthPairBinding */
public final class t92 {

    /* renamed from: a */
    public final MaterialCardView f34153a;

    /* renamed from: b */
    public final Barrier f34154b;

    /* renamed from: c */
    public final MaterialButton f34155c;

    /* renamed from: d */
    public final MaterialButton f34156d;

    /* renamed from: e */
    public final View f34157e;

    /* renamed from: f */
    public final Group f34158f;

    /* renamed from: g */
    public final Group f34159g;

    /* renamed from: h */
    public final ShapeableImageView f34160h;

    /* renamed from: i */
    public final ShapeableImageView f34161i;

    /* renamed from: j */
    public final AppCompatImageView f34162j;

    /* renamed from: k */
    public final AppCompatImageView f34163k;

    /* renamed from: l */
    public final MaterialTextView f34164l;

    /* renamed from: m */
    public final Chip f34165m;

    /* renamed from: n */
    public final MaterialTextView f34166n;

    /* renamed from: o */
    public final MaterialTextView f34167o;

    /* renamed from: p */
    public final MaterialButton f34168p;

    public t92(MaterialCardView materialCardView, Barrier barrier, MaterialButton materialButton, MaterialButton materialButton2, View view, Group group, Group group2, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MaterialTextView materialTextView, Chip chip, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialButton materialButton3) {
        this.f34153a = materialCardView;
        this.f34154b = barrier;
        this.f34155c = materialButton;
        this.f34156d = materialButton2;
        this.f34157e = view;
        this.f34158f = group;
        this.f34159g = group2;
        this.f34160h = shapeableImageView;
        this.f34161i = shapeableImageView2;
        this.f34162j = appCompatImageView;
        this.f34163k = appCompatImageView2;
        this.f34164l = materialTextView;
        this.f34165m = chip;
        this.f34166n = materialTextView2;
        this.f34167o = materialTextView3;
        this.f34168p = materialButton3;
    }

    /* renamed from: a */
    public static t92 m52143a(View view) {
        View view2 = view;
        int i = R.id.barrierBottom;
        Barrier barrier = (Barrier) ca7.m11819a(view2, R.id.barrierBottom);
        if (barrier != null) {
            i = R.id.btnContinue;
            MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnContinue);
            if (materialButton != null) {
                i = R.id.dialog_cross;
                MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.dialog_cross);
                if (materialButton2 != null) {
                    i = R.id.dividerBottom;
                    View a = ca7.m11819a(view2, R.id.dividerBottom);
                    if (a != null) {
                        i = R.id.groupKey;
                        Group group = (Group) ca7.m11819a(view2, R.id.groupKey);
                        if (group != null) {
                            i = R.id.groupQR;
                            Group group2 = (Group) ca7.m11819a(view2, R.id.groupQR);
                            if (group2 != null) {
                                i = R.id.imgAuthIcon;
                                ShapeableImageView shapeableImageView = (ShapeableImageView) ca7.m11819a(view2, R.id.imgAuthIcon);
                                if (shapeableImageView != null) {
                                    i = R.id.imgQr;
                                    ShapeableImageView shapeableImageView2 = (ShapeableImageView) ca7.m11819a(view2, R.id.imgQr);
                                    if (shapeableImageView2 != null) {
                                        i = R.id.imgSwitchKey;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.imgSwitchKey);
                                        if (appCompatImageView != null) {
                                            i = R.id.imgSwitchQR;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view2, R.id.imgSwitchQR);
                                            if (appCompatImageView2 != null) {
                                                i = R.id.txtAuthCopyTitle;
                                                MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.txtAuthCopyTitle);
                                                if (materialTextView != null) {
                                                    i = R.id.txtAuthKey;
                                                    Chip chip = (Chip) ca7.m11819a(view2, R.id.txtAuthKey);
                                                    if (chip != null) {
                                                        i = R.id.txtAuthScanTitle;
                                                        MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.txtAuthScanTitle);
                                                        if (materialTextView2 != null) {
                                                            i = R.id.txtSwitchKey;
                                                            MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view2, R.id.txtSwitchKey);
                                                            if (materialTextView3 != null) {
                                                                i = R.id.txtSwitchQR;
                                                                MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view2, R.id.txtSwitchQR);
                                                                if (materialButton3 != null) {
                                                                    return new t92((MaterialCardView) view2, barrier, materialButton, materialButton2, a, group, group2, shapeableImageView, shapeableImageView2, appCompatImageView, appCompatImageView2, materialTextView, chip, materialTextView2, materialTextView3, materialButton3);
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
}
