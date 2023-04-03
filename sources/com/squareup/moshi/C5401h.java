package com.squareup.moshi;

import com.squareup.moshi.C5391d;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.squareup.moshi.h */
/* compiled from: Moshi */
public final class C5401h {

    /* renamed from: e */
    public static final List<C5391d.C5395d> f26731e;

    /* renamed from: a */
    public final List<C5391d.C5395d> f26732a;

    /* renamed from: b */
    public final int f26733b;

    /* renamed from: c */
    public final ThreadLocal<C5404c> f26734c = new ThreadLocal<>();

    /* renamed from: d */
    public final Map<Object, C5391d<?>> f26735d = new LinkedHashMap();

    /* renamed from: com.squareup.moshi.h$a */
    /* compiled from: Moshi */
    public static final class C5402a {

        /* renamed from: a */
        public final List<C5391d.C5395d> f26736a = new ArrayList();

        /* renamed from: b */
        public int f26737b = 0;

        /* renamed from: a */
        public C5402a mo39414a(C5391d.C5395d dVar) {
            if (dVar != null) {
                List<C5391d.C5395d> list = this.f26736a;
                int i = this.f26737b;
                this.f26737b = i + 1;
                list.add(i, dVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        /* renamed from: b */
        public C5402a mo39415b(C5391d.C5395d dVar) {
            if (dVar != null) {
                this.f26736a.add(dVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        /* renamed from: c */
        public C5401h mo39416c() {
            return new C5401h(this);
        }
    }

    /* renamed from: com.squareup.moshi.h$b */
    /* compiled from: Moshi */
    public static final class C5403b<T> extends C5391d<T> {

        /* renamed from: a */
        public final Type f26738a;

        /* renamed from: b */
        public final String f26739b;

        /* renamed from: c */
        public final Object f26740c;

        /* renamed from: d */
        public C5391d<T> f26741d;

        public C5403b(Type type, String str, Object obj) {
            this.f26738a = type;
            this.f26739b = str;
            this.f26740c = obj;
        }

        /* renamed from: b */
        public T mo39346b(JsonReader jsonReader) throws IOException {
            C5391d<T> dVar = this.f26741d;
            if (dVar != null) {
                return dVar.mo39346b(jsonReader);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        /* renamed from: j */
        public void mo39347j(q73 q73, T t) throws IOException {
            C5391d<T> dVar = this.f26741d;
            if (dVar != null) {
                dVar.mo39347j(q73, t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            C5391d<T> dVar = this.f26741d;
            if (dVar != null) {
                return dVar.toString();
            }
            return super.toString();
        }
    }

    /* renamed from: com.squareup.moshi.h$c */
    /* compiled from: Moshi */
    public final class C5404c {

        /* renamed from: a */
        public final List<C5403b<?>> f26742a = new ArrayList();

        /* renamed from: b */
        public final Deque<C5403b<?>> f26743b = new ArrayDeque();

        /* renamed from: c */
        public boolean f26744c;

        public C5404c() {
        }

        /* renamed from: a */
        public <T> void mo39418a(C5391d<T> dVar) {
            this.f26743b.getLast().f26741d = dVar;
        }

        /* renamed from: b */
        public IllegalArgumentException mo39419b(IllegalArgumentException illegalArgumentException) {
            if (this.f26744c) {
                return illegalArgumentException;
            }
            this.f26744c = true;
            if (this.f26743b.size() == 1 && this.f26743b.getFirst().f26739b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<C5403b<?>> descendingIterator = this.f26743b.descendingIterator();
            while (descendingIterator.hasNext()) {
                C5403b next = descendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.f26738a);
                if (next.f26739b != null) {
                    sb.append(' ');
                    sb.append(next.f26739b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        /* renamed from: c */
        public void mo39420c(boolean z) {
            this.f26743b.removeLast();
            if (this.f26743b.isEmpty()) {
                C5401h.this.f26734c.remove();
                if (z) {
                    synchronized (C5401h.this.f26735d) {
                        int size = this.f26742a.size();
                        for (int i = 0; i < size; i++) {
                            C5403b bVar = this.f26742a.get(i);
                            C5391d<T> dVar = (C5391d) C5401h.this.f26735d.put(bVar.f26740c, bVar.f26741d);
                            if (dVar != null) {
                                bVar.f26741d = dVar;
                                C5401h.this.f26735d.put(bVar.f26740c, dVar);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        public <T> C5391d<T> mo39421d(Type type, String str, Object obj) {
            int size = this.f26742a.size();
            for (int i = 0; i < size; i++) {
                C5403b bVar = this.f26742a.get(i);
                if (bVar.f26740c.equals(obj)) {
                    this.f26743b.add(bVar);
                    C5391d<T> dVar = bVar.f26741d;
                    if (dVar != null) {
                        return dVar;
                    }
                    return bVar;
                }
            }
            C5403b bVar2 = new C5403b(type, str, obj);
            this.f26742a.add(bVar2);
            this.f26743b.add(bVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f26731e = arrayList;
        arrayList.add(C5407j.f26747a);
        arrayList.add(C5387c.f26705b);
        arrayList.add(C5399g.f26728c);
        arrayList.add(C5382a.f26695c);
        arrayList.add(C5405i.f26746a);
        arrayList.add(C5384b.f26698d);
    }

    public C5401h(C5402a aVar) {
        int size = aVar.f26736a.size();
        List<C5391d.C5395d> list = f26731e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(aVar.f26736a);
        arrayList.addAll(list);
        this.f26732a = Collections.unmodifiableList(arrayList);
        this.f26733b = aVar.f26737b;
    }

    /* renamed from: c */
    public <T> C5391d<T> mo39408c(Class<T> cls) {
        return mo39410e(cls, t67.f34128a);
    }

    /* renamed from: d */
    public <T> C5391d<T> mo39409d(Type type) {
        return mo39410e(type, t67.f34128a);
    }

    /* renamed from: e */
    public <T> C5391d<T> mo39410e(Type type, Set<? extends Annotation> set) {
        return mo39411f(type, set, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r4.f26734c.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r1 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r1 = new com.squareup.moshi.C5401h.C5404c(r4);
        r4.f26734c.set(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r7 = r1.mo39421d(r5, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r7 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r1.mo39420c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r7 = r4.f26732a.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r2 >= r7) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r3 = r4.f26732a.get(r2).mo39349a(r5, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r3 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r1.mo39418a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r1.mo39420c(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        throw new java.lang.IllegalArgumentException("No JsonAdapter for " + p000.t67.m52119t(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        throw r1.mo39419b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        r1.mo39420c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        throw r5;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.squareup.moshi.C5391d<T> mo39411f(java.lang.reflect.Type r5, java.util.Set<? extends java.lang.annotation.Annotation> r6, java.lang.String r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0093
            if (r6 == 0) goto L_0x008b
            java.lang.reflect.Type r5 = p000.t67.m52100a(r5)
            java.lang.reflect.Type r5 = p000.t67.m52114o(r5)
            java.lang.Object r0 = r4.mo39412g(r5, r6)
            java.util.Map<java.lang.Object, com.squareup.moshi.d<?>> r1 = r4.f26735d
            monitor-enter(r1)
            java.util.Map<java.lang.Object, com.squareup.moshi.d<?>> r2 = r4.f26735d     // Catch:{ all -> 0x0088 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0088 }
            com.squareup.moshi.d r2 = (com.squareup.moshi.C5391d) r2     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            java.lang.ThreadLocal<com.squareup.moshi.h$c> r1 = r4.f26734c
            java.lang.Object r1 = r1.get()
            com.squareup.moshi.h$c r1 = (com.squareup.moshi.C5401h.C5404c) r1
            if (r1 != 0) goto L_0x0034
            com.squareup.moshi.h$c r1 = new com.squareup.moshi.h$c
            r1.<init>()
            java.lang.ThreadLocal<com.squareup.moshi.h$c> r2 = r4.f26734c
            r2.set(r1)
        L_0x0034:
            com.squareup.moshi.d r7 = r1.mo39421d(r5, r7, r0)
            r0 = 0
            if (r7 == 0) goto L_0x003f
            r1.mo39420c(r0)
            return r7
        L_0x003f:
            java.util.List<com.squareup.moshi.d$d> r7 = r4.f26732a     // Catch:{ IllegalArgumentException -> 0x007e }
            int r7 = r7.size()     // Catch:{ IllegalArgumentException -> 0x007e }
            r2 = r0
        L_0x0046:
            if (r2 >= r7) goto L_0x0061
            java.util.List<com.squareup.moshi.d$d> r3 = r4.f26732a     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x007e }
            com.squareup.moshi.d$d r3 = (com.squareup.moshi.C5391d.C5395d) r3     // Catch:{ IllegalArgumentException -> 0x007e }
            com.squareup.moshi.d r3 = r3.mo39349a(r5, r6, r4)     // Catch:{ IllegalArgumentException -> 0x007e }
            if (r3 != 0) goto L_0x0059
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0059:
            r1.mo39418a(r3)     // Catch:{ IllegalArgumentException -> 0x007e }
            r5 = 1
            r1.mo39420c(r5)
            return r3
        L_0x0061:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x007e }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r3 = "No JsonAdapter for "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r5 = p000.t67.m52119t(r5, r6)     // Catch:{ IllegalArgumentException -> 0x007e }
            r2.append(r5)     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r5 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x007e }
            r7.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x007e }
            throw r7     // Catch:{ IllegalArgumentException -> 0x007e }
        L_0x007c:
            r5 = move-exception
            goto L_0x0084
        L_0x007e:
            r5 = move-exception
            java.lang.IllegalArgumentException r5 = r1.mo39419b(r5)     // Catch:{ all -> 0x007c }
            throw r5     // Catch:{ all -> 0x007c }
        L_0x0084:
            r1.mo39420c(r0)
            throw r5
        L_0x0088:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            throw r5
        L_0x008b:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "annotations == null"
            r5.<init>(r6)
            throw r5
        L_0x0093:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "type == null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C5401h.mo39411f(java.lang.reflect.Type, java.util.Set, java.lang.String):com.squareup.moshi.d");
    }

    /* renamed from: g */
    public final Object mo39412g(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(new Object[]{type, set});
    }

    /* renamed from: h */
    public C5402a mo39413h() {
        C5402a aVar = new C5402a();
        int i = this.f26733b;
        for (int i2 = 0; i2 < i; i2++) {
            aVar.mo39414a(this.f26732a.get(i2));
        }
        int size = this.f26732a.size() - f26731e.size();
        for (int i3 = this.f26733b; i3 < size; i3++) {
            aVar.mo39415b(this.f26732a.get(i3));
        }
        return aVar;
    }
}
