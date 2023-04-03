package android.support.p002v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0059a();

    /* renamed from: a */
    public final String f258a;

    /* renamed from: d */
    public final CharSequence f259d;

    /* renamed from: e */
    public final CharSequence f260e;

    /* renamed from: g */
    public final CharSequence f261g;

    /* renamed from: k */
    public final Bitmap f262k;

    /* renamed from: r */
    public final Uri f263r;

    /* renamed from: s */
    public final Bundle f264s;

    /* renamed from: x */
    public final Uri f265x;

    /* renamed from: y */
    public MediaDescription f266y;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public class C0059a implements Parcelable.Creator<MediaDescriptionCompat> {
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m469a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static class C0060b {
        /* renamed from: a */
        public static MediaDescription m474a(MediaDescription.Builder builder) {
            return builder.build();
        }

        /* renamed from: b */
        public static MediaDescription.Builder m475b() {
            return new MediaDescription.Builder();
        }

        /* renamed from: c */
        public static CharSequence m476c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        /* renamed from: d */
        public static Bundle m477d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        /* renamed from: e */
        public static Bitmap m478e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        /* renamed from: f */
        public static Uri m479f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        /* renamed from: g */
        public static String m480g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        /* renamed from: h */
        public static CharSequence m481h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        /* renamed from: i */
        public static CharSequence m482i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        /* renamed from: j */
        public static void m483j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        /* renamed from: k */
        public static void m484k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        /* renamed from: l */
        public static void m485l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        /* renamed from: m */
        public static void m486m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        /* renamed from: n */
        public static void m487n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        /* renamed from: o */
        public static void m488o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        /* renamed from: p */
        public static void m489p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$c */
    public static class C0061c {
        /* renamed from: a */
        public static Uri m490a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        /* renamed from: b */
        public static void m491b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$d */
    public static final class C0062d {

        /* renamed from: a */
        public String f267a;

        /* renamed from: b */
        public CharSequence f268b;

        /* renamed from: c */
        public CharSequence f269c;

        /* renamed from: d */
        public CharSequence f270d;

        /* renamed from: e */
        public Bitmap f271e;

        /* renamed from: f */
        public Uri f272f;

        /* renamed from: g */
        public Bundle f273g;

        /* renamed from: h */
        public Uri f274h;

        /* renamed from: a */
        public MediaDescriptionCompat mo685a() {
            return new MediaDescriptionCompat(this.f267a, this.f268b, this.f269c, this.f270d, this.f271e, this.f272f, this.f273g, this.f274h);
        }

        /* renamed from: b */
        public C0062d mo686b(CharSequence charSequence) {
            this.f270d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0062d mo687c(Bundle bundle) {
            this.f273g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0062d mo688d(Bitmap bitmap) {
            this.f271e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0062d mo689e(Uri uri) {
            this.f272f = uri;
            return this;
        }

        /* renamed from: f */
        public C0062d mo690f(String str) {
            this.f267a = str;
            return this;
        }

        /* renamed from: g */
        public C0062d mo691g(Uri uri) {
            this.f274h = uri;
            return this;
        }

        /* renamed from: h */
        public C0062d mo692h(CharSequence charSequence) {
            this.f269c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0062d mo693i(CharSequence charSequence) {
            this.f268b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f258a = str;
        this.f259d = charSequence;
        this.f260e = charSequence2;
        this.f261g = charSequence3;
        this.f262k = bitmap;
        this.f263r = uri;
        this.f264s = bundle;
        this.f265x = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p002v4.media.MediaDescriptionCompat m469a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0079
            android.support.v4.media.MediaDescriptionCompat$d r1 = new android.support.v4.media.MediaDescriptionCompat$d
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = android.support.p002v4.media.MediaDescriptionCompat.C0060b.m480g(r8)
            r1.mo690f(r2)
            java.lang.CharSequence r2 = android.support.p002v4.media.MediaDescriptionCompat.C0060b.m482i(r8)
            r1.mo693i(r2)
            java.lang.CharSequence r2 = android.support.p002v4.media.MediaDescriptionCompat.C0060b.m481h(r8)
            r1.mo692h(r2)
            java.lang.CharSequence r2 = android.support.p002v4.media.MediaDescriptionCompat.C0060b.m476c(r8)
            r1.mo686b(r2)
            android.graphics.Bitmap r2 = android.support.p002v4.media.MediaDescriptionCompat.C0060b.m478e(r8)
            r1.mo688d(r2)
            android.net.Uri r2 = android.support.p002v4.media.MediaDescriptionCompat.C0060b.m479f(r8)
            r1.mo689e(r2)
            android.os.Bundle r2 = android.support.p002v4.media.MediaDescriptionCompat.C0060b.m477d(r8)
            if (r2 == 0) goto L_0x003e
            android.os.Bundle r2 = android.support.p002v4.media.session.MediaSessionCompat.m535b(r2)
        L_0x003e:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0049
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004a
        L_0x0049:
            r4 = r0
        L_0x004a:
            if (r4 == 0) goto L_0x0062
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005c
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005c
            goto L_0x0063
        L_0x005c:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0062:
            r0 = r2
        L_0x0063:
            r1.mo687c(r0)
            if (r4 == 0) goto L_0x006c
            r1.mo691g(r4)
            goto L_0x0073
        L_0x006c:
            android.net.Uri r0 = android.support.p002v4.media.MediaDescriptionCompat.C0061c.m490a(r8)
            r1.mo691g(r0)
        L_0x0073:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo685a()
            r0.f266y = r8
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.media.MediaDescriptionCompat.m469a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object mo676b() {
        MediaDescription mediaDescription = this.f266y;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder b = C0060b.m475b();
        C0060b.m487n(b, this.f258a);
        C0060b.m489p(b, this.f259d);
        C0060b.m488o(b, this.f260e);
        C0060b.m483j(b, this.f261g);
        C0060b.m485l(b, this.f262k);
        C0060b.m486m(b, this.f263r);
        C0060b.m484k(b, this.f264s);
        C0061c.m491b(b, this.f265x);
        MediaDescription a = C0060b.m474a(b);
        this.f266y = a;
        return a;
    }

    /* renamed from: c */
    public String mo677c() {
        return this.f258a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f259d + ", " + this.f260e + ", " + this.f261g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) mo676b()).writeToParcel(parcel, i);
    }
}
