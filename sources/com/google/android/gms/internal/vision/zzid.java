package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
class zzid extends zzia {
    public final byte[] zzb;

    public zzid(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzht) || zza() != ((zzht) obj).zza()) {
            return false;
        }
        if (zza() == 0) {
            return true;
        }
        if (!(obj instanceof zzid)) {
            return obj.equals(this);
        }
        zzid zzid = (zzid) obj;
        int zzd = zzd();
        int zzd2 = zzid.zzd();
        if (zzd == 0 || zzd2 == 0 || zzd == zzd2) {
            return zza(zzid, 0, zza());
        }
        return false;
    }

    public byte zza(int i) {
        return this.zzb[i];
    }

    public byte zzb(int i) {
        return this.zzb[i];
    }

    public final boolean zzc() {
        int zze = zze();
        return C4123i0.m34290g(this.zzb, zze, zza() + zze);
    }

    public int zze() {
        return 0;
    }

    public int zza() {
        return this.zzb.length;
    }

    public final zzht zza(int i, int i2) {
        int zzb2 = zzht.zzb(0, i2, zza());
        if (zzb2 == 0) {
            return zzht.zza;
        }
        return new zzhw(this.zzb, zze(), zzb2);
    }

    public void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, 0, bArr, 0, i3);
    }

    public final void zza(bx8 bx8) throws IOException {
        bx8.mo29800a(this.zzb, zze(), zza());
    }

    public final String zza(Charset charset) {
        return new String(this.zzb, zze(), zza(), charset);
    }

    public final boolean zza(zzht zzht, int i, int i2) {
        if (i2 > zzht.zza()) {
            int zza = zza();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zza);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzht.zza()) {
            int zza2 = zzht.zza();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zza2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzht instanceof zzid)) {
            return zzht.zza(0, i2).equals(zza(0, i2));
        } else {
            zzid zzid = (zzid) zzht;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzid.zzb;
            int zze = zze() + i2;
            int zze2 = zze();
            int zze3 = zzid.zze();
            while (zze2 < zze) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        }
    }

    public final int zza(int i, int i2, int i3) {
        return t19.m52044a(i, this.zzb, zze(), i3);
    }
}
