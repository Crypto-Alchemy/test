package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: c68 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class c68 implements op1<c68> {

    /* renamed from: d */
    public static final ye4<Object> f21610d = t58.f34116a;

    /* renamed from: a */
    public final Map<Class<?>, ye4<?>> f21611a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, j87<?>> f21612b = new HashMap();

    /* renamed from: c */
    public final ye4<Object> f21613c = f21610d;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ op1 mo29879a(Class cls, ye4 ye4) {
        this.f21611a.put(cls, ye4);
        this.f21612b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final j68 mo29880b() {
        return new j68(new HashMap(this.f21611a), new HashMap(this.f21612b), this.f21613c);
    }
}
