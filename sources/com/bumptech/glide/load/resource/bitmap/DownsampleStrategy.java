package com.bumptech.glide.load.resource.bitmap;

public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f8921a = new C1783a();

    /* renamed from: b */
    public static final DownsampleStrategy f8922b = new C1784b();

    /* renamed from: c */
    public static final DownsampleStrategy f8923c = new C1787e();

    /* renamed from: d */
    public static final DownsampleStrategy f8924d = new C1785c();

    /* renamed from: e */
    public static final DownsampleStrategy f8925e;

    /* renamed from: f */
    public static final DownsampleStrategy f8926f = new C1788f();

    /* renamed from: g */
    public static final DownsampleStrategy f8927g;

    /* renamed from: h */
    public static final pi4<DownsampleStrategy> f8928h;

    /* renamed from: i */
    public static final boolean f8929i = true;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C1783a extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo12592a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public float mo12593b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C1784b extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo12592a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }

        /* renamed from: b */
        public float mo12593b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C1785c extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo12592a(int i, int i2, int i3, int i4) {
            if (mo12593b(i, i2, i3, i4) == 1.0f) {
                return SampleSizeRounding.QUALITY;
            }
            return DownsampleStrategy.f8923c.mo12592a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public float mo12593b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.f8923c.mo12593b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C1786d extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo12592a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public float mo12593b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C1787e extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo12592a(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f8929i) {
                return SampleSizeRounding.QUALITY;
            }
            return SampleSizeRounding.MEMORY;
        }

        /* renamed from: b */
        public float mo12593b(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f8929i) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C1788f extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo12592a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public float mo12593b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    static {
        C1786d dVar = new C1786d();
        f8925e = dVar;
        f8927g = dVar;
        f8928h = pi4.m24962f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    /* renamed from: a */
    public abstract SampleSizeRounding mo12592a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo12593b(int i, int i2, int i3, int i4);
}
