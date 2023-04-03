package p000;

import kotlin.Metadata;
import kotlin.random.Random;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, mo44877d2 = {"Luz2;", "Ltz2;", "", "version", "", "c", "Lkotlin/random/Random;", "b", "<init>", "()V", "a", "kotlin-stdlib-jdk8"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: uz2 */
/* compiled from: JDK8PlatformImplementations.kt */
public class uz2 extends tz2 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Luz2$a;", "", "", "b", "Ljava/lang/Integer;", "sdkVersion", "<init>", "()V", "kotlin-stdlib-jdk8"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: uz2$a */
    /* compiled from: JDK8PlatformImplementations.kt */
    public static final class C6588a {

        /* renamed from: a */
        public static final C6588a f34760a = new C6588a();

        /* renamed from: b */
        public static final Integer f34761b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                uz2$a r0 = new uz2$a
                r0.<init>()
                f34760a = r0
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
                f34761b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.uz2.C6588a.<clinit>():void");
        }
    }

    /* renamed from: c */
    private final boolean m53073c(int i) {
        Integer num = C6588a.f34761b;
        if (num == null || num.intValue() >= i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Random mo43340b() {
        if (m53073c(34)) {
            return new sp4();
        }
        return super.mo43340b();
    }
}
