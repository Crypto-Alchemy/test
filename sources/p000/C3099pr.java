package p000;

import android.content.res.AssetManager;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import p000.r11;

/* renamed from: pr */
/* compiled from: AssetPathFetcher */
public abstract class C3099pr<T> implements r11<T> {

    /* renamed from: a */
    public final String f16607a;

    /* renamed from: d */
    public final AssetManager f16608d;

    /* renamed from: e */
    public T f16609e;

    public C3099pr(AssetManager assetManager, String str) {
        this.f16608d = assetManager;
        this.f16607a = str;
    }

    /* renamed from: b */
    public void mo11940b() {
        T t = this.f16609e;
        if (t != null) {
            try {
                mo22713c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo22713c(T t) throws IOException;

    public void cancel() {
    }

    /* renamed from: d */
    public void mo11943d(Priority priority, r11.C3179a<? super T> aVar) {
        try {
            T f = mo22714f(this.f16608d, this.f16607a);
            this.f16609e = f;
            aVar.mo12487f(f);
        } catch (IOException e) {
            aVar.mo12485c(e);
        }
    }

    /* renamed from: e */
    public DataSource mo11944e() {
        return DataSource.LOCAL;
    }

    /* renamed from: f */
    public abstract T mo22714f(AssetManager assetManager, String str) throws IOException;
}
