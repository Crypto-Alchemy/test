package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;

/* compiled from: IntersectionType.kt */
public final class TypeIntersector {

    /* renamed from: a */
    public static final TypeIntersector f40298a = new TypeIntersector();

    /* compiled from: IntersectionType.kt */
    public enum ResultNullability {
        ;

        /* compiled from: IntersectionType.kt */
        public static final class ACCEPT_NULL extends ResultNullability {
            public ACCEPT_NULL(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            public ResultNullability combine(w47 w47) {
                vx2.m53591g(w47, "nextType");
                return getResultNullability(w47);
            }
        }

        /* compiled from: IntersectionType.kt */
        public static final class NOT_NULL extends ResultNullability {
            public NOT_NULL(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            public NOT_NULL combine(w47 w47) {
                vx2.m53591g(w47, "nextType");
                return this;
            }
        }

        /* compiled from: IntersectionType.kt */
        public static final class START extends ResultNullability {
            public START(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            public ResultNullability combine(w47 w47) {
                vx2.m53591g(w47, "nextType");
                return getResultNullability(w47);
            }
        }

        /* compiled from: IntersectionType.kt */
        public static final class UNKNOWN extends ResultNullability {
            public UNKNOWN(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            public ResultNullability combine(w47 w47) {
                vx2.m53591g(w47, "nextType");
                ResultNullability resultNullability = getResultNullability(w47);
                if (resultNullability == ResultNullability.ACCEPT_NULL) {
                    return this;
                }
                return resultNullability;
            }
        }

        public abstract ResultNullability combine(w47 w47);

        public final ResultNullability getResultNullability(w47 w47) {
            vx2.m53591g(w47, "<this>");
            if (w47.mo51135I0()) {
                return ACCEPT_NULL;
            }
            if ((w47 instanceof eb1) && (((eb1) w47).mo51433T0() instanceof ec6)) {
                return NOT_NULL;
            }
            if (w47 instanceof ec6) {
                return UNKNOWN;
            }
            if (dc4.f37271a.mo51172a(w47)) {
                return NOT_NULL;
            }
            return UNKNOWN;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x000e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051 A[EDGE_INSN: B:24:0x0051->B:16:0x0051 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<p000.d36> mo55359b(java.util.Collection<? extends p000.d36> r8, p000.fd2<? super p000.d36, ? super p000.d36, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            p000.vx2.m53590f(r8, r1)
        L_0x000e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r8.next()
            d36 r1 = (p000.d36) r1
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0024
        L_0x0022:
            r3 = r4
            goto L_0x0051
        L_0x0024:
            java.util.Iterator r2 = r0.iterator()
        L_0x0028:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0022
            java.lang.Object r5 = r2.next()
            d36 r5 = (p000.d36) r5
            if (r5 == r1) goto L_0x004e
            java.lang.String r6 = "lower"
            p000.vx2.m53590f(r5, r6)
            java.lang.String r6 = "upper"
            p000.vx2.m53590f(r1, r6)
            java.lang.Object r5 = r9.invoke(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x004e
            r5 = r3
            goto L_0x004f
        L_0x004e:
            r5 = r4
        L_0x004f:
            if (r5 == 0) goto L_0x0028
        L_0x0051:
            if (r3 == 0) goto L_0x000e
            r8.remove()
            goto L_0x000e
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.mo55359b(java.util.Collection, fd2):java.util.Collection");
    }

    /* renamed from: c */
    public final d36 mo55360c(List<? extends d36> list) {
        vx2.m53591g(list, "types");
        list.size();
        ArrayList<w47> arrayList = new ArrayList<>();
        for (d36 d36 : list) {
            if (d36.mo51134H0() instanceof IntersectionTypeConstructor) {
                Collection<xc3> g = d36.mo51134H0().mo51811g();
                vx2.m53590f(g, "type.constructor.supertypes");
                ArrayList arrayList2 = new ArrayList(dk0.m43495u(g, 10));
                for (xc3 xc3 : g) {
                    vx2.m53590f(xc3, "it");
                    d36 d = n42.m64518d(xc3);
                    if (d36.mo51135I0()) {
                        d = d.mo51121O0(true);
                    }
                    arrayList2.add(d);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(d36);
            }
        }
        ResultNullability resultNullability = ResultNullability.START;
        for (w47 combine : arrayList) {
            resultNullability = resultNullability.combine(combine);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d36 d362 = (d36) it.next();
            if (resultNullability == ResultNullability.NOT_NULL) {
                if (d362 instanceof d64) {
                    d362 = o66.m70171k((d64) d362);
                }
                d362 = o66.m70169i(d362, false, 1, (Object) null);
            }
            linkedHashSet.add(d362);
        }
        ArrayList arrayList3 = new ArrayList(dk0.m43495u(list, 10));
        for (d36 G0 : list) {
            arrayList3.add(G0.mo51133G0());
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = ((rz6) next).mo65779s((rz6) it2.next());
            }
            return mo55361d(linkedHashSet).mo51122P0((rz6) next);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    /* renamed from: d */
    public final d36 mo55361d(Set<? extends d36> set) {
        if (set.size() == 1) {
            return (d36) CollectionsKt___CollectionsKt.m47354y0(set);
        }
        new C7729x7a6103fb(set);
        Collection<d36> b = mo55359b(set, new C7730x702eebb8(this));
        b.isEmpty();
        d36 b2 = IntegerLiteralTypeConstructor.f40089f.mo55075b(b);
        if (b2 != null) {
            return b2;
        }
        Collection<d36> b3 = mo55359b(b, new C7731xc97d8c34(k64.f38868b.mo52871a()));
        b3.isEmpty();
        if (b3.size() < 2) {
            return (d36) CollectionsKt___CollectionsKt.m47354y0(b3);
        }
        return new IntersectionTypeConstructor(set).mo55297h();
    }

    /* renamed from: e */
    public final boolean mo55362e(xc3 xc3, xc3 xc32) {
        l64 a = k64.f38868b.mo52871a();
        if (!a.mo55823c(xc3, xc32) || a.mo55823c(xc32, xc3)) {
            return false;
        }
        return true;
    }
}
