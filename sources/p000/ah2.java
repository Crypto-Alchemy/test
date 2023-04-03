package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.C1710a;
import java.io.File;

/* renamed from: ah2 */
/* compiled from: GlideRequests */
public class ah2 extends me5 {
    public ah2(C1710a aVar, lg3 lg3, pe5 pe5, Context context) {
        super(aVar, lg3, pe5, context);
    }

    /* renamed from: E */
    public void mo23143E(qe5 qe5) {
        if (qe5 instanceof yg2) {
            super.mo23143E(qe5);
        } else {
            super.mo23143E(new yg2().mo11567a(qe5));
        }
    }

    /* renamed from: I */
    public <ResourceType> zg2<ResourceType> mo23147d(Class<ResourceType> cls) {
        return new zg2<>(this.f14948a, this, cls, this.f14949d);
    }

    /* renamed from: J */
    public zg2<Bitmap> mo23148i() {
        return (zg2) super.mo23148i();
    }

    /* renamed from: K */
    public zg2<Drawable> mo23149l() {
        return (zg2) super.mo23149l();
    }

    /* renamed from: L */
    public zg2<File> mo23154p() {
        return (zg2) super.mo23154p();
    }

    /* renamed from: M */
    public zg2<Drawable> mo23158t(Bitmap bitmap) {
        return (zg2) super.mo23158t(bitmap);
    }

    /* renamed from: N */
    public zg2<Drawable> mo23160u(Uri uri) {
        return (zg2) super.mo23160u(uri);
    }

    /* renamed from: O */
    public zg2<Drawable> mo23161v(File file) {
        return (zg2) super.mo23161v(file);
    }

    /* renamed from: P */
    public zg2<Drawable> mo23162w(Integer num) {
        return (zg2) super.mo23162w(num);
    }

    /* renamed from: Q */
    public zg2<Drawable> mo23163x(Object obj) {
        return (zg2) super.mo23163x(obj);
    }

    /* renamed from: R */
    public zg2<Drawable> mo23164y(String str) {
        return (zg2) super.mo23164y(str);
    }

    /* renamed from: S */
    public zg2<Drawable> mo23165z(byte[] bArr) {
        return (zg2) super.mo23165z(bArr);
    }
}
