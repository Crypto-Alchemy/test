package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Ljc3;", "R", "", "", "toString", "", "hashCode", "other", "", "equals", "Ldx3;", "a", "Ldx3;", "b", "()Ldx3;", "module", "Lzv2;", "Lzv2;", "()Lzv2;", "factory", "<init>", "(Ldx3;Lzv2;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: jc3 */
/* compiled from: KoinDefinition.kt */
public final class jc3<R> {

    /* renamed from: a */
    public final dx3 f38642a;

    /* renamed from: b */
    public final zv2<R> f38643b;

    public jc3(dx3 dx3, zv2<R> zv2) {
        vx2.m53591g(dx3, "module");
        vx2.m53591g(zv2, "factory");
        this.f38642a = dx3;
        this.f38643b = zv2;
    }

    /* renamed from: a */
    public final zv2<R> mo52659a() {
        return this.f38643b;
    }

    /* renamed from: b */
    public final dx3 mo52660b() {
        return this.f38642a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc3)) {
            return false;
        }
        jc3 jc3 = (jc3) obj;
        return vx2.m53586b(this.f38642a, jc3.f38642a) && vx2.m53586b(this.f38643b, jc3.f38643b);
    }

    public int hashCode() {
        return (this.f38642a.hashCode() * 31) + this.f38643b.hashCode();
    }

    public String toString() {
        return "KoinDefinition(module=" + this.f38642a + ", factory=" + this.f38643b + ')';
    }
}
