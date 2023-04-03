package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p000.mw3;
import p000.r11;

/* renamed from: bz4 */
/* compiled from: QMediaStoreUriLoader */
public final class bz4<DataT> implements mw3<Uri, DataT> {

    /* renamed from: a */
    public final Context f8295a;

    /* renamed from: b */
    public final mw3<File, DataT> f8296b;

    /* renamed from: c */
    public final mw3<Uri, DataT> f8297c;

    /* renamed from: d */
    public final Class<DataT> f8298d;

    /* renamed from: bz4$a */
    /* compiled from: QMediaStoreUriLoader */
    public static abstract class C1663a<DataT> implements nw3<Uri, DataT> {

        /* renamed from: a */
        public final Context f8299a;

        /* renamed from: b */
        public final Class<DataT> f8300b;

        public C1663a(Context context, Class<DataT> cls) {
            this.f8299a = context;
            this.f8300b = cls;
        }

        /* renamed from: a */
        public final void mo11937a() {
        }

        /* renamed from: c */
        public final mw3<Uri, DataT> mo11938c(vz3 vz3) {
            return new bz4(this.f8299a, vz3.mo27397d(File.class, this.f8300b), vz3.mo27397d(Uri.class, this.f8300b), this.f8300b);
        }
    }

    /* renamed from: bz4$b */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C1664b extends C1663a<ParcelFileDescriptor> {
        public C1664b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: bz4$c */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C1665c extends C1663a<InputStream> {
        public C1665c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: bz4$d */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C1666d<DataT> implements r11<DataT> {

        /* renamed from: B */
        public static final String[] f8301B = {"_data"};

        /* renamed from: A */
        public volatile r11<DataT> f8302A;

        /* renamed from: a */
        public final Context f8303a;

        /* renamed from: d */
        public final mw3<File, DataT> f8304d;

        /* renamed from: e */
        public final mw3<Uri, DataT> f8305e;

        /* renamed from: g */
        public final Uri f8306g;

        /* renamed from: k */
        public final int f8307k;

        /* renamed from: r */
        public final int f8308r;

        /* renamed from: s */
        public final xi4 f8309s;

        /* renamed from: x */
        public final Class<DataT> f8310x;

        /* renamed from: y */
        public volatile boolean f8311y;

        public C1666d(Context context, mw3<File, DataT> mw3, mw3<Uri, DataT> mw32, Uri uri, int i, int i2, xi4 xi4, Class<DataT> cls) {
            this.f8303a = context.getApplicationContext();
            this.f8304d = mw3;
            this.f8305e = mw32;
            this.f8306g = uri;
            this.f8307k = i;
            this.f8308r = i2;
            this.f8309s = xi4;
            this.f8310x = cls;
        }

        /* renamed from: a */
        public Class<DataT> mo11939a() {
            return this.f8310x;
        }

        /* renamed from: b */
        public void mo11940b() {
            r11<DataT> r11 = this.f8302A;
            if (r11 != null) {
                r11.mo11940b();
            }
        }

        /* renamed from: c */
        public final mw3.C2853a<DataT> mo11941c() throws FileNotFoundException {
            Uri uri;
            if (Environment.isExternalStorageLegacy()) {
                return this.f8304d.mo11934b(mo11947h(this.f8306g), this.f8307k, this.f8308r, this.f8309s);
            }
            if (mo11946g()) {
                uri = MediaStore.setRequireOriginal(this.f8306g);
            } else {
                uri = this.f8306g;
            }
            return this.f8305e.mo11934b(uri, this.f8307k, this.f8308r, this.f8309s);
        }

        public void cancel() {
            this.f8311y = true;
            r11<DataT> r11 = this.f8302A;
            if (r11 != null) {
                r11.cancel();
            }
        }

        /* renamed from: d */
        public void mo11943d(Priority priority, r11.C3179a<? super DataT> aVar) {
            try {
                r11<DataT> f = mo11945f();
                if (f == null) {
                    aVar.mo12485c(new IllegalArgumentException("Failed to build fetcher for: " + this.f8306g));
                    return;
                }
                this.f8302A = f;
                if (this.f8311y) {
                    cancel();
                } else {
                    f.mo11943d(priority, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo12485c(e);
            }
        }

        /* renamed from: e */
        public DataSource mo11944e() {
            return DataSource.LOCAL;
        }

        /* renamed from: f */
        public final r11<DataT> mo11945f() throws FileNotFoundException {
            mw3.C2853a c = mo11941c();
            if (c != null) {
                return c.f15262c;
            }
            return null;
        }

        /* renamed from: g */
        public final boolean mo11946g() {
            if (this.f8303a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public final File mo11947h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                cursor = this.f8303a.getContentResolver().query(uri, f8301B, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursor.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public bz4(Context context, mw3<File, DataT> mw3, mw3<Uri, DataT> mw32, Class<DataT> cls) {
        this.f8295a = context.getApplicationContext();
        this.f8296b = mw3;
        this.f8297c = mw32;
        this.f8298d = cls;
    }

    /* renamed from: c */
    public mw3.C2853a<DataT> mo11934b(Uri uri, int i, int i2, xi4 xi4) {
        return new mw3.C2853a<>(new df4(uri), new C1666d(this.f8295a, this.f8296b, this.f8297c, uri, i, i2, xi4, this.f8298d));
    }

    /* renamed from: d */
    public boolean mo11933a(Uri uri) {
        if (Build.VERSION.SDK_INT < 29 || !is3.m19814b(uri)) {
            return false;
        }
        return true;
    }
}
