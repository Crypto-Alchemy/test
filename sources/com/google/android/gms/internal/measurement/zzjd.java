package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public abstract class zzjd implements Iterable<Byte>, Serializable {

    /* renamed from: a */
    public static final Comparator<zzjd> f22639a = new p09();

    /* renamed from: d */
    public static final n19 f22640d = new n19((m09) null);
    public static final zzjd zzb = new zzjb(p59.f32583c);
    private int zza = 0;

    static {
        int i = yz8.f35974a;
    }

    public static zzjd zzj(byte[] bArr, int i, int i2) {
        zzn(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzjb(bArr2);
    }

    public static zzjd zzk(String str) {
        return new zzjb(str.getBytes(p59.f32581a));
    }

    public static int zzn(int i, int i2, int i3) {
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

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzc = zzc();
            i = zzi(zzc, 0, zzc);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new m09(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzc());
        if (zzc() <= 50) {
            str = y99.m54660a(this);
        } else {
            str = String.valueOf(y99.m54660a(zze(0, 47))).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzc();

    public abstract zzjd zze(int i, int i2);

    public abstract void zzf(k09 k09) throws IOException;

    public abstract String zzg(Charset charset);

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public final String zzl(Charset charset) {
        if (zzc() == 0) {
            return "";
        }
        return zzg(charset);
    }

    public final int zzm() {
        return this.zza;
    }
}
