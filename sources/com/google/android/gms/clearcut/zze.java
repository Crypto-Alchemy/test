package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.C4003a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;

public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new gp8();

    /* renamed from: A */
    public final C4003a.C4006c f22124A;

    /* renamed from: B */
    public final C4003a.C4006c f22125B;

    /* renamed from: a */
    public zzr f22126a;

    /* renamed from: d */
    public byte[] f22127d;

    /* renamed from: e */
    public int[] f22128e;

    /* renamed from: g */
    public String[] f22129g;

    /* renamed from: k */
    public int[] f22130k;

    /* renamed from: r */
    public byte[][] f22131r;

    /* renamed from: s */
    public ExperimentTokens[] f22132s;

    /* renamed from: x */
    public boolean f22133x;

    /* renamed from: y */
    public final mv8 f22134y;

    public zze(zzr zzr, mv8 mv8, C4003a.C4006c cVar, C4003a.C4006c cVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, ExperimentTokens[] experimentTokensArr, boolean z) {
        this.f22126a = zzr;
        this.f22134y = mv8;
        this.f22124A = cVar;
        this.f22125B = null;
        this.f22128e = iArr;
        this.f22129g = null;
        this.f22130k = iArr2;
        this.f22131r = null;
        this.f22132s = null;
        this.f22133x = z;
    }

    public zze(zzr zzr, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr) {
        this.f22126a = zzr;
        this.f22127d = bArr;
        this.f22128e = iArr;
        this.f22129g = strArr;
        this.f22134y = null;
        this.f22124A = null;
        this.f22125B = null;
        this.f22130k = iArr2;
        this.f22131r = bArr2;
        this.f22132s = experimentTokensArr;
        this.f22133x = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zze) {
            zze zze = (zze) obj;
            return if4.m45709a(this.f22126a, zze.f22126a) && Arrays.equals(this.f22127d, zze.f22127d) && Arrays.equals(this.f22128e, zze.f22128e) && Arrays.equals(this.f22129g, zze.f22129g) && if4.m45709a(this.f22134y, zze.f22134y) && if4.m45709a(this.f22124A, zze.f22124A) && if4.m45709a(this.f22125B, zze.f22125B) && Arrays.equals(this.f22130k, zze.f22130k) && Arrays.deepEquals(this.f22131r, zze.f22131r) && Arrays.equals(this.f22132s, zze.f22132s) && this.f22133x == zze.f22133x;
        }
    }

    public final int hashCode() {
        return if4.m45710b(this.f22126a, this.f22127d, this.f22128e, this.f22129g, this.f22134y, this.f22124A, this.f22125B, this.f22130k, this.f22131r, this.f22132s, Boolean.valueOf(this.f22133x));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f22126a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f22127d;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f22128e));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f22129g));
        sb.append(", LogEvent: ");
        sb.append(this.f22134y);
        sb.append(", ExtensionProducer: ");
        sb.append(this.f22124A);
        sb.append(", VeProducer: ");
        sb.append(this.f22125B);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.f22130k));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f22131r));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.f22132s));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f22133x);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51142r(parcel, 2, this.f22126a, i, false);
        rk5.m51130f(parcel, 3, this.f22127d, false);
        rk5.m51138n(parcel, 4, this.f22128e, false);
        rk5.m51144t(parcel, 5, this.f22129g, false);
        rk5.m51138n(parcel, 6, this.f22130k, false);
        rk5.m51131g(parcel, 7, this.f22131r, false);
        rk5.m51127c(parcel, 8, this.f22133x);
        rk5.m51146v(parcel, 9, this.f22132s, i, false);
        rk5.m51126b(parcel, a);
    }
}
