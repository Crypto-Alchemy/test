package android.support.p002v4.media.session;

import android.annotation.SuppressLint;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p002v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: a */
    public static final int f301a;

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0073a();

        /* renamed from: a */
        public ResultReceiver f305a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public class C0073a implements Parcelable.Creator<ResultReceiverWrapper> {
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f305a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f305a.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0074a();

        /* renamed from: a */
        public final Object f306a;

        /* renamed from: d */
        public final Object f307d;

        /* renamed from: e */
        public C0082b f308e;

        /* renamed from: g */
        public f97 f309g;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public class C0074a implements Parcelable.Creator<Token> {
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this(obj, (C0082b) null, (f97) null);
        }

        /* renamed from: a */
        public static Token m545a(Object obj) {
            return m546b(obj, (C0082b) null);
        }

        /* renamed from: b */
        public static Token m546b(Object obj, C0082b bVar) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        /* renamed from: c */
        public C0082b mo757c() {
            C0082b bVar;
            synchronized (this.f306a) {
                bVar = this.f308e;
            }
            return bVar;
        }

        /* renamed from: d */
        public Object mo758d() {
            return this.f307d;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public void mo760e(C0082b bVar) {
            synchronized (this.f306a) {
                this.f308e = bVar;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f307d;
            if (obj2 != null) {
                Object obj3 = token.f307d;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f307d == null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: f */
        public void mo762f(f97 f97) {
            synchronized (this.f306a) {
                this.f309g = f97;
            }
        }

        public int hashCode() {
            Object obj = this.f307d;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f307d, i);
        }

        public Token(Object obj, C0082b bVar) {
            this(obj, bVar, (f97) null);
        }

        public Token(Object obj, C0082b bVar, f97 f97) {
            this.f306a = new Object();
            this.f307d = obj;
            this.f308e = bVar;
            this.f309g = f97;
        }
    }

    static {
        int i;
        if (x40.m29874c()) {
            i = 33554432;
        } else {
            i = 0;
        }
        f301a = i;
    }

    /* renamed from: a */
    public static void m534a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: b */
    public static Bundle m535b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m534a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0071a();

        /* renamed from: a */
        public final MediaDescriptionCompat f302a;

        /* renamed from: d */
        public final long f303d;

        /* renamed from: e */
        public MediaSession.QueueItem f304e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public class C0071a implements Parcelable.Creator<QueueItem> {
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$b */
        public static class C0072b {
            /* renamed from: a */
            public static MediaSession.QueueItem m540a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            /* renamed from: b */
            public static MediaDescription m541b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            /* renamed from: c */
            public static long m542c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f302a = mediaDescriptionCompat;
                this.f303d = j;
                this.f304e = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m536a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.m469a(C0072b.m541b(queueItem)), C0072b.m542c(queueItem));
        }

        /* renamed from: b */
        public static List<QueueItem> m537b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m536a(a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f302a + ", Id=" + this.f303d + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f302a.writeToParcel(parcel, i);
            parcel.writeLong(this.f303d);
        }

        public QueueItem(Parcel parcel) {
            this.f302a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f303d = parcel.readLong();
        }
    }
}
