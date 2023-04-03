package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C4451a();

    /* renamed from: a */
    public final np3 f24641a;

    /* renamed from: d */
    public final np3 f24642d;

    /* renamed from: e */
    public final int f24643e;

    /* renamed from: g */
    public int f24644g;

    /* renamed from: k */
    public int f24645k;

    /* renamed from: r */
    public int f24646r;

    /* renamed from: s */
    public int f24647s;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    public static class C4451a implements Parcelable.Creator<TimeModel> {
        /* renamed from: a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* renamed from: b */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    /* renamed from: a */
    public static String m36288a(Resources resources, CharSequence charSequence) {
        return m36289b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m36289b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    /* renamed from: c */
    public static int m36290c(int i) {
        return i >= 12 ? 1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.f24644g == timeModel.f24644g && this.f24645k == timeModel.f24645k && this.f24643e == timeModel.f24643e && this.f24646r == timeModel.f24646r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24643e), Integer.valueOf(this.f24644g), Integer.valueOf(this.f24645k), Integer.valueOf(this.f24646r)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24644g);
        parcel.writeInt(this.f24645k);
        parcel.writeInt(this.f24646r);
        parcel.writeInt(this.f24643e);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f24644g = i;
        this.f24645k = i2;
        this.f24646r = i3;
        this.f24643e = i4;
        this.f24647s = m36290c(i);
        this.f24641a = new np3(59);
        this.f24642d = new np3(i4 == 1 ? 24 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
