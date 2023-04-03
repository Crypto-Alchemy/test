package androidx.media3.extractor.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;

public final class VorbisComment extends androidx.media3.extractor.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C1066a();

    /* renamed from: androidx.media3.extractor.metadata.vorbis.VorbisComment$a */
    public class C1066a implements Parcelable.Creator<VorbisComment> {
        /* renamed from: a */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        /* renamed from: b */
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }

    public VorbisComment(Parcel parcel) {
        super(parcel);
    }
}
