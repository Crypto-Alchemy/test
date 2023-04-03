package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzp;
import com.google.mlkit.common.MlKitException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: s59 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class s59 implements xt8 {

    /* renamed from: B */
    public static volatile s59 f33716B;

    /* renamed from: A */
    public final d69 f33717A = new o59(this);

    /* renamed from: a */
    public final qq8 f33718a;

    /* renamed from: b */
    public final sn8 f33719b;

    /* renamed from: c */
    public m78 f33720c;

    /* renamed from: d */
    public yn8 f33721d;

    /* renamed from: e */
    public o49 f33722e;

    /* renamed from: f */
    public kk9 f33723f;

    /* renamed from: g */
    public final w59 f33724g;

    /* renamed from: h */
    public py8 f33725h;

    /* renamed from: i */
    public i29 f33726i;

    /* renamed from: j */
    public final w49 f33727j;

    /* renamed from: k */
    public final kr8 f33728k;

    /* renamed from: l */
    public boolean f33729l = false;

    /* renamed from: m */
    public boolean f33730m;

    /* renamed from: n */
    public long f33731n;

    /* renamed from: o */
    public List<Runnable> f33732o;

    /* renamed from: p */
    public int f33733p;

    /* renamed from: q */
    public int f33734q;

    /* renamed from: r */
    public boolean f33735r;

    /* renamed from: s */
    public boolean f33736s;

    /* renamed from: t */
    public boolean f33737t;

    /* renamed from: u */
    public FileLock f33738u;

    /* renamed from: v */
    public FileChannel f33739v;

    /* renamed from: w */
    public List<Long> f33740w;

    /* renamed from: x */
    public List<Long> f33741x;

    /* renamed from: y */
    public long f33742y;

    /* renamed from: z */
    public final Map<String, u68> f33743z;

    public s59(u59 u59, kr8 kr8) {
        cu4.m43221k(u59);
        this.f33728k = kr8.m47470e(u59.f34468a, (zzcl) null, (Long) null);
        this.f33742y = -1;
        this.f33727j = new w49(this);
        w59 w59 = new w59(this);
        w59.mo47983i();
        this.f33724g = w59;
        sn8 sn8 = new sn8(this);
        sn8.mo47983i();
        this.f33719b = sn8;
        qq8 qq8 = new qq8(this);
        qq8.mo47983i();
        this.f33718a = qq8;
        this.f33743z = new HashMap();
        mo45272s().mo41640o(new z49(this, u59));
    }

    /* renamed from: B */
    public static /* synthetic */ void m51543B(s59 s59, u59 u59) {
        s59.mo45272s().mo29006e();
        m78 m78 = new m78(s59);
        m78.mo47983i();
        s59.f33720c = m78;
        s59.mo47648S().mo45985h((f68) cu4.m43221k(s59.f33718a));
        i29 i29 = new i29(s59);
        i29.mo47983i();
        s59.f33726i = i29;
        kk9 kk9 = new kk9(s59);
        kk9.mo47983i();
        s59.f33723f = kk9;
        py8 py8 = new py8(s59);
        py8.mo47983i();
        s59.f33725h = py8;
        o49 o49 = new o49(s59);
        o49.mo47983i();
        s59.f33722e = o49;
        s59.f33721d = new yn8(s59);
        if (s59.f33733p != s59.f33734q) {
            s59.mo45237A().mo29670l().mo48771c("Not all upload components initialized", Integer.valueOf(s59.f33733p), Integer.valueOf(s59.f33734q));
        }
        s59.f33729l = true;
    }

    /* renamed from: D */
    public static final void m51545D(uq8 uq8, int i, String str) {
        List<er8> w = uq8.mo48499w();
        int i2 = 0;
        while (i2 < w.size()) {
            if (!"_err".equals(w.get(i2).mo42393y())) {
                i2++;
            } else {
                return;
            }
        }
        br8 K = er8.m44025K();
        K.mo29705w("_err");
        K.mo29708z(Long.valueOf((long) i).longValue());
        br8 K2 = er8.m44025K();
        K2.mo29705w("_ev");
        K2.mo29706x(str);
        uq8.mo48487C((er8) K.mo48885o());
        uq8.mo48487C((er8) K2.mo48885o());
    }

    /* renamed from: E */
    public static final void m51546E(uq8 uq8, String str) {
        List<er8> w = uq8.mo48499w();
        for (int i = 0; i < w.size(); i++) {
            if (str.equals(w.get(i).mo42393y())) {
                uq8.mo48491G(i);
                return;
            }
        }
    }

    /* renamed from: F */
    public static s59 m51547F(Context context) {
        cu4.m43221k(context);
        cu4.m43221k(context.getApplicationContext());
        if (f33716B == null) {
            synchronized (s59.class) {
                if (f33716B == null) {
                    f33716B = new s59((u59) cu4.m43221k(new u59(context)), (kr8) null);
                }
            }
        }
        return f33716B;
    }

    /* renamed from: Q */
    public static final t49 m51548Q(t49 t49) {
        if (t49 == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (t49.mo47981f()) {
            return t49;
        } else {
            String valueOf = String.valueOf(t49.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: A */
    public final bn8 mo45237A() {
        return ((kr8) cu4.m43221k(this.f33728k)).mo45237A();
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x03c7 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d54 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x048b A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d54 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04e5 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d54 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0630 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d54 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0648 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d54 }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x097e A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d54 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x09c7 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d54 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x09ea A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d54 }] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0a61 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d54 }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0a63 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d54 }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0a6b A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d54 }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0a97 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d54 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:440:0x0d42=Splitter:B:440:0x0d42, B:69:0x0209=Splitter:B:69:0x0209} */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47637G(java.lang.String r46, long r47) {
        /*
            r45 = this;
            r1 = r45
            java.lang.String r2 = "_sc"
            java.lang.String r3 = "_sn"
            java.lang.String r4 = "_npa"
            java.lang.String r5 = "_ai"
            m78 r6 = r1.f33720c
            m51548Q(r6)
            r6.mo45657M()
            q59 r6 = new q59     // Catch:{ all -> 0x0d54 }
            r14 = 0
            r6.<init>(r1, r14)     // Catch:{ all -> 0x0d54 }
            m78 r7 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r7)     // Catch:{ all -> 0x0d54 }
            r8 = 0
            long r11 = r1.f33742y     // Catch:{ all -> 0x0d54 }
            r9 = r47
            r13 = r6
            r7.mo45654I(r8, r9, r11, r13)     // Catch:{ all -> 0x0d54 }
            java.util.List<wq8> r7 = r6.f32945c     // Catch:{ all -> 0x0d54 }
            if (r7 == 0) goto L_0x0d42
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0d54 }
            if (r7 == 0) goto L_0x0032
            goto L_0x0d42
        L_0x0032:
            or8 r7 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            w39 r7 = r7.mo47634s()     // Catch:{ all -> 0x0d54 }
            nr8 r7 = (p000.nr8) r7     // Catch:{ all -> 0x0d54 }
            r7.mo46207z0()     // Catch:{ all -> 0x0d54 }
            n68 r9 = r45.mo47648S()     // Catch:{ all -> 0x0d54 }
            or8 r10 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r10 = r10.mo46511x()     // Catch:{ all -> 0x0d54 }
            uk8<java.lang.Boolean> r11 = p000.rl8.f33479V     // Catch:{ all -> 0x0d54 }
            boolean r9 = r9.mo45997v(r10, r11)     // Catch:{ all -> 0x0d54 }
            r18 = r14
            r20 = r18
            r8 = -1
            r10 = -1
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
        L_0x005a:
            java.util.List<wq8> r11 = r6.f32945c     // Catch:{ all -> 0x0d54 }
            int r11 = r11.size()     // Catch:{ all -> 0x0d54 }
            java.lang.String r12 = "_fr"
            java.lang.String r14 = "_et"
            r23 = r4
            java.lang.String r4 = "_e"
            r24 = r2
            r25 = r3
            if (r13 >= r11) goto L_0x069e
            java.util.List<wq8> r3 = r6.f32945c     // Catch:{ all -> 0x0d54 }
            java.lang.Object r3 = r3.get(r13)     // Catch:{ all -> 0x0d54 }
            wq8 r3 = (p000.wq8) r3     // Catch:{ all -> 0x0d54 }
            w39 r3 = r3.mo47634s()     // Catch:{ all -> 0x0d54 }
            uq8 r3 = (p000.uq8) r3     // Catch:{ all -> 0x0d54 }
            qq8 r11 = r1.f33718a     // Catch:{ all -> 0x0d54 }
            m51548Q(r11)     // Catch:{ all -> 0x0d54 }
            or8 r2 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r2 = r2.mo46511x()     // Catch:{ all -> 0x0d54 }
            r28 = r13
            java.lang.String r13 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            boolean r2 = r11.mo47256r(r2, r13)     // Catch:{ all -> 0x0d54 }
            java.lang.String r11 = "_err"
            if (r2 == 0) goto L_0x011c
            bn8 r2 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r2 = r2.mo29673o()     // Catch:{ all -> 0x0d54 }
            java.lang.String r4 = "Dropping blacklisted raw event. appId"
            or8 r12 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r12 = r12.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.Object r12 = p000.bn8.m32664w(r12)     // Catch:{ all -> 0x0d54 }
            kr8 r13 = r1.f33728k     // Catch:{ all -> 0x0d54 }
            mm8 r13 = r13.mo45244H()     // Catch:{ all -> 0x0d54 }
            java.lang.String r14 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            java.lang.String r13 = r13.mo45821m(r14)     // Catch:{ all -> 0x0d54 }
            r2.mo48771c(r4, r12, r13)     // Catch:{ all -> 0x0d54 }
            qq8 r2 = r1.f33718a     // Catch:{ all -> 0x0d54 }
            m51548Q(r2)     // Catch:{ all -> 0x0d54 }
            or8 r4 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r4 = r4.mo46511x()     // Catch:{ all -> 0x0d54 }
            boolean r2 = r2.mo47259v(r4)     // Catch:{ all -> 0x0d54 }
            if (r2 != 0) goto L_0x010d
            qq8 r2 = r1.f33718a     // Catch:{ all -> 0x0d54 }
            m51548Q(r2)     // Catch:{ all -> 0x0d54 }
            or8 r4 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r4 = r4.mo46511x()     // Catch:{ all -> 0x0d54 }
            boolean r2 = r2.mo47260w(r4)     // Catch:{ all -> 0x0d54 }
            if (r2 == 0) goto L_0x00dd
            goto L_0x010d
        L_0x00dd:
            java.lang.String r2 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x0d54 }
            if (r2 != 0) goto L_0x010d
            g69 r29 = r45.mo47659c0()     // Catch:{ all -> 0x0d54 }
            d69 r2 = r1.f33717A     // Catch:{ all -> 0x0d54 }
            or8 r4 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r31 = r4.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.String r33 = "_ev"
            java.lang.String r34 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            n68 r3 = r45.mo47648S()     // Catch:{ all -> 0x0d54 }
            uk8<java.lang.Boolean> r4 = p000.rl8.f33531x0     // Catch:{ all -> 0x0d54 }
            r11 = 0
            boolean r36 = r3.mo45997v(r11, r4)     // Catch:{ all -> 0x0d54 }
            r32 = 11
            r35 = 0
            r30 = r2
            r29.mo42838z(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0d54 }
        L_0x010d:
            r30 = r5
            r5 = r7
            r31 = r15
            r14 = r24
            r11 = r25
            r7 = r28
            r16 = r9
            goto L_0x068e
        L_0x011c:
            java.lang.String r2 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            java.lang.String r13 = p000.cu8.m43237a(r5)     // Catch:{ all -> 0x0d54 }
            boolean r2 = r2.equals(r13)     // Catch:{ all -> 0x0d54 }
            if (r2 == 0) goto L_0x0192
            r3.mo48493I(r5)     // Catch:{ all -> 0x0d54 }
            bn8 r2 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r2 = r2.mo29678v()     // Catch:{ all -> 0x0d54 }
            java.lang.String r13 = "Renaming ad_impression to _ai"
            r2.mo48769a(r13)     // Catch:{ all -> 0x0d54 }
            bn8 r2 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            java.lang.String r2 = r2.mo29680y()     // Catch:{ all -> 0x0d54 }
            r13 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r13)     // Catch:{ all -> 0x0d54 }
            if (r2 == 0) goto L_0x0192
            r2 = 0
        L_0x014a:
            int r13 = r3.mo48500x()     // Catch:{ all -> 0x0d54 }
            if (r2 >= r13) goto L_0x0192
            java.lang.String r13 = "ad_platform"
            er8 r29 = r3.mo48501y(r2)     // Catch:{ all -> 0x0d54 }
            r30 = r5
            java.lang.String r5 = r29.mo42393y()     // Catch:{ all -> 0x0d54 }
            boolean r5 = r13.equals(r5)     // Catch:{ all -> 0x0d54 }
            if (r5 == 0) goto L_0x018d
            er8 r5 = r3.mo48501y(r2)     // Catch:{ all -> 0x0d54 }
            java.lang.String r5 = r5.mo42382B()     // Catch:{ all -> 0x0d54 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0d54 }
            if (r5 != 0) goto L_0x018d
            java.lang.String r5 = "admob"
            er8 r13 = r3.mo48501y(r2)     // Catch:{ all -> 0x0d54 }
            java.lang.String r13 = r13.mo42382B()     // Catch:{ all -> 0x0d54 }
            boolean r5 = r5.equalsIgnoreCase(r13)     // Catch:{ all -> 0x0d54 }
            if (r5 == 0) goto L_0x018d
            bn8 r5 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r5 = r5.mo29675r()     // Catch:{ all -> 0x0d54 }
            java.lang.String r13 = "AdMob ad impression logged from app. Potentially duplicative."
            r5.mo48769a(r13)     // Catch:{ all -> 0x0d54 }
        L_0x018d:
            int r2 = r2 + 1
            r5 = r30
            goto L_0x014a
        L_0x0192:
            r30 = r5
            qq8 r2 = r1.f33718a     // Catch:{ all -> 0x0d54 }
            m51548Q(r2)     // Catch:{ all -> 0x0d54 }
            or8 r5 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r5 = r5.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.String r13 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            boolean r2 = r2.mo47257t(r5, r13)     // Catch:{ all -> 0x0d54 }
            java.lang.String r5 = "_c"
            if (r2 != 0) goto L_0x0200
            w59 r13 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r13)     // Catch:{ all -> 0x0d54 }
            java.lang.String r13 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            p000.cu4.m43217g(r13)     // Catch:{ all -> 0x0d54 }
            r31 = r15
            int r15 = r13.hashCode()     // Catch:{ all -> 0x0d54 }
            r16 = r9
            r9 = 94660(0x171c4, float:1.32647E-40)
            if (r15 == r9) goto L_0x01e3
            r9 = 95025(0x17331, float:1.33158E-40)
            if (r15 == r9) goto L_0x01d9
            r9 = 95027(0x17333, float:1.33161E-40)
            if (r15 == r9) goto L_0x01cf
            goto L_0x01ed
        L_0x01cf:
            java.lang.String r9 = "_ui"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x01ed
            r9 = 1
            goto L_0x01ee
        L_0x01d9:
            java.lang.String r9 = "_ug"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x01ed
            r9 = 2
            goto L_0x01ee
        L_0x01e3:
            java.lang.String r9 = "_in"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x01ed
            r9 = 0
            goto L_0x01ee
        L_0x01ed:
            r9 = -1
        L_0x01ee:
            if (r9 == 0) goto L_0x0204
            r13 = 1
            if (r9 == r13) goto L_0x0204
            r13 = 2
            if (r9 == r13) goto L_0x0204
            r33 = r7
            r22 = r8
            r13 = r10
            r29 = r14
            r2 = 0
            goto L_0x03c5
        L_0x0200:
            r31 = r15
            r16 = r9
        L_0x0204:
            r22 = r8
            r9 = 0
            r13 = 0
            r15 = 0
        L_0x0209:
            int r8 = r3.mo48500x()     // Catch:{ all -> 0x0d54 }
            r29 = r14
            java.lang.String r14 = "_r"
            if (r9 >= r8) goto L_0x0267
            er8 r8 = r3.mo48501y(r9)     // Catch:{ all -> 0x0d54 }
            java.lang.String r8 = r8.mo42393y()     // Catch:{ all -> 0x0d54 }
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x0d54 }
            if (r8 == 0) goto L_0x023b
            er8 r8 = r3.mo48501y(r9)     // Catch:{ all -> 0x0d54 }
            w39 r8 = r8.mo47634s()     // Catch:{ all -> 0x0d54 }
            br8 r8 = (p000.br8) r8     // Catch:{ all -> 0x0d54 }
            r13 = 1
            r8.mo29708z(r13)     // Catch:{ all -> 0x0d54 }
            s49 r8 = r8.mo48885o()     // Catch:{ all -> 0x0d54 }
            er8 r8 = (p000.er8) r8     // Catch:{ all -> 0x0d54 }
            r3.mo48502z(r9, r8)     // Catch:{ all -> 0x0d54 }
            r13 = 1
            goto L_0x0262
        L_0x023b:
            er8 r8 = r3.mo48501y(r9)     // Catch:{ all -> 0x0d54 }
            java.lang.String r8 = r8.mo42393y()     // Catch:{ all -> 0x0d54 }
            boolean r8 = r14.equals(r8)     // Catch:{ all -> 0x0d54 }
            if (r8 == 0) goto L_0x0262
            er8 r8 = r3.mo48501y(r9)     // Catch:{ all -> 0x0d54 }
            w39 r8 = r8.mo47634s()     // Catch:{ all -> 0x0d54 }
            br8 r8 = (p000.br8) r8     // Catch:{ all -> 0x0d54 }
            r14 = 1
            r8.mo29708z(r14)     // Catch:{ all -> 0x0d54 }
            s49 r8 = r8.mo48885o()     // Catch:{ all -> 0x0d54 }
            er8 r8 = (p000.er8) r8     // Catch:{ all -> 0x0d54 }
            r3.mo48502z(r9, r8)     // Catch:{ all -> 0x0d54 }
            r15 = 1
        L_0x0262:
            int r9 = r9 + 1
            r14 = r29
            goto L_0x0209
        L_0x0267:
            if (r13 != 0) goto L_0x0298
            if (r2 == 0) goto L_0x0298
            bn8 r8 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r8 = r8.mo29678v()     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = "Marking event as conversion"
            kr8 r13 = r1.f33728k     // Catch:{ all -> 0x0d54 }
            mm8 r13 = r13.mo45244H()     // Catch:{ all -> 0x0d54 }
            r33 = r7
            java.lang.String r7 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            java.lang.String r7 = r13.mo45821m(r7)     // Catch:{ all -> 0x0d54 }
            r8.mo48770b(r9, r7)     // Catch:{ all -> 0x0d54 }
            br8 r7 = p000.er8.m44025K()     // Catch:{ all -> 0x0d54 }
            r7.mo29705w(r5)     // Catch:{ all -> 0x0d54 }
            r8 = 1
            r7.mo29708z(r8)     // Catch:{ all -> 0x0d54 }
            r3.mo48488D(r7)     // Catch:{ all -> 0x0d54 }
            goto L_0x029a
        L_0x0298:
            r33 = r7
        L_0x029a:
            if (r15 != 0) goto L_0x02c6
            bn8 r7 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r7 = r7.mo29678v()     // Catch:{ all -> 0x0d54 }
            java.lang.String r8 = "Marking event as real-time"
            kr8 r9 = r1.f33728k     // Catch:{ all -> 0x0d54 }
            mm8 r9 = r9.mo45244H()     // Catch:{ all -> 0x0d54 }
            java.lang.String r13 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = r9.mo45821m(r13)     // Catch:{ all -> 0x0d54 }
            r7.mo48770b(r8, r9)     // Catch:{ all -> 0x0d54 }
            br8 r7 = p000.er8.m44025K()     // Catch:{ all -> 0x0d54 }
            r7.mo29705w(r14)     // Catch:{ all -> 0x0d54 }
            r8 = 1
            r7.mo29708z(r8)     // Catch:{ all -> 0x0d54 }
            r3.mo48488D(r7)     // Catch:{ all -> 0x0d54 }
        L_0x02c6:
            m78 r7 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r7)     // Catch:{ all -> 0x0d54 }
            long r35 = r45.mo47667g0()     // Catch:{ all -> 0x0d54 }
            or8 r8 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r37 = r8.mo46511x()     // Catch:{ all -> 0x0d54 }
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 1
            r34 = r7
            b78 r7 = r34.mo45675e0(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0d54 }
            long r7 = r7.f21167e     // Catch:{ all -> 0x0d54 }
            n68 r9 = r45.mo47648S()     // Catch:{ all -> 0x0d54 }
            or8 r13 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r13 = r13.mo46511x()     // Catch:{ all -> 0x0d54 }
            uk8<java.lang.Integer> r15 = p000.rl8.f33514p     // Catch:{ all -> 0x0d54 }
            int r9 = r9.mo45994r(r13, r15)     // Catch:{ all -> 0x0d54 }
            r13 = r10
            long r9 = (long) r9     // Catch:{ all -> 0x0d54 }
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0301
            m51546E(r3, r14)     // Catch:{ all -> 0x0d54 }
            goto L_0x0303
        L_0x0301:
            r19 = 1
        L_0x0303:
            java.lang.String r7 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            boolean r7 = p000.g69.m44586j0(r7)     // Catch:{ all -> 0x0d54 }
            if (r7 == 0) goto L_0x03c5
            if (r2 == 0) goto L_0x03c5
            m78 r7 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r7)     // Catch:{ all -> 0x0d54 }
            long r35 = r45.mo47667g0()     // Catch:{ all -> 0x0d54 }
            or8 r8 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r37 = r8.mo46511x()     // Catch:{ all -> 0x0d54 }
            r38 = 0
            r39 = 0
            r40 = 1
            r41 = 0
            r42 = 0
            r34 = r7
            b78 r7 = r34.mo45675e0(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0d54 }
            long r7 = r7.f21165c     // Catch:{ all -> 0x0d54 }
            n68 r9 = r45.mo47648S()     // Catch:{ all -> 0x0d54 }
            or8 r10 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r10 = r10.mo46511x()     // Catch:{ all -> 0x0d54 }
            uk8<java.lang.Integer> r14 = p000.rl8.f33512o     // Catch:{ all -> 0x0d54 }
            int r9 = r9.mo45994r(r10, r14)     // Catch:{ all -> 0x0d54 }
            long r9 = (long) r9     // Catch:{ all -> 0x0d54 }
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x03c5
            bn8 r7 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r7 = r7.mo29673o()     // Catch:{ all -> 0x0d54 }
            java.lang.String r8 = "Too many conversions. Not logging as conversion. appId"
            or8 r9 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = r9.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.Object r9 = p000.bn8.m32664w(r9)     // Catch:{ all -> 0x0d54 }
            r7.mo48770b(r8, r9)     // Catch:{ all -> 0x0d54 }
            r7 = 0
            r8 = 0
            r9 = -1
            r10 = 0
        L_0x0360:
            int r14 = r3.mo48500x()     // Catch:{ all -> 0x0d54 }
            if (r7 >= r14) goto L_0x038b
            er8 r14 = r3.mo48501y(r7)     // Catch:{ all -> 0x0d54 }
            java.lang.String r15 = r14.mo42393y()     // Catch:{ all -> 0x0d54 }
            boolean r15 = r5.equals(r15)     // Catch:{ all -> 0x0d54 }
            if (r15 == 0) goto L_0x037d
            w39 r9 = r14.mo47634s()     // Catch:{ all -> 0x0d54 }
            br8 r9 = (p000.br8) r9     // Catch:{ all -> 0x0d54 }
            r10 = r9
            r9 = r7
            goto L_0x0388
        L_0x037d:
            java.lang.String r14 = r14.mo42393y()     // Catch:{ all -> 0x0d54 }
            boolean r14 = r11.equals(r14)     // Catch:{ all -> 0x0d54 }
            if (r14 == 0) goto L_0x0388
            r8 = 1
        L_0x0388:
            int r7 = r7 + 1
            goto L_0x0360
        L_0x038b:
            if (r8 == 0) goto L_0x0394
            if (r10 == 0) goto L_0x0393
            r3.mo48491G(r9)     // Catch:{ all -> 0x0d54 }
            goto L_0x03c5
        L_0x0393:
            r10 = 0
        L_0x0394:
            if (r10 == 0) goto L_0x03ae
            w39 r7 = r10.clone()     // Catch:{ all -> 0x0d54 }
            br8 r7 = (p000.br8) r7     // Catch:{ all -> 0x0d54 }
            r7.mo29705w(r11)     // Catch:{ all -> 0x0d54 }
            r10 = 10
            r7.mo29708z(r10)     // Catch:{ all -> 0x0d54 }
            s49 r7 = r7.mo48885o()     // Catch:{ all -> 0x0d54 }
            er8 r7 = (p000.er8) r7     // Catch:{ all -> 0x0d54 }
            r3.mo48502z(r9, r7)     // Catch:{ all -> 0x0d54 }
            goto L_0x03c5
        L_0x03ae:
            bn8 r7 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r7 = r7.mo29670l()     // Catch:{ all -> 0x0d54 }
            java.lang.String r8 = "Did not find conversion parameter. appId"
            or8 r9 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = r9.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.Object r9 = p000.bn8.m32664w(r9)     // Catch:{ all -> 0x0d54 }
            r7.mo48770b(r8, r9)     // Catch:{ all -> 0x0d54 }
        L_0x03c5:
            if (r2 == 0) goto L_0x047e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0d54 }
            java.util.List r7 = r3.mo48499w()     // Catch:{ all -> 0x0d54 }
            r2.<init>(r7)     // Catch:{ all -> 0x0d54 }
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x03d3:
            int r10 = r2.size()     // Catch:{ all -> 0x0d54 }
            java.lang.String r11 = "currency"
            java.lang.String r14 = "value"
            if (r7 >= r10) goto L_0x0403
            java.lang.Object r10 = r2.get(r7)     // Catch:{ all -> 0x0d54 }
            er8 r10 = (p000.er8) r10     // Catch:{ all -> 0x0d54 }
            java.lang.String r10 = r10.mo42393y()     // Catch:{ all -> 0x0d54 }
            boolean r10 = r14.equals(r10)     // Catch:{ all -> 0x0d54 }
            if (r10 == 0) goto L_0x03ef
            r8 = r7
            goto L_0x0400
        L_0x03ef:
            java.lang.Object r10 = r2.get(r7)     // Catch:{ all -> 0x0d54 }
            er8 r10 = (p000.er8) r10     // Catch:{ all -> 0x0d54 }
            java.lang.String r10 = r10.mo42393y()     // Catch:{ all -> 0x0d54 }
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x0d54 }
            if (r10 == 0) goto L_0x0400
            r9 = r7
        L_0x0400:
            int r7 = r7 + 1
            goto L_0x03d3
        L_0x0403:
            r7 = -1
            if (r8 != r7) goto L_0x0408
            goto L_0x047f
        L_0x0408:
            java.lang.Object r7 = r2.get(r8)     // Catch:{ all -> 0x0d54 }
            er8 r7 = (p000.er8) r7     // Catch:{ all -> 0x0d54 }
            boolean r7 = r7.mo42383C()     // Catch:{ all -> 0x0d54 }
            if (r7 != 0) goto L_0x0439
            java.lang.Object r7 = r2.get(r8)     // Catch:{ all -> 0x0d54 }
            er8 r7 = (p000.er8) r7     // Catch:{ all -> 0x0d54 }
            boolean r7 = r7.mo42387G()     // Catch:{ all -> 0x0d54 }
            if (r7 != 0) goto L_0x0439
            bn8 r2 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r2 = r2.mo29675r()     // Catch:{ all -> 0x0d54 }
            java.lang.String r7 = "Value must be specified with a numeric type."
            r2.mo48769a(r7)     // Catch:{ all -> 0x0d54 }
            r3.mo48491G(r8)     // Catch:{ all -> 0x0d54 }
            m51546E(r3, r5)     // Catch:{ all -> 0x0d54 }
            r2 = 18
            m51545D(r3, r2, r14)     // Catch:{ all -> 0x0d54 }
            goto L_0x047e
        L_0x0439:
            r7 = -1
            if (r9 != r7) goto L_0x043d
            goto L_0x0465
        L_0x043d:
            java.lang.Object r2 = r2.get(r9)     // Catch:{ all -> 0x0d54 }
            er8 r2 = (p000.er8) r2     // Catch:{ all -> 0x0d54 }
            java.lang.String r2 = r2.mo42382B()     // Catch:{ all -> 0x0d54 }
            int r9 = r2.length()     // Catch:{ all -> 0x0d54 }
            r10 = 3
            if (r9 != r10) goto L_0x0465
            r9 = 0
        L_0x044f:
            int r10 = r2.length()     // Catch:{ all -> 0x0d54 }
            if (r9 >= r10) goto L_0x047f
            int r10 = r2.codePointAt(r9)     // Catch:{ all -> 0x0d54 }
            boolean r14 = java.lang.Character.isLetter(r10)     // Catch:{ all -> 0x0d54 }
            if (r14 == 0) goto L_0x0465
            int r10 = java.lang.Character.charCount(r10)     // Catch:{ all -> 0x0d54 }
            int r9 = r9 + r10
            goto L_0x044f
        L_0x0465:
            bn8 r2 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r2 = r2.mo29675r()     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo48769a(r9)     // Catch:{ all -> 0x0d54 }
            r3.mo48491G(r8)     // Catch:{ all -> 0x0d54 }
            m51546E(r3, r5)     // Catch:{ all -> 0x0d54 }
            r2 = 19
            m51545D(r3, r2, r11)     // Catch:{ all -> 0x0d54 }
            goto L_0x047f
        L_0x047e:
            r7 = -1
        L_0x047f:
            java.lang.String r2 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0d54 }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04e5
            w59 r2 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r2)     // Catch:{ all -> 0x0d54 }
            s49 r2 = r3.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r2 = (p000.wq8) r2     // Catch:{ all -> 0x0d54 }
            er8 r2 = p000.w59.m53718j(r2, r12)     // Catch:{ all -> 0x0d54 }
            if (r2 != 0) goto L_0x04df
            if (r20 == 0) goto L_0x04d0
            long r10 = r20.mo48495K()     // Catch:{ all -> 0x0d54 }
            long r14 = r3.mo48495K()     // Catch:{ all -> 0x0d54 }
            long r10 = r10 - r14
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0d54 }
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x04d0
            w39 r2 = r20.clone()     // Catch:{ all -> 0x0d54 }
            uq8 r2 = (p000.uq8) r2     // Catch:{ all -> 0x0d54 }
            boolean r5 = r1.mo47639I(r3, r2)     // Catch:{ all -> 0x0d54 }
            if (r5 == 0) goto L_0x04c7
            r12 = r13
            r5 = r33
            r5.mo46200v0(r12, r2)     // Catch:{ all -> 0x0d54 }
            r8 = r22
            r2 = 0
            r20 = 0
            goto L_0x04cd
        L_0x04c7:
            r12 = r13
            r5 = r33
            r2 = r3
            r8 = r17
        L_0x04cd:
            r18 = r2
            goto L_0x04d7
        L_0x04d0:
            r12 = r13
            r5 = r33
            r18 = r3
            r8 = r17
        L_0x04d7:
            r14 = r24
            r11 = r25
            r10 = r29
            goto L_0x061e
        L_0x04df:
            r12 = r13
            r5 = r33
            r8 = r22
            goto L_0x04d7
        L_0x04e5:
            r12 = r13
            r5 = r33
            java.lang.String r2 = "_vs"
            java.lang.String r10 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            boolean r2 = r2.equals(r10)     // Catch:{ all -> 0x0d54 }
            if (r2 == 0) goto L_0x0547
            w59 r2 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r2)     // Catch:{ all -> 0x0d54 }
            s49 r2 = r3.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r2 = (p000.wq8) r2     // Catch:{ all -> 0x0d54 }
            r10 = r29
            er8 r2 = p000.w59.m53718j(r2, r10)     // Catch:{ all -> 0x0d54 }
            if (r2 != 0) goto L_0x0544
            if (r18 == 0) goto L_0x0538
            long r13 = r18.mo48495K()     // Catch:{ all -> 0x0d54 }
            long r20 = r3.mo48495K()     // Catch:{ all -> 0x0d54 }
            long r13 = r13 - r20
            long r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0d54 }
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0538
            w39 r2 = r18.clone()     // Catch:{ all -> 0x0d54 }
            uq8 r2 = (p000.uq8) r2     // Catch:{ all -> 0x0d54 }
            boolean r8 = r1.mo47639I(r2, r3)     // Catch:{ all -> 0x0d54 }
            if (r8 == 0) goto L_0x0530
            r8 = r22
            r5.mo46200v0(r8, r2)     // Catch:{ all -> 0x0d54 }
            r2 = 0
            r18 = 0
            goto L_0x0535
        L_0x0530:
            r8 = r22
            r2 = r3
            r12 = r17
        L_0x0535:
            r20 = r2
            goto L_0x053e
        L_0x0538:
            r8 = r22
            r20 = r3
            r12 = r17
        L_0x053e:
            r14 = r24
            r11 = r25
            goto L_0x061e
        L_0x0544:
            r8 = r22
            goto L_0x053e
        L_0x0547:
            r8 = r22
            r10 = r29
            n68 r2 = r45.mo47648S()     // Catch:{ all -> 0x0d54 }
            or8 r9 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = r9.mo46511x()     // Catch:{ all -> 0x0d54 }
            uk8<java.lang.Boolean> r11 = p000.rl8.f33507l0     // Catch:{ all -> 0x0d54 }
            boolean r2 = r2.mo45997v(r9, r11)     // Catch:{ all -> 0x0d54 }
            if (r2 == 0) goto L_0x053e
            java.lang.String r2 = "_ab"
            java.lang.String r9 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0d54 }
            if (r2 == 0) goto L_0x053e
            w59 r2 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r2)     // Catch:{ all -> 0x0d54 }
            s49 r2 = r3.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r2 = (p000.wq8) r2     // Catch:{ all -> 0x0d54 }
            er8 r2 = p000.w59.m53718j(r2, r10)     // Catch:{ all -> 0x0d54 }
            if (r2 != 0) goto L_0x053e
            if (r18 == 0) goto L_0x053e
            long r13 = r18.mo48495K()     // Catch:{ all -> 0x0d54 }
            long r26 = r3.mo48495K()     // Catch:{ all -> 0x0d54 }
            long r13 = r13 - r26
            long r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0d54 }
            r26 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r2 > 0) goto L_0x053e
            w39 r2 = r18.clone()     // Catch:{ all -> 0x0d54 }
            uq8 r2 = (p000.uq8) r2     // Catch:{ all -> 0x0d54 }
            r1.mo47640J(r2, r3)     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = r2.mo48492H()     // Catch:{ all -> 0x0d54 }
            boolean r9 = r4.equals(r9)     // Catch:{ all -> 0x0d54 }
            p000.cu4.m43211a(r9)     // Catch:{ all -> 0x0d54 }
            w59 r9 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r9)     // Catch:{ all -> 0x0d54 }
            s49 r9 = r2.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r9 = (p000.wq8) r9     // Catch:{ all -> 0x0d54 }
            r11 = r25
            er8 r9 = p000.w59.m53718j(r9, r11)     // Catch:{ all -> 0x0d54 }
            w59 r13 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r13)     // Catch:{ all -> 0x0d54 }
            s49 r13 = r2.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r13 = (p000.wq8) r13     // Catch:{ all -> 0x0d54 }
            r14 = r24
            er8 r13 = p000.w59.m53718j(r13, r14)     // Catch:{ all -> 0x0d54 }
            w59 r15 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r15)     // Catch:{ all -> 0x0d54 }
            s49 r15 = r2.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r15 = (p000.wq8) r15     // Catch:{ all -> 0x0d54 }
            java.lang.String r7 = "_si"
            er8 r7 = p000.w59.m53718j(r15, r7)     // Catch:{ all -> 0x0d54 }
            if (r9 == 0) goto L_0x05de
            java.lang.String r9 = r9.mo42382B()     // Catch:{ all -> 0x0d54 }
            goto L_0x05e0
        L_0x05de:
            java.lang.String r9 = ""
        L_0x05e0:
            boolean r15 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0d54 }
            if (r15 != 0) goto L_0x05ee
            w59 r15 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r15)     // Catch:{ all -> 0x0d54 }
            p000.w59.m53716N(r3, r11, r9)     // Catch:{ all -> 0x0d54 }
        L_0x05ee:
            if (r13 == 0) goto L_0x05f5
            java.lang.String r9 = r13.mo42382B()     // Catch:{ all -> 0x0d54 }
            goto L_0x05f7
        L_0x05f5:
            java.lang.String r9 = ""
        L_0x05f7:
            boolean r13 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0d54 }
            if (r13 != 0) goto L_0x0605
            w59 r13 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r13)     // Catch:{ all -> 0x0d54 }
            p000.w59.m53716N(r3, r14, r9)     // Catch:{ all -> 0x0d54 }
        L_0x0605:
            if (r7 == 0) goto L_0x0619
            w59 r9 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r9)     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = "_si"
            long r24 = r7.mo42384D()     // Catch:{ all -> 0x0d54 }
            java.lang.Long r7 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0d54 }
            p000.w59.m53716N(r3, r9, r7)     // Catch:{ all -> 0x0d54 }
        L_0x0619:
            r5.mo46200v0(r8, r2)     // Catch:{ all -> 0x0d54 }
            r18 = 0
        L_0x061e:
            if (r16 != 0) goto L_0x067b
            java.lang.String r2 = r3.mo48492H()     // Catch:{ all -> 0x0d54 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0d54 }
            if (r2 == 0) goto L_0x067b
            int r2 = r3.mo48500x()     // Catch:{ all -> 0x0d54 }
            if (r2 != 0) goto L_0x0648
            bn8 r2 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r2 = r2.mo29673o()     // Catch:{ all -> 0x0d54 }
            java.lang.String r4 = "Engagement event does not contain any parameters. appId"
            or8 r7 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r7 = r7.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.Object r7 = p000.bn8.m32664w(r7)     // Catch:{ all -> 0x0d54 }
            r2.mo48770b(r4, r7)     // Catch:{ all -> 0x0d54 }
            goto L_0x067b
        L_0x0648:
            w59 r2 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r2)     // Catch:{ all -> 0x0d54 }
            s49 r2 = r3.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r2 = (p000.wq8) r2     // Catch:{ all -> 0x0d54 }
            java.lang.Object r2 = p000.w59.m53719k(r2, r10)     // Catch:{ all -> 0x0d54 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0d54 }
            if (r2 != 0) goto L_0x0673
            bn8 r2 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r2 = r2.mo29673o()     // Catch:{ all -> 0x0d54 }
            java.lang.String r4 = "Engagement event does not include duration. appId"
            or8 r7 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r7 = r7.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.Object r7 = p000.bn8.m32664w(r7)     // Catch:{ all -> 0x0d54 }
            r2.mo48770b(r4, r7)     // Catch:{ all -> 0x0d54 }
            goto L_0x067b
        L_0x0673:
            long r9 = r2.longValue()     // Catch:{ all -> 0x0d54 }
            long r9 = r31 + r9
            r31 = r9
        L_0x067b:
            java.util.List<wq8> r2 = r6.f32945c     // Catch:{ all -> 0x0d54 }
            s49 r4 = r3.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r4 = (p000.wq8) r4     // Catch:{ all -> 0x0d54 }
            r7 = r28
            r2.set(r7, r4)     // Catch:{ all -> 0x0d54 }
            int r17 = r17 + 1
            r5.mo46202w0(r3)     // Catch:{ all -> 0x0d54 }
            r10 = r12
        L_0x068e:
            int r13 = r7 + 1
            r7 = r5
            r3 = r11
            r2 = r14
            r9 = r16
            r4 = r23
            r5 = r30
            r15 = r31
            r14 = 0
            goto L_0x005a
        L_0x069e:
            r5 = r7
            r10 = r14
            r31 = r15
            r16 = r9
            if (r16 == 0) goto L_0x06ff
            r3 = r17
            r15 = r31
            r2 = 0
        L_0x06ab:
            if (r2 >= r3) goto L_0x06fd
            wq8 r7 = r5.mo46199u0(r2)     // Catch:{ all -> 0x0d54 }
            java.lang.String r8 = r7.mo49247B()     // Catch:{ all -> 0x0d54 }
            boolean r8 = r4.equals(r8)     // Catch:{ all -> 0x0d54 }
            if (r8 == 0) goto L_0x06ce
            w59 r8 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r8)     // Catch:{ all -> 0x0d54 }
            er8 r8 = p000.w59.m53718j(r7, r12)     // Catch:{ all -> 0x0d54 }
            if (r8 == 0) goto L_0x06ce
            r5.mo46140A0(r2)     // Catch:{ all -> 0x0d54 }
            int r3 = r3 + -1
            int r2 = r2 + -1
            goto L_0x06fa
        L_0x06ce:
            w59 r8 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r8)     // Catch:{ all -> 0x0d54 }
            er8 r7 = p000.w59.m53718j(r7, r10)     // Catch:{ all -> 0x0d54 }
            if (r7 == 0) goto L_0x06fa
            boolean r8 = r7.mo42383C()     // Catch:{ all -> 0x0d54 }
            if (r8 == 0) goto L_0x06e8
            long r7 = r7.mo42384D()     // Catch:{ all -> 0x0d54 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0d54 }
            goto L_0x06e9
        L_0x06e8:
            r7 = 0
        L_0x06e9:
            if (r7 == 0) goto L_0x06fa
            long r8 = r7.longValue()     // Catch:{ all -> 0x0d54 }
            r13 = 0
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x06fa
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d54 }
            long r15 = r15 + r7
        L_0x06fa:
            r7 = 1
            int r2 = r2 + r7
            goto L_0x06ab
        L_0x06fd:
            r2 = r15
            goto L_0x0701
        L_0x06ff:
            r2 = r31
        L_0x0701:
            r4 = 0
            r1.mo47638H(r5, r2, r4)     // Catch:{ all -> 0x0d54 }
            java.util.List r4 = r5.mo46197s0()     // Catch:{ all -> 0x0d54 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0d54 }
        L_0x070d:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x0d54 }
            java.lang.String r8 = "_se"
            if (r7 == 0) goto L_0x0733
            java.lang.String r7 = "_s"
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x0d54 }
            wq8 r9 = (p000.wq8) r9     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = r9.mo49247B()     // Catch:{ all -> 0x0d54 }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0d54 }
            if (r7 == 0) goto L_0x070d
            m78 r4 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r4)     // Catch:{ all -> 0x0d54 }
            java.lang.String r7 = r5.mo46145D()     // Catch:{ all -> 0x0d54 }
            r4.mo45663S(r7, r8)     // Catch:{ all -> 0x0d54 }
        L_0x0733:
            java.lang.String r4 = "_sid"
            int r4 = p000.w59.m53713K(r5, r4)     // Catch:{ all -> 0x0d54 }
            if (r4 < 0) goto L_0x0740
            r4 = 1
            r1.mo47638H(r5, r2, r4)     // Catch:{ all -> 0x0d54 }
            goto L_0x0760
        L_0x0740:
            int r2 = p000.w59.m53713K(r5, r8)     // Catch:{ all -> 0x0d54 }
            if (r2 < 0) goto L_0x0760
            r5.mo46158K0(r2)     // Catch:{ all -> 0x0d54 }
            bn8 r2 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x0d54 }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            or8 r4 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r4 = r4.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.Object r4 = p000.bn8.m32664w(r4)     // Catch:{ all -> 0x0d54 }
            r2.mo48770b(r3, r4)     // Catch:{ all -> 0x0d54 }
        L_0x0760:
            w59 r2 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r2)     // Catch:{ all -> 0x0d54 }
            kr8 r3 = r2.f34342a     // Catch:{ all -> 0x0d54 }
            bn8 r3 = r3.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r3 = r3.mo29678v()     // Catch:{ all -> 0x0d54 }
            java.lang.String r4 = "Checking account type status for ad personalization signals"
            r3.mo48769a(r4)     // Catch:{ all -> 0x0d54 }
            s59 r3 = r2.f33321b     // Catch:{ all -> 0x0d54 }
            qq8 r3 = r3.f33718a     // Catch:{ all -> 0x0d54 }
            m51548Q(r3)     // Catch:{ all -> 0x0d54 }
            java.lang.String r4 = r5.mo46145D()     // Catch:{ all -> 0x0d54 }
            boolean r3 = r3.mo47253n(r4)     // Catch:{ all -> 0x0d54 }
            if (r3 == 0) goto L_0x07f7
            s59 r3 = r2.f33321b     // Catch:{ all -> 0x0d54 }
            m78 r3 = r3.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r3)     // Catch:{ all -> 0x0d54 }
            java.lang.String r4 = r5.mo46145D()     // Catch:{ all -> 0x0d54 }
            cs8 r3 = r3.mo45673c0(r4)     // Catch:{ all -> 0x0d54 }
            if (r3 == 0) goto L_0x07f7
            boolean r3 = r3.mo41656G()     // Catch:{ all -> 0x0d54 }
            if (r3 == 0) goto L_0x07f7
            kr8 r3 = r2.f34342a     // Catch:{ all -> 0x0d54 }
            g88 r3 = r3.mo45255S()     // Catch:{ all -> 0x0d54 }
            boolean r3 = r3.mo42854p()     // Catch:{ all -> 0x0d54 }
            if (r3 == 0) goto L_0x07f7
            kr8 r3 = r2.f34342a     // Catch:{ all -> 0x0d54 }
            bn8 r3 = r3.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r3 = r3.mo29677u()     // Catch:{ all -> 0x0d54 }
            java.lang.String r4 = "Turning off ad personalization due to account type"
            r3.mo48769a(r4)     // Catch:{ all -> 0x0d54 }
            gt8 r3 = p000.it8.m45961H()     // Catch:{ all -> 0x0d54 }
            r4 = r23
            r3.mo42977x(r4)     // Catch:{ all -> 0x0d54 }
            kr8 r2 = r2.f34342a     // Catch:{ all -> 0x0d54 }
            g88 r2 = r2.mo45255S()     // Catch:{ all -> 0x0d54 }
            long r7 = r2.mo42852n()     // Catch:{ all -> 0x0d54 }
            r3.mo42976w(r7)     // Catch:{ all -> 0x0d54 }
            r7 = 1
            r3.mo42972B(r7)     // Catch:{ all -> 0x0d54 }
            s49 r2 = r3.mo48885o()     // Catch:{ all -> 0x0d54 }
            it8 r2 = (p000.it8) r2     // Catch:{ all -> 0x0d54 }
            r3 = 0
        L_0x07d9:
            int r7 = r5.mo46144C0()     // Catch:{ all -> 0x0d54 }
            if (r3 >= r7) goto L_0x07f4
            it8 r7 = r5.mo46148F0(r3)     // Catch:{ all -> 0x0d54 }
            java.lang.String r7 = r7.mo43931z()     // Catch:{ all -> 0x0d54 }
            boolean r7 = r4.equals(r7)     // Catch:{ all -> 0x0d54 }
            if (r7 == 0) goto L_0x07f1
            r5.mo46150G0(r3, r2)     // Catch:{ all -> 0x0d54 }
            goto L_0x07f7
        L_0x07f1:
            int r3 = r3 + 1
            goto L_0x07d9
        L_0x07f4:
            r5.mo46152H0(r2)     // Catch:{ all -> 0x0d54 }
        L_0x07f7:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.mo46164N0(r2)     // Catch:{ all -> 0x0d54 }
            r2 = -9223372036854775808
            r5.mo46168P0(r2)     // Catch:{ all -> 0x0d54 }
            r2 = 0
        L_0x0805:
            int r3 = r5.mo46198t0()     // Catch:{ all -> 0x0d54 }
            if (r2 >= r3) goto L_0x0838
            wq8 r3 = r5.mo46199u0(r2)     // Catch:{ all -> 0x0d54 }
            long r7 = r3.mo49249D()     // Catch:{ all -> 0x0d54 }
            long r9 = r5.mo46162M0()     // Catch:{ all -> 0x0d54 }
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0822
            long r7 = r3.mo49249D()     // Catch:{ all -> 0x0d54 }
            r5.mo46164N0(r7)     // Catch:{ all -> 0x0d54 }
        L_0x0822:
            long r7 = r3.mo49249D()     // Catch:{ all -> 0x0d54 }
            long r9 = r5.mo46166O0()     // Catch:{ all -> 0x0d54 }
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0835
            long r3 = r3.mo49249D()     // Catch:{ all -> 0x0d54 }
            r5.mo46168P0(r3)     // Catch:{ all -> 0x0d54 }
        L_0x0835:
            int r2 = r2 + 1
            goto L_0x0805
        L_0x0838:
            r5.mo46183e0()     // Catch:{ all -> 0x0d54 }
            r5.mo46179Z()     // Catch:{ all -> 0x0d54 }
            kk9 r7 = r1.f33723f     // Catch:{ all -> 0x0d54 }
            m51548Q(r7)     // Catch:{ all -> 0x0d54 }
            java.lang.String r8 = r5.mo46145D()     // Catch:{ all -> 0x0d54 }
            java.util.List r9 = r5.mo46197s0()     // Catch:{ all -> 0x0d54 }
            java.util.List r10 = r5.mo46142B0()     // Catch:{ all -> 0x0d54 }
            long r2 = r5.mo46162M0()     // Catch:{ all -> 0x0d54 }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d54 }
            long r2 = r5.mo46166O0()     // Catch:{ all -> 0x0d54 }
            java.lang.Long r12 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d54 }
            java.util.List r2 = r7.mo44820j(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0d54 }
            r5.mo46178Y(r2)     // Catch:{ all -> 0x0d54 }
            n68 r2 = r45.mo47648S()     // Catch:{ all -> 0x0d54 }
            or8 r3 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r3 = r3.mo46511x()     // Catch:{ all -> 0x0d54 }
            boolean r2 = r2.mo45982G(r3)     // Catch:{ all -> 0x0d54 }
            if (r2 == 0) goto L_0x0bae
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0d54 }
            r2.<init>()     // Catch:{ all -> 0x0d54 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0d54 }
            r3.<init>()     // Catch:{ all -> 0x0d54 }
            g69 r4 = r45.mo47659c0()     // Catch:{ all -> 0x0d54 }
            java.security.SecureRandom r4 = r4.mo42813i0()     // Catch:{ all -> 0x0d54 }
            r7 = 0
        L_0x0889:
            int r8 = r5.mo46198t0()     // Catch:{ all -> 0x0d54 }
            if (r7 >= r8) goto L_0x0b75
            wq8 r8 = r5.mo46199u0(r7)     // Catch:{ all -> 0x0d54 }
            w39 r8 = r8.mo47634s()     // Catch:{ all -> 0x0d54 }
            uq8 r8 = (p000.uq8) r8     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = r8.mo48492H()     // Catch:{ all -> 0x0d54 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0d54 }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0929
            w59 r9 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r9)     // Catch:{ all -> 0x0d54 }
            s49 r9 = r8.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r9 = (p000.wq8) r9     // Catch:{ all -> 0x0d54 }
            java.lang.String r11 = "_en"
            java.lang.Object r9 = p000.w59.m53719k(r9, r11)     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0d54 }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x0d54 }
            m88 r11 = (p000.m88) r11     // Catch:{ all -> 0x0d54 }
            if (r11 != 0) goto L_0x08dc
            m78 r11 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r11)     // Catch:{ all -> 0x0d54 }
            or8 r12 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r12 = r12.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.Object r13 = p000.cu4.m43221k(r9)     // Catch:{ all -> 0x0d54 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0d54 }
            m88 r11 = r11.mo45661Q(r12, r13)     // Catch:{ all -> 0x0d54 }
            if (r11 == 0) goto L_0x08dc
            r2.put(r9, r11)     // Catch:{ all -> 0x0d54 }
        L_0x08dc:
            if (r11 == 0) goto L_0x091d
            java.lang.Long r9 = r11.f31546i     // Catch:{ all -> 0x0d54 }
            if (r9 != 0) goto L_0x091d
            java.lang.Long r9 = r11.f31547j     // Catch:{ all -> 0x0d54 }
            if (r9 == 0) goto L_0x08fa
            long r12 = r9.longValue()     // Catch:{ all -> 0x0d54 }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x08fa
            w59 r9 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r9)     // Catch:{ all -> 0x0d54 }
            java.lang.Long r9 = r11.f31547j     // Catch:{ all -> 0x0d54 }
            p000.w59.m53716N(r8, r10, r9)     // Catch:{ all -> 0x0d54 }
        L_0x08fa:
            java.lang.Boolean r9 = r11.f31548k     // Catch:{ all -> 0x0d54 }
            if (r9 == 0) goto L_0x0914
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0d54 }
            if (r9 == 0) goto L_0x0914
            w59 r9 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r9)     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = "_efs"
            r10 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d54 }
            p000.w59.m53716N(r8, r9, r12)     // Catch:{ all -> 0x0d54 }
        L_0x0914:
            s49 r9 = r8.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r9 = (p000.wq8) r9     // Catch:{ all -> 0x0d54 }
            r3.add(r9)     // Catch:{ all -> 0x0d54 }
        L_0x091d:
            r5.mo46200v0(r7, r8)     // Catch:{ all -> 0x0d54 }
        L_0x0920:
            r16 = r4
            r4 = r5
            r20 = r6
            r5 = 1
            goto L_0x0b6c
        L_0x0929:
            qq8 r9 = r1.f33718a     // Catch:{ all -> 0x0d54 }
            m51548Q(r9)     // Catch:{ all -> 0x0d54 }
            or8 r11 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r11 = r11.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.String r12 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r12 = r9.mo42530c(r11, r12)     // Catch:{ all -> 0x0d54 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0d54 }
            if (r13 != 0) goto L_0x095a
            long r11 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x0945 }
            goto L_0x095c
        L_0x0945:
            r0 = move-exception
            r12 = r0
            kr8 r9 = r9.f34342a     // Catch:{ all -> 0x0d54 }
            bn8 r9 = r9.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r9 = r9.mo29673o()     // Catch:{ all -> 0x0d54 }
            java.lang.String r13 = "Unable to parse timezone offset. appId"
            java.lang.Object r11 = p000.bn8.m32664w(r11)     // Catch:{ all -> 0x0d54 }
            r9.mo48771c(r13, r11, r12)     // Catch:{ all -> 0x0d54 }
        L_0x095a:
            r11 = 0
        L_0x095c:
            g69 r9 = r45.mo47659c0()     // Catch:{ all -> 0x0d54 }
            long r13 = r8.mo48495K()     // Catch:{ all -> 0x0d54 }
            long r13 = r9.mo42799P(r13, r11)     // Catch:{ all -> 0x0d54 }
            s49 r9 = r8.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r9 = (p000.wq8) r9     // Catch:{ all -> 0x0d54 }
            r17 = r11
            r15 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0d54 }
            java.lang.String r12 = "_dbg"
            boolean r15 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0d54 }
            if (r15 != 0) goto L_0x09b2
            java.util.List r9 = r9.mo49255x()     // Catch:{ all -> 0x0d54 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0d54 }
        L_0x0986:
            boolean r15 = r9.hasNext()     // Catch:{ all -> 0x0d54 }
            if (r15 == 0) goto L_0x09b2
            java.lang.Object r15 = r9.next()     // Catch:{ all -> 0x0d54 }
            er8 r15 = (p000.er8) r15     // Catch:{ all -> 0x0d54 }
            r16 = r9
            java.lang.String r9 = r15.mo42393y()     // Catch:{ all -> 0x0d54 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0d54 }
            if (r9 == 0) goto L_0x09af
            long r15 = r15.mo42384D()     // Catch:{ all -> 0x0d54 }
            java.lang.Long r9 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0d54 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0d54 }
            if (r9 != 0) goto L_0x09ad
            goto L_0x09b2
        L_0x09ad:
            r9 = 1
            goto L_0x09c5
        L_0x09af:
            r9 = r16
            goto L_0x0986
        L_0x09b2:
            qq8 r9 = r1.f33718a     // Catch:{ all -> 0x0d54 }
            m51548Q(r9)     // Catch:{ all -> 0x0d54 }
            or8 r11 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r11 = r11.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.String r12 = r8.mo48492H()     // Catch:{ all -> 0x0d54 }
            int r9 = r9.mo47258u(r11, r12)     // Catch:{ all -> 0x0d54 }
        L_0x09c5:
            if (r9 > 0) goto L_0x09ea
            bn8 r10 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r10 = r10.mo29673o()     // Catch:{ all -> 0x0d54 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r8.mo48492H()     // Catch:{ all -> 0x0d54 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0d54 }
            r10.mo48771c(r11, r12, r9)     // Catch:{ all -> 0x0d54 }
            s49 r9 = r8.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r9 = (p000.wq8) r9     // Catch:{ all -> 0x0d54 }
            r3.add(r9)     // Catch:{ all -> 0x0d54 }
            r5.mo46200v0(r7, r8)     // Catch:{ all -> 0x0d54 }
            goto L_0x0920
        L_0x09ea:
            java.lang.String r11 = r8.mo48492H()     // Catch:{ all -> 0x0d54 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0d54 }
            m88 r11 = (p000.m88) r11     // Catch:{ all -> 0x0d54 }
            if (r11 != 0) goto L_0x0a4a
            m78 r11 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r11)     // Catch:{ all -> 0x0d54 }
            or8 r12 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r12 = r12.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.String r15 = r8.mo48492H()     // Catch:{ all -> 0x0d54 }
            m88 r11 = r11.mo45661Q(r12, r15)     // Catch:{ all -> 0x0d54 }
            if (r11 != 0) goto L_0x0a4a
            bn8 r11 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r11 = r11.mo29673o()     // Catch:{ all -> 0x0d54 }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            or8 r15 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r15 = r15.mo46511x()     // Catch:{ all -> 0x0d54 }
            r20 = r13
            java.lang.String r13 = r8.mo48492H()     // Catch:{ all -> 0x0d54 }
            r11.mo48771c(r12, r15, r13)     // Catch:{ all -> 0x0d54 }
            m88 r11 = new m88     // Catch:{ all -> 0x0d54 }
            or8 r12 = r6.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r29 = r12.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.String r30 = r8.mo48492H()     // Catch:{ all -> 0x0d54 }
            r31 = 1
            r33 = 1
            r35 = 1
            long r37 = r8.mo48495K()     // Catch:{ all -> 0x0d54 }
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r28 = r11
            r28.<init>(r29, r30, r31, r33, r35, r37, r39, r41, r42, r43, r44)     // Catch:{ all -> 0x0d54 }
            goto L_0x0a4c
        L_0x0a4a:
            r20 = r13
        L_0x0a4c:
            w59 r12 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r12)     // Catch:{ all -> 0x0d54 }
            s49 r12 = r8.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r12 = (p000.wq8) r12     // Catch:{ all -> 0x0d54 }
            java.lang.String r13 = "_eid"
            java.lang.Object r12 = p000.w59.m53719k(r12, r13)     // Catch:{ all -> 0x0d54 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0d54 }
            if (r12 == 0) goto L_0x0a63
            r13 = 1
            goto L_0x0a64
        L_0x0a63:
            r13 = 0
        L_0x0a64:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0d54 }
            r14 = 1
            if (r9 != r14) goto L_0x0a97
            s49 r9 = r8.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r9 = (p000.wq8) r9     // Catch:{ all -> 0x0d54 }
            r3.add(r9)     // Catch:{ all -> 0x0d54 }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x0d54 }
            if (r9 == 0) goto L_0x0a92
            java.lang.Long r9 = r11.f31546i     // Catch:{ all -> 0x0d54 }
            if (r9 != 0) goto L_0x0a86
            java.lang.Long r9 = r11.f31547j     // Catch:{ all -> 0x0d54 }
            if (r9 != 0) goto L_0x0a86
            java.lang.Boolean r9 = r11.f31548k     // Catch:{ all -> 0x0d54 }
            if (r9 == 0) goto L_0x0a92
        L_0x0a86:
            r9 = 0
            m88 r10 = r11.mo45702c(r9, r9, r9)     // Catch:{ all -> 0x0d54 }
            java.lang.String r9 = r8.mo48492H()     // Catch:{ all -> 0x0d54 }
            r2.put(r9, r10)     // Catch:{ all -> 0x0d54 }
        L_0x0a92:
            r5.mo46200v0(r7, r8)     // Catch:{ all -> 0x0d54 }
            goto L_0x0920
        L_0x0a97:
            int r14 = r4.nextInt(r9)     // Catch:{ all -> 0x0d54 }
            if (r14 != 0) goto L_0x0ad8
            w59 r12 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r12)     // Catch:{ all -> 0x0d54 }
            long r14 = (long) r9     // Catch:{ all -> 0x0d54 }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d54 }
            p000.w59.m53716N(r8, r10, r9)     // Catch:{ all -> 0x0d54 }
            s49 r10 = r8.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r10 = (p000.wq8) r10     // Catch:{ all -> 0x0d54 }
            r3.add(r10)     // Catch:{ all -> 0x0d54 }
            boolean r10 = r13.booleanValue()     // Catch:{ all -> 0x0d54 }
            if (r10 == 0) goto L_0x0abe
            r10 = 0
            m88 r11 = r11.mo45702c(r10, r9, r10)     // Catch:{ all -> 0x0d54 }
        L_0x0abe:
            java.lang.String r9 = r8.mo48492H()     // Catch:{ all -> 0x0d54 }
            long r12 = r8.mo48495K()     // Catch:{ all -> 0x0d54 }
            r14 = r20
            m88 r10 = r11.mo45701b(r12, r14)     // Catch:{ all -> 0x0d54 }
            r2.put(r9, r10)     // Catch:{ all -> 0x0d54 }
            r16 = r4
            r4 = r5
            r20 = r6
            r5 = 1
            goto L_0x0b69
        L_0x0ad8:
            r16 = r4
            r14 = r20
            java.lang.Long r4 = r11.f31545h     // Catch:{ all -> 0x0d54 }
            if (r4 == 0) goto L_0x0aed
            long r17 = r4.longValue()     // Catch:{ all -> 0x0d54 }
            r33 = r5
            r20 = r6
            r23 = r11
            r21 = r12
            goto L_0x0b03
        L_0x0aed:
            g69 r4 = r45.mo47659c0()     // Catch:{ all -> 0x0d54 }
            r33 = r5
            r20 = r6
            long r5 = r8.mo48497M()     // Catch:{ all -> 0x0d54 }
            r23 = r11
            r21 = r12
            r11 = r17
            long r17 = r4.mo42799P(r5, r11)     // Catch:{ all -> 0x0d54 }
        L_0x0b03:
            int r4 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0b4f
            w59 r4 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r4)     // Catch:{ all -> 0x0d54 }
            java.lang.String r4 = "_efs"
            r5 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d54 }
            p000.w59.m53716N(r8, r4, r11)     // Catch:{ all -> 0x0d54 }
            w59 r4 = r1.f33724g     // Catch:{ all -> 0x0d54 }
            m51548Q(r4)     // Catch:{ all -> 0x0d54 }
            long r11 = (long) r9     // Catch:{ all -> 0x0d54 }
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d54 }
            p000.w59.m53716N(r8, r10, r4)     // Catch:{ all -> 0x0d54 }
            s49 r9 = r8.mo48885o()     // Catch:{ all -> 0x0d54 }
            wq8 r9 = (p000.wq8) r9     // Catch:{ all -> 0x0d54 }
            r3.add(r9)     // Catch:{ all -> 0x0d54 }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x0d54 }
            if (r9 == 0) goto L_0x0b3d
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d54 }
            r11 = r23
            r10 = 0
            m88 r11 = r11.mo45702c(r10, r4, r9)     // Catch:{ all -> 0x0d54 }
            goto L_0x0b3f
        L_0x0b3d:
            r11 = r23
        L_0x0b3f:
            java.lang.String r4 = r8.mo48492H()     // Catch:{ all -> 0x0d54 }
            long r9 = r8.mo48495K()     // Catch:{ all -> 0x0d54 }
            m88 r9 = r11.mo45701b(r9, r14)     // Catch:{ all -> 0x0d54 }
            r2.put(r4, r9)     // Catch:{ all -> 0x0d54 }
            goto L_0x0b67
        L_0x0b4f:
            r11 = r23
            r5 = 1
            boolean r4 = r13.booleanValue()     // Catch:{ all -> 0x0d54 }
            if (r4 == 0) goto L_0x0b67
            java.lang.String r4 = r8.mo48492H()     // Catch:{ all -> 0x0d54 }
            r12 = r21
            r9 = 0
            m88 r10 = r11.mo45702c(r12, r9, r9)     // Catch:{ all -> 0x0d54 }
            r2.put(r4, r10)     // Catch:{ all -> 0x0d54 }
        L_0x0b67:
            r4 = r33
        L_0x0b69:
            r4.mo46200v0(r7, r8)     // Catch:{ all -> 0x0d54 }
        L_0x0b6c:
            int r7 = r7 + 1
            r5 = r4
            r4 = r16
            r6 = r20
            goto L_0x0889
        L_0x0b75:
            r4 = r5
            r20 = r6
            int r5 = r3.size()     // Catch:{ all -> 0x0d54 }
            int r6 = r4.mo46198t0()     // Catch:{ all -> 0x0d54 }
            if (r5 >= r6) goto L_0x0b88
            r4.mo46207z0()     // Catch:{ all -> 0x0d54 }
            r4.mo46204x0(r3)     // Catch:{ all -> 0x0d54 }
        L_0x0b88:
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0d54 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0d54 }
        L_0x0b90:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0d54 }
            if (r3 == 0) goto L_0x0bab
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0d54 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0d54 }
            m78 r5 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r5)     // Catch:{ all -> 0x0d54 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0d54 }
            m88 r3 = (p000.m88) r3     // Catch:{ all -> 0x0d54 }
            r5.mo45662R(r3)     // Catch:{ all -> 0x0d54 }
            goto L_0x0b90
        L_0x0bab:
            r2 = r20
            goto L_0x0bb0
        L_0x0bae:
            r4 = r5
            r2 = r6
        L_0x0bb0:
            or8 r3 = r2.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r3 = r3.mo46511x()     // Catch:{ all -> 0x0d54 }
            m78 r5 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r5)     // Catch:{ all -> 0x0d54 }
            cs8 r5 = r5.mo45673c0(r3)     // Catch:{ all -> 0x0d54 }
            if (r5 != 0) goto L_0x0bd9
            bn8 r5 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r5 = r5.mo29670l()     // Catch:{ all -> 0x0d54 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            or8 r7 = r2.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r7 = r7.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.Object r7 = p000.bn8.m32664w(r7)     // Catch:{ all -> 0x0d54 }
            r5.mo48770b(r6, r7)     // Catch:{ all -> 0x0d54 }
            goto L_0x0c35
        L_0x0bd9:
            int r6 = r4.mo46198t0()     // Catch:{ all -> 0x0d54 }
            if (r6 <= 0) goto L_0x0c35
            long r6 = r5.mo41681c0()     // Catch:{ all -> 0x0d54 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0bed
            r4.mo46173S0(r6)     // Catch:{ all -> 0x0d54 }
            goto L_0x0bf0
        L_0x0bed:
            r4.mo46175T0()     // Catch:{ all -> 0x0d54 }
        L_0x0bf0:
            long r8 = r5.mo41677a0()     // Catch:{ all -> 0x0d54 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0bfb
            goto L_0x0bfc
        L_0x0bfb:
            r6 = r8
        L_0x0bfc:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0c04
            r4.mo46169Q0(r6)     // Catch:{ all -> 0x0d54 }
            goto L_0x0c07
        L_0x0c04:
            r4.mo46171R0()     // Catch:{ all -> 0x0d54 }
        L_0x0c07:
            r5.mo41700n()     // Catch:{ all -> 0x0d54 }
            long r6 = r5.mo41692i()     // Catch:{ all -> 0x0d54 }
            int r6 = (int) r6     // Catch:{ all -> 0x0d54 }
            r4.mo46167P(r6)     // Catch:{ all -> 0x0d54 }
            long r6 = r4.mo46162M0()     // Catch:{ all -> 0x0d54 }
            r5.mo41679b0(r6)     // Catch:{ all -> 0x0d54 }
            long r6 = r4.mo46166O0()     // Catch:{ all -> 0x0d54 }
            r5.mo41683d0(r6)     // Catch:{ all -> 0x0d54 }
            java.lang.String r6 = r5.mo41652C()     // Catch:{ all -> 0x0d54 }
            if (r6 == 0) goto L_0x0c2a
            r4.mo46170R(r6)     // Catch:{ all -> 0x0d54 }
            goto L_0x0c2d
        L_0x0c2a:
            r4.mo46172S()     // Catch:{ all -> 0x0d54 }
        L_0x0c2d:
            m78 r6 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r6)     // Catch:{ all -> 0x0d54 }
            r6.mo45674d0(r5)     // Catch:{ all -> 0x0d54 }
        L_0x0c35:
            int r5 = r4.mo46198t0()     // Catch:{ all -> 0x0d54 }
            if (r5 <= 0) goto L_0x0c99
            kr8 r5 = r1.f33728k     // Catch:{ all -> 0x0d54 }
            r5.mo45257b()     // Catch:{ all -> 0x0d54 }
            qq8 r5 = r1.f33718a     // Catch:{ all -> 0x0d54 }
            m51548Q(r5)     // Catch:{ all -> 0x0d54 }
            or8 r6 = r2.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r6 = r6.mo46511x()     // Catch:{ all -> 0x0d54 }
            np8 r5 = r5.mo47249j(r6)     // Catch:{ all -> 0x0d54 }
            if (r5 == 0) goto L_0x0c60
            boolean r6 = r5.mo46130x()     // Catch:{ all -> 0x0d54 }
            if (r6 != 0) goto L_0x0c58
            goto L_0x0c60
        L_0x0c58:
            long r5 = r5.mo46131y()     // Catch:{ all -> 0x0d54 }
            r4.mo46184f0(r5)     // Catch:{ all -> 0x0d54 }
            goto L_0x0c89
        L_0x0c60:
            or8 r5 = r2.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r5 = r5.mo46489N()     // Catch:{ all -> 0x0d54 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0d54 }
            if (r5 == 0) goto L_0x0c72
            r5 = -1
            r4.mo46184f0(r5)     // Catch:{ all -> 0x0d54 }
            goto L_0x0c89
        L_0x0c72:
            bn8 r5 = r45.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r5 = r5.mo29673o()     // Catch:{ all -> 0x0d54 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            or8 r7 = r2.f32943a     // Catch:{ all -> 0x0d54 }
            java.lang.String r7 = r7.mo46511x()     // Catch:{ all -> 0x0d54 }
            java.lang.Object r7 = p000.bn8.m32664w(r7)     // Catch:{ all -> 0x0d54 }
            r5.mo48770b(r6, r7)     // Catch:{ all -> 0x0d54 }
        L_0x0c89:
            m78 r5 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r5)     // Catch:{ all -> 0x0d54 }
            s49 r4 = r4.mo48885o()     // Catch:{ all -> 0x0d54 }
            or8 r4 = (p000.or8) r4     // Catch:{ all -> 0x0d54 }
            r8 = r19
            r5.mo45678h0(r4, r8)     // Catch:{ all -> 0x0d54 }
        L_0x0c99:
            m78 r4 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r4)     // Catch:{ all -> 0x0d54 }
            java.util.List<java.lang.Long> r2 = r2.f32944b     // Catch:{ all -> 0x0d54 }
            p000.cu4.m43221k(r2)     // Catch:{ all -> 0x0d54 }
            r4.mo29006e()     // Catch:{ all -> 0x0d54 }
            r4.mo47982g()     // Catch:{ all -> 0x0d54 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d54 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0d54 }
            r6 = 0
        L_0x0cb1:
            int r7 = r2.size()     // Catch:{ all -> 0x0d54 }
            if (r6 >= r7) goto L_0x0cce
            if (r6 == 0) goto L_0x0cbe
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0d54 }
        L_0x0cbe:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0d54 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d54 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d54 }
            r5.append(r7)     // Catch:{ all -> 0x0d54 }
            int r6 = r6 + 1
            goto L_0x0cb1
        L_0x0cce:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0d54 }
            android.database.sqlite.SQLiteDatabase r6 = r4.mo45660P()     // Catch:{ all -> 0x0d54 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0d54 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0d54 }
            int r6 = r2.size()     // Catch:{ all -> 0x0d54 }
            if (r5 == r6) goto L_0x0d03
            kr8 r4 = r4.f34342a     // Catch:{ all -> 0x0d54 }
            bn8 r4 = r4.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r4 = r4.mo29670l()     // Catch:{ all -> 0x0d54 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d54 }
            int r2 = r2.size()     // Catch:{ all -> 0x0d54 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d54 }
            r4.mo48771c(r6, r5, r2)     // Catch:{ all -> 0x0d54 }
        L_0x0d03:
            m78 r2 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r2)     // Catch:{ all -> 0x0d54 }
            android.database.sqlite.SQLiteDatabase r4 = r2.mo45660P()     // Catch:{ all -> 0x0d54 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0d1b }
            r6 = 0
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0d1b }
            r6 = 1
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0d1b }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r4.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0d1b }
            goto L_0x0d30
        L_0x0d1b:
            r0 = move-exception
            r4 = r0
            kr8 r2 = r2.f34342a     // Catch:{ all -> 0x0d54 }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x0d54 }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x0d54 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = p000.bn8.m32664w(r3)     // Catch:{ all -> 0x0d54 }
            r2.mo48771c(r5, r3, r4)     // Catch:{ all -> 0x0d54 }
        L_0x0d30:
            m78 r2 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r2)     // Catch:{ all -> 0x0d54 }
            r2.mo45658N()     // Catch:{ all -> 0x0d54 }
            m78 r2 = r1.f33720c
            m51548Q(r2)
            r2.mo45659O()
            r2 = 1
            return r2
        L_0x0d42:
            m78 r2 = r1.f33720c     // Catch:{ all -> 0x0d54 }
            m51548Q(r2)     // Catch:{ all -> 0x0d54 }
            r2.mo45658N()     // Catch:{ all -> 0x0d54 }
            m78 r2 = r1.f33720c
            m51548Q(r2)
            r2.mo45659O()
            r2 = 0
            return r2
        L_0x0d54:
            r0 = move-exception
            r2 = r0
            m78 r3 = r1.f33720c
            m51548Q(r3)
            r3.mo45659O()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s59.mo47637G(java.lang.String, long):boolean");
    }

    /* renamed from: H */
    public final void mo47638H(nr8 nr8, long j, boolean z) {
        String str;
        a69 a69;
        String str2;
        if (true != z) {
            str = "_lte";
        } else {
            str = "_se";
        }
        m78 m78 = this.f33720c;
        m51548Q(m78);
        a69 U = m78.mo45665U(nr8.mo46145D(), str);
        if (U == null || U.f20825e == null) {
            a69 = new a69(nr8.mo46145D(), "auto", str, mo45256a().mo29580a(), Long.valueOf(j));
        } else {
            a69 = new a69(nr8.mo46145D(), "auto", str, mo45256a().mo29580a(), Long.valueOf(((Long) U.f20825e).longValue() + j));
        }
        gt8 H = it8.m45961H();
        H.mo42977x(str);
        H.mo42976w(mo45256a().mo29580a());
        H.mo42972B(((Long) a69.f20825e).longValue());
        it8 it8 = (it8) H.mo48885o();
        int K = w59.m53713K(nr8, str);
        if (K >= 0) {
            nr8.mo46150G0(K, it8);
        } else {
            nr8.mo46152H0(it8);
        }
        if (j > 0) {
            m78 m782 = this.f33720c;
            m51548Q(m782);
            m782.mo45664T(a69);
            if (true != z) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            mo45237A().mo29678v().mo48771c("Updated engagement user property. scope, value", str2, a69.f20825e);
        }
    }

    /* renamed from: I */
    public final boolean mo47639I(uq8 uq8, uq8 uq82) {
        String str;
        cu4.m43211a("_e".equals(uq8.mo48492H()));
        m51548Q(this.f33724g);
        er8 j = w59.m53718j((wq8) uq8.mo48885o(), "_sc");
        String str2 = null;
        if (j == null) {
            str = null;
        } else {
            str = j.mo42382B();
        }
        m51548Q(this.f33724g);
        er8 j2 = w59.m53718j((wq8) uq82.mo48885o(), "_pc");
        if (j2 != null) {
            str2 = j2.mo42382B();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        mo47640J(uq8, uq82);
        return true;
    }

    /* renamed from: J */
    public final void mo47640J(uq8 uq8, uq8 uq82) {
        cu4.m43211a("_e".equals(uq8.mo48492H()));
        m51548Q(this.f33724g);
        er8 j = w59.m53718j((wq8) uq8.mo48885o(), "_et");
        if (j != null && j.mo42383C() && j.mo42384D() > 0) {
            long D = j.mo42384D();
            m51548Q(this.f33724g);
            er8 j2 = w59.m53718j((wq8) uq82.mo48885o(), "_et");
            if (j2 != null && j2.mo42384D() > 0) {
                D += j2.mo42384D();
            }
            m51548Q(this.f33724g);
            w59.m53716N(uq82, "_et", Long.valueOf(D));
            m51548Q(this.f33724g);
            w59.m53716N(uq8, "_fr", 1L);
        }
    }

    /* renamed from: K */
    public final boolean mo47641K() {
        mo45272s().mo29006e();
        mo47661d0();
        m78 m78 = this.f33720c;
        m51548Q(m78);
        if (m78.mo45687p()) {
            return true;
        }
        m78 m782 = this.f33720c;
        m51548Q(m782);
        if (!TextUtils.isEmpty(m782.mo45679i0())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0237  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47642L() {
        /*
            r20 = this;
            r0 = r20
            cr8 r1 = r20.mo45272s()
            r1.mo29006e()
            r20.mo47661d0()
            long r1 = r0.f33731n
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004e
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            bh0 r5 = r20.mo45256a()
            long r5 = r5.mo29581b()
            long r7 = r0.f33731n
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            bn8 r3 = r20.mo45237A()
            vm8 r3 = r3.mo29678v()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.mo48770b(r2, r1)
            yn8 r1 = r20.mo47652W()
            r1.mo49721b()
            o49 r1 = r0.f33722e
            m51548Q(r1)
            r1.mo46309k()
            return
        L_0x004c:
            r0.f33731n = r3
        L_0x004e:
            kr8 r1 = r0.f33728k
            boolean r1 = r1.mo45268n()
            if (r1 == 0) goto L_0x0254
            boolean r1 = r20.mo47641K()
            if (r1 != 0) goto L_0x005e
            goto L_0x0254
        L_0x005e:
            bh0 r1 = r20.mo45256a()
            long r1 = r1.mo29580a()
            r20.mo47648S()
            uk8<java.lang.Long> r5 = p000.rl8.f33452B
            r6 = 0
            java.lang.Object r5 = r5.mo48412b(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            m78 r5 = r0.f33720c
            m51548Q(r5)
            boolean r5 = r5.mo45688r()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            m78 r5 = r0.f33720c
            m51548Q(r5)
            boolean r5 = r5.mo45681j0()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00d3
            n68 r5 = r20.mo47648S()
            java.lang.String r5 = r5.mo45979D()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00bf
            r20.mo47648S()
            uk8<java.lang.Long> r5 = p000.rl8.f33528w
            java.lang.Object r5 = r5.mo48412b(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00bf:
            r20.mo47648S()
            uk8<java.lang.Long> r5 = p000.rl8.f33526v
            java.lang.Object r5 = r5.mo48412b(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00d3:
            r20.mo47648S()
            uk8<java.lang.Long> r5 = p000.rl8.f33524u
            java.lang.Object r5 = r5.mo48412b(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        L_0x00e6:
            i29 r5 = r0.f33726i
            io8 r5 = r5.f29794i
            long r13 = r5.mo43882a()
            i29 r5 = r0.f33726i
            io8 r5 = r5.f29795j
            long r15 = r5.mo43882a()
            m78 r5 = r0.f33720c
            m51548Q(r5)
            r17 = r10
            long r9 = r5.mo45684m()
            m78 r5 = r0.f33720c
            m51548Q(r5)
            r18 = r7
            long r6 = r5.mo45686o()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
        L_0x0114:
            r7 = r3
            goto L_0x018e
        L_0x0117:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r9 = r1 - r9
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r1, r9)
            long r7 = r5 + r18
            if (r17 == 0) goto L_0x013c
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x013c
            long r7 = java.lang.Math.min(r5, r1)
            long r7 = r7 + r11
        L_0x013c:
            w59 r13 = r0.f33724g
            m51548Q(r13)
            boolean r13 = r13.mo48899G(r1, r11)
            if (r13 != 0) goto L_0x0149
            long r7 = r1 + r11
        L_0x0149:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018e
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x018e
            r1 = 0
        L_0x0152:
            r20.mo47648S()
            r2 = 20
            uk8<java.lang.Integer> r5 = p000.rl8.f33456D
            r6 = 0
            java.lang.Object r5 = r5.mo48412b(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11 = 0
            int r5 = java.lang.Math.max(r11, r5)
            int r2 = java.lang.Math.min(r2, r5)
            if (r1 >= r2) goto L_0x0114
            r20.mo47648S()
            uk8<java.lang.Long> r2 = p000.rl8.f33454C
            java.lang.Object r2 = r2.mo48412b(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            r12 = 1
            long r12 = r12 << r1
            long r5 = r5 * r12
            long r7 = r7 + r5
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x018e
            int r1 = r1 + 1
            goto L_0x0152
        L_0x018e:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0237
            sn8 r1 = r0.f33719b
            m51548Q(r1)
            boolean r1 = r1.mo47844j()
            if (r1 == 0) goto L_0x021a
            i29 r1 = r0.f33726i
            io8 r1 = r1.f29793h
            long r1 = r1.mo43882a()
            r20.mo47648S()
            uk8<java.lang.Long> r5 = p000.rl8.f33520s
            r6 = 0
            java.lang.Object r5 = r5.mo48412b(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            w59 r9 = r0.f33724g
            m51548Q(r9)
            boolean r9 = r9.mo48899G(r1, r5)
            if (r9 != 0) goto L_0x01c9
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x01c9:
            yn8 r1 = r20.mo47652W()
            r1.mo49721b()
            bh0 r1 = r20.mo45256a()
            long r1 = r1.mo29580a()
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0200
            r20.mo47648S()
            uk8<java.lang.Long> r1 = p000.rl8.f33530x
            r2 = 0
            java.lang.Object r1 = r1.mo48412b(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            i29 r1 = r0.f33726i
            io8 r1 = r1.f29794i
            bh0 r2 = r20.mo45256a()
            long r2 = r2.mo29580a()
            r1.mo43883b(r2)
        L_0x0200:
            bn8 r1 = r20.mo45237A()
            vm8 r1 = r1.mo29678v()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo48770b(r3, r2)
            o49 r1 = r0.f33722e
            m51548Q(r1)
            r1.mo46308j(r7)
            return
        L_0x021a:
            bn8 r1 = r20.mo45237A()
            vm8 r1 = r1.mo29678v()
            java.lang.String r2 = "No network"
            r1.mo48769a(r2)
            yn8 r1 = r20.mo47652W()
            r1.mo49720a()
            o49 r1 = r0.f33722e
            m51548Q(r1)
            r1.mo46309k()
            return
        L_0x0237:
            bn8 r1 = r20.mo45237A()
            vm8 r1 = r1.mo29678v()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo48769a(r2)
            yn8 r1 = r20.mo47652W()
            r1.mo49721b()
            o49 r1 = r0.f33722e
            m51548Q(r1)
            r1.mo46309k()
            return
        L_0x0254:
            bn8 r1 = r20.mo45237A()
            vm8 r1 = r1.mo29678v()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo48769a(r2)
            yn8 r1 = r20.mo47652W()
            r1.mo49721b()
            o49 r1 = r0.f33722e
            m51548Q(r1)
            r1.mo46309k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s59.mo47642L():void");
    }

    /* renamed from: M */
    public final void mo47643M() {
        mo45272s().mo29006e();
        if (this.f33735r || this.f33736s || this.f33737t) {
            mo45237A().mo29678v().mo48772d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f33735r), Boolean.valueOf(this.f33736s), Boolean.valueOf(this.f33737t));
            return;
        }
        mo45237A().mo29678v().mo48769a("Stopping uploading service(s)");
        List<Runnable> list = this.f33732o;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) cu4.m43221k(this.f33732o)).clear();
        }
    }

    /* renamed from: N */
    public final Boolean mo47644N(cs8 cs8) {
        try {
            if (cs8.mo41689g0() != -2147483648L) {
                if (cs8.mo41689g0() == ((long) tn7.m52384a(this.f33728k.mo45271q()).mo45811e(cs8.mo41663N(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = tn7.m52384a(this.f33728k.mo45271q()).mo45811e(cs8.mo41663N(), 0).versionName;
                String e0 = cs8.mo41685e0();
                if (e0 != null && e0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: O */
    public final zzp mo47645O(String str) {
        String str2;
        String str3 = str;
        m78 m78 = this.f33720c;
        m51548Q(m78);
        cs8 c0 = m78.mo45673c0(str3);
        if (c0 == null || TextUtils.isEmpty(c0.mo41685e0())) {
            mo45237A().mo29677u().mo48770b("No app data available; dropping", str3);
            return null;
        }
        Boolean N = mo47644N(c0);
        if (N == null || N.booleanValue()) {
            String Q = c0.mo41666Q();
            String e0 = c0.mo41685e0();
            long g0 = c0.mo41689g0();
            String i0 = c0.mo41693i0();
            long k0 = c0.mo41697k0();
            long b = c0.mo41678b();
            boolean f = c0.mo41686f();
            String Y = c0.mo41674Y();
            long E = c0.mo41654E();
            boolean G = c0.mo41656G();
            String S = c0.mo41668S();
            Boolean I = c0.mo41658I();
            long d = c0.mo41682d();
            List<String> K = c0.mo41660K();
            le9.m47797a();
            if (mo47648S().mo45997v(str3, rl8.f33501i0)) {
                str2 = c0.mo41670U();
            } else {
                str2 = null;
            }
            return new zzp(str, Q, e0, g0, i0, k0, b, (String) null, f, false, Y, E, 0, 0, G, false, S, I, d, K, str2, mo47665f0(str).mo48326d());
        }
        mo45237A().mo29670l().mo48770b("App version does not match; dropping. appId", bn8.m32664w(str));
        return null;
    }

    /* renamed from: P */
    public final boolean mo47646P(zzp zzp) {
        le9.m47797a();
        if (mo47648S().mo45997v(zzp.f23098a, rl8.f33501i0)) {
            if (!TextUtils.isEmpty(zzp.f23099d) || !TextUtils.isEmpty(zzp.f23096Y) || !TextUtils.isEmpty(zzp.f23092P)) {
                return true;
            }
            return false;
        } else if (!TextUtils.isEmpty(zzp.f23099d) || !TextUtils.isEmpty(zzp.f23092P)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: R */
    public final void mo47647R() {
        mo45272s().mo29006e();
        m78 m78 = this.f33720c;
        m51548Q(m78);
        m78.mo45680j();
        if (this.f33726i.f29794i.mo43882a() == 0) {
            this.f33726i.f29794i.mo43883b(mo45256a().mo29580a());
        }
        mo47642L();
    }

    /* renamed from: S */
    public final n68 mo47648S() {
        return ((kr8) cu4.m43221k(this.f33728k)).mo45274y();
    }

    /* renamed from: T */
    public final qq8 mo47649T() {
        qq8 qq8 = this.f33718a;
        m51548Q(qq8);
        return qq8;
    }

    /* renamed from: U */
    public final sn8 mo47650U() {
        sn8 sn8 = this.f33719b;
        m51548Q(sn8);
        return sn8;
    }

    /* renamed from: V */
    public final m78 mo47651V() {
        m78 m78 = this.f33720c;
        m51548Q(m78);
        return m78;
    }

    /* renamed from: W */
    public final yn8 mo47652W() {
        yn8 yn8 = this.f33721d;
        if (yn8 != null) {
            return yn8;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: X */
    public final kk9 mo47653X() {
        kk9 kk9 = this.f33723f;
        m51548Q(kk9);
        return kk9;
    }

    /* renamed from: Y */
    public final py8 mo47654Y() {
        py8 py8 = this.f33725h;
        m51548Q(py8);
        return py8;
    }

    /* renamed from: Z */
    public final w59 mo47655Z() {
        w59 w59 = this.f33724g;
        m51548Q(w59);
        return w59;
    }

    /* renamed from: a */
    public final bh0 mo45256a() {
        return ((kr8) cu4.m43221k(this.f33728k)).mo45256a();
    }

    /* renamed from: a0 */
    public final i29 mo47656a0() {
        return this.f33726i;
    }

    /* renamed from: b */
    public final rk9 mo45257b() {
        throw null;
    }

    /* renamed from: b0 */
    public final mm8 mo47657b0() {
        return this.f33728k.mo45244H();
    }

    /* renamed from: c */
    public final String mo47658c(u68 u68) {
        if (!u68.mo48331h()) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo47659c0().mo42813i0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: c0 */
    public final g69 mo47659c0() {
        return ((kr8) cu4.m43221k(this.f33728k)).mo45243G();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v15, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:214|215) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0211, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0212, code lost:
        r8.f34342a.mo45237A().mo29670l().mo48771c("Failed to merge queued bundle. appId", p000.bn8.m32664w(r6), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026b, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        r0 = r0.subList(0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02f9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02fa, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        mo45237A().mo29670l().mo48771c("Failed to parse upload URL. Not uploading. appId", p000.bn8.m32664w(r6), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04e8, code lost:
        if (r3 != null) goto L_0x04c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0511, code lost:
        r1.f33737t = r2;
        mo47643M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0516, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r11 != null) goto L_0x0108;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:214:0x046e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0294 A[SYNTHETIC, Splitter:B:142:0x0294] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029d A[Catch:{ all -> 0x03af, all -> 0x050c }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0485 A[Catch:{ all -> 0x03af, all -> 0x050c }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0508 A[SYNTHETIC, Splitter:B:250:0x0508] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0130 A[Catch:{ all -> 0x012c, all -> 0x050f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:170:0x0300=Splitter:B:170:0x0300, B:129:0x0268=Splitter:B:129:0x0268, B:228:0x04c9=Splitter:B:228:0x04c9, B:139:0x027b=Splitter:B:139:0x027b, B:240:0x04eb=Splitter:B:240:0x04eb, B:214:0x046e=Splitter:B:214:0x046e} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47660d() {
        /*
            r22 = this;
            r1 = r22
            cr8 r0 = r22.mo45272s()
            r0.mo29006e()
            r22.mo47661d0()
            r2 = 1
            r1.f33737t = r2
            r3 = 0
            kr8 r0 = r1.f33728k     // Catch:{ all -> 0x050f }
            r0.mo45257b()     // Catch:{ all -> 0x050f }
            kr8 r0 = r1.f33728k     // Catch:{ all -> 0x050f }
            g29 r0 = r0.mo45254R()     // Catch:{ all -> 0x050f }
            java.lang.Boolean r0 = r0.mo42732n()     // Catch:{ all -> 0x050f }
            if (r0 != 0) goto L_0x0034
            bn8 r0 = r22.mo45237A()     // Catch:{ all -> 0x050f }
            vm8 r0 = r0.mo29673o()     // Catch:{ all -> 0x050f }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.mo48769a(r2)     // Catch:{ all -> 0x050f }
            r1.f33737t = r3
        L_0x0030:
            r22.mo47643M()
            return
        L_0x0034:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x050f }
            if (r0 == 0) goto L_0x004a
            bn8 r0 = r22.mo45237A()     // Catch:{ all -> 0x050f }
            vm8 r0 = r0.mo29670l()     // Catch:{ all -> 0x050f }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.mo48769a(r2)     // Catch:{ all -> 0x050f }
            r1.f33737t = r3
            goto L_0x0030
        L_0x004a:
            long r4 = r1.f33731n     // Catch:{ all -> 0x050f }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            r22.mo47642L()     // Catch:{ all -> 0x050f }
            r1.f33737t = r3
            goto L_0x0030
        L_0x0058:
            cr8 r0 = r22.mo45272s()     // Catch:{ all -> 0x050f }
            r0.mo29006e()     // Catch:{ all -> 0x050f }
            java.util.List<java.lang.Long> r0 = r1.f33740w     // Catch:{ all -> 0x050f }
            if (r0 == 0) goto L_0x0073
            bn8 r0 = r22.mo45237A()     // Catch:{ all -> 0x050f }
            vm8 r0 = r0.mo29678v()     // Catch:{ all -> 0x050f }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.mo48769a(r2)     // Catch:{ all -> 0x050f }
            r1.f33737t = r3
            goto L_0x0030
        L_0x0073:
            sn8 r0 = r1.f33719b     // Catch:{ all -> 0x050f }
            m51548Q(r0)     // Catch:{ all -> 0x050f }
            boolean r0 = r0.mo47844j()     // Catch:{ all -> 0x050f }
            if (r0 != 0) goto L_0x0091
            bn8 r0 = r22.mo45237A()     // Catch:{ all -> 0x050f }
            vm8 r0 = r0.mo29678v()     // Catch:{ all -> 0x050f }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo48769a(r2)     // Catch:{ all -> 0x050f }
            r22.mo47642L()     // Catch:{ all -> 0x050f }
            r1.f33737t = r3
            goto L_0x0030
        L_0x0091:
            bh0 r0 = r22.mo45256a()     // Catch:{ all -> 0x050f }
            long r4 = r0.mo29580a()     // Catch:{ all -> 0x050f }
            n68 r0 = r22.mo47648S()     // Catch:{ all -> 0x050f }
            uk8<java.lang.Integer> r8 = p000.rl8.f33475R     // Catch:{ all -> 0x050f }
            r9 = 0
            int r0 = r0.mo45994r(r9, r8)     // Catch:{ all -> 0x050f }
            r22.mo47648S()     // Catch:{ all -> 0x050f }
            long r10 = p000.n68.m48616I()     // Catch:{ all -> 0x050f }
            long r10 = r4 - r10
            r8 = r3
        L_0x00ae:
            if (r8 >= r0) goto L_0x00b9
            boolean r12 = r1.mo47637G(r9, r10)     // Catch:{ all -> 0x050f }
            if (r12 == 0) goto L_0x00b9
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00b9:
            i29 r0 = r1.f33726i     // Catch:{ all -> 0x050f }
            io8 r0 = r0.f29794i     // Catch:{ all -> 0x050f }
            long r10 = r0.mo43882a()     // Catch:{ all -> 0x050f }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            bn8 r0 = r22.mo45237A()     // Catch:{ all -> 0x050f }
            vm8 r0 = r0.mo29677u()     // Catch:{ all -> 0x050f }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x050f }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x050f }
            r0.mo48770b(r6, r7)     // Catch:{ all -> 0x050f }
        L_0x00dc:
            m78 r0 = r1.f33720c     // Catch:{ all -> 0x050f }
            m51548Q(r0)     // Catch:{ all -> 0x050f }
            java.lang.String r6 = r0.mo45679i0()     // Catch:{ all -> 0x050f }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x050f }
            r7 = -1
            if (r0 != 0) goto L_0x0489
            long r10 = r1.f33742y     // Catch:{ all -> 0x050f }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0134
            m78 r10 = r1.f33720c     // Catch:{ all -> 0x050f }
            m51548Q(r10)     // Catch:{ all -> 0x050f }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo45660P()     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0111 }
            if (r0 != 0) goto L_0x010c
        L_0x0108:
            r11.close()     // Catch:{ all -> 0x050f }
            goto L_0x0129
        L_0x010c:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0111 }
            goto L_0x0108
        L_0x0111:
            r0 = move-exception
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            goto L_0x012e
        L_0x0115:
            r0 = move-exception
            r11 = r9
        L_0x0117:
            kr8 r10 = r10.f34342a     // Catch:{ all -> 0x012c }
            bn8 r10 = r10.mo45237A()     // Catch:{ all -> 0x012c }
            vm8 r10 = r10.mo29670l()     // Catch:{ all -> 0x012c }
            java.lang.String r12 = "Error querying raw events"
            r10.mo48770b(r12, r0)     // Catch:{ all -> 0x012c }
            if (r11 == 0) goto L_0x0129
            goto L_0x0108
        L_0x0129:
            r1.f33742y = r7     // Catch:{ all -> 0x050f }
            goto L_0x0134
        L_0x012c:
            r0 = move-exception
            r9 = r11
        L_0x012e:
            if (r9 == 0) goto L_0x0133
            r9.close()     // Catch:{ all -> 0x050f }
        L_0x0133:
            throw r0     // Catch:{ all -> 0x050f }
        L_0x0134:
            n68 r0 = r22.mo47648S()     // Catch:{ all -> 0x050f }
            uk8<java.lang.Integer> r7 = p000.rl8.f33498h     // Catch:{ all -> 0x050f }
            int r0 = r0.mo45994r(r6, r7)     // Catch:{ all -> 0x050f }
            n68 r7 = r22.mo47648S()     // Catch:{ all -> 0x050f }
            uk8<java.lang.Integer> r8 = p000.rl8.f33500i     // Catch:{ all -> 0x050f }
            int r7 = r7.mo45994r(r6, r8)     // Catch:{ all -> 0x050f }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x050f }
            m78 r8 = r1.f33720c     // Catch:{ all -> 0x050f }
            m51548Q(r8)     // Catch:{ all -> 0x050f }
            r8.mo29006e()     // Catch:{ all -> 0x050f }
            r8.mo47982g()     // Catch:{ all -> 0x050f }
            if (r0 <= 0) goto L_0x015b
            r10 = r2
            goto L_0x015c
        L_0x015b:
            r10 = r3
        L_0x015c:
            p000.cu4.m43211a(r10)     // Catch:{ all -> 0x050f }
            if (r7 <= 0) goto L_0x0163
            r10 = r2
            goto L_0x0164
        L_0x0163:
            r10 = r3
        L_0x0164:
            p000.cu4.m43211a(r10)     // Catch:{ all -> 0x050f }
            p000.cu4.m43217g(r6)     // Catch:{ all -> 0x050f }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo45660P()     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r12 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r14 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14}     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x026f }
            if (r0 != 0) goto L_0x019f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x026f }
            r11.close()     // Catch:{ all -> 0x050f }
            r20 = r4
            goto L_0x0297
        L_0x019f:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x026f }
            r12.<init>()     // Catch:{ SQLiteException -> 0x026f }
            r13 = r3
        L_0x01a5:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x026f }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0242 }
            s59 r2 = r8.f33321b     // Catch:{ IOException -> 0x0242 }
            w59 r2 = r2.f33724g     // Catch:{ IOException -> 0x0242 }
            m51548Q(r2)     // Catch:{ IOException -> 0x0242 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x022d }
            r9.<init>(r0)     // Catch:{ IOException -> 0x022d }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x022d }
            r0.<init>(r9)     // Catch:{ IOException -> 0x022d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x022d }
            r3.<init>()     // Catch:{ IOException -> 0x022d }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x022d }
            r20 = r4
        L_0x01c9:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x022b }
            if (r4 > 0) goto L_0x0226
            r0.close()     // Catch:{ IOException -> 0x022b }
            r9.close()     // Catch:{ IOException -> 0x022b }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x022b }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x026d }
            if (r2 != 0) goto L_0x01e5
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01e5
            goto L_0x0268
        L_0x01e5:
            nr8 r2 = p000.or8.m49408K0()     // Catch:{ IOException -> 0x0211 }
            p79 r2 = p000.w59.m53712J(r2, r0)     // Catch:{ IOException -> 0x0211 }
            nr8 r2 = (p000.nr8) r2     // Catch:{ IOException -> 0x0211 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x026d }
            if (r4 != 0) goto L_0x01fd
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo46188j0(r4)     // Catch:{ SQLiteException -> 0x026d }
        L_0x01fd:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r13 = r13 + r0
            s49 r0 = r2.mo48885o()     // Catch:{ SQLiteException -> 0x026d }
            or8 r0 = (p000.or8) r0     // Catch:{ SQLiteException -> 0x026d }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x026d }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x026d }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0211:
            r0 = move-exception
            kr8 r2 = r8.f34342a     // Catch:{ SQLiteException -> 0x026d }
            bn8 r2 = r2.mo45237A()     // Catch:{ SQLiteException -> 0x026d }
            vm8 r2 = r2.mo29670l()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = p000.bn8.m32664w(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo48771c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0226:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x022b }
            goto L_0x01c9
        L_0x022b:
            r0 = move-exception
            goto L_0x0230
        L_0x022d:
            r0 = move-exception
            r20 = r4
        L_0x0230:
            kr8 r2 = r2.f34342a     // Catch:{ IOException -> 0x0240 }
            bn8 r2 = r2.mo45237A()     // Catch:{ IOException -> 0x0240 }
            vm8 r2 = r2.mo29670l()     // Catch:{ IOException -> 0x0240 }
            java.lang.String r3 = "Failed to ungzip content"
            r2.mo48770b(r3, r0)     // Catch:{ IOException -> 0x0240 }
            throw r0     // Catch:{ IOException -> 0x0240 }
        L_0x0240:
            r0 = move-exception
            goto L_0x0245
        L_0x0242:
            r0 = move-exception
            r20 = r4
        L_0x0245:
            kr8 r2 = r8.f34342a     // Catch:{ SQLiteException -> 0x026d }
            bn8 r2 = r2.mo45237A()     // Catch:{ SQLiteException -> 0x026d }
            vm8 r2 = r2.mo29670l()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = p000.bn8.m32664w(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo48771c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
        L_0x0258:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x026d }
            if (r0 == 0) goto L_0x0268
            if (r13 <= r7) goto L_0x0261
            goto L_0x0268
        L_0x0261:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x01a5
        L_0x0268:
            r11.close()     // Catch:{ all -> 0x050c }
            r0 = r12
            goto L_0x0297
        L_0x026d:
            r0 = move-exception
            goto L_0x027b
        L_0x026f:
            r0 = move-exception
            r20 = r4
            goto L_0x027b
        L_0x0273:
            r0 = move-exception
            r9 = 0
            goto L_0x0483
        L_0x0277:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x027b:
            kr8 r2 = r8.f34342a     // Catch:{ all -> 0x0481 }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x0481 }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = p000.bn8.m32664w(r6)     // Catch:{ all -> 0x0481 }
            r2.mo48771c(r3, r4, r0)     // Catch:{ all -> 0x0481 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0481 }
            if (r11 == 0) goto L_0x0297
            r11.close()     // Catch:{ all -> 0x050c }
        L_0x0297:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x050c }
            if (r2 != 0) goto L_0x04ff
            u68 r2 = r1.mo47665f0(r6)     // Catch:{ all -> 0x050c }
            boolean r2 = r2.mo48329f()     // Catch:{ all -> 0x050c }
            if (r2 == 0) goto L_0x0300
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x050c }
        L_0x02ab:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x050c }
            if (r3 == 0) goto L_0x02ca
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x050c }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x050c }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x050c }
            or8 r3 = (p000.or8) r3     // Catch:{ all -> 0x050c }
            java.lang.String r4 = r3.mo46466E()     // Catch:{ all -> 0x050c }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x050c }
            if (r4 != 0) goto L_0x02ab
            java.lang.String r2 = r3.mo46466E()     // Catch:{ all -> 0x050c }
            goto L_0x02cb
        L_0x02ca:
            r2 = 0
        L_0x02cb:
            if (r2 == 0) goto L_0x0300
            r3 = 0
        L_0x02ce:
            int r4 = r0.size()     // Catch:{ all -> 0x050c }
            if (r3 >= r4) goto L_0x0300
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x050c }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x050c }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x050c }
            or8 r4 = (p000.or8) r4     // Catch:{ all -> 0x050c }
            java.lang.String r5 = r4.mo46466E()     // Catch:{ all -> 0x050c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x050c }
            if (r5 == 0) goto L_0x02e9
            goto L_0x02fd
        L_0x02e9:
            java.lang.String r4 = r4.mo46466E()     // Catch:{ all -> 0x050c }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x050c }
            if (r4 != 0) goto L_0x02fd
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x02f9 }
            goto L_0x0300
        L_0x02f9:
            r0 = move-exception
            r2 = r4
            goto L_0x0511
        L_0x02fd:
            int r3 = r3 + 1
            goto L_0x02ce
        L_0x0300:
            ir8 r2 = p000.jr8.m46712z()     // Catch:{ all -> 0x050c }
            int r3 = r0.size()     // Catch:{ all -> 0x050c }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x050c }
            int r5 = r0.size()     // Catch:{ all -> 0x050c }
            r4.<init>(r5)     // Catch:{ all -> 0x050c }
            n68 r5 = r22.mo47648S()     // Catch:{ all -> 0x050c }
            boolean r5 = r5.mo45981F(r6)     // Catch:{ all -> 0x050c }
            if (r5 == 0) goto L_0x0327
            u68 r5 = r1.mo47665f0(r6)     // Catch:{ all -> 0x050c }
            boolean r5 = r5.mo48329f()     // Catch:{ all -> 0x050c }
            if (r5 == 0) goto L_0x0327
            r5 = 1
            goto L_0x0328
        L_0x0327:
            r5 = 0
        L_0x0328:
            u68 r7 = r1.mo47665f0(r6)     // Catch:{ all -> 0x050c }
            boolean r7 = r7.mo48329f()     // Catch:{ all -> 0x050c }
            u68 r8 = r1.mo47665f0(r6)     // Catch:{ all -> 0x050c }
            boolean r8 = r8.mo48331h()     // Catch:{ all -> 0x050c }
            r9 = 0
        L_0x0339:
            if (r9 >= r3) goto L_0x03b3
            java.lang.Object r10 = r0.get(r9)     // Catch:{ all -> 0x050c }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x050c }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x050c }
            or8 r10 = (p000.or8) r10     // Catch:{ all -> 0x050c }
            w39 r10 = r10.mo47634s()     // Catch:{ all -> 0x050c }
            nr8 r10 = (p000.nr8) r10     // Catch:{ all -> 0x050c }
            java.lang.Object r11 = r0.get(r9)     // Catch:{ all -> 0x050c }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x050c }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x050c }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x050c }
            r4.add(r11)     // Catch:{ all -> 0x050c }
            n68 r11 = r22.mo47648S()     // Catch:{ all -> 0x050c }
            r11.mo45990m()     // Catch:{ all -> 0x050c }
            r11 = 42004(0xa414, double:2.07527E-319)
            r10.mo46151H(r11)     // Catch:{ all -> 0x050c }
            r11 = r20
            r10.mo46160L0(r11)     // Catch:{ all -> 0x050c }
            kr8 r13 = r1.f33728k     // Catch:{ all -> 0x050c }
            r13.mo45257b()     // Catch:{ all -> 0x050c }
            r13 = 0
            r10.mo46177V(r13)     // Catch:{ all -> 0x03af }
            if (r5 != 0) goto L_0x0378
            r10.mo46187i0()     // Catch:{ all -> 0x050c }
        L_0x0378:
            if (r7 != 0) goto L_0x0380
            r10.mo46155J()     // Catch:{ all -> 0x050c }
            r10.mo46159L()     // Catch:{ all -> 0x050c }
        L_0x0380:
            if (r8 != 0) goto L_0x0385
            r10.mo46163N()     // Catch:{ all -> 0x050c }
        L_0x0385:
            n68 r13 = r22.mo47648S()     // Catch:{ all -> 0x050c }
            uk8<java.lang.Boolean> r14 = p000.rl8.f33481X     // Catch:{ all -> 0x050c }
            boolean r13 = r13.mo45997v(r6, r14)     // Catch:{ all -> 0x050c }
            if (r13 == 0) goto L_0x03a7
            s49 r13 = r10.mo48885o()     // Catch:{ all -> 0x050c }
            or8 r13 = (p000.or8) r13     // Catch:{ all -> 0x050c }
            byte[] r13 = r13.mo30879c()     // Catch:{ all -> 0x050c }
            w59 r14 = r1.f33724g     // Catch:{ all -> 0x050c }
            m51548Q(r14)     // Catch:{ all -> 0x050c }
            long r13 = r14.mo48900H(r13)     // Catch:{ all -> 0x050c }
            r10.mo46193o0(r13)     // Catch:{ all -> 0x050c }
        L_0x03a7:
            r2.mo43904x(r10)     // Catch:{ all -> 0x050c }
            int r9 = r9 + 1
            r20 = r11
            goto L_0x0339
        L_0x03af:
            r0 = move-exception
            r2 = r13
            goto L_0x0511
        L_0x03b3:
            r11 = r20
            bn8 r0 = r22.mo45237A()     // Catch:{ all -> 0x050c }
            java.lang.String r0 = r0.mo29680y()     // Catch:{ all -> 0x050c }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x050c }
            if (r0 == 0) goto L_0x03d4
            w59 r0 = r1.f33724g     // Catch:{ all -> 0x050c }
            m51548Q(r0)     // Catch:{ all -> 0x050c }
            s49 r5 = r2.mo48885o()     // Catch:{ all -> 0x050c }
            jr8 r5 = (p000.jr8) r5     // Catch:{ all -> 0x050c }
            java.lang.String r0 = r0.mo48907x(r5)     // Catch:{ all -> 0x050c }
            goto L_0x03d5
        L_0x03d4:
            r0 = 0
        L_0x03d5:
            w59 r5 = r1.f33724g     // Catch:{ all -> 0x050c }
            m51548Q(r5)     // Catch:{ all -> 0x050c }
            s49 r5 = r2.mo48885o()     // Catch:{ all -> 0x050c }
            jr8 r5 = (p000.jr8) r5     // Catch:{ all -> 0x050c }
            byte[] r14 = r5.mo30879c()     // Catch:{ all -> 0x050c }
            r22.mo47648S()     // Catch:{ all -> 0x050c }
            uk8<java.lang.String> r5 = p000.rl8.f33518r     // Catch:{ all -> 0x050c }
            r9 = 0
            java.lang.Object r5 = r5.mo48412b(r9)     // Catch:{ all -> 0x050c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x050c }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x046e }
            r13.<init>(r5)     // Catch:{ MalformedURLException -> 0x046e }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x046e }
            r8 = 1
            r7 = r7 ^ r8
            p000.cu4.m43211a(r7)     // Catch:{ MalformedURLException -> 0x046e }
            java.util.List<java.lang.Long> r7 = r1.f33740w     // Catch:{ MalformedURLException -> 0x046e }
            if (r7 == 0) goto L_0x0410
            bn8 r4 = r22.mo45237A()     // Catch:{ MalformedURLException -> 0x046e }
            vm8 r4 = r4.mo29670l()     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.mo48769a(r7)     // Catch:{ MalformedURLException -> 0x046e }
            goto L_0x0417
        L_0x0410:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x046e }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x046e }
            r1.f33740w = r7     // Catch:{ MalformedURLException -> 0x046e }
        L_0x0417:
            i29 r4 = r1.f33726i     // Catch:{ MalformedURLException -> 0x046e }
            io8 r4 = r4.f29795j     // Catch:{ MalformedURLException -> 0x046e }
            r4.mo43883b(r11)     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x042b
            r3 = 0
            or8 r2 = r2.mo43903w(r3)     // Catch:{  }
            java.lang.String r4 = r2.mo46511x()     // Catch:{ MalformedURLException -> 0x046e }
        L_0x042b:
            bn8 r2 = r22.mo45237A()     // Catch:{ MalformedURLException -> 0x046e }
            vm8 r2 = r2.mo29678v()     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x046e }
            r2.mo48772d(r3, r4, r7, r0)     // Catch:{ MalformedURLException -> 0x046e }
            r2 = 1
            r1.f33736s = r2     // Catch:{ MalformedURLException -> 0x046e }
            sn8 r11 = r1.f33719b     // Catch:{ MalformedURLException -> 0x046e }
            m51548Q(r11)     // Catch:{ MalformedURLException -> 0x046e }
            c59 r0 = new c59     // Catch:{ MalformedURLException -> 0x046e }
            r0.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x046e }
            r11.mo29006e()     // Catch:{ MalformedURLException -> 0x046e }
            r11.mo47982g()     // Catch:{ MalformedURLException -> 0x046e }
            p000.cu4.m43221k(r13)     // Catch:{ MalformedURLException -> 0x046e }
            p000.cu4.m43221k(r14)     // Catch:{ MalformedURLException -> 0x046e }
            p000.cu4.m43221k(r0)     // Catch:{ MalformedURLException -> 0x046e }
            kr8 r2 = r11.f34342a     // Catch:{ MalformedURLException -> 0x046e }
            cr8 r2 = r2.mo45272s()     // Catch:{ MalformedURLException -> 0x046e }
            pn8 r3 = new pn8     // Catch:{ MalformedURLException -> 0x046e }
            r15 = 0
            r10 = r3
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x046e }
            r2.mo41643t(r3)     // Catch:{ MalformedURLException -> 0x046e }
            goto L_0x04ff
        L_0x046e:
            bn8 r0 = r22.mo45237A()     // Catch:{ all -> 0x050c }
            vm8 r0 = r0.mo29670l()     // Catch:{ all -> 0x050c }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = p000.bn8.m32664w(r6)     // Catch:{ all -> 0x050c }
            r0.mo48771c(r2, r3, r5)     // Catch:{ all -> 0x050c }
            goto L_0x04ff
        L_0x0481:
            r0 = move-exception
            r9 = r11
        L_0x0483:
            if (r9 == 0) goto L_0x0488
            r9.close()     // Catch:{ all -> 0x050c }
        L_0x0488:
            throw r0     // Catch:{ all -> 0x050c }
        L_0x0489:
            r11 = r4
            r1.f33742y = r7     // Catch:{ all -> 0x050c }
            m78 r2 = r1.f33720c     // Catch:{ all -> 0x050c }
            m51548Q(r2)     // Catch:{ all -> 0x050c }
            r22.mo47648S()     // Catch:{ all -> 0x050c }
            long r3 = p000.n68.m48616I()     // Catch:{ all -> 0x050c }
            long r4 = r11 - r3
            r2.mo29006e()     // Catch:{ all -> 0x050c }
            r2.mo47982g()     // Catch:{ all -> 0x050c }
            android.database.sqlite.SQLiteDatabase r0 = r2.mo45660P()     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            r5 = 0
            r3[r5] = r4     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r3 = r0.rawQuery(r4, r3)     // Catch:{ SQLiteException -> 0x04d7, all -> 0x04d5 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x04d3 }
            if (r0 != 0) goto L_0x04cd
            kr8 r0 = r2.f34342a     // Catch:{ SQLiteException -> 0x04d3 }
            bn8 r0 = r0.mo45237A()     // Catch:{ SQLiteException -> 0x04d3 }
            vm8 r0 = r0.mo29678v()     // Catch:{ SQLiteException -> 0x04d3 }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.mo48769a(r4)     // Catch:{ SQLiteException -> 0x04d3 }
        L_0x04c9:
            r3.close()     // Catch:{ all -> 0x050c }
            goto L_0x04eb
        L_0x04cd:
            r4 = 0
            java.lang.String r9 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x04d3 }
            goto L_0x04c9
        L_0x04d3:
            r0 = move-exception
            goto L_0x04d9
        L_0x04d5:
            r0 = move-exception
            goto L_0x0506
        L_0x04d7:
            r0 = move-exception
            r3 = r9
        L_0x04d9:
            kr8 r2 = r2.f34342a     // Catch:{ all -> 0x0504 }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x0504 }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x0504 }
            java.lang.String r4 = "Error selecting expired configs"
            r2.mo48770b(r4, r0)     // Catch:{ all -> 0x0504 }
            if (r3 == 0) goto L_0x04eb
            goto L_0x04c9
        L_0x04eb:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x050c }
            if (r0 != 0) goto L_0x04ff
            m78 r0 = r1.f33720c     // Catch:{ all -> 0x050c }
            m51548Q(r0)     // Catch:{ all -> 0x050c }
            cs8 r0 = r0.mo45673c0(r9)     // Catch:{ all -> 0x050c }
            if (r0 == 0) goto L_0x04ff
            r1.mo47664f(r0)     // Catch:{ all -> 0x050c }
        L_0x04ff:
            r2 = 0
            r1.f33737t = r2
            goto L_0x0030
        L_0x0504:
            r0 = move-exception
            r9 = r3
        L_0x0506:
            if (r9 == 0) goto L_0x050b
            r9.close()     // Catch:{ all -> 0x050c }
        L_0x050b:
            throw r0     // Catch:{ all -> 0x050c }
        L_0x050c:
            r0 = move-exception
            r2 = 0
            goto L_0x0511
        L_0x050f:
            r0 = move-exception
            r2 = r3
        L_0x0511:
            r1.f33737t = r2
            r22.mo47643M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s59.mo47660d():void");
    }

    /* renamed from: d0 */
    public final void mo47661d0() {
        if (!this.f33729l) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final void mo47662e(int i, Throwable th, byte[] bArr, String str) {
        m78 m78;
        mo45272s().mo29006e();
        mo47661d0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f33736s = false;
                mo47643M();
                throw th2;
            }
        }
        List<Long> list = (List) cu4.m43221k(this.f33740w);
        this.f33740w = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo45237A().mo29678v().mo48771c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f33726i.f29795j.mo43883b(mo45256a().mo29580a());
            if (i == 503 || i == 429) {
                this.f33726i.f29793h.mo43883b(mo45256a().mo29580a());
            }
            m78 m782 = this.f33720c;
            m51548Q(m782);
            m782.mo45682k(list);
            mo47642L();
            this.f33736s = false;
            mo47643M();
        }
        if (th == null) {
            try {
                this.f33726i.f29794i.mo43883b(mo45256a().mo29580a());
                this.f33726i.f29795j.mo43883b(0);
                mo47642L();
                mo45237A().mo29678v().mo48771c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                m78 m783 = this.f33720c;
                m51548Q(m783);
                m783.mo45657M();
                try {
                    for (Long l : list) {
                        try {
                            m78 = this.f33720c;
                            m51548Q(m78);
                            long longValue = l.longValue();
                            m78.mo29006e();
                            m78.mo47982g();
                            if (m78.mo45660P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            m78.f34342a.mo45237A().mo29670l().mo48770b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List<Long> list2 = this.f33741x;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    m78 m784 = this.f33720c;
                    m51548Q(m784);
                    m784.mo45658N();
                    m78 m785 = this.f33720c;
                    m51548Q(m785);
                    m785.mo45659O();
                    this.f33741x = null;
                    sn8 sn8 = this.f33719b;
                    m51548Q(sn8);
                    if (!sn8.mo47844j() || !mo47641K()) {
                        this.f33742y = -1;
                        mo47642L();
                    } else {
                        mo47660d();
                    }
                    this.f33731n = 0;
                } catch (Throwable th3) {
                    m78 m786 = this.f33720c;
                    m51548Q(m786);
                    m786.mo45659O();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                mo45237A().mo29670l().mo48770b("Database error while trying to delete uploaded bundles", e3);
                this.f33731n = mo45256a().mo29581b();
                mo45237A().mo29678v().mo48770b("Disable upload, time", Long.valueOf(this.f33731n));
            }
            this.f33736s = false;
            mo47643M();
        }
        mo45237A().mo29678v().mo48771c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f33726i.f29795j.mo43883b(mo45256a().mo29580a());
        this.f33726i.f29793h.mo43883b(mo45256a().mo29580a());
        m78 m7822 = this.f33720c;
        m51548Q(m7822);
        m7822.mo45682k(list);
        mo47642L();
        this.f33736s = false;
        mo47643M();
    }

    /* renamed from: e0 */
    public final void mo47663e0(String str, u68 u68) {
        mo45272s().mo29006e();
        mo47661d0();
        this.f33743z.put(str, u68);
        m78 m78 = this.f33720c;
        m51548Q(m78);
        cu4.m43221k(str);
        cu4.m43221k(u68);
        m78.mo29006e();
        m78.mo47982g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", u68.mo48326d());
        try {
            if (m78.mo45660P().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                m78.f34342a.mo45237A().mo29670l().mo48770b("Failed to insert/update consent setting (got -1). appId", bn8.m32664w(str));
            }
        } catch (SQLiteException e) {
            m78.f34342a.mo45237A().mo29670l().mo48771c("Error storing consent setting. appId, error", bn8.m32664w(str), e);
        }
    }

    /* renamed from: f */
    public final void mo47664f(cs8 cs8) {
        String str;
        mo45272s().mo29006e();
        le9.m47797a();
        n68 S = mo47648S();
        String N = cs8.mo41663N();
        uk8<Boolean> uk8 = rl8.f33501i0;
        if (S.mo45997v(N, uk8)) {
            if (TextUtils.isEmpty(cs8.mo41666Q()) && TextUtils.isEmpty(cs8.mo41670U()) && TextUtils.isEmpty(cs8.mo41668S())) {
                mo47666g((String) cu4.m43221k(cs8.mo41663N()), MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(cs8.mo41666Q()) && TextUtils.isEmpty(cs8.mo41668S())) {
            mo47666g((String) cu4.m43221k(cs8.mo41663N()), MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        w49 w49 = this.f33727j;
        Uri.Builder builder = new Uri.Builder();
        String Q = cs8.mo41666Q();
        if (TextUtils.isEmpty(Q)) {
            le9.m47797a();
            if (w49.f34342a.mo45274y().mo45997v(cs8.mo41663N(), uk8)) {
                Q = cs8.mo41670U();
                if (TextUtils.isEmpty(Q)) {
                    Q = cs8.mo41668S();
                }
            } else {
                Q = cs8.mo41668S();
            }
        }
        C2781lq lqVar = null;
        Uri.Builder encodedAuthority = builder.scheme(rl8.f33494f.mo48412b(null)).encodedAuthority(rl8.f33496g.mo48412b(null));
        String valueOf = String.valueOf(Q);
        if (valueOf.length() != 0) {
            str = "config/app/".concat(valueOf);
        } else {
            str = new String("config/app/");
        }
        Uri.Builder appendQueryParameter = encodedAuthority.path(str).appendQueryParameter("app_instance_id", cs8.mo41664O()).appendQueryParameter("platform", "android");
        w49.f34342a.mo45274y().mo45990m();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(42004));
        zf9.m55099a();
        if (w49.f34342a.mo45274y().mo45997v(cs8.mo41663N(), rl8.f33461F0)) {
            builder.appendQueryParameter("runtime_version", "0");
        }
        String uri = builder.build().toString();
        try {
            String str2 = (String) cu4.m43221k(cs8.mo41663N());
            URL url = new URL(uri);
            mo45237A().mo29678v().mo48770b("Fetching remote configuration", str2);
            qq8 qq8 = this.f33718a;
            m51548Q(qq8);
            np8 j = qq8.mo47249j(str2);
            qq8 qq82 = this.f33718a;
            m51548Q(qq82);
            String k = qq82.mo47250k(str2);
            if (j != null && !TextUtils.isEmpty(k)) {
                lqVar = new C2781lq();
                lqVar.put("If-Modified-Since", k);
            }
            this.f33735r = true;
            sn8 sn8 = this.f33719b;
            m51548Q(sn8);
            f59 f59 = new f59(this);
            sn8.mo29006e();
            sn8.mo47982g();
            cu4.m43221k(url);
            cu4.m43221k(f59);
            sn8.f34342a.mo45272s().mo41643t(new pn8(sn8, str2, url, (byte[]) null, lqVar, f59));
        } catch (MalformedURLException unused) {
            mo45237A().mo29670l().mo48771c("Failed to parse config URL. Not fetching. appId", bn8.m32664w(cs8.mo41663N()), uri);
        }
    }

    /* renamed from: f0 */
    public final u68 mo47665f0(String str) {
        String str2;
        mo45272s().mo29006e();
        mo47661d0();
        u68 u68 = this.f33743z.get(str);
        if (u68 != null) {
            return u68;
        }
        m78 m78 = this.f33720c;
        m51548Q(m78);
        cu4.m43221k(str);
        m78.mo29006e();
        m78.mo47982g();
        Cursor cursor = null;
        try {
            Cursor rawQuery = m78.mo45660P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            u68 c = u68.m52648c(str2);
            mo47663e0(str, c);
            return c;
        } catch (SQLiteException e) {
            m78.f34342a.mo45237A().mo29670l().mo48771c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ all -> 0x016b, all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ all -> 0x016b, all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0126 A[Catch:{ all -> 0x016b, all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0134 A[Catch:{ all -> 0x016b, all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0156 A[Catch:{ all -> 0x016b, all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015a A[Catch:{ all -> 0x016b, all -> 0x0175 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47666g(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            cr8 r0 = r6.mo45272s()
            r0.mo29006e()
            r6.mo47661d0()
            p000.cu4.m43217g(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0175 }
        L_0x0012:
            bn8 r1 = r6.mo45237A()     // Catch:{ all -> 0x0175 }
            vm8 r1 = r1.mo29678v()     // Catch:{ all -> 0x0175 }
            int r2 = r10.length     // Catch:{ all -> 0x0175 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.mo48770b(r3, r2)     // Catch:{ all -> 0x0175 }
            m78 r1 = r6.f33720c     // Catch:{ all -> 0x0175 }
            m51548Q(r1)     // Catch:{ all -> 0x0175 }
            r1.mo45657M()     // Catch:{ all -> 0x0175 }
            m78 r1 = r6.f33720c     // Catch:{ all -> 0x016b }
            m51548Q(r1)     // Catch:{ all -> 0x016b }
            cs8 r1 = r1.mo45673c0(r7)     // Catch:{ all -> 0x016b }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r3) goto L_0x0042
            r3 = 204(0xcc, float:2.86E-43)
            if (r8 == r3) goto L_0x0042
            if (r8 != r4) goto L_0x0046
            r8 = r4
        L_0x0042:
            if (r9 != 0) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x0046:
            r3 = r0
        L_0x0047:
            if (r1 != 0) goto L_0x005c
            bn8 r8 = r6.mo45237A()     // Catch:{ all -> 0x016b }
            vm8 r8 = r8.mo29673o()     // Catch:{ all -> 0x016b }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = p000.bn8.m32664w(r7)     // Catch:{ all -> 0x016b }
            r8.mo48770b(r9, r7)     // Catch:{ all -> 0x016b }
            goto L_0x015d
        L_0x005c:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00ba
            if (r8 != r5) goto L_0x0063
            goto L_0x00ba
        L_0x0063:
            bh0 r10 = r6.mo45256a()     // Catch:{ all -> 0x016b }
            long r10 = r10.mo29580a()     // Catch:{ all -> 0x016b }
            r1.mo41699m(r10)     // Catch:{ all -> 0x016b }
            m78 r10 = r6.f33720c     // Catch:{ all -> 0x016b }
            m51548Q(r10)     // Catch:{ all -> 0x016b }
            r10.mo45674d0(r1)     // Catch:{ all -> 0x016b }
            bn8 r10 = r6.mo45237A()     // Catch:{ all -> 0x016b }
            vm8 r10 = r10.mo29678v()     // Catch:{ all -> 0x016b }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x016b }
            r10.mo48771c(r11, r1, r9)     // Catch:{ all -> 0x016b }
            qq8 r9 = r6.f33718a     // Catch:{ all -> 0x016b }
            m51548Q(r9)     // Catch:{ all -> 0x016b }
            r9.mo47251l(r7)     // Catch:{ all -> 0x016b }
            i29 r7 = r6.f33726i     // Catch:{ all -> 0x016b }
            io8 r7 = r7.f29795j     // Catch:{ all -> 0x016b }
            bh0 r9 = r6.mo45256a()     // Catch:{ all -> 0x016b }
            long r9 = r9.mo29580a()     // Catch:{ all -> 0x016b }
            r7.mo43883b(r9)     // Catch:{ all -> 0x016b }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a6
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00b5
        L_0x00a6:
            i29 r7 = r6.f33726i     // Catch:{ all -> 0x016b }
            io8 r7 = r7.f29793h     // Catch:{ all -> 0x016b }
            bh0 r8 = r6.mo45256a()     // Catch:{ all -> 0x016b }
            long r8 = r8.mo29580a()     // Catch:{ all -> 0x016b }
            r7.mo43883b(r8)     // Catch:{ all -> 0x016b }
        L_0x00b5:
            r6.mo47642L()     // Catch:{ all -> 0x016b }
            goto L_0x015d
        L_0x00ba:
            r9 = 0
            if (r11 == 0) goto L_0x00c6
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x016b }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x016b }
            goto L_0x00c7
        L_0x00c6:
            r11 = r9
        L_0x00c7:
            if (r11 == 0) goto L_0x00d6
            int r3 = r11.size()     // Catch:{ all -> 0x016b }
            if (r3 <= 0) goto L_0x00d6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x016b }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x016b }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r8 == r5) goto L_0x00f5
            if (r8 != r4) goto L_0x00dc
            goto L_0x00f5
        L_0x00dc:
            qq8 r9 = r6.f33718a     // Catch:{ all -> 0x016b }
            m51548Q(r9)     // Catch:{ all -> 0x016b }
            boolean r9 = r9.mo47255p(r7, r10, r11)     // Catch:{ all -> 0x016b }
            if (r9 != 0) goto L_0x0111
            m78 r7 = r6.f33720c     // Catch:{ all -> 0x0175 }
            m51548Q(r7)     // Catch:{ all -> 0x0175 }
        L_0x00ec:
            r7.mo45659O()     // Catch:{ all -> 0x0175 }
            r6.f33735r = r0
            r6.mo47643M()
            return
        L_0x00f5:
            qq8 r10 = r6.f33718a     // Catch:{ all -> 0x016b }
            m51548Q(r10)     // Catch:{ all -> 0x016b }
            np8 r10 = r10.mo47249j(r7)     // Catch:{ all -> 0x016b }
            if (r10 != 0) goto L_0x0111
            qq8 r10 = r6.f33718a     // Catch:{ all -> 0x016b }
            m51548Q(r10)     // Catch:{ all -> 0x016b }
            boolean r9 = r10.mo47255p(r7, r9, r9)     // Catch:{ all -> 0x016b }
            if (r9 != 0) goto L_0x0111
            m78 r7 = r6.f33720c     // Catch:{ all -> 0x0175 }
            m51548Q(r7)     // Catch:{ all -> 0x0175 }
            goto L_0x00ec
        L_0x0111:
            bh0 r9 = r6.mo45256a()     // Catch:{ all -> 0x016b }
            long r9 = r9.mo29580a()     // Catch:{ all -> 0x016b }
            r1.mo41696k(r9)     // Catch:{ all -> 0x016b }
            m78 r9 = r6.f33720c     // Catch:{ all -> 0x016b }
            m51548Q(r9)     // Catch:{ all -> 0x016b }
            r9.mo45674d0(r1)     // Catch:{ all -> 0x016b }
            if (r8 != r5) goto L_0x0134
            bn8 r8 = r6.mo45237A()     // Catch:{ all -> 0x016b }
            vm8 r8 = r8.mo29675r()     // Catch:{ all -> 0x016b }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo48770b(r9, r7)     // Catch:{ all -> 0x016b }
            goto L_0x0145
        L_0x0134:
            bn8 r7 = r6.mo45237A()     // Catch:{ all -> 0x016b }
            vm8 r7 = r7.mo29678v()     // Catch:{ all -> 0x016b }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x016b }
            r7.mo48771c(r9, r8, r2)     // Catch:{ all -> 0x016b }
        L_0x0145:
            sn8 r7 = r6.f33719b     // Catch:{ all -> 0x016b }
            m51548Q(r7)     // Catch:{ all -> 0x016b }
            boolean r7 = r7.mo47844j()     // Catch:{ all -> 0x016b }
            if (r7 == 0) goto L_0x015a
            boolean r7 = r6.mo47641K()     // Catch:{ all -> 0x016b }
            if (r7 == 0) goto L_0x015a
            r6.mo47660d()     // Catch:{ all -> 0x016b }
            goto L_0x015d
        L_0x015a:
            r6.mo47642L()     // Catch:{ all -> 0x016b }
        L_0x015d:
            m78 r7 = r6.f33720c     // Catch:{ all -> 0x016b }
            m51548Q(r7)     // Catch:{ all -> 0x016b }
            r7.mo45658N()     // Catch:{ all -> 0x016b }
            m78 r7 = r6.f33720c     // Catch:{ all -> 0x0175 }
            m51548Q(r7)     // Catch:{ all -> 0x0175 }
            goto L_0x00ec
        L_0x016b:
            r7 = move-exception
            m78 r8 = r6.f33720c     // Catch:{ all -> 0x0175 }
            m51548Q(r8)     // Catch:{ all -> 0x0175 }
            r8.mo45659O()     // Catch:{ all -> 0x0175 }
            throw r7     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r7 = move-exception
            r6.f33735r = r0
            r6.mo47643M()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s59.mo47666g(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* renamed from: g0 */
    public final long mo47667g0() {
        long a = mo45256a().mo29580a();
        i29 i29 = this.f33726i;
        i29.mo47982g();
        i29.mo29006e();
        long a2 = i29.f29796k.mo43882a();
        if (a2 == 0) {
            a2 = ((long) i29.f34342a.mo45243G().mo42813i0().nextInt(86400000)) + 1;
            i29.f29796k.mo43883b(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: h */
    public final void mo47668h(Runnable runnable) {
        mo45272s().mo29006e();
        if (this.f33732o == null) {
            this.f33732o = new ArrayList();
        }
        this.f33732o.add(runnable);
    }

    /* renamed from: h0 */
    public final void mo47669h0(zzas zzas, String str) {
        String str2;
        zzas zzas2 = zzas;
        String str3 = str;
        m78 m78 = this.f33720c;
        m51548Q(m78);
        cs8 c0 = m78.mo45673c0(str3);
        if (c0 == null || TextUtils.isEmpty(c0.mo41685e0())) {
            mo45237A().mo29677u().mo48770b("No app data available; dropping event", str3);
            return;
        }
        Boolean N = mo47644N(c0);
        if (N == null) {
            if (!"_ui".equals(zzas2.f23074a)) {
                mo45237A().mo29673o().mo48770b("Could not find package. appId", bn8.m32664w(str));
            }
        } else if (!N.booleanValue()) {
            mo45237A().mo29670l().mo48770b("App version does not match; dropping event. appId", bn8.m32664w(str));
            return;
        }
        String Q = c0.mo41666Q();
        String e0 = c0.mo41685e0();
        long g0 = c0.mo41689g0();
        String i0 = c0.mo41693i0();
        long k0 = c0.mo41697k0();
        long b = c0.mo41678b();
        boolean f = c0.mo41686f();
        String Y = c0.mo41674Y();
        long E = c0.mo41654E();
        boolean G = c0.mo41656G();
        String S = c0.mo41668S();
        Boolean I = c0.mo41658I();
        long d = c0.mo41682d();
        List<String> K = c0.mo41660K();
        le9.m47797a();
        if (mo47648S().mo45997v(c0.mo41663N(), rl8.f33501i0)) {
            str2 = c0.mo41670U();
        } else {
            str2 = null;
        }
        zzp zzp = r2;
        zzp zzp2 = new zzp(str, Q, e0, g0, i0, k0, b, (String) null, f, false, Y, E, 0, 0, G, false, S, I, d, K, str2, mo47665f0(str3).mo48326d());
        mo47671i0(zzas, zzp);
    }

    /* renamed from: i */
    public final void mo47670i() {
        mo45272s().mo29006e();
        mo47661d0();
        if (!this.f33730m) {
            this.f33730m = true;
            if (mo47672j()) {
                FileChannel fileChannel = this.f33739v;
                mo45272s().mo29006e();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo45237A().mo29670l().mo48769a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo45237A().mo29673o().mo48770b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo45237A().mo29670l().mo48770b("Failed to read from channel", e);
                    }
                }
                int r = this.f33728k.mo45258c().mo41983r();
                mo45272s().mo29006e();
                if (i > r) {
                    mo45237A().mo29670l().mo48771c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(r));
                } else if (i < r) {
                    FileChannel fileChannel2 = this.f33739v;
                    mo45272s().mo29006e();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo45237A().mo29670l().mo48769a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(r);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            boolean v = mo47648S().mo45997v((String) null, rl8.f33519r0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo45237A().mo29670l().mo48770b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            mo45237A().mo29678v().mo48771c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(r));
                            return;
                        } catch (IOException e2) {
                            mo45237A().mo29670l().mo48770b("Failed to write to channel", e2);
                        }
                    }
                    mo45237A().mo29670l().mo48771c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(r));
                }
            }
        }
    }

    /* renamed from: i0 */
    public final void mo47671i0(zzas zzas, zzp zzp) {
        cu4.m43217g(zzp.f23098a);
        en8 a = en8.m43994a(zzas);
        g69 c0 = mo47659c0();
        Bundle bundle = a.f28641d;
        m78 m78 = this.f33720c;
        m51548Q(m78);
        c0.mo42831u(bundle, m78.mo45691v(zzp.f23098a));
        mo47659c0().mo42829t(a, mo47648S().mo45988k(zzp.f23098a));
        zzas b = a.mo42331b();
        if (mo47648S().mo45997v((String) null, rl8.f33491d0) && "_cmp".equals(b.f23074a) && "referrer API v2".equals(b.f23075d.mo31417u1("_cis"))) {
            String u1 = b.f23075d.mo31417u1("gclid");
            if (!TextUtils.isEmpty(u1)) {
                mo47676l(new zzkq("_lgclid", b.f23077g, u1, "auto"), zzp);
            }
        }
        mo47673j0(b, zzp);
    }

    /* renamed from: j */
    public final boolean mo47672j() {
        FileLock fileLock;
        mo45272s().mo29006e();
        if (!mo47648S().mo45997v((String) null, rl8.f33499h0) || (fileLock = this.f33738u) == null || !fileLock.isValid()) {
            this.f33720c.f34342a.mo45274y();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f33728k.mo45271q().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f33739v = channel;
                FileLock tryLock = channel.tryLock();
                this.f33738u = tryLock;
                if (tryLock != null) {
                    mo45237A().mo29678v().mo48769a("Storage concurrent access okay");
                    return true;
                }
                mo45237A().mo29670l().mo48769a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                mo45237A().mo29670l().mo48770b("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                mo45237A().mo29670l().mo48770b("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                mo45237A().mo29673o().mo48770b("Storage lock already acquired", e3);
                return false;
            }
        } else {
            mo45237A().mo29678v().mo48769a("Storage concurrent access okay");
            return true;
        }
    }

    /* renamed from: j0 */
    public final void mo47673j0(zzas zzas, zzp zzp) {
        List<zzaa> list;
        List<zzaa> list2;
        List<zzaa> list3;
        zzas zzas2 = zzas;
        zzp zzp2 = zzp;
        cu4.m43221k(zzp);
        cu4.m43217g(zzp2.f23098a);
        mo45272s().mo29006e();
        mo47661d0();
        String str = zzp2.f23098a;
        long j = zzas2.f23077g;
        m51548Q(this.f33724g);
        if (w59.m53717O(zzas, zzp)) {
            if (!zzp2.f23105x) {
                mo47686x(zzp2);
                return;
            }
            List<String> list4 = zzp2.f23095X;
            if (list4 != null) {
                if (list4.contains(zzas2.f23074a)) {
                    Bundle w1 = zzas2.f23075d.mo31419w1();
                    w1.putLong("ga_safelisted", 1);
                    zzas2 = new zzas(zzas2.f23074a, new zzaq(w1), zzas2.f23076e, zzas2.f23077g);
                } else {
                    mo45237A().mo29677u().mo48772d("Dropping non-safelisted event. appId, event name, origin", str, zzas2.f23074a, zzas2.f23076e);
                    return;
                }
            }
            m78 m78 = this.f33720c;
            m51548Q(m78);
            m78.mo45657M();
            try {
                m78 m782 = this.f33720c;
                m51548Q(m782);
                cu4.m43217g(str);
                m782.mo29006e();
                m782.mo47982g();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    m782.f34342a.mo45237A().mo29673o().mo48771c("Invalid time querying timed out conditional properties", bn8.m32664w(str), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = m782.mo45672b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzaa next : list) {
                    if (next != null) {
                        mo45237A().mo29678v().mo48772d("User property timed out", next.f23064a, this.f33728k.mo45244H().mo45823o(next.f23066e.f23079d), next.f23066e.mo31423r1());
                        zzas zzas3 = next.f23070s;
                        if (zzas3 != null) {
                            mo47675k0(new zzas(zzas3, j), zzp2);
                        }
                        m78 m783 = this.f33720c;
                        m51548Q(m783);
                        m783.mo45670Z(str, next.f23066e.f23079d);
                    }
                }
                m78 m784 = this.f33720c;
                m51548Q(m784);
                cu4.m43217g(str);
                m784.mo29006e();
                m784.mo47982g();
                if (i < 0) {
                    m784.f34342a.mo45237A().mo29673o().mo48771c("Invalid time querying expired conditional properties", bn8.m32664w(str), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = m784.mo45672b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList<zzas> arrayList = new ArrayList<>(list2.size());
                for (zzaa next2 : list2) {
                    if (next2 != null) {
                        mo45237A().mo29678v().mo48772d("User property expired", next2.f23064a, this.f33728k.mo45244H().mo45823o(next2.f23066e.f23079d), next2.f23066e.mo31423r1());
                        m78 m785 = this.f33720c;
                        m51548Q(m785);
                        m785.mo45663S(str, next2.f23066e.f23079d);
                        zzas zzas4 = next2.f23063B;
                        if (zzas4 != null) {
                            arrayList.add(zzas4);
                        }
                        m78 m786 = this.f33720c;
                        m51548Q(m786);
                        m786.mo45670Z(str, next2.f23066e.f23079d);
                    }
                }
                for (zzas zzas5 : arrayList) {
                    mo47675k0(new zzas(zzas5, j), zzp2);
                }
                m78 m787 = this.f33720c;
                m51548Q(m787);
                String str2 = zzas2.f23074a;
                cu4.m43217g(str);
                cu4.m43217g(str2);
                m787.mo29006e();
                m787.mo47982g();
                if (i < 0) {
                    m787.f34342a.mo45237A().mo29673o().mo48772d("Invalid time querying triggered conditional properties", bn8.m32664w(str), m787.f34342a.mo45244H().mo45821m(str2), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = m787.mo45672b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList<zzas> arrayList2 = new ArrayList<>(list3.size());
                for (zzaa next3 : list3) {
                    if (next3 != null) {
                        zzkq zzkq = next3.f23066e;
                        a69 a69 = new a69((String) cu4.m43221k(next3.f23064a), next3.f23065d, zzkq.f23079d, j, cu4.m43221k(zzkq.mo31423r1()));
                        m78 m788 = this.f33720c;
                        m51548Q(m788);
                        if (m788.mo45664T(a69)) {
                            mo45237A().mo29678v().mo48772d("User property triggered", next3.f23064a, this.f33728k.mo45244H().mo45823o(a69.f20823c), a69.f20825e);
                        } else {
                            mo45237A().mo29670l().mo48772d("Too many active user properties, ignoring", bn8.m32664w(next3.f23064a), this.f33728k.mo45244H().mo45823o(a69.f20823c), a69.f20825e);
                        }
                        zzas zzas6 = next3.f23072y;
                        if (zzas6 != null) {
                            arrayList2.add(zzas6);
                        }
                        next3.f23066e = new zzkq(a69);
                        next3.f23068k = true;
                        m78 m789 = this.f33720c;
                        m51548Q(m789);
                        m789.mo45668X(next3);
                    }
                }
                mo47675k0(zzas2, zzp2);
                for (zzas zzas7 : arrayList2) {
                    mo47675k0(new zzas(zzas7, j), zzp2);
                }
                m78 m7810 = this.f33720c;
                m51548Q(m7810);
                m7810.mo45658N();
            } finally {
                m78 m7811 = this.f33720c;
                m51548Q(m7811);
                m7811.mo45659O();
            }
        }
    }

    /* renamed from: k */
    public final void mo47674k(zzp zzp) {
        if (this.f33740w != null) {
            ArrayList arrayList = new ArrayList();
            this.f33741x = arrayList;
            arrayList.addAll(this.f33740w);
        }
        m78 m78 = this.f33720c;
        m51548Q(m78);
        String str = (String) cu4.m43221k(zzp.f23098a);
        cu4.m43217g(str);
        m78.mo29006e();
        m78.mo47982g();
        try {
            SQLiteDatabase P = m78.mo45660P();
            String[] strArr = {str};
            int delete = P.delete("apps", "app_id=?", strArr) + P.delete("events", "app_id=?", strArr) + P.delete("user_attributes", "app_id=?", strArr) + P.delete("conditional_properties", "app_id=?", strArr) + P.delete("raw_events", "app_id=?", strArr) + P.delete("raw_events_metadata", "app_id=?", strArr) + P.delete("queue", "app_id=?", strArr) + P.delete("audience_filter_values", "app_id=?", strArr) + P.delete("main_event_params", "app_id=?", strArr) + P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                m78.f34342a.mo45237A().mo29678v().mo48771c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            m78.f34342a.mo45237A().mo29670l().mo48771c("Error resetting analytics data. appId, error", bn8.m32664w(str), e);
        }
        if (zzp.f23105x) {
            mo47681r(zzp);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:242:0x07e6, code lost:
        if (r14.size() == 0) goto L_0x07e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x09f2, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x031e A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0375 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0378 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03d2 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0573 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x05b5 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0639 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0684 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0691 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x069e A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x06ac A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x06bd A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x06f0 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0729 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0748 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0763 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x07eb A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x080a A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0878 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0885 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x089f A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0935 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0955 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x09e8 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0a95 A[Catch:{ SQLiteException -> 0x0ab0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0aab  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x09f4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a7 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01be A[SYNTHETIC, Splitter:B:57:0x01be] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0239 A[Catch:{ NumberFormatException -> 0x07d0, all -> 0x0b2c }] */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47675k0(com.google.android.gms.measurement.internal.zzas r44, com.google.android.gms.measurement.internal.zzp r45) {
        /*
            r43 = this;
            r1 = r43
            r2 = r44
            r3 = r45
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            p000.cu4.m43221k(r45)
            java.lang.String r8 = r3.f23098a
            p000.cu4.m43217g(r8)
            long r8 = java.lang.System.nanoTime()
            cr8 r10 = r43.mo45272s()
            r10.mo29006e()
            r43.mo47661d0()
            java.lang.String r10 = r3.f23098a
            w59 r11 = r1.f33724g
            m51548Q(r11)
            boolean r11 = p000.w59.m53717O(r44, r45)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f23105x
            if (r11 == 0) goto L_0x0b37
            qq8 r11 = r1.f33718a
            m51548Q(r11)
            java.lang.String r12 = r2.f23074a
            boolean r11 = r11.mo47256r(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00ea
            bn8 r3 = r43.mo45237A()
            vm8 r3 = r3.mo29673o()
            java.lang.Object r4 = p000.bn8.m32664w(r10)
            kr8 r5 = r1.f33728k
            mm8 r5 = r5.mo45244H()
            java.lang.String r6 = r2.f23074a
            java.lang.String r5 = r5.mo45821m(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.mo48771c(r6, r4, r5)
            qq8 r3 = r1.f33718a
            m51548Q(r3)
            boolean r3 = r3.mo47259v(r10)
            if (r3 != 0) goto L_0x00a2
            qq8 r3 = r1.f33718a
            m51548Q(r3)
            boolean r3 = r3.mo47260w(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x00a2
        L_0x007a:
            java.lang.String r3 = r2.f23074a
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00e9
            g69 r11 = r43.mo47659c0()
            d69 r12 = r1.f33717A
            r3 = 11
            java.lang.String r2 = r2.f23074a
            r17 = 0
            n68 r4 = r43.mo47648S()
            uk8<java.lang.Boolean> r5 = p000.rl8.f33531x0
            boolean r18 = r4.mo45997v(r14, r5)
            java.lang.String r15 = "_ev"
            r13 = r10
            r14 = r3
            r16 = r2
            r11.mo42838z(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x00a2:
            m78 r2 = r1.f33720c
            m51548Q(r2)
            cs8 r2 = r2.mo45673c0(r10)
            if (r2 == 0) goto L_0x00e9
            long r3 = r2.mo41698l()
            long r5 = r2.mo41694j()
            long r3 = java.lang.Math.max(r3, r5)
            bh0 r5 = r43.mo45256a()
            long r5 = r5.mo29580a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r43.mo47648S()
            uk8<java.lang.Long> r5 = p000.rl8.f33450A
            java.lang.Object r5 = r5.mo48412b(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e9
            bn8 r3 = r43.mo45237A()
            vm8 r3 = r3.mo29677u()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.mo48769a(r4)
            r1.mo47664f(r2)
        L_0x00e9:
            return
        L_0x00ea:
            en8 r2 = p000.en8.m43994a(r44)
            g69 r11 = r43.mo47659c0()
            n68 r12 = r43.mo47648S()
            int r12 = r12.mo45988k(r10)
            r11.mo42829t(r2, r12)
            com.google.android.gms.measurement.internal.zzas r2 = r2.mo42331b()
            bn8 r11 = r43.mo45237A()
            java.lang.String r11 = r11.mo29680y()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x0170
            bn8 r11 = r43.mo45237A()
            vm8 r11 = r11.mo29678v()
            kr8 r12 = r1.f33728k
            mm8 r12 = r12.mo45244H()
            boolean r16 = r12.mo45820l()
            if (r16 != 0) goto L_0x0129
            java.lang.String r12 = r2.toString()
            goto L_0x016b
        L_0x0129:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "origin="
            r13.append(r14)
            java.lang.String r14 = r2.f23076e
            r13.append(r14)
            java.lang.String r14 = ",name="
            r13.append(r14)
            java.lang.String r14 = r2.f23074a
            java.lang.String r14 = r12.mo45821m(r14)
            r13.append(r14)
            java.lang.String r14 = ",params="
            r13.append(r14)
            com.google.android.gms.measurement.internal.zzaq r14 = r2.f23075d
            if (r14 != 0) goto L_0x0151
            r12 = 0
            goto L_0x0164
        L_0x0151:
            boolean r17 = r12.mo45820l()
            if (r17 != 0) goto L_0x015c
            java.lang.String r12 = r14.toString()
            goto L_0x0164
        L_0x015c:
            android.os.Bundle r14 = r14.mo31419w1()
            java.lang.String r12 = r12.mo45824p(r14)
        L_0x0164:
            r13.append(r12)
            java.lang.String r12 = r13.toString()
        L_0x016b:
            java.lang.String r13 = "Logging event"
            r11.mo48770b(r13, r12)
        L_0x0170:
            m78 r11 = r1.f33720c
            m51548Q(r11)
            r11.mo45657M()
            r1.mo47686x(r3)     // Catch:{ all -> 0x0b2c }
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f23074a     // Catch:{ all -> 0x0b2c }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = "refund"
            if (r11 != 0) goto L_0x019c
            java.lang.String r11 = "purchase"
            java.lang.String r13 = r2.f23074a     // Catch:{ all -> 0x0b2c }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0b2c }
            if (r11 != 0) goto L_0x019c
            java.lang.String r11 = r2.f23074a     // Catch:{ all -> 0x0b2c }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0b2c }
            if (r11 == 0) goto L_0x019a
            goto L_0x019c
        L_0x019a:
            r11 = 0
            goto L_0x019d
        L_0x019c:
            r11 = 1
        L_0x019d:
            java.lang.String r13 = "_iap"
            java.lang.String r14 = r2.f23074a     // Catch:{ all -> 0x0b2c }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0b2c }
            if (r13 != 0) goto L_0x01b2
            if (r11 == 0) goto L_0x01ab
            r11 = 1
            goto L_0x01b2
        L_0x01ab:
            r28 = r8
            r30 = r15
        L_0x01af:
            r8 = 2
            goto L_0x0360
        L_0x01b2:
            com.google.android.gms.measurement.internal.zzaq r13 = r2.f23075d     // Catch:{ all -> 0x0b2c }
            java.lang.String r14 = "currency"
            java.lang.String r13 = r13.mo31417u1(r14)     // Catch:{ all -> 0x0b2c }
            java.lang.String r14 = "value"
            if (r11 == 0) goto L_0x0227
            com.google.android.gms.measurement.internal.zzaq r11 = r2.f23075d     // Catch:{ all -> 0x0b2c }
            java.lang.Double r11 = r11.mo31415t1(r14)     // Catch:{ all -> 0x0b2c }
            double r19 = r11.doubleValue()     // Catch:{ all -> 0x0b2c }
            r21 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r19 = r19 * r21
            r23 = 0
            int r11 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r11 != 0) goto L_0x01e5
            com.google.android.gms.measurement.internal.zzaq r11 = r2.f23075d     // Catch:{ all -> 0x0b2c }
            java.lang.Long r11 = r11.mo31414s1(r14)     // Catch:{ all -> 0x0b2c }
            r23 = r15
            long r14 = r11.longValue()     // Catch:{ all -> 0x0b2c }
            double r14 = (double) r14     // Catch:{ all -> 0x0b2c }
            double r19 = r14 * r21
            goto L_0x01e7
        L_0x01e5:
            r23 = r15
        L_0x01e7:
            r14 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r11 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x0201
            r14 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r11 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x0201
            long r14 = java.lang.Math.round(r19)     // Catch:{ all -> 0x0b2c }
            java.lang.String r11 = r2.f23074a     // Catch:{ all -> 0x0b2c }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0b2c }
            if (r11 == 0) goto L_0x0233
            long r14 = -r14
            goto L_0x0233
        L_0x0201:
            bn8 r2 = r43.mo45237A()     // Catch:{ all -> 0x0b2c }
            vm8 r2 = r2.mo29673o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = p000.bn8.m32664w(r10)     // Catch:{ all -> 0x0b2c }
            java.lang.Double r5 = java.lang.Double.valueOf(r19)     // Catch:{ all -> 0x0b2c }
            r2.mo48771c(r3, r4, r5)     // Catch:{ all -> 0x0b2c }
            m78 r2 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r2)     // Catch:{ all -> 0x0b2c }
            r2.mo45658N()     // Catch:{ all -> 0x0b2c }
            m78 r2 = r1.f33720c
            m51548Q(r2)
            r2.mo45659O()
            return
        L_0x0227:
            r23 = r15
            com.google.android.gms.measurement.internal.zzaq r11 = r2.f23075d     // Catch:{ all -> 0x0b2c }
            java.lang.Long r11 = r11.mo31414s1(r14)     // Catch:{ all -> 0x0b2c }
            long r14 = r11.longValue()     // Catch:{ all -> 0x0b2c }
        L_0x0233:
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0b2c }
            if (r11 != 0) goto L_0x035a
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x0b2c }
            java.lang.String r11 = r13.toUpperCase(r11)     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = "[A-Z]{3}"
            boolean r12 = r11.matches(r12)     // Catch:{ all -> 0x0b2c }
            if (r12 == 0) goto L_0x035a
            java.lang.String r12 = "_ltv_"
            int r13 = r11.length()     // Catch:{ all -> 0x0b2c }
            if (r13 == 0) goto L_0x0255
            java.lang.String r11 = r12.concat(r11)     // Catch:{ all -> 0x0b2c }
        L_0x0253:
            r13 = r11
            goto L_0x025b
        L_0x0255:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0b2c }
            r11.<init>(r12)     // Catch:{ all -> 0x0b2c }
            goto L_0x0253
        L_0x025b:
            m78 r11 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r11)     // Catch:{ all -> 0x0b2c }
            a69 r11 = r11.mo45665U(r10, r13)     // Catch:{ all -> 0x0b2c }
            if (r11 == 0) goto L_0x02a1
            java.lang.Object r11 = r11.f20825e     // Catch:{ all -> 0x0b2c }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0b2c }
            if (r12 != 0) goto L_0x026d
            goto L_0x02a1
        L_0x026d:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0b2c }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0b2c }
            a69 r19 = new a69     // Catch:{ all -> 0x0b2c }
            r20 = r13
            java.lang.String r13 = r2.f23076e     // Catch:{ all -> 0x0b2c }
            bh0 r21 = r43.mo45256a()     // Catch:{ all -> 0x0b2c }
            long r21 = r21.mo29580a()     // Catch:{ all -> 0x0b2c }
            long r11 = r11 + r14
            java.lang.Long r24 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b2c }
            r11 = r19
            r12 = r10
            r17 = r20
            r14 = 1
            r15 = 2
            r28 = r8
            r9 = r14
            r8 = 0
            r14 = r17
            r30 = r23
            r15 = r21
            r17 = r24
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b2c }
            r9 = r19
            r8 = 2
            goto L_0x0313
        L_0x02a1:
            r28 = r8
            r17 = r13
            r30 = r23
            r8 = 0
            r9 = 1
            m78 r11 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r11)     // Catch:{ all -> 0x0b2c }
            n68 r12 = r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            uk8<java.lang.Integer> r13 = p000.rl8.f33460F     // Catch:{ all -> 0x0b2c }
            int r12 = r12.mo45994r(r10, r13)     // Catch:{ all -> 0x0b2c }
            int r12 = r12 + -1
            p000.cu4.m43217g(r10)     // Catch:{ all -> 0x0b2c }
            r11.mo29006e()     // Catch:{ all -> 0x0b2c }
            r11.mo47982g()     // Catch:{ all -> 0x0b2c }
            android.database.sqlite.SQLiteDatabase r13 = r11.mo45660P()     // Catch:{ SQLiteException -> 0x02df }
            r9 = 3
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x02df }
            r9[r8] = r10     // Catch:{ SQLiteException -> 0x02df }
            r16 = 1
            r9[r16] = r10     // Catch:{ SQLiteException -> 0x02df }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x02df }
            r8 = 2
            r9[r8] = r12     // Catch:{ SQLiteException -> 0x02dd }
            java.lang.String r12 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r13.execSQL(r12, r9)     // Catch:{ SQLiteException -> 0x02dd }
            goto L_0x02f5
        L_0x02dd:
            r0 = move-exception
            goto L_0x02e1
        L_0x02df:
            r0 = move-exception
            r8 = 2
        L_0x02e1:
            r9 = r0
            kr8 r11 = r11.f34342a     // Catch:{ all -> 0x0b2c }
            bn8 r11 = r11.mo45237A()     // Catch:{ all -> 0x0b2c }
            vm8 r11 = r11.mo29670l()     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r13 = p000.bn8.m32664w(r10)     // Catch:{ all -> 0x0b2c }
            r11.mo48771c(r12, r13, r9)     // Catch:{ all -> 0x0b2c }
        L_0x02f5:
            a69 r19 = new a69     // Catch:{ all -> 0x0b2c }
            java.lang.String r13 = r2.f23076e     // Catch:{ all -> 0x0b2c }
            bh0 r9 = r43.mo45256a()     // Catch:{ all -> 0x0b2c }
            long r20 = r9.mo29580a()     // Catch:{ all -> 0x0b2c }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0b2c }
            r11 = r19
            r12 = r10
            r14 = r17
            r15 = r20
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b2c }
            r9 = r19
        L_0x0313:
            m78 r11 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r11)     // Catch:{ all -> 0x0b2c }
            boolean r11 = r11.mo45664T(r9)     // Catch:{ all -> 0x0b2c }
            if (r11 != 0) goto L_0x0360
            bn8 r11 = r43.mo45237A()     // Catch:{ all -> 0x0b2c }
            vm8 r11 = r11.mo29670l()     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = p000.bn8.m32664w(r10)     // Catch:{ all -> 0x0b2c }
            kr8 r14 = r1.f33728k     // Catch:{ all -> 0x0b2c }
            mm8 r14 = r14.mo45244H()     // Catch:{ all -> 0x0b2c }
            java.lang.String r15 = r9.f20823c     // Catch:{ all -> 0x0b2c }
            java.lang.String r14 = r14.mo45823o(r15)     // Catch:{ all -> 0x0b2c }
            java.lang.Object r9 = r9.f20825e     // Catch:{ all -> 0x0b2c }
            r11.mo48772d(r12, r13, r14, r9)     // Catch:{ all -> 0x0b2c }
            g69 r11 = r43.mo47659c0()     // Catch:{ all -> 0x0b2c }
            d69 r12 = r1.f33717A     // Catch:{ all -> 0x0b2c }
            n68 r9 = r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            uk8<java.lang.Boolean> r13 = p000.rl8.f33531x0     // Catch:{ all -> 0x0b2c }
            r14 = 0
            boolean r18 = r9.mo45997v(r14, r13)     // Catch:{ all -> 0x0b2c }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo42838z(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0b2c }
            goto L_0x0360
        L_0x035a:
            r28 = r8
            r30 = r23
            goto L_0x01af
        L_0x0360:
            java.lang.String r9 = r2.f23074a     // Catch:{ all -> 0x0b2c }
            boolean r9 = p000.g69.m44586j0(r9)     // Catch:{ all -> 0x0b2c }
            java.lang.String r11 = r2.f23074a     // Catch:{ all -> 0x0b2c }
            r12 = r30
            boolean r22 = r12.equals(r11)     // Catch:{ all -> 0x0b2c }
            r43.mo47659c0()     // Catch:{ all -> 0x0b2c }
            com.google.android.gms.measurement.internal.zzaq r11 = r2.f23075d     // Catch:{ all -> 0x0b2c }
            if (r11 != 0) goto L_0x0378
            r16 = 0
            goto L_0x0398
        L_0x0378:
            q88 r12 = new q88     // Catch:{ all -> 0x0b2c }
            r12.<init>(r11)     // Catch:{ all -> 0x0b2c }
            r16 = 0
        L_0x037f:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0b2c }
            if (r13 == 0) goto L_0x0398
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0b2c }
            java.lang.Object r13 = r11.mo31413r1(r13)     // Catch:{ all -> 0x0b2c }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0b2c }
            if (r14 == 0) goto L_0x037f
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0b2c }
            int r13 = r13.length     // Catch:{ all -> 0x0b2c }
            long r13 = (long) r13     // Catch:{ all -> 0x0b2c }
            long r16 = r16 + r13
            goto L_0x037f
        L_0x0398:
            r23 = 1
            long r15 = r16 + r23
            m78 r11 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r11)     // Catch:{ all -> 0x0b2c }
            long r12 = r43.mo47667g0()     // Catch:{ all -> 0x0b2c }
            r17 = 1
            r20 = 0
            r21 = 0
            r14 = r10
            r18 = r9
            r19 = r20
            r20 = r22
            b78 r11 = r11.mo45676f0(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0b2c }
            long r12 = r11.f21164b     // Catch:{ all -> 0x0b2c }
            r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            uk8<java.lang.Integer> r14 = p000.rl8.f33506l     // Catch:{ all -> 0x0b2c }
            r15 = 0
            java.lang.Object r14 = r14.mo48412b(r15)     // Catch:{ all -> 0x0b2c }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0b2c }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0b2c }
            long r14 = (long) r14     // Catch:{ all -> 0x0b2c }
            long r12 = r12 - r14
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r17 = 1000(0x3e8, double:4.94E-321)
            if (r16 <= 0) goto L_0x0400
            long r12 = r12 % r17
            int r2 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x03ef
            bn8 r2 = r43.mo45237A()     // Catch:{ all -> 0x0b2c }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = p000.bn8.m32664w(r10)     // Catch:{ all -> 0x0b2c }
            long r5 = r11.f21164b     // Catch:{ all -> 0x0b2c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b2c }
            r2.mo48771c(r3, r4, r5)     // Catch:{ all -> 0x0b2c }
        L_0x03ef:
            m78 r2 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r2)     // Catch:{ all -> 0x0b2c }
            r2.mo45658N()     // Catch:{ all -> 0x0b2c }
            m78 r2 = r1.f33720c
            m51548Q(r2)
            r2.mo45659O()
            return
        L_0x0400:
            if (r9 == 0) goto L_0x0469
            long r12 = r11.f21163a     // Catch:{ all -> 0x0b2c }
            r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            uk8<java.lang.Integer> r8 = p000.rl8.f33510n     // Catch:{ all -> 0x0b2c }
            r14 = 0
            java.lang.Object r8 = r8.mo48412b(r14)     // Catch:{ all -> 0x0b2c }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0b2c }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0b2c }
            long r14 = (long) r8     // Catch:{ all -> 0x0b2c }
            long r12 = r12 - r14
            r14 = 0
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x0469
            long r12 = r12 % r17
            int r3 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r3 != 0) goto L_0x0439
            bn8 r3 = r43.mo45237A()     // Catch:{ all -> 0x0b2c }
            vm8 r3 = r3.mo29670l()     // Catch:{ all -> 0x0b2c }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = p000.bn8.m32664w(r10)     // Catch:{ all -> 0x0b2c }
            long r6 = r11.f21163a     // Catch:{ all -> 0x0b2c }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0b2c }
            r3.mo48771c(r4, r5, r6)     // Catch:{ all -> 0x0b2c }
        L_0x0439:
            g69 r11 = r43.mo47659c0()     // Catch:{ all -> 0x0b2c }
            d69 r12 = r1.f33717A     // Catch:{ all -> 0x0b2c }
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f23074a     // Catch:{ all -> 0x0b2c }
            n68 r3 = r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            uk8<java.lang.Boolean> r4 = p000.rl8.f33531x0     // Catch:{ all -> 0x0b2c }
            r5 = 0
            boolean r18 = r3.mo45997v(r5, r4)     // Catch:{ all -> 0x0b2c }
            r14 = 16
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo42838z(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0b2c }
            m78 r2 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r2)     // Catch:{ all -> 0x0b2c }
            r2.mo45658N()     // Catch:{ all -> 0x0b2c }
            m78 r2 = r1.f33720c
            m51548Q(r2)
            r2.mo45659O()
            return
        L_0x0469:
            if (r22 == 0) goto L_0x04b9
            long r12 = r11.f21166d     // Catch:{ all -> 0x0b2c }
            n68 r14 = r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            java.lang.String r15 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            uk8<java.lang.Integer> r8 = p000.rl8.f33508m     // Catch:{ all -> 0x0b2c }
            int r8 = r14.mo45994r(r15, r8)     // Catch:{ all -> 0x0b2c }
            r14 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = java.lang.Math.min(r14, r8)     // Catch:{ all -> 0x0b2c }
            r14 = 0
            int r8 = java.lang.Math.max(r14, r8)     // Catch:{ all -> 0x0b2c }
            long r14 = (long) r8     // Catch:{ all -> 0x0b2c }
            long r12 = r12 - r14
            r14 = 0
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x04b9
            int r2 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x04a8
            bn8 r2 = r43.mo45237A()     // Catch:{ all -> 0x0b2c }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = p000.bn8.m32664w(r10)     // Catch:{ all -> 0x0b2c }
            long r5 = r11.f21166d     // Catch:{ all -> 0x0b2c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b2c }
            r2.mo48771c(r3, r4, r5)     // Catch:{ all -> 0x0b2c }
        L_0x04a8:
            m78 r2 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r2)     // Catch:{ all -> 0x0b2c }
            r2.mo45658N()     // Catch:{ all -> 0x0b2c }
            m78 r2 = r1.f33720c
            m51548Q(r2)
            r2.mo45659O()
            return
        L_0x04b9:
            com.google.android.gms.measurement.internal.zzaq r8 = r2.f23075d     // Catch:{ all -> 0x0b2c }
            android.os.Bundle r8 = r8.mo31419w1()     // Catch:{ all -> 0x0b2c }
            g69 r11 = r43.mo47659c0()     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = "_o"
            java.lang.String r13 = r2.f23076e     // Catch:{ all -> 0x0b2c }
            r11.mo42837y(r8, r12, r13)     // Catch:{ all -> 0x0b2c }
            g69 r11 = r43.mo47659c0()     // Catch:{ all -> 0x0b2c }
            boolean r11 = r11.mo42792H(r10)     // Catch:{ all -> 0x0b2c }
            java.lang.String r15 = "_r"
            if (r11 == 0) goto L_0x04ea
            g69 r11 = r43.mo47659c0()     // Catch:{ all -> 0x0b2c }
            java.lang.Long r12 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0b2c }
            java.lang.String r13 = "_dbg"
            r11.mo42837y(r8, r13, r12)     // Catch:{ all -> 0x0b2c }
            g69 r11 = r43.mo47659c0()     // Catch:{ all -> 0x0b2c }
            r11.mo42837y(r8, r15, r12)     // Catch:{ all -> 0x0b2c }
        L_0x04ea:
            java.lang.String r11 = "_s"
            java.lang.String r12 = r2.f23074a     // Catch:{ all -> 0x0b2c }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0b2c }
            if (r11 == 0) goto L_0x0510
            m78 r11 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r11)     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            a69 r11 = r11.mo45665U(r12, r7)     // Catch:{ all -> 0x0b2c }
            if (r11 == 0) goto L_0x0510
            java.lang.Object r12 = r11.f20825e     // Catch:{ all -> 0x0b2c }
            boolean r12 = r12 instanceof java.lang.Long     // Catch:{ all -> 0x0b2c }
            if (r12 == 0) goto L_0x0510
            g69 r12 = r43.mo47659c0()     // Catch:{ all -> 0x0b2c }
            java.lang.Object r11 = r11.f20825e     // Catch:{ all -> 0x0b2c }
            r12.mo42837y(r8, r7, r11)     // Catch:{ all -> 0x0b2c }
        L_0x0510:
            m78 r7 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r7)     // Catch:{ all -> 0x0b2c }
            p000.cu4.m43217g(r10)     // Catch:{ all -> 0x0b2c }
            r7.mo29006e()     // Catch:{ all -> 0x0b2c }
            r7.mo47982g()     // Catch:{ all -> 0x0b2c }
            android.database.sqlite.SQLiteDatabase r11 = r7.mo45660P()     // Catch:{ SQLiteException -> 0x0555 }
            kr8 r12 = r7.f34342a     // Catch:{ SQLiteException -> 0x0555 }
            n68 r12 = r12.mo45274y()     // Catch:{ SQLiteException -> 0x0555 }
            uk8<java.lang.Integer> r13 = p000.rl8.f33516q     // Catch:{ SQLiteException -> 0x0555 }
            int r12 = r12.mo45994r(r10, r13)     // Catch:{ SQLiteException -> 0x0555 }
            r13 = 1000000(0xf4240, float:1.401298E-39)
            int r12 = java.lang.Math.min(r13, r12)     // Catch:{ SQLiteException -> 0x0555 }
            r14 = 0
            int r12 = java.lang.Math.max(r14, r12)     // Catch:{ SQLiteException -> 0x0553 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x0553 }
            r13 = 2
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0553 }
            r13[r14] = r10     // Catch:{ SQLiteException -> 0x0553 }
            r16 = 1
            r13[r16] = r12     // Catch:{ SQLiteException -> 0x0553 }
            java.lang.String r12 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r7 = r11.delete(r6, r12, r13)     // Catch:{ SQLiteException -> 0x0553 }
            long r11 = (long) r7
            r33 = r11
            r16 = 0
            goto L_0x056f
        L_0x0553:
            r0 = move-exception
            goto L_0x0557
        L_0x0555:
            r0 = move-exception
            r14 = 0
        L_0x0557:
            r11 = r0
            kr8 r7 = r7.f34342a     // Catch:{ all -> 0x0b2c }
            bn8 r7 = r7.mo45237A()     // Catch:{ all -> 0x0b2c }
            vm8 r7 = r7.mo29670l()     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = "Error deleting over the limit events. appId"
            java.lang.Object r13 = p000.bn8.m32664w(r10)     // Catch:{ all -> 0x0b2c }
            r7.mo48771c(r12, r13, r11)     // Catch:{ all -> 0x0b2c }
            r16 = 0
            r33 = 0
        L_0x056f:
            int r7 = (r33 > r16 ? 1 : (r33 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x0588
            bn8 r7 = r43.mo45237A()     // Catch:{ all -> 0x0b2c }
            vm8 r7 = r7.mo29673o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r12 = p000.bn8.m32664w(r10)     // Catch:{ all -> 0x0b2c }
            java.lang.Long r13 = java.lang.Long.valueOf(r33)     // Catch:{ all -> 0x0b2c }
            r7.mo48771c(r11, r12, r13)     // Catch:{ all -> 0x0b2c }
        L_0x0588:
            j88 r7 = new j88     // Catch:{ all -> 0x0b2c }
            kr8 r12 = r1.f33728k     // Catch:{ all -> 0x0b2c }
            java.lang.String r13 = r2.f23076e     // Catch:{ all -> 0x0b2c }
            java.lang.String r11 = r2.f23074a     // Catch:{ all -> 0x0b2c }
            r30 = r4
            r31 = r5
            long r4 = r2.f23077g     // Catch:{ all -> 0x0b2c }
            r18 = 0
            r2 = r11
            r11 = r7
            r32 = r14
            r14 = r10
            r33 = r6
            r6 = r15
            r15 = r2
            r16 = r4
            r20 = r8
            r11.<init>((p000.kr8) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0b2c }
            m78 r2 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r2)     // Catch:{ all -> 0x0b2c }
            java.lang.String r4 = r7.f30241b     // Catch:{ all -> 0x0b2c }
            m88 r2 = r2.mo45661Q(r10, r4)     // Catch:{ all -> 0x0b2c }
            if (r2 != 0) goto L_0x0639
            m78 r2 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r2)     // Catch:{ all -> 0x0b2c }
            long r4 = r2.mo45689t(r10)     // Catch:{ all -> 0x0b2c }
            n68 r2 = r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            int r2 = r2.mo45989l(r10)     // Catch:{ all -> 0x0b2c }
            long r11 = (long) r2     // Catch:{ all -> 0x0b2c }
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x061b
            if (r9 == 0) goto L_0x061b
            bn8 r2 = r43.mo45237A()     // Catch:{ all -> 0x0b2c }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = p000.bn8.m32664w(r10)     // Catch:{ all -> 0x0b2c }
            kr8 r5 = r1.f33728k     // Catch:{ all -> 0x0b2c }
            mm8 r5 = r5.mo45244H()     // Catch:{ all -> 0x0b2c }
            java.lang.String r6 = r7.f30241b     // Catch:{ all -> 0x0b2c }
            java.lang.String r5 = r5.mo45821m(r6)     // Catch:{ all -> 0x0b2c }
            n68 r6 = r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            int r6 = r6.mo45989l(r10)     // Catch:{ all -> 0x0b2c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0b2c }
            r2.mo48772d(r3, r4, r5, r6)     // Catch:{ all -> 0x0b2c }
            g69 r11 = r43.mo47659c0()     // Catch:{ all -> 0x0b2c }
            d69 r12 = r1.f33717A     // Catch:{ all -> 0x0b2c }
            n68 r2 = r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            uk8<java.lang.Boolean> r3 = p000.rl8.f33531x0     // Catch:{ all -> 0x0b2c }
            r4 = 0
            boolean r18 = r2.mo45997v(r4, r3)     // Catch:{ all -> 0x0b2c }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo42838z(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0b2c }
            m78 r2 = r1.f33720c
            m51548Q(r2)
            r2.mo45659O()
            return
        L_0x061b:
            m88 r2 = new m88     // Catch:{ all -> 0x0b2c }
            java.lang.String r13 = r7.f30241b     // Catch:{ all -> 0x0b2c }
            long r4 = r7.f30243d     // Catch:{ all -> 0x0b2c }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r4
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0b2c }
            goto L_0x0647
        L_0x0639:
            kr8 r4 = r1.f33728k     // Catch:{ all -> 0x0b2c }
            long r8 = r2.f31543f     // Catch:{ all -> 0x0b2c }
            j88 r7 = r7.mo44063a(r4, r8)     // Catch:{ all -> 0x0b2c }
            long r4 = r7.f30243d     // Catch:{ all -> 0x0b2c }
            m88 r2 = r2.mo45700a(r4)     // Catch:{ all -> 0x0b2c }
        L_0x0647:
            m78 r4 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r4)     // Catch:{ all -> 0x0b2c }
            r4.mo45662R(r2)     // Catch:{ all -> 0x0b2c }
            cr8 r2 = r43.mo45272s()     // Catch:{ all -> 0x0b2c }
            r2.mo29006e()     // Catch:{ all -> 0x0b2c }
            r43.mo47661d0()     // Catch:{ all -> 0x0b2c }
            p000.cu4.m43221k(r7)     // Catch:{ all -> 0x0b2c }
            p000.cu4.m43221k(r45)     // Catch:{ all -> 0x0b2c }
            java.lang.String r2 = r7.f30240a     // Catch:{ all -> 0x0b2c }
            p000.cu4.m43217g(r2)     // Catch:{ all -> 0x0b2c }
            java.lang.String r2 = r7.f30240a     // Catch:{ all -> 0x0b2c }
            java.lang.String r4 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0b2c }
            p000.cu4.m43211a(r2)     // Catch:{ all -> 0x0b2c }
            nr8 r2 = p000.or8.m49408K0()     // Catch:{ all -> 0x0b2c }
            r4 = 1
            r2.mo46180a0(r4)     // Catch:{ all -> 0x0b2c }
            java.lang.String r5 = "android"
            r2.mo46201w(r5)     // Catch:{ all -> 0x0b2c }
            java.lang.String r5 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 != 0) goto L_0x0689
            java.lang.String r5 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            r2.mo46146E(r5)     // Catch:{ all -> 0x0b2c }
        L_0x0689:
            java.lang.String r5 = r3.f23101g     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 != 0) goto L_0x0696
            java.lang.String r5 = r3.f23101g     // Catch:{ all -> 0x0b2c }
            r2.mo46143C(r5)     // Catch:{ all -> 0x0b2c }
        L_0x0696:
            java.lang.String r5 = r3.f23100e     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 != 0) goto L_0x06a3
            java.lang.String r5 = r3.f23100e     // Catch:{ all -> 0x0b2c }
            r2.mo46147F(r5)     // Catch:{ all -> 0x0b2c }
        L_0x06a3:
            long r8 = r3.f23085A     // Catch:{ all -> 0x0b2c }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x06b0
            int r5 = (int) r8     // Catch:{ all -> 0x0b2c }
            r2.mo46182d0(r5)     // Catch:{ all -> 0x0b2c }
        L_0x06b0:
            long r8 = r3.f23102k     // Catch:{ all -> 0x0b2c }
            r2.mo46149G(r8)     // Catch:{ all -> 0x0b2c }
            java.lang.String r5 = r3.f23099d     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 != 0) goto L_0x06c2
            java.lang.String r5 = r3.f23099d     // Catch:{ all -> 0x0b2c }
            r2.mo46176U(r5)     // Catch:{ all -> 0x0b2c }
        L_0x06c2:
            java.lang.String r5 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            java.lang.Object r5 = p000.cu4.m43221k(r5)     // Catch:{ all -> 0x0b2c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0b2c }
            u68 r5 = r1.mo47665f0(r5)     // Catch:{ all -> 0x0b2c }
            java.lang.String r8 = r3.f23097Z     // Catch:{ all -> 0x0b2c }
            u68 r8 = p000.u68.m52648c(r8)     // Catch:{ all -> 0x0b2c }
            u68 r5 = r5.mo48334k(r8)     // Catch:{ all -> 0x0b2c }
            java.lang.String r5 = r5.mo48326d()     // Catch:{ all -> 0x0b2c }
            r2.mo46196r0(r5)     // Catch:{ all -> 0x0b2c }
            p000.le9.m47797a()     // Catch:{ all -> 0x0b2c }
            n68 r5 = r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            java.lang.String r8 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            uk8<java.lang.Boolean> r9 = p000.rl8.f33501i0     // Catch:{ all -> 0x0b2c }
            boolean r5 = r5.mo45997v(r8, r9)     // Catch:{ all -> 0x0b2c }
            if (r5 == 0) goto L_0x0729
            java.lang.String r5 = r2.mo46174T()     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 == 0) goto L_0x0707
            java.lang.String r5 = r3.f23096Y     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 != 0) goto L_0x0707
            java.lang.String r5 = r3.f23096Y     // Catch:{ all -> 0x0b2c }
            r2.mo46195q0(r5)     // Catch:{ all -> 0x0b2c }
        L_0x0707:
            java.lang.String r5 = r2.mo46174T()     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 == 0) goto L_0x0740
            java.lang.String r5 = r2.mo46194p0()     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 == 0) goto L_0x0740
            java.lang.String r5 = r3.f23092P     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 != 0) goto L_0x0740
            java.lang.String r5 = r3.f23092P     // Catch:{ all -> 0x0b2c }
            r2.mo46189k0(r5)     // Catch:{ all -> 0x0b2c }
            goto L_0x0740
        L_0x0729:
            java.lang.String r5 = r2.mo46174T()     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 == 0) goto L_0x0740
            java.lang.String r5 = r3.f23092P     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 != 0) goto L_0x0740
            java.lang.String r5 = r3.f23092P     // Catch:{ all -> 0x0b2c }
            r2.mo46189k0(r5)     // Catch:{ all -> 0x0b2c }
        L_0x0740:
            long r8 = r3.f23103r     // Catch:{ all -> 0x0b2c }
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x074b
            r2.mo46165O(r8)     // Catch:{ all -> 0x0b2c }
        L_0x074b:
            long r8 = r3.f23094U     // Catch:{ all -> 0x0b2c }
            r2.mo46192n0(r8)     // Catch:{ all -> 0x0b2c }
            w59 r5 = r1.f33724g     // Catch:{ all -> 0x0b2c }
            m51548Q(r5)     // Catch:{ all -> 0x0b2c }
            s59 r8 = r5.f33321b     // Catch:{ all -> 0x0b2c }
            kr8 r8 = r8.f33728k     // Catch:{ all -> 0x0b2c }
            android.content.Context r8 = r8.mo45271q()     // Catch:{ all -> 0x0b2c }
            java.util.Map r8 = p000.rl8.m51154a(r8)     // Catch:{ all -> 0x0b2c }
            if (r8 == 0) goto L_0x07e8
            int r9 = r8.size()     // Catch:{ all -> 0x0b2c }
            if (r9 != 0) goto L_0x076b
            goto L_0x07e8
        L_0x076b:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0b2c }
            r14.<init>()     // Catch:{ all -> 0x0b2c }
            uk8<java.lang.Integer> r9 = p000.rl8.f33474Q     // Catch:{ all -> 0x0b2c }
            r12 = 0
            java.lang.Object r9 = r9.mo48412b(r12)     // Catch:{ all -> 0x0b2c }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0b2c }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0b2c }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x0b2c }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0b2c }
        L_0x0785:
            boolean r12 = r8.hasNext()     // Catch:{ all -> 0x0b2c }
            if (r12 == 0) goto L_0x07e2
            java.lang.Object r12 = r8.next()     // Catch:{ all -> 0x0b2c }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x0b2c }
            java.lang.Object r13 = r12.getKey()     // Catch:{ all -> 0x0b2c }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0b2c }
            java.lang.String r15 = "measurement.id."
            boolean r13 = r13.startsWith(r15)     // Catch:{ all -> 0x0b2c }
            if (r13 == 0) goto L_0x0785
            java.lang.Object r12 = r12.getValue()     // Catch:{ NumberFormatException -> 0x07d0 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ NumberFormatException -> 0x07d0 }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x07d0 }
            if (r12 == 0) goto L_0x0785
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x07d0 }
            r14.add(r12)     // Catch:{ NumberFormatException -> 0x07d0 }
            int r12 = r14.size()     // Catch:{ NumberFormatException -> 0x07d0 }
            if (r12 < r9) goto L_0x0785
            kr8 r12 = r5.f34342a     // Catch:{ NumberFormatException -> 0x07d0 }
            bn8 r12 = r12.mo45237A()     // Catch:{ NumberFormatException -> 0x07d0 }
            vm8 r12 = r12.mo29673o()     // Catch:{ NumberFormatException -> 0x07d0 }
            java.lang.String r13 = "Too many experiment IDs. Number of IDs"
            int r15 = r14.size()     // Catch:{ NumberFormatException -> 0x07d0 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ NumberFormatException -> 0x07d0 }
            r12.mo48770b(r13, r15)     // Catch:{ NumberFormatException -> 0x07d0 }
            goto L_0x07e2
        L_0x07d0:
            r0 = move-exception
            r12 = r0
            kr8 r13 = r5.f34342a     // Catch:{ all -> 0x0b2c }
            bn8 r13 = r13.mo45237A()     // Catch:{ all -> 0x0b2c }
            vm8 r13 = r13.mo29673o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r15 = "Experiment ID NumberFormatException"
            r13.mo48770b(r15, r12)     // Catch:{ all -> 0x0b2c }
            goto L_0x0785
        L_0x07e2:
            int r5 = r14.size()     // Catch:{ all -> 0x0b2c }
            if (r5 != 0) goto L_0x07e9
        L_0x07e8:
            r14 = 0
        L_0x07e9:
            if (r14 == 0) goto L_0x07ee
            r2.mo46191m0(r14)     // Catch:{ all -> 0x0b2c }
        L_0x07ee:
            java.lang.String r5 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            java.lang.Object r5 = p000.cu4.m43221k(r5)     // Catch:{ all -> 0x0b2c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0b2c }
            u68 r5 = r1.mo47665f0(r5)     // Catch:{ all -> 0x0b2c }
            java.lang.String r8 = r3.f23097Z     // Catch:{ all -> 0x0b2c }
            u68 r8 = p000.u68.m52648c(r8)     // Catch:{ all -> 0x0b2c }
            u68 r5 = r5.mo48334k(r8)     // Catch:{ all -> 0x0b2c }
            boolean r8 = r5.mo48329f()     // Catch:{ all -> 0x0b2c }
            if (r8 == 0) goto L_0x0834
            i29 r8 = r1.f33726i     // Catch:{ all -> 0x0b2c }
            java.lang.String r9 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            android.util.Pair r8 = r8.mo43451j(r9, r5)     // Catch:{ all -> 0x0b2c }
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x0b2c }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x0b2c }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0b2c }
            if (r9 != 0) goto L_0x0834
            boolean r9 = r3.f23090L     // Catch:{ all -> 0x0b2c }
            if (r9 == 0) goto L_0x0834
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x0b2c }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0b2c }
            r2.mo46153I(r9)     // Catch:{ all -> 0x0b2c }
            java.lang.Object r8 = r8.second     // Catch:{ all -> 0x0b2c }
            if (r8 == 0) goto L_0x0834
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0b2c }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0b2c }
            r2.mo46157K(r8)     // Catch:{ all -> 0x0b2c }
        L_0x0834:
            kr8 r8 = r1.f33728k     // Catch:{ all -> 0x0b2c }
            g88 r8 = r8.mo45255S()     // Catch:{ all -> 0x0b2c }
            r8.mo48801i()     // Catch:{ all -> 0x0b2c }
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ all -> 0x0b2c }
            r2.mo46205y(r8)     // Catch:{ all -> 0x0b2c }
            kr8 r8 = r1.f33728k     // Catch:{ all -> 0x0b2c }
            g88 r8 = r8.mo45255S()     // Catch:{ all -> 0x0b2c }
            r8.mo48801i()     // Catch:{ all -> 0x0b2c }
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0b2c }
            r2.mo46203x(r8)     // Catch:{ all -> 0x0b2c }
            kr8 r8 = r1.f33728k     // Catch:{ all -> 0x0b2c }
            g88 r8 = r8.mo45255S()     // Catch:{ all -> 0x0b2c }
            long r8 = r8.mo42850l()     // Catch:{ all -> 0x0b2c }
            int r8 = (int) r8     // Catch:{ all -> 0x0b2c }
            r2.mo46141B(r8)     // Catch:{ all -> 0x0b2c }
            kr8 r8 = r1.f33728k     // Catch:{ all -> 0x0b2c }
            g88 r8 = r8.mo45255S()     // Catch:{ all -> 0x0b2c }
            java.lang.String r8 = r8.mo42851m()     // Catch:{ all -> 0x0b2c }
            r2.mo46206z(r8)     // Catch:{ all -> 0x0b2c }
            n68 r8 = r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            uk8<java.lang.Boolean> r9 = p000.rl8.f33527v0     // Catch:{ all -> 0x0b2c }
            r12 = 0
            boolean r8 = r8.mo45997v(r12, r9)     // Catch:{ all -> 0x0b2c }
            if (r8 != 0) goto L_0x087d
            long r12 = r3.f23087C     // Catch:{ all -> 0x0b2c }
            r2.mo46185g0(r12)     // Catch:{ all -> 0x0b2c }
        L_0x087d:
            kr8 r8 = r1.f33728k     // Catch:{ all -> 0x0b2c }
            boolean r8 = r8.mo45262h()     // Catch:{ all -> 0x0b2c }
            if (r8 == 0) goto L_0x0892
            r2.mo46145D()     // Catch:{ all -> 0x0b2c }
            r8 = 0
            boolean r12 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b2c }
            if (r12 != 0) goto L_0x0892
            r2.mo46186h0(r8)     // Catch:{ all -> 0x0b2c }
        L_0x0892:
            m78 r8 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r8)     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            cs8 r8 = r8.mo45673c0(r12)     // Catch:{ all -> 0x0b2c }
            if (r8 != 0) goto L_0x090e
            cs8 r8 = new cs8     // Catch:{ all -> 0x0b2c }
            kr8 r12 = r1.f33728k     // Catch:{ all -> 0x0b2c }
            java.lang.String r13 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            r8.<init>(r12, r13)     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = r1.mo47658c(r5)     // Catch:{ all -> 0x0b2c }
            r8.mo41665P(r12)     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = r3.f23086B     // Catch:{ all -> 0x0b2c }
            r8.mo41675Z(r12)     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = r3.f23099d     // Catch:{ all -> 0x0b2c }
            r8.mo41667R(r12)     // Catch:{ all -> 0x0b2c }
            boolean r12 = r5.mo48329f()     // Catch:{ all -> 0x0b2c }
            if (r12 == 0) goto L_0x08ca
            i29 r12 = r1.f33726i     // Catch:{ all -> 0x0b2c }
            java.lang.String r13 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = r12.mo43453l(r13)     // Catch:{ all -> 0x0b2c }
            r8.mo41673X(r12)     // Catch:{ all -> 0x0b2c }
        L_0x08ca:
            r8.mo41690h(r10)     // Catch:{ all -> 0x0b2c }
            r8.mo41679b0(r10)     // Catch:{ all -> 0x0b2c }
            r8.mo41683d0(r10)     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = r3.f23100e     // Catch:{ all -> 0x0b2c }
            r8.mo41687f0(r12)     // Catch:{ all -> 0x0b2c }
            long r12 = r3.f23085A     // Catch:{ all -> 0x0b2c }
            r8.mo41691h0(r12)     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = r3.f23101g     // Catch:{ all -> 0x0b2c }
            r8.mo41695j0(r12)     // Catch:{ all -> 0x0b2c }
            long r12 = r3.f23102k     // Catch:{ all -> 0x0b2c }
            r8.mo41676a(r12)     // Catch:{ all -> 0x0b2c }
            long r12 = r3.f23103r     // Catch:{ all -> 0x0b2c }
            r8.mo41680c(r12)     // Catch:{ all -> 0x0b2c }
            boolean r12 = r3.f23105x     // Catch:{ all -> 0x0b2c }
            r8.mo41688g(r12)     // Catch:{ all -> 0x0b2c }
            n68 r12 = r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            r13 = 0
            boolean r9 = r12.mo45997v(r13, r9)     // Catch:{ all -> 0x0b2c }
            if (r9 != 0) goto L_0x0901
            long r12 = r3.f23087C     // Catch:{ all -> 0x0b2c }
            r8.mo41655F(r12)     // Catch:{ all -> 0x0b2c }
        L_0x0901:
            long r12 = r3.f23094U     // Catch:{ all -> 0x0b2c }
            r8.mo41684e(r12)     // Catch:{ all -> 0x0b2c }
            m78 r9 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r9)     // Catch:{ all -> 0x0b2c }
            r9.mo45674d0(r8)     // Catch:{ all -> 0x0b2c }
        L_0x090e:
            boolean r5 = r5.mo48331h()     // Catch:{ all -> 0x0b2c }
            if (r5 == 0) goto L_0x092b
            java.lang.String r5 = r8.mo41664O()     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 != 0) goto L_0x092b
            java.lang.String r5 = r8.mo41664O()     // Catch:{ all -> 0x0b2c }
            java.lang.Object r5 = p000.cu4.m43221k(r5)     // Catch:{ all -> 0x0b2c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0b2c }
            r2.mo46161M(r5)     // Catch:{ all -> 0x0b2c }
        L_0x092b:
            java.lang.String r5 = r8.mo41674Y()     // Catch:{ all -> 0x0b2c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b2c }
            if (r5 != 0) goto L_0x0942
            java.lang.String r5 = r8.mo41674Y()     // Catch:{ all -> 0x0b2c }
            java.lang.Object r5 = p000.cu4.m43221k(r5)     // Catch:{ all -> 0x0b2c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0b2c }
            r2.mo46181c0(r5)     // Catch:{ all -> 0x0b2c }
        L_0x0942:
            m78 r5 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r5)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r3.f23098a     // Catch:{ all -> 0x0b2c }
            java.util.List r3 = r5.mo45666V(r3)     // Catch:{ all -> 0x0b2c }
            r14 = r32
        L_0x094f:
            int r5 = r3.size()     // Catch:{ all -> 0x0b2c }
            if (r14 >= r5) goto L_0x0985
            gt8 r5 = p000.it8.m45961H()     // Catch:{ all -> 0x0b2c }
            java.lang.Object r8 = r3.get(r14)     // Catch:{ all -> 0x0b2c }
            a69 r8 = (p000.a69) r8     // Catch:{ all -> 0x0b2c }
            java.lang.String r8 = r8.f20823c     // Catch:{ all -> 0x0b2c }
            r5.mo42977x(r8)     // Catch:{ all -> 0x0b2c }
            java.lang.Object r8 = r3.get(r14)     // Catch:{ all -> 0x0b2c }
            a69 r8 = (p000.a69) r8     // Catch:{ all -> 0x0b2c }
            long r8 = r8.f20824d     // Catch:{ all -> 0x0b2c }
            r5.mo42976w(r8)     // Catch:{ all -> 0x0b2c }
            w59 r8 = r1.f33724g     // Catch:{ all -> 0x0b2c }
            m51548Q(r8)     // Catch:{ all -> 0x0b2c }
            java.lang.Object r9 = r3.get(r14)     // Catch:{ all -> 0x0b2c }
            a69 r9 = (p000.a69) r9     // Catch:{ all -> 0x0b2c }
            java.lang.Object r9 = r9.f20825e     // Catch:{ all -> 0x0b2c }
            r8.mo48904u(r5, r9)     // Catch:{ all -> 0x0b2c }
            r2.mo46154I0(r5)     // Catch:{ all -> 0x0b2c }
            int r14 = r14 + 1
            goto L_0x094f
        L_0x0985:
            m78 r3 = r1.f33720c     // Catch:{ IOException -> 0x0ae2 }
            m51548Q(r3)     // Catch:{ IOException -> 0x0ae2 }
            s49 r5 = r2.mo48885o()     // Catch:{ IOException -> 0x0ae2 }
            or8 r5 = (p000.or8) r5     // Catch:{ IOException -> 0x0ae2 }
            r3.mo29006e()     // Catch:{ IOException -> 0x0ae2 }
            r3.mo47982g()     // Catch:{ IOException -> 0x0ae2 }
            p000.cu4.m43221k(r5)     // Catch:{ IOException -> 0x0ae2 }
            java.lang.String r8 = r5.mo46511x()     // Catch:{ IOException -> 0x0ae2 }
            p000.cu4.m43217g(r8)     // Catch:{ IOException -> 0x0ae2 }
            byte[] r8 = r5.mo30879c()     // Catch:{ IOException -> 0x0ae2 }
            s59 r9 = r3.f33321b     // Catch:{ IOException -> 0x0ae2 }
            w59 r9 = r9.f33724g     // Catch:{ IOException -> 0x0ae2 }
            m51548Q(r9)     // Catch:{ IOException -> 0x0ae2 }
            long r12 = r9.mo48900H(r8)     // Catch:{ IOException -> 0x0ae2 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ IOException -> 0x0ae2 }
            r9.<init>()     // Catch:{ IOException -> 0x0ae2 }
            java.lang.String r14 = r5.mo46511x()     // Catch:{ IOException -> 0x0ae2 }
            r15 = r31
            r9.put(r15, r14)     // Catch:{ IOException -> 0x0ae2 }
            java.lang.Long r14 = java.lang.Long.valueOf(r12)     // Catch:{ IOException -> 0x0ae2 }
            r4 = r30
            r9.put(r4, r14)     // Catch:{ IOException -> 0x0ae2 }
            java.lang.String r14 = "metadata"
            r9.put(r14, r8)     // Catch:{ IOException -> 0x0ae2 }
            android.database.sqlite.SQLiteDatabase r8 = r3.mo45660P()     // Catch:{ SQLiteException -> 0x0ac8 }
            java.lang.String r14 = "raw_events_metadata"
            r10 = 4
            r11 = 0
            r8.insertWithOnConflict(r14, r11, r9, r10)     // Catch:{ SQLiteException -> 0x0ac8 }
            m78 r2 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r2)     // Catch:{ all -> 0x0b2c }
            com.google.android.gms.measurement.internal.zzaq r3 = r7.f30245f     // Catch:{ all -> 0x0b2c }
            q88 r5 = new q88     // Catch:{ all -> 0x0b2c }
            r5.<init>(r3)     // Catch:{ all -> 0x0b2c }
        L_0x09e2:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x09f4
            java.lang.String r3 = r5.next()     // Catch:{ all -> 0x0b2c }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x09e2
        L_0x09f2:
            r14 = 1
            goto L_0x0a36
        L_0x09f4:
            qq8 r3 = r1.f33718a     // Catch:{ all -> 0x0b2c }
            m51548Q(r3)     // Catch:{ all -> 0x0b2c }
            java.lang.String r5 = r7.f30240a     // Catch:{ all -> 0x0b2c }
            java.lang.String r6 = r7.f30241b     // Catch:{ all -> 0x0b2c }
            boolean r3 = r3.mo47257t(r5, r6)     // Catch:{ all -> 0x0b2c }
            m78 r5 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r5)     // Catch:{ all -> 0x0b2c }
            long r35 = r43.mo47667g0()     // Catch:{ all -> 0x0b2c }
            java.lang.String r6 = r7.f30240a     // Catch:{ all -> 0x0b2c }
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r34 = r5
            r37 = r6
            b78 r5 = r34.mo45675e0(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0a34
            long r5 = r5.f21167e     // Catch:{ all -> 0x0b2c }
            n68 r3 = r43.mo47648S()     // Catch:{ all -> 0x0b2c }
            java.lang.String r8 = r7.f30240a     // Catch:{ all -> 0x0b2c }
            uk8<java.lang.Integer> r9 = p000.rl8.f33514p     // Catch:{ all -> 0x0b2c }
            int r3 = r3.mo45994r(r8, r9)     // Catch:{ all -> 0x0b2c }
            long r8 = (long) r3     // Catch:{ all -> 0x0b2c }
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0a34
            goto L_0x09f2
        L_0x0a34:
            r14 = r32
        L_0x0a36:
            r2.mo29006e()     // Catch:{ all -> 0x0b2c }
            r2.mo47982g()     // Catch:{ all -> 0x0b2c }
            p000.cu4.m43221k(r7)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r7.f30240a     // Catch:{ all -> 0x0b2c }
            p000.cu4.m43217g(r3)     // Catch:{ all -> 0x0b2c }
            s59 r3 = r2.f33321b     // Catch:{ all -> 0x0b2c }
            w59 r3 = r3.f33724g     // Catch:{ all -> 0x0b2c }
            m51548Q(r3)     // Catch:{ all -> 0x0b2c }
            wq8 r3 = r3.mo48906w(r7)     // Catch:{ all -> 0x0b2c }
            byte[] r3 = r3.mo30879c()     // Catch:{ all -> 0x0b2c }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0b2c }
            r5.<init>()     // Catch:{ all -> 0x0b2c }
            java.lang.String r6 = r7.f30240a     // Catch:{ all -> 0x0b2c }
            r5.put(r15, r6)     // Catch:{ all -> 0x0b2c }
            java.lang.String r6 = "name"
            java.lang.String r8 = r7.f30241b     // Catch:{ all -> 0x0b2c }
            r5.put(r6, r8)     // Catch:{ all -> 0x0b2c }
            java.lang.String r6 = "timestamp"
            long r8 = r7.f30243d     // Catch:{ all -> 0x0b2c }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0b2c }
            r5.put(r6, r8)     // Catch:{ all -> 0x0b2c }
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0b2c }
            r5.put(r4, r6)     // Catch:{ all -> 0x0b2c }
            java.lang.String r4 = "data"
            r5.put(r4, r3)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "realtime"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0b2c }
            r5.put(r3, r4)     // Catch:{ all -> 0x0b2c }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo45660P()     // Catch:{ SQLiteException -> 0x0ab0 }
            r4 = r33
            r6 = 0
            long r3 = r3.insert(r4, r6, r5)     // Catch:{ SQLiteException -> 0x0ab0 }
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0aab
            kr8 r3 = r2.f34342a     // Catch:{ SQLiteException -> 0x0ab0 }
            bn8 r3 = r3.mo45237A()     // Catch:{ SQLiteException -> 0x0ab0 }
            vm8 r3 = r3.mo29670l()     // Catch:{ SQLiteException -> 0x0ab0 }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r5 = r7.f30240a     // Catch:{ SQLiteException -> 0x0ab0 }
            java.lang.Object r5 = p000.bn8.m32664w(r5)     // Catch:{ SQLiteException -> 0x0ab0 }
            r3.mo48770b(r4, r5)     // Catch:{ SQLiteException -> 0x0ab0 }
            goto L_0x0af9
        L_0x0aab:
            r3 = 0
            r1.f33731n = r3     // Catch:{ all -> 0x0b2c }
            goto L_0x0af9
        L_0x0ab0:
            r0 = move-exception
            r3 = r0
            kr8 r2 = r2.f34342a     // Catch:{ all -> 0x0b2c }
            bn8 r2 = r2.mo45237A()     // Catch:{ all -> 0x0b2c }
            vm8 r2 = r2.mo29670l()     // Catch:{ all -> 0x0b2c }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r7.f30240a     // Catch:{ all -> 0x0b2c }
            java.lang.Object r5 = p000.bn8.m32664w(r5)     // Catch:{ all -> 0x0b2c }
            r2.mo48771c(r4, r5, r3)     // Catch:{ all -> 0x0b2c }
            goto L_0x0af9
        L_0x0ac8:
            r0 = move-exception
            r4 = r0
            kr8 r3 = r3.f34342a     // Catch:{ IOException -> 0x0ae2 }
            bn8 r3 = r3.mo45237A()     // Catch:{ IOException -> 0x0ae2 }
            vm8 r3 = r3.mo29670l()     // Catch:{ IOException -> 0x0ae2 }
            java.lang.String r6 = "Error storing raw event metadata. appId"
            java.lang.String r5 = r5.mo46511x()     // Catch:{ IOException -> 0x0ae2 }
            java.lang.Object r5 = p000.bn8.m32664w(r5)     // Catch:{ IOException -> 0x0ae2 }
            r3.mo48771c(r6, r5, r4)     // Catch:{ IOException -> 0x0ae2 }
            throw r4     // Catch:{ IOException -> 0x0ae2 }
        L_0x0ae2:
            r0 = move-exception
            r3 = r0
            bn8 r4 = r43.mo45237A()     // Catch:{ all -> 0x0b2c }
            vm8 r4 = r4.mo29670l()     // Catch:{ all -> 0x0b2c }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo46145D()     // Catch:{ all -> 0x0b2c }
            java.lang.Object r2 = p000.bn8.m32664w(r2)     // Catch:{ all -> 0x0b2c }
            r4.mo48771c(r5, r2, r3)     // Catch:{ all -> 0x0b2c }
        L_0x0af9:
            m78 r2 = r1.f33720c     // Catch:{ all -> 0x0b2c }
            m51548Q(r2)     // Catch:{ all -> 0x0b2c }
            r2.mo45658N()     // Catch:{ all -> 0x0b2c }
            m78 r2 = r1.f33720c
            m51548Q(r2)
            r2.mo45659O()
            r43.mo47642L()
            bn8 r2 = r43.mo45237A()
            vm8 r2 = r2.mo29678v()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo48770b(r4, r3)
            return
        L_0x0b2c:
            r0 = move-exception
            r2 = r0
            m78 r3 = r1.f33720c
            m51548Q(r3)
            r3.mo45659O()
            throw r2
        L_0x0b37:
            r1.mo47686x(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s59.mo47675k0(com.google.android.gms.measurement.internal.zzas, com.google.android.gms.measurement.internal.zzp):void");
    }

    /* renamed from: l */
    public final void mo47676l(zzkq zzkq, zzp zzp) {
        long j;
        int i;
        zzkq zzkq2 = zzkq;
        zzp zzp2 = zzp;
        mo45272s().mo29006e();
        mo47661d0();
        if (mo47646P(zzp2)) {
            if (!zzp2.f23105x) {
                mo47686x(zzp2);
                return;
            }
            int q0 = mo47659c0().mo42825q0(zzkq2.f23079d);
            int i2 = 0;
            if (q0 != 0) {
                g69 c0 = mo47659c0();
                String str = zzkq2.f23079d;
                mo47648S();
                String n = c0.mo42819n(str, 24, true);
                String str2 = zzkq2.f23079d;
                if (str2 != null) {
                    i = str2.length();
                } else {
                    i = 0;
                }
                mo47659c0().mo42838z(this.f33717A, zzp2.f23098a, q0, "_ev", n, i, mo47648S().mo45997v((String) null, rl8.f33531x0));
                return;
            }
            int w = mo47659c0().mo42835w(zzkq2.f23079d, zzkq.mo31423r1());
            if (w != 0) {
                g69 c02 = mo47659c0();
                String str3 = zzkq2.f23079d;
                mo47648S();
                String n2 = c02.mo42819n(str3, 24, true);
                Object r1 = zzkq.mo31423r1();
                if (r1 != null && ((r1 instanceof String) || (r1 instanceof CharSequence))) {
                    i2 = String.valueOf(r1).length();
                }
                mo47659c0().mo42838z(this.f33717A, zzp2.f23098a, w, "_ev", n2, i2, mo47648S().mo45997v((String) null, rl8.f33531x0));
                return;
            }
            Object x = mo47659c0().mo42836x(zzkq2.f23079d, zzkq.mo31423r1());
            if (x != null) {
                if ("_sid".equals(zzkq2.f23079d)) {
                    long j2 = zzkq2.f23080e;
                    String str4 = zzkq2.f23083r;
                    String str5 = (String) cu4.m43221k(zzp2.f23098a);
                    m78 m78 = this.f33720c;
                    m51548Q(m78);
                    a69 U = m78.mo45665U(str5, "_sno");
                    if (U != null) {
                        Object obj = U.f20825e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo47676l(new zzkq("_sno", j2, Long.valueOf(j + 1), str4), zzp2);
                        }
                    }
                    if (U != null) {
                        mo45237A().mo29673o().mo48770b("Retrieved last session number from database does not contain a valid (long) value", U.f20825e);
                    }
                    m78 m782 = this.f33720c;
                    m51548Q(m782);
                    m88 Q = m782.mo45661Q(str5, "_s");
                    if (Q != null) {
                        j = Q.f31540c;
                        mo45237A().mo29678v().mo48770b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo47676l(new zzkq("_sno", j2, Long.valueOf(j + 1), str4), zzp2);
                }
                a69 a69 = new a69((String) cu4.m43221k(zzp2.f23098a), (String) cu4.m43221k(zzkq2.f23083r), zzkq2.f23079d, zzkq2.f23080e, x);
                mo45237A().mo29678v().mo48771c("Setting user property", this.f33728k.mo45244H().mo45823o(a69.f20823c), x);
                m78 m783 = this.f33720c;
                m51548Q(m783);
                m783.mo45657M();
                try {
                    mo47686x(zzp2);
                    m78 m784 = this.f33720c;
                    m51548Q(m784);
                    boolean T = m784.mo45664T(a69);
                    m78 m785 = this.f33720c;
                    m51548Q(m785);
                    m785.mo45658N();
                    if (!T) {
                        mo45237A().mo29670l().mo48771c("Too many unique user properties are set. Ignoring user property", this.f33728k.mo45244H().mo45823o(a69.f20823c), a69.f20825e);
                        mo47659c0().mo42838z(this.f33717A, zzp2.f23098a, 9, (String) null, (String) null, 0, mo47648S().mo45997v((String) null, rl8.f33531x0));
                    }
                } finally {
                    m78 m786 = this.f33720c;
                    m51548Q(m786);
                    m786.mo45659O();
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo47677m(zzkq zzkq, zzp zzp) {
        long j;
        mo45272s().mo29006e();
        mo47661d0();
        if (mo47646P(zzp)) {
            if (!zzp.f23105x) {
                mo47686x(zzp);
            } else if (!"_npa".equals(zzkq.f23079d) || zzp.f23093Q == null) {
                mo45237A().mo29677u().mo48770b("Removing user property", this.f33728k.mo45244H().mo45823o(zzkq.f23079d));
                m78 m78 = this.f33720c;
                m51548Q(m78);
                m78.mo45657M();
                try {
                    mo47686x(zzp);
                    m78 m782 = this.f33720c;
                    m51548Q(m782);
                    m782.mo45663S((String) cu4.m43221k(zzp.f23098a), zzkq.f23079d);
                    m78 m783 = this.f33720c;
                    m51548Q(m783);
                    m783.mo45658N();
                    mo45237A().mo29677u().mo48770b("User property removed", this.f33728k.mo45244H().mo45823o(zzkq.f23079d));
                } finally {
                    m78 m784 = this.f33720c;
                    m51548Q(m784);
                    m784.mo45659O();
                }
            } else {
                mo45237A().mo29677u().mo48769a("Falling back to manifest metadata value for ad personalization");
                long a = mo45256a().mo29580a();
                if (true != zzp.f23093Q.booleanValue()) {
                    j = 0;
                } else {
                    j = 1;
                }
                mo47676l(new zzkq("_npa", a, Long.valueOf(j), "auto"), zzp);
            }
        }
    }

    /* renamed from: n */
    public final void mo47678n() {
        this.f33733p++;
    }

    /* renamed from: o */
    public final void mo47679o() {
        this.f33734q++;
    }

    /* renamed from: p */
    public final kr8 mo47680p() {
        return this.f33728k;
    }

    /* renamed from: q */
    public final Context mo45271q() {
        return this.f33728k.mo45271q();
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x03d3 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059f }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03ff A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059f }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0416 A[SYNTHETIC, Splitter:B:129:0x0416] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04bc A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059f }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04da A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059f }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0571 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059f }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b8 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059f }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e3 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059f }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021b A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059f }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x023a A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059f }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0241 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059f }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0250 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059f }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0260 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x059f }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47681r(com.google.android.gms.measurement.internal.zzp r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            cr8 r8 = r24.mo45272s()
            r8.mo29006e()
            r24.mo47661d0()
            p000.cu4.m43221k(r25)
            java.lang.String r8 = r2.f23098a
            p000.cu4.m43217g(r8)
            boolean r8 = r24.mo47646P(r25)
            if (r8 == 0) goto L_0x05a9
            m78 r8 = r1.f33720c
            m51548Q(r8)
            java.lang.String r9 = r2.f23098a
            cs8 r8 = r8.mo45673c0(r9)
            r9 = 0
            if (r8 == 0) goto L_0x005e
            java.lang.String r11 = r8.mo41666Q()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r2.f23099d
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x005e
            r8.mo41696k(r9)
            m78 r11 = r1.f33720c
            m51548Q(r11)
            r11.mo45674d0(r8)
            qq8 r8 = r1.f33718a
            m51548Q(r8)
            java.lang.String r11 = r2.f23098a
            r8.mo47252m(r11)
        L_0x005e:
            boolean r8 = r2.f23105x
            if (r8 != 0) goto L_0x0066
            r24.mo47686x(r25)
            return
        L_0x0066:
            long r11 = r2.f23088H
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0074
            bh0 r8 = r24.mo45256a()
            long r11 = r8.mo29580a()
        L_0x0074:
            kr8 r8 = r1.f33728k
            g88 r8 = r8.mo45255S()
            r8.mo42853o()
            int r8 = r2.f23089I
            r15 = 1
            if (r8 == 0) goto L_0x009c
            if (r8 == r15) goto L_0x009c
            bn8 r13 = r24.mo45237A()
            vm8 r13 = r13.mo29673o()
            java.lang.String r14 = r2.f23098a
            java.lang.Object r14 = p000.bn8.m32664w(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.mo48771c(r9, r14, r8)
            r8 = 0
        L_0x009c:
            m78 r9 = r1.f33720c
            m51548Q(r9)
            r9.mo45657M()
            m78 r9 = r1.f33720c     // Catch:{ all -> 0x059f }
            m51548Q(r9)     // Catch:{ all -> 0x059f }
            java.lang.String r10 = r2.f23098a     // Catch:{ all -> 0x059f }
            java.lang.String r13 = "_npa"
            a69 r9 = r9.mo45665U(r10, r13)     // Catch:{ all -> 0x059f }
            if (r9 == 0) goto L_0x00c4
            java.lang.String r10 = "auto"
            java.lang.String r13 = r9.f20822b     // Catch:{ all -> 0x059f }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x059f }
            if (r10 == 0) goto L_0x00be
            goto L_0x00c4
        L_0x00be:
            r21 = r3
            r22 = r4
            r4 = r15
            goto L_0x0118
        L_0x00c4:
            java.lang.Boolean r10 = r2.f23093Q     // Catch:{ all -> 0x059f }
            if (r10 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.zzkq r14 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x059f }
            java.lang.String r19 = "_npa"
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x059f }
            if (r15 == r10) goto L_0x00d5
            r20 = 0
            goto L_0x00d7
        L_0x00d5:
            r20 = 1
        L_0x00d7:
            java.lang.Long r10 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x059f }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 1
            r13 = r14
            r3 = r14
            r4 = 0
            r14 = r19
            r4 = r15
            r15 = r11
            r17 = r10
            r18 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x059f }
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r9.f20825e     // Catch:{ all -> 0x059f }
            java.lang.Long r10 = r3.f23081g     // Catch:{ all -> 0x059f }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x059f }
            if (r9 != 0) goto L_0x0118
        L_0x00fd:
            r1.mo47676l(r3, r2)     // Catch:{ all -> 0x059f }
            goto L_0x0118
        L_0x0101:
            r21 = r3
            r22 = r4
            r4 = r15
            if (r9 == 0) goto L_0x0118
            com.google.android.gms.measurement.internal.zzkq r3 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x059f }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r3
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x059f }
            r1.mo47677m(r3, r2)     // Catch:{ all -> 0x059f }
        L_0x0118:
            m78 r3 = r1.f33720c     // Catch:{ all -> 0x059f }
            m51548Q(r3)     // Catch:{ all -> 0x059f }
            java.lang.String r9 = r2.f23098a     // Catch:{ all -> 0x059f }
            java.lang.Object r9 = p000.cu4.m43221k(r9)     // Catch:{ all -> 0x059f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x059f }
            cs8 r3 = r3.mo45673c0(r9)     // Catch:{ all -> 0x059f }
            if (r3 == 0) goto L_0x01e1
            g69 r10 = r24.mo47659c0()     // Catch:{ all -> 0x059f }
            java.lang.String r13 = r2.f23099d     // Catch:{ all -> 0x059f }
            java.lang.String r14 = r3.mo41666Q()     // Catch:{ all -> 0x059f }
            java.lang.String r15 = r2.f23092P     // Catch:{ all -> 0x059f }
            java.lang.String r9 = r3.mo41668S()     // Catch:{ all -> 0x059f }
            boolean r9 = r10.mo42817m(r13, r14, r15, r9)     // Catch:{ all -> 0x059f }
            if (r9 == 0) goto L_0x01e1
            bn8 r9 = r24.mo45237A()     // Catch:{ all -> 0x059f }
            vm8 r9 = r9.mo29673o()     // Catch:{ all -> 0x059f }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r3.mo41663N()     // Catch:{ all -> 0x059f }
            java.lang.Object r13 = p000.bn8.m32664w(r13)     // Catch:{ all -> 0x059f }
            r9.mo48770b(r10, r13)     // Catch:{ all -> 0x059f }
            m78 r9 = r1.f33720c     // Catch:{ all -> 0x059f }
            m51548Q(r9)     // Catch:{ all -> 0x059f }
            java.lang.String r3 = r3.mo41663N()     // Catch:{ all -> 0x059f }
            r9.mo47982g()     // Catch:{ all -> 0x059f }
            r9.mo29006e()     // Catch:{ all -> 0x059f }
            p000.cu4.m43217g(r3)     // Catch:{ all -> 0x059f }
            android.database.sqlite.SQLiteDatabase r10 = r9.mo45660P()     // Catch:{ SQLiteException -> 0x01cc }
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01cc }
            r14 = 0
            r13[r14] = r3     // Catch:{ SQLiteException -> 0x01cc }
            java.lang.String r14 = "events"
            int r14 = r10.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01e0
            kr8 r0 = r9.f34342a     // Catch:{ SQLiteException -> 0x01cc }
            bn8 r0 = r0.mo45237A()     // Catch:{ SQLiteException -> 0x01cc }
            vm8 r0 = r0.mo29678v()     // Catch:{ SQLiteException -> 0x01cc }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01cc }
            r0.mo48771c(r10, r3, r13)     // Catch:{ SQLiteException -> 0x01cc }
            goto L_0x01e0
        L_0x01cc:
            r0 = move-exception
            kr8 r9 = r9.f34342a     // Catch:{ all -> 0x059f }
            bn8 r9 = r9.mo45237A()     // Catch:{ all -> 0x059f }
            vm8 r9 = r9.mo29670l()     // Catch:{ all -> 0x059f }
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r3 = p000.bn8.m32664w(r3)     // Catch:{ all -> 0x059f }
            r9.mo48771c(r10, r3, r0)     // Catch:{ all -> 0x059f }
        L_0x01e0:
            r3 = 0
        L_0x01e1:
            if (r3 == 0) goto L_0x023a
            long r9 = r3.mo41689g0()     // Catch:{ all -> 0x059f }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01fc
            long r9 = r3.mo41689g0()     // Catch:{ all -> 0x059f }
            r23 = r5
            long r4 = r2.f23085A     // Catch:{ all -> 0x059f }
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01fe
            r15 = 1
            goto L_0x01ff
        L_0x01fc:
            r23 = r5
        L_0x01fe:
            r15 = 0
        L_0x01ff:
            java.lang.String r0 = r3.mo41685e0()     // Catch:{ all -> 0x059f }
            long r3 = r3.mo41689g0()     // Catch:{ all -> 0x059f }
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0217
            if (r0 == 0) goto L_0x0217
            java.lang.String r3 = r2.f23100e     // Catch:{ all -> 0x059f }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x059f }
            if (r3 != 0) goto L_0x0217
            r3 = 1
            goto L_0x0218
        L_0x0217:
            r3 = 0
        L_0x0218:
            r3 = r3 | r15
            if (r3 == 0) goto L_0x023c
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x059f }
            r3.<init>()     // Catch:{ all -> 0x059f }
            java.lang.String r4 = "_pv"
            r3.putString(r4, r0)     // Catch:{ all -> 0x059f }
            com.google.android.gms.measurement.internal.zzas r0 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x059f }
            com.google.android.gms.measurement.internal.zzaq r15 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x059f }
            r15.<init>(r3)     // Catch:{ all -> 0x059f }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x059f }
            r1.mo47673j0(r0, r2)     // Catch:{ all -> 0x059f }
            goto L_0x023c
        L_0x023a:
            r23 = r5
        L_0x023c:
            r24.mo47686x(r25)     // Catch:{ all -> 0x059f }
            if (r8 != 0) goto L_0x0250
            m78 r0 = r1.f33720c     // Catch:{ all -> 0x059f }
            m51548Q(r0)     // Catch:{ all -> 0x059f }
            java.lang.String r3 = r2.f23098a     // Catch:{ all -> 0x059f }
            java.lang.String r4 = "_f"
            m88 r0 = r0.mo45661Q(r3, r4)     // Catch:{ all -> 0x059f }
            r15 = 0
            goto L_0x025e
        L_0x0250:
            m78 r0 = r1.f33720c     // Catch:{ all -> 0x059f }
            m51548Q(r0)     // Catch:{ all -> 0x059f }
            java.lang.String r3 = r2.f23098a     // Catch:{ all -> 0x059f }
            java.lang.String r4 = "_v"
            m88 r0 = r0.mo45661Q(r3, r4)     // Catch:{ all -> 0x059f }
            r15 = 1
        L_0x025e:
            if (r0 != 0) goto L_0x0571
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r11 / r3
            r13 = 1
            long r8 = r8 + r13
            long r8 = r8 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_r"
            java.lang.String r5 = "_c"
            java.lang.String r10 = "_et"
            if (r15 != 0) goto L_0x04f4
            com.google.android.gms.measurement.internal.zzkq r0 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x059f }
            java.lang.String r14 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x059f }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x059f }
            r1.mo47676l(r0, r2)     // Catch:{ all -> 0x059f }
            cr8 r0 = r24.mo45272s()     // Catch:{ all -> 0x059f }
            r0.mo29006e()     // Catch:{ all -> 0x059f }
            kr8 r0 = r1.f33728k     // Catch:{ all -> 0x059f }
            wp8 r0 = r0.mo45240D()     // Catch:{ all -> 0x059f }
            java.lang.Object r0 = p000.cu4.m43221k(r0)     // Catch:{ all -> 0x059f }
            r8 = r0
            wp8 r8 = (p000.wp8) r8     // Catch:{ all -> 0x059f }
            java.lang.String r0 = r2.f23098a     // Catch:{ all -> 0x059f }
            if (r0 == 0) goto L_0x0392
            boolean r9 = r0.isEmpty()     // Catch:{ all -> 0x059f }
            if (r9 == 0) goto L_0x02a5
            goto L_0x0392
        L_0x02a5:
            kr8 r9 = r8.f35408a     // Catch:{ all -> 0x059f }
            cr8 r9 = r9.mo45272s()     // Catch:{ all -> 0x059f }
            r9.mo29006e()     // Catch:{ all -> 0x059f }
            boolean r9 = r8.mo49246a()     // Catch:{ all -> 0x059f }
            if (r9 != 0) goto L_0x02c5
            kr8 r0 = r8.f35408a     // Catch:{ all -> 0x059f }
            bn8 r0 = r0.mo45237A()     // Catch:{ all -> 0x059f }
            vm8 r0 = r0.mo29676t()     // Catch:{ all -> 0x059f }
            java.lang.String r8 = "Install Referrer Reporter is not available"
            r0.mo48769a(r8)     // Catch:{ all -> 0x059f }
            goto L_0x03a1
        L_0x02c5:
            tp8 r9 = new tp8     // Catch:{ all -> 0x059f }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x059f }
            kr8 r0 = r8.f35408a     // Catch:{ all -> 0x059f }
            cr8 r0 = r0.mo45272s()     // Catch:{ all -> 0x059f }
            r0.mo29006e()     // Catch:{ all -> 0x059f }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x059f }
            java.lang.String r13 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r13)     // Catch:{ all -> 0x059f }
            android.content.ComponentName r13 = new android.content.ComponentName     // Catch:{ all -> 0x059f }
            java.lang.String r14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15 = r23
            r13.<init>(r15, r14)     // Catch:{ all -> 0x059f }
            r0.setComponent(r13)     // Catch:{ all -> 0x059f }
            kr8 r13 = r8.f35408a     // Catch:{ all -> 0x059f }
            android.content.Context r13 = r13.mo45271q()     // Catch:{ all -> 0x059f }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x059f }
            if (r13 != 0) goto L_0x0303
            kr8 r0 = r8.f35408a     // Catch:{ all -> 0x059f }
            bn8 r0 = r0.mo45237A()     // Catch:{ all -> 0x059f }
            vm8 r0 = r0.mo29674p()     // Catch:{ all -> 0x059f }
            java.lang.String r8 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.mo48769a(r8)     // Catch:{ all -> 0x059f }
            goto L_0x03a1
        L_0x0303:
            r14 = 0
            java.util.List r13 = r13.queryIntentServices(r0, r14)     // Catch:{ all -> 0x059f }
            if (r13 == 0) goto L_0x0382
            boolean r16 = r13.isEmpty()     // Catch:{ all -> 0x059f }
            if (r16 != 0) goto L_0x0382
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x059f }
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13     // Catch:{ all -> 0x059f }
            android.content.pm.ServiceInfo r13 = r13.serviceInfo     // Catch:{ all -> 0x059f }
            if (r13 == 0) goto L_0x03a1
            java.lang.String r14 = r13.packageName     // Catch:{ all -> 0x059f }
            java.lang.String r13 = r13.name     // Catch:{ all -> 0x059f }
            if (r13 == 0) goto L_0x0372
            boolean r13 = r15.equals(r14)     // Catch:{ all -> 0x059f }
            if (r13 == 0) goto L_0x0372
            boolean r13 = r8.mo49246a()     // Catch:{ all -> 0x059f }
            if (r13 == 0) goto L_0x0372
            android.content.Intent r13 = new android.content.Intent     // Catch:{ all -> 0x059f }
            r13.<init>(r0)     // Catch:{ all -> 0x059f }
            rp0 r0 = p000.rp0.m51209b()     // Catch:{ RuntimeException -> 0x035d }
            kr8 r14 = r8.f35408a     // Catch:{ RuntimeException -> 0x035d }
            android.content.Context r14 = r14.mo45271q()     // Catch:{ RuntimeException -> 0x035d }
            r15 = 1
            boolean r0 = r0.mo47466a(r14, r13, r9, r15)     // Catch:{ RuntimeException -> 0x035d }
            kr8 r9 = r8.f35408a     // Catch:{ RuntimeException -> 0x035d }
            bn8 r9 = r9.mo45237A()     // Catch:{ RuntimeException -> 0x035d }
            vm8 r9 = r9.mo29678v()     // Catch:{ RuntimeException -> 0x035d }
            java.lang.String r13 = "Install Referrer Service is"
            java.lang.String r14 = "available"
            java.lang.String r15 = "not available"
            r16 = r14
            r14 = 1
            if (r14 == r0) goto L_0x0357
            r14 = r15
            goto L_0x0359
        L_0x0357:
            r14 = r16
        L_0x0359:
            r9.mo48770b(r13, r14)     // Catch:{ RuntimeException -> 0x035d }
            goto L_0x03a1
        L_0x035d:
            r0 = move-exception
            kr8 r8 = r8.f35408a     // Catch:{ all -> 0x059f }
            bn8 r8 = r8.mo45237A()     // Catch:{ all -> 0x059f }
            vm8 r8 = r8.mo29670l()     // Catch:{ all -> 0x059f }
            java.lang.String r9 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x059f }
            r8.mo48770b(r9, r0)     // Catch:{ all -> 0x059f }
            goto L_0x03a1
        L_0x0372:
            kr8 r0 = r8.f35408a     // Catch:{ all -> 0x059f }
            bn8 r0 = r0.mo45237A()     // Catch:{ all -> 0x059f }
            vm8 r0 = r0.mo29673o()     // Catch:{ all -> 0x059f }
            java.lang.String r8 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.mo48769a(r8)     // Catch:{ all -> 0x059f }
            goto L_0x03a1
        L_0x0382:
            kr8 r0 = r8.f35408a     // Catch:{ all -> 0x059f }
            bn8 r0 = r0.mo45237A()     // Catch:{ all -> 0x059f }
            vm8 r0 = r0.mo29676t()     // Catch:{ all -> 0x059f }
            java.lang.String r8 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.mo48769a(r8)     // Catch:{ all -> 0x059f }
            goto L_0x03a1
        L_0x0392:
            kr8 r0 = r8.f35408a     // Catch:{ all -> 0x059f }
            bn8 r0 = r0.mo45237A()     // Catch:{ all -> 0x059f }
            vm8 r0 = r0.mo29674p()     // Catch:{ all -> 0x059f }
            java.lang.String r8 = "Install Referrer Reporter was called with invalid app package name"
            r0.mo48769a(r8)     // Catch:{ all -> 0x059f }
        L_0x03a1:
            cr8 r0 = r24.mo45272s()     // Catch:{ all -> 0x059f }
            r0.mo29006e()     // Catch:{ all -> 0x059f }
            r24.mo47661d0()     // Catch:{ all -> 0x059f }
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x059f }
            r8.<init>()     // Catch:{ all -> 0x059f }
            r13 = 1
            r8.putLong(r5, r13)     // Catch:{ all -> 0x059f }
            r8.putLong(r4, r13)     // Catch:{ all -> 0x059f }
            r4 = 0
            r8.putLong(r7, r4)     // Catch:{ all -> 0x059f }
            r8.putLong(r6, r4)     // Catch:{ all -> 0x059f }
            r9 = r22
            r8.putLong(r9, r4)     // Catch:{ all -> 0x059f }
            r15 = r21
            r8.putLong(r15, r4)     // Catch:{ all -> 0x059f }
            r4 = 1
            r8.putLong(r10, r4)     // Catch:{ all -> 0x059f }
            boolean r0 = r2.f23091M     // Catch:{ all -> 0x059f }
            if (r0 == 0) goto L_0x03d6
            r8.putLong(r3, r4)     // Catch:{ all -> 0x059f }
        L_0x03d6:
            java.lang.String r0 = r2.f23098a     // Catch:{ all -> 0x059f }
            java.lang.Object r0 = p000.cu4.m43221k(r0)     // Catch:{ all -> 0x059f }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x059f }
            m78 r0 = r1.f33720c     // Catch:{ all -> 0x059f }
            m51548Q(r0)     // Catch:{ all -> 0x059f }
            p000.cu4.m43217g(r3)     // Catch:{ all -> 0x059f }
            r0.mo29006e()     // Catch:{ all -> 0x059f }
            r0.mo47982g()     // Catch:{ all -> 0x059f }
            java.lang.String r4 = "first_open_count"
            long r4 = r0.mo45685n(r3, r4)     // Catch:{ all -> 0x059f }
            kr8 r0 = r1.f33728k     // Catch:{ all -> 0x059f }
            android.content.Context r0 = r0.mo45271q()     // Catch:{ all -> 0x059f }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x059f }
            if (r0 != 0) goto L_0x0416
            bn8 r0 = r24.mo45237A()     // Catch:{ all -> 0x059f }
            vm8 r0 = r0.mo29670l()     // Catch:{ all -> 0x059f }
            java.lang.String r7 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = p000.bn8.m32664w(r3)     // Catch:{ all -> 0x059f }
            r0.mo48770b(r7, r3)     // Catch:{ all -> 0x059f }
            r22 = r10
        L_0x0412:
            r9 = 0
            goto L_0x04d6
        L_0x0416:
            kr8 r0 = r1.f33728k     // Catch:{ NameNotFoundException -> 0x0428 }
            android.content.Context r0 = r0.mo45271q()     // Catch:{ NameNotFoundException -> 0x0428 }
            mk4 r0 = p000.tn7.m52384a(r0)     // Catch:{ NameNotFoundException -> 0x0428 }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.mo45811e(r3, r13)     // Catch:{ NameNotFoundException -> 0x0428 }
            r21 = r15
            goto L_0x043d
        L_0x0428:
            r0 = move-exception
            bn8 r13 = r24.mo45237A()     // Catch:{ all -> 0x059f }
            vm8 r13 = r13.mo29670l()     // Catch:{ all -> 0x059f }
            java.lang.String r14 = "Package info is null, first open report might be inaccurate. appId"
            r21 = r15
            java.lang.Object r15 = p000.bn8.m32664w(r3)     // Catch:{ all -> 0x059f }
            r13.mo48771c(r14, r15, r0)     // Catch:{ all -> 0x059f }
            r0 = 0
        L_0x043d:
            if (r0 == 0) goto L_0x0490
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x059f }
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0490
            r23 = r9
            r22 = r10
            long r9 = r0.lastUpdateTime     // Catch:{ all -> 0x059f }
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0471
            n68 r0 = r24.mo47648S()     // Catch:{ all -> 0x059f }
            uk8<java.lang.Boolean> r9 = p000.rl8.f33509m0     // Catch:{ all -> 0x059f }
            r10 = 0
            boolean r0 = r0.mo45997v(r10, r9)     // Catch:{ all -> 0x059f }
            if (r0 == 0) goto L_0x046b
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0469
            r13 = 1
            r8.putLong(r7, r13)     // Catch:{ all -> 0x059f }
        L_0x0469:
            r15 = 0
            goto L_0x0473
        L_0x046b:
            r13 = 1
            r8.putLong(r7, r13)     // Catch:{ all -> 0x059f }
            goto L_0x0469
        L_0x0471:
            r10 = 0
            r15 = 1
        L_0x0473:
            com.google.android.gms.measurement.internal.zzkq r0 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x059f }
            java.lang.String r14 = "_fi"
            r7 = 1
            if (r7 == r15) goto L_0x047d
            r15 = 0
            goto L_0x047f
        L_0x047d:
            r15 = 1
        L_0x047f:
            java.lang.Long r17 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x059f }
            java.lang.String r18 = "auto"
            r13 = r0
            r7 = r21
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x059f }
            r1.mo47676l(r0, r2)     // Catch:{ all -> 0x059f }
            goto L_0x0497
        L_0x0490:
            r23 = r9
            r22 = r10
            r7 = r21
            r10 = 0
        L_0x0497:
            kr8 r0 = r1.f33728k     // Catch:{ NameNotFoundException -> 0x04a7 }
            android.content.Context r0 = r0.mo45271q()     // Catch:{ NameNotFoundException -> 0x04a7 }
            mk4 r0 = p000.tn7.m52384a(r0)     // Catch:{ NameNotFoundException -> 0x04a7 }
            r9 = 0
            android.content.pm.ApplicationInfo r9 = r0.mo45809c(r3, r9)     // Catch:{ NameNotFoundException -> 0x04a7 }
            goto L_0x04ba
        L_0x04a7:
            r0 = move-exception
            bn8 r9 = r24.mo45237A()     // Catch:{ all -> 0x059f }
            vm8 r9 = r9.mo29670l()     // Catch:{ all -> 0x059f }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = p000.bn8.m32664w(r3)     // Catch:{ all -> 0x059f }
            r9.mo48771c(r13, r3, r0)     // Catch:{ all -> 0x059f }
            r9 = r10
        L_0x04ba:
            if (r9 == 0) goto L_0x0412
            int r0 = r9.flags     // Catch:{ all -> 0x059f }
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x04c9
            r3 = r23
            r13 = 1
            r8.putLong(r3, r13)     // Catch:{ all -> 0x059f }
        L_0x04c9:
            int r0 = r9.flags     // Catch:{ all -> 0x059f }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0412
            r9 = 1
            r8.putLong(r7, r9)     // Catch:{ all -> 0x059f }
            goto L_0x0412
        L_0x04d6:
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x04dd
            r8.putLong(r6, r4)     // Catch:{ all -> 0x059f }
        L_0x04dd:
            com.google.android.gms.measurement.internal.zzas r0 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x059f }
            com.google.android.gms.measurement.internal.zzaq r15 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x059f }
            r15.<init>(r8)     // Catch:{ all -> 0x059f }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x059f }
            r1.mo47671i0(r0, r2)     // Catch:{ all -> 0x059f }
            r4 = r22
            goto L_0x053f
        L_0x04f4:
            r22 = r10
            com.google.android.gms.measurement.internal.zzkq r0 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x059f }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x059f }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x059f }
            r1.mo47676l(r0, r2)     // Catch:{ all -> 0x059f }
            cr8 r0 = r24.mo45272s()     // Catch:{ all -> 0x059f }
            r0.mo29006e()     // Catch:{ all -> 0x059f }
            r24.mo47661d0()     // Catch:{ all -> 0x059f }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x059f }
            r0.<init>()     // Catch:{ all -> 0x059f }
            r6 = 1
            r0.putLong(r5, r6)     // Catch:{ all -> 0x059f }
            r0.putLong(r4, r6)     // Catch:{ all -> 0x059f }
            r4 = r22
            r0.putLong(r4, r6)     // Catch:{ all -> 0x059f }
            boolean r5 = r2.f23091M     // Catch:{ all -> 0x059f }
            if (r5 == 0) goto L_0x052b
            r0.putLong(r3, r6)     // Catch:{ all -> 0x059f }
        L_0x052b:
            com.google.android.gms.measurement.internal.zzas r3 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x059f }
            com.google.android.gms.measurement.internal.zzaq r15 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x059f }
            r15.<init>(r0)     // Catch:{ all -> 0x059f }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x059f }
            r1.mo47671i0(r3, r2)     // Catch:{ all -> 0x059f }
        L_0x053f:
            n68 r0 = r24.mo47648S()     // Catch:{ all -> 0x059f }
            java.lang.String r3 = r2.f23098a     // Catch:{ all -> 0x059f }
            uk8<java.lang.Boolean> r5 = p000.rl8.f33479V     // Catch:{ all -> 0x059f }
            boolean r0 = r0.mo45997v(r3, r5)     // Catch:{ all -> 0x059f }
            if (r0 != 0) goto L_0x058e
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x059f }
            r0.<init>()     // Catch:{ all -> 0x059f }
            r5 = 1
            r0.putLong(r4, r5)     // Catch:{ all -> 0x059f }
            java.lang.String r3 = "_fr"
            r0.putLong(r3, r5)     // Catch:{ all -> 0x059f }
            com.google.android.gms.measurement.internal.zzas r3 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x059f }
            java.lang.String r14 = "_e"
            com.google.android.gms.measurement.internal.zzaq r15 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x059f }
            r15.<init>(r0)     // Catch:{ all -> 0x059f }
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x059f }
            r1.mo47671i0(r3, r2)     // Catch:{ all -> 0x059f }
            goto L_0x058e
        L_0x0571:
            boolean r0 = r2.f23106y     // Catch:{ all -> 0x059f }
            if (r0 == 0) goto L_0x058e
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x059f }
            r0.<init>()     // Catch:{ all -> 0x059f }
            com.google.android.gms.measurement.internal.zzas r3 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x059f }
            com.google.android.gms.measurement.internal.zzaq r15 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x059f }
            r15.<init>(r0)     // Catch:{ all -> 0x059f }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x059f }
            r1.mo47671i0(r3, r2)     // Catch:{ all -> 0x059f }
        L_0x058e:
            m78 r0 = r1.f33720c     // Catch:{ all -> 0x059f }
            m51548Q(r0)     // Catch:{ all -> 0x059f }
            r0.mo45658N()     // Catch:{ all -> 0x059f }
            m78 r0 = r1.f33720c
            m51548Q(r0)
            r0.mo45659O()
            return
        L_0x059f:
            r0 = move-exception
            m78 r2 = r1.f33720c
            m51548Q(r2)
            r2.mo45659O()
            throw r0
        L_0x05a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s59.mo47681r(com.google.android.gms.measurement.internal.zzp):void");
    }

    /* renamed from: s */
    public final cr8 mo45272s() {
        return ((kr8) cu4.m43221k(this.f33728k)).mo45272s();
    }

    /* renamed from: t */
    public final void mo47682t(zzaa zzaa) {
        zzp O = mo47645O((String) cu4.m43221k(zzaa.f23064a));
        if (O != null) {
            mo47683u(zzaa, O);
        }
    }

    /* renamed from: u */
    public final void mo47683u(zzaa zzaa, zzp zzp) {
        zzas zzas;
        cu4.m43221k(zzaa);
        cu4.m43217g(zzaa.f23064a);
        cu4.m43221k(zzaa.f23065d);
        cu4.m43221k(zzaa.f23066e);
        cu4.m43217g(zzaa.f23066e.f23079d);
        mo45272s().mo29006e();
        mo47661d0();
        if (mo47646P(zzp)) {
            if (!zzp.f23105x) {
                mo47686x(zzp);
                return;
            }
            zzaa zzaa2 = new zzaa(zzaa);
            boolean z = false;
            zzaa2.f23068k = false;
            m78 m78 = this.f33720c;
            m51548Q(m78);
            m78.mo45657M();
            try {
                m78 m782 = this.f33720c;
                m51548Q(m782);
                zzaa Y = m782.mo45669Y((String) cu4.m43221k(zzaa2.f23064a), zzaa2.f23066e.f23079d);
                if (Y != null && !Y.f23065d.equals(zzaa2.f23065d)) {
                    mo45237A().mo29673o().mo48772d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f33728k.mo45244H().mo45823o(zzaa2.f23066e.f23079d), zzaa2.f23065d, Y.f23065d);
                }
                if (Y != null && Y.f23068k) {
                    zzaa2.f23065d = Y.f23065d;
                    zzaa2.f23067g = Y.f23067g;
                    zzaa2.f23071x = Y.f23071x;
                    zzaa2.f23069r = Y.f23069r;
                    zzaa2.f23072y = Y.f23072y;
                    zzaa2.f23068k = true;
                    zzkq zzkq = zzaa2.f23066e;
                    zzaa2.f23066e = new zzkq(zzkq.f23079d, Y.f23066e.f23080e, zzkq.mo31423r1(), Y.f23066e.f23083r);
                } else if (TextUtils.isEmpty(zzaa2.f23069r)) {
                    zzkq zzkq2 = zzaa2.f23066e;
                    zzaa2.f23066e = new zzkq(zzkq2.f23079d, zzaa2.f23067g, zzkq2.mo31423r1(), zzaa2.f23066e.f23083r);
                    zzaa2.f23068k = true;
                    z = true;
                }
                if (zzaa2.f23068k) {
                    zzkq zzkq3 = zzaa2.f23066e;
                    a69 a69 = new a69((String) cu4.m43221k(zzaa2.f23064a), zzaa2.f23065d, zzkq3.f23079d, zzkq3.f23080e, cu4.m43221k(zzkq3.mo31423r1()));
                    m78 m783 = this.f33720c;
                    m51548Q(m783);
                    if (m783.mo45664T(a69)) {
                        mo45237A().mo29677u().mo48772d("User property updated immediately", zzaa2.f23064a, this.f33728k.mo45244H().mo45823o(a69.f20823c), a69.f20825e);
                    } else {
                        mo45237A().mo29670l().mo48772d("(2)Too many active user properties, ignoring", bn8.m32664w(zzaa2.f23064a), this.f33728k.mo45244H().mo45823o(a69.f20823c), a69.f20825e);
                    }
                    if (z && (zzas = zzaa2.f23072y) != null) {
                        mo47675k0(new zzas(zzas, zzaa2.f23067g), zzp);
                    }
                }
                m78 m784 = this.f33720c;
                m51548Q(m784);
                if (m784.mo45668X(zzaa2)) {
                    mo45237A().mo29677u().mo48772d("Conditional property added", zzaa2.f23064a, this.f33728k.mo45244H().mo45823o(zzaa2.f23066e.f23079d), zzaa2.f23066e.mo31423r1());
                } else {
                    mo45237A().mo29670l().mo48772d("Too many conditional properties, ignoring", bn8.m32664w(zzaa2.f23064a), this.f33728k.mo45244H().mo45823o(zzaa2.f23066e.f23079d), zzaa2.f23066e.mo31423r1());
                }
                m78 m785 = this.f33720c;
                m51548Q(m785);
                m785.mo45658N();
            } finally {
                m78 m786 = this.f33720c;
                m51548Q(m786);
                m786.mo45659O();
            }
        }
    }

    /* renamed from: v */
    public final void mo47684v(zzaa zzaa) {
        zzp O = mo47645O((String) cu4.m43221k(zzaa.f23064a));
        if (O != null) {
            mo47685w(zzaa, O);
        }
    }

    /* renamed from: w */
    public final void mo47685w(zzaa zzaa, zzp zzp) {
        Bundle bundle;
        cu4.m43221k(zzaa);
        cu4.m43217g(zzaa.f23064a);
        cu4.m43221k(zzaa.f23066e);
        cu4.m43217g(zzaa.f23066e.f23079d);
        mo45272s().mo29006e();
        mo47661d0();
        if (mo47646P(zzp)) {
            if (zzp.f23105x) {
                m78 m78 = this.f33720c;
                m51548Q(m78);
                m78.mo45657M();
                try {
                    mo47686x(zzp);
                    String str = (String) cu4.m43221k(zzaa.f23064a);
                    m78 m782 = this.f33720c;
                    m51548Q(m782);
                    zzaa Y = m782.mo45669Y(str, zzaa.f23066e.f23079d);
                    if (Y != null) {
                        mo45237A().mo29677u().mo48771c("Removing conditional user property", zzaa.f23064a, this.f33728k.mo45244H().mo45823o(zzaa.f23066e.f23079d));
                        m78 m783 = this.f33720c;
                        m51548Q(m783);
                        m783.mo45670Z(str, zzaa.f23066e.f23079d);
                        if (Y.f23068k) {
                            m78 m784 = this.f33720c;
                            m51548Q(m784);
                            m784.mo45663S(str, zzaa.f23066e.f23079d);
                        }
                        zzas zzas = zzaa.f23063B;
                        if (zzas != null) {
                            zzaq zzaq = zzas.f23075d;
                            if (zzaq != null) {
                                bundle = zzaq.mo31419w1();
                            } else {
                                bundle = null;
                            }
                            mo47675k0((zzas) cu4.m43221k(mo47659c0().mo42794J(str, ((zzas) cu4.m43221k(zzaa.f23063B)).f23074a, bundle, Y.f23065d, zzaa.f23063B.f23077g, true, false)), zzp);
                        }
                    } else {
                        mo45237A().mo29673o().mo48771c("Conditional user property doesn't exist", bn8.m32664w(zzaa.f23064a), this.f33728k.mo45244H().mo45823o(zzaa.f23066e.f23079d));
                    }
                    m78 m785 = this.f33720c;
                    m51548Q(m785);
                    m785.mo45658N();
                } finally {
                    m78 m786 = this.f33720c;
                    m51548Q(m786);
                    m786.mo45659O();
                }
            } else {
                mo47686x(zzp);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02eb, code lost:
        if (r8 != false) goto L_0x02ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x024c  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.cs8 mo47686x(com.google.android.gms.measurement.internal.zzp r12) {
        /*
            r11 = this;
            cr8 r0 = r11.mo45272s()
            r0.mo29006e()
            r11.mo47661d0()
            p000.cu4.m43221k(r12)
            java.lang.String r0 = r12.f23098a
            p000.cu4.m43217g(r0)
            m78 r0 = r11.f33720c
            m51548Q(r0)
            java.lang.String r1 = r12.f23098a
            cs8 r0 = r0.mo45673c0(r1)
            java.lang.String r1 = r12.f23098a
            u68 r1 = r11.mo47665f0(r1)
            java.lang.String r2 = r12.f23097Z
            u68 r2 = p000.u68.m52648c(r2)
            u68 r1 = r1.mo48334k(r2)
            boolean r2 = r1.mo48329f()
            if (r2 == 0) goto L_0x003c
            i29 r2 = r11.f33726i
            java.lang.String r3 = r12.f23098a
            java.lang.String r2 = r2.mo43453l(r3)
            goto L_0x003e
        L_0x003c:
            java.lang.String r2 = ""
        L_0x003e:
            p000.td9.m52261a()
            n68 r3 = r11.mo47648S()
            uk8<java.lang.Boolean> r4 = p000.rl8.f33511n0
            r5 = 0
            boolean r3 = r3.mo45997v(r5, r4)
            r6 = 0
            if (r3 == 0) goto L_0x013d
            if (r0 != 0) goto L_0x0072
            cs8 r0 = new cs8
            kr8 r3 = r11.f33728k
            java.lang.String r4 = r12.f23098a
            r0.<init>(r3, r4)
            boolean r3 = r1.mo48331h()
            if (r3 == 0) goto L_0x0068
            java.lang.String r3 = r11.mo47658c(r1)
            r0.mo41665P(r3)
        L_0x0068:
            boolean r1 = r1.mo48329f()
            if (r1 == 0) goto L_0x00a6
            r0.mo41673X(r2)
            goto L_0x00a6
        L_0x0072:
            boolean r3 = r1.mo48329f()
            if (r3 == 0) goto L_0x008f
            if (r2 == 0) goto L_0x008f
            java.lang.String r3 = r0.mo41672W()
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x008f
            r0.mo41673X(r2)
            java.lang.String r1 = r11.mo47658c(r1)
            r0.mo41665P(r1)
            goto L_0x00a6
        L_0x008f:
            java.lang.String r2 = r0.mo41664O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00a6
            boolean r2 = r1.mo48331h()
            if (r2 == 0) goto L_0x00a6
            java.lang.String r1 = r11.mo47658c(r1)
            r0.mo41665P(r1)
        L_0x00a6:
            java.lang.String r1 = r12.f23099d
            r0.mo41667R(r1)
            java.lang.String r1 = r12.f23092P
            r0.mo41669T(r1)
            p000.le9.m47797a()
            n68 r1 = r11.mo47648S()
            java.lang.String r2 = r0.mo41663N()
            uk8<java.lang.Boolean> r3 = p000.rl8.f33501i0
            boolean r1 = r1.mo45997v(r2, r3)
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = r12.f23096Y
            r0.mo41671V(r1)
        L_0x00c8:
            java.lang.String r1 = r12.f23086B
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d5
            java.lang.String r1 = r12.f23086B
            r0.mo41675Z(r1)
        L_0x00d5:
            long r1 = r12.f23102k
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00de
            r0.mo41676a(r1)
        L_0x00de:
            java.lang.String r1 = r12.f23100e
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00eb
            java.lang.String r1 = r12.f23100e
            r0.mo41687f0(r1)
        L_0x00eb:
            long r1 = r12.f23085A
            r0.mo41691h0(r1)
            java.lang.String r1 = r12.f23101g
            if (r1 == 0) goto L_0x00f7
            r0.mo41695j0(r1)
        L_0x00f7:
            long r1 = r12.f23103r
            r0.mo41680c(r1)
            boolean r1 = r12.f23105x
            r0.mo41688g(r1)
            java.lang.String r1 = r12.f23104s
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x010e
            java.lang.String r1 = r12.f23104s
            r0.mo41653D(r1)
        L_0x010e:
            n68 r1 = r11.mo47648S()
            uk8<java.lang.Boolean> r2 = p000.rl8.f33527v0
            boolean r1 = r1.mo45997v(r5, r2)
            if (r1 != 0) goto L_0x011f
            long r1 = r12.f23087C
            r0.mo41655F(r1)
        L_0x011f:
            boolean r1 = r12.f23090L
            r0.mo41657H(r1)
            java.lang.Boolean r1 = r12.f23093Q
            r0.mo41659J(r1)
            long r1 = r12.f23094U
            r0.mo41684e(r1)
            boolean r12 = r0.mo41650A()
            if (r12 == 0) goto L_0x013c
            m78 r12 = r11.f33720c
            m51548Q(r12)
            r12.mo45674d0(r0)
        L_0x013c:
            return r0
        L_0x013d:
            java.lang.String r1 = r12.f23098a
            java.lang.Object r1 = p000.cu4.m43221k(r1)
            java.lang.String r1 = (java.lang.String) r1
            u68 r3 = r11.mo47665f0(r1)
            java.lang.String r4 = r12.f23097Z
            u68 r4 = p000.u68.m52648c(r4)
            u68 r3 = r3.mo48334k(r4)
            r4 = 0
            r8 = 1
            if (r0 != 0) goto L_0x0176
            cs8 r0 = new cs8
            kr8 r4 = r11.f33728k
            r0.<init>(r4, r1)
            boolean r1 = r3.mo48331h()
            if (r1 == 0) goto L_0x016b
            java.lang.String r1 = r11.mo47658c(r3)
            r0.mo41665P(r1)
        L_0x016b:
            boolean r1 = r3.mo48329f()
            if (r1 == 0) goto L_0x0174
            r0.mo41673X(r2)
        L_0x0174:
            r4 = r8
            goto L_0x01b1
        L_0x0176:
            boolean r1 = r3.mo48329f()
            if (r1 == 0) goto L_0x0199
            if (r2 == 0) goto L_0x0199
            java.lang.String r1 = r0.mo41672W()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0199
            r0.mo41673X(r2)
            boolean r1 = r3.mo48331h()
            if (r1 == 0) goto L_0x0174
            java.lang.String r1 = r11.mo47658c(r3)
            r0.mo41665P(r1)
            goto L_0x0174
        L_0x0199:
            java.lang.String r1 = r0.mo41664O()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01b1
            boolean r1 = r3.mo48331h()
            if (r1 == 0) goto L_0x01b1
            java.lang.String r1 = r11.mo47658c(r3)
            r0.mo41665P(r1)
            goto L_0x0174
        L_0x01b1:
            java.lang.String r1 = r12.f23099d
            java.lang.String r2 = r0.mo41666Q()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x01c3
            java.lang.String r1 = r12.f23099d
            r0.mo41667R(r1)
            r4 = r8
        L_0x01c3:
            java.lang.String r1 = r12.f23092P
            java.lang.String r2 = r0.mo41668S()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x01d5
            java.lang.String r1 = r12.f23092P
            r0.mo41669T(r1)
            r4 = r8
        L_0x01d5:
            p000.le9.m47797a()
            n68 r1 = r11.mo47648S()
            java.lang.String r2 = r0.mo41663N()
            uk8<java.lang.Boolean> r3 = p000.rl8.f33501i0
            boolean r1 = r1.mo45997v(r2, r3)
            if (r1 == 0) goto L_0x01fa
            java.lang.String r1 = r12.f23096Y
            java.lang.String r2 = r0.mo41670U()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x01fa
            java.lang.String r1 = r12.f23096Y
            r0.mo41671V(r1)
            r4 = r8
        L_0x01fa:
            java.lang.String r1 = r12.f23086B
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0214
            java.lang.String r1 = r12.f23086B
            java.lang.String r2 = r0.mo41674Y()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0214
            java.lang.String r1 = r12.f23086B
            r0.mo41675Z(r1)
            r4 = r8
        L_0x0214:
            long r1 = r12.f23102k
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0228
            long r9 = r0.mo41697k0()
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0228
            long r1 = r12.f23102k
            r0.mo41676a(r1)
            r4 = r8
        L_0x0228:
            java.lang.String r1 = r12.f23100e
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0242
            java.lang.String r1 = r12.f23100e
            java.lang.String r2 = r0.mo41685e0()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0242
            java.lang.String r1 = r12.f23100e
            r0.mo41687f0(r1)
            r4 = r8
        L_0x0242:
            long r1 = r12.f23085A
            long r9 = r0.mo41689g0()
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0252
            long r1 = r12.f23085A
            r0.mo41691h0(r1)
            r4 = r8
        L_0x0252:
            java.lang.String r1 = r12.f23101g
            if (r1 == 0) goto L_0x0266
            java.lang.String r2 = r0.mo41693i0()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0266
            java.lang.String r1 = r12.f23101g
            r0.mo41695j0(r1)
            r4 = r8
        L_0x0266:
            long r1 = r12.f23103r
            long r9 = r0.mo41678b()
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0276
            long r1 = r12.f23103r
            r0.mo41680c(r1)
            r4 = r8
        L_0x0276:
            boolean r1 = r12.f23105x
            boolean r2 = r0.mo41686f()
            if (r1 == r2) goto L_0x0284
            boolean r1 = r12.f23105x
            r0.mo41688g(r1)
            r4 = r8
        L_0x0284:
            java.lang.String r1 = r12.f23104s
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x029e
            java.lang.String r1 = r12.f23104s
            java.lang.String r2 = r0.mo41651B()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x029e
            java.lang.String r1 = r12.f23104s
            r0.mo41653D(r1)
            r4 = r8
        L_0x029e:
            n68 r1 = r11.mo47648S()
            uk8<java.lang.Boolean> r2 = p000.rl8.f33527v0
            boolean r1 = r1.mo45997v(r5, r2)
            if (r1 != 0) goto L_0x02ba
            long r1 = r12.f23087C
            long r9 = r0.mo41654E()
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x02ba
            long r1 = r12.f23087C
            r0.mo41655F(r1)
            r4 = r8
        L_0x02ba:
            boolean r1 = r12.f23090L
            boolean r2 = r0.mo41656G()
            if (r1 == r2) goto L_0x02c8
            boolean r1 = r12.f23090L
            r0.mo41657H(r1)
            r4 = r8
        L_0x02c8:
            java.lang.Boolean r1 = r12.f23093Q
            java.lang.Boolean r2 = r0.mo41658I()
            if (r1 == r2) goto L_0x02d6
            java.lang.Boolean r1 = r12.f23093Q
            r0.mo41659J(r1)
            goto L_0x02d7
        L_0x02d6:
            r8 = r4
        L_0x02d7:
            long r1 = r12.f23094U
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x02eb
            long r3 = r0.mo41682d()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x02eb
            long r1 = r12.f23094U
            r0.mo41684e(r1)
            goto L_0x02ed
        L_0x02eb:
            if (r8 == 0) goto L_0x02f5
        L_0x02ed:
            m78 r12 = r11.f33720c
            m51548Q(r12)
            r12.mo45674d0(r0)
        L_0x02f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s59.mo47686x(com.google.android.gms.measurement.internal.zzp):cs8");
    }

    /* renamed from: y */
    public final String mo47687y(zzp zzp) {
        try {
            return (String) mo45272s().mo41638m(new i59(this, zzp)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo45237A().mo29670l().mo48771c("Failed to get app instance id. appId", bn8.m32664w(zzp.f23098a), e);
            return null;
        }
    }

    /* renamed from: z */
    public final void mo47688z(boolean z) {
        mo47642L();
    }
}
