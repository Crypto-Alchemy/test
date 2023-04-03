package androidx.paging;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: SafeCollector.common.kt */
public final class CachedPagingDataKt$cachedIn$$inlined$map$1 implements z42<MulticastedPagingData<T>> {

    /* renamed from: a */
    public final /* synthetic */ z42 f6115a;

    /* renamed from: d */
    public final /* synthetic */ hu0 f6116d;

    public CachedPagingDataKt$cachedIn$$inlined$map$1(z42 z42, hu0 hu0) {
        this.f6115a = z42;
        this.f6116d = hu0;
    }

    /* renamed from: a */
    public Object mo8646a(final a52 a52, ns0 ns0) {
        Object a = this.f6115a.mo8646a(new a52<cl4<T>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r11, p000.ns0 r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.C11402.C11411
                    if (r0 == 0) goto L_0x0013
                    r0 = r12
                    androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = (androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.C11402.C11411) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = new androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1
                    r0.<init>(r10, r12)
                L_0x0018:
                    java.lang.Object r12 = r0.result
                    java.lang.Object r1 = p000.wx2.m54101d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p000.hg5.m45199b(r12)
                    goto L_0x004f
                L_0x0029:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L_0x0031:
                    p000.hg5.m45199b(r12)
                    a52 r12 = r3
                    r6 = r11
                    cl4 r6 = (p000.cl4) r6
                    androidx.paging.MulticastedPagingData r11 = new androidx.paging.MulticastedPagingData
                    androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1 r2 = r2
                    hu0 r5 = r2.f6116d
                    r7 = 0
                    r8 = 4
                    r9 = 0
                    r4 = r11
                    r4.<init>(r5, r6, r7, r8, r9)
                    r0.label = r3
                    java.lang.Object r11 = r12.emit(r11, r0)
                    if (r11 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    r37 r11 = p000.r37.f33317a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.C11402.emit(java.lang.Object, ns0):java.lang.Object");
            }
        }, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }
}
