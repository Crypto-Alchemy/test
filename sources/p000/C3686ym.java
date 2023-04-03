package p000;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: ym */
/* compiled from: AppCompatDialogFragment */
public class C3686ym extends kf1 {
    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        return new C3629xm(getContext(), mo22270o());
    }

    /* renamed from: w */
    public void mo22280w(Dialog dialog, int i) {
        if (dialog instanceof C3629xm) {
            C3629xm xmVar = (C3629xm) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            xmVar.supportRequestWindowFeature(1);
            return;
        }
        super.mo22280w(dialog, i);
    }
}
