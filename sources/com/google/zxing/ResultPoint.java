package com.google.zxing;

import com.github.mikephil.charting.utils.Utils;
import com.google.zxing.common.detector.MathUtils;

public class ResultPoint {

    /* renamed from: x */
    private final float f25777x;

    /* renamed from: y */
    private final float f25778y;

    public ResultPoint(float f, float f2) {
        this.f25777x = f;
        this.f25778y = f2;
    }

    private static float crossProductZ(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f = resultPoint2.f25777x;
        float f2 = resultPoint2.f25778y;
        return ((resultPoint3.f25777x - f) * (resultPoint.f25778y - f2)) - ((resultPoint3.f25778y - f2) * (resultPoint.f25777x - f));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.f25777x, resultPoint.f25778y, resultPoint2.f25777x, resultPoint2.f25778y);
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float distance = distance(resultPointArr[0], resultPointArr[1]);
        float distance2 = distance(resultPointArr[1], resultPointArr[2]);
        float distance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (distance2 >= distance && distance2 >= distance3) {
            resultPoint3 = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint = resultPointArr[2];
        } else if (distance3 < distance2 || distance3 < distance) {
            resultPoint3 = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint = resultPointArr[1];
        } else {
            resultPoint3 = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint = resultPointArr[2];
        }
        if (crossProductZ(resultPoint2, resultPoint3, resultPoint) < Utils.FLOAT_EPSILON) {
            ResultPoint resultPoint4 = resultPoint;
            resultPoint = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint3;
        resultPointArr[2] = resultPoint;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ResultPoint)) {
            return false;
        }
        ResultPoint resultPoint = (ResultPoint) obj;
        if (this.f25777x == resultPoint.f25777x && this.f25778y == resultPoint.f25778y) {
            return true;
        }
        return false;
    }

    public final float getX() {
        return this.f25777x;
    }

    public final float getY() {
        return this.f25778y;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f25777x) * 31) + Float.floatToIntBits(this.f25778y);
    }

    public final String toString() {
        return "(" + this.f25777x + ',' + this.f25778y + ')';
    }
}
