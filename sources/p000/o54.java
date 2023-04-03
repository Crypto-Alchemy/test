package p000;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;

/* renamed from: o54 */
/* compiled from: NetworkConnectedController */
public class o54 extends iq0<t54> {
    public o54(Context context, bm6 bm6) {
        super(ht6.m19260c(context, bm6).mo21386d());
    }

    /* renamed from: b */
    public boolean mo11420b(an7 an7) {
        if (an7.f213j.mo23759b() == NetworkType.CONNECTED) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo11421c(t54 t54) {
        if (Build.VERSION.SDK_INT < 26) {
            return !t54.mo26160a();
        }
        if (!t54.mo26160a() || !t54.mo26163d()) {
            return true;
        }
        return false;
    }
}
