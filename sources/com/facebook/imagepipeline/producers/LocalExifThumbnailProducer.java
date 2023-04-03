package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

public class LocalExifThumbnailProducer implements wp6<gp1> {

    /* renamed from: a */
    public final Executor f9667a;

    /* renamed from: b */
    public final qs4 f9668b;

    /* renamed from: c */
    public final ContentResolver f9669c;

    @hi1
    public class Api24Utils {
        public Api24Utils() {
        }

        /* renamed from: a */
        public ExifInterface mo13405a(FileDescriptor fileDescriptor) throws IOException {
            if (Build.VERSION.SDK_INT >= 24) {
                return new ExifInterface(fileDescriptor);
            }
            return null;
        }

        public /* synthetic */ Api24Utils(LocalExifThumbnailProducer localExifThumbnailProducer, C1954a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$a */
    public class C1954a extends f96<gp1> {

        /* renamed from: r */
        public final /* synthetic */ ImageRequest f9671r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1954a(vq0 vq0, aw4 aw4, wv4 wv4, String str, ImageRequest imageRequest) {
            super(vq0, aw4, wv4, str);
            this.f9671r = imageRequest;
        }

        /* renamed from: j */
        public void mo13406b(gp1 gp1) {
            gp1.m18285c(gp1);
        }

        /* renamed from: k */
        public Map<String, String> mo13408i(gp1 gp1) {
            boolean z;
            if (gp1 != null) {
                z = true;
            } else {
                z = false;
            }
            return ImmutableMap.m13301of("createdThumbnail", Boolean.toString(z));
        }

        /* renamed from: l */
        public gp1 mo13407c() throws Exception {
            ExifInterface f = LocalExifThumbnailProducer.this.mo13403f(this.f9671r.mo13458u());
            if (f == null || !f.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.mo13401d(LocalExifThumbnailProducer.this.f9668b.mo19482d((byte[]) au4.m10792g(f.getThumbnail())), f);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$b */
    public class C1955b extends C2439gz {

        /* renamed from: a */
        public final /* synthetic */ f96 f9673a;

        public C1955b(f96 f96) {
            this.f9673a = f96;
        }

        /* renamed from: b */
        public void mo13412b() {
            this.f9673a.mo20438a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, qs4 qs4, ContentResolver contentResolver) {
        this.f9667a = executor;
        this.f9668b = qs4;
        this.f9669c = contentResolver;
    }

    /* renamed from: a */
    public void mo11350a(vq0<gp1> vq0, wv4 wv4) {
        aw4 g = wv4.mo20281g();
        ImageRequest i = wv4.mo20286i();
        wv4.mo20278d("local", "exif");
        C1954a aVar = new C1954a(vq0, g, wv4, "LocalExifThumbnailProducer", i);
        wv4.mo20292o(new C1955b(aVar));
        this.f9667a.execute(aVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public final gp1 mo13401d(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        int i;
        Pair<Integer, Integer> a = b30.m11037a(new rs4(pooledByteBuffer));
        int g = mo13404g(exifInterface);
        int i2 = -1;
        if (a != null) {
            i = ((Integer) a.first).intValue();
        } else {
            i = -1;
        }
        if (a != null) {
            i2 = ((Integer) a.second).intValue();
        }
        nh0 v = nh0.m23181v(pooledByteBuffer);
        try {
            gp1 gp1 = new gp1((nh0<PooledByteBuffer>) v);
            nh0.m23178h(v);
            gp1.mo20738P(r81.f17197a);
            gp1.mo20739Q(g);
            gp1.mo20741W(i);
            gp1.mo20737O(i2);
            return gp1;
        } catch (Throwable th) {
            nh0.m23178h(v);
            throw th;
        }
    }

    /* renamed from: e */
    public boolean mo13402e(String str) throws IOException {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public ExifInterface mo13403f(Uri uri) {
        String b = i57.m19419b(this.f9669c, uri);
        if (b == null) {
            return null;
        }
        try {
            if (mo13402e(b)) {
                return new ExifInterface(b);
            }
            AssetFileDescriptor a = i57.m19418a(this.f9669c, uri);
            if (a != null && Build.VERSION.SDK_INT >= 24) {
                ExifInterface a2 = new Api24Utils(this, (C1954a) null).mo13405a(a.getFileDescriptor());
                a.close();
                return a2;
            }
            return null;
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            oy1.m24417d(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
    }

    /* renamed from: g */
    public final int mo13404g(ExifInterface exifInterface) {
        return x23.m29842a(Integer.parseInt((String) au4.m10792g(exifInterface.getAttribute("Orientation"))));
    }
}
