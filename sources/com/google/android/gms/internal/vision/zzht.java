package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public abstract class zzht implements Serializable, Iterable<Byte> {

    /* renamed from: a */
    public static final ay8 f22981a;

    /* renamed from: d */
    public static final Comparator<zzht> f22982d = new px8();
    public static final zzht zza = new zzid(t19.f34085c);
    private int zzc = 0;

    static {
        ay8 ay8;
        if (hw8.m45399b()) {
            ay8 = new sy8((hx8) null);
        } else {
            ay8 = new vx8((hx8) null);
        }
        f22981a = ay8;
    }

    /* renamed from: e */
    public static int m34374e(byte b) {
        return b & 255;
    }

    public static zzht zza(byte[] bArr, int i, int i2) {
        zzb(i, i + i2, bArr.length);
        return new zzid(f22981a.mo29389a(bArr, i, i2));
    }

    public static zzht zzb(byte[] bArr, int i, int i2) {
        return new zzhw(bArr, i, i2);
    }

    public static C4092a0 zzc(int i) {
        return new C4092a0(i, (hx8) null);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zza2 = zza();
            i = zza(zza2, 0, zza2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new hx8(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zza());
        if (zza() <= 50) {
            str = g89.m44665a(this);
        } else {
            str = String.valueOf(g89.m44665a(zza(0, 47))).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract int zza();

    public abstract int zza(int i, int i2, int i3);

    public abstract zzht zza(int i, int i2);

    public abstract String zza(Charset charset);

    public abstract void zza(bx8 bx8) throws IOException;

    public abstract void zza(byte[] bArr, int i, int i2, int i3);

    public abstract byte zzb(int i);

    public abstract boolean zzc();

    public final int zzd() {
        return this.zzc;
    }

    public final String zzb() {
        return zza() == 0 ? "" : zza(t19.f34083a);
    }

    public static zzht zza(byte[] bArr) {
        return new zzid(bArr);
    }

    public static zzht zza(String str) {
        return new zzid(str.getBytes(t19.f34083a));
    }

    public static int zzb(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }
}
