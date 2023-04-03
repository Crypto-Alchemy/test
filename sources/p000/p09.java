package p000;

import com.google.android.gms.internal.measurement.zzjd;
import java.util.Comparator;

/* renamed from: p09 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class p09 implements Comparator<zzjd> {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzjd zzjd = (zzjd) obj;
        zzjd zzjd2 = (zzjd) obj2;
        m09 m09 = new m09(zzjd);
        m09 m092 = new m09(zzjd2);
        while (m09.hasNext() && m092.hasNext()) {
            int compare = Integer.compare(m09.zza() & 255, m092.zza() & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzjd.zzc(), zzjd2.zzc());
    }
}
