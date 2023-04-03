package p000;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: qk */
/* compiled from: AnimatedImageResultBuilder */
public class C3150qk {

    /* renamed from: a */
    public final C2687kk f16959a;

    /* renamed from: b */
    public nh0<Bitmap> f16960b;

    /* renamed from: c */
    public List<nh0<Bitmap>> f16961c;

    /* renamed from: d */
    public int f16962d;

    /* renamed from: e */
    public z20 f16963e;

    public C3150qk(C2687kk kkVar) {
        this.f16959a = kkVar;
    }

    /* renamed from: a */
    public C3078pk mo25125a() {
        try {
            return new C3078pk(this);
        } finally {
            nh0.m23178h(this.f16960b);
            this.f16960b = null;
            nh0.m23179i(this.f16961c);
            this.f16961c = null;
        }
    }

    /* renamed from: b */
    public z20 mo25126b() {
        return this.f16963e;
    }

    /* renamed from: c */
    public List<nh0<Bitmap>> mo25127c() {
        return nh0.m23177g(this.f16961c);
    }

    /* renamed from: d */
    public int mo25128d() {
        return this.f16962d;
    }

    /* renamed from: e */
    public C2687kk mo25129e() {
        return this.f16959a;
    }

    /* renamed from: f */
    public nh0<Bitmap> mo25130f() {
        return nh0.m23176f(this.f16960b);
    }

    /* renamed from: g */
    public C3150qk mo25131g(z20 z20) {
        this.f16963e = z20;
        return this;
    }

    /* renamed from: h */
    public C3150qk mo25132h(List<nh0<Bitmap>> list) {
        this.f16961c = nh0.m23177g(list);
        return this;
    }

    /* renamed from: i */
    public C3150qk mo25133i(int i) {
        this.f16962d = i;
        return this;
    }

    /* renamed from: j */
    public C3150qk mo25134j(nh0<Bitmap> nh0) {
        this.f16960b = nh0.m23176f(nh0);
        return this;
    }
}
