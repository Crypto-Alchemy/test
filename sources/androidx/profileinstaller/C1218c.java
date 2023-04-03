package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: androidx.profileinstaller.c */
/* compiled from: ProfileTranscoder */
public class C1218c {

    /* renamed from: a */
    public static final byte[] f6301a = {112, 114, 111, 0};

    /* renamed from: b */
    public static final byte[] f6302b = {112, 114, 109, 0};

    /* renamed from: A */
    public static void m8651A(InputStream inputStream) throws IOException {
        rp1.m26363h(inputStream);
        int j = rp1.m26365j(inputStream);
        if (j != 6 && j != 7) {
            while (j > 0) {
                rp1.m26365j(inputStream);
                for (int j2 = rp1.m26365j(inputStream); j2 > 0; j2--) {
                    rp1.m26363h(inputStream);
                }
                j--;
            }
        }
    }

    /* renamed from: B */
    public static boolean m8652B(OutputStream outputStream, byte[] bArr, oe1[] oe1Arr) throws IOException {
        if (Arrays.equals(bArr, kw4.f14338a)) {
            m8664N(outputStream, oe1Arr);
            return true;
        } else if (Arrays.equals(bArr, kw4.f14339b)) {
            m8663M(outputStream, oe1Arr);
            return true;
        } else if (Arrays.equals(bArr, kw4.f14341d)) {
            m8661K(outputStream, oe1Arr);
            return true;
        } else if (Arrays.equals(bArr, kw4.f14340c)) {
            m8662L(outputStream, oe1Arr);
            return true;
        } else if (!Arrays.equals(bArr, kw4.f14342e)) {
            return false;
        } else {
            m8660J(outputStream, oe1Arr);
            return true;
        }
    }

    /* renamed from: C */
    public static void m8653C(OutputStream outputStream, oe1 oe1) throws IOException {
        int i = 0;
        for (int valueOf : oe1.f15844h) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            rp1.m26371p(outputStream, valueOf2.intValue() - i);
            i = valueOf2.intValue();
        }
    }

    /* renamed from: D */
    public static C1219d m8654D(oe1[] oe1Arr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            rp1.m26371p(byteArrayOutputStream, oe1Arr.length);
            int i = 2;
            for (oe1 oe1 : oe1Arr) {
                rp1.m26372q(byteArrayOutputStream, oe1.f15839c);
                rp1.m26372q(byteArrayOutputStream, oe1.f15840d);
                rp1.m26372q(byteArrayOutputStream, (long) oe1.f15843g);
                String j = m8675j(oe1.f15837a, oe1.f15838b, kw4.f14338a);
                int k = rp1.m26366k(j);
                rp1.m26371p(byteArrayOutputStream, k);
                i = i + 4 + 4 + 4 + 2 + (k * 1);
                rp1.m26369n(byteArrayOutputStream, j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                C1219d dVar = new C1219d(FileSectionType.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return dVar;
            }
            throw rp1.m26358c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: E */
    public static void m8655E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f6301a);
        outputStream.write(bArr);
    }

    /* renamed from: F */
    public static void m8656F(OutputStream outputStream, oe1 oe1) throws IOException {
        m8659I(outputStream, oe1);
        m8653C(outputStream, oe1);
        m8658H(outputStream, oe1);
    }

    /* renamed from: G */
    public static void m8657G(OutputStream outputStream, oe1 oe1, String str) throws IOException {
        rp1.m26371p(outputStream, rp1.m26366k(str));
        rp1.m26371p(outputStream, oe1.f15841e);
        rp1.m26372q(outputStream, (long) oe1.f15842f);
        rp1.m26372q(outputStream, oe1.f15839c);
        rp1.m26372q(outputStream, (long) oe1.f15843g);
        rp1.m26369n(outputStream, str);
    }

    /* renamed from: H */
    public static void m8658H(OutputStream outputStream, oe1 oe1) throws IOException {
        byte[] bArr = new byte[m8676k(oe1.f15843g)];
        for (Map.Entry next : oe1.f15845i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                m8691z(bArr, 2, intValue, oe1);
            }
            if ((intValue2 & 4) != 0) {
                m8691z(bArr, 4, intValue, oe1);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: I */
    public static void m8659I(OutputStream outputStream, oe1 oe1) throws IOException {
        int i = 0;
        for (Map.Entry next : oe1.f15845i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            if ((((Integer) next.getValue()).intValue() & 1) != 0) {
                rp1.m26371p(outputStream, intValue - i);
                rp1.m26371p(outputStream, 0);
                i = intValue;
            }
        }
    }

    /* renamed from: J */
    public static void m8660J(OutputStream outputStream, oe1[] oe1Arr) throws IOException {
        rp1.m26371p(outputStream, oe1Arr.length);
        for (oe1 oe1 : oe1Arr) {
            String j = m8675j(oe1.f15837a, oe1.f15838b, kw4.f14342e);
            rp1.m26371p(outputStream, rp1.m26366k(j));
            rp1.m26371p(outputStream, oe1.f15845i.size());
            rp1.m26371p(outputStream, oe1.f15844h.length);
            rp1.m26372q(outputStream, oe1.f15839c);
            rp1.m26369n(outputStream, j);
            for (Integer intValue : oe1.f15845i.keySet()) {
                rp1.m26371p(outputStream, intValue.intValue());
            }
            for (int p : oe1.f15844h) {
                rp1.m26371p(outputStream, p);
            }
        }
    }

    /* renamed from: K */
    public static void m8661K(OutputStream outputStream, oe1[] oe1Arr) throws IOException {
        rp1.m26373r(outputStream, oe1Arr.length);
        for (oe1 oe1 : oe1Arr) {
            String j = m8675j(oe1.f15837a, oe1.f15838b, kw4.f14341d);
            rp1.m26371p(outputStream, rp1.m26366k(j));
            rp1.m26371p(outputStream, oe1.f15844h.length);
            rp1.m26372q(outputStream, (long) (oe1.f15845i.size() * 4));
            rp1.m26372q(outputStream, oe1.f15839c);
            rp1.m26369n(outputStream, j);
            for (Integer intValue : oe1.f15845i.keySet()) {
                rp1.m26371p(outputStream, intValue.intValue());
                rp1.m26371p(outputStream, 0);
            }
            for (int p : oe1.f15844h) {
                rp1.m26371p(outputStream, p);
            }
        }
    }

    /* renamed from: L */
    public static void m8662L(OutputStream outputStream, oe1[] oe1Arr) throws IOException {
        byte[] b = m8667b(oe1Arr, kw4.f14340c);
        rp1.m26373r(outputStream, oe1Arr.length);
        rp1.m26368m(outputStream, b);
    }

    /* renamed from: M */
    public static void m8663M(OutputStream outputStream, oe1[] oe1Arr) throws IOException {
        byte[] b = m8667b(oe1Arr, kw4.f14339b);
        rp1.m26373r(outputStream, oe1Arr.length);
        rp1.m26368m(outputStream, b);
    }

    /* renamed from: N */
    public static void m8664N(OutputStream outputStream, oe1[] oe1Arr) throws IOException {
        m8665O(outputStream, oe1Arr);
    }

    /* renamed from: O */
    public static void m8665O(OutputStream outputStream, oe1[] oe1Arr) throws IOException {
        int i;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m8654D(oe1Arr));
        arrayList.add(m8668c(oe1Arr));
        arrayList.add(m8669d(oe1Arr));
        long length = ((long) kw4.f14338a.length) + ((long) f6301a.length) + 4 + ((long) (arrayList.size() * 16));
        rp1.m26372q(outputStream, (long) arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C1219d dVar = (C1219d) arrayList.get(i2);
            rp1.m26372q(outputStream, dVar.f6303a.getValue());
            rp1.m26372q(outputStream, length);
            if (dVar.f6306d) {
                byte[] bArr = dVar.f6305c;
                byte[] b = rp1.m26357b(bArr);
                arrayList2.add(b);
                rp1.m26372q(outputStream, (long) b.length);
                rp1.m26372q(outputStream, (long) bArr.length);
                i = b.length;
            } else {
                arrayList2.add(dVar.f6305c);
                rp1.m26372q(outputStream, (long) dVar.f6305c.length);
                rp1.m26372q(outputStream, 0);
                i = dVar.f6305c.length;
            }
            length += (long) i;
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            outputStream.write((byte[]) arrayList2.get(i3));
        }
    }

    /* renamed from: a */
    public static int m8666a(oe1 oe1) {
        int i = 0;
        for (Map.Entry<Integer, Integer> value : oe1.f15845i.entrySet()) {
            i |= ((Integer) value.getValue()).intValue();
        }
        return i;
    }

    /* renamed from: b */
    public static byte[] m8667b(oe1[] oe1Arr, byte[] bArr) throws IOException {
        int i = 0;
        int i2 = 0;
        for (oe1 oe1 : oe1Arr) {
            i2 += rp1.m26366k(m8675j(oe1.f15837a, oe1.f15838b, bArr)) + 16 + (oe1.f15841e * 2) + oe1.f15842f + m8676k(oe1.f15843g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, kw4.f14340c)) {
            int length = oe1Arr.length;
            while (i < length) {
                oe1 oe12 = oe1Arr[i];
                m8657G(byteArrayOutputStream, oe12, m8675j(oe12.f15837a, oe12.f15838b, bArr));
                m8656F(byteArrayOutputStream, oe12);
                i++;
            }
        } else {
            for (oe1 oe13 : oe1Arr) {
                m8657G(byteArrayOutputStream, oe13, m8675j(oe13.f15837a, oe13.f15838b, bArr));
            }
            int length2 = oe1Arr.length;
            while (i < length2) {
                m8656F(byteArrayOutputStream, oe1Arr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw rp1.m26358c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    /* renamed from: c */
    public static C1219d m8668c(oe1[] oe1Arr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (i < oe1Arr.length) {
            try {
                oe1 oe1 = oe1Arr[i];
                rp1.m26371p(byteArrayOutputStream, i);
                rp1.m26371p(byteArrayOutputStream, oe1.f15841e);
                i2 = i2 + 2 + 2 + (oe1.f15841e * 2);
                m8653C(byteArrayOutputStream, oe1);
                i++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i2 == byteArray.length) {
            C1219d dVar = new C1219d(FileSectionType.CLASSES, i2, byteArray, true);
            byteArrayOutputStream.close();
            return dVar;
        }
        throw rp1.m26358c("Expected size " + i2 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    /* renamed from: d */
    public static C1219d m8669d(oe1[] oe1Arr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (i < oe1Arr.length) {
            try {
                oe1 oe1 = oe1Arr[i];
                int a = m8666a(oe1);
                byte[] e = m8670e(oe1);
                byte[] f = m8671f(oe1);
                rp1.m26371p(byteArrayOutputStream, i);
                int length = e.length + 2 + f.length;
                rp1.m26372q(byteArrayOutputStream, (long) length);
                rp1.m26371p(byteArrayOutputStream, a);
                byteArrayOutputStream.write(e);
                byteArrayOutputStream.write(f);
                i2 = i2 + 2 + 4 + length;
                i++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i2 == byteArray.length) {
            C1219d dVar = new C1219d(FileSectionType.METHODS, i2, byteArray, true);
            byteArrayOutputStream.close();
            return dVar;
        }
        throw rp1.m26358c("Expected size " + i2 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    /* renamed from: e */
    public static byte[] m8670e(oe1 oe1) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m8658H(byteArrayOutputStream, oe1);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: f */
    public static byte[] m8671f(oe1 oe1) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m8659I(byteArrayOutputStream, oe1);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: g */
    public static String m8672g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        if (":".equals(str2)) {
            return str.replace("!", ":");
        }
        return str;
    }

    /* renamed from: h */
    public static String m8673h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    /* renamed from: i */
    public static oe1 m8674i(oe1[] oe1Arr, String str) {
        if (oe1Arr.length <= 0) {
            return null;
        }
        String h = m8673h(str);
        for (int i = 0; i < oe1Arr.length; i++) {
            if (oe1Arr[i].f15838b.equals(h)) {
                return oe1Arr[i];
            }
        }
        return null;
    }

    /* renamed from: j */
    public static String m8675j(String str, String str2, byte[] bArr) {
        String a = kw4.m21090a(bArr);
        if (str.length() <= 0) {
            return m8672g(str2, a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m8672g(str2, a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + kw4.m21090a(bArr) + str2;
    }

    /* renamed from: k */
    public static int m8676k(int i) {
        return m8690y(i * 2) / 8;
    }

    /* renamed from: l */
    public static int m8677l(int i, int i2, int i3) {
        if (i == 1) {
            throw rp1.m26358c("HOT methods are not stored in the bitmap");
        } else if (i == 2) {
            return i2;
        } else {
            if (i == 4) {
                return i2 + i3;
            }
            throw rp1.m26358c("Unexpected flag: " + i);
        }
    }

    /* renamed from: m */
    public static int[] m8678m(InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += rp1.m26363h(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    /* renamed from: n */
    public static int m8679n(BitSet bitSet, int i, int i2) {
        int i3 = 2;
        if (!bitSet.get(m8677l(2, i, i2))) {
            i3 = 0;
        }
        if (bitSet.get(m8677l(4, i, i2))) {
            return i3 | 4;
        }
        return i3;
    }

    /* renamed from: o */
    public static byte[] m8680o(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, rp1.m26359d(inputStream, bArr.length))) {
            return rp1.m26359d(inputStream, kw4.f14339b.length);
        }
        throw rp1.m26358c("Invalid magic");
    }

    /* renamed from: p */
    public static void m8681p(InputStream inputStream, oe1 oe1) throws IOException {
        int available = inputStream.available() - oe1.f15842f;
        int i = 0;
        while (inputStream.available() > available) {
            i += rp1.m26363h(inputStream);
            oe1.f15845i.put(Integer.valueOf(i), 1);
            for (int h = rp1.m26363h(inputStream); h > 0; h--) {
                m8651A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw rp1.m26358c("Read too much data during profile line parse");
        }
    }

    /* renamed from: q */
    public static oe1[] m8682q(InputStream inputStream, byte[] bArr, byte[] bArr2, oe1[] oe1Arr) throws IOException {
        if (Arrays.equals(bArr, kw4.f14343f)) {
            if (!Arrays.equals(kw4.f14338a, bArr2)) {
                return m8683r(inputStream, bArr, oe1Arr);
            }
            throw rp1.m26358c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, kw4.f14344g)) {
            return m8685t(inputStream, bArr2, oe1Arr);
        } else {
            throw rp1.m26358c("Unsupported meta version");
        }
    }

    /* renamed from: r */
    public static oe1[] m8683r(InputStream inputStream, byte[] bArr, oe1[] oe1Arr) throws IOException {
        if (Arrays.equals(bArr, kw4.f14343f)) {
            int j = rp1.m26365j(inputStream);
            byte[] e = rp1.m26360e(inputStream, (int) rp1.m26364i(inputStream), (int) rp1.m26364i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                try {
                    oe1[] s = m8684s(byteArrayInputStream, j, oe1Arr);
                    byteArrayInputStream.close();
                    return s;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw rp1.m26358c("Content found after the end of file");
            }
        } else {
            throw rp1.m26358c("Unsupported meta version");
        }
        throw th;
    }

    /* renamed from: s */
    public static oe1[] m8684s(InputStream inputStream, int i, oe1[] oe1Arr) throws IOException {
        int i2 = 0;
        if (inputStream.available() == 0) {
            return new oe1[0];
        }
        if (i == oe1Arr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i3 = 0; i3 < i; i3++) {
                int h = rp1.m26363h(inputStream);
                iArr[i3] = rp1.m26363h(inputStream);
                strArr[i3] = rp1.m26361f(inputStream, h);
            }
            while (i2 < i) {
                oe1 oe1 = oe1Arr[i2];
                if (oe1.f15838b.equals(strArr[i2])) {
                    int i4 = iArr[i2];
                    oe1.f15841e = i4;
                    oe1.f15844h = m8678m(inputStream, i4);
                    i2++;
                } else {
                    throw rp1.m26358c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return oe1Arr;
        }
        throw rp1.m26358c("Mismatched number of dex files found in metadata");
    }

    /* renamed from: t */
    public static oe1[] m8685t(InputStream inputStream, byte[] bArr, oe1[] oe1Arr) throws IOException {
        int h = rp1.m26363h(inputStream);
        byte[] e = rp1.m26360e(inputStream, (int) rp1.m26364i(inputStream), (int) rp1.m26364i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
            try {
                oe1[] u = m8686u(byteArrayInputStream, bArr, h, oe1Arr);
                byteArrayInputStream.close();
                return u;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw rp1.m26358c("Content found after the end of file");
        }
        throw th;
    }

    /* renamed from: u */
    public static oe1[] m8686u(InputStream inputStream, byte[] bArr, int i, oe1[] oe1Arr) throws IOException {
        int i2 = 0;
        if (inputStream.available() == 0) {
            return new oe1[0];
        }
        if (i == oe1Arr.length) {
            while (i2 < i) {
                rp1.m26363h(inputStream);
                String f = rp1.m26361f(inputStream, rp1.m26363h(inputStream));
                long i3 = rp1.m26364i(inputStream);
                int h = rp1.m26363h(inputStream);
                oe1 i4 = m8674i(oe1Arr, f);
                if (i4 != null) {
                    i4.f15840d = i3;
                    int[] m = m8678m(inputStream, h);
                    if (Arrays.equals(bArr, kw4.f14342e)) {
                        i4.f15841e = h;
                        i4.f15844h = m;
                    }
                    i2++;
                } else {
                    throw rp1.m26358c("Missing profile key: " + f);
                }
            }
            return oe1Arr;
        }
        throw rp1.m26358c("Mismatched number of dex files found in metadata");
    }

    /* renamed from: v */
    public static void m8687v(InputStream inputStream, oe1 oe1) throws IOException {
        BitSet valueOf = BitSet.valueOf(rp1.m26359d(inputStream, rp1.m26356a(oe1.f15843g * 2)));
        int i = 0;
        while (true) {
            int i2 = oe1.f15843g;
            if (i < i2) {
                int n = m8679n(valueOf, i, i2);
                if (n != 0) {
                    Integer num = oe1.f15845i.get(Integer.valueOf(i));
                    if (num == null) {
                        num = 0;
                    }
                    oe1.f15845i.put(Integer.valueOf(i), Integer.valueOf(n | num.intValue()));
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: w */
    public static oe1[] m8688w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, kw4.f14339b)) {
            int j = rp1.m26365j(inputStream);
            byte[] e = rp1.m26360e(inputStream, (int) rp1.m26364i(inputStream), (int) rp1.m26364i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                try {
                    oe1[] x = m8689x(byteArrayInputStream, str, j);
                    byteArrayInputStream.close();
                    return x;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw rp1.m26358c("Content found after the end of file");
            }
        } else {
            throw rp1.m26358c("Unsupported version");
        }
        throw th;
    }

    /* renamed from: x */
    public static oe1[] m8689x(InputStream inputStream, String str, int i) throws IOException {
        InputStream inputStream2 = inputStream;
        int i2 = i;
        if (inputStream.available() == 0) {
            return new oe1[0];
        }
        oe1[] oe1Arr = new oe1[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = rp1.m26363h(inputStream);
            int h2 = rp1.m26363h(inputStream);
            long i4 = rp1.m26364i(inputStream);
            String str2 = str;
            oe1Arr[i3] = new oe1(str2, rp1.m26361f(inputStream2, h), rp1.m26364i(inputStream), 0, h2, (int) i4, (int) rp1.m26364i(inputStream), new int[h2], new TreeMap());
        }
        for (int i5 = 0; i5 < i2; i5++) {
            oe1 oe1 = oe1Arr[i5];
            m8681p(inputStream2, oe1);
            oe1.f15844h = m8678m(inputStream2, oe1.f15841e);
            m8687v(inputStream2, oe1);
        }
        return oe1Arr;
    }

    /* renamed from: y */
    public static int m8690y(int i) {
        return ((i + 8) - 1) & -8;
    }

    /* renamed from: z */
    public static void m8691z(byte[] bArr, int i, int i2, oe1 oe1) {
        int l = m8677l(i, i2, oe1.f15843g);
        int i3 = l / 8;
        bArr[i3] = (byte) ((1 << (l % 8)) | bArr[i3]);
    }
}
