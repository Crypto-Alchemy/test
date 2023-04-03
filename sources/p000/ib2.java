package p000;

import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.OtpEditText;

/* renamed from: ib2 */
/* compiled from: FragmentVerficationg2faBinding */
public final class ib2 {

    /* renamed from: a */
    public final RelativeLayout f29871a;

    /* renamed from: b */
    public final MaterialButton f29872b;

    /* renamed from: c */
    public final MaterialButton f29873c;

    /* renamed from: d */
    public final OtpEditText f29874d;

    /* renamed from: e */
    public final ShapeableImageView f29875e;

    /* renamed from: f */
    public final MaterialTextView f29876f;

    /* renamed from: g */
    public final MaterialTextView f29877g;

    public ib2(RelativeLayout relativeLayout, MaterialButton materialButton, MaterialButton materialButton2, OtpEditText otpEditText, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f29871a = relativeLayout;
        this.f29872b = materialButton;
        this.f29873c = materialButton2;
        this.f29874d = otpEditText;
        this.f29875e = shapeableImageView;
        this.f29876f = materialTextView;
        this.f29877g = materialTextView2;
    }

    /* renamed from: a */
    public static ib2 m45595a(View view) {
        int i = R.id.btnPasteCode;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnPasteCode);
        if (materialButton != null) {
            i = R.id.dialog_cross;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
            if (materialButton2 != null) {
                i = R.id.edtOTP;
                OtpEditText otpEditText = (OtpEditText) ca7.m11819a(view, R.id.edtOTP);
                if (otpEditText != null) {
                    i = R.id.imgAuthIcon;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) ca7.m11819a(view, R.id.imgAuthIcon);
                    if (shapeableImageView != null) {
                        i = R.id.txtAuthEnableTitle;
                        MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.txtAuthEnableTitle);
                        if (materialTextView != null) {
                            i = R.id.txtRemainSecond;
                            MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.txtRemainSecond);
                            if (materialTextView2 != null) {
                                return new ib2((RelativeLayout) view, materialButton, materialButton2, otpEditText, shapeableImageView, materialTextView, materialTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
