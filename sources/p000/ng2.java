package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C1710a;
import java.security.MessageDigest;

/* renamed from: ng2 */
/* compiled from: GifDrawableTransformation */
public class ng2 implements mw6<jg2> {

    /* renamed from: b */
    public final mw6<Bitmap> f15542b;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, mw6<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ng2(p000.mw6<android.graphics.Bitmap> r1) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p000.zt4.m31500d(r1)
            mw6 r1 = (p000.mw6) r1
            r0.f15542b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ng2.<init>(mw6):void");
    }

    /* renamed from: a */
    public bf5<jg2> mo33a(Context context, bf5<jg2> bf5, int i, int i2) {
        jg2 jg2 = bf5.get();
        y20 y20 = new y20(jg2.mo21829e(), C1710a.m12218c(context).mo12359f());
        bf5<Bitmap> a = this.f15542b.mo33a(context, y20, i, i2);
        if (!y20.equals(a)) {
            y20.mo11634a();
        }
        jg2.mo21842m(this.f15542b, a.get());
        return bf5;
    }

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        this.f15542b.mo18753b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ng2) {
            return this.f15542b.equals(((ng2) obj).f15542b);
        }
        return false;
    }

    public int hashCode() {
        return this.f15542b.hashCode();
    }
}
