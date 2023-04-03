package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
class zzjb extends zzja {
    public final byte[] zza;

    public zzjb(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjd) || zzc() != ((zzjd) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzjb)) {
            return obj.equals(this);
        }
        zzjb zzjb = (zzjb) obj;
        int zzm = zzm();
        int zzm2 = zzjb.zzm();
        if (zzm != 0 && zzm2 != 0 && zzm != zzm2) {
            return false;
        }
        int zzc = zzc();
        if (zzc > zzjb.zzc()) {
            int zzc2 = zzc();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(zzc);
            sb.append(zzc2);
            throw new IllegalArgumentException(sb.toString());
        } else if (zzc <= zzjb.zzc()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzjb.zza;
            zzjb.zzd();
            int i = 0;
            int i2 = 0;
            while (i < zzc) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            int zzc3 = zzjb.zzc();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(zzc);
            sb2.append(", ");
            sb2.append(zzc3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    public final zzjd zze(int i, int i2) {
        int zzn = zzjd.zzn(0, i2, zzc());
        if (zzn == 0) {
            return zzjd.zzb;
        }
        return new zziy(this.zza, 0, zzn);
    }

    public final void zzf(k09 k09) throws IOException {
        ((C4086c) k09).mo30883E(this.zza, 0, zzc());
    }

    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzc(), charset);
    }

    public final boolean zzh() {
        return C4089f.m34183b(this.zza, 0, zzc());
    }

    public final int zzi(int i, int i2, int i3) {
        return p59.m49803h(i, this.zza, 0, i3);
    }
}
