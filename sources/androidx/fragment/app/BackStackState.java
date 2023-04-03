package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0613a();

    /* renamed from: a */
    public final List<String> f3606a;

    /* renamed from: d */
    public final List<BackStackRecordState> f3607d;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    public class C0613a implements Parcelable.Creator<BackStackState> {
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: b */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(Parcel parcel) {
        this.f3606a = parcel.createStringArrayList();
        this.f3607d = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3606a);
        parcel.writeTypedList(this.f3607d);
    }
}
