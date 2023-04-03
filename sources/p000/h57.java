package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.mw3;

/* renamed from: h57 */
/* compiled from: UriLoader */
public class h57<Data> implements mw3<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f12743b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", PublicResolver.FUNC_CONTENT})));

    /* renamed from: a */
    public final C2446c<Data> f12744a;

    /* renamed from: h57$a */
    /* compiled from: UriLoader */
    public static final class C2444a implements nw3<Uri, AssetFileDescriptor>, C2446c<AssetFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f12745a;

        public C2444a(ContentResolver contentResolver) {
            this.f12745a = contentResolver;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: b */
        public r11<AssetFileDescriptor> mo20956b(Uri uri) {
            return new C2847mr(this.f12745a, uri);
        }

        /* renamed from: c */
        public mw3<Uri, AssetFileDescriptor> mo11938c(vz3 vz3) {
            return new h57(this);
        }
    }

    /* renamed from: h57$b */
    /* compiled from: UriLoader */
    public static class C2445b implements nw3<Uri, ParcelFileDescriptor>, C2446c<ParcelFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f12746a;

        public C2445b(ContentResolver contentResolver) {
            this.f12746a = contentResolver;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: b */
        public r11<ParcelFileDescriptor> mo20956b(Uri uri) {
            return new r02(this.f12746a, uri);
        }

        /* renamed from: c */
        public mw3<Uri, ParcelFileDescriptor> mo11938c(vz3 vz3) {
            return new h57(this);
        }
    }

    /* renamed from: h57$c */
    /* compiled from: UriLoader */
    public interface C2446c<Data> {
        /* renamed from: b */
        r11<Data> mo20956b(Uri uri);
    }

    /* renamed from: h57$d */
    /* compiled from: UriLoader */
    public static class C2447d implements nw3<Uri, InputStream>, C2446c<InputStream> {

        /* renamed from: a */
        public final ContentResolver f12747a;

        public C2447d(ContentResolver contentResolver) {
            this.f12747a = contentResolver;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: b */
        public r11<InputStream> mo20956b(Uri uri) {
            return new pa6(this.f12747a, uri);
        }

        /* renamed from: c */
        public mw3<Uri, InputStream> mo11938c(vz3 vz3) {
            return new h57(this);
        }
    }

    public h57(C2446c<Data> cVar) {
        this.f12744a = cVar;
    }

    /* renamed from: c */
    public mw3.C2853a<Data> mo11934b(Uri uri, int i, int i2, xi4 xi4) {
        return new mw3.C2853a<>(new df4(uri), this.f12744a.mo20956b(uri));
    }

    /* renamed from: d */
    public boolean mo11933a(Uri uri) {
        return f12743b.contains(uri.getScheme());
    }
}
