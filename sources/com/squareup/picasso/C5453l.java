package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.C5450k;
import com.squareup.picasso.Picasso;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.l */
/* compiled from: RequestCreator */
public class C5453l {

    /* renamed from: m */
    public static final AtomicInteger f26925m = new AtomicInteger();

    /* renamed from: a */
    public final Picasso f26926a;

    /* renamed from: b */
    public final C5450k.C5452b f26927b;

    /* renamed from: c */
    public boolean f26928c;

    /* renamed from: d */
    public boolean f26929d;

    /* renamed from: e */
    public boolean f26930e = true;

    /* renamed from: f */
    public int f26931f;

    /* renamed from: g */
    public int f26932g;

    /* renamed from: h */
    public int f26933h;

    /* renamed from: i */
    public int f26934i;

    /* renamed from: j */
    public Drawable f26935j;

    /* renamed from: k */
    public Drawable f26936k;

    /* renamed from: l */
    public Object f26937l;

    public C5453l(Picasso picasso, Uri uri, int i) {
        if (!picasso.f26790o) {
            this.f26926a = picasso;
            this.f26927b = new C5450k.C5452b(uri, i, picasso.f26787l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    /* renamed from: a */
    public C5453l mo39580a() {
        this.f26927b.mo39575b(17);
        return this;
    }

    /* renamed from: b */
    public C5453l mo39581b() {
        this.f26937l = null;
        return this;
    }

    /* renamed from: c */
    public final C5450k mo39582c(long j) {
        int andIncrement = f26925m.getAndIncrement();
        C5450k a = this.f26927b.mo39574a();
        a.f26888a = andIncrement;
        a.f26889b = j;
        boolean z = this.f26926a.f26789n;
        if (z) {
            C5459q.m41892t("Main", "created", a.mo39572g(), a.toString());
        }
        C5450k p = this.f26926a.mo39473p(a);
        if (p != a) {
            p.f26888a = andIncrement;
            p.f26889b = j;
            if (z) {
                String d = p.mo39569d();
                C5459q.m41892t("Main", "changed", d, "into " + p);
            }
        }
        return p;
    }

    /* renamed from: d */
    public C5453l mo39583d() {
        this.f26929d = true;
        return this;
    }

    /* renamed from: e */
    public final Drawable mo39584e() {
        int i = this.f26931f;
        if (i != 0) {
            return this.f26926a.f26780e.getDrawable(i);
        }
        return this.f26935j;
    }

    /* renamed from: f */
    public void mo39585f(ImageView imageView) {
        mo39586g(imageView, (q90) null);
    }

    /* renamed from: g */
    public void mo39586g(ImageView imageView, q90 q90) {
        Bitmap m;
        ImageView imageView2 = imageView;
        q90 q902 = q90;
        long nanoTime = System.nanoTime();
        C5459q.m41875c();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f26927b.mo39576c()) {
            this.f26926a.mo39460b(imageView2);
            if (this.f26930e) {
                C5447i.m41824d(imageView2, mo39584e());
            }
        } else {
            if (this.f26929d) {
                if (!this.f26927b.mo39577d()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f26930e) {
                            C5447i.m41824d(imageView2, mo39584e());
                        }
                        this.f26926a.mo39463e(imageView2, new cb1(this, imageView2, q902));
                        return;
                    }
                    this.f26927b.mo39578e(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C5450k c = mo39582c(nanoTime);
            String f = C5459q.m41878f(c);
            if (!MemoryPolicy.shouldReadFromMemoryCache(this.f26933h) || (m = this.f26926a.mo39470m(f)) == null) {
                if (this.f26930e) {
                    C5447i.m41824d(imageView2, mo39584e());
                }
                this.f26926a.mo39465g(new C5446h(this.f26926a, imageView, c, this.f26933h, this.f26934i, this.f26932g, this.f26936k, f, this.f26937l, q90, this.f26928c));
                return;
            }
            this.f26926a.mo39460b(imageView2);
            Picasso picasso = this.f26926a;
            Context context = picasso.f26780e;
            Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
            C5447i.m41823c(imageView, context, m, loadedFrom, this.f26928c, picasso.f26788m);
            if (this.f26926a.f26789n) {
                String g = c.mo39572g();
                C5459q.m41892t("Main", "completed", g, "from " + loadedFrom);
            }
            if (q902 != null) {
                q90.onSuccess();
            }
        }
    }

    /* renamed from: h */
    public void mo39587h(C5457o oVar) {
        Bitmap m;
        long nanoTime = System.nanoTime();
        C5459q.m41875c();
        if (oVar == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f26929d) {
            Drawable drawable = null;
            if (!this.f26927b.mo39576c()) {
                this.f26926a.mo39461c(oVar);
                if (this.f26930e) {
                    drawable = mo39584e();
                }
                oVar.onPrepareLoad(drawable);
                return;
            }
            C5450k c = mo39582c(nanoTime);
            String f = C5459q.m41878f(c);
            if (!MemoryPolicy.shouldReadFromMemoryCache(this.f26933h) || (m = this.f26926a.mo39470m(f)) == null) {
                if (this.f26930e) {
                    drawable = mo39584e();
                }
                oVar.onPrepareLoad(drawable);
                this.f26926a.mo39465g(new C5458p(this.f26926a, oVar, c, this.f26933h, this.f26934i, this.f26936k, f, this.f26937l, this.f26932g));
                return;
            }
            this.f26926a.mo39461c(oVar);
            oVar.onBitmapLoaded(m, Picasso.LoadedFrom.MEMORY);
        } else {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
    }

    /* renamed from: i */
    public C5453l mo39588i() {
        this.f26928c = true;
        return this;
    }

    /* renamed from: j */
    public C5453l mo39589j() {
        if (this.f26931f != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        } else if (this.f26935j == null) {
            this.f26930e = false;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    /* renamed from: k */
    public C5453l mo39590k(int i, int i2) {
        this.f26927b.mo39578e(i, i2);
        return this;
    }

    /* renamed from: l */
    public C5453l mo39591l(lw6 lw6) {
        this.f26927b.mo39579f(lw6);
        return this;
    }

    /* renamed from: m */
    public C5453l mo39592m() {
        this.f26929d = false;
        return this;
    }
}
