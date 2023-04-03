package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: CapturedTypeConstructor.kt */
public final class CapturedTypeConstructorKt {

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$a */
    /* compiled from: CapturedTypeConstructor.kt */
    public static final class C7661a extends qb1 {

        /* renamed from: d */
        public final /* synthetic */ boolean f40087d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7661a(p17 p17, boolean z) {
            super(p17);
            this.f40087d = z;
        }

        /* renamed from: b */
        public boolean mo55063b() {
            return this.f40087d;
        }

        /* JADX WARNING: type inference failed for: r4v2, types: [eg0] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p000.f17 mo50024e(p000.xc3 r4) {
            /*
                r3 = this;
                java.lang.String r0 = "key"
                p000.vx2.m53591g(r4, r0)
                f17 r0 = super.mo50024e(r4)
                r1 = 0
                if (r0 == 0) goto L_0x001f
                yz6 r4 = r4.mo51134H0()
                eg0 r4 = r4.mo51180d()
                boolean r2 = r4 instanceof p000.a17
                if (r2 == 0) goto L_0x001b
                r1 = r4
                a17 r1 = (p000.a17) r1
            L_0x001b:
                f17 r1 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.m62410b(r0, r1)
            L_0x001f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.C7661a.mo50024e(xc3):f17");
        }
    }

    /* renamed from: b */
    public static final f17 m62410b(f17 f17, a17 a17) {
        if (a17 == null || f17.mo51409c() == Variance.INVARIANT) {
            return f17;
        }
        if (a17.mo50049j() != f17.mo51409c()) {
            return new h17(m62411c(f17));
        }
        if (!f17.mo51408b()) {
            return new h17(f17.getType());
        }
        da6 da6 = LockBasedStorageManager.f40224e;
        vx2.m53590f(da6, "NO_LOCKS");
        return new h17(new LazyWrappedType(da6, new CapturedTypeConstructorKt$createCapturedIfNeeded$1(f17)));
    }

    /* renamed from: c */
    public static final xc3 m62411c(f17 f17) {
        vx2.m53591g(f17, "typeProjection");
        return new jb0(f17, (kb0) null, false, (rz6) null, 14, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static final boolean m62412d(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        return xc3.mo51134H0() instanceof kb0;
    }

    /* renamed from: e */
    public static final p17 m62413e(p17 p17, boolean z) {
        vx2.m53591g(p17, "<this>");
        if (!(p17 instanceof vt2)) {
            return new C7661a(p17, z);
        }
        vt2 vt2 = (vt2) p17;
        a17[] j = vt2.mo66581j();
        List<Pair> F0 = ArraysKt___ArraysKt.m47254F0(vt2.mo66580i(), vt2.mo66581j());
        ArrayList arrayList = new ArrayList(dk0.m43495u(F0, 10));
        for (Pair pair : F0) {
            arrayList.add(m62410b((f17) pair.getFirst(), (a17) pair.getSecond()));
        }
        Object[] array = arrayList.toArray(new f17[0]);
        vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new vt2(j, (f17[]) array, z);
    }

    /* renamed from: f */
    public static /* synthetic */ p17 m62414f(p17 p17, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m62413e(p17, z);
    }
}
