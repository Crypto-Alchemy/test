package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: l39 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class l39 extends g39 {

    /* renamed from: c */
    public static final Class<?> f31177c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public l39() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: a39} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: a39} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: a39} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L> java.util.List<L> m47618e(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m47619f(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof p000.k39
            if (r1 == 0) goto L_0x0014
            a39 r0 = new a39
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof p000.j69
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof p000.h29
            if (r1 == 0) goto L_0x0024
            h29 r0 = (p000.h29) r0
            h29 r6 = r0.mo28813d(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            p000.l99.m47692j(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f31177c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            p000.l99.m47692j(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof p000.x89
            if (r1 == 0) goto L_0x0062
            a39 r1 = new a39
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            x89 r0 = (p000.x89) r0
            r1.addAll(r0)
            p000.l99.m47692j(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof p000.j69
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof p000.h29
            if (r1 == 0) goto L_0x007f
            r1 = r0
            h29 r1 = (p000.h29) r1
            boolean r2 = r1.zza()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            h29 r0 = r1.mo28813d(r0)
            p000.l99.m47692j(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l39.m47618e(java.lang.Object, long, int):java.util.List");
    }

    /* renamed from: f */
    public static <E> List<E> m47619f(Object obj, long j) {
        return (List) l99.m47673F(obj, j);
    }

    /* renamed from: b */
    public final <E> void mo42738b(Object obj, Object obj2, long j) {
        List f = m47619f(obj2, j);
        List e = m47618e(obj, j, f.size());
        int size = e.size();
        int size2 = f.size();
        if (size > 0 && size2 > 0) {
            e.addAll(f);
        }
        if (size > 0) {
            f = e;
        }
        l99.m47692j(obj, j, f);
    }

    /* renamed from: d */
    public final void mo42739d(Object obj, long j) {
        Object obj2;
        List list = (List) l99.m47673F(obj, j);
        if (list instanceof k39) {
            obj2 = ((k39) list).mo28811c();
        } else if (!f31177c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof j69) || !(list instanceof h29)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                h29 h29 = (h29) list;
                if (h29.zza()) {
                    h29.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        l99.m47692j(obj, j, obj2);
    }
}
