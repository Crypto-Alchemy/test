package android.support.p002v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0077a();

    /* renamed from: A */
    public final long f315A;

    /* renamed from: B */
    public final Bundle f316B;

    /* renamed from: C */
    public PlaybackState f317C;

    /* renamed from: a */
    public final int f318a;

    /* renamed from: d */
    public final long f319d;

    /* renamed from: e */
    public final long f320e;

    /* renamed from: g */
    public final float f321g;

    /* renamed from: k */
    public final long f322k;

    /* renamed from: r */
    public final int f323r;

    /* renamed from: s */
    public final CharSequence f324s;

    /* renamed from: x */
    public final long f325x;

    /* renamed from: y */
    public List<CustomAction> f326y;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public class C0077a implements Parcelable.Creator<PlaybackStateCompat> {
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    public static class C0078b {
        /* renamed from: a */
        public static void m561a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        /* renamed from: b */
        public static PlaybackState.CustomAction m562b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        /* renamed from: c */
        public static PlaybackState m563c(PlaybackState.Builder builder) {
            return builder.build();
        }

        /* renamed from: d */
        public static PlaybackState.Builder m564d() {
            return new PlaybackState.Builder();
        }

        /* renamed from: e */
        public static PlaybackState.CustomAction.Builder m565e(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        /* renamed from: f */
        public static String m566f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        /* renamed from: g */
        public static long m567g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        /* renamed from: h */
        public static long m568h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        /* renamed from: i */
        public static long m569i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        /* renamed from: j */
        public static List<PlaybackState.CustomAction> m570j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        /* renamed from: k */
        public static CharSequence m571k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        /* renamed from: l */
        public static Bundle m572l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        /* renamed from: m */
        public static int m573m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        /* renamed from: n */
        public static long m574n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        /* renamed from: o */
        public static CharSequence m575o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        /* renamed from: p */
        public static float m576p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        /* renamed from: q */
        public static long m577q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        /* renamed from: r */
        public static int m578r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        /* renamed from: s */
        public static void m579s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        /* renamed from: t */
        public static void m580t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        /* renamed from: u */
        public static void m581u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        /* renamed from: v */
        public static void m582v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        /* renamed from: w */
        public static void m583w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        /* renamed from: x */
        public static void m584x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    public static class C0079c {
        /* renamed from: a */
        public static Bundle m585a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        /* renamed from: b */
        public static void m586b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f318a = i;
        this.f319d = j;
        this.f320e = j2;
        this.f321g = f;
        this.f322k = j3;
        this.f323r = i2;
        this.f324s = charSequence;
        this.f325x = j4;
        this.f326y = new ArrayList(list);
        this.f315A = j5;
        this.f316B = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m555a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j = C0078b.m570j(playbackState);
        if (j != null) {
            arrayList = new ArrayList(j.size());
            for (PlaybackState.CustomAction a : j) {
                arrayList.add(CustomAction.m556a(a));
            }
        }
        Bundle a2 = C0079c.m585a(playbackState);
        MediaSessionCompat.m534a(a2);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0078b.m578r(playbackState), C0078b.m577q(playbackState), C0078b.m569i(playbackState), C0078b.m576p(playbackState), C0078b.m567g(playbackState), 0, C0078b.m571k(playbackState), C0078b.m574n(playbackState), arrayList, C0078b.m568h(playbackState), a2);
        playbackStateCompat.f317C = playbackState;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f318a + ", position=" + this.f319d + ", buffered position=" + this.f320e + ", speed=" + this.f321g + ", updated=" + this.f325x + ", actions=" + this.f322k + ", error code=" + this.f323r + ", error message=" + this.f324s + ", custom actions=" + this.f326y + ", active item id=" + this.f315A + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f318a);
        parcel.writeLong(this.f319d);
        parcel.writeFloat(this.f321g);
        parcel.writeLong(this.f325x);
        parcel.writeLong(this.f320e);
        parcel.writeLong(this.f322k);
        TextUtils.writeToParcel(this.f324s, parcel, i);
        parcel.writeTypedList(this.f326y);
        parcel.writeLong(this.f315A);
        parcel.writeBundle(this.f316B);
        parcel.writeInt(this.f323r);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0076a();

        /* renamed from: a */
        public final String f327a;

        /* renamed from: d */
        public final CharSequence f328d;

        /* renamed from: e */
        public final int f329e;

        /* renamed from: g */
        public final Bundle f330g;

        /* renamed from: k */
        public PlaybackState.CustomAction f331k;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public class C0076a implements Parcelable.Creator<CustomAction> {
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f327a = str;
            this.f328d = charSequence;
            this.f329e = i;
            this.f330g = bundle;
        }

        /* renamed from: a */
        public static CustomAction m556a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l = C0078b.m572l(customAction);
            MediaSessionCompat.m534a(l);
            CustomAction customAction2 = new CustomAction(C0078b.m566f(customAction), C0078b.m575o(customAction), C0078b.m573m(customAction), l);
            customAction2.f331k = customAction;
            return customAction2;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f328d + ", mIcon=" + this.f329e + ", mExtras=" + this.f330g;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f327a);
            TextUtils.writeToParcel(this.f328d, parcel, i);
            parcel.writeInt(this.f329e);
            parcel.writeBundle(this.f330g);
        }

        public CustomAction(Parcel parcel) {
            this.f327a = parcel.readString();
            this.f328d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f329e = parcel.readInt();
            this.f330g = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f318a = parcel.readInt();
        this.f319d = parcel.readLong();
        this.f321g = parcel.readFloat();
        this.f325x = parcel.readLong();
        this.f320e = parcel.readLong();
        this.f322k = parcel.readLong();
        this.f324s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f326y = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f315A = parcel.readLong();
        this.f316B = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f323r = parcel.readInt();
    }
}
