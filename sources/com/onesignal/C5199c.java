package com.onesignal;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import p000.bc7;

/* renamed from: com.onesignal.c */
/* compiled from: DraggableRelativeLayout */
public class C5199c extends RelativeLayout {

    /* renamed from: k */
    public static final int f26197k = C5336v0.m41348b(28);

    /* renamed from: r */
    public static final int f26198r = C5336v0.m41348b(64);

    /* renamed from: a */
    public C5201b f26199a;

    /* renamed from: d */
    public bc7 f26200d;

    /* renamed from: e */
    public boolean f26201e;

    /* renamed from: g */
    public C5202c f26202g;

    /* renamed from: com.onesignal.c$a */
    /* compiled from: DraggableRelativeLayout */
    public class C5200a extends bc7.C1622c {

        /* renamed from: a */
        public int f26203a;

        public C5200a() {
        }

        /* renamed from: a */
        public int mo5582a(View view, int i, int i2) {
            return C5199c.this.f26202g.f26208d;
        }

        /* renamed from: b */
        public int mo5583b(View view, int i, int i2) {
            if (C5199c.this.f26202g.f26212h) {
                return C5199c.this.f26202g.f26206b;
            }
            this.f26203a = i;
            if (C5199c.this.f26202g.f26211g == 1) {
                if (i >= C5199c.this.f26202g.f26207c && C5199c.this.f26199a != null) {
                    C5199c.this.f26199a.mo38714b();
                }
                if (i < C5199c.this.f26202g.f26206b) {
                    return C5199c.this.f26202g.f26206b;
                }
            } else {
                if (i <= C5199c.this.f26202g.f26207c && C5199c.this.f26199a != null) {
                    C5199c.this.f26199a.mo38714b();
                }
                if (i > C5199c.this.f26202g.f26206b) {
                    return C5199c.this.f26202g.f26206b;
                }
            }
            return i;
        }

        /* renamed from: l */
        public void mo5591l(View view, float f, float f2) {
            int i = C5199c.this.f26202g.f26206b;
            if (!C5199c.this.f26201e) {
                if (C5199c.this.f26202g.f26211g == 1) {
                    if (this.f26203a > C5199c.this.f26202g.f26215k || f2 > ((float) C5199c.this.f26202g.f26213i)) {
                        i = C5199c.this.f26202g.f26214j;
                        boolean unused = C5199c.this.f26201e = true;
                        if (C5199c.this.f26199a != null) {
                            C5199c.this.f26199a.onDismiss();
                        }
                    }
                } else if (this.f26203a < C5199c.this.f26202g.f26215k || f2 < ((float) C5199c.this.f26202g.f26213i)) {
                    i = C5199c.this.f26202g.f26214j;
                    boolean unused2 = C5199c.this.f26201e = true;
                    if (C5199c.this.f26199a != null) {
                        C5199c.this.f26199a.onDismiss();
                    }
                }
            }
            if (C5199c.this.f26200d.mo11502P(C5199c.this.f26202g.f26208d, i)) {
                ga7.m17767g0(C5199c.this);
            }
        }

        /* renamed from: m */
        public boolean mo5592m(View view, int i) {
            return true;
        }
    }

    /* renamed from: com.onesignal.c$b */
    /* compiled from: DraggableRelativeLayout */
    public interface C5201b {
        /* renamed from: a */
        void mo38713a();

        /* renamed from: b */
        void mo38714b();

        void onDismiss();
    }

    /* renamed from: com.onesignal.c$c */
    /* compiled from: DraggableRelativeLayout */
    public static class C5202c {

        /* renamed from: a */
        public int f26205a;

        /* renamed from: b */
        public int f26206b;

        /* renamed from: c */
        public int f26207c;

        /* renamed from: d */
        public int f26208d;

        /* renamed from: e */
        public int f26209e;

        /* renamed from: f */
        public int f26210f;

        /* renamed from: g */
        public int f26211g;

        /* renamed from: h */
        public boolean f26212h;

        /* renamed from: i */
        public int f26213i;

        /* renamed from: j */
        public int f26214j;

        /* renamed from: k */
        public int f26215k;
    }

    public C5199c(Context context) {
        super(context);
        setClipChildren(false);
        mo38708f();
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f26200d.mo11519n(true)) {
            ga7.m17767g0(this);
        }
    }

    /* renamed from: f */
    public final void mo38708f() {
        this.f26200d = bc7.m11209o(this, 1.0f, new C5200a());
    }

    /* renamed from: g */
    public void mo38709g() {
        this.f26201e = true;
        this.f26200d.mo11504R(this, getLeft(), this.f26202g.f26214j);
        ga7.m17767g0(this);
    }

    /* renamed from: h */
    public void mo38710h(C5201b bVar) {
        this.f26199a = bVar;
    }

    /* renamed from: i */
    public void mo38711i(C5202c cVar) {
        this.f26202g = cVar;
        int unused = cVar.f26214j = cVar.f26210f + cVar.f26205a + ((Resources.getSystem().getDisplayMetrics().heightPixels - cVar.f26210f) - cVar.f26205a) + f26198r;
        int unused2 = cVar.f26213i = C5336v0.m41348b(3000);
        if (cVar.f26211g == 0) {
            int unused3 = cVar.f26214j = (-cVar.f26210f) - f26197k;
            int unused4 = cVar.f26213i = -cVar.f26213i;
            int unused5 = cVar.f26215k = cVar.f26214j / 3;
            return;
        }
        int unused6 = cVar.f26215k = (cVar.f26210f / 3) + (cVar.f26206b * 2);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C5201b bVar;
        if (this.f26201e) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (bVar = this.f26199a) != null) {
            bVar.mo38713a();
        }
        this.f26200d.mo11493G(motionEvent);
        return false;
    }
}
