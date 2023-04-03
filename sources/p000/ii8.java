package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: ii8 */
public final class ii8 extends gh8 {

    /* renamed from: c */
    public static final Class<?> f29945c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public ii8() {
        super();
    }

    /* renamed from: e */
    public static <E> List<E> m45728e(Object obj, long j) {
        return (List) qp8.m50740M(obj, j);
    }

    /* renamed from: a */
    public final void mo42894a(Object obj, long j) {
        Object obj2;
        List list = (List) qp8.m50740M(obj, j);
        if (list instanceof ch8) {
            obj2 = ((ch8) list).mo30010h1();
        } else if (!f29945c.isAssignableFrom(list.getClass())) {
            obj2 = Collections.unmodifiableList(list);
        } else {
            return;
        }
        qp8.m50757i(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: zg8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: zg8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: zg8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void mo42895b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.util.List r6 = m45728e(r6, r7)
            int r0 = r6.size()
            java.util.List r1 = m45728e(r5, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0025
            boolean r1 = r1 instanceof p000.ch8
            if (r1 == 0) goto L_0x001c
            zg8 r1 = new zg8
            r1.<init>((int) r0)
            goto L_0x0021
        L_0x001c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0021:
            p000.qp8.m50757i(r5, r7, r1)
            goto L_0x0057
        L_0x0025:
            java.lang.Class<?> r2 = f29945c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0043
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x003e:
            p000.qp8.m50757i(r5, r7, r2)
            r1 = r2
            goto L_0x0057
        L_0x0043:
            boolean r2 = r1 instanceof p000.jp8
            if (r2 == 0) goto L_0x0057
            zg8 r2 = new zg8
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            jp8 r1 = (p000.jp8) r1
            r2.addAll(r1)
            goto L_0x003e
        L_0x0057:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0066
            if (r2 <= 0) goto L_0x0066
            r1.addAll(r6)
        L_0x0066:
            if (r0 <= 0) goto L_0x0069
            r6 = r1
        L_0x0069:
            p000.qp8.m50757i(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ii8.mo42895b(java.lang.Object, java.lang.Object, long):void");
    }
}
