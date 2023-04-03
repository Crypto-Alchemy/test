package android.support.p002v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0064a();

    /* renamed from: a */
    public final int f281a;

    /* renamed from: d */
    public final float f282d;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    public class C0064a implements Parcelable.Creator<RatingCompat> {
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f281a = i;
        this.f282d = f;
    }

    public int describeContents() {
        return this.f281a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f281a);
        sb.append(" rating=");
        float f = this.f282d;
        if (f < Utils.FLOAT_EPSILON) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f281a);
        parcel.writeFloat(this.f282d);
    }
}
