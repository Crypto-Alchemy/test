package p000;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import net.sqlcipher.database.SQLiteDatabase;
import p000.mw3;
import p000.r11;

/* renamed from: s02 */
/* compiled from: FileLoader */
public class s02<Data> implements mw3<File, Data> {

    /* renamed from: a */
    public final C3237d<Data> f17412a;

    /* renamed from: s02$a */
    /* compiled from: FileLoader */
    public static class C3233a<Data> implements nw3<File, Data> {

        /* renamed from: a */
        public final C3237d<Data> f17413a;

        public C3233a(C3237d<Data> dVar) {
            this.f17413a = dVar;
        }

        /* renamed from: a */
        public final void mo11937a() {
        }

        /* renamed from: c */
        public final mw3<File, Data> mo11938c(vz3 vz3) {
            return new s02(this.f17413a);
        }
    }

    /* renamed from: s02$b */
    /* compiled from: FileLoader */
    public static class C3234b extends C3233a<ParcelFileDescriptor> {

        /* renamed from: s02$b$a */
        /* compiled from: FileLoader */
        public class C3235a implements C3237d<ParcelFileDescriptor> {
            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo25582a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void mo25583b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor mo25584c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, SQLiteDatabase.CREATE_IF_NECESSARY);
            }
        }

        public C3234b() {
            super(new C3235a());
        }
    }

    /* renamed from: s02$c */
    /* compiled from: FileLoader */
    public static final class C3236c<Data> implements r11<Data> {

        /* renamed from: a */
        public final File f17414a;

        /* renamed from: d */
        public final C3237d<Data> f17415d;

        /* renamed from: e */
        public Data f17416e;

        public C3236c(File file, C3237d<Data> dVar) {
            this.f17414a = file;
            this.f17415d = dVar;
        }

        /* renamed from: a */
        public Class<Data> mo11939a() {
            return this.f17415d.mo25582a();
        }

        /* renamed from: b */
        public void mo11940b() {
            Data data = this.f17416e;
            if (data != null) {
                try {
                    this.f17415d.mo25583b(data);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        /* renamed from: d */
        public void mo11943d(Priority priority, r11.C3179a<? super Data> aVar) {
            try {
                Data c = this.f17415d.mo25584c(this.f17414a);
                this.f17416e = c;
                aVar.mo12487f(c);
            } catch (FileNotFoundException e) {
                aVar.mo12485c(e);
            }
        }

        /* renamed from: e */
        public DataSource mo11944e() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: s02$d */
    /* compiled from: FileLoader */
    public interface C3237d<Data> {
        /* renamed from: a */
        Class<Data> mo25582a();

        /* renamed from: b */
        void mo25583b(Data data) throws IOException;

        /* renamed from: c */
        Data mo25584c(File file) throws FileNotFoundException;
    }

    /* renamed from: s02$e */
    /* compiled from: FileLoader */
    public static class C3238e extends C3233a<InputStream> {

        /* renamed from: s02$e$a */
        /* compiled from: FileLoader */
        public class C3239a implements C3237d<InputStream> {
            /* renamed from: a */
            public Class<InputStream> mo25582a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo25583b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo25584c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C3238e() {
            super(new C3239a());
        }
    }

    public s02(C3237d<Data> dVar) {
        this.f17412a = dVar;
    }

    /* renamed from: c */
    public mw3.C2853a<Data> mo11934b(File file, int i, int i2, xi4 xi4) {
        return new mw3.C2853a<>(new df4(file), new C3236c(file, this.f17412a));
    }

    /* renamed from: d */
    public boolean mo11933a(File file) {
        return true;
    }
}
