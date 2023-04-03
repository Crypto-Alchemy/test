package p000;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.OtpEditText;

/* renamed from: s92 */
/* compiled from: FragmentGoogle2faVerfiedAuthBinding */
public final class s92 {

    /* renamed from: a */
    public final MaterialCardView f33794a;

    /* renamed from: b */
    public final MaterialButton f33795b;

    /* renamed from: c */
    public final MaterialButton f33796c;

    /* renamed from: d */
    public final MaterialButton f33797d;

    /* renamed from: e */
    public final OtpEditText f33798e;

    /* renamed from: f */
    public final TextView f33799f;

    /* renamed from: g */
    public final ShapeableImageView f33800g;

    /* renamed from: h */
    public final MaterialTextView f33801h;

    /* renamed from: i */
    public final MaterialTextView f33802i;

    public s92(MaterialCardView materialCardView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, OtpEditText otpEditText, TextView textView, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f33794a = materialCardView;
        this.f33795b = materialButton;
        this.f33796c = materialButton2;
        this.f33797d = materialButton3;
        this.f33798e = otpEditText;
        this.f33799f = textView;
        this.f33800g = shapeableImageView;
        this.f33801h = materialTextView;
        this.f33802i = materialTextView2;
    }

    /* renamed from: a */
    public static s92 m51632a(View view) {
        int i = R.id.btnContinue;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnContinue);
        if (materialButton != null) {
            i = R.id.btnPasteCode;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnPasteCode);
            if (materialButton2 != null) {
                i = R.id.dialog_cross;
                MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
                if (materialButton3 != null) {
                    i = R.id.edtOTP;
                    OtpEditText otpEditText = (OtpEditText) ca7.m11819a(view, R.id.edtOTP);
                    if (otpEditText != null) {
                        i = R.id.errorMessage;
                        TextView textView = (TextView) ca7.m11819a(view, R.id.errorMessage);
                        if (textView != null) {
                            i = R.id.imgAuthIcon;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) ca7.m11819a(view, R.id.imgAuthIcon);
                            if (shapeableImageView != null) {
                                i = R.id.txtAuthEnableTitle;
                                MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.txtAuthEnableTitle);
                                if (materialTextView != null) {
                                    i = R.id.txtNote;
                                    MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.txtNote);
                                    if (materialTextView2 != null) {
                                        return new s92((MaterialCardView) view, materialButton, materialButton2, materialButton3, otpEditText, textView, shapeableImageView, materialTextView, materialTextView2);
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
