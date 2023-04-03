package p000;

import com.google.crypto.tink.shaded.protobuf.C4714e0;
import com.google.crypto.tink.shaded.protobuf.C4716f0;
import com.google.crypto.tink.shaded.protobuf.C4731j0;
import com.google.crypto.tink.shaded.protobuf.C4733k0;
import com.google.crypto.tink.shaded.protobuf.C4746m;
import com.google.crypto.tink.shaded.protobuf.C4756r;
import com.google.crypto.tink.shaded.protobuf.C4758t;
import com.google.crypto.tink.shaded.protobuf.C4774x;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.ProtoSyntax;

/* renamed from: jn3 */
/* compiled from: ManifestSchemaFactory */
public final class jn3 implements an5 {

    /* renamed from: b */
    public static final pu3 f30540b = new C6114a();

    /* renamed from: a */
    public final pu3 f30541a;

    /* renamed from: jn3$a */
    /* compiled from: ManifestSchemaFactory */
    public class C6114a implements pu3 {
        /* renamed from: a */
        public nu3 mo36020a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo36021b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: jn3$b */
    /* compiled from: ManifestSchemaFactory */
    public static class C6115b implements pu3 {

        /* renamed from: a */
        public pu3[] f30542a;

        public C6115b(pu3... pu3Arr) {
            this.f30542a = pu3Arr;
        }

        /* renamed from: a */
        public nu3 mo36020a(Class<?> cls) {
            for (pu3 pu3 : this.f30542a) {
                if (pu3.mo36021b(cls)) {
                    return pu3.mo36020a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        /* renamed from: b */
        public boolean mo36021b(Class<?> cls) {
            for (pu3 b : this.f30542a) {
                if (b.mo36021b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public jn3() {
        this(m46660b());
    }

    /* renamed from: b */
    public static pu3 m46660b() {
        return new C6115b(C4756r.m38304c(), m46661c());
    }

    /* renamed from: c */
    public static pu3 m46661c() {
        try {
            return (pu3) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f30540b;
        }
    }

    /* renamed from: d */
    public static boolean m46662d(nu3 nu3) {
        if (nu3.mo41895c() == ProtoSyntax.PROTO2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static <T> C4731j0<T> m46663e(Class<T> cls, nu3 nu3) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (m46662d(nu3)) {
                return C4714e0.m37655Q(cls, nu3, j64.m46158b(), C4774x.m38354b(), C4733k0.m38129M(), zx1.m55285b(), sn3.m51871b());
            }
            return C4714e0.m37655Q(cls, nu3, j64.m46158b(), C4774x.m38354b(), C4733k0.m38129M(), (C4746m<?>) null, sn3.m51871b());
        } else if (m46662d(nu3)) {
            return C4714e0.m37655Q(cls, nu3, j64.m46157a(), C4774x.m38353a(), C4733k0.m38124H(), zx1.m55284a(), sn3.m51870a());
        } else {
            return C4714e0.m37655Q(cls, nu3, j64.m46157a(), C4774x.m38353a(), C4733k0.m38125I(), (C4746m<?>) null, sn3.m51870a());
        }
    }

    /* renamed from: a */
    public <T> C4731j0<T> mo29027a(Class<T> cls) {
        C4733k0.m38126J(cls);
        nu3 a = this.f30541a.mo36020a(cls);
        if (!a.mo41893a()) {
            return m46663e(cls, a);
        }
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return C4716f0.m37739m(C4733k0.m38129M(), zx1.m55285b(), a.mo41894b());
        }
        return C4716f0.m37739m(C4733k0.m38124H(), zx1.m55284a(), a.mo41894b());
    }

    public jn3(pu3 pu3) {
        this.f30541a = (pu3) C4758t.m38321b(pu3, "messageInfoFactory");
    }
}
