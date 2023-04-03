package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C4273a();

    /* renamed from: a */
    public final Calendar f23764a;

    /* renamed from: d */
    public final int f23765d;

    /* renamed from: e */
    public final int f23766e;

    /* renamed from: g */
    public final int f23767g;

    /* renamed from: k */
    public final int f23768k;

    /* renamed from: r */
    public final long f23769r;

    /* renamed from: s */
    public String f23770s;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    public static class C4273a implements Parcelable.Creator<Month> {
        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.m35271d(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar f = d67.m43364f(calendar);
        this.f23764a = f;
        this.f23765d = f.get(2);
        this.f23766e = f.get(1);
        this.f23767g = f.getMaximum(7);
        this.f23768k = f.getActualMaximum(5);
        this.f23769r = f.getTimeInMillis();
    }

    /* renamed from: d */
    public static Month m35271d(int i, int i2) {
        Calendar q = d67.m43375q();
        q.set(1, i);
        q.set(2, i2);
        return new Month(q);
    }

    /* renamed from: e */
    public static Month m35272e(long j) {
        Calendar q = d67.m43375q();
        q.setTimeInMillis(j);
        return new Month(q);
    }

    /* renamed from: f */
    public static Month m35273f() {
        return new Month(d67.m43373o());
    }

    /* renamed from: a */
    public int compareTo(Month month) {
        return this.f23764a.compareTo(month.f23764a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f23765d == month.f23765d && this.f23766e == month.f23766e) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public int mo32568g() {
        int firstDayOfWeek = this.f23764a.get(7) - this.f23764a.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.f23767g;
        }
        return firstDayOfWeek;
    }

    /* renamed from: h */
    public long mo32569h(int i) {
        Calendar f = d67.m43364f(this.f23764a);
        f.set(5, i);
        return f.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23765d), Integer.valueOf(this.f23766e)});
    }

    /* renamed from: i */
    public int mo32571i(long j) {
        Calendar f = d67.m43364f(this.f23764a);
        f.setTimeInMillis(j);
        return f.get(5);
    }

    /* renamed from: l */
    public String mo32572l(Context context) {
        if (this.f23770s == null) {
            this.f23770s = m21.m48041i(context, this.f23764a.getTimeInMillis());
        }
        return this.f23770s;
    }

    /* renamed from: m */
    public long mo32573m() {
        return this.f23764a.getTimeInMillis();
    }

    /* renamed from: o */
    public Month mo32574o(int i) {
        Calendar f = d67.m43364f(this.f23764a);
        f.add(2, i);
        return new Month(f);
    }

    /* renamed from: p */
    public int mo32575p(Month month) {
        if (this.f23764a instanceof GregorianCalendar) {
            return ((month.f23766e - this.f23766e) * 12) + (month.f23765d - this.f23765d);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23766e);
        parcel.writeInt(this.f23765d);
    }
}
