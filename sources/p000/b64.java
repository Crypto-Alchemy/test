package p000;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;

/* renamed from: b64 */
/* compiled from: NetworkUnmeteredController */
public class b64 extends iq0<t54> {
    public b64(Context context, bm6 bm6) {
        super(ht6.m19260c(context, bm6).mo21386d());
    }

    /* renamed from: b */
    public boolean mo11420b(an7 an7) {
        if (an7.f213j.mo23759b() == NetworkType.UNMETERED || (Build.VERSION.SDK_INT >= 30 && an7.f213j.mo23759b() == NetworkType.TEMPORARILY_UNMETERED)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo11421c(t54 t54) {
        if (!t54.mo26160a() || t54.mo26161b()) {
            return true;
        }
        return false;
    }
}
