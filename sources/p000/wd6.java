package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

/* renamed from: wd6 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class wd6 extends kf1 {

    /* renamed from: P */
    public Dialog f35303P;

    /* renamed from: Q */
    public DialogInterface.OnCancelListener f35304Q;

    /* renamed from: U */
    public Dialog f35305U;

    /* renamed from: y */
    public static wd6 m53861y(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        wd6 wd6 = new wd6();
        Dialog dialog2 = (Dialog) cu4.m43222l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        wd6.f35303P = dialog2;
        if (onCancelListener != null) {
            wd6.f35304Q = onCancelListener;
        }
        return wd6;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f35304Q;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        Dialog dialog = this.f35303P;
        if (dialog != null) {
            return dialog;
        }
        mo22278u(false);
        if (this.f35305U == null) {
            this.f35305U = new AlertDialog.Builder((Context) cu4.m43221k(getContext())).create();
        }
        return this.f35305U;
    }

    /* renamed from: x */
    public void mo22281x(FragmentManager fragmentManager, String str) {
        super.mo22281x(fragmentManager, str);
    }
}
