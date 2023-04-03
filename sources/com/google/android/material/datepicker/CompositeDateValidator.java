package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C4257c();

    /* renamed from: e */
    public static final C4258d f23722e = new C4255a();

    /* renamed from: g */
    public static final C4258d f23723g = new C4256b();

    /* renamed from: a */
    public final C4258d f23724a;

    /* renamed from: d */
    public final List<CalendarConstraints.DateValidator> f23725d;

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$a */
    public static class C4255a implements C4258d {
        /* renamed from: a */
        public boolean mo32506a(List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && next.mo32495k0(j)) {
                    return true;
                }
            }
            return false;
        }

        public int getId() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$b */
    public static class C4256b implements C4258d {
        /* renamed from: a */
        public boolean mo32506a(List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && !next.mo32495k0(j)) {
                    return false;
                }
            }
            return true;
        }

        public int getId() {
            return 2;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$c */
    public static class C4257c implements Parcelable.Creator<CompositeDateValidator> {
        /* renamed from: a */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            C4258d dVar;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                dVar = CompositeDateValidator.f23723g;
            } else if (readInt == 1) {
                dVar = CompositeDateValidator.f23722e;
            } else {
                dVar = CompositeDateValidator.f23723g;
            }
            return new CompositeDateValidator((List) gu4.m18428f(readArrayList), dVar, (C4255a) null);
        }

        /* renamed from: b */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$d */
    public interface C4258d {
        /* renamed from: a */
        boolean mo32506a(List<CalendarConstraints.DateValidator> list, long j);

        int getId();
    }

    public /* synthetic */ CompositeDateValidator(List list, C4258d dVar, C4255a aVar) {
        this(list, dVar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (!this.f23725d.equals(compositeDateValidator.f23725d) || this.f23724a.getId() != compositeDateValidator.f23724a.getId()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f23725d.hashCode();
    }

    /* renamed from: k0 */
    public boolean mo32495k0(long j) {
        return this.f23724a.mo32506a(this.f23725d, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f23725d);
        parcel.writeInt(this.f23724a.getId());
    }

    public CompositeDateValidator(List<CalendarConstraints.DateValidator> list, C4258d dVar) {
        this.f23725d = list;
        this.f23724a = dVar;
    }
}
