package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: dj7 */
/* compiled from: WalletScreenMainBinding */
public final class dj7 {

    /* renamed from: a */
    public final ConstraintLayout f28198a;

    /* renamed from: b */
    public final MaterialButton f28199b;

    /* renamed from: c */
    public final MaterialButton f28200c;

    /* renamed from: d */
    public final MaterialButton f28201d;

    /* renamed from: e */
    public final cf3 f28202e;

    /* renamed from: f */
    public final TextView f28203f;

    /* renamed from: g */
    public final TextView f28204g;

    /* renamed from: h */
    public final TextView f28205h;

    public dj7(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, cf3 cf3, TextView textView, TextView textView2, TextView textView3) {
        this.f28198a = constraintLayout;
        this.f28199b = materialButton;
        this.f28200c = materialButton2;
        this.f28201d = materialButton3;
        this.f28202e = cf3;
        this.f28203f = textView;
        this.f28204g = textView2;
        this.f28205h = textView3;
    }

    /* renamed from: a */
    public static dj7 m43493a(View view) {
        int i = R.id.btnBuy;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnBuy);
        if (materialButton != null) {
            i = R.id.btnReceive;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnReceive);
            if (materialButton2 != null) {
                i = R.id.btnSend;
                MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view, R.id.btnSend);
                if (materialButton3 != null) {
                    i = R.id.lSelectTokenType;
                    View a = ca7.m11819a(view, R.id.lSelectTokenType);
                    if (a != null) {
                        cf3 a2 = cf3.m32978a(a);
                        i = R.id.tvMainWallet;
                        TextView textView = (TextView) ca7.m11819a(view, R.id.tvMainWallet);
                        if (textView != null) {
                            i = R.id.tvWalletBlnc;
                            TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvWalletBlnc);
                            if (textView2 != null) {
                                i = R.id.txtSymbol;
                                TextView textView3 = (TextView) ca7.m11819a(view, R.id.txtSymbol);
                                if (textView3 != null) {
                                    return new dj7((ConstraintLayout) view, materialButton, materialButton2, materialButton3, a2, textView, textView2, textView3);
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
