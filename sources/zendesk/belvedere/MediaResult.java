package zendesk.belvedere;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

public class MediaResult implements Parcelable, Comparable<MediaResult> {
    public static final Parcelable.Creator<MediaResult> CREATOR = new C9796a();

    /* renamed from: a */
    public final File f46667a;

    /* renamed from: d */
    public final Uri f46668d;

    /* renamed from: e */
    public final Uri f46669e;

    /* renamed from: g */
    public final String f46670g;

    /* renamed from: k */
    public final String f46671k;

    /* renamed from: r */
    public final long f46672r;

    /* renamed from: s */
    public final long f46673s;

    /* renamed from: x */
    public final long f46674x;

    /* renamed from: zendesk.belvedere.MediaResult$a */
    public static class C9796a implements Parcelable.Creator<MediaResult> {
        /* renamed from: a */
        public MediaResult createFromParcel(Parcel parcel) {
            return new MediaResult(parcel, (C9796a) null);
        }

        /* renamed from: b */
        public MediaResult[] newArray(int i) {
            return new MediaResult[i];
        }
    }

    public /* synthetic */ MediaResult(Parcel parcel, C9796a aVar) {
        this(parcel);
    }

    /* renamed from: d */
    public static MediaResult m75418d() {
        return new MediaResult((File) null, (Uri) null, (Uri) null, (String) null, (String) null, -1, -1, -1);
    }

    /* renamed from: a */
    public int compareTo(MediaResult mediaResult) {
        return this.f46669e.compareTo(mediaResult.mo73702i());
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public File mo73696e() {
        return this.f46667a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MediaResult mediaResult = (MediaResult) obj;
            if (this.f46672r == mediaResult.f46672r && this.f46673s == mediaResult.f46673s && this.f46674x == mediaResult.f46674x) {
                File file = this.f46667a;
                if (file == null ? mediaResult.f46667a != null : !file.equals(mediaResult.f46667a)) {
                    return false;
                }
                Uri uri = this.f46668d;
                if (uri == null ? mediaResult.f46668d != null : !uri.equals(mediaResult.f46668d)) {
                    return false;
                }
                Uri uri2 = this.f46669e;
                if (uri2 == null ? mediaResult.f46669e != null : !uri2.equals(mediaResult.f46669e)) {
                    return false;
                }
                String str = this.f46670g;
                if (str == null ? mediaResult.f46670g != null : !str.equals(mediaResult.f46670g)) {
                    return false;
                }
                String str2 = this.f46671k;
                String str3 = mediaResult.f46671k;
                if (str2 != null) {
                    return str2.equals(str3);
                }
                if (str3 == null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: f */
    public long mo73698f() {
        return this.f46674x;
    }

    /* renamed from: g */
    public String mo73699g() {
        return this.f46671k;
    }

    /* renamed from: h */
    public String mo73700h() {
        return this.f46670g;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        File file = this.f46667a;
        int i5 = 0;
        if (file != null) {
            i = file.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        Uri uri = this.f46668d;
        if (uri != null) {
            i2 = uri.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        Uri uri2 = this.f46669e;
        if (uri2 != null) {
            i3 = uri2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str = this.f46670g;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str2 = this.f46671k;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        long j = this.f46672r;
        long j2 = this.f46673s;
        long j3 = this.f46674x;
        return ((((((i9 + i5) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    /* renamed from: i */
    public Uri mo73702i() {
        return this.f46669e;
    }

    /* renamed from: l */
    public long mo73703l() {
        return this.f46672r;
    }

    /* renamed from: m */
    public Uri mo73704m() {
        return this.f46668d;
    }

    /* renamed from: o */
    public long mo73705o() {
        return this.f46673s;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f46667a);
        parcel.writeParcelable(this.f46668d, i);
        parcel.writeString(this.f46670g);
        parcel.writeString(this.f46671k);
        parcel.writeParcelable(this.f46669e, i);
        parcel.writeLong(this.f46672r);
        parcel.writeLong(this.f46673s);
        parcel.writeLong(this.f46674x);
    }

    public MediaResult(File file, Uri uri, Uri uri2, String str, String str2, long j, long j2, long j3) {
        this.f46667a = file;
        this.f46668d = uri;
        this.f46669e = uri2;
        this.f46671k = str2;
        this.f46670g = str;
        this.f46672r = j;
        this.f46673s = j2;
        this.f46674x = j3;
    }

    public MediaResult(Parcel parcel) {
        this.f46667a = (File) parcel.readSerializable();
        this.f46668d = (Uri) parcel.readParcelable(MediaResult.class.getClassLoader());
        this.f46670g = parcel.readString();
        this.f46671k = parcel.readString();
        this.f46669e = (Uri) parcel.readParcelable(MediaResult.class.getClassLoader());
        this.f46672r = parcel.readLong();
        this.f46673s = parcel.readLong();
        this.f46674x = parcel.readLong();
    }
}
