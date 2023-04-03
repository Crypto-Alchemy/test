package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: A */
    public static float m33721A(Parcel parcel, int i) {
        m33732L(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: B */
    public static Float m33722B(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        if (H == 0) {
            return null;
        }
        m33731K(parcel, i, H, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: C */
    public static int m33723C(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: D */
    public static IBinder m33724D(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + H);
        return readStrongBinder;
    }

    /* renamed from: E */
    public static int m33725E(Parcel parcel, int i) {
        m33732L(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: F */
    public static long m33726F(Parcel parcel, int i) {
        m33732L(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: G */
    public static Long m33727G(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        if (H == 0) {
            return null;
        }
        m33731K(parcel, i, H, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: H */
    public static int m33728H(Parcel parcel, int i) {
        if ((i & -65536) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    /* renamed from: I */
    public static void m33729I(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m33728H(parcel, i));
    }

    /* renamed from: J */
    public static int m33730J(Parcel parcel) {
        int C = m33723C(parcel);
        int H = m33728H(parcel, C);
        int dataPosition = parcel.dataPosition();
        if (m33754v(C) == 20293) {
            int i = H + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(C))), parcel);
    }

    /* renamed from: K */
    public static void m33731K(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            throw new ParseException("Expected size " + i3 + " got " + i2 + " (0x" + hexString + ")", parcel);
        }
    }

    /* renamed from: L */
    public static void m33732L(Parcel parcel, int i, int i2) {
        int H = m33728H(parcel, i);
        if (H != i2) {
            String hexString = Integer.toHexString(H);
            throw new ParseException("Expected size " + i2 + " got " + H + " (0x" + hexString + ")", parcel);
        }
    }

    /* renamed from: a */
    public static BigDecimal m33733a(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + H);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: b */
    public static BigDecimal[] m33734b(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + H);
        return bigDecimalArr;
    }

    /* renamed from: c */
    public static BigInteger m33735c(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + H);
        return new BigInteger(createByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m33736d(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + H);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m33737e(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + H);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m33738f(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + H);
        return readBundle;
    }

    /* renamed from: g */
    public static byte[] m33739g(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + H);
        return createByteArray;
    }

    /* renamed from: h */
    public static byte[][] m33740h(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + H);
        return bArr;
    }

    /* renamed from: i */
    public static double[] m33741i(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + H);
        return createDoubleArray;
    }

    /* renamed from: j */
    public static float[] m33742j(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + H);
        return createFloatArray;
    }

    /* renamed from: k */
    public static int[] m33743k(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + H);
        return createIntArray;
    }

    /* renamed from: l */
    public static long[] m33744l(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + H);
        return createLongArray;
    }

    /* renamed from: m */
    public static Parcel m33745m(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, H);
        parcel.setDataPosition(dataPosition + H);
        return obtain;
    }

    /* renamed from: n */
    public static Parcel[] m33746n(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + H);
        return parcelArr;
    }

    /* renamed from: o */
    public static <T extends Parcelable> T m33747o(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + H);
        return t;
    }

    /* renamed from: p */
    public static String m33748p(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + H);
        return readString;
    }

    /* renamed from: q */
    public static String[] m33749q(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + H);
        return createStringArray;
    }

    /* renamed from: r */
    public static ArrayList<String> m33750r(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + H);
        return createStringArrayList;
    }

    /* renamed from: s */
    public static <T> T[] m33751s(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + H);
        return createTypedArray;
    }

    /* renamed from: t */
    public static <T> ArrayList<T> m33752t(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int H = m33728H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + H);
        return createTypedArrayList;
    }

    /* renamed from: u */
    public static void m33753u(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new ParseException("Overread allowed size end=" + i, parcel);
        }
    }

    /* renamed from: v */
    public static int m33754v(int i) {
        return (char) i;
    }

    /* renamed from: w */
    public static boolean m33755w(Parcel parcel, int i) {
        m33732L(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static Boolean m33756x(Parcel parcel, int i) {
        boolean z;
        int H = m33728H(parcel, i);
        if (H == 0) {
            return null;
        }
        m33731K(parcel, i, H, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: y */
    public static double m33757y(Parcel parcel, int i) {
        m33732L(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: z */
    public static Double m33758z(Parcel parcel, int i) {
        int H = m33728H(parcel, i);
        if (H == 0) {
            return null;
        }
        m33731K(parcel, i, H, 8);
        return Double.valueOf(parcel.readDouble());
    }
}
