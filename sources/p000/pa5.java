package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.C7513a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p000.tc3;

/* renamed from: pa5 */
/* compiled from: ReflectKotlinClass.kt */
public final class pa5 implements tc3 {

    /* renamed from: c */
    public static final C9174a f44018c = new C9174a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final Class<?> f44019a;

    /* renamed from: b */
    public final KotlinClassHeader f44020b;

    /* renamed from: pa5$a */
    /* compiled from: ReflectKotlinClass.kt */
    public static final class C9174a {
        public C9174a() {
        }

        public /* synthetic */ C9174a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final pa5 mo65270a(Class<?> cls) {
            vx2.m53591g(cls, "klass");
            C7513a aVar = new C7513a();
            n95.f41123a.mo56391b(cls, aVar);
            KotlinClassHeader m = aVar.mo53833m();
            if (m == null) {
                return null;
            }
            return new pa5(cls, m, (DefaultConstructorMarker) null);
        }
    }

    public pa5(Class<?> cls, KotlinClassHeader kotlinClassHeader) {
        this.f44019a = cls;
        this.f44020b = kotlinClassHeader;
    }

    public /* synthetic */ pa5(Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, kotlinClassHeader);
    }

    /* renamed from: a */
    public KotlinClassHeader mo65261a() {
        return this.f44020b;
    }

    /* renamed from: b */
    public void mo65262b(tc3.C9343c cVar, byte[] bArr) {
        vx2.m53591g(cVar, "visitor");
        n95.f41123a.mo56391b(this.f44019a, cVar);
    }

    /* renamed from: c */
    public void mo65263c(tc3.C9344d dVar, byte[] bArr) {
        vx2.m53591g(dVar, "visitor");
        n95.f41123a.mo56398i(this.f44019a, dVar);
    }

    /* renamed from: d */
    public final Class<?> mo65264d() {
        return this.f44019a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof pa5) || !vx2.m53586b(this.f44019a, ((pa5) obj).f44019a)) {
            return false;
        }
        return true;
    }

    public String getLocation() {
        StringBuilder sb = new StringBuilder();
        String name = this.f44019a.getName();
        vx2.m53590f(name, "klass.name");
        sb.append(yb6.m74331H(name, '.', '/', false, 4, (Object) null));
        sb.append(".class");
        return sb.toString();
    }

    public int hashCode() {
        return this.f44019a.hashCode();
    }

    /* renamed from: i */
    public nf0 mo65268i() {
        return ReflectClassUtilKt.m60593a(this.f44019a);
    }

    public String toString() {
        return pa5.class.getName() + ": " + this.f44019a;
    }
}
