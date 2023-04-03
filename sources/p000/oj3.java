package p000;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import p000.r11;

/* renamed from: oj3 */
/* compiled from: LocalUriFetcher */
public abstract class oj3<T> implements r11<T> {

    /* renamed from: a */
    public final Uri f15916a;

    /* renamed from: d */
    public final ContentResolver f15917d;

    /* renamed from: e */
    public T f15918e;

    public oj3(ContentResolver contentResolver, Uri uri) {
        this.f15917d = contentResolver;
        this.f15916a = uri;
    }

    /* renamed from: b */
    public void mo11940b() {
        T t = this.f15918e;
        if (t != null) {
            try {
                mo23315c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo23315c(T t) throws IOException;

    public void cancel() {
    }

    /* renamed from: d */
    public final void mo11943d(Priority priority, r11.C3179a<? super T> aVar) {
        try {
            T f = mo23316f(this.f15916a, this.f15917d);
            this.f15918e = f;
            aVar.mo12487f(f);
        } catch (FileNotFoundException e) {
            aVar.mo12485c(e);
        }
    }

    /* renamed from: e */
    public DataSource mo11944e() {
        return DataSource.LOCAL;
    }

    /* renamed from: f */
    public abstract T mo23316f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
