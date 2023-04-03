package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a */
/* compiled from: Action */
public abstract class C5428a<T> {

    /* renamed from: a */
    public final Picasso f26809a;

    /* renamed from: b */
    public final C5450k f26810b;

    /* renamed from: c */
    public final WeakReference<T> f26811c;

    /* renamed from: d */
    public final boolean f26812d;

    /* renamed from: e */
    public final int f26813e;

    /* renamed from: f */
    public final int f26814f;

    /* renamed from: g */
    public final int f26815g;

    /* renamed from: h */
    public final Drawable f26816h;

    /* renamed from: i */
    public final String f26817i;

    /* renamed from: j */
    public final Object f26818j;

    /* renamed from: k */
    public boolean f26819k;

    /* renamed from: l */
    public boolean f26820l;

    /* renamed from: com.squareup.picasso.a$a */
    /* compiled from: Action */
    public static class C5429a<M> extends WeakReference<M> {

        /* renamed from: a */
        public final C5428a f26821a;

        public C5429a(C5428a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f26821a = aVar;
        }
    }

    public C5428a(Picasso picasso, T t, C5450k kVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        C5429a aVar;
        this.f26809a = picasso;
        this.f26810b = kVar;
        if (t == null) {
            aVar = null;
        } else {
            aVar = new C5429a(this, t, picasso.f26786k);
        }
        this.f26811c = aVar;
        this.f26813e = i;
        this.f26814f = i2;
        this.f26812d = z;
        this.f26815g = i3;
        this.f26816h = drawable;
        this.f26817i = str;
        this.f26818j = obj == null ? this : obj;
    }

    /* renamed from: a */
    public void mo39489a() {
        this.f26820l = true;
    }

    /* renamed from: b */
    public abstract void mo39490b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    /* renamed from: c */
    public abstract void mo39491c(Exception exc);

    /* renamed from: d */
    public String mo39492d() {
        return this.f26817i;
    }

    /* renamed from: e */
    public int mo39493e() {
        return this.f26813e;
    }

    /* renamed from: f */
    public int mo39494f() {
        return this.f26814f;
    }

    /* renamed from: g */
    public Picasso mo39495g() {
        return this.f26809a;
    }

    /* renamed from: h */
    public Picasso.Priority mo39496h() {
        return this.f26810b.f26907t;
    }

    /* renamed from: i */
    public C5450k mo39497i() {
        return this.f26810b;
    }

    /* renamed from: j */
    public Object mo39498j() {
        return this.f26818j;
    }

    /* renamed from: k */
    public T mo39499k() {
        WeakReference<T> weakReference = this.f26811c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: l */
    public boolean mo39500l() {
        return this.f26820l;
    }

    /* renamed from: m */
    public boolean mo39501m() {
        return this.f26819k;
    }
}
