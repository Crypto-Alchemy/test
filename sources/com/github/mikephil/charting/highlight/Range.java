package com.github.mikephil.charting.highlight;

public final class Range {
    public float from;

    /* renamed from: to */
    public float f10188to;

    public Range(float f, float f2) {
        this.from = f;
        this.f10188to = f2;
    }

    public boolean contains(float f) {
        if (f <= this.from || f > this.f10188to) {
            return false;
        }
        return true;
    }

    public boolean isLarger(float f) {
        if (f > this.f10188to) {
            return true;
        }
        return false;
    }

    public boolean isSmaller(float f) {
        if (f < this.from) {
            return true;
        }
        return false;
    }
}
