package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4758t;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.x */
/* compiled from: ListFieldSchema */
public abstract class C4774x {

    /* renamed from: a */
    public static final C4774x f25308a = new C4776b();

    /* renamed from: b */
    public static final C4774x f25309b = new C4777c();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$b */
    /* compiled from: ListFieldSchema */
    public static final class C4776b extends C4774x {

        /* renamed from: c */
        public static final Class<?> f25310c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C4776b() {
            super();
        }

        /* renamed from: f */
        public static <E> List<E> m38358f(Object obj, long j) {
            return (List) q47.m50234G(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.crypto.tink.shaded.protobuf.w} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.crypto.tink.shaded.protobuf.w} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.crypto.tink.shaded.protobuf.w} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <L> java.util.List<L> m38359g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m38358f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof p000.yf3
                if (r1 == 0) goto L_0x0014
                com.google.crypto.tink.shaded.protobuf.w r0 = new com.google.crypto.tink.shaded.protobuf.w
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof p000.cv4
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.C4758t.C4767i
                if (r1 == 0) goto L_0x0024
                com.google.crypto.tink.shaded.protobuf.t$i r0 = (com.google.crypto.tink.shaded.protobuf.C4758t.C4767i) r0
                com.google.crypto.tink.shaded.protobuf.t$i r6 = r0.mo35757a(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                p000.q47.m50250W(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = f25310c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                p000.q47.m50250W(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof p000.f47
                if (r1 == 0) goto L_0x0062
                com.google.crypto.tink.shaded.protobuf.w r1 = new com.google.crypto.tink.shaded.protobuf.w
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                f47 r0 = (p000.f47) r0
                r1.addAll(r0)
                p000.q47.m50250W(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof p000.cv4
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.C4758t.C4767i
                if (r1 == 0) goto L_0x007f
                r1 = r0
                com.google.crypto.tink.shaded.protobuf.t$i r1 = (com.google.crypto.tink.shaded.protobuf.C4758t.C4767i) r1
                boolean r2 = r1.mo35633v()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.crypto.tink.shaded.protobuf.t$i r0 = r1.mo35757a(r0)
                p000.q47.m50250W(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4774x.C4776b.m38359g(java.lang.Object, long, int):java.util.List");
        }

        /* renamed from: c */
        public void mo36071c(Object obj, long j) {
            Object obj2;
            List list = (List) q47.m50234G(obj, j);
            if (list instanceof yf3) {
                obj2 = ((yf3) list).mo36063l();
            } else if (!f25310c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof cv4) || !(list instanceof C4758t.C4767i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C4758t.C4767i iVar = (C4758t.C4767i) list;
                    if (iVar.mo35633v()) {
                        iVar.mo35628p();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            q47.m50250W(obj, j, obj2);
        }

        /* renamed from: d */
        public <E> void mo36072d(Object obj, Object obj2, long j) {
            List f = m38358f(obj2, j);
            List g = m38359g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            q47.m50250W(obj, j, f);
        }

        /* renamed from: e */
        public <L> List<L> mo36073e(Object obj, long j) {
            return m38359g(obj, j, 10);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$c */
    /* compiled from: ListFieldSchema */
    public static final class C4777c extends C4774x {
        public C4777c() {
            super();
        }

        /* renamed from: f */
        public static <E> C4758t.C4767i<E> m38363f(Object obj, long j) {
            return (C4758t.C4767i) q47.m50234G(obj, j);
        }

        /* renamed from: c */
        public void mo36071c(Object obj, long j) {
            m38363f(obj, j).mo35628p();
        }

        /* renamed from: d */
        public <E> void mo36072d(Object obj, Object obj2, long j) {
            C4758t.C4767i f = m38363f(obj, j);
            C4758t.C4767i f2 = m38363f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.mo35633v()) {
                    f = f.mo35757a(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            q47.m50250W(obj, j, f2);
        }

        /* renamed from: e */
        public <L> List<L> mo36073e(Object obj, long j) {
            int i;
            C4758t.C4767i f = m38363f(obj, j);
            if (f.mo35633v()) {
                return f;
            }
            int size = f.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            C4758t.C4767i a = f.mo35757a(i);
            q47.m50250W(obj, j, a);
            return a;
        }
    }

    public C4774x() {
    }

    /* renamed from: a */
    public static C4774x m38353a() {
        return f25308a;
    }

    /* renamed from: b */
    public static C4774x m38354b() {
        return f25309b;
    }

    /* renamed from: c */
    public abstract void mo36071c(Object obj, long j);

    /* renamed from: d */
    public abstract <L> void mo36072d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract <L> List<L> mo36073e(Object obj, long j);
}
