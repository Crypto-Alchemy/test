package p000;

import com.google.protobuf.C4965e0;
import com.google.protobuf.C4968f0;
import com.google.protobuf.C4984j0;
import com.google.protobuf.C4986k0;
import com.google.protobuf.C4999m;
import com.google.protobuf.C5009r;
import com.google.protobuf.C5011t;
import com.google.protobuf.C5027x;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ProtoSyntax;

/* renamed from: kn3 */
/* compiled from: ManifestSchemaFactory */
public final class kn3 implements zm5 {

    /* renamed from: b */
    public static final ou3 f30936b = new C6161a();

    /* renamed from: a */
    public final ou3 f30937a;

    /* renamed from: kn3$a */
    /* compiled from: ManifestSchemaFactory */
    public static class C6161a implements ou3 {
        /* renamed from: a */
        public mu3 mo37504a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo37505b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: kn3$b */
    /* compiled from: ManifestSchemaFactory */
    public static class C6162b implements ou3 {

        /* renamed from: a */
        public ou3[] f30938a;

        public C6162b(ou3... ou3Arr) {
            this.f30938a = ou3Arr;
        }

        /* renamed from: a */
        public mu3 mo37504a(Class<?> cls) {
            for (ou3 ou3 : this.f30938a) {
                if (ou3.mo37505b(cls)) {
                    return ou3.mo37504a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        /* renamed from: b */
        public boolean mo37505b(Class<?> cls) {
            for (ou3 b : this.f30938a) {
                if (b.mo37505b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public kn3() {
        this(m47184b());
    }

    /* renamed from: b */
    public static ou3 m47184b() {
        return new C6162b(C5009r.m39910c(), m47185c());
    }

    /* renamed from: c */
    public static ou3 m47185c() {
        try {
            return (ou3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f30936b;
        }
    }

    /* renamed from: d */
    public static boolean m47186d(mu3 mu3) {
        if (mu3.mo29936c() == ProtoSyntax.PROTO2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static <T> C4984j0<T> m47187e(Class<T> cls, mu3 mu3) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (m47186d(mu3)) {
                return C4965e0.m39242R(cls, mu3, i64.m45482b(), C5027x.m39966b(), C4986k0.m39726M(), yx1.m54889b(), rn3.m51178b());
            }
            return C4965e0.m39242R(cls, mu3, i64.m45482b(), C5027x.m39966b(), C4986k0.m39726M(), (C4999m<?>) null, rn3.m51178b());
        } else if (m47186d(mu3)) {
            return C4965e0.m39242R(cls, mu3, i64.m45481a(), C5027x.m39965a(), C4986k0.m39721H(), yx1.m54888a(), rn3.m51177a());
        } else {
            return C4965e0.m39242R(cls, mu3, i64.m45481a(), C5027x.m39965a(), C4986k0.m39722I(), (C4999m<?>) null, rn3.m51177a());
        }
    }

    /* renamed from: a */
    public <T> C4984j0<T> mo44845a(Class<T> cls) {
        C4986k0.m39723J(cls);
        mu3 a = this.f30937a.mo37504a(cls);
        if (!a.mo29934a()) {
            return m47187e(cls, a);
        }
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return C4968f0.m39327m(C4986k0.m39726M(), yx1.m54889b(), a.mo29935b());
        }
        return C4968f0.m39327m(C4986k0.m39721H(), yx1.m54888a(), a.mo29935b());
    }

    public kn3(ou3 ou3) {
        this.f30937a = (ou3) C5011t.m39928b(ou3, "messageInfoFactory");
    }
}
