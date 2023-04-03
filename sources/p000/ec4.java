package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* renamed from: ec4 */
/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
public final class ec4 {

    /* renamed from: a */
    public final NullabilityQualifier f37501a;

    /* renamed from: b */
    public final boolean f37502b;

    public ec4(NullabilityQualifier nullabilityQualifier, boolean z) {
        vx2.m53591g(nullabilityQualifier, "qualifier");
        this.f37501a = nullabilityQualifier;
        this.f37502b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ ec4 m57269b(ec4 ec4, NullabilityQualifier nullabilityQualifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = ec4.f37501a;
        }
        if ((i & 2) != 0) {
            z = ec4.f37502b;
        }
        return ec4.mo51440a(nullabilityQualifier, z);
    }

    /* renamed from: a */
    public final ec4 mo51440a(NullabilityQualifier nullabilityQualifier, boolean z) {
        vx2.m53591g(nullabilityQualifier, "qualifier");
        return new ec4(nullabilityQualifier, z);
    }

    /* renamed from: c */
    public final NullabilityQualifier mo51441c() {
        return this.f37501a;
    }

    /* renamed from: d */
    public final boolean mo51442d() {
        return this.f37502b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec4)) {
            return false;
        }
        ec4 ec4 = (ec4) obj;
        return this.f37501a == ec4.f37501a && this.f37502b == ec4.f37502b;
    }

    public int hashCode() {
        int hashCode = this.f37501a.hashCode() * 31;
        boolean z = this.f37502b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f37501a + ", isForWarningOnly=" + this.f37502b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec4(NullabilityQualifier nullabilityQualifier, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i & 2) != 0 ? false : z);
    }
}
