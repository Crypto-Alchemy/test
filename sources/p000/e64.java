package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* renamed from: e64 */
/* compiled from: NewCapturedType.kt */
public final class e64 {
    /* renamed from: a */
    public static final List<f17> m57235a(w47 w47, CaptureStatus captureStatus) {
        w47 w472;
        boolean z;
        if (w47.mo51132F0().size() != w47.mo51134H0().getParameters().size()) {
            return null;
        }
        List<f17> F0 = w47.mo51132F0();
        boolean z2 = true;
        if (!(F0 instanceof Collection) || !F0.isEmpty()) {
            Iterator<T> it = F0.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((f17) it.next()).mo51409c() == Variance.INVARIANT) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            return null;
        }
        List<a17> parameters = w47.mo51134H0().getParameters();
        vx2.m53590f(parameters, "type.constructor.parameters");
        List<Pair<T, R>> R0 = CollectionsKt___CollectionsKt.m47321R0(F0, parameters);
        ArrayList arrayList = new ArrayList(dk0.m43495u(R0, 10));
        for (Pair pair : R0) {
            f17 f17 = (f17) pair.component1();
            a17 a17 = (a17) pair.component2();
            if (f17.mo51409c() != Variance.INVARIANT) {
                if (f17.mo51408b() || f17.mo51409c() != Variance.IN_VARIANCE) {
                    w472 = null;
                } else {
                    w472 = f17.getType().mo64506K0();
                }
                vx2.m53590f(a17, "parameter");
                f17 = TypeUtilsKt.m62945a(new d64(captureStatus, w472, f17, a17));
            }
            arrayList.add(f17);
        }
        TypeSubstitutor c = a07.f36338c.mo50027b(w47.mo51134H0(), arrayList).mo65206c();
        int size = F0.size();
        for (int i = 0; i < size; i++) {
            f17 f172 = F0.get(i);
            f17 f173 = (f17) arrayList.get(i);
            if (f172.mo51409c() != Variance.INVARIANT) {
                List<xc3> upperBounds = w47.mo51134H0().getParameters().get(i).getUpperBounds();
                vx2.m53590f(upperBounds, "type.constructor.parameters[index].upperBounds");
                ArrayList arrayList2 = new ArrayList();
                for (xc3 n : upperBounds) {
                    arrayList2.add(KotlinTypePreparator.C7727a.f40292a.mo52872a(c.mo55338n(n, Variance.INVARIANT).mo64506K0()));
                }
                if (!f172.mo51408b() && f172.mo51409c() == Variance.OUT_VARIANCE) {
                    arrayList2.add(KotlinTypePreparator.C7727a.f40292a.mo52872a(f172.getType().mo64506K0()));
                }
                xc3 type = f173.getType();
                vx2.m53589e(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                ((d64) type).mo51134H0().mo55356j(arrayList2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final d36 m57236b(d36 d36, CaptureStatus captureStatus) {
        vx2.m53591g(d36, "type");
        vx2.m53591g(captureStatus, "status");
        List<f17> a = m57235a(d36, captureStatus);
        if (a != null) {
            return m57237c(d36, a);
        }
        return null;
    }

    /* renamed from: c */
    public static final d36 m57237c(w47 w47, List<? extends f17> list) {
        return KotlinTypeFactory.m62853i(w47.mo51133G0(), w47.mo51134H0(), list, w47.mo51135I0(), (bd3) null, 16, (Object) null);
    }
}
