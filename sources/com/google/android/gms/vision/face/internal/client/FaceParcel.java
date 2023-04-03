package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@UsedByNative("wrapper.cc")
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public class FaceParcel extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<FaceParcel> CREATOR = new qh8();
    @RecentlyNonNull

    /* renamed from: A */
    public final LandmarkParcel[] f23220A;

    /* renamed from: B */
    public final float f23221B;

    /* renamed from: C */
    public final float f23222C;

    /* renamed from: H */
    public final float f23223H;

    /* renamed from: I */
    public final zza[] f23224I;

    /* renamed from: L */
    public final float f23225L;

    /* renamed from: a */
    public final int f23226a;

    /* renamed from: d */
    public final int f23227d;

    /* renamed from: e */
    public final float f23228e;

    /* renamed from: g */
    public final float f23229g;

    /* renamed from: k */
    public final float f23230k;

    /* renamed from: r */
    public final float f23231r;

    /* renamed from: s */
    public final float f23232s;

    /* renamed from: x */
    public final float f23233x;

    /* renamed from: y */
    public final float f23234y;

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, zza[] zzaArr, float f11) {
        this.f23226a = i;
        this.f23227d = i2;
        this.f23228e = f;
        this.f23229g = f2;
        this.f23230k = f3;
        this.f23231r = f4;
        this.f23232s = f5;
        this.f23233x = f6;
        this.f23234y = f7;
        this.f23220A = landmarkParcelArr;
        this.f23221B = f8;
        this.f23222C = f9;
        this.f23223H = f10;
        this.f23224I = zzaArr;
        this.f23225L = f11;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f23226a);
        rk5.m51137m(parcel, 2, this.f23227d);
        rk5.m51134j(parcel, 3, this.f23228e);
        rk5.m51134j(parcel, 4, this.f23229g);
        rk5.m51134j(parcel, 5, this.f23230k);
        rk5.m51134j(parcel, 6, this.f23231r);
        rk5.m51134j(parcel, 7, this.f23232s);
        rk5.m51134j(parcel, 8, this.f23233x);
        rk5.m51146v(parcel, 9, this.f23220A, i, false);
        rk5.m51134j(parcel, 10, this.f23221B);
        rk5.m51134j(parcel, 11, this.f23222C);
        rk5.m51134j(parcel, 12, this.f23223H);
        rk5.m51146v(parcel, 13, this.f23224I, i, false);
        rk5.m51134j(parcel, 14, this.f23234y);
        rk5.m51134j(parcel, 15, this.f23225L);
        rk5.m51126b(parcel, a);
    }

    @UsedByNative("wrapper.cc")
    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, @RecentlyNonNull LandmarkParcel[] landmarkParcelArr, float f7, float f8, float f9) {
        this(i, i2, f, f2, f3, f4, f5, f6, Utils.FLOAT_EPSILON, landmarkParcelArr, f7, f8, f9, new zza[0], -1.0f);
    }
}
