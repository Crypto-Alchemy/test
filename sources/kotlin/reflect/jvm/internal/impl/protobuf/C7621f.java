package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.f */
/* compiled from: Internal */
public class C7621f {

    /* renamed from: a */
    public static final byte[] f39965a;

    /* renamed from: b */
    public static final ByteBuffer f39966b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.f$a */
    /* compiled from: Internal */
    public interface C7622a {
        int getNumber();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.f$b */
    /* compiled from: Internal */
    public interface C7623b<T extends C7622a> {
        T findValueByNumber(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f39965a = bArr;
        f39966b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public static boolean m62042a(byte[] bArr) {
        return f67.m57623e(bArr);
    }

    /* renamed from: b */
    public static String m62043b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
