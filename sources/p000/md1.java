package p000;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* renamed from: md1 */
/* compiled from: context.kt */
public final class md1 {

    /* renamed from: a */
    public final id1 f40886a;

    /* renamed from: b */
    public final t24 f40887b;

    /* renamed from: c */
    public final d31 f40888c;

    /* renamed from: d */
    public final w17 f40889d;

    /* renamed from: e */
    public final a97 f40890e;

    /* renamed from: f */
    public final o10 f40891f;

    /* renamed from: g */
    public final sd1 f40892g;

    /* renamed from: h */
    public final TypeDeserializer f40893h;

    /* renamed from: i */
    public final MemberDeserializer f40894i;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0052, code lost:
        r2 = r8.mo51875a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public md1(p000.id1 r2, p000.t24 r3, p000.d31 r4, p000.w17 r5, p000.a97 r6, p000.o10 r7, p000.sd1 r8, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r9, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r10) {
        /*
            r1 = this;
            java.lang.String r0 = "components"
            p000.vx2.m53591g(r2, r0)
            java.lang.String r0 = "nameResolver"
            p000.vx2.m53591g(r3, r0)
            java.lang.String r0 = "containingDeclaration"
            p000.vx2.m53591g(r4, r0)
            java.lang.String r0 = "typeTable"
            p000.vx2.m53591g(r5, r0)
            java.lang.String r0 = "versionRequirementTable"
            p000.vx2.m53591g(r6, r0)
            java.lang.String r0 = "metadataVersion"
            p000.vx2.m53591g(r7, r0)
            java.lang.String r0 = "typeParameters"
            p000.vx2.m53591g(r10, r0)
            r1.<init>()
            r1.f40886a = r2
            r1.f40887b = r3
            r1.f40888c = r4
            r1.f40889d = r5
            r1.f40890e = r6
            r1.f40891f = r7
            r1.f40892g = r8
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Deserializer for \""
            r2.append(r3)
            r24 r3 = r4.getName()
            r2.append(r3)
            r3 = 34
            r2.append(r3)
            java.lang.String r6 = r2.toString()
            if (r8 == 0) goto L_0x0058
            java.lang.String r2 = r8.mo51875a()
            if (r2 != 0) goto L_0x005a
        L_0x0058:
            java.lang.String r2 = "[container not found]"
        L_0x005a:
            r7 = r2
            r2 = r0
            r3 = r1
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f40893h = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer
            r2.<init>(r1)
            r1.f40894i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.md1.<init>(id1, t24, d31, w17, a97, o10, sd1, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer, java.util.List):void");
    }

    /* renamed from: b */
    public static /* synthetic */ md1 m64295b(md1 md1, d31 d31, List list, t24 t24, w17 w17, a97 a97, o10 o10, int i, Object obj) {
        if ((i & 4) != 0) {
            t24 = md1.f40887b;
        }
        t24 t242 = t24;
        if ((i & 8) != 0) {
            w17 = md1.f40889d;
        }
        w17 w172 = w17;
        if ((i & 16) != 0) {
            a97 = md1.f40890e;
        }
        a97 a972 = a97;
        if ((i & 32) != 0) {
            o10 = md1.f40891f;
        }
        return md1.mo56225a(d31, list, t242, w172, a972, o10);
    }

    /* renamed from: a */
    public final md1 mo56225a(d31 d31, List<ProtoBuf$TypeParameter> list, t24 t24, w17 w17, a97 a97, o10 o10) {
        d31 d312 = d31;
        vx2.m53591g(d31, "descriptor");
        List<ProtoBuf$TypeParameter> list2 = list;
        vx2.m53591g(list, "typeParameterProtos");
        t24 t242 = t24;
        vx2.m53591g(t24, "nameResolver");
        vx2.m53591g(w17, "typeTable");
        a97 a972 = a97;
        vx2.m53591g(a972, "versionRequirementTable");
        vx2.m53591g(o10, "metadataVersion");
        id1 id1 = this.f40886a;
        if (!b97.m55834b(o10)) {
            a972 = this.f40890e;
        }
        return new md1(id1, t24, d31, w17, a972, o10, this.f40892g, this.f40893h, list);
    }

    /* renamed from: c */
    public final id1 mo56226c() {
        return this.f40886a;
    }

    /* renamed from: d */
    public final sd1 mo56227d() {
        return this.f40892g;
    }

    /* renamed from: e */
    public final d31 mo56228e() {
        return this.f40888c;
    }

    /* renamed from: f */
    public final MemberDeserializer mo56229f() {
        return this.f40894i;
    }

    /* renamed from: g */
    public final t24 mo56230g() {
        return this.f40887b;
    }

    /* renamed from: h */
    public final da6 mo56231h() {
        return this.f40886a.mo52454u();
    }

    /* renamed from: i */
    public final TypeDeserializer mo56232i() {
        return this.f40893h;
    }

    /* renamed from: j */
    public final w17 mo56233j() {
        return this.f40889d;
    }

    /* renamed from: k */
    public final a97 mo56234k() {
        return this.f40890e;
    }
}
