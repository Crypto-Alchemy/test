package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C1712b;
import com.bumptech.glide.C1718c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1761f;
import com.bumptech.glide.load.engine.GlideException;
import java.util.List;
import java.util.concurrent.Executor;

public final class SingleRequest<R> implements ae5, x36, ef5 {

    /* renamed from: E */
    public static final boolean f8982E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public int f8983A;

    /* renamed from: B */
    public int f8984B;

    /* renamed from: C */
    public boolean f8985C;

    /* renamed from: D */
    public RuntimeException f8986D;

    /* renamed from: a */
    public int f8987a;

    /* renamed from: b */
    public final String f8988b;

    /* renamed from: c */
    public final d96 f8989c;

    /* renamed from: d */
    public final Object f8990d;

    /* renamed from: e */
    public final le5<R> f8991e;

    /* renamed from: f */
    public final RequestCoordinator f8992f;

    /* renamed from: g */
    public final Context f8993g;

    /* renamed from: h */
    public final C1718c f8994h;

    /* renamed from: i */
    public final Object f8995i;

    /* renamed from: j */
    public final Class<R> f8996j;

    /* renamed from: k */
    public final C2734kz<?> f8997k;

    /* renamed from: l */
    public final int f8998l;

    /* renamed from: m */
    public final int f8999m;

    /* renamed from: n */
    public final Priority f9000n;

    /* renamed from: o */
    public final pl6<R> f9001o;

    /* renamed from: p */
    public final List<le5<R>> f9002p;

    /* renamed from: q */
    public final xw6<? super R> f9003q;

    /* renamed from: r */
    public final Executor f9004r;

    /* renamed from: s */
    public bf5<R> f9005s;

    /* renamed from: t */
    public C1761f.C1767d f9006t;

    /* renamed from: u */
    public long f9007u;

    /* renamed from: v */
    public volatile C1761f f9008v;

    /* renamed from: w */
    public Status f9009w;

    /* renamed from: x */
    public Drawable f9010x;

    /* renamed from: y */
    public Drawable f9011y;

    /* renamed from: z */
    public Drawable f9012z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, C1718c cVar, Object obj, Object obj2, Class<R> cls, C2734kz<?> kzVar, int i, int i2, Priority priority, pl6<R> pl6, le5<R> le5, List<le5<R>> list, RequestCoordinator requestCoordinator, C1761f fVar, xw6<? super R> xw6, Executor executor) {
        String str;
        if (f8982E) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.f8988b = str;
        this.f8989c = d96.m14869a();
        this.f8990d = obj;
        this.f8993g = context;
        this.f8994h = cVar;
        this.f8995i = obj2;
        this.f8996j = cls;
        this.f8997k = kzVar;
        this.f8998l = i;
        this.f8999m = i2;
        this.f9000n = priority;
        this.f9001o = pl6;
        this.f8991e = le5;
        this.f9002p = list;
        this.f8992f = requestCoordinator;
        this.f9008v = fVar;
        this.f9003q = xw6;
        this.f9004r = executor;
        this.f9009w = Status.PENDING;
        if (this.f8986D == null && cVar.mo12381g().mo12384a(C1712b.C1716d.class)) {
            this.f8986D = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: v */
    public static int m12609v(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return i;
        }
        return Math.round(f * ((float) i));
    }

    /* renamed from: y */
    public static <R> SingleRequest<R> m12610y(Context context, C1718c cVar, Object obj, Object obj2, Class<R> cls, C2734kz<?> kzVar, int i, int i2, Priority priority, pl6<R> pl6, le5<R> le5, List<le5<R>> list, RequestCoordinator requestCoordinator, C1761f fVar, xw6<? super R> xw6, Executor executor) {
        return new SingleRequest(context, cVar, obj, obj2, cls, kzVar, i, i2, priority, pl6, le5, list, requestCoordinator, fVar, xw6, executor);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e A[Catch:{ all -> 0x00b6 }] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12662A(p000.bf5<R> r10, R r11, com.bumptech.glide.load.DataSource r12, boolean r13) {
        /*
            r9 = this;
            boolean r13 = r9.mo12677s()
            com.bumptech.glide.request.SingleRequest$Status r0 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE
            r9.f9009w = r0
            r9.f9005s = r10
            com.bumptech.glide.c r10 = r9.f8994h
            int r10 = r10.mo12382h()
            r0 = 3
            if (r10 > r0) goto L_0x0061
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Finished loading "
            r10.append(r0)
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r10.append(r0)
            java.lang.String r0 = " from "
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = " for "
            r10.append(r0)
            java.lang.Object r0 = r9.f8995i
            r10.append(r0)
            java.lang.String r0 = " with size ["
            r10.append(r0)
            int r0 = r9.f8983A
            r10.append(r0)
            java.lang.String r0 = "x"
            r10.append(r0)
            int r0 = r9.f8984B
            r10.append(r0)
            java.lang.String r0 = "] in "
            r10.append(r0)
            long r0 = r9.f9007u
            double r0 = p000.ok3.m23849a(r0)
            r10.append(r0)
            java.lang.String r0 = " ms"
            r10.append(r0)
        L_0x0061:
            r10 = 1
            r9.f8985C = r10
            r6 = 0
            java.util.List<le5<R>> r0 = r9.f9002p     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0087
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x00b6 }
            r8 = r6
        L_0x006e:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00b6 }
            le5 r0 = (p000.le5) r0     // Catch:{ all -> 0x00b6 }
            java.lang.Object r2 = r9.f8995i     // Catch:{ all -> 0x00b6 }
            pl6<R> r3 = r9.f9001o     // Catch:{ all -> 0x00b6 }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.mo21096i(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b6 }
            r8 = r8 | r0
            goto L_0x006e
        L_0x0087:
            r8 = r6
        L_0x0088:
            le5<R> r0 = r9.f8991e     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r2 = r9.f8995i     // Catch:{ all -> 0x00b6 }
            pl6<R> r3 = r9.f9001o     // Catch:{ all -> 0x00b6 }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.mo21096i(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r10 = r6
        L_0x009b:
            r10 = r10 | r8
            if (r10 != 0) goto L_0x00a9
            xw6<? super R> r10 = r9.f9003q     // Catch:{ all -> 0x00b6 }
            ww6 r10 = r10.mo27688a(r12, r13)     // Catch:{ all -> 0x00b6 }
            pl6<R> r12 = r9.f9001o     // Catch:{ all -> 0x00b6 }
            r12.mo19469e(r11, r10)     // Catch:{ all -> 0x00b6 }
        L_0x00a9:
            r9.f8985C = r6
            r9.mo12682x()
            int r10 = r9.f8987a
            java.lang.String r11 = "GlideRequest"
            p000.ch2.m11873f(r11, r10)
            return
        L_0x00b6:
            r10 = move-exception
            r9.f8985C = r6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.mo12662A(bf5, java.lang.Object, com.bumptech.glide.load.DataSource, boolean):void");
    }

    /* renamed from: B */
    public final void mo12663B() {
        if (mo12670l()) {
            Drawable drawable = null;
            if (this.f8995i == null) {
                drawable = mo12675q();
            }
            if (drawable == null) {
                drawable = mo12674p();
            }
            if (drawable == null) {
                drawable = mo12676r();
            }
            this.f9001o.mo19472m(drawable);
        }
    }

    /* renamed from: a */
    public void mo12664a(bf5<?> bf5, DataSource dataSource, boolean z) {
        Object obj;
        String str;
        this.f8989c.mo18594c();
        bf5<?> bf52 = null;
        try {
            synchronized (this.f8990d) {
                try {
                    this.f9006t = null;
                    if (bf5 == null) {
                        mo12665b(new GlideException("Expected to receive a Resource<R> with an object of " + this.f8996j + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = bf5.get();
                    if (obj2 != null) {
                        if (this.f8996j.isAssignableFrom(obj2.getClass())) {
                            if (!mo12671m()) {
                                try {
                                    this.f9005s = null;
                                    this.f9009w = Status.COMPLETE;
                                    ch2.m11873f("GlideRequest", this.f8987a);
                                    this.f9008v.mo12526k(bf5);
                                    return;
                                } catch (Throwable th) {
                                    bf52 = bf5;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                mo12662A(bf5, obj2, dataSource, z);
                                return;
                            }
                        }
                    }
                    this.f9005s = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f8996j);
                    sb.append(" but instead got ");
                    if (obj2 != null) {
                        obj = obj2.getClass();
                    } else {
                        obj = "";
                    }
                    sb.append(obj);
                    sb.append("{");
                    sb.append(obj2);
                    sb.append("} inside Resource{");
                    sb.append(bf5);
                    sb.append("}.");
                    if (obj2 != null) {
                        str = "";
                    } else {
                        str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                    }
                    sb.append(str);
                    mo12665b(new GlideException(sb.toString()));
                    this.f9008v.mo12526k(bf5);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (bf52 != null) {
                this.f9008v.mo12526k(bf52);
            }
            throw th3;
        }
    }

    /* renamed from: b */
    public void mo12665b(GlideException glideException) {
        mo12683z(glideException, 5);
    }

    /* renamed from: c */
    public void mo171c() {
        synchronized (this.f8990d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r5.f9008v.mo12526k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f8990d
            monitor-enter(r0)
            r5.mo12668i()     // Catch:{ all -> 0x0040 }
            d96 r1 = r5.f8989c     // Catch:{ all -> 0x0040 }
            r1.mo18594c()     // Catch:{ all -> 0x0040 }
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.f9009w     // Catch:{ all -> 0x0040 }
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch:{ all -> 0x0040 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0013:
            r5.mo12672n()     // Catch:{ all -> 0x0040 }
            bf5<R> r1 = r5.f9005s     // Catch:{ all -> 0x0040 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f9005s = r3     // Catch:{ all -> 0x0040 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            boolean r3 = r5.mo12669j()     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x002e
            pl6<R> r3 = r5.f9001o     // Catch:{ all -> 0x0040 }
            android.graphics.drawable.Drawable r4 = r5.mo12676r()     // Catch:{ all -> 0x0040 }
            r3.mo19471h(r4)     // Catch:{ all -> 0x0040 }
        L_0x002e:
            java.lang.String r3 = "GlideRequest"
            int r4 = r5.f8987a     // Catch:{ all -> 0x0040 }
            p000.ch2.m11873f(r3, r4)     // Catch:{ all -> 0x0040 }
            r5.f9009w = r2     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x003f
            com.bumptech.glide.load.engine.f r0 = r5.f9008v
            r0.mo12526k(r1)
        L_0x003f:
            return
        L_0x0040:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.clear():void");
    }

    /* renamed from: d */
    public boolean mo173d() {
        boolean z;
        synchronized (this.f8990d) {
            if (this.f9009w == Status.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: e */
    public void mo12666e(int i, int i2) {
        Object obj;
        this.f8989c.mo18594c();
        Object obj2 = this.f8990d;
        synchronized (obj2) {
            try {
                boolean z = f8982E;
                if (z) {
                    mo12680u("Got onSizeReady in " + ok3.m23849a(this.f9007u));
                }
                if (this.f9009w == Status.WAITING_FOR_SIZE) {
                    Status status = Status.RUNNING;
                    this.f9009w = status;
                    float F = this.f8997k.mo22554F();
                    this.f8983A = m12609v(i, F);
                    this.f8984B = m12609v(i2, F);
                    if (z) {
                        mo12680u("finished setup for calling load in " + ok3.m23849a(this.f9007u));
                    }
                    Status status2 = status;
                    boolean z2 = z;
                    Status status3 = status2;
                    obj = obj2;
                    try {
                        this.f9006t = this.f9008v.mo12522f(this.f8994h, this.f8995i, this.f8997k.mo22553E(), this.f8983A, this.f8984B, this.f8997k.mo22552D(), this.f8996j, this.f9000n, this.f8997k.mo22594o(), this.f8997k.mo22556H(), this.f8997k.mo22567U(), this.f8997k.mo22563O(), this.f8997k.mo22608w(), this.f8997k.mo22561M(), this.f8997k.mo22558J(), this.f8997k.mo22557I(), this.f8997k.mo22606v(), this, this.f9004r);
                        if (this.f9009w != status3) {
                            this.f9006t = null;
                        }
                        if (z2) {
                            mo12680u("finished onSizeReady in " + ok3.m23849a(this.f9007u));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    /* renamed from: f */
    public boolean mo174f() {
        boolean z;
        synchronized (this.f8990d) {
            if (this.f9009w == Status.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    public boolean mo175g() {
        boolean z;
        synchronized (this.f8990d) {
            if (this.f9009w == Status.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public Object getLock() {
        this.f8989c.mo18594c();
        return this.f8990d;
    }

    /* renamed from: h */
    public boolean mo176h(ae5 ae5) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        C2734kz<?> kzVar;
        Priority priority;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        C2734kz<?> kzVar2;
        Priority priority2;
        int i6;
        ae5 ae52 = ae5;
        if (!(ae52 instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f8990d) {
            i = this.f8998l;
            i2 = this.f8999m;
            obj = this.f8995i;
            cls = this.f8996j;
            kzVar = this.f8997k;
            priority = this.f9000n;
            List<le5<R>> list = this.f9002p;
            if (list != null) {
                i3 = list.size();
            } else {
                i3 = 0;
            }
        }
        SingleRequest singleRequest = (SingleRequest) ae52;
        synchronized (singleRequest.f8990d) {
            i4 = singleRequest.f8998l;
            i5 = singleRequest.f8999m;
            obj2 = singleRequest.f8995i;
            cls2 = singleRequest.f8996j;
            kzVar2 = singleRequest.f8997k;
            priority2 = singleRequest.f9000n;
            List<le5<R>> list2 = singleRequest.f9002p;
            if (list2 != null) {
                i6 = list2.size();
            } else {
                i6 = 0;
            }
        }
        if (i == i4 && i2 == i5 && p67.m24675c(obj, obj2) && cls.equals(cls2) && kzVar.equals(kzVar2) && priority == priority2 && i3 == i6) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo12668i() {
        if (this.f8985C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f8990d) {
            Status status = this.f9009w;
            if (status != Status.RUNNING) {
                if (status != Status.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo12669j() {
        RequestCoordinator requestCoordinator = this.f8992f;
        if (requestCoordinator == null || requestCoordinator.mo12654a(this)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00aa, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo178k() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f8990d
            monitor-enter(r0)
            r5.mo12668i()     // Catch:{ all -> 0x00b3 }
            d96 r1 = r5.f8989c     // Catch:{ all -> 0x00b3 }
            r1.mo18594c()     // Catch:{ all -> 0x00b3 }
            long r1 = p000.ok3.m23850b()     // Catch:{ all -> 0x00b3 }
            r5.f9007u = r1     // Catch:{ all -> 0x00b3 }
            java.lang.Object r1 = r5.f8995i     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x003c
            int r1 = r5.f8998l     // Catch:{ all -> 0x00b3 }
            int r2 = r5.f8999m     // Catch:{ all -> 0x00b3 }
            boolean r1 = p000.p67.m24692t(r1, r2)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0027
            int r1 = r5.f8998l     // Catch:{ all -> 0x00b3 }
            r5.f8983A = r1     // Catch:{ all -> 0x00b3 }
            int r1 = r5.f8999m     // Catch:{ all -> 0x00b3 }
            r5.f8984B = r1     // Catch:{ all -> 0x00b3 }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r5.mo12675q()     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00b3 }
            r5.mo12683z(r2, r1)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x003c:
            com.bumptech.glide.request.SingleRequest$Status r2 = r5.f9009w     // Catch:{ all -> 0x00b3 }
            com.bumptech.glide.request.SingleRequest$Status r3 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch:{ all -> 0x00b3 }
            if (r2 == r3) goto L_0x00ab
            com.bumptech.glide.request.SingleRequest$Status r4 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch:{ all -> 0x00b3 }
            if (r2 != r4) goto L_0x0050
            bf5<R> r1 = r5.f9005s     // Catch:{ all -> 0x00b3 }
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch:{ all -> 0x00b3 }
            r3 = 0
            r5.mo12664a(r1, r2, r3)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x0050:
            r5.mo12673o(r1)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "GlideRequest"
            int r1 = p000.ch2.m11869b(r1)     // Catch:{ all -> 0x00b3 }
            r5.f8987a = r1     // Catch:{ all -> 0x00b3 }
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch:{ all -> 0x00b3 }
            r5.f9009w = r1     // Catch:{ all -> 0x00b3 }
            int r2 = r5.f8998l     // Catch:{ all -> 0x00b3 }
            int r4 = r5.f8999m     // Catch:{ all -> 0x00b3 }
            boolean r2 = p000.p67.m24692t(r2, r4)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0071
            int r2 = r5.f8998l     // Catch:{ all -> 0x00b3 }
            int r4 = r5.f8999m     // Catch:{ all -> 0x00b3 }
            r5.mo12666e(r2, r4)     // Catch:{ all -> 0x00b3 }
            goto L_0x0076
        L_0x0071:
            pl6<R> r2 = r5.f9001o     // Catch:{ all -> 0x00b3 }
            r2.mo21090a(r5)     // Catch:{ all -> 0x00b3 }
        L_0x0076:
            com.bumptech.glide.request.SingleRequest$Status r2 = r5.f9009w     // Catch:{ all -> 0x00b3 }
            if (r2 == r3) goto L_0x007c
            if (r2 != r1) goto L_0x008b
        L_0x007c:
            boolean r1 = r5.mo12670l()     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x008b
            pl6<R> r1 = r5.f9001o     // Catch:{ all -> 0x00b3 }
            android.graphics.drawable.Drawable r2 = r5.mo12676r()     // Catch:{ all -> 0x00b3 }
            r1.mo19470f(r2)     // Catch:{ all -> 0x00b3 }
        L_0x008b:
            boolean r1 = f8982E     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r1.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            long r2 = r5.f9007u     // Catch:{ all -> 0x00b3 }
            double r2 = p000.ok3.m23849a(r2)     // Catch:{ all -> 0x00b3 }
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b3 }
            r5.mo12680u(r1)     // Catch:{ all -> 0x00b3 }
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00ab:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00b3 }
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.mo178k():void");
    }

    /* renamed from: l */
    public final boolean mo12670l() {
        RequestCoordinator requestCoordinator = this.f8992f;
        if (requestCoordinator == null || requestCoordinator.mo12659i(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo12671m() {
        RequestCoordinator requestCoordinator = this.f8992f;
        if (requestCoordinator == null || requestCoordinator.mo12660j(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final void mo12672n() {
        mo12668i();
        this.f8989c.mo18594c();
        this.f9001o.mo21100k(this);
        C1761f.C1767d dVar = this.f9006t;
        if (dVar != null) {
            dVar.mo12533a();
            this.f9006t = null;
        }
    }

    /* renamed from: o */
    public final void mo12673o(Object obj) {
        List<le5<R>> list = this.f9002p;
        if (list != null) {
            for (le5 next : list) {
                if (next instanceof jx1) {
                    ((jx1) next).mo22102a(obj);
                }
            }
        }
    }

    /* renamed from: p */
    public final Drawable mo12674p() {
        if (this.f9010x == null) {
            Drawable r = this.f8997k.mo22599r();
            this.f9010x = r;
            if (r == null && this.f8997k.mo22596p() > 0) {
                this.f9010x = mo12678t(this.f8997k.mo22596p());
            }
        }
        return this.f9010x;
    }

    /* renamed from: q */
    public final Drawable mo12675q() {
        if (this.f9012z == null) {
            Drawable t = this.f8997k.mo22602t();
            this.f9012z = t;
            if (t == null && this.f8997k.mo22604u() > 0) {
                this.f9012z = mo12678t(this.f8997k.mo22604u());
            }
        }
        return this.f9012z;
    }

    /* renamed from: r */
    public final Drawable mo12676r() {
        if (this.f9011y == null) {
            Drawable z = this.f8997k.mo22611z();
            this.f9011y = z;
            if (z == null && this.f8997k.mo22550B() > 0) {
                this.f9011y = mo12678t(this.f8997k.mo22550B());
            }
        }
        return this.f9011y;
    }

    /* renamed from: s */
    public final boolean mo12677s() {
        RequestCoordinator requestCoordinator = this.f8992f;
        if (requestCoordinator == null || !requestCoordinator.getRoot().mo12656d()) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final Drawable mo12678t(int i) {
        Resources.Theme theme;
        if (this.f8997k.mo22555G() != null) {
            theme = this.f8997k.mo22555G();
        } else {
            theme = this.f8993g.getTheme();
        }
        return kj1.m20750a(this.f8994h, i, theme);
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f8990d) {
            obj = this.f8995i;
            cls = this.f8996j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* renamed from: u */
    public final void mo12680u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f8988b);
    }

    /* renamed from: w */
    public final void mo12681w() {
        RequestCoordinator requestCoordinator = this.f8992f;
        if (requestCoordinator != null) {
            requestCoordinator.mo12655b(this);
        }
    }

    /* renamed from: x */
    public final void mo12682x() {
        RequestCoordinator requestCoordinator = this.f8992f;
        if (requestCoordinator != null) {
            requestCoordinator.mo12657e(this);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: z */
    public final void mo12683z(GlideException glideException, int i) {
        boolean z;
        this.f8989c.mo18594c();
        synchronized (this.f8990d) {
            glideException.setOrigin(this.f8986D);
            int h = this.f8994h.mo12382h();
            if (h <= i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Load failed for ");
                sb.append(this.f8995i);
                sb.append(" with size [");
                sb.append(this.f8983A);
                sb.append("x");
                sb.append(this.f8984B);
                sb.append("]");
                if (h <= 4) {
                    glideException.logRootCauses("Glide");
                }
            }
            this.f9006t = null;
            this.f9009w = Status.FAILED;
            boolean z2 = true;
            this.f8985C = true;
            try {
                List<le5<R>> list = this.f9002p;
                if (list != null) {
                    z = false;
                    for (le5<R> d : list) {
                        z |= d.mo21092d(glideException, this.f8995i, this.f9001o, mo12677s());
                    }
                } else {
                    z = false;
                }
                le5<R> le5 = this.f8991e;
                if (le5 == null || !le5.mo21092d(glideException, this.f8995i, this.f9001o, mo12677s())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    mo12663B();
                }
                this.f8985C = false;
                mo12681w();
                ch2.m11873f("GlideRequest", this.f8987a);
            } catch (Throwable th) {
                this.f8985C = false;
                throw th;
            }
        }
    }
}
