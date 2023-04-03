package p000;

import com.google.android.gms.internal.measurement.zzlc;
import java.util.Iterator;
import java.util.Map;

/* renamed from: h79 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class h79 {
    /* renamed from: a */
    public static final int m45064a(int i, Object obj, Object obj2) {
        zzlc zzlc = (zzlc) obj;
        f79 f79 = (f79) obj2;
        if (zzlc.isEmpty()) {
            return 0;
        }
        Iterator it = zzlc.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m45065b(Object obj, Object obj2) {
        zzlc zzlc = (zzlc) obj;
        zzlc zzlc2 = (zzlc) obj2;
        if (!zzlc2.isEmpty()) {
            if (!zzlc.zze()) {
                zzlc = zzlc.zzc();
            }
            zzlc.zzb(zzlc2);
        }
        return zzlc;
    }
}
