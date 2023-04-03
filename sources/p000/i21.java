package p000;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.mw3;
import p000.r11;

/* renamed from: i21 */
/* compiled from: DataUrlLoader */
public final class i21<Model, Data> implements mw3<Model, Data> {

    /* renamed from: a */
    public final C2518a<Data> f13124a;

    /* renamed from: i21$a */
    /* compiled from: DataUrlLoader */
    public interface C2518a<Data> {
        /* renamed from: a */
        Class<Data> mo21430a();

        /* renamed from: b */
        void mo21431b(Data data) throws IOException;

        /* renamed from: c */
        Data mo21432c(String str) throws IllegalArgumentException;
    }

    /* renamed from: i21$b */
    /* compiled from: DataUrlLoader */
    public static final class C2519b<Data> implements r11<Data> {

        /* renamed from: a */
        public final String f13125a;

        /* renamed from: d */
        public final C2518a<Data> f13126d;

        /* renamed from: e */
        public Data f13127e;

        public C2519b(String str, C2518a<Data> aVar) {
            this.f13125a = str;
            this.f13126d = aVar;
        }

        /* renamed from: a */
        public Class<Data> mo11939a() {
            return this.f13126d.mo21430a();
        }

        /* renamed from: b */
        public void mo11940b() {
            try {
                this.f13126d.mo21431b(this.f13127e);
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        /* renamed from: d */
        public void mo11943d(Priority priority, r11.C3179a<? super Data> aVar) {
            try {
                Data c = this.f13126d.mo21432c(this.f13125a);
                this.f13127e = c;
                aVar.mo12487f(c);
            } catch (IllegalArgumentException e) {
                aVar.mo12485c(e);
            }
        }

        /* renamed from: e */
        public DataSource mo11944e() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: i21$c */
    /* compiled from: DataUrlLoader */
    public static final class C2520c<Model> implements nw3<Model, InputStream> {

        /* renamed from: a */
        public final C2518a<InputStream> f13128a = new C2521a();

        /* renamed from: i21$c$a */
        /* compiled from: DataUrlLoader */
        public class C2521a implements C2518a<InputStream> {
            public C2521a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo21430a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo21431b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo21432c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<Model, InputStream> mo11938c(vz3 vz3) {
            return new i21(this.f13128a);
        }
    }

    public i21(C2518a<Data> aVar) {
        this.f13124a = aVar;
    }

    /* renamed from: a */
    public boolean mo11933a(Model model) {
        return model.toString().startsWith("data:image");
    }

    /* renamed from: b */
    public mw3.C2853a<Data> mo11934b(Model model, int i, int i2, xi4 xi4) {
        return new mw3.C2853a<>(new df4(model), new C2519b(model.toString(), this.f13124a));
    }
}
