package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;

/* compiled from: ClassDeserializer.kt */
public final class ClassDeserializer {

    /* renamed from: c */
    public static final C7670b f40134c = new C7670b((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final Set<nf0> f40135d = my5.m48548d(nf0.m69751m(C7395c.C7396a.f39162d.mo66454l()));

    /* renamed from: a */
    public final id1 f40136a;

    /* renamed from: b */
    public final rc2<C7669a, if0> f40137b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$a */
    /* compiled from: ClassDeserializer.kt */
    public static final class C7669a {

        /* renamed from: a */
        public final nf0 f40138a;

        /* renamed from: b */
        public final gf0 f40139b;

        public C7669a(nf0 nf0, gf0 gf0) {
            vx2.m53591g(nf0, "classId");
            this.f40138a = nf0;
            this.f40139b = gf0;
        }

        /* renamed from: a */
        public final gf0 mo55117a() {
            return this.f40139b;
        }

        /* renamed from: b */
        public final nf0 mo55118b() {
            return this.f40138a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7669a) || !vx2.m53586b(this.f40138a, ((C7669a) obj).f40138a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f40138a.hashCode();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$b */
    /* compiled from: ClassDeserializer.kt */
    public static final class C7670b {
        public C7670b() {
        }

        public /* synthetic */ C7670b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Set<nf0> mo55121a() {
            return ClassDeserializer.f40135d;
        }
    }

    public ClassDeserializer(id1 id1) {
        vx2.m53591g(id1, "components");
        this.f40136a = id1;
        this.f40137b = id1.mo52454u().mo51159d(new ClassDeserializer$classes$1(this));
    }

    /* renamed from: e */
    public static /* synthetic */ if0 m62527e(ClassDeserializer classDeserializer, nf0 nf0, gf0 gf0, int i, Object obj) {
        if ((i & 2) != 0) {
            gf0 = null;
        }
        return classDeserializer.mo55116d(nf0, gf0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8 A[EDGE_INSN: B:45:0x00b8->B:37:0x00b8 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.if0 mo55115c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.C7669a r13) {
        /*
            r12 = this;
            nf0 r0 = r13.mo55118b()
            id1 r1 = r12.f40136a
            java.lang.Iterable r1 = r1.mo52444k()
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0021
            java.lang.Object r2 = r1.next()
            kf0 r2 = (p000.kf0) r2
            if0 r2 = r2.mo51602a(r0)
            if (r2 == 0) goto L_0x000e
            return r2
        L_0x0021:
            java.util.Set<nf0> r1 = f40135d
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto L_0x002b
            return r2
        L_0x002b:
            gf0 r13 = r13.mo55117a()
            if (r13 != 0) goto L_0x003e
            id1 r13 = r12.f40136a
            hf0 r13 = r13.mo52438e()
            gf0 r13 = r13.mo52195a(r0)
            if (r13 != 0) goto L_0x003e
            return r2
        L_0x003e:
            t24 r1 = r13.mo51909a()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r10 = r13.mo51910b()
            o10 r11 = r13.mo51911c()
            a66 r13 = r13.mo51912d()
            nf0 r3 = r0.mo62677g()
            java.lang.String r4 = "classId.shortClassName"
            if (r3 == 0) goto L_0x0079
            r5 = 2
            if0 r3 = m62527e(r12, r3, r2, r5, r2)
            boolean r5 = r3 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
            if (r5 == 0) goto L_0x0062
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r3
            goto L_0x0063
        L_0x0062:
            r3 = r2
        L_0x0063:
            if (r3 != 0) goto L_0x0066
            return r2
        L_0x0066:
            r24 r0 = r0.mo62681j()
            p000.vx2.m53590f(r0, r4)
            boolean r0 = r3.mo55178a1(r0)
            if (r0 != 0) goto L_0x0074
            return r2
        L_0x0074:
            md1 r0 = r3.mo55172U0()
            goto L_0x00e4
        L_0x0079:
            id1 r3 = r12.f40136a
            hk4 r3 = r3.mo52451r()
            u82 r5 = r0.mo62678h()
            java.lang.String r6 = "classId.packageFqName"
            p000.vx2.m53590f(r5, r6)
            java.util.List r3 = p000.ik4.m58997c(r3, r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0090:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b7
            java.lang.Object r5 = r3.next()
            r6 = r5
            fk4 r6 = (p000.fk4) r6
            boolean r7 = r6 instanceof p000.vd1
            if (r7 == 0) goto L_0x00b3
            vd1 r6 = (p000.vd1) r6
            r24 r7 = r0.mo62681j()
            p000.vx2.m53590f(r7, r4)
            boolean r6 = r6.mo66490E0(r7)
            if (r6 == 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r6 = 0
            goto L_0x00b4
        L_0x00b3:
            r6 = 1
        L_0x00b4:
            if (r6 == 0) goto L_0x0090
            goto L_0x00b8
        L_0x00b7:
            r5 = r2
        L_0x00b8:
            r4 = r5
            fk4 r4 = (p000.fk4) r4
            if (r4 != 0) goto L_0x00be
            return r2
        L_0x00be:
            id1 r3 = r12.f40136a
            w17 r6 = new w17
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r0 = r10.getTypeTable()
            java.lang.String r2 = "classProto.typeTable"
            p000.vx2.m53590f(r0, r2)
            r6.<init>(r0)
            a97$a r0 = p000.a97.f36407b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r2 = r10.getVersionRequirementTable()
            java.lang.String r5 = "classProto.versionRequirementTable"
            p000.vx2.m53590f(r2, r5)
            a97 r7 = r0.mo50122a(r2)
            r9 = 0
            r5 = r1
            r8 = r11
            md1 r0 = r3.mo52434a(r4, r5, r6, r7, r8, r9)
        L_0x00e4:
            r4 = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
            r3 = r0
            r5 = r10
            r6 = r1
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.mo55115c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$a):if0");
    }

    /* renamed from: d */
    public final if0 mo55116d(nf0 nf0, gf0 gf0) {
        vx2.m53591g(nf0, "classId");
        return this.f40137b.invoke(new C7669a(nf0, gf0));
    }
}
