package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.zza;

/* renamed from: he8 */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class he8 implements Parcelable.Creator<zza> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zza(parcel.readStrongBinder());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
