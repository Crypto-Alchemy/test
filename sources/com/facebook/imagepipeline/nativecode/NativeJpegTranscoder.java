package com.facebook.imagepipeline.nativecode;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@ii1
public class NativeJpegTranscoder implements yr2 {

    /* renamed from: a */
    public boolean f9638a;

    /* renamed from: b */
    public int f9639b;

    /* renamed from: c */
    public boolean f9640c;

    public NativeJpegTranscoder(boolean z, int i, boolean z2, boolean z3) {
        this.f9638a = z;
        this.f9639b = i;
        this.f9640c = z2;
        if (z3) {
            t34.m27266a();
        }
    }

    /* renamed from: e */
    public static void m13525e(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        t34.m27266a();
        boolean z5 = false;
        if (i2 >= 1) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        au4.m10787b(Boolean.valueOf(z2));
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        au4.m10787b(Boolean.valueOf(z3));
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        au4.m10787b(Boolean.valueOf(z4));
        au4.m10787b(Boolean.valueOf(x33.m29868i(i)));
        if (!(i2 == 8 && i == 0)) {
            z5 = true;
        }
        au4.m10788c(z5, "no transformation requested");
        nativeTranscodeJpeg((InputStream) au4.m10792g(inputStream), (OutputStream) au4.m10792g(outputStream), i, i2, i3);
    }

    /* renamed from: f */
    public static void m13526f(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        t34.m27266a();
        boolean z5 = false;
        if (i2 >= 1) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        au4.m10787b(Boolean.valueOf(z2));
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        au4.m10787b(Boolean.valueOf(z3));
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        au4.m10787b(Boolean.valueOf(z4));
        au4.m10787b(Boolean.valueOf(x33.m29867h(i)));
        if (!(i2 == 8 && i == 1)) {
            z5 = true;
        }
        au4.m10788c(z5, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) au4.m10792g(inputStream), (OutputStream) au4.m10792g(outputStream), i, i2, i3);
    }

    @ii1
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @ii1
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    /* renamed from: a */
    public String mo13377a() {
        return "NativeJpegTranscoder";
    }

    /* renamed from: b */
    public boolean mo13378b(gp1 gp1, xh5 xh5, te5 te5) {
        if (xh5 == null) {
            xh5 = xh5.m30104a();
        }
        if (x33.m29864e(xh5, te5, gp1, this.f9638a) < 8) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo13379c(rq2 rq2) {
        if (rq2 == r81.f17197a) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public xr2 mo13380d(gp1 gp1, OutputStream outputStream, xh5 xh5, te5 te5, rq2 rq2, Integer num) throws IOException {
        if (num == null) {
            num = 85;
        }
        if (xh5 == null) {
            xh5 = xh5.m30104a();
        }
        int b = ti1.m27754b(xh5, te5, gp1, this.f9639b);
        InputStream inputStream = null;
        try {
            int e = x33.m29864e(xh5, te5, gp1, this.f9638a);
            int a = x33.m29860a(b);
            if (this.f9640c) {
                e = a;
            }
            inputStream = gp1.mo20752l();
            if (x33.f19311a.contains(Integer.valueOf(gp1.mo20748h()))) {
                m13526f((InputStream) au4.m10793h(inputStream, "Cannot transcode from null input stream!"), outputStream, x33.m29862c(xh5, gp1), e, num.intValue());
            } else {
                m13525e((InputStream) au4.m10793h(inputStream, "Cannot transcode from null input stream!"), outputStream, x33.m29863d(xh5, gp1), e, num.intValue());
            }
            rh0.m26191b(inputStream);
            int i = 1;
            if (b != 1) {
                i = 0;
            }
            return new xr2(i);
        } catch (Throwable th) {
            rh0.m26191b(inputStream);
            throw th;
        }
    }
}
