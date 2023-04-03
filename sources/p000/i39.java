package p000;

import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzmx;
import com.google.android.gms.internal.measurement.zzmy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.f39;

/* renamed from: i39 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class i39<T extends f39<T>> {

    /* renamed from: d */
    public static final i39 f29802d = new i39(true);

    /* renamed from: a */
    public final u99<T, Object> f29803a = new s89(16);

    /* renamed from: b */
    public boolean f29804b;

    /* renamed from: c */
    public boolean f29805c;

    public i39() {
    }

    /* renamed from: a */
    public static <T extends f39<T>> i39<T> m45458a() {
        throw null;
    }

    /* renamed from: d */
    public static final void m45459d(T t, Object obj) {
        boolean z;
        zzmx zzb = t.zzb();
        p59.m49796a(obj);
        zzmx zzmx = zzmx.DOUBLE;
        zzmy zzmy = zzmy.INT;
        switch (zzb.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzjd) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof x49)) {
                    return;
                }
            case 8:
                if (obj instanceof r79) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.zzb().zza(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo43456b() {
        if (!this.f29804b) {
            this.f29803a.mo47701a();
            this.f29804b = true;
        }
    }

    /* renamed from: c */
    public final void mo43457c(T t, Object obj) {
        if (!t.zzc()) {
            m45459d(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m45459d(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f29803a.put(t, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        i39 i39 = new i39();
        for (int i = 0; i < this.f29803a.mo48351c(); i++) {
            Map.Entry<T, Object> d = this.f29803a.mo48354d(i);
            i39.mo43457c((f39) d.getKey(), d.getValue());
        }
        for (Map.Entry next : this.f29803a.mo48355e()) {
            i39.mo43457c((f39) next.getKey(), next.getValue());
        }
        i39.f29805c = this.f29805c;
        return i39;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i39)) {
            return false;
        }
        return this.f29803a.equals(((i39) obj).f29803a);
    }

    public final int hashCode() {
        return this.f29803a.hashCode();
    }

    public i39(boolean z) {
        mo43456b();
        mo43456b();
    }
}
