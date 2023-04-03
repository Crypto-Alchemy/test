package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.IdentityHashMap;

/* renamed from: ea0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public class ea0 {

    /* renamed from: a */
    public Context f28488a;

    /* renamed from: b */
    public final Object f28489b;

    /* renamed from: c */
    public Camera f28490c;

    /* renamed from: d */
    public int f28491d;

    /* renamed from: e */
    public int f28492e;

    /* renamed from: f */
    public u36 f28493f;

    /* renamed from: g */
    public float f28494g;

    /* renamed from: h */
    public int f28495h;

    /* renamed from: i */
    public int f28496i;

    /* renamed from: j */
    public boolean f28497j;

    /* renamed from: k */
    public String f28498k;

    /* renamed from: l */
    public SurfaceTexture f28499l;

    /* renamed from: m */
    public Thread f28500m;

    /* renamed from: n */
    public C5758b f28501n;

    /* renamed from: o */
    public final IdentityHashMap<byte[], ByteBuffer> f28502o;

    /* renamed from: ea0$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static class C5757a {

        /* renamed from: a */
        public final ee1<?> f28503a;

        /* renamed from: b */
        public ea0 f28504b;

        public C5757a(@RecentlyNonNull Context context, @RecentlyNonNull ee1<?> ee1) {
            ea0 ea0 = new ea0();
            this.f28504b = ea0;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (ee1 != null) {
                this.f28503a = ee1;
                Context unused = ea0.f28488a = context;
            } else {
                throw new IllegalArgumentException("No detector supplied.");
            }
        }

        @RecentlyNonNull
        /* renamed from: a */
        public ea0 mo42178a() {
            ea0 ea0 = this.f28504b;
            ea0.getClass();
            C5758b unused = ea0.f28501n = new C5758b(this.f28503a);
            return this.f28504b;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C5757a mo42179b(boolean z) {
            boolean unused = this.f28504b.f28497j = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C5757a mo42180c(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Invalid preview size: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            int unused = this.f28504b.f28495h = i;
            int unused2 = this.f28504b.f28496i = i2;
            return this;
        }
    }

    /* renamed from: ea0$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public class C5758b implements Runnable {

        /* renamed from: a */
        public ee1<?> f28505a;

        /* renamed from: d */
        public long f28506d = SystemClock.elapsedRealtime();

        /* renamed from: e */
        public final Object f28507e = new Object();

        /* renamed from: g */
        public boolean f28508g = true;

        /* renamed from: k */
        public long f28509k;

        /* renamed from: r */
        public int f28510r = 0;

        /* renamed from: s */
        public ByteBuffer f28511s;

        public C5758b(ee1<?> ee1) {
            this.f28505a = ee1;
        }

        @SuppressLint({"Assert"})
        /* renamed from: a */
        public final void mo42181a() {
            ee1<?> ee1 = this.f28505a;
            if (ee1 != null) {
                ee1.mo42282d();
                this.f28505a = null;
            }
        }

        /* renamed from: b */
        public final void mo42182b(boolean z) {
            synchronized (this.f28507e) {
                this.f28508g = z;
                this.f28507e.notifyAll();
            }
        }

        /* renamed from: c */
        public final void mo42183c(byte[] bArr, Camera camera) {
            synchronized (this.f28507e) {
                ByteBuffer byteBuffer = this.f28511s;
                if (byteBuffer != null) {
                    camera.addCallbackBuffer(byteBuffer.array());
                    this.f28511s = null;
                }
                if (ea0.this.f28502o.containsKey(bArr)) {
                    this.f28509k = SystemClock.elapsedRealtime() - this.f28506d;
                    this.f28510r++;
                    this.f28511s = (ByteBuffer) ea0.this.f28502o.get(bArr);
                    this.f28507e.notifyAll();
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            ((p000.ee1) p000.cu4.m43221k(r6.f28505a)).mo42281c(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
            ((android.hardware.Camera) p000.cu4.m43221k(p000.ea0.m43846k(r6.f28512x))).addCallbackBuffer(((java.nio.ByteBuffer) p000.cu4.m43221k(r2)).array());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x009e, code lost:
            throw r0;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0017  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0015 A[SYNTHETIC] */
        @android.annotation.SuppressLint({"InlinedApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
            L_0x0000:
                java.lang.Object r0 = r6.f28507e
                monitor-enter(r0)
            L_0x0003:
                boolean r1 = r6.f28508g     // Catch:{ all -> 0x00ba }
                if (r1 == 0) goto L_0x0013
                java.nio.ByteBuffer r2 = r6.f28511s     // Catch:{ all -> 0x00ba }
                if (r2 != 0) goto L_0x0013
                java.lang.Object r1 = r6.f28507e     // Catch:{ InterruptedException -> 0x0011 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0011 }
                goto L_0x0003
            L_0x0011:
                monitor-exit(r0)     // Catch:{ all -> 0x00ba }
                return
            L_0x0013:
                if (r1 != 0) goto L_0x0017
                monitor-exit(r0)     // Catch:{ all -> 0x00ba }
                return
            L_0x0017:
                tb2$a r1 = new tb2$a     // Catch:{ all -> 0x00ba }
                r1.<init>()     // Catch:{ all -> 0x00ba }
                java.nio.ByteBuffer r2 = r6.f28511s     // Catch:{ all -> 0x00ba }
                java.lang.Object r2 = p000.cu4.m43221k(r2)     // Catch:{ all -> 0x00ba }
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch:{ all -> 0x00ba }
                ea0 r3 = p000.ea0.this     // Catch:{ all -> 0x00ba }
                u36 r3 = r3.f28493f     // Catch:{ all -> 0x00ba }
                int r3 = r3.mo48302b()     // Catch:{ all -> 0x00ba }
                ea0 r4 = p000.ea0.this     // Catch:{ all -> 0x00ba }
                u36 r4 = r4.f28493f     // Catch:{ all -> 0x00ba }
                int r4 = r4.mo48301a()     // Catch:{ all -> 0x00ba }
                r5 = 17
                tb2$a r1 = r1.mo48051d(r2, r3, r4, r5)     // Catch:{ all -> 0x00ba }
                int r2 = r6.f28510r     // Catch:{ all -> 0x00ba }
                tb2$a r1 = r1.mo48050c(r2)     // Catch:{ all -> 0x00ba }
                long r2 = r6.f28509k     // Catch:{ all -> 0x00ba }
                tb2$a r1 = r1.mo48053f(r2)     // Catch:{ all -> 0x00ba }
                ea0 r2 = p000.ea0.this     // Catch:{ all -> 0x00ba }
                int r2 = r2.f28492e     // Catch:{ all -> 0x00ba }
                tb2$a r1 = r1.mo48052e(r2)     // Catch:{ all -> 0x00ba }
                tb2 r1 = r1.mo48048a()     // Catch:{ all -> 0x00ba }
                java.nio.ByteBuffer r2 = r6.f28511s     // Catch:{ all -> 0x00ba }
                r3 = 0
                r6.f28511s = r3     // Catch:{ all -> 0x00ba }
                monitor-exit(r0)     // Catch:{ all -> 0x00ba }
                ee1<?> r0 = r6.f28505a     // Catch:{ Exception -> 0x009f, all -> 0x0084 }
                java.lang.Object r0 = p000.cu4.m43221k(r0)     // Catch:{ Exception -> 0x009f, all -> 0x0084 }
                ee1 r0 = (p000.ee1) r0     // Catch:{ Exception -> 0x009f, all -> 0x0084 }
                r0.mo42281c(r1)     // Catch:{ Exception -> 0x009f, all -> 0x0084 }
                ea0 r0 = p000.ea0.this
                android.hardware.Camera r0 = r0.f28490c
                java.lang.Object r0 = p000.cu4.m43221k(r0)
                android.hardware.Camera r0 = (android.hardware.Camera) r0
                java.lang.Object r1 = p000.cu4.m43221k(r2)
                java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
                byte[] r1 = r1.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x0084:
                r0 = move-exception
                ea0 r1 = p000.ea0.this
                android.hardware.Camera r1 = r1.f28490c
                java.lang.Object r1 = p000.cu4.m43221k(r1)
                android.hardware.Camera r1 = (android.hardware.Camera) r1
                java.lang.Object r2 = p000.cu4.m43221k(r2)
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                byte[] r2 = r2.array()
                r1.addCallbackBuffer(r2)
                throw r0
            L_0x009f:
                ea0 r0 = p000.ea0.this
                android.hardware.Camera r0 = r0.f28490c
                java.lang.Object r0 = p000.cu4.m43221k(r0)
                android.hardware.Camera r0 = (android.hardware.Camera) r0
                java.lang.Object r1 = p000.cu4.m43221k(r2)
                java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
                byte[] r1 = r1.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x00ba:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00ba }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ea0.C5758b.run():void");
        }
    }

    /* renamed from: ea0$c */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public class C5759c implements Camera.PreviewCallback {
        public C5759c() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            ea0.this.f28501n.mo42183c(bArr, camera);
        }
    }

    /* renamed from: ea0$d */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static class C5760d {

        /* renamed from: a */
        public u36 f28514a;

        /* renamed from: b */
        public u36 f28515b;

        public C5760d(Camera.Size size, Camera.Size size2) {
            this.f28514a = new u36(size.width, size.height);
            if (size2 != null) {
                this.f28515b = new u36(size2.width, size2.height);
            }
        }

        /* renamed from: a */
        public final u36 mo42186a() {
            return this.f28514a;
        }

        /* renamed from: b */
        public final u36 mo42187b() {
            return this.f28515b;
        }
    }

    public ea0() {
        this.f28489b = new Object();
        this.f28491d = 0;
        this.f28494g = 30.0f;
        this.f28495h = RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
        this.f28496i = 768;
        this.f28497j = false;
        this.f28502o = new IdentityHashMap<>();
    }

    /* renamed from: a */
    public void mo42173a() {
        synchronized (this.f28489b) {
            mo42175c();
            this.f28501n.mo42181a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return r2;
     */
    @androidx.annotation.RecentlyNonNull
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.ea0 mo42174b(@androidx.annotation.RecentlyNonNull android.view.SurfaceHolder r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f28489b
            monitor-enter(r0)
            android.hardware.Camera r1 = r2.f28490c     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r2
        L_0x0009:
            android.hardware.Camera r1 = r2.mo42176g()     // Catch:{ all -> 0x002f }
            r2.f28490c = r1     // Catch:{ all -> 0x002f }
            r1.setPreviewDisplay(r3)     // Catch:{ all -> 0x002f }
            android.hardware.Camera r3 = r2.f28490c     // Catch:{ all -> 0x002f }
            r3.startPreview()     // Catch:{ all -> 0x002f }
            java.lang.Thread r3 = new java.lang.Thread     // Catch:{ all -> 0x002f }
            ea0$b r1 = r2.f28501n     // Catch:{ all -> 0x002f }
            r3.<init>(r1)     // Catch:{ all -> 0x002f }
            r2.f28500m = r3     // Catch:{ all -> 0x002f }
            ea0$b r3 = r2.f28501n     // Catch:{ all -> 0x002f }
            r1 = 1
            r3.mo42182b(r1)     // Catch:{ all -> 0x002f }
            java.lang.Thread r3 = r2.f28500m     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002d
            r3.start()     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r2
        L_0x002f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ea0.mo42174b(android.view.SurfaceHolder):ea0");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42175c() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f28489b
            monitor-enter(r0)
            ea0$b r1 = r5.f28501n     // Catch:{ all -> 0x0058 }
            r2 = 0
            r1.mo42182b(r2)     // Catch:{ all -> 0x0058 }
            java.lang.Thread r1 = r5.f28500m     // Catch:{ all -> 0x0058 }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            r5.f28500m = r2     // Catch:{ all -> 0x0058 }
        L_0x0013:
            android.hardware.Camera r1 = r5.f28490c     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0051
            r1.stopPreview()     // Catch:{ all -> 0x0058 }
            android.hardware.Camera r1 = r5.f28490c     // Catch:{ all -> 0x0058 }
            r1.setPreviewCallbackWithBuffer(r2)     // Catch:{ all -> 0x0058 }
            android.hardware.Camera r1 = r5.f28490c     // Catch:{ Exception -> 0x002c }
            r1.setPreviewTexture(r2)     // Catch:{ Exception -> 0x002c }
            r5.f28499l = r2     // Catch:{ Exception -> 0x002c }
            android.hardware.Camera r1 = r5.f28490c     // Catch:{ Exception -> 0x002c }
            r1.setPreviewDisplay(r2)     // Catch:{ Exception -> 0x002c }
            goto L_0x0044
        L_0x002c:
            r1 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0058 }
            int r3 = r1.length()     // Catch:{ all -> 0x0058 }
            int r3 = r3 + 32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
            r4.<init>(r3)     // Catch:{ all -> 0x0058 }
            java.lang.String r3 = "Failed to clear camera preview: "
            r4.append(r3)     // Catch:{ all -> 0x0058 }
            r4.append(r1)     // Catch:{ all -> 0x0058 }
        L_0x0044:
            android.hardware.Camera r1 = r5.f28490c     // Catch:{ all -> 0x0058 }
            java.lang.Object r1 = p000.cu4.m43221k(r1)     // Catch:{ all -> 0x0058 }
            android.hardware.Camera r1 = (android.hardware.Camera) r1     // Catch:{ all -> 0x0058 }
            r1.release()     // Catch:{ all -> 0x0058 }
            r5.f28490c = r2     // Catch:{ all -> 0x0058 }
        L_0x0051:
            java.util.IdentityHashMap<byte[], java.nio.ByteBuffer> r1 = r5.f28502o     // Catch:{ all -> 0x0058 }
            r1.clear()     // Catch:{ all -> 0x0058 }
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x0058:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ea0.mo42175c():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01af  */
    @android.annotation.SuppressLint({"InlinedApi"})
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.hardware.Camera mo42176g() throws java.io.IOException {
        /*
            r15 = this;
            int r0 = r15.f28491d
            android.hardware.Camera$CameraInfo r1 = new android.hardware.Camera$CameraInfo
            r1.<init>()
            r2 = 0
            r3 = r2
        L_0x0009:
            int r4 = android.hardware.Camera.getNumberOfCameras()
            r5 = -1
            if (r3 >= r4) goto L_0x001b
            android.hardware.Camera.getCameraInfo(r3, r1)
            int r4 = r1.facing
            if (r4 != r0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x001b:
            r3 = r5
        L_0x001c:
            if (r3 == r5) goto L_0x022d
            android.hardware.Camera r0 = android.hardware.Camera.open(r3)
            int r1 = r15.f28495h
            int r4 = r15.f28496i
            android.hardware.Camera$Parameters r5 = r0.getParameters()
            java.util.List r6 = r5.getSupportedPreviewSizes()
            java.util.List r5 = r5.getSupportedPictureSizes()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r6.iterator()
        L_0x003b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x007b
            java.lang.Object r9 = r8.next()
            android.hardware.Camera$Size r9 = (android.hardware.Camera.Size) r9
            int r10 = r9.width
            float r10 = (float) r10
            int r11 = r9.height
            float r11 = (float) r11
            float r10 = r10 / r11
            java.util.Iterator r11 = r5.iterator()
        L_0x0052:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x003b
            java.lang.Object r12 = r11.next()
            android.hardware.Camera$Size r12 = (android.hardware.Camera.Size) r12
            int r13 = r12.width
            float r13 = (float) r13
            int r14 = r12.height
            float r14 = (float) r14
            float r13 = r13 / r14
            float r13 = r10 - r13
            float r13 = java.lang.Math.abs(r13)
            r14 = 1008981770(0x3c23d70a, float:0.01)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 >= 0) goto L_0x0052
            ea0$d r10 = new ea0$d
            r10.<init>(r9, r12)
            r7.add(r10)
            goto L_0x003b
        L_0x007b:
            int r5 = r7.size()
            r8 = 0
            if (r5 != 0) goto L_0x009b
            java.util.Iterator r5 = r6.iterator()
        L_0x0086:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x009b
            java.lang.Object r6 = r5.next()
            android.hardware.Camera$Size r6 = (android.hardware.Camera.Size) r6
            ea0$d r9 = new ea0$d
            r9.<init>(r6, r8)
            r7.add(r9)
            goto L_0x0086
        L_0x009b:
            int r5 = r7.size()
            r6 = 2147483647(0x7fffffff, float:NaN)
            r9 = r2
            r11 = r6
            r10 = r8
        L_0x00a5:
            if (r9 >= r5) goto L_0x00cb
            java.lang.Object r12 = r7.get(r9)
            int r9 = r9 + 1
            ea0$d r12 = (p000.ea0.C5760d) r12
            u36 r13 = r12.mo42186a()
            int r14 = r13.mo48302b()
            int r14 = r14 - r1
            int r14 = java.lang.Math.abs(r14)
            int r13 = r13.mo48301a()
            int r13 = r13 - r4
            int r13 = java.lang.Math.abs(r13)
            int r14 = r14 + r13
            if (r14 >= r11) goto L_0x00a5
            r10 = r12
            r11 = r14
            goto L_0x00a5
        L_0x00cb:
            java.lang.Object r1 = p000.cu4.m43221k(r10)
            ea0$d r1 = (p000.ea0.C5760d) r1
            if (r1 == 0) goto L_0x0225
            u36 r4 = r1.mo42187b()
            u36 r1 = r1.mo42186a()
            r15.f28493f = r1
            float r1 = r15.f28494g
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r5
            int r1 = (int) r1
            android.hardware.Camera$Parameters r5 = r0.getParameters()
            java.util.List r5 = r5.getSupportedPreviewFpsRange()
            java.util.Iterator r5 = r5.iterator()
            r7 = r8
        L_0x00f0:
            boolean r9 = r5.hasNext()
            r10 = 1
            if (r9 == 0) goto L_0x0113
            java.lang.Object r9 = r5.next()
            int[] r9 = (int[]) r9
            r11 = r9[r2]
            int r11 = r1 - r11
            r10 = r9[r10]
            int r10 = r1 - r10
            int r11 = java.lang.Math.abs(r11)
            int r10 = java.lang.Math.abs(r10)
            int r11 = r11 + r10
            if (r11 >= r6) goto L_0x00f0
            r7 = r9
            r6 = r11
            goto L_0x00f0
        L_0x0113:
            java.lang.Object r1 = p000.cu4.m43221k(r7)
            int[] r1 = (int[]) r1
            if (r1 == 0) goto L_0x021d
            android.hardware.Camera$Parameters r5 = r0.getParameters()
            if (r4 == 0) goto L_0x012c
            int r6 = r4.mo48302b()
            int r4 = r4.mo48301a()
            r5.setPictureSize(r6, r4)
        L_0x012c:
            u36 r4 = r15.f28493f
            int r4 = r4.mo48302b()
            u36 r6 = r15.f28493f
            int r6 = r6.mo48301a()
            r5.setPreviewSize(r4, r6)
            r4 = r1[r2]
            r1 = r1[r10]
            r5.setPreviewFpsRange(r4, r1)
            r1 = 17
            r5.setPreviewFormat(r1)
            android.content.Context r1 = r15.f28488a
            java.lang.String r4 = "window"
            java.lang.Object r1 = r1.getSystemService(r4)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            java.lang.Object r1 = p000.cu4.m43221k(r1)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getRotation()
            if (r1 == 0) goto L_0x0182
            if (r1 == r10) goto L_0x017f
            r4 = 2
            if (r1 == r4) goto L_0x017c
            r4 = 3
            if (r1 == r4) goto L_0x0179
            r4 = 31
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            java.lang.String r4 = "Bad rotation value: "
            r6.append(r4)
            r6.append(r1)
            goto L_0x0182
        L_0x0179:
            r1 = 270(0x10e, float:3.78E-43)
            goto L_0x0183
        L_0x017c:
            r1 = 180(0xb4, float:2.52E-43)
            goto L_0x0183
        L_0x017f:
            r1 = 90
            goto L_0x0183
        L_0x0182:
            r1 = r2
        L_0x0183:
            android.hardware.Camera$CameraInfo r4 = new android.hardware.Camera$CameraInfo
            r4.<init>()
            android.hardware.Camera.getCameraInfo(r3, r4)
            int r3 = r4.facing
            if (r3 != r10) goto L_0x0199
            int r3 = r4.orientation
            int r3 = r3 + r1
            int r3 = r3 % 360
            int r1 = 360 - r3
            int r1 = r1 % 360
            goto L_0x01a1
        L_0x0199:
            int r3 = r4.orientation
            int r3 = r3 - r1
            int r3 = r3 + 360
            int r3 = r3 % 360
            r1 = r3
        L_0x01a1:
            int r4 = r3 / 90
            r15.f28492e = r4
            r0.setDisplayOrientation(r1)
            r5.setRotation(r3)
            java.lang.String r1 = r15.f28498k
            if (r1 == 0) goto L_0x01d4
            java.util.List r1 = r5.getSupportedFocusModes()
            java.lang.String r3 = r15.f28498k
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x01c7
            java.lang.String r1 = r15.f28498k
            java.lang.Object r1 = p000.cu4.m43221k(r1)
            java.lang.String r1 = (java.lang.String) r1
            r5.setFocusMode(r1)
            goto L_0x01d4
        L_0x01c7:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r3 = r15.f28498k
            r1[r2] = r3
            java.lang.String r2 = "FocusMode %s is not supported on this device."
            java.lang.String.format(r2, r1)
            r15.f28498k = r8
        L_0x01d4:
            java.lang.String r1 = r15.f28498k
            if (r1 != 0) goto L_0x01ed
            boolean r1 = r15.f28497j
            if (r1 == 0) goto L_0x01ed
            java.util.List r1 = r5.getSupportedFocusModes()
            java.lang.String r2 = "continuous-video"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x01ed
            r5.setFocusMode(r2)
            r15.f28498k = r2
        L_0x01ed:
            r0.setParameters(r5)
            ea0$c r1 = new ea0$c
            r1.<init>()
            r0.setPreviewCallbackWithBuffer(r1)
            u36 r1 = r15.f28493f
            byte[] r1 = r15.mo42177i(r1)
            r0.addCallbackBuffer(r1)
            u36 r1 = r15.f28493f
            byte[] r1 = r15.mo42177i(r1)
            r0.addCallbackBuffer(r1)
            u36 r1 = r15.f28493f
            byte[] r1 = r15.mo42177i(r1)
            r0.addCallbackBuffer(r1)
            u36 r1 = r15.f28493f
            byte[] r1 = r15.mo42177i(r1)
            r0.addCallbackBuffer(r1)
            return r0
        L_0x021d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Could not find suitable preview frames per second range."
            r0.<init>(r1)
            throw r0
        L_0x0225:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Could not find suitable preview size."
            r0.<init>(r1)
            throw r0
        L_0x022d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Could not find requested camera."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ea0.mo42176g():android.hardware.Camera");
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: i */
    public final byte[] mo42177i(u36 u36) {
        byte[] bArr = new byte[(((int) Math.ceil(((double) ((((long) u36.mo48301a()) * ((long) u36.mo48302b())) * ((long) ImageFormat.getBitsPerPixel(17)))) / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.f28502o.put(bArr, wrap);
        return bArr;
    }
}
