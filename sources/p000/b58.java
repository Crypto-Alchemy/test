package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;

/* renamed from: b58 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class b58 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m33730J(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        float f = 0.0f;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 1:
                    i = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 2:
                    j = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 4:
                    str = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 5:
                    i3 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m33750r(parcel2, C);
                    break;
                case 8:
                    j2 = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 10:
                    str3 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 11:
                    i2 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 12:
                    str2 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 13:
                    str4 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 14:
                    i4 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 15:
                    f = SafeParcelReader.m33721A(parcel2, C);
                    break;
                case 16:
                    j3 = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 17:
                    str5 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 18:
                    z = SafeParcelReader.m33755w(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel2, J);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
