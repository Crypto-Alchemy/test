package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.t */
/* compiled from: Internal */
public final class C4758t {

    /* renamed from: a */
    public static final Charset f25291a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f25292b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f25293c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f25294d;

    /* renamed from: e */
    public static final ByteBuffer f25295e;

    /* renamed from: f */
    public static final C4717g f25296f;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$a */
    /* compiled from: Internal */
    public interface C4759a extends C4767i<Boolean> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$b */
    /* compiled from: Internal */
    public interface C4760b extends C4767i<Double> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$c */
    /* compiled from: Internal */
    public interface C4761c {
        int getNumber();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$d */
    /* compiled from: Internal */
    public interface C4762d<T extends C4761c> {
        T findValueByNumber(int i);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$e */
    /* compiled from: Internal */
    public interface C4763e {
        boolean isInRange(int i);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$f */
    /* compiled from: Internal */
    public interface C4764f extends C4767i<Float> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$g */
    /* compiled from: Internal */
    public interface C4765g extends C4767i<Integer> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$h */
    /* compiled from: Internal */
    public interface C4766h extends C4767i<Long> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$i */
    /* compiled from: Internal */
    public interface C4767i<E> extends List<E>, RandomAccess {
        /* renamed from: a */
        C4767i<E> mo35757a(int i);

        /* renamed from: p */
        void mo35628p();

        /* renamed from: v */
        boolean mo35633v();
    }

    static {
        byte[] bArr = new byte[0];
        f25294d = bArr;
        f25295e = ByteBuffer.wrap(bArr);
        f25296f = C4717g.m37760j(bArr);
    }

    /* renamed from: a */
    public static <T> T m38320a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static <T> T m38321b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m38322c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m38323d(byte[] bArr) {
        return m38324e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m38324e(byte[] bArr, int i, int i2) {
        int i3 = m38328i(i2, bArr, i, i2);
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: f */
    public static int m38325f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m38326g(byte[] bArr) {
        return Utf8.m37406s(bArr);
    }

    /* renamed from: h */
    public static Object m38327h(Object obj, Object obj2) {
        return ((C4705c0) obj).toBuilder().mo35606b0((C4705c0) obj2).buildPartial();
    }

    /* renamed from: i */
    public static int m38328i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static String m38329j(byte[] bArr) {
        return new String(bArr, f25292b);
    }
}
