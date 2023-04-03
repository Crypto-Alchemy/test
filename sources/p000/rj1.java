package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C1710a;
import java.security.MessageDigest;

/* renamed from: rj1 */
/* compiled from: DrawableTransformation */
public class rj1 implements mw6<Drawable> {

    /* renamed from: b */
    public final mw6<Bitmap> f17253b;

    /* renamed from: c */
    public final boolean f17254c;

    public rj1(mw6<Bitmap> mw6, boolean z) {
        this.f17253b = mw6;
        this.f17254c = z;
    }

    /* renamed from: a */
    public bf5<Drawable> mo33a(Context context, bf5<Drawable> bf5, int i, int i2) {
        t20 f = C1710a.m12218c(context).mo12359f();
        Drawable drawable = bf5.get();
        bf5<Bitmap> a = qj1.m25705a(f, drawable, i, i2);
        if (a != null) {
            bf5<Bitmap> a2 = this.f17253b.mo33a(context, a, i, i2);
            if (!a2.equals(a)) {
                return mo25393d(context, a2);
            }
            a2.mo11634a();
            return bf5;
        } else if (!this.f17254c) {
            return bf5;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        this.f17253b.mo18753b(messageDigest);
    }

    /* renamed from: c */
    public mw6<BitmapDrawable> mo25392c() {
        return this;
    }

    /* renamed from: d */
    public final bf5<Drawable> mo25393d(Context context, bf5<Bitmap> bf5) {
        return gf3.m18047e(context.getResources(), bf5);
    }

    public boolean equals(Object obj) {
        if (obj instanceof rj1) {
            return this.f17253b.equals(((rj1) obj).f17253b);
        }
        return false;
    }

    public int hashCode() {
        return this.f17253b.hashCode();
    }
}
