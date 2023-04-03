package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;

/* renamed from: bv8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class bv8 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, (fy8) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}
