package p000;

import com.google.android.gms.internal.vision.zzke;
import java.util.Iterator;
import java.util.Map;

/* renamed from: y49 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class y49 implements b59 {
    /* renamed from: a */
    public final Map<?, ?> mo29457a(Object obj) {
        return (zzke) obj;
    }

    /* renamed from: b */
    public final Map<?, ?> mo29458b(Object obj) {
        return (zzke) obj;
    }

    /* renamed from: d */
    public final Object mo29459d(Object obj) {
        ((zzke) obj).zzc();
        return obj;
    }

    /* renamed from: e */
    public final boolean mo29460e(Object obj) {
        if (!((zzke) obj).zzd()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final v49<?, ?> mo29461f(Object obj) {
        p49 p49 = (p49) obj;
        throw new NoSuchMethodError();
    }

    /* renamed from: g */
    public final Object mo29462g(Object obj, Object obj2) {
        zzke zzke = (zzke) obj;
        zzke zzke2 = (zzke) obj2;
        if (!zzke2.isEmpty()) {
            if (!zzke.zzd()) {
                zzke = zzke.zzb();
            }
            zzke.zza(zzke2);
        }
        return zzke;
    }

    /* renamed from: h */
    public final Object mo29463h(Object obj) {
        return zzke.zza().zzb();
    }

    /* renamed from: i */
    public final int mo29464i(int i, Object obj, Object obj2) {
        zzke zzke = (zzke) obj;
        p49 p49 = (p49) obj2;
        if (zzke.isEmpty()) {
            return 0;
        }
        Iterator it = zzke.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
