package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;

@ii1
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: d */
    public static Method f9644d;

    /* renamed from: c */
    public final ek7 f9645c = fk7.m17059i();

    /* renamed from: h */
    public static MemoryFile m13534h(nh0<PooledByteBuffer> nh0, int i, byte[] bArr) throws IOException {
        int i2;
        Closeable closeable;
        gh3 gh3;
        if (bArr == null) {
            i2 = 0;
        } else {
            i2 = bArr.length;
        }
        rs4 rs4 = null;
        MemoryFile memoryFile = new MemoryFile((String) null, i2 + i);
        memoryFile.allowPurging(false);
        try {
            rs4 rs42 = new rs4(nh0.mo23684j());
            try {
                gh3 = new gh3(rs42, i);
                try {
                    OutputStream outputStream = memoryFile.getOutputStream();
                    a70.m85a(gh3, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    nh0.m23178h(nh0);
                    rh0.m26191b(rs42);
                    rh0.m26191b(gh3);
                    rh0.m26190a(outputStream, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    closeable = null;
                    rs4 = rs42;
                    nh0.m23178h(nh0);
                    rh0.m26191b(rs4);
                    rh0.m26191b(gh3);
                    rh0.m26190a(closeable, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                gh3 = null;
                rs4 = rs42;
                nh0.m23178h(nh0);
                rh0.m26191b(rs4);
                rh0.m26191b(gh3);
                rh0.m26190a(closeable, true);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            gh3 = null;
            nh0.m23178h(nh0);
            rh0.m26191b(rs4);
            rh0.m26191b(gh3);
            rh0.m26190a(closeable, true);
            throw th;
        }
    }

    /* renamed from: c */
    public Bitmap mo13374c(nh0<PooledByteBuffer> nh0, BitmapFactory.Options options) {
        return mo13385i(nh0, nh0.mo23684j().size(), (byte[]) null, options);
    }

    /* renamed from: d */
    public Bitmap mo13375d(nh0<PooledByteBuffer> nh0, int i, BitmapFactory.Options options) {
        byte[] bArr;
        if (DalvikPurgeableDecoder.m13517e(nh0, i)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.f9636b;
        }
        return mo13385i(nh0, i, bArr, options);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo13385i(p000.nh0<com.facebook.common.memory.PooledByteBuffer> r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = m13534h(r2, r3, r4)     // Catch:{ IOException -> 0x002f }
            java.io.FileDescriptor r3 = r1.mo13387k(r2)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            ek7 r4 = r1.f9645c     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            if (r4 == 0) goto L_0x001f
            android.graphics.Bitmap r3 = r4.mo13510c(r3, r0, r5)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            java.lang.String r4 = "BitmapFactory returned null"
            java.lang.Object r3 = p000.au4.m10793h(r3, r4)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            if (r2 == 0) goto L_0x001e
            r2.close()
        L_0x001e:
            return r3
        L_0x001f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            java.lang.String r4 = "WebpBitmapFactory is null"
            r3.<init>(r4)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            throw r3     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
        L_0x0027:
            r3 = move-exception
            r0 = r2
            goto L_0x0035
        L_0x002a:
            r3 = move-exception
            r0 = r2
            goto L_0x0030
        L_0x002d:
            r3 = move-exception
            goto L_0x0035
        L_0x002f:
            r3 = move-exception
        L_0x0030:
            java.lang.RuntimeException r2 = p000.pp6.m25127a(r3)     // Catch:{ all -> 0x002d }
            throw r2     // Catch:{ all -> 0x002d }
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r0.close()
        L_0x003a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.mo13385i(nh0, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: j */
    public final synchronized Method mo13386j() {
        if (f9644d == null) {
            try {
                f9644d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e) {
                throw pp6.m25127a(e);
            }
        }
        return f9644d;
    }

    /* renamed from: k */
    public final FileDescriptor mo13387k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) au4.m10792g(mo13386j().invoke(memoryFile, new Object[0]));
        } catch (Exception e) {
            throw pp6.m25127a(e);
        }
    }
}
