package p000;

import com.google.android.gms.internal.clearcut.C4056e;

/* renamed from: si8 */
public final class si8 implements km8 {

    /* renamed from: b */
    public static final rj8 f33915b = new vi8();

    /* renamed from: a */
    public final rj8 f33916a;

    public si8() {
        this(new yi8(nf8.m48760c(), m51813c()));
    }

    public si8(rj8 rj8) {
        this.f33916a = (rj8) vf8.m53379e(rj8, "messageInfoFactory");
    }

    /* renamed from: b */
    public static boolean m51812b(pj8 pj8) {
        return pj8.mo46759a() == C4056e.C4061e.f22462i;
    }

    /* renamed from: c */
    public static rj8 m51813c() {
        try {
            return (rj8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f33915b;
        }
    }

    /* renamed from: a */
    public final <T> hm8<T> mo44844a(Class<T> cls) {
        Class<C4056e> cls2 = C4056e.class;
        nm8.m48847I(cls);
        pj8 b = this.f33916a.mo46074b(cls);
        if (b.mo46760b()) {
            return cls2.isAssignableFrom(cls) ? hk8.m45276j(nm8.m48840B(), qd8.m50526b(), b.mo46761c()) : hk8.m45276j(nm8.m48895z(), qd8.m50527c(), b.mo46761c());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean b2 = m51812b(b);
            nk8 b3 = sk8.m51825b();
            gh8 d = gh8.m44727d();
            go8<?, ?> B = nm8.m48840B();
            if (b2) {
                return dk8.m43523t(cls, b, b3, d, B, qd8.m50526b(), mj8.m48326b());
            }
            return dk8.m43523t(cls, b, b3, d, B, (id8<?>) null, mj8.m48326b());
        }
        boolean b4 = m51812b(b);
        nk8 a = sk8.m51824a();
        gh8 c = gh8.m44726c();
        if (b4) {
            return dk8.m43523t(cls, b, a, c, nm8.m48895z(), qd8.m50527c(), mj8.m48325a());
        }
        return dk8.m43523t(cls, b, a, c, nm8.m48839A(), (id8<?>) null, mj8.m48325a());
    }
}
