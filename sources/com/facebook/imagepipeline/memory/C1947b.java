package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;

/* renamed from: com.facebook.imagepipeline.memory.b */
/* compiled from: MemoryChunkPool */
public abstract class C1947b extends BasePool<bt3> {

    /* renamed from: k */
    public final int[] f9635k;

    public C1947b(ht3 ht3, ms4 ms4, ns4 ns4) {
        super(ht3, ms4, ns4);
        SparseIntArray sparseIntArray = (SparseIntArray) au4.m10792g(ms4.f15243c);
        this.f9635k = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f9635k;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                mo13343r();
                return;
            }
        }
    }

    /* renamed from: A */
    public void mo13335j(bt3 bt3) {
        au4.m10792g(bt3);
        bt3.close();
    }

    /* renamed from: B */
    public int mo13339n(bt3 bt3) {
        au4.m10792g(bt3);
        return bt3.getSize();
    }

    /* renamed from: C */
    public int mo13370C() {
        return this.f9635k[0];
    }

    /* renamed from: D */
    public boolean mo13345t(bt3 bt3) {
        au4.m10792g(bt3);
        return !bt3.isClosed();
    }

    /* renamed from: m */
    public int mo13338m(int i) {
        if (i > 0) {
            for (int i2 : this.f9635k) {
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
    public abstract bt3 mo13330f(int i);
}
