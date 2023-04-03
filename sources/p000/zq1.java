package p000;

import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* renamed from: zq1 */
/* compiled from: constantValues.kt */
public final class zq1 extends fq0<Pair<? extends nf0, ? extends r24>> {

    /* renamed from: b */
    public final nf0 f46481b;

    /* renamed from: c */
    public final r24 f46482c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zq1(nf0 nf0, r24 r24) {
        super(wy6.m54142a(nf0, r24));
        vx2.m53591g(nf0, "enumClassId");
        vx2.m53591g(r24, "enumEntryName");
        this.f46481b = nf0;
        this.f46482c = r24;
    }

    /* renamed from: a */
    public xc3 mo50070a(mx3 mx3) {
        vx2.m53591g(mx3, "module");
        if0 a = FindClassInModuleKt.m60278a(mx3, this.f46481b);
        d36 d36 = null;
        if (a != null) {
            if (!dd1.m56796A(a)) {
                a = null;
            }
            if (a != null) {
                d36 = a.mo51464n();
            }
        }
        if (d36 != null) {
            return d36;
        }
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
        String nf0 = this.f46481b.toString();
        vx2.m53590f(nf0, "enumClassId.toString()");
        String r24 = this.f46482c.toString();
        vx2.m53590f(r24, "enumEntryName.toString()");
        return nr1.m70033d(errorTypeKind, nf0, r24);
    }

    /* renamed from: c */
    public final r24 mo67381c() {
        return this.f46482c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f46481b.mo62681j());
        sb.append('.');
        sb.append(this.f46482c);
        return sb.toString();
    }
}
