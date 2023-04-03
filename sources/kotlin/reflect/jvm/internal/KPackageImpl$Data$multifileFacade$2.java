package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KPackageImpl.kt */
public final class KPackageImpl$Data$multifileFacade$2 extends Lambda implements pc2<Class<?>> {
    public final /* synthetic */ KPackageImpl.Data this$0;
    public final /* synthetic */ KPackageImpl this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$multifileFacade$2(KPackageImpl.Data data, KPackageImpl kPackageImpl) {
        super(0);
        this.this$0 = data;
        this.this$1 = kPackageImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.mo65261a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class<?> invoke() {
        /*
            r8 = this;
            kotlin.reflect.jvm.internal.KPackageImpl$Data r0 = r8.this$0
            pa5 r0 = r0.mo53059c()
            r1 = 0
            if (r0 == 0) goto L_0x0015
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r0.mo65261a()
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.mo53824e()
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            if (r2 == 0) goto L_0x003c
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 == 0) goto L_0x003c
            kotlin.reflect.jvm.internal.KPackageImpl r0 = r8.this$1
            java.lang.Class r0 = r0.mo41920k()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r3 = 47
            r4 = 46
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r1 = p000.yb6.m74331H(r2, r3, r4, r5, r6, r7)
            java.lang.Class r1 = r0.loadClass(r1)
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPackageImpl$Data$multifileFacade$2.invoke():java.lang.Class");
    }
}
