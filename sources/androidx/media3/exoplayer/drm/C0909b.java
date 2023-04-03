package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.media3.exoplayer.source.C0973i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.media3.exoplayer.drm.b */
/* compiled from: DrmSessionEventListener */
public interface C0909b {

    /* renamed from: androidx.media3.exoplayer.drm.b$a */
    /* compiled from: DrmSessionEventListener */
    public static class C0910a {

        /* renamed from: a */
        public final int f5006a;

        /* renamed from: b */
        public final C0973i.C0975b f5007b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C0911a> f5008c;

        /* renamed from: androidx.media3.exoplayer.drm.b$a$a */
        /* compiled from: DrmSessionEventListener */
        public static final class C0911a {

            /* renamed from: a */
            public Handler f5009a;

            /* renamed from: b */
            public C0909b f5010b;

            public C0911a(Handler handler, C0909b bVar) {
                this.f5009a = handler;
                this.f5010b = bVar;
            }
        }

        public C0910a() {
            this(new CopyOnWriteArrayList(), 0, (C0973i.C0975b) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m6587n(C0909b bVar) {
            bVar.mo7380M(this.f5006a, this.f5007b);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m6588o(C0909b bVar) {
            bVar.mo7383X(this.f5006a, this.f5007b);
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m6589p(C0909b bVar) {
            bVar.mo7385d0(this.f5006a, this.f5007b);
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m6590q(C0909b bVar, int i) {
            bVar.mo7382U(this.f5006a, this.f5007b);
            bVar.mo7381S(this.f5006a, this.f5007b, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m6591r(C0909b bVar, Exception exc) {
            bVar.mo7384Y(this.f5006a, this.f5007b, exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m6592s(C0909b bVar) {
            bVar.mo7386l0(this.f5006a, this.f5007b);
        }

        /* renamed from: g */
        public void mo7387g(Handler handler, C0909b bVar) {
            C2725kr.m20985e(handler);
            C2725kr.m20985e(bVar);
            this.f5008c.add(new C0911a(handler, bVar));
        }

        /* renamed from: h */
        public void mo7388h() {
            Iterator<C0911a> it = this.f5008c.iterator();
            while (it.hasNext()) {
                C0911a next = it.next();
                w67.m29307G0(next.f5009a, new nk1(this, next.f5010b));
            }
        }

        /* renamed from: i */
        public void mo7389i() {
            Iterator<C0911a> it = this.f5008c.iterator();
            while (it.hasNext()) {
                C0911a next = it.next();
                w67.m29307G0(next.f5009a, new mk1(this, next.f5010b));
            }
        }

        /* renamed from: j */
        public void mo7390j() {
            Iterator<C0911a> it = this.f5008c.iterator();
            while (it.hasNext()) {
                C0911a next = it.next();
                w67.m29307G0(next.f5009a, new lk1(this, next.f5010b));
            }
        }

        /* renamed from: k */
        public void mo7391k(int i) {
            Iterator<C0911a> it = this.f5008c.iterator();
            while (it.hasNext()) {
                C0911a next = it.next();
                w67.m29307G0(next.f5009a, new ik1(this, next.f5010b, i));
            }
        }

        /* renamed from: l */
        public void mo7392l(Exception exc) {
            Iterator<C0911a> it = this.f5008c.iterator();
            while (it.hasNext()) {
                C0911a next = it.next();
                w67.m29307G0(next.f5009a, new kk1(this, next.f5010b, exc));
            }
        }

        /* renamed from: m */
        public void mo7393m() {
            Iterator<C0911a> it = this.f5008c.iterator();
            while (it.hasNext()) {
                C0911a next = it.next();
                w67.m29307G0(next.f5009a, new jk1(this, next.f5010b));
            }
        }

        /* renamed from: t */
        public void mo7394t(C0909b bVar) {
            Iterator<C0911a> it = this.f5008c.iterator();
            while (it.hasNext()) {
                C0911a next = it.next();
                if (next.f5010b == bVar) {
                    this.f5008c.remove(next);
                }
            }
        }

        /* renamed from: u */
        public C0910a mo7395u(int i, C0973i.C0975b bVar) {
            return new C0910a(this.f5008c, i, bVar);
        }

        public C0910a(CopyOnWriteArrayList<C0911a> copyOnWriteArrayList, int i, C0973i.C0975b bVar) {
            this.f5008c = copyOnWriteArrayList;
            this.f5006a = i;
            this.f5007b = bVar;
        }
    }

    /* renamed from: M */
    void mo7380M(int i, C0973i.C0975b bVar);

    /* renamed from: S */
    void mo7381S(int i, C0973i.C0975b bVar, int i2);

    @Deprecated
    /* renamed from: U */
    void mo7382U(int i, C0973i.C0975b bVar);

    /* renamed from: X */
    void mo7383X(int i, C0973i.C0975b bVar);

    /* renamed from: Y */
    void mo7384Y(int i, C0973i.C0975b bVar, Exception exc);

    /* renamed from: d0 */
    void mo7385d0(int i, C0973i.C0975b bVar);

    /* renamed from: l0 */
    void mo7386l0(int i, C0973i.C0975b bVar);
}
