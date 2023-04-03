package p000;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;

/* renamed from: s54 */
/* compiled from: NetworkNotRoamingController */
public class s54 extends iq0<t54> {

    /* renamed from: e */
    public static final String f17473e = qk3.m25728f("NetworkNotRoamingCtrlr");

    public s54(Context context, bm6 bm6) {
        super(ht6.m19260c(context, bm6).mo21386d());
    }

    /* renamed from: b */
    public boolean mo11420b(an7 an7) {
        if (an7.f213j.mo23759b() == NetworkType.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo11421c(t54 t54) {
        if (Build.VERSION.SDK_INT < 24) {
            qk3.m25726c().mo25135a(f17473e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !t54.mo26160a();
        } else if (!t54.mo26160a() || !t54.mo26162c()) {
            return true;
        } else {
            return false;
        }
    }
}
