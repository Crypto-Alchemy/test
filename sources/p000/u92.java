package p000;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: u92 */
/* compiled from: FragmentGoogleBackupBinding */
public final class u92 {

    /* renamed from: a */
    public final MaterialCardView f34482a;

    /* renamed from: b */
    public final MaterialButton f34483b;

    /* renamed from: c */
    public final MaterialButton f34484c;

    /* renamed from: d */
    public final ShapeableImageView f34485d;

    /* renamed from: e */
    public final ShapeableImageView f34486e;

    /* renamed from: f */
    public final MaterialTextView f34487f;

    /* renamed from: g */
    public final MaterialTextView f34488g;

    /* renamed from: h */
    public final MaterialTextView f34489h;

    /* renamed from: i */
    public final MaterialButton f34490i;

    /* renamed from: j */
    public final MaterialTextView f34491j;

    public u92(MaterialCardView materialCardView, MaterialButton materialButton, MaterialButton materialButton2, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialButton materialButton3, MaterialTextView materialTextView4) {
        this.f34482a = materialCardView;
        this.f34483b = materialButton;
        this.f34484c = materialButton2;
        this.f34485d = shapeableImageView;
        this.f34486e = shapeableImageView2;
        this.f34487f = materialTextView;
        this.f34488g = materialTextView2;
        this.f34489h = materialTextView3;
        this.f34490i = materialButton3;
        this.f34491j = materialTextView4;
    }

    /* renamed from: a */
    public static u92 m52688a(View view) {
        int i = R.id.btnGotit;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnGotit);
        if (materialButton != null) {
            i = R.id.dialog_cross;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
            if (materialButton2 != null) {
                i = R.id.imgAuthIcon;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ca7.m11819a(view, R.id.imgAuthIcon);
                if (shapeableImageView != null) {
                    i = R.id.imgBackupQR;
                    ShapeableImageView shapeableImageView2 = (ShapeableImageView) ca7.m11819a(view, R.id.imgBackupQR);
                    if (shapeableImageView2 != null) {
                        i = R.id.txtAuthKey;
                        MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.txtAuthKey);
                        if (materialTextView != null) {
                            i = R.id.txtAuthScanDesc;
                            MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.txtAuthScanDesc);
                            if (materialTextView2 != null) {
                                i = R.id.txtAuthScanTitle;
                                MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view, R.id.txtAuthScanTitle);
                                if (materialTextView3 != null) {
                                    i = R.id.txtCC;
                                    MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view, R.id.txtCC);
                                    if (materialButton3 != null) {
                                        i = R.id.txtKey;
                                        MaterialTextView materialTextView4 = (MaterialTextView) ca7.m11819a(view, R.id.txtKey);
                                        if (materialTextView4 != null) {
                                            return new u92((MaterialCardView) view, materialButton, materialButton2, shapeableImageView, shapeableImageView2, materialTextView, materialTextView2, materialTextView3, materialButton3, materialTextView4);
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
