package p000;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;

/* renamed from: vc3 */
/* compiled from: KotlinJvmBinarySourceElement.kt */
public final class vc3 implements sd1 {

    /* renamed from: b */
    public final tc3 f45269b;

    /* renamed from: c */
    public final lt2<c83> f45270c;

    /* renamed from: d */
    public final boolean f45271d;

    /* renamed from: e */
    public final DeserializedContainerAbiStability f45272e;

    public vc3(tc3 tc3, lt2<c83> lt2, boolean z, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        vx2.m53591g(tc3, "binaryClass");
        vx2.m53591g(deserializedContainerAbiStability, "abiStability");
        this.f45269b = tc3;
        this.f45270c = lt2;
        this.f45271d = z;
        this.f45272e = deserializedContainerAbiStability;
    }

    /* renamed from: a */
    public String mo51875a() {
        return "Class '" + this.f45269b.mo65268i().mo62673b().mo66195b() + '\'';
    }

    /* renamed from: b */
    public b66 mo50072b() {
        b66 b66 = b66.f36690a;
        vx2.m53590f(b66, "NO_SOURCE_FILE");
        return b66;
    }

    /* renamed from: d */
    public final tc3 mo66481d() {
        return this.f45269b;
    }

    public String toString() {
        return vc3.class.getSimpleName() + ": " + this.f45269b;
    }
}
