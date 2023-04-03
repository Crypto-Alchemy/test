package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C4253a();

    /* renamed from: a */
    public final Month f23710a;

    /* renamed from: d */
    public final Month f23711d;

    /* renamed from: e */
    public final DateValidator f23712e;

    /* renamed from: g */
    public Month f23713g;

    /* renamed from: k */
    public final int f23714k;

    /* renamed from: r */
    public final int f23715r;

    public interface DateValidator extends Parcelable {
        /* renamed from: k0 */
        boolean mo32495k0(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    public static class C4253a implements Parcelable.Creator<CalendarConstraints> {
        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (C4253a) null);
        }

        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    public static final class C4254b {

        /* renamed from: e */
        public static final long f23716e = d67.m43359a(Month.m35271d(1900, 0).f23769r);

        /* renamed from: f */
        public static final long f23717f = d67.m43359a(Month.m35271d(2100, 11).f23769r);

        /* renamed from: a */
        public long f23718a = f23716e;

        /* renamed from: b */
        public long f23719b = f23717f;

        /* renamed from: c */
        public Long f23720c;

        /* renamed from: d */
        public DateValidator f23721d = DateValidatorPointForward.m35236a(Long.MIN_VALUE);

        public C4254b(CalendarConstraints calendarConstraints) {
            this.f23718a = calendarConstraints.f23710a.f23769r;
            this.f23719b = calendarConstraints.f23711d.f23769r;
            this.f23720c = Long.valueOf(calendarConstraints.f23713g.f23769r);
            this.f23721d = calendarConstraints.f23712e;
        }

        /* renamed from: a */
        public CalendarConstraints mo32500a() {
            Month month;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f23721d);
            Month e = Month.m35272e(this.f23718a);
            Month e2 = Month.m35272e(this.f23719b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f23720c;
            if (l == null) {
                month = null;
            } else {
                month = Month.m35272e(l.longValue());
            }
            return new CalendarConstraints(e, e2, dateValidator, month, (C4253a) null);
        }

        /* renamed from: b */
        public C4254b mo32501b(long j) {
            this.f23720c = Long.valueOf(j);
            return this;
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, C4253a aVar) {
        this(month, month2, dateValidator, month3);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Month mo32484e(Month month) {
        if (month.compareTo(this.f23710a) < 0) {
            return this.f23710a;
        }
        if (month.compareTo(this.f23711d) > 0) {
            return this.f23711d;
        }
        return month;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.f23710a.equals(calendarConstraints.f23710a) || !this.f23711d.equals(calendarConstraints.f23711d) || !mf4.m22283a(this.f23713g, calendarConstraints.f23713g) || !this.f23712e.equals(calendarConstraints.f23712e)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public DateValidator mo32486f() {
        return this.f23712e;
    }

    /* renamed from: g */
    public Month mo32487g() {
        return this.f23711d;
    }

    /* renamed from: h */
    public int mo32488h() {
        return this.f23715r;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23710a, this.f23711d, this.f23713g, this.f23712e});
    }

    /* renamed from: i */
    public Month mo32490i() {
        return this.f23713g;
    }

    /* renamed from: j */
    public Month mo32491j() {
        return this.f23710a;
    }

    /* renamed from: k */
    public int mo32492k() {
        return this.f23714k;
    }

    /* renamed from: l */
    public boolean mo32493l(long j) {
        if (this.f23710a.mo32569h(1) <= j) {
            Month month = this.f23711d;
            if (j <= month.mo32569h(month.f23768k)) {
                return true;
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f23710a, 0);
        parcel.writeParcelable(this.f23711d, 0);
        parcel.writeParcelable(this.f23713g, 0);
        parcel.writeParcelable(this.f23712e, 0);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.f23710a = month;
        this.f23711d = month2;
        this.f23713g = month3;
        this.f23712e = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3 == null || month3.compareTo(month2) <= 0) {
            this.f23715r = month.mo32575p(month2) + 1;
            this.f23714k = (month2.f23766e - month.f23766e) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }
}
