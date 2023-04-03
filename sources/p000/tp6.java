package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.bumptech.glide.C1710a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p000.r11;

/* renamed from: tp6 */
/* compiled from: ThumbFetcher */
public class tp6 implements r11<InputStream> {

    /* renamed from: a */
    public final Uri f18209a;

    /* renamed from: d */
    public final zp6 f18210d;

    /* renamed from: e */
    public InputStream f18211e;

    /* renamed from: tp6$a */
    /* compiled from: ThumbFetcher */
    public static class C3380a implements xp6 {

        /* renamed from: b */
        public static final String[] f18212b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f18213a;

        public C3380a(ContentResolver contentResolver) {
            this.f18213a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo26529a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f18213a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f18212b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: tp6$b */
    /* compiled from: ThumbFetcher */
    public static class C3381b implements xp6 {

        /* renamed from: b */
        public static final String[] f18214b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f18215a;

        public C3381b(ContentResolver contentResolver) {
            this.f18215a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo26529a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f18215a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f18214b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public tp6(Uri uri, zp6 zp6) {
        this.f18209a = uri;
        this.f18210d = zp6;
    }

    /* renamed from: c */
    public static tp6 m27870c(Context context, Uri uri, xp6 xp6) {
        return new tp6(uri, new zp6(C1710a.m12218c(context).mo12363j().mo12344g(), xp6, C1710a.m12218c(context).mo12358e(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static tp6 m27871f(Context context, Uri uri) {
        return m27870c(context, uri, new C3380a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static tp6 m27872g(Context context, Uri uri) {
        return m27870c(context, uri, new C3381b(context.getContentResolver()));
    }

    /* renamed from: a */
    public Class<InputStream> mo11939a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo11940b() {
        InputStream inputStream = this.f18211e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    /* renamed from: d */
    public void mo11943d(Priority priority, r11.C3179a<? super InputStream> aVar) {
        try {
            InputStream h = mo26528h();
            this.f18211e = h;
            aVar.mo12487f(h);
        } catch (FileNotFoundException e) {
            aVar.mo12485c(e);
        }
    }

    /* renamed from: e */
    public DataSource mo11944e() {
        return DataSource.LOCAL;
    }

    /* renamed from: h */
    public final InputStream mo26528h() throws FileNotFoundException {
        int i;
        InputStream d = this.f18210d.mo28559d(this.f18209a);
        if (d != null) {
            i = this.f18210d.mo28556a(this.f18209a);
        } else {
            i = -1;
        }
        if (i != -1) {
            return new ev1(d, i);
        }
        return d;
    }
}
