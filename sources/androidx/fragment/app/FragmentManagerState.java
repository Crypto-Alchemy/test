package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0646a();

    /* renamed from: a */
    public ArrayList<String> f3718a;

    /* renamed from: d */
    public ArrayList<String> f3719d;

    /* renamed from: e */
    public BackStackRecordState[] f3720e;

    /* renamed from: g */
    public int f3721g;

    /* renamed from: k */
    public String f3722k = null;

    /* renamed from: r */
    public ArrayList<String> f3723r = new ArrayList<>();

    /* renamed from: s */
    public ArrayList<BackStackState> f3724s = new ArrayList<>();

    /* renamed from: x */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f3725x;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    public class C0646a implements Parcelable.Creator<FragmentManagerState> {
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: b */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3718a);
        parcel.writeStringList(this.f3719d);
        parcel.writeTypedArray(this.f3720e, i);
        parcel.writeInt(this.f3721g);
        parcel.writeString(this.f3722k);
        parcel.writeStringList(this.f3723r);
        parcel.writeTypedList(this.f3724s);
        parcel.writeTypedList(this.f3725x);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3718a = parcel.createStringArrayList();
        this.f3719d = parcel.createStringArrayList();
        this.f3720e = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f3721g = parcel.readInt();
        this.f3722k = parcel.readString();
        this.f3723r = parcel.createStringArrayList();
        this.f3724s = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f3725x = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
