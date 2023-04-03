package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;

/* renamed from: com.facebook.imagepipeline.memory.a */
/* compiled from: GenericByteArrayPool */
public class C1946a extends BasePool<byte[]> implements j60 {

    /* renamed from: k */
    public final int[] f9634k;

    public C1946a(ht3 ht3, ms4 ms4, ns4 ns4) {
        super(ht3, ms4, ns4);
        SparseIntArray sparseIntArray = (SparseIntArray) au4.m10792g(ms4.f15243c);
        this.f9634k = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.f9634k[i] = sparseIntArray.keyAt(i);
        }
        mo13343r();
    }

    /* renamed from: A */
    public void mo13335j(byte[] bArr) {
        au4.m10792g(bArr);
    }

    /* renamed from: B */
    public int mo13339n(byte[] bArr) {
        au4.m10792g(bArr);
        return bArr.length;
    }

    /* renamed from: m */
    public int mo13338m(int i) {
        if (i > 0) {
            for (int i2 : this.f9634k) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new BasePool.InvalidSizeException(Integer.valueOf(i));
    }

    /* renamed from: o */
    public int mo13340o(int i) {
        return i;
    }

    /* renamed from: z */
    public byte[] mo13330f(int i) {
        return new byte[i];
    }
}
