package p000;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;

/* renamed from: gf0 */
/* compiled from: ClassData.kt */
public final class gf0 {

    /* renamed from: a */
    public final t24 f38013a;

    /* renamed from: b */
    public final ProtoBuf$Class f38014b;

    /* renamed from: c */
    public final o10 f38015c;

    /* renamed from: d */
    public final a66 f38016d;

    public gf0(t24 t24, ProtoBuf$Class protoBuf$Class, o10 o10, a66 a66) {
        vx2.m53591g(t24, "nameResolver");
        vx2.m53591g(protoBuf$Class, "classProto");
        vx2.m53591g(o10, "metadataVersion");
        vx2.m53591g(a66, "sourceElement");
        this.f38013a = t24;
        this.f38014b = protoBuf$Class;
        this.f38015c = o10;
        this.f38016d = a66;
    }

    /* renamed from: a */
    public final t24 mo51909a() {
        return this.f38013a;
    }

    /* renamed from: b */
    public final ProtoBuf$Class mo51910b() {
        return this.f38014b;
    }

    /* renamed from: c */
    public final o10 mo51911c() {
        return this.f38015c;
    }

    /* renamed from: d */
    public final a66 mo51912d() {
        return this.f38016d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf0)) {
            return false;
        }
        gf0 gf0 = (gf0) obj;
        return vx2.m53586b(this.f38013a, gf0.f38013a) && vx2.m53586b(this.f38014b, gf0.f38014b) && vx2.m53586b(this.f38015c, gf0.f38015c) && vx2.m53586b(this.f38016d, gf0.f38016d);
    }

    public int hashCode() {
        return (((((this.f38013a.hashCode() * 31) + this.f38014b.hashCode()) * 31) + this.f38015c.hashCode()) * 31) + this.f38016d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f38013a + ", classProto=" + this.f38014b + ", metadataVersion=" + this.f38015c + ", sourceElement=" + this.f38016d + ')';
    }
}
