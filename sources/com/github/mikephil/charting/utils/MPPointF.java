package com.github.mikephil.charting.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.ObjectPool;
import java.util.List;

public class MPPointF extends ObjectPool.Poolable {
    public static final Parcelable.Creator<MPPointF> CREATOR = new Parcelable.Creator<MPPointF>() {
        public MPPointF createFromParcel(Parcel parcel) {
            MPPointF mPPointF = new MPPointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            mPPointF.my_readFromParcel(parcel);
            return mPPointF;
        }

        public MPPointF[] newArray(int i) {
            return new MPPointF[i];
        }
    };
    private static ObjectPool<MPPointF> pool;

    /* renamed from: x */
    public float f10199x;

    /* renamed from: y */
    public float f10200y;

    static {
        ObjectPool<MPPointF> create = ObjectPool.create(32, new MPPointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON));
        pool = create;
        create.setReplenishPercentage(0.5f);
    }

    public MPPointF() {
    }

    public static MPPointF getInstance(float f, float f2) {
        MPPointF mPPointF = pool.get();
        mPPointF.f10199x = f;
        mPPointF.f10200y = f2;
        return mPPointF;
    }

    public static void recycleInstance(MPPointF mPPointF) {
        pool.recycle(mPPointF);
    }

    public static void recycleInstances(List<MPPointF> list) {
        pool.recycle(list);
    }

    public float getX() {
        return this.f10199x;
    }

    public float getY() {
        return this.f10200y;
    }

    public ObjectPool.Poolable instantiate() {
        return new MPPointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    }

    public void my_readFromParcel(Parcel parcel) {
        this.f10199x = parcel.readFloat();
        this.f10200y = parcel.readFloat();
    }

    public MPPointF(float f, float f2) {
        this.f10199x = f;
        this.f10200y = f2;
    }

    public static MPPointF getInstance() {
        return pool.get();
    }

    public static MPPointF getInstance(MPPointF mPPointF) {
        MPPointF mPPointF2 = pool.get();
        mPPointF2.f10199x = mPPointF.f10199x;
        mPPointF2.f10200y = mPPointF.f10200y;
        return mPPointF2;
    }
}
