package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C0102a();

    /* renamed from: a */
    public final int f368a;

    /* renamed from: d */
    public final Intent f369d;

    /* renamed from: androidx.activity.result.ActivityResult$a */
    public class C0102a implements Parcelable.Creator<ActivityResult> {
        /* renamed from: a */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        /* renamed from: b */
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.f368a = i;
        this.f369d = intent;
    }

    /* renamed from: c */
    public static String m630c(int i) {
        if (i == -1) {
            return "RESULT_OK";
        }
        if (i != 0) {
            return String.valueOf(i);
        }
        return "RESULT_CANCELED";
    }

    /* renamed from: a */
    public Intent mo917a() {
        return this.f369d;
    }

    /* renamed from: b */
    public int mo918b() {
        return this.f368a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m630c(this.f368a) + ", data=" + this.f369d + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f368a);
        if (this.f369d == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Intent intent = this.f369d;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f368a = parcel.readInt();
        this.f369d = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
