package android.support.p002v4.media;

import android.annotation.SuppressLint;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.media.session.MediaSessionCompat;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new C0063a();

    /* renamed from: e */
    public static final C2781lq<String, Integer> f275e;

    /* renamed from: g */
    public static final String[] f276g = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: k */
    public static final String[] f277k = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: r */
    public static final String[] f278r = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: a */
    public final Bundle f279a;

    /* renamed from: d */
    public MediaMetadata f280d;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    public class C0063a implements Parcelable.Creator<MediaMetadataCompat> {
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C2781lq<String, Integer> lqVar = new C2781lq<>();
        f275e = lqVar;
        lqVar.put("android.media.metadata.TITLE", 1);
        lqVar.put("android.media.metadata.ARTIST", 1);
        lqVar.put("android.media.metadata.DURATION", 0);
        lqVar.put("android.media.metadata.ALBUM", 1);
        lqVar.put("android.media.metadata.AUTHOR", 1);
        lqVar.put("android.media.metadata.WRITER", 1);
        lqVar.put("android.media.metadata.COMPOSER", 1);
        lqVar.put("android.media.metadata.COMPILATION", 1);
        lqVar.put("android.media.metadata.DATE", 1);
        lqVar.put("android.media.metadata.YEAR", 0);
        lqVar.put("android.media.metadata.GENRE", 1);
        lqVar.put("android.media.metadata.TRACK_NUMBER", 0);
        lqVar.put("android.media.metadata.NUM_TRACKS", 0);
        lqVar.put("android.media.metadata.DISC_NUMBER", 0);
        lqVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        lqVar.put("android.media.metadata.ART", 2);
        lqVar.put("android.media.metadata.ART_URI", 1);
        lqVar.put("android.media.metadata.ALBUM_ART", 2);
        lqVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        lqVar.put("android.media.metadata.USER_RATING", 3);
        lqVar.put("android.media.metadata.RATING", 3);
        lqVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        lqVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        lqVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        lqVar.put("android.media.metadata.DISPLAY_ICON", 2);
        lqVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        lqVar.put("android.media.metadata.MEDIA_ID", 1);
        lqVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        lqVar.put("android.media.metadata.MEDIA_URI", 1);
        lqVar.put("android.media.metadata.ADVERTISEMENT", 0);
        lqVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f279a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m501a(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f280d = mediaMetadata;
        return createFromParcel;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f279a);
    }
}
