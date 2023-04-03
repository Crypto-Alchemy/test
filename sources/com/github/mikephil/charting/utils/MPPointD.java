package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool;
import java.util.List;

public class MPPointD extends ObjectPool.Poolable {
    private static ObjectPool<MPPointD> pool;

    /* renamed from: x */
    public double f10197x;

    /* renamed from: y */
    public double f10198y;

    static {
        ObjectPool<MPPointD> create = ObjectPool.create(64, new MPPointD(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON));
        pool = create;
        create.setReplenishPercentage(0.5f);
    }

    private MPPointD(double d, double d2) {
        this.f10197x = d;
        this.f10198y = d2;
    }

    public static MPPointD getInstance(double d, double d2) {
        MPPointD mPPointD = pool.get();
        mPPointD.f10197x = d;
        mPPointD.f10198y = d2;
        return mPPointD;
    }

    public static void recycleInstance(MPPointD mPPointD) {
        pool.recycle(mPPointD);
    }

    public static void recycleInstances(List<MPPointD> list) {
        pool.recycle(list);
    }

    public ObjectPool.Poolable instantiate() {
        return new MPPointD(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON);
    }

    public String toString() {
        return "MPPointD, x: " + this.f10197x + ", y: " + this.f10198y;
    }
}
