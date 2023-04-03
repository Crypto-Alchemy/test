package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.NetworkInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.C5454m;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.c */
/* compiled from: BitmapHunter */
public class C5431c implements Runnable {

    /* renamed from: X */
    public static final Object f26826X = new Object();

    /* renamed from: Y */
    public static final ThreadLocal<StringBuilder> f26827Y = new C5432a();

    /* renamed from: Z */
    public static final AtomicInteger f26828Z = new AtomicInteger();

    /* renamed from: e0 */
    public static final C5454m f26829e0 = new C5433b();

    /* renamed from: A */
    public final C5454m f26830A;

    /* renamed from: B */
    public C5428a f26831B;

    /* renamed from: C */
    public List<C5428a> f26832C;

    /* renamed from: H */
    public Bitmap f26833H;

    /* renamed from: I */
    public Future<?> f26834I;

    /* renamed from: L */
    public Picasso.LoadedFrom f26835L;

    /* renamed from: M */
    public Exception f26836M;

    /* renamed from: P */
    public int f26837P;

    /* renamed from: Q */
    public int f26838Q;

    /* renamed from: U */
    public Picasso.Priority f26839U;

    /* renamed from: a */
    public final int f26840a = f26828Z.incrementAndGet();

    /* renamed from: d */
    public final Picasso f26841d;

    /* renamed from: e */
    public final C5440f f26842e;

    /* renamed from: g */
    public final c80 f26843g;

    /* renamed from: k */
    public final m96 f26844k;

    /* renamed from: r */
    public final String f26845r;

    /* renamed from: s */
    public final C5450k f26846s;

    /* renamed from: x */
    public final int f26847x;

    /* renamed from: y */
    public int f26848y;

    /* renamed from: com.squareup.picasso.c$a */
    /* compiled from: BitmapHunter */
    public static class C5432a extends ThreadLocal<StringBuilder> {
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b */
    /* compiled from: BitmapHunter */
    public static class C5433b extends C5454m {
        /* renamed from: c */
        public boolean mo39454c(C5450k kVar) {
            return true;
        }

        /* renamed from: f */
        public C5454m.C5455a mo39455f(C5450k kVar, int i) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + kVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c */
    /* compiled from: BitmapHunter */
    public static class C5434c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ lw6 f26849a;

        /* renamed from: d */
        public final /* synthetic */ RuntimeException f26850d;

        public C5434c(lw6 lw6, RuntimeException runtimeException) {
            this.f26849a = lw6;
            this.f26850d = runtimeException;
        }

        public void run() {
            throw new RuntimeException("Transformation " + this.f26849a.key() + " crashed with exception.", this.f26850d);
        }
    }

    /* renamed from: com.squareup.picasso.c$d */
    /* compiled from: BitmapHunter */
    public static class C5435d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ StringBuilder f26851a;

        public C5435d(StringBuilder sb) {
            this.f26851a = sb;
        }

        public void run() {
            throw new NullPointerException(this.f26851a.toString());
        }
    }

    /* renamed from: com.squareup.picasso.c$e */
    /* compiled from: BitmapHunter */
    public static class C5436e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ lw6 f26852a;

        public C5436e(lw6 lw6) {
            this.f26852a = lw6;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f26852a.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* renamed from: com.squareup.picasso.c$f */
    /* compiled from: BitmapHunter */
    public static class C5437f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ lw6 f26853a;

        public C5437f(lw6 lw6) {
            this.f26853a = lw6;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f26853a.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    public C5431c(Picasso picasso, C5440f fVar, c80 c80, m96 m96, C5428a aVar, C5454m mVar) {
        this.f26841d = picasso;
        this.f26842e = fVar;
        this.f26843g = c80;
        this.f26844k = m96;
        this.f26831B = aVar;
        this.f26845r = aVar.mo39492d();
        this.f26846s = aVar.mo39497i();
        this.f26839U = aVar.mo39496h();
        this.f26847x = aVar.mo39493e();
        this.f26848y = aVar.mo39494f();
        this.f26830A = mVar;
        this.f26838Q = mVar.mo39456e();
    }

    /* renamed from: a */
    public static Bitmap m41757a(List<lw6> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            lw6 lw6 = list.get(i);
            try {
                Bitmap transform = lw6.transform(bitmap);
                if (transform == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(lw6.key());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (lw6 key : list) {
                        sb.append(key.key());
                        sb.append(10);
                    }
                    Picasso.f26774p.post(new C5435d(sb));
                    return null;
                } else if (transform == bitmap && bitmap.isRecycled()) {
                    Picasso.f26774p.post(new C5436e(lw6));
                    return null;
                } else if (transform == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = transform;
                } else {
                    Picasso.f26774p.post(new C5437f(lw6));
                    return null;
                }
            } catch (RuntimeException e) {
                Picasso.f26774p.post(new C5434c(lw6, e));
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: e */
    public static Bitmap m41758e(z56 z56, C5450k kVar) throws IOException {
        w40 d = sg4.m71929d(z56);
        boolean r = C5459q.m41890r(d);
        boolean z = kVar.f26905r;
        BitmapFactory.Options d2 = C5454m.m41857d(kVar);
        boolean g = C5454m.m41858g(d2);
        if (!r) {
            InputStream p1 = d.mo56078p1();
            if (g) {
                fo3 fo3 = new fo3(p1);
                fo3.mo42625a(false);
                long c = fo3.mo42628c(RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);
                BitmapFactory.decodeStream(fo3, (Rect) null, d2);
                C5454m.m41856b(kVar.f26895h, kVar.f26896i, d2, kVar);
                fo3.mo42627b(c);
                fo3.mo42625a(true);
                p1 = fo3;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(p1, (Rect) null, d2);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] F0 = d.mo56020F0();
        if (g) {
            BitmapFactory.decodeByteArray(F0, 0, F0.length, d2);
            C5454m.m41856b(kVar.f26895h, kVar.f26896i, d2, kVar);
        }
        return BitmapFactory.decodeByteArray(F0, 0, F0.length, d2);
    }

    /* renamed from: g */
    public static C5431c m41759g(Picasso picasso, C5440f fVar, c80 c80, m96 m96, C5428a aVar) {
        C5450k i = aVar.mo39497i();
        List<C5454m> i2 = picasso.mo39466i();
        int size = i2.size();
        for (int i3 = 0; i3 < size; i3++) {
            C5454m mVar = i2.get(i3);
            if (mVar.mo39454c(i)) {
                return new C5431c(picasso, fVar, c80, m96, aVar, mVar);
            }
        }
        return new C5431c(picasso, fVar, c80, m96, aVar, f26829e0);
    }

    /* renamed from: l */
    public static int m41760l(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: m */
    public static int m41761m(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    /* renamed from: v */
    public static boolean m41762v(boolean z, int i, int i2, int i3, int i4) {
        return !z || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x024f  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m41763y(com.squareup.picasso.C5450k r26, android.graphics.Bitmap r27, int r28) {
        /*
            r0 = r26
            int r1 = r27.getWidth()
            int r2 = r27.getHeight()
            boolean r3 = r0.f26900m
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            boolean r4 = r26.mo39570e()
            if (r4 != 0) goto L_0x001f
            if (r28 == 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            r3 = r1
            r5 = r2
            r0 = r9
            goto L_0x023b
        L_0x001f:
            int r4 = r0.f26895h
            int r6 = r0.f26896i
            float r7 = r0.f26901n
            r8 = 0
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0130
            double r10 = (double) r7
            double r12 = java.lang.Math.toRadians(r10)
            double r12 = java.lang.Math.cos(r12)
            double r10 = java.lang.Math.toRadians(r10)
            double r10 = java.lang.Math.sin(r10)
            boolean r4 = r0.f26904q
            if (r4 == 0) goto L_0x00c9
            float r4 = r0.f26902o
            float r6 = r0.f26903p
            r9.setRotate(r7, r4, r6)
            float r4 = r0.f26902o
            double r6 = (double) r4
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r14 - r12
            double r6 = r6 * r14
            float r8 = r0.f26903p
            r16 = r2
            r17 = r3
            double r2 = (double) r8
            double r2 = r2 * r10
            double r6 = r6 + r2
            double r2 = (double) r8
            double r2 = r2 * r14
            double r14 = (double) r4
            double r14 = r14 * r10
            double r2 = r2 - r14
            int r4 = r0.f26895h
            double r14 = (double) r4
            double r14 = r14 * r12
            double r14 = r14 + r6
            r18 = r6
            double r5 = (double) r4
            double r5 = r5 * r10
            double r5 = r5 + r2
            r20 = r9
            double r8 = (double) r4
            double r8 = r8 * r12
            double r7 = r18 + r8
            int r9 = r0.f26896i
            r22 = r1
            double r0 = (double) r9
            double r0 = r0 * r10
            double r7 = r7 - r0
            double r0 = (double) r4
            double r0 = r0 * r10
            double r0 = r0 + r2
            r23 = r5
            double r4 = (double) r9
            double r4 = r4 * r12
            double r0 = r0 + r4
            double r4 = (double) r9
            double r4 = r4 * r10
            double r4 = r18 - r4
            double r9 = (double) r9
            double r9 = r9 * r12
            double r9 = r9 + r2
            r11 = r18
            r18 = r9
            double r9 = java.lang.Math.max(r11, r14)
            double r9 = java.lang.Math.max(r7, r9)
            double r9 = java.lang.Math.max(r4, r9)
            double r11 = java.lang.Math.min(r11, r14)
            double r6 = java.lang.Math.min(r7, r11)
            double r4 = java.lang.Math.min(r4, r6)
            r6 = r23
            double r11 = java.lang.Math.max(r2, r6)
            double r11 = java.lang.Math.max(r0, r11)
            r13 = r18
            double r11 = java.lang.Math.max(r13, r11)
            double r2 = java.lang.Math.min(r2, r6)
            double r0 = java.lang.Math.min(r0, r2)
            double r0 = java.lang.Math.min(r13, r0)
            double r9 = r9 - r4
            double r2 = java.lang.Math.floor(r9)
            int r4 = (int) r2
            double r11 = r11 - r0
            double r0 = java.lang.Math.floor(r11)
            int r6 = (int) r0
            r0 = r20
            goto L_0x0137
        L_0x00c9:
            r22 = r1
            r16 = r2
            r17 = r3
            r0 = r9
            r0.setRotate(r7)
            r1 = r26
            int r2 = r1.f26895h
            double r3 = (double) r2
            double r3 = r3 * r12
            double r5 = (double) r2
            double r5 = r5 * r10
            double r7 = (double) r2
            double r7 = r7 * r12
            int r9 = r1.f26896i
            double r14 = (double) r9
            double r14 = r14 * r10
            double r7 = r7 - r14
            double r14 = (double) r2
            double r14 = r14 * r10
            double r1 = (double) r9
            double r1 = r1 * r12
            double r14 = r14 + r1
            double r1 = (double) r9
            double r1 = r1 * r10
            double r1 = -r1
            double r9 = (double) r9
            double r9 = r9 * r12
            r11 = 0
            r18 = r9
            double r9 = java.lang.Math.max(r11, r3)
            double r9 = java.lang.Math.max(r7, r9)
            double r9 = java.lang.Math.max(r1, r9)
            double r3 = java.lang.Math.min(r11, r3)
            double r3 = java.lang.Math.min(r7, r3)
            double r1 = java.lang.Math.min(r1, r3)
            double r3 = java.lang.Math.max(r11, r5)
            double r3 = java.lang.Math.max(r14, r3)
            r7 = r18
            double r3 = java.lang.Math.max(r7, r3)
            double r5 = java.lang.Math.min(r11, r5)
            double r5 = java.lang.Math.min(r14, r5)
            double r5 = java.lang.Math.min(r7, r5)
            double r9 = r9 - r1
            double r1 = java.lang.Math.floor(r9)
            int r1 = (int) r1
            double r3 = r3 - r5
            double r2 = java.lang.Math.floor(r3)
            int r6 = (int) r2
            r4 = r1
            goto L_0x0137
        L_0x0130:
            r22 = r1
            r16 = r2
            r17 = r3
            r0 = r9
        L_0x0137:
            if (r28 == 0) goto L_0x015d
            int r1 = m41760l(r28)
            int r2 = m41761m(r28)
            if (r1 == 0) goto L_0x0154
            float r3 = (float) r1
            r0.preRotate(r3)
            r3 = 90
            if (r1 == r3) goto L_0x014f
            r3 = 270(0x10e, float:3.78E-43)
            if (r1 != r3) goto L_0x0154
        L_0x014f:
            r25 = r6
            r6 = r4
            r4 = r25
        L_0x0154:
            r1 = 1
            if (r2 == r1) goto L_0x015d
            float r1 = (float) r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r1, r2)
        L_0x015d:
            r1 = r26
            boolean r2 = r1.f26897j
            if (r2 == 0) goto L_0x01f0
            if (r4 == 0) goto L_0x016d
            float r2 = (float) r4
            r3 = r22
            float r5 = (float) r3
            float r2 = r2 / r5
            r5 = r16
            goto L_0x0174
        L_0x016d:
            r3 = r22
            float r2 = (float) r6
            r5 = r16
            float r7 = (float) r5
            float r2 = r2 / r7
        L_0x0174:
            if (r6 == 0) goto L_0x0179
            float r7 = (float) r6
            float r8 = (float) r5
            goto L_0x017b
        L_0x0179:
            float r7 = (float) r4
            float r8 = (float) r3
        L_0x017b:
            float r7 = r7 / r8
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x01aa
            float r8 = (float) r5
            float r7 = r7 / r2
            float r8 = r8 * r7
            double r7 = (double) r8
            double r7 = java.lang.Math.ceil(r7)
            int r7 = (int) r7
            int r1 = r1.f26898k
            r8 = r1 & 48
            r9 = 48
            if (r8 != r9) goto L_0x0193
            r1 = 0
            goto L_0x019f
        L_0x0193:
            r8 = 80
            r1 = r1 & r8
            if (r1 != r8) goto L_0x019b
            int r1 = r5 - r7
            goto L_0x019f
        L_0x019b:
            int r1 = r5 - r7
            int r1 = r1 / 2
        L_0x019f:
            float r8 = (float) r6
            float r9 = (float) r7
            float r8 = r8 / r9
            r9 = r7
            r10 = r17
            r21 = 0
            r7 = r1
            r1 = r3
            goto L_0x01e1
        L_0x01aa:
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x01d8
            float r8 = (float) r3
            float r2 = r2 / r7
            float r8 = r8 * r2
            double r8 = (double) r8
            double r8 = java.lang.Math.ceil(r8)
            int r2 = (int) r8
            int r1 = r1.f26898k
            r8 = r1 & 3
            r9 = 3
            if (r8 != r9) goto L_0x01c0
            r1 = 0
            goto L_0x01cb
        L_0x01c0:
            r8 = 5
            r1 = r1 & r8
            if (r1 != r8) goto L_0x01c7
            int r1 = r3 - r2
            goto L_0x01cb
        L_0x01c7:
            int r1 = r3 - r2
            int r1 = r1 / 2
        L_0x01cb:
            float r8 = (float) r4
            float r9 = (float) r2
            float r8 = r8 / r9
            r21 = r1
            r1 = r2
            r9 = r5
            r2 = r8
            r10 = r17
            r8 = r7
            r7 = 0
            goto L_0x01e1
        L_0x01d8:
            r1 = r3
            r9 = r5
            r2 = r7
            r8 = r2
            r10 = r17
            r7 = 0
            r21 = 0
        L_0x01e1:
            boolean r3 = m41762v(r10, r3, r5, r4, r6)
            if (r3 == 0) goto L_0x01ea
            r0.preScale(r2, r8)
        L_0x01ea:
            r6 = r7
            r8 = r9
            r5 = r21
            r7 = r1
            goto L_0x023f
        L_0x01f0:
            r5 = r16
            r10 = r17
            r3 = r22
            boolean r1 = r1.f26899l
            if (r1 == 0) goto L_0x021a
            if (r4 == 0) goto L_0x01ff
            float r1 = (float) r4
            float r2 = (float) r3
            goto L_0x0201
        L_0x01ff:
            float r1 = (float) r6
            float r2 = (float) r5
        L_0x0201:
            float r1 = r1 / r2
            if (r6 == 0) goto L_0x0207
            float r2 = (float) r6
            float r7 = (float) r5
            goto L_0x0209
        L_0x0207:
            float r2 = (float) r4
            float r7 = (float) r3
        L_0x0209:
            float r2 = r2 / r7
            int r7 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x020f
            goto L_0x0210
        L_0x020f:
            r1 = r2
        L_0x0210:
            boolean r2 = m41762v(r10, r3, r5, r4, r6)
            if (r2 == 0) goto L_0x023b
            r0.preScale(r1, r1)
            goto L_0x023b
        L_0x021a:
            if (r4 != 0) goto L_0x021e
            if (r6 == 0) goto L_0x023b
        L_0x021e:
            if (r4 != r3) goto L_0x0222
            if (r6 == r5) goto L_0x023b
        L_0x0222:
            if (r4 == 0) goto L_0x0227
            float r1 = (float) r4
            float r2 = (float) r3
            goto L_0x0229
        L_0x0227:
            float r1 = (float) r6
            float r2 = (float) r5
        L_0x0229:
            float r1 = r1 / r2
            if (r6 == 0) goto L_0x022f
            float r2 = (float) r6
            float r7 = (float) r5
            goto L_0x0231
        L_0x022f:
            float r2 = (float) r4
            float r7 = (float) r3
        L_0x0231:
            float r2 = r2 / r7
            boolean r4 = m41762v(r10, r3, r5, r4, r6)
            if (r4 == 0) goto L_0x023b
            r0.preScale(r1, r2)
        L_0x023b:
            r7 = r3
            r8 = r5
            r5 = 0
            r6 = 0
        L_0x023f:
            r10 = 1
            r4 = r27
            r9 = r0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)
            r1 = r27
            if (r0 == r1) goto L_0x024f
            r27.recycle()
            goto L_0x0250
        L_0x024f:
            r0 = r1
        L_0x0250:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C5431c.m41763y(com.squareup.picasso.k, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: z */
    public static void m41764z(C5450k kVar) {
        String a = kVar.mo39566a();
        StringBuilder sb = f26827Y.get();
        sb.ensureCapacity(a.length() + 8);
        sb.replace(8, sb.length(), a);
        Thread.currentThread().setName(sb.toString());
    }

    /* renamed from: b */
    public void mo39502b(C5428a aVar) {
        boolean z = this.f26841d.f26789n;
        C5450k kVar = aVar.f26810b;
        if (this.f26831B == null) {
            this.f26831B = aVar;
            if (z) {
                List<C5428a> list = this.f26832C;
                if (list == null || list.isEmpty()) {
                    C5459q.m41892t("Hunter", "joined", kVar.mo39569d(), "to empty hunter");
                } else {
                    C5459q.m41892t("Hunter", "joined", kVar.mo39569d(), C5459q.m41883k(this, "to "));
                }
            }
        } else {
            if (this.f26832C == null) {
                this.f26832C = new ArrayList(3);
            }
            this.f26832C.add(aVar);
            if (z) {
                C5459q.m41892t("Hunter", "joined", kVar.mo39569d(), C5459q.m41883k(this, "to "));
            }
            Picasso.Priority h = aVar.mo39496h();
            if (h.ordinal() > this.f26839U.ordinal()) {
                this.f26839U = h;
            }
        }
    }

    /* renamed from: c */
    public boolean mo39503c() {
        Future<?> future;
        if (this.f26831B != null) {
            return false;
        }
        List<C5428a> list = this.f26832C;
        if ((list == null || list.isEmpty()) && (future = this.f26834I) != null && future.cancel(false)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final Picasso.Priority mo39504d() {
        boolean z;
        Picasso.Priority priority = Picasso.Priority.LOW;
        List<C5428a> list = this.f26832C;
        boolean z2 = true;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        C5428a aVar = this.f26831B;
        if (aVar == null && !z) {
            z2 = false;
        }
        if (!z2) {
            return priority;
        }
        if (aVar != null) {
            priority = aVar.mo39496h();
        }
        if (z) {
            int size = this.f26832C.size();
            for (int i = 0; i < size; i++) {
                Picasso.Priority h = this.f26832C.get(i).mo39496h();
                if (h.ordinal() > priority.ordinal()) {
                    priority = h;
                }
            }
        }
        return priority;
    }

    /* renamed from: f */
    public void mo39505f(C5428a aVar) {
        boolean z;
        if (this.f26831B == aVar) {
            this.f26831B = null;
            z = true;
        } else {
            List<C5428a> list = this.f26832C;
            if (list != null) {
                z = list.remove(aVar);
            } else {
                z = false;
            }
        }
        if (z && aVar.mo39496h() == this.f26839U) {
            this.f26839U = mo39504d();
        }
        if (this.f26841d.f26789n) {
            C5459q.m41892t("Hunter", "removed", aVar.f26810b.mo39569d(), C5459q.m41883k(this, "from "));
        }
    }

    /* renamed from: h */
    public C5428a mo39506h() {
        return this.f26831B;
    }

    /* renamed from: i */
    public List<C5428a> mo39507i() {
        return this.f26832C;
    }

    /* renamed from: j */
    public C5450k mo39508j() {
        return this.f26846s;
    }

    /* renamed from: k */
    public Exception mo39509k() {
        return this.f26836M;
    }

    /* renamed from: n */
    public String mo39510n() {
        return this.f26845r;
    }

    /* renamed from: o */
    public Picasso.LoadedFrom mo39511o() {
        return this.f26835L;
    }

    /* renamed from: p */
    public int mo39512p() {
        return this.f26847x;
    }

    /* renamed from: q */
    public Picasso mo39513q() {
        return this.f26841d;
    }

    /* renamed from: r */
    public Picasso.Priority mo39514r() {
        return this.f26839U;
    }

    public void run() {
        try {
            m41764z(this.f26846s);
            if (this.f26841d.f26789n) {
                C5459q.m41891s("Hunter", "executing", C5459q.m41882j(this));
            }
            Bitmap t = mo39517t();
            this.f26833H = t;
            if (t == null) {
                this.f26842e.mo39533e(this);
            } else {
                this.f26842e.mo39532d(this);
            }
        } catch (NetworkRequestHandler.ResponseException e) {
            if (!NetworkPolicy.isOfflineOnly(e.networkPolicy) || e.code != 504) {
                this.f26836M = e;
            }
            this.f26842e.mo39533e(this);
        } catch (IOException e2) {
            this.f26836M = e2;
            this.f26842e.mo39535g(this);
        } catch (OutOfMemoryError e3) {
            StringWriter stringWriter = new StringWriter();
            this.f26844k.mo45707a().mo46362a(new PrintWriter(stringWriter));
            this.f26836M = new RuntimeException(stringWriter.toString(), e3);
            this.f26842e.mo39533e(this);
        } catch (Exception e4) {
            this.f26836M = e4;
            this.f26842e.mo39533e(this);
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* renamed from: s */
    public Bitmap mo39516s() {
        return this.f26833H;
    }

    /* renamed from: t */
    public Bitmap mo39517t() throws IOException {
        Bitmap bitmap;
        int i;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.f26847x)) {
            bitmap = this.f26843g.get(this.f26845r);
            if (bitmap != null) {
                this.f26844k.mo45710d();
                this.f26835L = Picasso.LoadedFrom.MEMORY;
                if (this.f26841d.f26789n) {
                    C5459q.m41892t("Hunter", "decoded", this.f26846s.mo39569d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        if (this.f26838Q == 0) {
            i = NetworkPolicy.OFFLINE.index;
        } else {
            i = this.f26848y;
        }
        this.f26848y = i;
        C5454m.C5455a f = this.f26830A.mo39455f(this.f26846s, i);
        if (f != null) {
            this.f26835L = f.mo39595c();
            this.f26837P = f.mo39594b();
            bitmap = f.mo39593a();
            if (bitmap == null) {
                z56 d = f.mo39596d();
                try {
                    bitmap = m41758e(d, this.f26846s);
                } finally {
                    try {
                        d.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.f26841d.f26789n) {
                C5459q.m41891s("Hunter", "decoded", this.f26846s.mo39569d());
            }
            this.f26844k.mo45708b(bitmap);
            if (this.f26846s.mo39571f() || this.f26837P != 0) {
                synchronized (f26826X) {
                    if (this.f26846s.mo39570e() || this.f26837P != 0) {
                        bitmap = m41763y(this.f26846s, bitmap, this.f26837P);
                        if (this.f26841d.f26789n) {
                            C5459q.m41891s("Hunter", "transformed", this.f26846s.mo39569d());
                        }
                    }
                    if (this.f26846s.mo39567b()) {
                        bitmap = m41757a(this.f26846s.f26894g, bitmap);
                        if (this.f26841d.f26789n) {
                            C5459q.m41892t("Hunter", "transformed", this.f26846s.mo39569d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f26844k.mo45709c(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* renamed from: u */
    public boolean mo39518u() {
        Future<?> future = this.f26834I;
        if (future == null || !future.isCancelled()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public boolean mo39519w(boolean z, NetworkInfo networkInfo) {
        boolean z2;
        int i = this.f26838Q;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        this.f26838Q = i - 1;
        return this.f26830A.mo39457h(z, networkInfo);
    }

    /* renamed from: x */
    public boolean mo39520x() {
        return this.f26830A.mo39458i();
    }
}
