package p000;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.random.Random;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, mo44877d2 = {"Lhp4;", "", "", "cause", "exception", "Lr37;", "a", "Lkotlin/random/Random;", "b", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: hp4 */
/* compiled from: PlatformImplementations.kt */
public class hp4 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, mo44877d2 = {"Lhp4$a;", "", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "addSuppressed", "c", "getSuppressed", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hp4$a */
    /* compiled from: PlatformImplementations.kt */
    public static final class C5929a {

        /* renamed from: a */
        public static final C5929a f29682a = new C5929a();

        /* renamed from: b */
        public static final Method f29683b;

        /* renamed from: c */
        public static final Method f29684c;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:1:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[EDGE_INSN: B:21:0x0043->B:12:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                hp4$a r0 = new hp4$a
                r0.<init>()
                f29682a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                p000.vx2.m53590f(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x0015:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = p000.vx2.m53586b(r7, r8)
                if (r7 == 0) goto L_0x003b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                p000.vx2.m53590f(r7, r8)
                java.lang.Object r7 = kotlin.collections.ArraysKt___ArraysKt.m47279e0(r7)
                boolean r7 = p000.vx2.m53586b(r7, r0)
                if (r7 == 0) goto L_0x003b
                r7 = 1
                goto L_0x003c
            L_0x003b:
                r7 = r3
            L_0x003c:
                if (r7 == 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0042:
                r6 = r5
            L_0x0043:
                f29683b = r6
                int r0 = r1.length
            L_0x0046:
                if (r3 >= r0) goto L_0x005b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = p000.vx2.m53586b(r4, r6)
                if (r4 == 0) goto L_0x0058
                r5 = r2
                goto L_0x005b
            L_0x0058:
                int r3 = r3 + 1
                goto L_0x0046
            L_0x005b:
                f29684c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.hp4.C5929a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo43339a(Throwable th, Throwable th2) {
        vx2.m53591g(th, "cause");
        vx2.m53591g(th2, "exception");
        Method method = C5929a.f29683b;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    /* renamed from: b */
    public Random mo43340b() {
        return new zy1();
    }
}
