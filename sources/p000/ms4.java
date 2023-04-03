package p000;

import android.util.SparseIntArray;

/* renamed from: ms4 */
/* compiled from: PoolParams */
public class ms4 {

    /* renamed from: a */
    public final int f15241a;

    /* renamed from: b */
    public final int f15242b;

    /* renamed from: c */
    public final SparseIntArray f15243c;

    /* renamed from: d */
    public final int f15244d;

    /* renamed from: e */
    public final int f15245e;

    /* renamed from: f */
    public boolean f15246f;

    /* renamed from: g */
    public final int f15247g;

    public ms4(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public ms4(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        au4.m10794i(i >= 0 && i2 >= i);
        this.f15242b = i;
        this.f15241a = i2;
        this.f15243c = sparseIntArray;
        this.f15244d = i3;
        this.f15245e = i4;
        this.f15247g = i5;
    }
}
