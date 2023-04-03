package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.drawee.components.DraweeEventTracker;
import p000.bk1;

/* renamed from: ck1 */
/* compiled from: DraweeHolder */
public class ck1<DH extends bk1> implements kf7 {

    /* renamed from: a */
    public boolean f8449a = false;

    /* renamed from: b */
    public boolean f8450b = false;

    /* renamed from: c */
    public boolean f8451c = true;

    /* renamed from: d */
    public DH f8452d;

    /* renamed from: e */
    public ak1 f8453e = null;

    /* renamed from: f */
    public final DraweeEventTracker f8454f = DraweeEventTracker.m13352a();

    public ck1(DH dh) {
        if (dh != null) {
            mo12090o(dh);
        }
    }

    /* renamed from: d */
    public static <DH extends bk1> ck1<DH> m11899d(DH dh, Context context) {
        ck1<DH> ck1 = new ck1<>(dh);
        ck1.mo12088m(context);
        return ck1;
    }

    /* renamed from: a */
    public void mo12077a(boolean z) {
        DraweeEventTracker.Event event;
        if (this.f8451c != z) {
            DraweeEventTracker draweeEventTracker = this.f8454f;
            if (z) {
                event = DraweeEventTracker.Event.ON_DRAWABLE_SHOW;
            } else {
                event = DraweeEventTracker.Event.ON_DRAWABLE_HIDE;
            }
            draweeEventTracker.mo13216b(event);
            this.f8451c = z;
            mo12079c();
        }
    }

    /* renamed from: b */
    public final void mo12078b() {
        if (!this.f8449a) {
            this.f8454f.mo13216b(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
            this.f8449a = true;
            ak1 ak1 = this.f8453e;
            if (ak1 != null && ak1.mo346g() != null) {
                this.f8453e.mo344e();
            }
        }
    }

    /* renamed from: c */
    public final void mo12079c() {
        if (!this.f8450b || !this.f8451c) {
            mo12080e();
        } else {
            mo12078b();
        }
    }

    /* renamed from: e */
    public final void mo12080e() {
        if (this.f8449a) {
            this.f8454f.mo13216b(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
            this.f8449a = false;
            if (mo12084i()) {
                this.f8453e.mo345f();
            }
        }
    }

    /* renamed from: f */
    public ak1 mo12081f() {
        return this.f8453e;
    }

    /* renamed from: g */
    public DH mo12082g() {
        return (bk1) au4.m10792g(this.f8452d);
    }

    /* renamed from: h */
    public Drawable mo12083h() {
        DH dh = this.f8452d;
        if (dh == null) {
            return null;
        }
        return dh.mo11692d();
    }

    /* renamed from: i */
    public boolean mo12084i() {
        ak1 ak1 = this.f8453e;
        if (ak1 == null || ak1.mo346g() != this.f8452d) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void mo12085j() {
        this.f8454f.mo13216b(DraweeEventTracker.Event.ON_HOLDER_ATTACH);
        this.f8450b = true;
        mo12079c();
    }

    /* renamed from: k */
    public void mo12086k() {
        this.f8454f.mo13216b(DraweeEventTracker.Event.ON_HOLDER_DETACH);
        this.f8450b = false;
        mo12079c();
    }

    /* renamed from: l */
    public boolean mo12087l(MotionEvent motionEvent) {
        if (!mo12084i()) {
            return false;
        }
        return this.f8453e.mo342b(motionEvent);
    }

    /* renamed from: m */
    public void mo12088m(Context context) {
    }

    /* renamed from: n */
    public void mo12089n(ak1 ak1) {
        boolean z = this.f8449a;
        if (z) {
            mo12080e();
        }
        if (mo12084i()) {
            this.f8454f.mo13216b(DraweeEventTracker.Event.ON_CLEAR_OLD_CONTROLLER);
            this.f8453e.mo343c((bk1) null);
        }
        this.f8453e = ak1;
        if (ak1 != null) {
            this.f8454f.mo13216b(DraweeEventTracker.Event.ON_SET_CONTROLLER);
            this.f8453e.mo343c(this.f8452d);
        } else {
            this.f8454f.mo13216b(DraweeEventTracker.Event.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            mo12078b();
        }
    }

    /* renamed from: o */
    public void mo12090o(DH dh) {
        boolean z;
        this.f8454f.mo13216b(DraweeEventTracker.Event.ON_SET_HIERARCHY);
        boolean i = mo12084i();
        mo12092p((kf7) null);
        DH dh2 = (bk1) au4.m10792g(dh);
        this.f8452d = dh2;
        Drawable d = dh2.mo11692d();
        if (d == null || d.isVisible()) {
            z = true;
        } else {
            z = false;
        }
        mo12077a(z);
        mo12092p(this);
        if (i) {
            this.f8453e.mo343c(dh);
        }
    }

    public void onDraw() {
        if (!this.f8449a) {
            oy1.m24435v(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f8453e)), toString());
            this.f8450b = true;
            this.f8451c = true;
            mo12079c();
        }
    }

    /* renamed from: p */
    public final void mo12092p(kf7 kf7) {
        Drawable h = mo12083h();
        if (h instanceof jf7) {
            ((jf7) h).mo21823k(kf7);
        }
    }

    public String toString() {
        return hf4.m18862c(this).mo21159c("controllerAttached", this.f8449a).mo21159c("holderAttached", this.f8450b).mo21159c("drawableVisible", this.f8451c).mo21158b("events", this.f8454f.toString()).toString();
    }
}
