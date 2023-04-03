package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001e\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lpk4;", "Ldf0;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "k", "()Ljava/lang/Class;", "jClass", "d", "Ljava/lang/String;", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: pk4 */
/* compiled from: PackageReference.kt */
public final class pk4 implements df0 {

    /* renamed from: a */
    public final Class<?> f32721a;

    /* renamed from: d */
    public final String f32722d;

    public pk4(Class<?> cls, String str) {
        vx2.m53591g(cls, "jClass");
        vx2.m53591g(str, "moduleName");
        this.f32721a = cls;
        this.f32722d = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof pk4) || !vx2.m53586b(mo41920k(), ((pk4) obj).mo41920k())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return mo41920k().hashCode();
    }

    /* renamed from: k */
    public Class<?> mo41920k() {
        return this.f32721a;
    }

    public String toString() {
        return mo41920k().toString() + " (Kotlin reflection is not available)";
    }
}
