package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;

/* renamed from: dk */
/* compiled from: AnimatedDrawableBackendFrameRenderer */
public class C2168dk implements i20 {

    /* renamed from: e */
    public static final Class<?> f10727e = C2168dk.class;

    /* renamed from: a */
    public final f20 f10728a;

    /* renamed from: b */
    public C1637bk f10729b;

    /* renamed from: c */
    public AnimatedImageCompositor f10730c;

    /* renamed from: d */
    public final AnimatedImageCompositor.C1944b f10731d;

    /* renamed from: dk$a */
    /* compiled from: AnimatedDrawableBackendFrameRenderer */
    public class C2169a implements AnimatedImageCompositor.C1944b {
        public C2169a() {
        }

        /* renamed from: a */
        public void mo13325a(int i, Bitmap bitmap) {
        }

        /* renamed from: b */
        public nh0<Bitmap> mo13326b(int i) {
            return C2168dk.this.f10728a.mo19591f(i);
        }
    }

    public C2168dk(f20 f20, C1637bk bkVar) {
        C2169a aVar = new C2169a();
        this.f10731d = aVar;
        this.f10728a = f20;
        this.f10729b = bkVar;
        this.f10730c = new AnimatedImageCompositor(bkVar, aVar);
    }

    /* renamed from: a */
    public boolean mo18794a(int i, Bitmap bitmap) {
        try {
            this.f10730c.mo13324g(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            oy1.m24420g(f10727e, e, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i));
            return false;
        }
    }

    /* renamed from: c */
    public int mo18795c() {
        return this.f10729b.getHeight();
    }

    /* renamed from: d */
    public void mo18796d(Rect rect) {
        C1637bk e = this.f10729b.mo11685e(rect);
        if (e != this.f10729b) {
            this.f10729b = e;
            this.f10730c = new AnimatedImageCompositor(e, this.f10731d);
        }
    }

    /* renamed from: e */
    public int mo18797e() {
        return this.f10729b.getWidth();
    }
}
