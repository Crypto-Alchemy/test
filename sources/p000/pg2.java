package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C1710a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pg2 */
/* compiled from: GifFrameLoader */
public class pg2 {

    /* renamed from: a */
    public final ig2 f16464a;

    /* renamed from: b */
    public final Handler f16465b;

    /* renamed from: c */
    public final List<C3066b> f16466c;

    /* renamed from: d */
    public final me5 f16467d;

    /* renamed from: e */
    public final t20 f16468e;

    /* renamed from: f */
    public boolean f16469f;

    /* renamed from: g */
    public boolean f16470g;

    /* renamed from: h */
    public boolean f16471h;

    /* renamed from: i */
    public be5<Bitmap> f16472i;

    /* renamed from: j */
    public C3065a f16473j;

    /* renamed from: k */
    public boolean f16474k;

    /* renamed from: l */
    public C3065a f16475l;

    /* renamed from: m */
    public Bitmap f16476m;

    /* renamed from: n */
    public mw6<Bitmap> f16477n;

    /* renamed from: o */
    public C3065a f16478o;

    /* renamed from: p */
    public C3068d f16479p;

    /* renamed from: q */
    public int f16480q;

    /* renamed from: r */
    public int f16481r;

    /* renamed from: s */
    public int f16482s;

    /* renamed from: pg2$a */
    /* compiled from: GifFrameLoader */
    public static class C3065a extends uy0<Bitmap> {

        /* renamed from: g */
        public final Handler f16483g;

        /* renamed from: k */
        public final int f16484k;

        /* renamed from: r */
        public final long f16485r;

        /* renamed from: s */
        public Bitmap f16486s;

        public C3065a(Handler handler, int i, long j) {
            this.f16483g = handler;
            this.f16484k = i;
            this.f16485r = j;
        }

        /* renamed from: d */
        public Bitmap mo24595d() {
            return this.f16486s;
        }

        /* renamed from: h */
        public void mo19471h(Drawable drawable) {
            this.f16486s = null;
        }

        /* renamed from: i */
        public void mo19469e(Bitmap bitmap, ww6<? super Bitmap> ww6) {
            this.f16486s = bitmap;
            this.f16483g.sendMessageAtTime(this.f16483g.obtainMessage(1, this), this.f16485r);
        }
    }

    /* renamed from: pg2$b */
    /* compiled from: GifFrameLoader */
    public interface C3066b {
        /* renamed from: a */
        void mo21824a();
    }

    /* renamed from: pg2$c */
    /* compiled from: GifFrameLoader */
    public class C3067c implements Handler.Callback {
        public C3067c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                pg2.this.mo24588m((C3065a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                pg2.this.f16467d.mo23150o((C3065a) message.obj);
                return false;
            }
        }
    }

    /* renamed from: pg2$d */
    /* compiled from: GifFrameLoader */
    public interface C3068d {
        /* renamed from: a */
        void mo24598a();
    }

    public pg2(C1710a aVar, ig2 ig2, int i, int i2, mw6<Bitmap> mw6, Bitmap bitmap) {
        this(aVar.mo12359f(), C1710a.m12224t(aVar.mo12361h()), ig2, (Handler) null, m24925i(C1710a.m12224t(aVar.mo12361h()), i, i2), mw6, bitmap);
    }

    /* renamed from: g */
    public static z93 m24924g() {
        return new df4(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    public static be5<Bitmap> m24925i(me5 me5, int i, int i2) {
        return me5.mo23148i().mo11567a(((qe5) ((qe5) qe5.m25619A0(xg1.f19828b).mo22607v0(true)).mo22598q0(true)).mo22581g0(i, i2));
    }

    /* renamed from: a */
    public void mo24578a() {
        this.f16466c.clear();
        mo24589n();
        mo24592q();
        C3065a aVar = this.f16473j;
        if (aVar != null) {
            this.f16467d.mo23150o(aVar);
            this.f16473j = null;
        }
        C3065a aVar2 = this.f16475l;
        if (aVar2 != null) {
            this.f16467d.mo23150o(aVar2);
            this.f16475l = null;
        }
        C3065a aVar3 = this.f16478o;
        if (aVar3 != null) {
            this.f16467d.mo23150o(aVar3);
            this.f16478o = null;
        }
        this.f16464a.clear();
        this.f16474k = true;
    }

    /* renamed from: b */
    public ByteBuffer mo24579b() {
        return this.f16464a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap mo24580c() {
        C3065a aVar = this.f16473j;
        if (aVar != null) {
            return aVar.mo24595d();
        }
        return this.f16476m;
    }

    /* renamed from: d */
    public int mo24581d() {
        C3065a aVar = this.f16473j;
        if (aVar != null) {
            return aVar.f16484k;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap mo24582e() {
        return this.f16476m;
    }

    /* renamed from: f */
    public int mo24583f() {
        return this.f16464a.mo18571a();
    }

    /* renamed from: h */
    public int mo24584h() {
        return this.f16482s;
    }

    /* renamed from: j */
    public int mo24585j() {
        return this.f16464a.mo18580h() + this.f16480q;
    }

    /* renamed from: k */
    public int mo24586k() {
        return this.f16481r;
    }

    /* renamed from: l */
    public final void mo24587l() {
        boolean z;
        if (this.f16469f && !this.f16470g) {
            if (this.f16471h) {
                if (this.f16478o == null) {
                    z = true;
                } else {
                    z = false;
                }
                zt4.m31497a(z, "Pending target must be null when starting from the first frame");
                this.f16464a.mo18577f();
                this.f16471h = false;
            }
            C3065a aVar = this.f16478o;
            if (aVar != null) {
                this.f16478o = null;
                mo24588m(aVar);
                return;
            }
            this.f16470g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f16464a.mo18576e());
            this.f16464a.mo18573c();
            this.f16475l = new C3065a(this.f16465b, this.f16464a.mo18578g(), uptimeMillis);
            this.f16472i.mo11567a(qe5.m25620B0(m24924g())).mo11560R0(this.f16464a).mo11550H0(this.f16475l);
        }
    }

    /* renamed from: m */
    public void mo24588m(C3065a aVar) {
        C3068d dVar = this.f16479p;
        if (dVar != null) {
            dVar.mo24598a();
        }
        this.f16470g = false;
        if (this.f16474k) {
            this.f16465b.obtainMessage(2, aVar).sendToTarget();
        } else if (this.f16469f) {
            if (aVar.mo24595d() != null) {
                mo24589n();
                C3065a aVar2 = this.f16473j;
                this.f16473j = aVar;
                for (int size = this.f16466c.size() - 1; size >= 0; size--) {
                    this.f16466c.get(size).mo21824a();
                }
                if (aVar2 != null) {
                    this.f16465b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            mo24587l();
        } else if (this.f16471h) {
            this.f16465b.obtainMessage(2, aVar).sendToTarget();
        } else {
            this.f16478o = aVar;
        }
    }

    /* renamed from: n */
    public final void mo24589n() {
        Bitmap bitmap = this.f16476m;
        if (bitmap != null) {
            this.f16468e.mo25118c(bitmap);
            this.f16476m = null;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, mw6, mw6<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24590o(p000.mw6<android.graphics.Bitmap> r3, android.graphics.Bitmap r4) {
        /*
            r2 = this;
            java.lang.Object r0 = p000.zt4.m31500d(r3)
            mw6 r0 = (p000.mw6) r0
            r2.f16477n = r0
            java.lang.Object r0 = p000.zt4.m31500d(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.f16476m = r0
            be5<android.graphics.Bitmap> r0 = r2.f16472i
            qe5 r1 = new qe5
            r1.<init>()
            kz r3 = r1.mo22600r0(r3)
            be5 r3 = r0.mo11567a(r3)
            r2.f16472i = r3
            int r3 = p000.p67.m24680h(r4)
            r2.f16480q = r3
            int r3 = r4.getWidth()
            r2.f16481r = r3
            int r3 = r4.getHeight()
            r2.f16482s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pg2.mo24590o(mw6, android.graphics.Bitmap):void");
    }

    /* renamed from: p */
    public final void mo24591p() {
        if (!this.f16469f) {
            this.f16469f = true;
            this.f16474k = false;
            mo24587l();
        }
    }

    /* renamed from: q */
    public final void mo24592q() {
        this.f16469f = false;
    }

    /* renamed from: r */
    public void mo24593r(C3066b bVar) {
        if (this.f16474k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f16466c.contains(bVar)) {
            boolean isEmpty = this.f16466c.isEmpty();
            this.f16466c.add(bVar);
            if (isEmpty) {
                mo24591p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* renamed from: s */
    public void mo24594s(C3066b bVar) {
        this.f16466c.remove(bVar);
        if (this.f16466c.isEmpty()) {
            mo24592q();
        }
    }

    public pg2(t20 t20, me5 me5, ig2 ig2, Handler handler, be5<Bitmap> be5, mw6<Bitmap> mw6, Bitmap bitmap) {
        this.f16466c = new ArrayList();
        this.f16467d = me5;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C3067c()) : handler;
        this.f16468e = t20;
        this.f16465b = handler;
        this.f16472i = be5;
        this.f16464a = ig2;
        mo24590o(mw6, bitmap);
    }
}
