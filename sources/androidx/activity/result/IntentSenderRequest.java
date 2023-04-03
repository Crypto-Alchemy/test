package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0108a();

    /* renamed from: a */
    public final IntentSender f392a;

    /* renamed from: d */
    public final Intent f393d;

    /* renamed from: e */
    public final int f394e;

    /* renamed from: g */
    public final int f395g;

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    public class C0108a implements Parcelable.Creator<IntentSenderRequest> {
        /* renamed from: a */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        /* renamed from: b */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    /* renamed from: androidx.activity.result.IntentSenderRequest$b */
    public static final class C0109b {

        /* renamed from: a */
        public IntentSender f396a;

        /* renamed from: b */
        public Intent f397b;

        /* renamed from: c */
        public int f398c;

        /* renamed from: d */
        public int f399d;

        public C0109b(IntentSender intentSender) {
            this.f396a = intentSender;
        }

        /* renamed from: a */
        public IntentSenderRequest mo951a() {
            return new IntentSenderRequest(this.f396a, this.f397b, this.f398c, this.f399d);
        }

        /* renamed from: b */
        public C0109b mo952b(Intent intent) {
            this.f397b = intent;
            return this;
        }

        /* renamed from: c */
        public C0109b mo953c(int i, int i2) {
            this.f399d = i;
            this.f398c = i2;
            return this;
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f392a = intentSender;
        this.f393d = intent;
        this.f394e = i;
        this.f395g = i2;
    }

    /* renamed from: a */
    public Intent mo941a() {
        return this.f393d;
    }

    /* renamed from: b */
    public int mo942b() {
        return this.f394e;
    }

    /* renamed from: c */
    public int mo943c() {
        return this.f395g;
    }

    /* renamed from: d */
    public IntentSender mo944d() {
        return this.f392a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f392a, i);
        parcel.writeParcelable(this.f393d, i);
        parcel.writeInt(this.f394e);
        parcel.writeInt(this.f395g);
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f392a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f393d = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f394e = parcel.readInt();
        this.f395g = parcel.readInt();
    }
}
