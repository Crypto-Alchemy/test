package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LazyScopeAdapter.kt */
public final class LazyScopeAdapter extends C9628y6 {

    /* renamed from: b */
    public final q84<MemberScope> f40113b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LazyScopeAdapter(p000.da6 r1, p000.pc2 r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto L_0x000b
            da6 r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.f40224e
            java.lang.String r3 = "NO_LOCKS"
            p000.vx2.m53590f(r1, r3)
        L_0x000b:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter.<init>(da6, pc2, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LazyScopeAdapter(pc2<? extends MemberScope> pc2) {
        this((da6) null, pc2, 1, (DefaultConstructorMarker) null);
        vx2.m53591g(pc2, "getScope");
    }

    /* renamed from: i */
    public MemberScope mo55094i() {
        return (MemberScope) this.f40113b.invoke();
    }

    public LazyScopeAdapter(da6 da6, pc2<? extends MemberScope> pc2) {
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(pc2, "getScope");
        this.f40113b = da6.mo51164i(new LazyScopeAdapter$lazyScope$1(pc2));
    }
}
