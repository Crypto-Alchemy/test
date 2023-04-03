package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\b"}, mo44877d2 = {"T", "Lkotlin/Function0;", "initializer", "Lef3;", "a", "Lkotlin/LazyThreadSafetyMode;", "mode", "b", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/LazyKt")
/* renamed from: kotlin.a */
/* compiled from: LazyJVM.kt */
public class C6169a {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: kotlin.a$a */
    /* compiled from: LazyJVM.kt */
    public /* synthetic */ class C6170a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30960a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlin.LazyThreadSafetyMode[] r0 = kotlin.LazyThreadSafetyMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.SYNCHRONIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.PUBLICATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f30960a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C6169a.C6170a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final <T> ef3<T> m47232a(pc2<? extends T> pc2) {
        vx2.m53591g(pc2, "initializer");
        return new SynchronizedLazyImpl(pc2, (Object) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final <T> ef3<T> m47233b(LazyThreadSafetyMode lazyThreadSafetyMode, pc2<? extends T> pc2) {
        vx2.m53591g(lazyThreadSafetyMode, "mode");
        vx2.m53591g(pc2, "initializer");
        int i = C6170a.f30960a[lazyThreadSafetyMode.ordinal()];
        if (i == 1) {
            return new SynchronizedLazyImpl(pc2, (Object) null, 2, (DefaultConstructorMarker) null);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(pc2);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(pc2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
