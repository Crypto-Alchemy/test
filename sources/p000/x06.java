package p000;

import java.util.Arrays;
import java.util.Random;

/* renamed from: x06 */
/* compiled from: ShuffleOrder */
public interface x06 {

    /* renamed from: x06$a */
    /* compiled from: ShuffleOrder */
    public static class C3564a implements x06 {

        /* renamed from: a */
        public final Random f19269a;

        /* renamed from: b */
        public final int[] f19270b;

        /* renamed from: c */
        public final int[] f19271c;

        public C3564a(int i) {
            this(i, new Random());
        }

        /* renamed from: h */
        public static int[] m29811h(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        /* renamed from: a */
        public x06 mo27640a(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[(this.f19270b.length - i3)];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f19270b;
                if (i4 >= iArr2.length) {
                    return new C3564a(iArr, new Random(this.f19269a.nextLong()));
                }
                int i6 = iArr2[i4];
                if (i6 < i || i6 >= i2) {
                    int i7 = i4 - i5;
                    if (i6 >= i) {
                        i6 -= i3;
                    }
                    iArr[i7] = i6;
                } else {
                    i5++;
                }
                i4++;
            }
        }

        /* renamed from: b */
        public int mo27641b(int i) {
            int i2 = this.f19271c[i] - 1;
            if (i2 >= 0) {
                return this.f19270b[i2];
            }
            return -1;
        }

        /* renamed from: c */
        public int mo27642c(int i) {
            int i2 = this.f19271c[i] + 1;
            int[] iArr = this.f19270b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        /* renamed from: d */
        public int mo27643d() {
            int[] iArr = this.f19270b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        /* renamed from: e */
        public x06 mo27644e() {
            return new C3564a(0, new Random(this.f19269a.nextLong()));
        }

        /* renamed from: f */
        public int mo27645f() {
            int[] iArr = this.f19270b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        /* renamed from: g */
        public x06 mo27646g(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f19269a.nextInt(this.f19270b.length + 1);
                int i5 = i4 + 1;
                int nextInt = this.f19269a.nextInt(i5);
                iArr2[i4] = iArr2[nextInt];
                iArr2[nextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f19270b.length + i2)];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f19270b;
                if (i3 >= iArr4.length + i2) {
                    return new C3564a(iArr3, new Random(this.f19269a.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = i7 + 1;
                    int i9 = iArr4[i7];
                    iArr3[i3] = i9;
                    if (i9 >= i) {
                        iArr3[i3] = i9 + i2;
                    }
                    i7 = i8;
                } else {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                }
                i3++;
            }
        }

        public int getLength() {
            return this.f19270b.length;
        }

        public C3564a(int i, Random random) {
            this(m29811h(i, random), random);
        }

        public C3564a(int[] iArr, Random random) {
            this.f19270b = iArr;
            this.f19269a = random;
            this.f19271c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f19271c[iArr[i]] = i;
            }
        }
    }

    /* renamed from: a */
    x06 mo27640a(int i, int i2);

    /* renamed from: b */
    int mo27641b(int i);

    /* renamed from: c */
    int mo27642c(int i);

    /* renamed from: d */
    int mo27643d();

    /* renamed from: e */
    x06 mo27644e();

    /* renamed from: f */
    int mo27645f();

    /* renamed from: g */
    x06 mo27646g(int i, int i2);

    int getLength();
}
