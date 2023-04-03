package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.C1710a;
import com.bumptech.glide.C1719d;
import com.bumptech.glide.load.engine.C1761f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.ft3;
import p000.oe5;
import p000.tg1;

/* renamed from: com.bumptech.glide.b */
/* compiled from: GlideBuilder */
public final class C1712b {

    /* renamed from: a */
    public final Map<Class<?>, yw6<?, ?>> f8678a = new C2781lq();

    /* renamed from: b */
    public final C1719d.C1720a f8679b = new C1719d.C1720a();

    /* renamed from: c */
    public C1761f f8680c;

    /* renamed from: d */
    public t20 f8681d;

    /* renamed from: e */
    public C2982oq f8682e;

    /* renamed from: f */
    public xs3 f8683f;

    /* renamed from: g */
    public wg2 f8684g;

    /* renamed from: h */
    public wg2 f8685h;

    /* renamed from: i */
    public tg1.C3362a f8686i;

    /* renamed from: j */
    public ft3 f8687j;

    /* renamed from: k */
    public wp0 f8688k;

    /* renamed from: l */
    public int f8689l = 4;

    /* renamed from: m */
    public C1710a.C1711a f8690m = new C1713a();

    /* renamed from: n */
    public oe5.C2947b f8691n;

    /* renamed from: o */
    public wg2 f8692o;

    /* renamed from: p */
    public boolean f8693p;

    /* renamed from: q */
    public List<le5<Object>> f8694q;

    /* renamed from: com.bumptech.glide.b$a */
    /* compiled from: GlideBuilder */
    public class C1713a implements C1710a.C1711a {
        public C1713a() {
        }

        public qe5 build() {
            return new qe5();
        }
    }

    /* renamed from: com.bumptech.glide.b$b */
    /* compiled from: GlideBuilder */
    public static final class C1714b {
    }

    /* renamed from: com.bumptech.glide.b$c */
    /* compiled from: GlideBuilder */
    public static final class C1715c {
    }

    /* renamed from: com.bumptech.glide.b$d */
    /* compiled from: GlideBuilder */
    public static final class C1716d {
    }

    /* renamed from: com.bumptech.glide.b$e */
    /* compiled from: GlideBuilder */
    public static final class C1717e {
    }

    /* renamed from: a */
    public C1710a mo12373a(Context context) {
        if (this.f8684g == null) {
            this.f8684g = wg2.m29576g();
        }
        if (this.f8685h == null) {
            this.f8685h = wg2.m29574e();
        }
        if (this.f8692o == null) {
            this.f8692o = wg2.m29572c();
        }
        if (this.f8687j == null) {
            this.f8687j = new ft3.C2328a(context).mo20165a();
        }
        if (this.f8688k == null) {
            this.f8688k = new i71();
        }
        if (this.f8681d == null) {
            int b = this.f8687j.mo20162b();
            if (b > 0) {
                this.f8681d = new yl3((long) b);
            } else {
                this.f8681d = new u20();
            }
        }
        if (this.f8682e == null) {
            this.f8682e = new xl3(this.f8687j.mo20161a());
        }
        if (this.f8683f == null) {
            this.f8683f = new hm3((long) this.f8687j.mo20163d());
        }
        if (this.f8686i == null) {
            this.f8686i = new mx2(context);
        }
        if (this.f8680c == null) {
            this.f8680c = new C1761f(this.f8683f, this.f8686i, this.f8685h, this.f8684g, wg2.m29577h(), this.f8692o, this.f8693p);
        }
        List<le5<Object>> list = this.f8694q;
        if (list == null) {
            this.f8694q = Collections.emptyList();
        } else {
            this.f8694q = Collections.unmodifiableList(list);
        }
        C1719d b2 = this.f8679b.mo12385b();
        return new C1710a(context, this.f8680c, this.f8683f, this.f8681d, this.f8682e, new oe5(this.f8691n, b2), this.f8688k, this.f8689l, this.f8690m, this.f8678a, this.f8694q, b2);
    }

    /* renamed from: b */
    public void mo12374b(oe5.C2947b bVar) {
        this.f8691n = bVar;
    }
}
