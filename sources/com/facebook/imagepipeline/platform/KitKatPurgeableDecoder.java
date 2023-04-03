package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

@ii1
@TargetApi(19)
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: c */
    public final f42 f9646c;

    @ii1
    public KitKatPurgeableDecoder(f42 f42) {
        this.f9646c = f42;
    }

    /* renamed from: h */
    public static void m13540h(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }

    /* renamed from: c */
    public Bitmap mo13374c(nh0<PooledByteBuffer> nh0, BitmapFactory.Options options) {
        PooledByteBuffer j = nh0.mo23684j();
        int size = j.size();
        nh0<byte[]> a = this.f9646c.mo19685a(size);
        try {
            byte[] j2 = a.mo23684j();
            j.mo13167t(0, j2, 0, size);
            return (Bitmap) au4.m10793h(BitmapFactory.decodeByteArray(j2, 0, size, options), "BitmapFactory returned null");
        } finally {
            nh0.m23178h(a);
        }
    }

    /* renamed from: d */
    public Bitmap mo13375d(nh0<PooledByteBuffer> nh0, int i, BitmapFactory.Options options) {
        byte[] bArr;
        boolean z;
        if (DalvikPurgeableDecoder.m13517e(nh0, i)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.f9636b;
        }
        PooledByteBuffer j = nh0.mo23684j();
        if (i <= j.size()) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        int i2 = i + 2;
        nh0<byte[]> a = this.f9646c.mo19685a(i2);
        try {
            byte[] j2 = a.mo23684j();
            j.mo13167t(0, j2, 0, i);
            if (bArr != null) {
                m13540h(j2, i);
                i = i2;
            }
            return (Bitmap) au4.m10793h(BitmapFactory.decodeByteArray(j2, 0, i, options), "BitmapFactory returned null");
        } finally {
            nh0.m23178h(a);
        }
    }
}
