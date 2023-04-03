package p000;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.C0147a;
import net.safemoon.androidwallet.R;

/* renamed from: gv1 */
/* compiled from: ExitDialog */
public class gv1 extends C0147a {
    /* renamed from: d */
    public static C0147a m58261d(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C0147a.C0148a aVar = new C0147a.C0148a(context);
        aVar.mo1197b(true);
        aVar.mo1208k(R.string.logout);
        aVar.mo1202f(context.getString(R.string.logout_msg));
        aVar.setPositiveButton(R.string.action_yes, onClickListener);
        aVar.setNegativeButton(R.string.action_no, onClickListener2);
        return aVar.create();
    }
}
