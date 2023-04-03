package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.C1710a;
import com.bumptech.glide.C1718c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.C1807a;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: be5 */
/* compiled from: RequestBuilder */
public class be5<TranscodeType> extends C2734kz<be5<TranscodeType>> {

    /* renamed from: B1 */
    public static final qe5 f8072B1 = ((qe5) ((qe5) ((qe5) new qe5().mo22586j(xg1.f19829c)).mo22585i0(Priority.LOW)).mo22598q0(true));

    /* renamed from: A1 */
    public boolean f8073A1;

    /* renamed from: e1 */
    public final Context f8074e1;

    /* renamed from: o1 */
    public final me5 f8075o1;

    /* renamed from: p1 */
    public final Class<TranscodeType> f8076p1;

    /* renamed from: q1 */
    public final C1710a f8077q1;

    /* renamed from: r1 */
    public final C1718c f8078r1;

    /* renamed from: s1 */
    public yw6<?, ? super TranscodeType> f8079s1;

    /* renamed from: t1 */
    public Object f8080t1;

    /* renamed from: u1 */
    public List<le5<TranscodeType>> f8081u1;

    /* renamed from: v1 */
    public be5<TranscodeType> f8082v1;

    /* renamed from: w1 */
    public be5<TranscodeType> f8083w1;

    /* renamed from: x1 */
    public Float f8084x1;

    /* renamed from: y1 */
    public boolean f8085y1 = true;

    /* renamed from: z1 */
    public boolean f8086z1;

    /* renamed from: be5$a */
    /* compiled from: RequestBuilder */
    public static /* synthetic */ class C1624a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8087a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f8088b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.Priority[] r0 = com.bumptech.glide.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8088b = r0
                r1 = 1
                com.bumptech.glide.Priority r2 = com.bumptech.glide.Priority.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8088b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f8088b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.Priority r4 = com.bumptech.glide.Priority.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f8088b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.Priority r5 = com.bumptech.glide.Priority.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f8087a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f8087a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f8087a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f8087a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f8087a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f8087a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f8087a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f8087a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.be5.C1624a.<clinit>():void");
        }
    }

    @SuppressLint({"CheckResult"})
    public be5(C1710a aVar, me5 me5, Class<TranscodeType> cls, Context context) {
        this.f8077q1 = aVar;
        this.f8075o1 = me5;
        this.f8076p1 = cls;
        this.f8074e1 = context;
        this.f8079s1 = me5.mo23157s(cls);
        this.f8078r1 = aVar.mo12362i();
        mo11549G0(me5.mo23155q());
        mo11567a(me5.mo23156r());
    }

    /* renamed from: A0 */
    public final ae5 mo11545A0(Object obj, pl6<TranscodeType> pl6, le5<TranscodeType> le5, RequestCoordinator requestCoordinator, yw6<?, ? super TranscodeType> yw6, Priority priority, int i, int i2, C2734kz<?> kzVar, Executor executor) {
        C1807a aVar;
        C1807a aVar2;
        if (this.f8083w1 != null) {
            aVar2 = new C1807a(obj, requestCoordinator);
            aVar = aVar2;
        } else {
            Object obj2 = obj;
            aVar = null;
            aVar2 = requestCoordinator;
        }
        ae5 B0 = mo11546B0(obj, pl6, le5, aVar2, yw6, priority, i, i2, kzVar, executor);
        if (aVar == null) {
            return B0;
        }
        int y = this.f8083w1.mo22610y();
        int x = this.f8083w1.mo22609x();
        if (p67.m24692t(i, i2) && !this.f8083w1.mo22569Y()) {
            y = kzVar.mo22610y();
            x = kzVar.mo22609x();
        }
        be5<TranscodeType> be5 = this.f8083w1;
        C1807a aVar3 = aVar;
        aVar3.mo12688p(B0, be5.mo11545A0(obj, pl6, le5, aVar3, be5.f8079s1, be5.mo22551C(), y, x, this.f8083w1, executor));
        return aVar3;
    }

    /* JADX WARNING: type inference failed for: r27v0, types: [kz<?>, kz] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.ae5 mo11546B0(java.lang.Object r19, p000.pl6<TranscodeType> r20, p000.le5<TranscodeType> r21, com.bumptech.glide.request.RequestCoordinator r22, p000.yw6<?, ? super TranscodeType> r23, com.bumptech.glide.Priority r24, int r25, int r26, p000.C2734kz<?> r27, java.util.concurrent.Executor r28) {
        /*
            r18 = this;
            r11 = r18
            r12 = r19
            r5 = r22
            r13 = r24
            be5<TranscodeType> r0 = r11.f8082v1
            if (r0 == 0) goto L_0x0094
            boolean r1 = r11.f8073A1
            if (r1 != 0) goto L_0x008c
            yw6<?, ? super TranscodeType> r1 = r0.f8079s1
            boolean r2 = r0.f8085y1
            if (r2 == 0) goto L_0x0019
            r14 = r23
            goto L_0x001a
        L_0x0019:
            r14 = r1
        L_0x001a:
            boolean r0 = r0.mo22562N()
            if (r0 == 0) goto L_0x0027
            be5<TranscodeType> r0 = r11.f8082v1
            com.bumptech.glide.Priority r0 = r0.mo22551C()
            goto L_0x002b
        L_0x0027:
            com.bumptech.glide.Priority r0 = r11.mo11548F0(r13)
        L_0x002b:
            r15 = r0
            be5<TranscodeType> r0 = r11.f8082v1
            int r0 = r0.mo22610y()
            be5<TranscodeType> r1 = r11.f8082v1
            int r1 = r1.mo22609x()
            boolean r2 = p000.p67.m24692t(r25, r26)
            if (r2 == 0) goto L_0x004e
            be5<TranscodeType> r2 = r11.f8082v1
            boolean r2 = r2.mo22569Y()
            if (r2 != 0) goto L_0x004e
            int r0 = r27.mo22610y()
            int r1 = r27.mo22609x()
        L_0x004e:
            r16 = r0
            r17 = r1
            com.bumptech.glide.request.b r10 = new com.bumptech.glide.request.b
            r10.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r10
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r13 = r10
            r10 = r28
            ae5 r10 = r0.mo11564V0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.f8073A1 = r0
            be5<TranscodeType> r9 = r11.f8082v1
            r0 = r9
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r12 = r10
            r10 = r28
            ae5 r0 = r0.mo11545A0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.f8073A1 = r1
            r13.mo12692o(r12, r0)
            return r13
        L_0x008c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0094:
            java.lang.Float r0 = r11.f8084x1
            if (r0 == 0) goto L_0x00d4
            com.bumptech.glide.request.b r14 = new com.bumptech.glide.request.b
            r14.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r14
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            ae5 r15 = r0.mo11564V0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kz r0 = r27.clone()
            java.lang.Float r1 = r11.f8084x1
            float r1 = r1.floatValue()
            kz r4 = r0.mo22597p0(r1)
            com.bumptech.glide.Priority r7 = r11.mo11548F0(r13)
            r0 = r18
            r1 = r19
            ae5 r0 = r0.mo11564V0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.mo12692o(r15, r0)
            return r14
        L_0x00d4:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            ae5 r0 = r0.mo11564V0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.be5.mo11546B0(java.lang.Object, pl6, le5, com.bumptech.glide.request.RequestCoordinator, yw6, com.bumptech.glide.Priority, int, int, kz, java.util.concurrent.Executor):ae5");
    }

    /* renamed from: C0 */
    public be5<TranscodeType> mo11569h() {
        be5<TranscodeType> be5 = (be5) super.clone();
        be5.f8079s1 = be5.f8079s1.clone();
        if (be5.f8081u1 != null) {
            be5.f8081u1 = new ArrayList(be5.f8081u1);
        }
        be5<TranscodeType> be52 = be5.f8082v1;
        if (be52 != null) {
            be5.f8082v1 = be52.mo11569h();
        }
        be5<TranscodeType> be53 = be5.f8083w1;
        if (be53 != null) {
            be5.f8083w1 = be53.mo11569h();
        }
        return be5;
    }

    /* renamed from: F0 */
    public final Priority mo11548F0(Priority priority) {
        int i = C1624a.f8088b[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo22551C());
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: G0 */
    public final void mo11549G0(List<le5<Object>> list) {
        for (le5<Object> w0 : list) {
            mo11570w0(w0);
        }
    }

    /* renamed from: H0 */
    public <Y extends pl6<TranscodeType>> Y mo11550H0(Y y) {
        return mo11552J0(y, (le5) null, av1.m10810b());
    }

    /* renamed from: I0 */
    public final <Y extends pl6<TranscodeType>> Y mo11551I0(Y y, le5<TranscodeType> le5, C2734kz<?> kzVar, Executor executor) {
        zt4.m31500d(y);
        if (this.f8086z1) {
            ae5 z0 = mo11572z0(y, le5, kzVar, executor);
            ae5 g = y.mo21093g();
            if (!z0.mo176h(g) || mo11554L0(kzVar, g)) {
                this.f8075o1.mo23150o(y);
                y.mo21099j(z0);
                this.f8075o1.mo23144F(y, z0);
                return y;
            }
            if (!((ae5) zt4.m31500d(g)).isRunning()) {
                g.mo178k();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: J0 */
    public <Y extends pl6<TranscodeType>> Y mo11552J0(Y y, le5<TranscodeType> le5, Executor executor) {
        return mo11551I0(y, le5, this, executor);
    }

    /* renamed from: K0 */
    public he7<ImageView, TranscodeType> mo11553K0(ImageView imageView) {
        C2734kz kzVar;
        p67.m24674b();
        zt4.m31500d(imageView);
        if (!mo22568V() && mo22566T() && imageView.getScaleType() != null) {
            switch (C1624a.f8087a[imageView.getScaleType().ordinal()]) {
                case 1:
                    kzVar = clone().mo22571a0();
                    break;
                case 2:
                    kzVar = clone().mo22573c0();
                    break;
                case 3:
                case 4:
                case 5:
                    kzVar = clone().mo22575d0();
                    break;
                case 6:
                    kzVar = clone().mo22573c0();
                    break;
            }
        }
        kzVar = this;
        return (he7) mo11551I0(this.f8078r1.mo12375a(imageView, this.f8076p1), (le5) null, kzVar, av1.m10810b());
    }

    /* renamed from: L0 */
    public final boolean mo11554L0(C2734kz<?> kzVar, ae5 ae5) {
        if (kzVar.mo22561M() || !ae5.mo175g()) {
            return false;
        }
        return true;
    }

    /* renamed from: M0 */
    public be5<TranscodeType> mo11555M0(le5<TranscodeType> le5) {
        if (mo22559K()) {
            return mo11569h().mo11555M0(le5);
        }
        this.f8081u1 = null;
        return mo11570w0(le5);
    }

    /* renamed from: N0 */
    public be5<TranscodeType> mo11556N0(Bitmap bitmap) {
        return mo11563U0(bitmap).mo11567a(qe5.m25619A0(xg1.f19828b));
    }

    /* renamed from: O0 */
    public be5<TranscodeType> mo11557O0(Uri uri) {
        return mo11563U0(uri);
    }

    /* renamed from: P0 */
    public be5<TranscodeType> mo11558P0(File file) {
        return mo11563U0(file);
    }

    /* renamed from: Q0 */
    public be5<TranscodeType> mo11559Q0(Integer num) {
        return mo11563U0(num).mo11567a(qe5.m25620B0(C2387gj.m18085c(this.f8074e1)));
    }

    /* renamed from: R0 */
    public be5<TranscodeType> mo11560R0(Object obj) {
        return mo11563U0(obj);
    }

    /* renamed from: S0 */
    public be5<TranscodeType> mo11561S0(String str) {
        return mo11563U0(str);
    }

    /* renamed from: T0 */
    public be5<TranscodeType> mo11562T0(byte[] bArr) {
        be5<TranscodeType> U0 = mo11563U0(bArr);
        if (!U0.mo22560L()) {
            U0 = U0.mo11567a(qe5.m25619A0(xg1.f19828b));
        }
        if (!U0.mo22565S()) {
            return U0.mo11567a(qe5.m25621C0(true));
        }
        return U0;
    }

    /* renamed from: U0 */
    public final be5<TranscodeType> mo11563U0(Object obj) {
        if (mo22559K()) {
            return mo11569h().mo11563U0(obj);
        }
        this.f8080t1 = obj;
        this.f8086z1 = true;
        return (be5) mo22592m0();
    }

    /* renamed from: V0 */
    public final ae5 mo11564V0(Object obj, pl6<TranscodeType> pl6, le5<TranscodeType> le5, C2734kz<?> kzVar, RequestCoordinator requestCoordinator, yw6<?, ? super TranscodeType> yw6, Priority priority, int i, int i2, Executor executor) {
        Context context = this.f8074e1;
        C1718c cVar = this.f8078r1;
        return SingleRequest.m12610y(context, cVar, obj, this.f8080t1, this.f8076p1, kzVar, i, i2, priority, pl6, le5, this.f8081u1, requestCoordinator, cVar.mo12380f(), yw6.mo28267b(), executor);
    }

    /* renamed from: W0 */
    public he2<TranscodeType> mo11565W0() {
        return mo11566X0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: X0 */
    public he2<TranscodeType> mo11566X0(int i, int i2) {
        he5 he5 = new he5(i, i2);
        return (he2) mo11552J0(he5, he5, av1.m10809a());
    }

    /* renamed from: w0 */
    public be5<TranscodeType> mo11570w0(le5<TranscodeType> le5) {
        if (mo22559K()) {
            return mo11569h().mo11570w0(le5);
        }
        if (le5 != null) {
            if (this.f8081u1 == null) {
                this.f8081u1 = new ArrayList();
            }
            this.f8081u1.add(le5);
        }
        return (be5) mo22592m0();
    }

    /* renamed from: x0 */
    public be5<TranscodeType> mo11567a(C2734kz<?> kzVar) {
        zt4.m31500d(kzVar);
        return (be5) super.mo11567a(kzVar);
    }

    /* renamed from: z0 */
    public final ae5 mo11572z0(pl6<TranscodeType> pl6, le5<TranscodeType> le5, C2734kz<?> kzVar, Executor executor) {
        return mo11545A0(new Object(), pl6, le5, (RequestCoordinator) null, this.f8079s1, kzVar.mo22551C(), kzVar.mo22610y(), kzVar.mo22609x(), kzVar, executor);
    }
}
