package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;
import p000.mw3;

/* renamed from: qr */
/* compiled from: AssetUriLoader */
public class C3164qr<Data> implements mw3<Uri, Data> {

    /* renamed from: c */
    public static final int f17018c = 22;

    /* renamed from: a */
    public final AssetManager f17019a;

    /* renamed from: b */
    public final C3165a<Data> f17020b;

    /* renamed from: qr$a */
    /* compiled from: AssetUriLoader */
    public interface C3165a<Data> {
        /* renamed from: b */
        r11<Data> mo25218b(AssetManager assetManager, String str);
    }

    /* renamed from: qr$b */
    /* compiled from: AssetUriLoader */
    public static class C3166b implements nw3<Uri, AssetFileDescriptor>, C3165a<AssetFileDescriptor> {

        /* renamed from: a */
        public final AssetManager f17021a;

        public C3166b(AssetManager assetManager) {
            this.f17021a = assetManager;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: b */
        public r11<AssetFileDescriptor> mo25218b(AssetManager assetManager, String str) {
            return new q02(assetManager, str);
        }

        /* renamed from: c */
        public mw3<Uri, AssetFileDescriptor> mo11938c(vz3 vz3) {
            return new C3164qr(this.f17021a, this);
        }
    }

    /* renamed from: qr$c */
    /* compiled from: AssetUriLoader */
    public static class C3167c implements nw3<Uri, InputStream>, C3165a<InputStream> {

        /* renamed from: a */
        public final AssetManager f17022a;

        public C3167c(AssetManager assetManager) {
            this.f17022a = assetManager;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: b */
        public r11<InputStream> mo25218b(AssetManager assetManager, String str) {
            return new la6(assetManager, str);
        }

        /* renamed from: c */
        public mw3<Uri, InputStream> mo11938c(vz3 vz3) {
            return new C3164qr(this.f17022a, this);
        }
    }

    public C3164qr(AssetManager assetManager, C3165a<Data> aVar) {
        this.f17019a = assetManager;
        this.f17020b = aVar;
    }

    /* renamed from: c */
    public mw3.C2853a<Data> mo11934b(Uri uri, int i, int i2, xi4 xi4) {
        return new mw3.C2853a<>(new df4(uri), this.f17020b.mo25218b(this.f17019a, uri.toString().substring(f17018c)));
    }

    /* renamed from: d */
    public boolean mo11933a(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
