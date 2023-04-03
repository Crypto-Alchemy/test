package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: rk5 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class rk5 {
    /* renamed from: A */
    public static void m51124A(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m51125a(Parcel parcel) {
        return m51148x(parcel, 20293);
    }

    /* renamed from: b */
    public static void m51126b(Parcel parcel, int i) {
        m51149y(parcel, i);
    }

    /* renamed from: c */
    public static void m51127c(Parcel parcel, int i, boolean z) {
        m51150z(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m51128d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m51150z(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m51129e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int x = m51148x(parcel, i);
            parcel.writeBundle(bundle);
            m51149y(parcel, x);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m51130f(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int x = m51148x(parcel, i);
            parcel.writeByteArray(bArr);
            m51149y(parcel, x);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: g */
    public static void m51131g(Parcel parcel, int i, byte[][] bArr, boolean z) {
        if (bArr != null) {
            int x = m51148x(parcel, i);
            parcel.writeInt(r5);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            m51149y(parcel, x);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: h */
    public static void m51132h(Parcel parcel, int i, double d) {
        m51150z(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: i */
    public static void m51133i(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m51150z(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: j */
    public static void m51134j(Parcel parcel, int i, float f) {
        m51150z(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: k */
    public static void m51135k(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m51150z(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: l */
    public static void m51136l(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int x = m51148x(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m51149y(parcel, x);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: m */
    public static void m51137m(Parcel parcel, int i, int i2) {
        m51150z(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: n */
    public static void m51138n(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int x = m51148x(parcel, i);
            parcel.writeIntArray(iArr);
            m51149y(parcel, x);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: o */
    public static void m51139o(Parcel parcel, int i, long j) {
        m51150z(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: p */
    public static void m51140p(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m51150z(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static void m51141q(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int x = m51148x(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m51149y(parcel, x);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static void m51142r(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int x = m51148x(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m51149y(parcel, x);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: s */
    public static void m51143s(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int x = m51148x(parcel, i);
            parcel.writeString(str);
            m51149y(parcel, x);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: t */
    public static void m51144t(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int x = m51148x(parcel, i);
            parcel.writeStringArray(strArr);
            m51149y(parcel, x);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: u */
    public static void m51145u(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int x = m51148x(parcel, i);
            parcel.writeStringList(list);
            m51149y(parcel, x);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: v */
    public static <T extends Parcelable> void m51146v(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int x = m51148x(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m51124A(parcel, t, i2);
                }
            }
            m51149y(parcel, x);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: w */
    public static <T extends Parcelable> void m51147w(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int x = m51148x(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m51124A(parcel, parcelable, 0);
                }
            }
            m51149y(parcel, x);
        } else if (z) {
            m51150z(parcel, i, 0);
        }
    }

    /* renamed from: x */
    public static int m51148x(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: y */
    public static void m51149y(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: z */
    public static void m51150z(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }
}
