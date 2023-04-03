package p000;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: pk */
/* compiled from: AnimatedImageResult */
public class C3078pk {

    /* renamed from: a */
    public final C2687kk f16518a;

    /* renamed from: b */
    public final int f16519b;

    /* renamed from: c */
    public nh0<Bitmap> f16520c;

    /* renamed from: d */
    public List<nh0<Bitmap>> f16521d;

    /* renamed from: e */
    public z20 f16522e;

    public C3078pk(C3150qk qkVar) {
        this.f16518a = (C2687kk) au4.m10792g(qkVar.mo25129e());
        this.f16519b = qkVar.mo25128d();
        this.f16520c = qkVar.mo25130f();
        this.f16521d = qkVar.mo25127c();
        this.f16522e = qkVar.mo25126b();
    }

    /* renamed from: b */
    public static C3078pk m25000b(C2687kk kkVar) {
        return new C3078pk(kkVar);
    }

    /* renamed from: e */
    public static C3150qk m25001e(C2687kk kkVar) {
        return new C3150qk(kkVar);
    }

    /* renamed from: a */
    public synchronized void mo24623a() {
        nh0.m23178h(this.f16520c);
        this.f16520c = null;
        nh0.m23179i(this.f16521d);
        this.f16521d = null;
    }

    /* renamed from: c */
    public z20 mo24624c() {
        return this.f16522e;
    }

    /* renamed from: d */
    public C2687kk mo24625d() {
        return this.f16518a;
    }

    public C3078pk(C2687kk kkVar) {
        this.f16518a = (C2687kk) au4.m10792g(kkVar);
        this.f16519b = 0;
    }
}
