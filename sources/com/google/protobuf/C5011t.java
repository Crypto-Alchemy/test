package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.t */
/* compiled from: Internal */
public final class C5011t {

    /* renamed from: a */
    public static final Charset f25747a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f25748b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f25749c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f25750d;

    /* renamed from: e */
    public static final ByteBuffer f25751e;

    /* renamed from: f */
    public static final C4969g f25752f;

    /* renamed from: com.google.protobuf.t$a */
    /* compiled from: Internal */
    public interface C5012a extends C5020i<Boolean> {
        /* renamed from: a */
        C5012a mo37216a(int i);
    }

    /* renamed from: com.google.protobuf.t$b */
    /* compiled from: Internal */
    public interface C5013b extends C5020i<Double> {
        /* renamed from: a */
        C5013b mo37216a(int i);
    }

    /* renamed from: com.google.protobuf.t$c */
    /* compiled from: Internal */
    public interface C5014c {
        int getNumber();
    }

    /* renamed from: com.google.protobuf.t$d */
    /* compiled from: Internal */
    public interface C5015d<T extends C5014c> {
        T findValueByNumber(int i);
    }

    /* renamed from: com.google.protobuf.t$e */
    /* compiled from: Internal */
    public interface C5016e {
        boolean isInRange(int i);
    }

    /* renamed from: com.google.protobuf.t$f */
    /* compiled from: Internal */
    public interface C5017f extends C5020i<Float> {
        /* renamed from: a */
        C5017f mo37216a(int i);
    }

    /* renamed from: com.google.protobuf.t$g */
    /* compiled from: Internal */
    public interface C5018g extends C5020i<Integer> {
        /* renamed from: a */
        C5018g mo37216a(int i);
    }

    /* renamed from: com.google.protobuf.t$h */
    /* compiled from: Internal */
    public interface C5019h extends C5020i<Long> {
        /* renamed from: a */
        C5019h mo37216a(int i);
    }

    /* renamed from: com.google.protobuf.t$i */
    /* compiled from: Internal */
    public interface C5020i<E> extends List<E>, RandomAccess {
        /* renamed from: a */
        C5020i<E> mo37216a(int i);

        /* renamed from: p */
        void mo37085p();

        /* renamed from: v */
        boolean mo37090v();
    }

    static {
        byte[] bArr = new byte[0];
        f25750d = bArr;
        f25751e = ByteBuffer.wrap(bArr);
        f25752f = C4969g.m39349k(bArr);
    }

    /* renamed from: a */
    public static <T> T m39927a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static <T> T m39928b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m39929c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m39930d(byte[] bArr) {
        return m39931e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m39931e(byte[] bArr, int i, int i2) {
        int i3 = m39935i(i2, bArr, i, i2);
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: f */
    public static int m39932f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m39933g(byte[] bArr) {
        return Utf8.m38997s(bArr);
    }

    /* renamed from: h */
    public static Object m39934h(Object obj, Object obj2) {
        return ((C4956c0) obj).toBuilder().mergeFrom((C4956c0) obj2).buildPartial();
    }

    /* renamed from: i */
    public static int m39935i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static String m39936j(byte[] bArr) {
        return new String(bArr, f25748b);
    }
}
