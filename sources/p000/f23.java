package p000;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;

/* renamed from: f23 */
/* compiled from: JavaTypeResolver.kt */
public final class f23 {

    /* renamed from: a */
    public final TypeUsage f37715a;

    /* renamed from: b */
    public final JavaTypeFlexibility f37716b;

    /* renamed from: c */
    public final boolean f37717c;

    /* renamed from: d */
    public final Set<a17> f37718d;

    /* renamed from: e */
    public final d36 f37719e;

    public f23(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, Set<? extends a17> set, d36 d36) {
        vx2.m53591g(typeUsage, "howThisTypeIsUsed");
        vx2.m53591g(javaTypeFlexibility, "flexibility");
        this.f37715a = typeUsage;
        this.f37716b = javaTypeFlexibility;
        this.f37717c = z;
        this.f37718d = set;
        this.f37719e = d36;
    }

    /* renamed from: b */
    public static /* synthetic */ f23 m57551b(f23 f23, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, Set<a17> set, d36 d36, int i, Object obj) {
        if ((i & 1) != 0) {
            typeUsage = f23.f37715a;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = f23.f37716b;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        if ((i & 4) != 0) {
            z = f23.f37717c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            set = f23.f37718d;
        }
        Set<a17> set2 = set;
        if ((i & 16) != 0) {
            d36 = f23.f37719e;
        }
        return f23.mo51579a(typeUsage, javaTypeFlexibility2, z2, set2, d36);
    }

    /* renamed from: a */
    public final f23 mo51579a(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, Set<? extends a17> set, d36 d36) {
        vx2.m53591g(typeUsage, "howThisTypeIsUsed");
        vx2.m53591g(javaTypeFlexibility, "flexibility");
        return new f23(typeUsage, javaTypeFlexibility, z, set, d36);
    }

    /* renamed from: c */
    public final d36 mo51580c() {
        return this.f37719e;
    }

    /* renamed from: d */
    public final JavaTypeFlexibility mo51581d() {
        return this.f37716b;
    }

    /* renamed from: e */
    public final TypeUsage mo51582e() {
        return this.f37715a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f23)) {
            return false;
        }
        f23 f23 = (f23) obj;
        return this.f37715a == f23.f37715a && this.f37716b == f23.f37716b && this.f37717c == f23.f37717c && vx2.m53586b(this.f37718d, f23.f37718d) && vx2.m53586b(this.f37719e, f23.f37719e);
    }

    /* renamed from: f */
    public final Set<a17> mo51584f() {
        return this.f37718d;
    }

    /* renamed from: g */
    public final boolean mo51585g() {
        return this.f37717c;
    }

    /* renamed from: h */
    public final f23 mo51586h(d36 d36) {
        return m57551b(this, (TypeUsage) null, (JavaTypeFlexibility) null, false, (Set) null, d36, 15, (Object) null);
    }

    public int hashCode() {
        int hashCode = ((this.f37715a.hashCode() * 31) + this.f37716b.hashCode()) * 31;
        boolean z = this.f37717c;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        Set<a17> set = this.f37718d;
        int i2 = 0;
        int hashCode2 = (i + (set == null ? 0 : set.hashCode())) * 31;
        d36 d36 = this.f37719e;
        if (d36 != null) {
            i2 = d36.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: i */
    public final f23 mo51588i(JavaTypeFlexibility javaTypeFlexibility) {
        vx2.m53591g(javaTypeFlexibility, "flexibility");
        return m57551b(this, (TypeUsage) null, javaTypeFlexibility, false, (Set) null, (d36) null, 29, (Object) null);
    }

    /* renamed from: j */
    public final f23 mo51589j(a17 a17) {
        Set<T> set;
        vx2.m53591g(a17, "typeParameter");
        Set<a17> set2 = this.f37718d;
        if (set2 != null) {
            set = oy5.m49612l(set2, a17);
        } else {
            set = my5.m48548d(a17);
        }
        return m57551b(this, (TypeUsage) null, (JavaTypeFlexibility) null, false, set, (d36) null, 23, (Object) null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f37715a + ", flexibility=" + this.f37716b + ", isForAnnotationParameter=" + this.f37717c + ", visitedTypeParameters=" + this.f37718d + ", defaultType=" + this.f37719e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f23(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, Set set, d36 d36, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : set, (i & 16) != 0 ? null : d36);
    }
}
