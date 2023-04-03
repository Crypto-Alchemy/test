package p000;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: g83 */
/* compiled from: JvmPackagePartSource.kt */
public final class g83 implements sd1 {

    /* renamed from: b */
    public final y73 f37985b;

    /* renamed from: c */
    public final y73 f37986c;

    /* renamed from: d */
    public final lt2<c83> f37987d;

    /* renamed from: e */
    public final boolean f37988e;

    /* renamed from: f */
    public final DeserializedContainerAbiStability f37989f;

    /* renamed from: g */
    public final tc3 f37990g;

    /* renamed from: h */
    public final String f37991h;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0032, code lost:
        r2 = r5.getString(r2.intValue());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g83(p000.y73 r2, p000.y73 r3, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r4, p000.t24 r5, p000.lt2<p000.c83> r6, boolean r7, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r8, p000.tc3 r9) {
        /*
            r1 = this;
            java.lang.String r0 = "className"
            p000.vx2.m53591g(r2, r0)
            java.lang.String r0 = "packageProto"
            p000.vx2.m53591g(r4, r0)
            java.lang.String r0 = "nameResolver"
            p000.vx2.m53591g(r5, r0)
            java.lang.String r0 = "abiStability"
            p000.vx2.m53591g(r8, r0)
            r1.<init>()
            r1.f37985b = r2
            r1.f37986c = r3
            r1.f37987d = r6
            r1.f37988e = r7
            r1.f37989f = r8
            r1.f37990g = r9
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, java.lang.Integer> r2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.f39876m
            java.lang.String r3 = "packageModuleName"
            p000.vx2.m53590f(r2, r3)
            java.lang.Object r2 = p000.wx4.m73751a(r4, r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x003c
            int r2 = r2.intValue()
            java.lang.String r2 = r5.getString(r2)
            if (r2 != 0) goto L_0x003e
        L_0x003c:
            java.lang.String r2 = "main"
        L_0x003e:
            r1.f37991h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g83.<init>(y73, y73, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, t24, lt2, boolean, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability, tc3):void");
    }

    /* renamed from: a */
    public String mo51875a() {
        return "Class '" + mo51876d().mo62673b().mo66195b() + '\'';
    }

    /* renamed from: b */
    public b66 mo50072b() {
        b66 b66 = b66.f36690a;
        vx2.m53590f(b66, "NO_SOURCE_FILE");
        return b66;
    }

    /* renamed from: d */
    public final nf0 mo51876d() {
        return new nf0(mo51877e().mo67044g(), mo51880h());
    }

    /* renamed from: e */
    public y73 mo51877e() {
        return this.f37985b;
    }

    /* renamed from: f */
    public y73 mo51878f() {
        return this.f37986c;
    }

    /* renamed from: g */
    public final tc3 mo51879g() {
        return this.f37990g;
    }

    /* renamed from: h */
    public final r24 mo51880h() {
        String f = mo51877e().mo67043f();
        vx2.m53590f(f, "className.internalName");
        r24 h = r24.m71445h(StringsKt__StringsKt.m63076O0(f, '/', (String) null, 2, (Object) null));
        vx2.m53590f(h, "identifier(className.int….substringAfterLast('/'))");
        return h;
    }

    public String toString() {
        return g83.class.getSimpleName() + ": " + mo51877e();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g83(p000.tc3 r11, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r12, p000.t24 r13, p000.lt2<p000.c83> r14, boolean r15, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r16) {
        /*
            r10 = this;
            java.lang.String r0 = "kotlinClass"
            r9 = r11
            p000.vx2.m53591g(r11, r0)
            java.lang.String r0 = "packageProto"
            r4 = r12
            p000.vx2.m53591g(r12, r0)
            java.lang.String r0 = "nameResolver"
            r5 = r13
            p000.vx2.m53591g(r13, r0)
            java.lang.String r0 = "abiStability"
            r8 = r16
            p000.vx2.m53591g(r8, r0)
            nf0 r0 = r11.mo65268i()
            y73 r2 = p000.y73.m74291b(r0)
            java.lang.String r0 = "byClassId(kotlinClass.classId)"
            p000.vx2.m53590f(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r11.mo65261a()
            java.lang.String r0 = r0.mo53824e()
            r1 = 0
            if (r0 == 0) goto L_0x0040
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x0039
            r3 = 1
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x0040
            y73 r1 = p000.y73.m74293d(r0)
        L_0x0040:
            r3 = r1
            r1 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g83.<init>(tc3, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, t24, lt2, boolean, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability):void");
    }
}
