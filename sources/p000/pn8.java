package p000;

import java.net.URL;
import java.util.Map;

/* renamed from: pn8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class pn8 implements Runnable {

    /* renamed from: a */
    public final URL f32750a;

    /* renamed from: d */
    public final byte[] f32751d;

    /* renamed from: e */
    public final jn8 f32752e;

    /* renamed from: g */
    public final String f32753g;

    /* renamed from: k */
    public final Map<String, String> f32754k;

    /* renamed from: r */
    public final /* synthetic */ sn8 f32755r;

    public pn8(sn8 sn8, String str, URL url, byte[] bArr, Map<String, String> map, jn8 jn8) {
        this.f32755r = sn8;
        cu4.m43217g(str);
        cu4.m43221k(url);
        cu4.m43221k(jn8);
        this.f32750a = url;
        this.f32751d = bArr;
        this.f32752e = jn8;
        this.f32753g = str;
        this.f32754k = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1 A[SYNTHETIC, Splitter:B:41:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee A[SYNTHETIC, Splitter:B:59:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012e A[SYNTHETIC, Splitter:B:71:0x012e] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            sn8 r1 = r13.f32755r
            r1.mo41636d()
            r1 = 0
            r2 = 0
            sn8 r3 = r13.f32755r     // Catch:{ IOException -> 0x0126, all -> 0x00e7 }
            java.net.URL r4 = r13.f32750a     // Catch:{ IOException -> 0x0126, all -> 0x00e7 }
            java.net.HttpURLConnection r3 = r3.mo47845k(r4)     // Catch:{ IOException -> 0x0126, all -> 0x00e7 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f32754k     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            if (r4 == 0) goto L_0x0039
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
        L_0x001d:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            goto L_0x001d
        L_0x0039:
            byte[] r4 = r13.f32751d     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            if (r4 == 0) goto L_0x008a
            sn8 r4 = r13.f32755r     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            s59 r4 = r4.f33321b     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            w59 r4 = r4.mo47655Z()     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            byte[] r5 = r13.f32751d     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            byte[] r4 = r4.mo48901I(r5)     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            sn8 r5 = r13.f32755r     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            kr8 r5 = r5.f34342a     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            bn8 r5 = r5.mo45237A()     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            vm8 r5 = r5.mo29678v()     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            int r6 = r4.length     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            java.lang.String r7 = "Uploading data. size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            r5.mo48770b(r7, r8)     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r3.addRequestProperty(r5, r7)     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            r3.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            r3.connect()     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            r5.write(r4)     // Catch:{ IOException -> 0x0083, all -> 0x007d }
            r5.close()     // Catch:{ IOException -> 0x0083, all -> 0x007d }
            goto L_0x008a
        L_0x007d:
            r4 = move-exception
            r8 = r1
            r11 = r2
            r2 = r5
            goto L_0x00ec
        L_0x0083:
            r4 = move-exception
            r8 = r1
            r11 = r2
            r9 = r4
            r2 = r5
            goto L_0x012c
        L_0x008a:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00e3, all -> 0x00df }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00dd, all -> 0x00db }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00cd }
            r4.<init>()     // Catch:{ all -> 0x00cd }
            java.io.InputStream r5 = r3.getInputStream()     // Catch:{ all -> 0x00cd }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00cb }
        L_0x009f:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00cb }
            if (r7 <= 0) goto L_0x00a9
            r4.write(r6, r1, r7)     // Catch:{ all -> 0x00cb }
            goto L_0x009f
        L_0x00a9:
            byte[] r10 = r4.toByteArray()     // Catch:{ all -> 0x00cb }
            r5.close()     // Catch:{ IOException -> 0x00d8, all -> 0x00d5 }
            r3.disconnect()
            sn8 r0 = r13.f32755r
            kr8 r0 = r0.f34342a
            cr8 r0 = r0.mo45272s()
            mn8 r1 = new mn8
            java.lang.String r6 = r13.f32753g
            jn8 r7 = r13.f32752e
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x00c7:
            r0.mo41640o(r1)
            return
        L_0x00cb:
            r1 = move-exception
            goto L_0x00cf
        L_0x00cd:
            r1 = move-exception
            r5 = r2
        L_0x00cf:
            if (r5 == 0) goto L_0x00d4
            r5.close()     // Catch:{ IOException -> 0x00d8, all -> 0x00d5 }
        L_0x00d4:
            throw r1     // Catch:{ IOException -> 0x00d8, all -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            r4 = r1
            goto L_0x00ec
        L_0x00d8:
            r1 = move-exception
            r4 = r1
            goto L_0x012b
        L_0x00db:
            r4 = move-exception
            goto L_0x00e1
        L_0x00dd:
            r4 = move-exception
            goto L_0x00e5
        L_0x00df:
            r4 = move-exception
            r8 = r1
        L_0x00e1:
            r11 = r2
            goto L_0x00ec
        L_0x00e3:
            r4 = move-exception
            r8 = r1
        L_0x00e5:
            r11 = r2
            goto L_0x012b
        L_0x00e7:
            r3 = move-exception
            r4 = r3
            r8 = r1
            r3 = r2
            r11 = r3
        L_0x00ec:
            if (r2 == 0) goto L_0x0108
            r2.close()     // Catch:{ IOException -> 0x00f2 }
            goto L_0x0108
        L_0x00f2:
            r1 = move-exception
            sn8 r2 = r13.f32755r
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29670l()
            java.lang.String r5 = r13.f32753g
            java.lang.Object r5 = p000.bn8.m32664w(r5)
            r2.mo48771c(r0, r5, r1)
        L_0x0108:
            if (r3 == 0) goto L_0x010d
            r3.disconnect()
        L_0x010d:
            sn8 r0 = r13.f32755r
            kr8 r0 = r0.f34342a
            cr8 r0 = r0.mo45272s()
            mn8 r1 = new mn8
            java.lang.String r6 = r13.f32753g
            jn8 r7 = r13.f32752e
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.mo41640o(r1)
            throw r4
        L_0x0126:
            r3 = move-exception
            r4 = r3
            r8 = r1
            r3 = r2
            r11 = r3
        L_0x012b:
            r9 = r4
        L_0x012c:
            if (r2 == 0) goto L_0x0148
            r2.close()     // Catch:{ IOException -> 0x0132 }
            goto L_0x0148
        L_0x0132:
            r1 = move-exception
            sn8 r2 = r13.f32755r
            kr8 r2 = r2.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29670l()
            java.lang.String r4 = r13.f32753g
            java.lang.Object r4 = p000.bn8.m32664w(r4)
            r2.mo48771c(r0, r4, r1)
        L_0x0148:
            if (r3 == 0) goto L_0x014d
            r3.disconnect()
        L_0x014d:
            sn8 r0 = r13.f32755r
            kr8 r0 = r0.f34342a
            cr8 r0 = r0.mo45272s()
            mn8 r1 = new mn8
            java.lang.String r6 = r13.f32753g
            jn8 r7 = r13.f32752e
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pn8.run():void");
    }
}
