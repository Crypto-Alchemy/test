package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import p000.mw3;

/* renamed from: of5 */
/* compiled from: ResourceLoader */
public class of5<Data> implements mw3<Integer, Data> {

    /* renamed from: a */
    public final mw3<Uri, Data> f15860a;

    /* renamed from: b */
    public final Resources f15861b;

    /* renamed from: of5$a */
    /* compiled from: ResourceLoader */
    public static final class C2949a implements nw3<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        public final Resources f15862a;

        public C2949a(Resources resources) {
            this.f15862a = resources;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<Integer, AssetFileDescriptor> mo11938c(vz3 vz3) {
            return new of5(this.f15862a, vz3.mo27397d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: of5$b */
    /* compiled from: ResourceLoader */
    public static class C2950b implements nw3<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        public final Resources f15863a;

        public C2950b(Resources resources) {
            this.f15863a = resources;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<Integer, ParcelFileDescriptor> mo11938c(vz3 vz3) {
            return new of5(this.f15863a, vz3.mo27397d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: of5$c */
    /* compiled from: ResourceLoader */
    public static class C2951c implements nw3<Integer, InputStream> {

        /* renamed from: a */
        public final Resources f15864a;

        public C2951c(Resources resources) {
            this.f15864a = resources;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<Integer, InputStream> mo11938c(vz3 vz3) {
            return new of5(this.f15864a, vz3.mo27397d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: of5$d */
    /* compiled from: ResourceLoader */
    public static class C2952d implements nw3<Integer, Uri> {

        /* renamed from: a */
        public final Resources f15865a;

        public C2952d(Resources resources) {
            this.f15865a = resources;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<Integer, Uri> mo11938c(vz3 vz3) {
            return new of5(this.f15865a, u37.m28060c());
        }
    }

    public of5(Resources resources, mw3<Uri, Data> mw3) {
        this.f15861b = resources;
        this.f15860a = mw3;
    }

    /* renamed from: c */
    public mw3.C2853a<Data> mo11934b(Integer num, int i, int i2, xi4 xi4) {
        Uri d = mo23941d(num);
        if (d == null) {
            return null;
        }
        return this.f15860a.mo11934b(d, i, i2, xi4);
    }

    /* renamed from: d */
    public final Uri mo23941d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f15861b.getResourcePackageName(num.intValue()) + '/' + this.f15861b.getResourceTypeName(num.intValue()) + '/' + this.f15861b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Received invalid resource id: ");
            sb.append(num);
            return null;
        }
    }

    /* renamed from: e */
    public boolean mo11933a(Integer num) {
        return true;
    }
}
