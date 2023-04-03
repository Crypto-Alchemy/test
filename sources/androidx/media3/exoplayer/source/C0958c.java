package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.source.C0973i;
import androidx.media3.exoplayer.source.C0977j;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: androidx.media3.exoplayer.source.c */
/* compiled from: CompositeMediaSource */
public abstract class C0958c<T> extends C0955a {

    /* renamed from: h */
    public final HashMap<T, C0960b<T>> f5205h = new HashMap<>();

    /* renamed from: i */
    public Handler f5206i;

    /* renamed from: j */
    public ov6 f5207j;

    /* renamed from: androidx.media3.exoplayer.source.c$a */
    /* compiled from: CompositeMediaSource */
    public final class C0959a implements C0977j, C0909b {

        /* renamed from: a */
        public final T f5208a;

        /* renamed from: d */
        public C0977j.C0978a f5209d;

        /* renamed from: e */
        public C0909b.C0910a f5210e;

        public C0959a(T t) {
            this.f5209d = C0958c.this.mo7579s((C0973i.C0975b) null);
            this.f5210e = C0958c.this.mo7577q((C0973i.C0975b) null);
            this.f5208a = t;
        }

        /* renamed from: I */
        public void mo7600I(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3) {
            if (mo7604b(i, bVar)) {
                this.f5209d.mo7652s(vi3, mo7605g(jr3));
            }
        }

        /* renamed from: K */
        public void mo7601K(int i, C0973i.C0975b bVar, jr3 jr3) {
            if (mo7604b(i, bVar)) {
                this.f5209d.mo7649j(mo7605g(jr3));
            }
        }

        /* renamed from: M */
        public void mo7380M(int i, C0973i.C0975b bVar) {
            if (mo7604b(i, bVar)) {
                this.f5210e.mo7388h();
            }
        }

        /* renamed from: O */
        public void mo7602O(int i, C0973i.C0975b bVar, jr3 jr3) {
            if (mo7604b(i, bVar)) {
                this.f5209d.mo7644E(mo7605g(jr3));
            }
        }

        /* renamed from: R */
        public void mo7603R(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3) {
            if (mo7604b(i, bVar)) {
                this.f5209d.mo7641B(vi3, mo7605g(jr3));
            }
        }

        /* renamed from: S */
        public void mo7381S(int i, C0973i.C0975b bVar, int i2) {
            if (mo7604b(i, bVar)) {
                this.f5210e.mo7391k(i2);
            }
        }

        /* renamed from: U */
        public /* synthetic */ void mo7382U(int i, C0973i.C0975b bVar) {
            hk1.m18918a(this, i, bVar);
        }

        /* renamed from: X */
        public void mo7383X(int i, C0973i.C0975b bVar) {
            if (mo7604b(i, bVar)) {
                this.f5210e.mo7389i();
            }
        }

        /* renamed from: Y */
        public void mo7384Y(int i, C0973i.C0975b bVar, Exception exc) {
            if (mo7604b(i, bVar)) {
                this.f5210e.mo7392l(exc);
            }
        }

        /* renamed from: b */
        public final boolean mo7604b(int i, C0973i.C0975b bVar) {
            C0973i.C0975b bVar2;
            if (bVar != null) {
                bVar2 = C0958c.this.mo7561C(this.f5208a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int E = C0958c.this.mo7598E(this.f5208a, i);
            C0977j.C0978a aVar = this.f5209d;
            if (aVar.f5260a != E || !w67.m29346c(aVar.f5261b, bVar2)) {
                this.f5209d = C0958c.this.mo7578r(E, bVar2, 0);
            }
            C0909b.C0910a aVar2 = this.f5210e;
            if (aVar2.f5006a == E && w67.m29346c(aVar2.f5007b, bVar2)) {
                return true;
            }
            this.f5210e = C0958c.this.mo7576p(E, bVar2);
            return true;
        }

        /* renamed from: d0 */
        public void mo7385d0(int i, C0973i.C0975b bVar) {
            if (mo7604b(i, bVar)) {
                this.f5210e.mo7390j();
            }
        }

        /* renamed from: g */
        public final jr3 mo7605g(jr3 jr3) {
            long D = C0958c.this.mo7597D(this.f5208a, jr3.f13832f);
            long D2 = C0958c.this.mo7597D(this.f5208a, jr3.f13833g);
            if (D == jr3.f13832f && D2 == jr3.f13833g) {
                return jr3;
            }
            return new jr3(jr3.f13827a, jr3.f13828b, jr3.f13829c, jr3.f13830d, jr3.f13831e, D, D2);
        }

        /* renamed from: j0 */
        public void mo7606j0(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3, IOException iOException, boolean z) {
            if (mo7604b(i, bVar)) {
                this.f5209d.mo7658y(vi3, mo7605g(jr3), iOException, z);
            }
        }

        /* renamed from: l0 */
        public void mo7386l0(int i, C0973i.C0975b bVar) {
            if (mo7604b(i, bVar)) {
                this.f5210e.mo7393m();
            }
        }

        /* renamed from: n0 */
        public void mo7607n0(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3) {
            if (mo7604b(i, bVar)) {
                this.f5209d.mo7655v(vi3, mo7605g(jr3));
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.c$b */
    /* compiled from: CompositeMediaSource */
    public static final class C0960b<T> {

        /* renamed from: a */
        public final C0973i f5212a;

        /* renamed from: b */
        public final C0973i.C0976c f5213b;

        /* renamed from: c */
        public final C0958c<T>.C6784a f5214c;

        public C0960b(C0973i iVar, C0973i.C0976c cVar, C0958c<T>.C6784a aVar) {
            this.f5212a = iVar;
            this.f5213b = cVar;
            this.f5214c = aVar;
        }
    }

    /* renamed from: A */
    public void mo7181A() {
        for (C0960b next : this.f5205h.values()) {
            next.f5212a.mo7572j(next.f5213b);
            next.f5212a.mo7567b(next.f5214c);
            next.f5212a.mo7569f(next.f5214c);
        }
        this.f5205h.clear();
    }

    /* renamed from: C */
    public C0973i.C0975b mo7561C(T t, C0973i.C0975b bVar) {
        return bVar;
    }

    /* renamed from: D */
    public long mo7597D(T t, long j) {
        return j;
    }

    /* renamed from: E */
    public int mo7598E(T t, int i) {
        return i;
    }

    /* renamed from: G */
    public abstract void m7049F(T t, C0973i iVar, C0831s sVar);

    /* renamed from: H */
    public final void mo7599H(T t, C0973i iVar) {
        C2725kr.m20981a(!this.f5205h.containsKey(t));
        qn0 qn0 = new qn0(this, t);
        C0959a aVar = new C0959a(t);
        this.f5205h.put(t, new C0960b(iVar, qn0, aVar));
        iVar.mo7566a((Handler) C2725kr.m20985e(this.f5206i), aVar);
        iVar.mo7568e((Handler) C2725kr.m20985e(this.f5206i), aVar);
        iVar.mo7571i(qn0, this.f5207j, mo7583w());
        if (!mo7584x()) {
            iVar.mo7573k(qn0);
        }
    }

    /* renamed from: m */
    public void mo7204m() throws IOException {
        for (C0960b<T> bVar : this.f5205h.values()) {
            bVar.f5212a.mo7204m();
        }
    }

    /* renamed from: u */
    public void mo7581u() {
        for (C0960b next : this.f5205h.values()) {
            next.f5212a.mo7573k(next.f5213b);
        }
    }

    /* renamed from: v */
    public void mo7582v() {
        for (C0960b next : this.f5205h.values()) {
            next.f5212a.mo7570h(next.f5213b);
        }
    }

    /* renamed from: y */
    public void mo7205y(ov6 ov6) {
        this.f5207j = ov6;
        this.f5206i = w67.m29384v();
    }
}
