package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\r"}, mo44877d2 = {"Ltz2;", "Lhp4;", "", "cause", "exception", "Lr37;", "a", "", "version", "", "c", "<init>", "()V", "kotlin-stdlib-jdk7"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tz2 */
/* compiled from: JDK7PlatformImplementations.kt */
public class tz2 extends hp4 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Ltz2$a;", "", "", "b", "Ljava/lang/Integer;", "sdkVersion", "<init>", "()V", "kotlin-stdlib-jdk7"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tz2$a */
    /* compiled from: JDK7PlatformImplementations.kt */
    public static final class C6559a {

        /* renamed from: a */
        public static final C6559a f34428a = new C6559a();

        /* renamed from: b */
        public static final Integer f34429b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                tz2$a r0 = new tz2$a
                r0.<init>()
                f34428a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                f34429b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.tz2.C6559a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo43339a(Throwable th, Throwable th2) {
        vx2.m53591g(th, "cause");
        vx2.m53591g(th2, "exception");
        if (mo48279c(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo43339a(th, th2);
        }
    }

    /* renamed from: c */
    public final boolean mo48279c(int i) {
        Integer num = C6559a.f34429b;
        if (num == null || num.intValue() >= i) {
            return true;
        }
        return false;
    }
}
