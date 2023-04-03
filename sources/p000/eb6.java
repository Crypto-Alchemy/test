package p000;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p000.mw3;

/* renamed from: eb6 */
/* compiled from: StringLoader */
public class eb6<Data> implements mw3<String, Data> {

    /* renamed from: a */
    public final mw3<Uri, Data> f11125a;

    /* renamed from: eb6$a */
    /* compiled from: StringLoader */
    public static final class C2218a implements nw3<String, AssetFileDescriptor> {
        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<String, AssetFileDescriptor> mo11938c(vz3 vz3) {
            return new eb6(vz3.mo27397d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: eb6$b */
    /* compiled from: StringLoader */
    public static class C2219b implements nw3<String, ParcelFileDescriptor> {
        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<String, ParcelFileDescriptor> mo11938c(vz3 vz3) {
            return new eb6(vz3.mo27397d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: eb6$c */
    /* compiled from: StringLoader */
    public static class C2220c implements nw3<String, InputStream> {
        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<String, InputStream> mo11938c(vz3 vz3) {
            return new eb6(vz3.mo27397d(Uri.class, InputStream.class));
        }
    }

    public eb6(mw3<Uri, Data> mw3) {
        this.f11125a = mw3;
    }

    /* renamed from: e */
    public static Uri m16054e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m16055f(str);
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return m16055f(str);
        }
        return parse;
    }

    /* renamed from: f */
    public static Uri m16055f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public mw3.C2853a<Data> mo11934b(String str, int i, int i2, xi4 xi4) {
        Uri e = m16054e(str);
        if (e == null || !this.f11125a.mo11933a(e)) {
            return null;
        }
        return this.f11125a.mo11934b(e, i, i2, xi4);
    }

    /* renamed from: d */
    public boolean mo11933a(String str) {
        return true;
    }
}
