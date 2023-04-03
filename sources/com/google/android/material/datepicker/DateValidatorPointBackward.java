package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new C4259a();

    /* renamed from: a */
    public final long f23726a;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointBackward$a */
    public static class C4259a implements Parcelable.Creator<DateValidatorPointBackward> {
        /* renamed from: a */
        public DateValidatorPointBackward createFromParcel(Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), (C4259a) null);
        }

        /* renamed from: b */
        public DateValidatorPointBackward[] newArray(int i) {
            return new DateValidatorPointBackward[i];
        }
    }

    public /* synthetic */ DateValidatorPointBackward(long j, C4259a aVar) {
        this(j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointBackward)) {
            return false;
        }
        if (this.f23726a == ((DateValidatorPointBackward) obj).f23726a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f23726a)});
    }

    /* renamed from: k0 */
    public boolean mo32495k0(long j) {
        if (j <= this.f23726a) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f23726a);
    }

    public DateValidatorPointBackward(long j) {
        this.f23726a = j;
    }
}
