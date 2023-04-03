package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* compiled from: typeParameterUtils.kt */
public final class TypeParameterUtilsKt {
    /* renamed from: a */
    public static final pt4 m60319a(xc3 xc3) {
        fg0 fg0;
        vx2.m53591g(xc3, "<this>");
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d instanceof fg0) {
            fg0 = (fg0) d;
        } else {
            fg0 = null;
        }
        return m60320b(xc3, fg0, 0);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [d31] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p000.pt4 m60320b(p000.xc3 r5, p000.fg0 r6, int r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x005a
            boolean r1 = p000.nr1.m70034m(r6)
            if (r1 == 0) goto L_0x000a
            goto L_0x005a
        L_0x000a:
            java.util.List r1 = r6.mo51670o()
            int r1 = r1.size()
            int r1 = r1 + r7
            boolean r2 = r6.mo51669i()
            if (r2 != 0) goto L_0x003d
            java.util.List r2 = r5.mo51132F0()
            int r2 = r2.size()
            if (r1 == r2) goto L_0x0027
            boolean r1 = p000.dd1.m56800E(r6)
        L_0x0027:
            pt4 r1 = new pt4
            java.util.List r2 = r5.mo51132F0()
            java.util.List r5 = r5.mo51132F0()
            int r5 = r5.size()
            java.util.List r5 = r2.subList(r7, r5)
            r1.<init>(r6, r5, r0)
            return r1
        L_0x003d:
            java.util.List r2 = r5.mo51132F0()
            java.util.List r7 = r2.subList(r7, r1)
            pt4 r2 = new pt4
            d31 r3 = r6.mo51119b()
            boolean r4 = r3 instanceof p000.fg0
            if (r4 == 0) goto L_0x0052
            r0 = r3
            fg0 r0 = (p000.fg0) r0
        L_0x0052:
            pt4 r5 = m60320b(r5, r0, r1)
            r2.<init>(r6, r7, r5)
            return r2
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.m60320b(xc3, fg0, int):pt4");
    }

    /* renamed from: c */
    public static final ob0 m60321c(a17 a17, d31 d31, int i) {
        return new ob0(a17, d31, i);
    }

    /* renamed from: d */
    public static final List<a17> m60322d(fg0 fg0) {
        List<a17> list;
        d31 d31;
        yz6 g;
        vx2.m53591g(fg0, "<this>");
        List<a17> o = fg0.mo51670o();
        vx2.m53590f(o, "declaredTypeParameters");
        if (!fg0.mo51669i() && !(fg0.mo51119b() instanceof C7420a)) {
            return o;
        }
        List<R> D = SequencesKt___SequencesKt.m63020D(SequencesKt___SequencesKt.m63029s(SequencesKt___SequencesKt.m63025o(SequencesKt___SequencesKt.m63018B(DescriptorUtilsKt.m62452m(fg0), C7417x246a49e2.INSTANCE), C7418x246a49e3.INSTANCE), C7419x246a49e4.INSTANCE));
        Iterator<d31> it = DescriptorUtilsKt.m62452m(fg0).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                d31 = null;
                break;
            }
            d31 = it.next();
            if (d31 instanceof if0) {
                break;
            }
        }
        if0 if0 = (if0) d31;
        if (!(if0 == null || (g = if0.mo50046g()) == null)) {
            list = g.getParameters();
        }
        if (list == null) {
            list = ck0.m33062j();
        }
        if (!D.isEmpty() || !list.isEmpty()) {
            List<T> u0 = CollectionsKt___CollectionsKt.m47350u0(D, list);
            ArrayList arrayList = new ArrayList(dk0.m43495u(u0, 10));
            for (T t : u0) {
                vx2.m53590f(t, "it");
                arrayList.add(m60321c(t, fg0, o.size()));
            }
            return CollectionsKt___CollectionsKt.m47350u0(o, arrayList);
        }
        List<a17> o2 = fg0.mo51670o();
        vx2.m53590f(o2, "declaredTypeParameters");
        return o2;
    }
}
