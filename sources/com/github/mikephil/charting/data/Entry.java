package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;

public class Entry extends BaseEntry implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new Parcelable.Creator<Entry>() {
        public Entry createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }

        public Entry[] newArray(int i) {
            return new Entry[i];
        }
    };

    /* renamed from: x */
    private float f10182x;

    public Entry() {
        this.f10182x = Utils.FLOAT_EPSILON;
    }

    public Entry copy() {
        return new Entry(this.f10182x, getY(), getData());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equalTo(Entry entry) {
        if (entry == null || entry.getData() != getData()) {
            return false;
        }
        float abs = Math.abs(entry.f10182x - this.f10182x);
        float f = Utils.FLOAT_EPSILON;
        if (abs <= f && Math.abs(entry.getY() - getY()) <= f) {
            return true;
        }
        return false;
    }

    public float getX() {
        return this.f10182x;
    }

    public void setX(float f) {
        this.f10182x = f;
    }

    public String toString() {
        return "Entry, x: " + this.f10182x + " y: " + getY();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f10182x);
        parcel.writeFloat(getY());
        if (getData() == null) {
            parcel.writeInt(0);
        } else if (getData() instanceof Parcelable) {
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) getData(), i);
        } else {
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
    }

    public Entry(float f, float f2) {
        super(f2);
        this.f10182x = f;
    }

    public Entry(float f, float f2, Object obj) {
        super(f2, obj);
        this.f10182x = f;
    }

    public Entry(float f, float f2, Drawable drawable) {
        super(f2, drawable);
        this.f10182x = f;
    }

    public Entry(float f, float f2, Drawable drawable, Object obj) {
        super(f2, drawable, obj);
        this.f10182x = f;
    }

    public Entry(Parcel parcel) {
        this.f10182x = Utils.FLOAT_EPSILON;
        this.f10182x = parcel.readFloat();
        setY(parcel.readFloat());
        if (parcel.readInt() == 1) {
            setData(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }
}
