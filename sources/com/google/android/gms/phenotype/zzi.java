package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Comparator;

public final class zzi extends AbstractSafeParcelable implements Comparable<zzi> {
    public static final Parcelable.Creator<zzi> CREATOR = new f49();

    /* renamed from: y */
    public static final Comparator<zzi> f23125y = new f19();

    /* renamed from: a */
    public final String f23126a;

    /* renamed from: d */
    public final long f23127d;

    /* renamed from: e */
    public final boolean f23128e;

    /* renamed from: g */
    public final double f23129g;

    /* renamed from: k */
    public final String f23130k;

    /* renamed from: r */
    public final byte[] f23131r;

    /* renamed from: s */
    public final int f23132s;

    /* renamed from: x */
    public final int f23133x;

    public zzi(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.f23126a = str;
        this.f23127d = j;
        this.f23128e = z;
        this.f23129g = d;
        this.f23130k = str2;
        this.f23131r = bArr;
        this.f23132s = i;
        this.f23133x = i2;
    }

    /* renamed from: r1 */
    public static int m34507r1(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        zzi zzi = (zzi) obj;
        int compareTo = this.f23126a.compareTo(zzi.f23126a);
        if (compareTo != 0) {
            return compareTo;
        }
        int r1 = m34507r1(this.f23132s, zzi.f23132s);
        if (r1 != 0) {
            return r1;
        }
        int i = this.f23132s;
        if (i == 1) {
            int i2 = (this.f23127d > zzi.f23127d ? 1 : (this.f23127d == zzi.f23127d ? 0 : -1));
            if (i2 < 0) {
                return -1;
            }
            return i2 == 0 ? 0 : 1;
        } else if (i == 2) {
            boolean z = this.f23128e;
            if (z == zzi.f23128e) {
                return 0;
            }
            return z ? 1 : -1;
        } else if (i == 3) {
            return Double.compare(this.f23129g, zzi.f23129g);
        } else {
            if (i == 4) {
                String str = this.f23130k;
                String str2 = zzi.f23130k;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            } else if (i == 5) {
                byte[] bArr = this.f23131r;
                byte[] bArr2 = zzi.f23131r;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i3 = 0; i3 < Math.min(this.f23131r.length, zzi.f23131r.length); i3++) {
                    int i4 = this.f23131r[i3] - zzi.f23131r[i3];
                    if (i4 != 0) {
                        return i4;
                    }
                }
                return m34507r1(this.f23131r.length, zzi.f23131r.length);
            } else {
                int i5 = this.f23132s;
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid enum value: ");
                sb.append(i5);
                throw new AssertionError(sb.toString());
            }
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof zzi) {
            zzi zzi = (zzi) obj;
            if (eb9.m43890a(this.f23126a, zzi.f23126a) && (i = this.f23132s) == zzi.f23132s && this.f23133x == zzi.f23133x) {
                if (i != 1) {
                    if (i == 2) {
                        return this.f23128e == zzi.f23128e;
                    }
                    if (i == 3) {
                        return this.f23129g == zzi.f23129g;
                    }
                    if (i == 4) {
                        return eb9.m43890a(this.f23130k, zzi.f23130k);
                    }
                    if (i == 5) {
                        return Arrays.equals(this.f23131r, zzi.f23131r);
                    }
                    int i2 = this.f23132s;
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Invalid enum value: ");
                    sb.append(i2);
                    throw new AssertionError(sb.toString());
                } else if (this.f23127d == zzi.f23127d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Flag(");
        sb.append(this.f23126a);
        sb.append(", ");
        int i = this.f23132s;
        if (i == 1) {
            sb.append(this.f23127d);
        } else if (i == 2) {
            sb.append(this.f23128e);
        } else if (i != 3) {
            if (i == 4) {
                sb.append("'");
                str = this.f23130k;
            } else if (i != 5) {
                String str2 = this.f23126a;
                int i2 = this.f23132s;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 27);
                sb2.append("Invalid type: ");
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(i2);
                throw new AssertionError(sb2.toString());
            } else if (this.f23131r == null) {
                sb.append("null");
            } else {
                sb.append("'");
                str = Base64.encodeToString(this.f23131r, 3);
            }
            sb.append(str);
            sb.append("'");
        } else {
            sb.append(this.f23129g);
        }
        sb.append(", ");
        sb.append(this.f23132s);
        sb.append(", ");
        sb.append(this.f23133x);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 2, this.f23126a, false);
        rk5.m51139o(parcel, 3, this.f23127d);
        rk5.m51127c(parcel, 4, this.f23128e);
        rk5.m51132h(parcel, 5, this.f23129g);
        rk5.m51143s(parcel, 6, this.f23130k, false);
        rk5.m51130f(parcel, 7, this.f23131r, false);
        rk5.m51137m(parcel, 8, this.f23132s);
        rk5.m51137m(parcel, 9, this.f23133x);
        rk5.m51126b(parcel, a);
    }
}
