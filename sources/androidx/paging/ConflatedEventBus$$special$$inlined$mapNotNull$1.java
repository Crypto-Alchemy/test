package androidx.paging;

import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: SafeCollector.common.kt */
public final class ConflatedEventBus$$special$$inlined$mapNotNull$1 implements z42<T> {

    /* renamed from: a */
    public final /* synthetic */ z42 f6124a;

    public ConflatedEventBus$$special$$inlined$mapNotNull$1(z42 z42) {
        this.f6124a = z42;
    }

    /* renamed from: a */
    public Object mo8646a(final a52 a52, ns0 ns0) {
        Object a = this.f6124a.mo8646a(new a52<Pair<? extends Integer, ? extends T>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, p000.ns0 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.paging.ConflatedEventBus$$special$$inlined$mapNotNull$1.C11452.C11461
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    androidx.paging.ConflatedEventBus$$special$$inlined$mapNotNull$1$2$1 r0 = (androidx.paging.ConflatedEventBus$$special$$inlined$mapNotNull$1.C11452.C11461) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.paging.ConflatedEventBus$$special$$inlined$mapNotNull$1$2$1 r0 = new androidx.paging.ConflatedEventBus$$special$$inlined$mapNotNull$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = p000.wx2.m54101d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p000.hg5.m45199b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p000.hg5.m45199b(r6)
                    a52 r6 = r3
                    kotlin.Pair r5 = (kotlin.Pair) r5
                    java.lang.Object r5 = r5.getSecond()
                    if (r5 == 0) goto L_0x004a
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    r37 r5 = p000.r37.f33317a
                    goto L_0x004c
                L_0x004a:
                    r37 r5 = p000.r37.f33317a
                L_0x004c:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.ConflatedEventBus$$special$$inlined$mapNotNull$1.C11452.emit(java.lang.Object, ns0):java.lang.Object");
            }
        }, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }
}
