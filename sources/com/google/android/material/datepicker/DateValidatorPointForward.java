package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C4260a();

    /* renamed from: a */
    public final long f23727a;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    public static class C4260a implements Parcelable.Creator<DateValidatorPointForward> {
        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), (C4260a) null);
        }

        /* renamed from: b */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    public /* synthetic */ DateValidatorPointForward(long j, C4260a aVar) {
        this(j);
    }

    /* renamed from: a */
    public static DateValidatorPointForward m35236a(long j) {
        return new DateValidatorPointForward(j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointForward)) {
            return false;
        }
        if (this.f23727a == ((DateValidatorPointForward) obj).f23727a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f23727a)});
    }

    /* renamed from: k0 */
    public boolean mo32495k0(long j) {
        if (j >= this.f23727a) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f23727a);
    }

    public DateValidatorPointForward(long j) {
        this.f23727a = j;
    }
}
