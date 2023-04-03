package com.google.protobuf;

import com.google.protobuf.C5011t;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.x */
/* compiled from: ListFieldSchema */
public abstract class C5027x {

    /* renamed from: a */
    public static final C5027x f25764a = new C5029b();

    /* renamed from: b */
    public static final C5027x f25765b = new C5030c();

    /* renamed from: com.google.protobuf.x$b */
    /* compiled from: ListFieldSchema */
    public static final class C5029b extends C5027x {

        /* renamed from: c */
        public static final Class<?> f25766c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C5029b() {
            super();
        }

        /* renamed from: f */
        public static <E> List<E> m39970f(Object obj, long j) {
            return (List) p47.m49687G(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.w} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.w} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.w} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <L> java.util.List<L> m39971g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m39970f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof p000.wf3
                if (r1 == 0) goto L_0x0014
                com.google.protobuf.w r0 = new com.google.protobuf.w
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof p000.bv4
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.protobuf.C5011t.C5020i
                if (r1 == 0) goto L_0x0024
                com.google.protobuf.t$i r0 = (com.google.protobuf.C5011t.C5020i) r0
                com.google.protobuf.t$i r6 = r0.mo37216a(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                p000.p47.m49703W(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = f25766c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                p000.p47.m49703W(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof p000.d47
                if (r1 == 0) goto L_0x0062
                com.google.protobuf.w r1 = new com.google.protobuf.w
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                d47 r0 = (p000.d47) r0
                r1.addAll(r0)
                p000.p47.m49703W(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof p000.bv4
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof com.google.protobuf.C5011t.C5020i
                if (r1 == 0) goto L_0x007f
                r1 = r0
                com.google.protobuf.t$i r1 = (com.google.protobuf.C5011t.C5020i) r1
                boolean r2 = r1.mo37090v()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.protobuf.t$i r0 = r1.mo37216a(r0)
                p000.p47.m49703W(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5027x.C5029b.m39971g(java.lang.Object, long, int):java.util.List");
        }

        /* renamed from: c */
        public void mo37557c(Object obj, long j) {
            Object obj2;
            List list = (List) p47.m49687G(obj, j);
            if (list instanceof wf3) {
                obj2 = ((wf3) list).mo37549l();
            } else if (!f25766c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof bv4) || !(list instanceof C5011t.C5020i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C5011t.C5020i iVar = (C5011t.C5020i) list;
                    if (iVar.mo37090v()) {
                        iVar.mo37085p();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            p47.m49703W(obj, j, obj2);
        }

        /* renamed from: d */
        public <E> void mo37558d(Object obj, Object obj2, long j) {
            List f = m39970f(obj2, j);
            List g = m39971g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            p47.m49703W(obj, j, f);
        }

        /* renamed from: e */
        public <L> List<L> mo37559e(Object obj, long j) {
            return m39971g(obj, j, 10);
        }
    }

    /* renamed from: com.google.protobuf.x$c */
    /* compiled from: ListFieldSchema */
    public static final class C5030c extends C5027x {
        public C5030c() {
            super();
        }

        /* renamed from: f */
        public static <E> C5011t.C5020i<E> m39975f(Object obj, long j) {
            return (C5011t.C5020i) p47.m49687G(obj, j);
        }

        /* renamed from: c */
        public void mo37557c(Object obj, long j) {
            m39975f(obj, j).mo37085p();
        }

        /* renamed from: d */
        public <E> void mo37558d(Object obj, Object obj2, long j) {
            C5011t.C5020i f = m39975f(obj, j);
            C5011t.C5020i f2 = m39975f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.mo37090v()) {
                    f = f.mo37216a(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            p47.m49703W(obj, j, f2);
        }

        /* renamed from: e */
        public <L> List<L> mo37559e(Object obj, long j) {
            int i;
            C5011t.C5020i f = m39975f(obj, j);
            if (f.mo37090v()) {
                return f;
            }
            int size = f.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            C5011t.C5020i a = f.mo37216a(i);
            p47.m49703W(obj, j, a);
            return a;
        }
    }

    public C5027x() {
    }

    /* renamed from: a */
    public static C5027x m39965a() {
        return f25764a;
    }

    /* renamed from: b */
    public static C5027x m39966b() {
        return f25765b;
    }

    /* renamed from: c */
    public abstract void mo37557c(Object obj, long j);

    /* renamed from: d */
    public abstract <L> void mo37558d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract <L> List<L> mo37559e(Object obj, long j);
}
