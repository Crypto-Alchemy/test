package p000;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzph;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpr;

/* renamed from: xf9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class xf9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzpk zzpk = null;
        zzpn zzpn = null;
        zzpo zzpo = null;
        zzpq zzpq = null;
        zzpp zzpp = null;
        zzpl zzpl = null;
        zzph zzph = null;
        zzpi zzpi = null;
        zzpj zzpj = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 1:
                    i = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 2:
                    str = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 3:
                    str2 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 4:
                    bArr = SafeParcelReader.m33739g(parcel2, C);
                    break;
                case 5:
                    pointArr = (Point[]) SafeParcelReader.m33751s(parcel2, C, Point.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 7:
                    zzpk = (zzpk) SafeParcelReader.m33747o(parcel2, C, zzpk.CREATOR);
                    break;
                case 8:
                    zzpn = (zzpn) SafeParcelReader.m33747o(parcel2, C, zzpn.CREATOR);
                    break;
                case 9:
                    zzpo = (zzpo) SafeParcelReader.m33747o(parcel2, C, zzpo.CREATOR);
                    break;
                case 10:
                    zzpq = (zzpq) SafeParcelReader.m33747o(parcel2, C, zzpq.CREATOR);
                    break;
                case 11:
                    zzpp = (zzpp) SafeParcelReader.m33747o(parcel2, C, zzpp.CREATOR);
                    break;
                case 12:
                    zzpl = (zzpl) SafeParcelReader.m33747o(parcel2, C, zzpl.CREATOR);
                    break;
                case 13:
                    zzph = (zzph) SafeParcelReader.m33747o(parcel2, C, zzph.CREATOR);
                    break;
                case 14:
                    zzpi = (zzpi) SafeParcelReader.m33747o(parcel2, C, zzpi.CREATOR);
                    break;
                case 15:
                    zzpj = (zzpj) SafeParcelReader.m33747o(parcel2, C, zzpj.CREATOR);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel2, J);
        return new zzpr(i, str, str2, bArr, pointArr, i2, zzpk, zzpn, zzpo, zzpq, zzpp, zzpl, zzph, zzpi, zzpj);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpr[i];
    }
}
