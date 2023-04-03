package p000;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: jk7 */
/* compiled from: WebpUtil */
public class jk7 {
    /* renamed from: a */
    public static boolean m20204a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m20205b(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: c */
    public static byte m20206c(InputStream inputStream) throws IOException {
        return (byte) (inputStream.read() & 255);
    }

    /* renamed from: d */
    public static String m20207d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append((char) b);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static int m20208e(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 24) & -16777216) | ((((byte) inputStream.read()) << 16) & 16711680) | ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: f */
    public static short m20209f(InputStream inputStream) throws IOException {
        return (short) (inputStream.read() & 255);
    }

    /* renamed from: g */
    public static Pair<Integer, Integer> m20210g(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            inputStream.read(bArr);
            if (!m20204a(bArr, "RIFF")) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
            m20208e(inputStream);
            inputStream.read(bArr);
            if (!m20204a(bArr, "WEBP")) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return null;
            }
            inputStream.read(bArr);
            String d = m20207d(bArr);
            if ("VP8 ".equals(d)) {
                Pair<Integer, Integer> h = m20211h(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return h;
            } else if ("VP8L".equals(d)) {
                Pair<Integer, Integer> i = m20212i(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return i;
            } else if ("VP8X".equals(d)) {
                Pair<Integer, Integer> j = m20213j(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                return j;
            } else {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                return null;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: h */
    public static Pair<Integer, Integer> m20211h(InputStream inputStream) throws IOException {
        inputStream.skip(7);
        short f = m20209f(inputStream);
        short f2 = m20209f(inputStream);
        short f3 = m20209f(inputStream);
        if (f == 157 && f2 == 1 && f3 == 42) {
            return new Pair<>(Integer.valueOf(m20205b(inputStream)), Integer.valueOf(m20205b(inputStream)));
        }
        return null;
    }

    /* renamed from: i */
    public static Pair<Integer, Integer> m20212i(InputStream inputStream) throws IOException {
        m20208e(inputStream);
        if (m20206c(inputStream) != 47) {
            return null;
        }
        byte read = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf(((((byte) inputStream.read()) & 255) | ((read & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((read & 192) >> 6)) + 1));
    }

    /* renamed from: j */
    public static Pair<Integer, Integer> m20213j(InputStream inputStream) throws IOException {
        inputStream.skip(8);
        return new Pair<>(Integer.valueOf(m20214k(inputStream) + 1), Integer.valueOf(m20214k(inputStream) + 1));
    }

    /* renamed from: k */
    public static int m20214k(InputStream inputStream) throws IOException {
        byte c = m20206c(inputStream);
        return ((m20206c(inputStream) << 16) & 16711680) | ((m20206c(inputStream) << 8) & 65280) | (c & 255);
    }
}
