package zendesk.belvedere;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

public class MediaIntent implements Parcelable {
    public static final Parcelable.Creator<MediaIntent> CREATOR = new C9793a();

    /* renamed from: a */
    public final boolean f46653a;

    /* renamed from: d */
    public final int f46654d;

    /* renamed from: e */
    public final Intent f46655e;

    /* renamed from: g */
    public final String f46656g;

    /* renamed from: k */
    public final int f46657k;

    /* renamed from: zendesk.belvedere.MediaIntent$a */
    public static class C9793a implements Parcelable.Creator<MediaIntent> {
        /* renamed from: a */
        public MediaIntent createFromParcel(Parcel parcel) {
            return new MediaIntent(parcel);
        }

        /* renamed from: b */
        public MediaIntent[] newArray(int i) {
            return new MediaIntent[i];
        }
    }

    /* renamed from: zendesk.belvedere.MediaIntent$b */
    public static class C9794b {

        /* renamed from: a */
        public final wr3 f46658a;

        /* renamed from: b */
        public final ix2 f46659b;

        /* renamed from: c */
        public final int f46660c;

        /* renamed from: d */
        public boolean f46661d = false;

        public C9794b(int i, wr3 wr3, ix2 ix2) {
            this.f46660c = i;
            this.f46658a = wr3;
            this.f46659b = ix2;
        }

        /* renamed from: a */
        public MediaIntent mo73689a() {
            jl4<MediaIntent, MediaResult> c = this.f46658a.mo73603c(this.f46660c);
            MediaIntent mediaIntent = (MediaIntent) c.f13688a;
            MediaResult mediaResult = (MediaResult) c.f13689b;
            if (mediaIntent.mo73681d()) {
                this.f46659b.mo67423e(this.f46660c, mediaResult);
            }
            return mediaIntent;
        }
    }

    /* renamed from: zendesk.belvedere.MediaIntent$c */
    public static class C9795c {

        /* renamed from: a */
        public final wr3 f46662a;

        /* renamed from: b */
        public final int f46663b;

        /* renamed from: c */
        public String f46664c = "*/*";

        /* renamed from: d */
        public List<String> f46665d = new ArrayList();

        /* renamed from: e */
        public boolean f46666e = false;

        public C9795c(int i, wr3 wr3) {
            this.f46662a = wr3;
            this.f46663b = i;
        }

        /* renamed from: a */
        public C9795c mo73690a(boolean z) {
            this.f46666e = z;
            return this;
        }

        /* renamed from: b */
        public MediaIntent mo73691b() {
            return this.f46662a.mo73606f(this.f46663b, this.f46664c, this.f46666e, this.f46665d);
        }

        /* renamed from: c */
        public C9795c mo73692c(String str) {
            this.f46664c = str;
            this.f46665d = new ArrayList();
            return this;
        }
    }

    public MediaIntent(int i, Intent intent, String str, boolean z, int i2) {
        this.f46654d = i;
        this.f46655e = intent;
        this.f46656g = str;
        this.f46653a = z;
        this.f46657k = i2;
    }

    /* renamed from: e */
    public static MediaIntent m75406e() {
        return new MediaIntent(-1, (Intent) null, (String) null, false, -1);
    }

    /* renamed from: a */
    public Intent mo73678a() {
        return this.f46655e;
    }

    /* renamed from: b */
    public String mo73679b() {
        return this.f46656g;
    }

    /* renamed from: c */
    public int mo73680c() {
        return this.f46657k;
    }

    /* renamed from: d */
    public boolean mo73681d() {
        return this.f46653a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public void mo73683f(Fragment fragment) {
        fragment.startActivityForResult(this.f46655e, this.f46654d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f46654d);
        parcel.writeParcelable(this.f46655e, i);
        parcel.writeString(this.f46656g);
        parcel.writeBooleanArray(new boolean[]{this.f46653a});
        parcel.writeInt(this.f46657k);
    }

    public MediaIntent(Parcel parcel) {
        this.f46654d = parcel.readInt();
        this.f46655e = (Intent) parcel.readParcelable(MediaIntent.class.getClassLoader());
        this.f46656g = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f46653a = zArr[0];
        this.f46657k = parcel.readInt();
    }
}
