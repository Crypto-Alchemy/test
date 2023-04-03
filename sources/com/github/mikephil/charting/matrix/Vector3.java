package com.github.mikephil.charting.matrix;

import com.github.mikephil.charting.utils.Utils;

public final class Vector3 {
    public static final Vector3 UNIT_X = new Vector3(1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    public static final Vector3 UNIT_Y = new Vector3(Utils.FLOAT_EPSILON, 1.0f, Utils.FLOAT_EPSILON);
    public static final Vector3 UNIT_Z = new Vector3(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f);
    public static final Vector3 ZERO = new Vector3(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);

    /* renamed from: x */
    public float f10189x;

    /* renamed from: y */
    public float f10190y;

    /* renamed from: z */
    public float f10191z;

    public Vector3() {
    }

    public final void add(Vector3 vector3) {
        this.f10189x += vector3.f10189x;
        this.f10190y += vector3.f10190y;
        this.f10191z += vector3.f10191z;
    }

    public final Vector3 cross(Vector3 vector3) {
        float f = this.f10190y;
        float f2 = vector3.f10191z;
        float f3 = this.f10191z;
        float f4 = vector3.f10190y;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = vector3.f10189x;
        float f7 = this.f10189x;
        return new Vector3(f5, (f3 * f6) - (f2 * f7), (f7 * f4) - (f * f6));
    }

    public final float distance2(Vector3 vector3) {
        float f = this.f10189x - vector3.f10189x;
        float f2 = this.f10190y - vector3.f10190y;
        float f3 = this.f10191z - vector3.f10191z;
        return (f * f) + (f2 * f2) + (f3 * f3);
    }

    public final void divide(float f) {
        if (f != Utils.FLOAT_EPSILON) {
            this.f10189x /= f;
            this.f10190y /= f;
            this.f10191z /= f;
        }
    }

    public final float dot(Vector3 vector3) {
        return (this.f10189x * vector3.f10189x) + (this.f10190y * vector3.f10190y) + (this.f10191z * vector3.f10191z);
    }

    public final float length() {
        return (float) Math.sqrt((double) length2());
    }

    public final float length2() {
        float f = this.f10189x;
        float f2 = this.f10190y;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.f10191z;
        return f3 + (f4 * f4);
    }

    public final void multiply(float f) {
        this.f10189x *= f;
        this.f10190y *= f;
        this.f10191z *= f;
    }

    public final float normalize() {
        float length = length();
        if (length != Utils.FLOAT_EPSILON) {
            this.f10189x /= length;
            this.f10190y /= length;
            this.f10191z /= length;
        }
        return length;
    }

    public final boolean pointsInSameDirection(Vector3 vector3) {
        if (dot(vector3) > Utils.FLOAT_EPSILON) {
            return true;
        }
        return false;
    }

    public final void set(Vector3 vector3) {
        this.f10189x = vector3.f10189x;
        this.f10190y = vector3.f10190y;
        this.f10191z = vector3.f10191z;
    }

    public final void subtract(Vector3 vector3) {
        this.f10189x -= vector3.f10189x;
        this.f10190y -= vector3.f10190y;
        this.f10191z -= vector3.f10191z;
    }

    public final void subtractMultiple(Vector3 vector3, float f) {
        this.f10189x -= vector3.f10189x * f;
        this.f10190y -= vector3.f10190y * f;
        this.f10191z -= vector3.f10191z * f;
    }

    public final void zero() {
        set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    }

    public Vector3(float[] fArr) {
        set(fArr[0], fArr[1], fArr[2]);
    }

    public Vector3(float f, float f2, float f3) {
        set(f, f2, f3);
    }

    public final void add(float f, float f2, float f3) {
        this.f10189x += f;
        this.f10190y += f2;
        this.f10191z += f3;
    }

    public final void multiply(Vector3 vector3) {
        this.f10189x *= vector3.f10189x;
        this.f10190y *= vector3.f10190y;
        this.f10191z *= vector3.f10191z;
    }

    public final void set(float f, float f2, float f3) {
        this.f10189x = f;
        this.f10190y = f2;
        this.f10191z = f3;
    }

    public Vector3(Vector3 vector3) {
        set(vector3);
    }
}
