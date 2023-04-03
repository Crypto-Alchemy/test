package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: vt2 */
/* compiled from: TypeSubstitution.kt */
public final class vt2 extends p17 {

    /* renamed from: c */
    public final a17[] f45381c;

    /* renamed from: d */
    public final f17[] f45382d;

    /* renamed from: e */
    public final boolean f45383e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt2(a17[] a17Arr, f17[] f17Arr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(a17Arr, f17Arr, (i & 4) != 0 ? false : z);
    }

    /* renamed from: b */
    public boolean mo55063b() {
        return this.f45383e;
    }

    /* renamed from: e */
    public f17 mo50024e(xc3 xc3) {
        a17 a17;
        vx2.m53591g(xc3, "key");
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d instanceof a17) {
            a17 = (a17) d;
        } else {
            a17 = null;
        }
        if (a17 == null) {
            return null;
        }
        int index = a17.getIndex();
        a17[] a17Arr = this.f45381c;
        if (index >= a17Arr.length || !vx2.m53586b(a17Arr[index].mo50046g(), a17.mo50046g())) {
            return null;
        }
        return this.f45382d[index];
    }

    /* renamed from: f */
    public boolean mo50031f() {
        if (this.f45382d.length == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final f17[] mo66580i() {
        return this.f45382d;
    }

    /* renamed from: j */
    public final a17[] mo66581j() {
        return this.f45381c;
    }

    public vt2(a17[] a17Arr, f17[] f17Arr, boolean z) {
        vx2.m53591g(a17Arr, "parameters");
        vx2.m53591g(f17Arr, "arguments");
        this.f45381c = a17Arr;
        this.f45382d = f17Arr;
        this.f45383e = z;
        int length = a17Arr.length;
        int length2 = f17Arr.length;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vt2(java.util.List<? extends p000.a17> r9, java.util.List<? extends p000.f17> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "parameters"
            p000.vx2.m53591g(r9, r0)
            java.lang.String r0 = "argumentsList"
            p000.vx2.m53591g(r10, r0)
            r0 = 0
            a17[] r1 = new p000.a17[r0]
            java.lang.Object[] r9 = r9.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            p000.vx2.m53589e(r9, r1)
            r3 = r9
            a17[] r3 = (p000.a17[]) r3
            f17[] r9 = new p000.f17[r0]
            java.lang.Object[] r9 = r10.toArray(r9)
            p000.vx2.m53589e(r9, r1)
            r4 = r9
            f17[] r4 = (p000.f17[]) r4
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vt2.<init>(java.util.List, java.util.List):void");
    }
}
