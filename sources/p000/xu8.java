package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.phenotype.ExperimentTokens;

/* renamed from: xu8 */
public final class xu8 implements Parcelable.Creator<ExperimentTokens> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 2:
                    str = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 3:
                    bArr = SafeParcelReader.m33739g(parcel, C);
                    break;
                case 4:
                    bArr2 = SafeParcelReader.m33740h(parcel, C);
                    break;
                case 5:
                    bArr3 = SafeParcelReader.m33740h(parcel, C);
                    break;
                case 6:
                    bArr4 = SafeParcelReader.m33740h(parcel, C);
                    break;
                case 7:
                    bArr5 = SafeParcelReader.m33740h(parcel, C);
                    break;
                case 8:
                    iArr = SafeParcelReader.m33743k(parcel, C);
                    break;
                case 9:
                    bArr6 = SafeParcelReader.m33740h(parcel, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new ExperimentTokens(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExperimentTokens[i];
    }
}
