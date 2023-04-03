package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import p000.mw3;
import p000.r11;

/* renamed from: gs3 */
/* compiled from: MediaStoreFileLoader */
public final class gs3 implements mw3<Uri, File> {

    /* renamed from: a */
    public final Context f12589a;

    /* renamed from: gs3$a */
    /* compiled from: MediaStoreFileLoader */
    public static final class C2423a implements nw3<Uri, File> {

        /* renamed from: a */
        public final Context f12590a;

        public C2423a(Context context) {
            this.f12590a = context;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<Uri, File> mo11938c(vz3 vz3) {
            return new gs3(this.f12590a);
        }
    }

    /* renamed from: gs3$b */
    /* compiled from: MediaStoreFileLoader */
    public static class C2424b implements r11<File> {

        /* renamed from: e */
        public static final String[] f12591e = {"_data"};

        /* renamed from: a */
        public final Context f12592a;

        /* renamed from: d */
        public final Uri f12593d;

        public C2424b(Context context, Uri uri) {
            this.f12592a = context;
            this.f12593d = uri;
        }

        /* renamed from: a */
        public Class<File> mo11939a() {
            return File.class;
        }

        /* renamed from: b */
        public void mo11940b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public void mo11943d(Priority priority, r11.C3179a<? super File> aVar) {
            Cursor query = this.f12592a.getContentResolver().query(this.f12593d, f12591e, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo12485c(new FileNotFoundException("Failed to find file path for: " + this.f12593d));
                return;
            }
            aVar.mo12487f(new File(str));
        }

        /* renamed from: e */
        public DataSource mo11944e() {
            return DataSource.LOCAL;
        }
    }

    public gs3(Context context) {
        this.f12589a = context;
    }

    /* renamed from: c */
    public mw3.C2853a<File> mo11934b(Uri uri, int i, int i2, xi4 xi4) {
        return new mw3.C2853a<>(new df4(uri), new C2424b(this.f12589a, uri));
    }

    /* renamed from: d */
    public boolean mo11933a(Uri uri) {
        return is3.m19814b(uri);
    }
}
