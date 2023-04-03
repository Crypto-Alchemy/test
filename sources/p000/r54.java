package p000;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;

/* renamed from: r54 */
/* compiled from: NetworkMeteredController */
public class r54 extends iq0<t54> {

    /* renamed from: e */
    public static final String f17131e = qk3.m25728f("NetworkMeteredCtrlr");

    public r54(Context context, bm6 bm6) {
        super(ht6.m19260c(context, bm6).mo21386d());
    }

    /* renamed from: b */
    public boolean mo11420b(an7 an7) {
        if (an7.f213j.mo23759b() == NetworkType.METERED) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo11421c(t54 t54) {
        if (Build.VERSION.SDK_INT < 26) {
            qk3.m25726c().mo25135a(f17131e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !t54.mo26160a();
        } else if (!t54.mo26160a() || !t54.mo26161b()) {
            return true;
        } else {
            return false;
        }
    }
}
