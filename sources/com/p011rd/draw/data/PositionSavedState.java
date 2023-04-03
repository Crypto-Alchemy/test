package com.p011rd.draw.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: com.rd.draw.data.PositionSavedState */
public class PositionSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<PositionSavedState> CREATOR = new C5370a();

    /* renamed from: a */
    public int f26657a;

    /* renamed from: d */
    public int f26658d;

    /* renamed from: e */
    public int f26659e;

    /* renamed from: com.rd.draw.data.PositionSavedState$a */
    public class C5370a implements Parcelable.Creator<PositionSavedState> {
        /* renamed from: a */
        public PositionSavedState createFromParcel(Parcel parcel) {
            return new PositionSavedState(parcel, (C5370a) null);
        }

        /* renamed from: b */
        public PositionSavedState[] newArray(int i) {
            return new PositionSavedState[i];
        }
    }

    public /* synthetic */ PositionSavedState(Parcel parcel, C5370a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public int mo39258a() {
        return this.f26659e;
    }

    /* renamed from: b */
    public int mo39259b() {
        return this.f26657a;
    }

    /* renamed from: c */
    public int mo39260c() {
        return this.f26658d;
    }

    /* renamed from: d */
    public void mo39261d(int i) {
        this.f26659e = i;
    }

    /* renamed from: e */
    public void mo39262e(int i) {
        this.f26657a = i;
    }

    /* renamed from: f */
    public void mo39263f(int i) {
        this.f26658d = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f26657a);
        parcel.writeInt(this.f26658d);
        parcel.writeInt(this.f26659e);
    }

    public PositionSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public PositionSavedState(Parcel parcel) {
        super(parcel);
        this.f26657a = parcel.readInt();
        this.f26658d = parcel.readInt();
        this.f26659e = parcel.readInt();
    }
}
