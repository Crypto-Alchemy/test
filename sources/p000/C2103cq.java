package p000;

import java.lang.reflect.Array;
import java.util.HashSet;

/* renamed from: cq */
/* compiled from: ArrayBuilders */
public final class C2103cq {

    /* renamed from: a */
    public C2105b f10205a = null;

    /* renamed from: b */
    public C2106c f10206b = null;

    /* renamed from: c */
    public C2111h f10207c = null;

    /* renamed from: d */
    public C2109f f10208d = null;

    /* renamed from: e */
    public C2110g f10209e = null;

    /* renamed from: f */
    public C2108e f10210f = null;

    /* renamed from: g */
    public C2107d f10211g = null;

    /* renamed from: cq$a */
    /* compiled from: ArrayBuilders */
    public static class C2104a {

        /* renamed from: a */
        public final /* synthetic */ Class f10212a;

        /* renamed from: b */
        public final /* synthetic */ int f10213b;

        /* renamed from: c */
        public final /* synthetic */ Object f10214c;

        public C2104a(Class cls, int i, Object obj) {
            this.f10212a = cls;
            this.f10213b = i;
            this.f10214c = obj;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!wf0.m29481H(obj, this.f10212a) || Array.getLength(obj) != this.f10213b) {
                return false;
            }
            for (int i = 0; i < this.f10213b; i++) {
                Object obj2 = Array.get(this.f10214c, i);
                Object obj3 = Array.get(obj, i);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: cq$b */
    /* compiled from: ArrayBuilders */
    public static final class C2105b extends zu4<boolean[]> {
        /* renamed from: g */
        public final boolean[] mo18223a(int i) {
            return new boolean[i];
        }
    }

    /* renamed from: cq$c */
    /* compiled from: ArrayBuilders */
    public static final class C2106c extends zu4<byte[]> {
        /* renamed from: g */
        public final byte[] mo18223a(int i) {
            return new byte[i];
        }
    }

    /* renamed from: cq$d */
    /* compiled from: ArrayBuilders */
    public static final class C2107d extends zu4<double[]> {
        /* renamed from: g */
        public final double[] mo18223a(int i) {
            return new double[i];
        }
    }

    /* renamed from: cq$e */
    /* compiled from: ArrayBuilders */
    public static final class C2108e extends zu4<float[]> {
        /* renamed from: g */
        public final float[] mo18223a(int i) {
            return new float[i];
        }
    }

    /* renamed from: cq$f */
    /* compiled from: ArrayBuilders */
    public static final class C2109f extends zu4<int[]> {
        /* renamed from: g */
        public final int[] mo18223a(int i) {
            return new int[i];
        }
    }

    /* renamed from: cq$g */
    /* compiled from: ArrayBuilders */
    public static final class C2110g extends zu4<long[]> {
        /* renamed from: g */
        public final long[] mo18223a(int i) {
            return new long[i];
        }
    }

    /* renamed from: cq$h */
    /* compiled from: ArrayBuilders */
    public static final class C2111h extends zu4<short[]> {
        /* renamed from: g */
        public final short[] mo18223a(int i) {
            return new short[i];
        }
    }

    /* renamed from: a */
    public static <T> HashSet<T> m14358a(T[] tArr) {
        if (tArr == null) {
            return new HashSet<>();
        }
        HashSet<T> hashSet = new HashSet<>(r0);
        for (T add : tArr) {
            hashSet.add(add);
        }
        return hashSet;
    }

    /* renamed from: b */
    public static Object m14359b(Object obj) {
        return new C2104a(obj.getClass(), Array.getLength(obj), obj);
    }

    /* renamed from: j */
    public static <T> T[] m14360j(T[] tArr, T t) {
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            if (tArr[i] != t) {
                i++;
            } else if (i == 0) {
                return tArr;
            } else {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length);
                System.arraycopy(tArr, 0, tArr2, 1, i);
                tArr2[0] = t;
                int i2 = i + 1;
                int i3 = length - i2;
                if (i3 > 0) {
                    System.arraycopy(tArr, i2, tArr2, i2, i3);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1);
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t;
        return tArr3;
    }

    /* renamed from: c */
    public C2105b mo18215c() {
        if (this.f10205a == null) {
            this.f10205a = new C2105b();
        }
        return this.f10205a;
    }

    /* renamed from: d */
    public C2106c mo18216d() {
        if (this.f10206b == null) {
            this.f10206b = new C2106c();
        }
        return this.f10206b;
    }

    /* renamed from: e */
    public C2107d mo18217e() {
        if (this.f10211g == null) {
            this.f10211g = new C2107d();
        }
        return this.f10211g;
    }

    /* renamed from: f */
    public C2108e mo18218f() {
        if (this.f10210f == null) {
            this.f10210f = new C2108e();
        }
        return this.f10210f;
    }

    /* renamed from: g */
    public C2109f mo18219g() {
        if (this.f10208d == null) {
            this.f10208d = new C2109f();
        }
        return this.f10208d;
    }

    /* renamed from: h */
    public C2110g mo18220h() {
        if (this.f10209e == null) {
            this.f10209e = new C2110g();
        }
        return this.f10209e;
    }

    /* renamed from: i */
    public C2111h mo18221i() {
        if (this.f10207c == null) {
            this.f10207c = new C2111h();
        }
        return this.f10207c;
    }
}
