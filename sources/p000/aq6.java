package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: aq6 */
/* compiled from: TiffUtil */
public class aq6 {

    /* renamed from: a */
    public static final Class<?> f7684a = aq6.class;

    /* renamed from: aq6$b */
    /* compiled from: TiffUtil */
    public static class C1567b {

        /* renamed from: a */
        public boolean f7685a;

        /* renamed from: b */
        public int f7686b;

        /* renamed from: c */
        public int f7687c;

        public C1567b() {
        }
    }

    /* renamed from: a */
    public static int m10693a(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: b */
    public static int m10694b(InputStream inputStream, int i, boolean z) throws IOException {
        if (i >= 10 && ra6.m26140a(inputStream, 2, z) == 3 && ra6.m26140a(inputStream, 4, z) == 1) {
            return ra6.m26140a(inputStream, 2, z);
        }
        return 0;
    }

    /* renamed from: c */
    public static int m10695c(InputStream inputStream, int i, boolean z, int i2) throws IOException {
        if (i < 14) {
            return 0;
        }
        int a = ra6.m26140a(inputStream, 2, z);
        int i3 = i - 2;
        while (true) {
            int i4 = a - 1;
            if (a <= 0 || i3 < 12) {
                return 0;
            }
            int i5 = i3 - 2;
            if (ra6.m26140a(inputStream, 2, z) == i2) {
                return i5;
            }
            inputStream.skip(10);
            i3 = i5 - 10;
            a = i4;
        }
        return 0;
    }

    /* renamed from: d */
    public static int m10696d(InputStream inputStream, int i) throws IOException {
        C1567b bVar = new C1567b();
        int e = m10697e(inputStream, i, bVar);
        int i2 = bVar.f7687c - 8;
        if (e == 0 || i2 > e) {
            return 0;
        }
        inputStream.skip((long) i2);
        return m10694b(inputStream, m10695c(inputStream, e - i2, bVar.f7685a, 274), bVar.f7685a);
    }

    /* renamed from: e */
    public static int m10697e(InputStream inputStream, int i, C1567b bVar) throws IOException {
        boolean z;
        if (i <= 8) {
            return 0;
        }
        int a = ra6.m26140a(inputStream, 4, false);
        bVar.f7686b = a;
        int i2 = i - 4;
        if (a == 1229531648 || a == 1296891946) {
            if (a == 1229531648) {
                z = true;
            } else {
                z = false;
            }
            bVar.f7685a = z;
            int a2 = ra6.m26140a(inputStream, 4, z);
            bVar.f7687c = a2;
            int i3 = i2 - 4;
            if (a2 >= 8 && a2 - 8 <= i3) {
                return i3;
            }
            oy1.m24417d(f7684a, "Invalid offset");
            return 0;
        }
        oy1.m24417d(f7684a, "Invalid TIFF header");
        return 0;
    }
}
