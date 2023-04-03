package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C7433a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: ae2 */
/* compiled from: FunctionInvokeDescriptor.kt */
public final class ae2 extends h26 {

    /* renamed from: r1 */
    public static final C6822a f36443r1 = new C6822a((DefaultConstructorMarker) null);

    /* renamed from: ae2$a */
    /* compiled from: FunctionInvokeDescriptor.kt */
    public static final class C6822a {
        public C6822a() {
        }

        public /* synthetic */ C6822a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ae2 mo50148a(ud2 ud2, boolean z) {
            boolean z2;
            vx2.m53591g(ud2, "functionClass");
            List<a17> o = ud2.mo51670o();
            ae2 ae2 = new ae2(ud2, (ae2) null, CallableMemberDescriptor.Kind.DECLARATION, z, (DefaultConstructorMarker) null);
            h85 D0 = ud2.mo52460D0();
            List j = ck0.m33062j();
            List j2 = ck0.m33062j();
            ArrayList arrayList = new ArrayList();
            for (T next : o) {
                if (((a17) next).mo50049j() == Variance.IN_VARIANCE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                arrayList.add(next);
            }
            Iterable<wt2> Q0 = CollectionsKt___CollectionsKt.m47319Q0(arrayList);
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(Q0, 10));
            for (wt2 wt2 : Q0) {
                arrayList2.add(ae2.f36443r1.mo50149b(ae2, wt2.mo49265c(), (a17) wt2.mo49266d()));
            }
            ae2.mo52098L0((h85) null, D0, j, j2, arrayList2, ((a17) CollectionsKt___CollectionsKt.m47340k0(o)).mo51464n(), Modality.ABSTRACT, ed1.f37510e);
            ae2.mo53330T0(true);
            return ae2;
        }

        /* renamed from: b */
        public final n87 mo50149b(ae2 ae2, int i, a17 a17) {
            String str;
            String d = a17.getName().mo65594d();
            vx2.m53590f(d, "typeParameter.name.asString()");
            if (vx2.m53586b(d, "T")) {
                str = "instance";
            } else if (vx2.m53586b(d, "E")) {
                str = "receiver";
            } else {
                str = d.toLowerCase(Locale.ROOT);
                vx2.m53590f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            C6983dm b = C6983dm.f37317b.mo51228b();
            r24 h = r24.m71445h(str);
            vx2.m53590f(h, "identifier(name)");
            d36 n = a17.mo51464n();
            vx2.m53590f(n, "typeParameter.defaultType");
            a66 a66 = a66.f36360a;
            vx2.m53590f(a66, "NO_SOURCE");
            return new ValueParameterDescriptorImpl(ae2, (n87) null, i, b, h, n, false, false, false, (xc3) null, a66);
        }
    }

    public ae2(d31 d31, ae2 ae2, CallableMemberDescriptor.Kind kind, boolean z) {
        super(d31, ae2, C6983dm.f37317b.mo51228b(), oi4.f43693i, kind, a66.f36360a);
        mo53335Z0(true);
        mo53337b1(z);
        mo53329S0(false);
    }

    public /* synthetic */ ae2(d31 d31, ae2 ae2, CallableMemberDescriptor.Kind kind, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(d31, ae2, kind, z);
    }

    /* renamed from: F0 */
    public C7433a mo50142F0(d31 d31, C7425c cVar, CallableMemberDescriptor.Kind kind, r24 r24, C6983dm dmVar, a66 a66) {
        vx2.m53591g(d31, "newOwner");
        vx2.m53591g(kind, "kind");
        vx2.m53591g(dmVar, "annotations");
        vx2.m53591g(a66, "source");
        return new ae2(d31, (ae2) cVar, kind, isSuspend());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.reflect.jvm.internal.impl.descriptors.C7425c mo50143G0(kotlin.reflect.jvm.internal.impl.descriptors.impl.C7433a.C7436c r7) {
        /*
            r6 = this;
            java.lang.String r0 = "configuration"
            p000.vx2.m53591g(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.c r7 = super.mo50143G0(r7)
            ae2 r7 = (p000.ae2) r7
            if (r7 != 0) goto L_0x000f
            r7 = 0
            return r7
        L_0x000f:
            java.util.List r0 = r7.mo51763f()
            java.lang.String r1 = "substituted.valueParameters"
            p000.vx2.m53590f(r0, r1)
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            java.lang.String r4 = "it.type"
            r5 = 1
            if (r2 == 0) goto L_0x0028
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0028
        L_0x0026:
            r3 = r5
            goto L_0x004a
        L_0x0028:
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r0.next()
            n87 r2 = (p000.n87) r2
            xc3 r2 = r2.getType()
            p000.vx2.m53590f(r2, r4)
            r24 r2 = p000.ce2.m56398d(r2)
            if (r2 == 0) goto L_0x0047
            r2 = r5
            goto L_0x0048
        L_0x0047:
            r2 = r3
        L_0x0048:
            if (r2 == 0) goto L_0x002c
        L_0x004a:
            if (r3 == 0) goto L_0x004d
            return r7
        L_0x004d:
            java.util.List r0 = r7.mo51763f()
            p000.vx2.m53590f(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.dk0.m43495u(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0063:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x007e
            java.lang.Object r2 = r0.next()
            n87 r2 = (p000.n87) r2
            xc3 r2 = r2.getType()
            p000.vx2.m53590f(r2, r4)
            r24 r2 = p000.ce2.m56398d(r2)
            r1.add(r2)
            goto L_0x0063
        L_0x007e:
            kotlin.reflect.jvm.internal.impl.descriptors.c r7 = r7.mo50146j1(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ae2.mo50143G0(kotlin.reflect.jvm.internal.impl.descriptors.impl.a$c):kotlin.reflect.jvm.internal.impl.descriptors.c");
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053 A[RETURN] */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.descriptors.C7425c mo50146j1(java.util.List<p000.r24> r10) {
        /*
            r9 = this;
            java.util.List r0 = r9.mo51763f()
            int r0 = r0.size()
            int r1 = r10.size()
            int r0 = r0 - r1
            r1 = 1
            java.lang.String r2 = "valueParameters"
            r3 = 0
            if (r0 != 0) goto L_0x0054
            java.util.List r4 = r9.mo51763f()
            p000.vx2.m53590f(r4, r2)
            java.util.List r4 = kotlin.collections.CollectionsKt___CollectionsKt.m47321R0(r10, r4)
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x002a
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x002a
        L_0x0028:
            r4 = r1
            goto L_0x0051
        L_0x002a:
            java.util.Iterator r4 = r4.iterator()
        L_0x002e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0028
            java.lang.Object r5 = r4.next()
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r6 = r5.component1()
            r24 r6 = (p000.r24) r6
            java.lang.Object r5 = r5.component2()
            n87 r5 = (p000.n87) r5
            r24 r5 = r5.getName()
            boolean r5 = p000.vx2.m53586b(r6, r5)
            if (r5 != 0) goto L_0x002e
            r4 = r3
        L_0x0051:
            if (r4 == 0) goto L_0x0054
            return r9
        L_0x0054:
            java.util.List r4 = r9.mo51763f()
            p000.vx2.m53590f(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = p000.dk0.m43495u(r4, r5)
            r2.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x006a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0098
            java.lang.Object r5 = r4.next()
            n87 r5 = (p000.n87) r5
            r24 r6 = r5.getName()
            java.lang.String r7 = "it.name"
            p000.vx2.m53590f(r6, r7)
            int r7 = r5.getIndex()
            int r8 = r7 - r0
            if (r8 < 0) goto L_0x0090
            java.lang.Object r8 = r10.get(r8)
            r24 r8 = (p000.r24) r8
            if (r8 == 0) goto L_0x0090
            r6 = r8
        L_0x0090:
            n87 r5 = r5.mo53311B0(r9, r6, r7)
            r2.add(r5)
            goto L_0x006a
        L_0x0098:
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r0 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.f40287b
            kotlin.reflect.jvm.internal.impl.descriptors.impl.a$c r0 = r9.mo53323M0(r0)
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L_0x00a6
        L_0x00a4:
            r1 = r3
            goto L_0x00bd
        L_0x00a6:
            java.util.Iterator r10 = r10.iterator()
        L_0x00aa:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r4 = r10.next()
            r24 r4 = (p000.r24) r4
            if (r4 != 0) goto L_0x00ba
            r4 = r1
            goto L_0x00bb
        L_0x00ba:
            r4 = r3
        L_0x00bb:
            if (r4 == 0) goto L_0x00aa
        L_0x00bd:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.a$c r10 = r0.mo53347G(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.a$c r10 = r10.mo50954b(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.e r0 = r9.mo51329y0()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.a$c r10 = r10.mo50966m(r0)
            java.lang.String r0 = "newCopyBuilder(TypeSubst…   .setOriginal(original)"
            p000.vx2.m53590f(r10, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.c r10 = super.mo50143G0(r10)
            p000.vx2.m53588d(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ae2.mo50146j1(java.util.List):kotlin.reflect.jvm.internal.impl.descriptors.c");
    }

    /* renamed from: y */
    public boolean mo50147y() {
        return false;
    }
}
