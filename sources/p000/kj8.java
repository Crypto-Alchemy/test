package p000;

import com.google.android.gms.internal.clearcut.zzdi;
import java.util.Iterator;
import java.util.Map;

/* renamed from: kj8 */
public final class kj8 implements ij8 {
    /* renamed from: c */
    public final Object mo43627c(Object obj, Object obj2) {
        zzdi zzdi = (zzdi) obj;
        zzdi zzdi2 = (zzdi) obj2;
        if (!zzdi2.isEmpty()) {
            if (!zzdi.isMutable()) {
                zzdi = zzdi.zzca();
            }
            zzdi.zza(zzdi2);
        }
        return zzdi;
    }

    /* renamed from: e */
    public final Object mo43628e(Object obj) {
        ((zzdi) obj).zzv();
        return obj;
    }

    /* renamed from: f */
    public final boolean mo43629f(Object obj) {
        return !((zzdi) obj).isMutable();
    }

    /* renamed from: g */
    public final int mo43630g(int i, Object obj, Object obj2) {
        zzdi zzdi = (zzdi) obj;
        if (zzdi.isEmpty()) {
            return 0;
        }
        Iterator it = zzdi.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    /* renamed from: h */
    public final dj8<?, ?> mo43631h(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: i */
    public final Object mo43632i(Object obj) {
        return zzdi.zzbz().zzca();
    }

    /* renamed from: j */
    public final Map<?, ?> mo43633j(Object obj) {
        return (zzdi) obj;
    }

    /* renamed from: k */
    public final Map<?, ?> mo43634k(Object obj) {
        return (zzdi) obj;
    }
}
