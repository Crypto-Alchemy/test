package p000;

import android.os.Handler;
import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.source.C0966f;
import androidx.media3.exoplayer.source.C0968g;
import androidx.media3.exoplayer.source.C0971h;
import androidx.media3.exoplayer.source.C0973i;
import androidx.media3.exoplayer.source.C0977j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.x06;

/* renamed from: fs3 */
/* compiled from: MediaSourceList */
public final class fs3 {

    /* renamed from: a */
    public final br4 f12022a;

    /* renamed from: b */
    public final List<C2325c> f12023b = new ArrayList();

    /* renamed from: c */
    public final IdentityHashMap<C0971h, C2325c> f12024c = new IdentityHashMap<>();

    /* renamed from: d */
    public final Map<Object, C2325c> f12025d = new HashMap();

    /* renamed from: e */
    public final C2326d f12026e;

    /* renamed from: f */
    public final C0977j.C0978a f12027f;

    /* renamed from: g */
    public final C0909b.C0910a f12028g;

    /* renamed from: h */
    public final HashMap<C2325c, C2324b> f12029h;

    /* renamed from: i */
    public final Set<C2325c> f12030i;

    /* renamed from: j */
    public x06 f12031j = new x06.C3564a(0);

    /* renamed from: k */
    public boolean f12032k;

    /* renamed from: l */
    public ov6 f12033l;

    /* renamed from: fs3$a */
    /* compiled from: MediaSourceList */
    public final class C2323a implements C0977j, C0909b {

        /* renamed from: a */
        public final C2325c f12034a;

        /* renamed from: d */
        public C0977j.C0978a f12035d;

        /* renamed from: e */
        public C0909b.C0910a f12036e;

        public C2323a(C2325c cVar) {
            this.f12035d = fs3.this.f12027f;
            this.f12036e = fs3.this.f12028g;
            this.f12034a = cVar;
        }

        /* renamed from: I */
        public void mo7600I(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3) {
            if (mo20158b(i, bVar)) {
                this.f12035d.mo7652s(vi3, jr3);
            }
        }

        /* renamed from: K */
        public void mo7601K(int i, C0973i.C0975b bVar, jr3 jr3) {
            if (mo20158b(i, bVar)) {
                this.f12035d.mo7649j(jr3);
            }
        }

        /* renamed from: M */
        public void mo7380M(int i, C0973i.C0975b bVar) {
            if (mo20158b(i, bVar)) {
                this.f12036e.mo7388h();
            }
        }

        /* renamed from: O */
        public void mo7602O(int i, C0973i.C0975b bVar, jr3 jr3) {
            if (mo20158b(i, bVar)) {
                this.f12035d.mo7644E(jr3);
            }
        }

        /* renamed from: R */
        public void mo7603R(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3) {
            if (mo20158b(i, bVar)) {
                this.f12035d.mo7641B(vi3, jr3);
            }
        }

        /* renamed from: S */
        public void mo7381S(int i, C0973i.C0975b bVar, int i2) {
            if (mo20158b(i, bVar)) {
                this.f12036e.mo7391k(i2);
            }
        }

        /* renamed from: U */
        public /* synthetic */ void mo7382U(int i, C0973i.C0975b bVar) {
            hk1.m18918a(this, i, bVar);
        }

        /* renamed from: X */
        public void mo7383X(int i, C0973i.C0975b bVar) {
            if (mo20158b(i, bVar)) {
                this.f12036e.mo7389i();
            }
        }

        /* renamed from: Y */
        public void mo7384Y(int i, C0973i.C0975b bVar, Exception exc) {
            if (mo20158b(i, bVar)) {
                this.f12036e.mo7392l(exc);
            }
        }

        /* renamed from: b */
        public final boolean mo20158b(int i, C0973i.C0975b bVar) {
            C0973i.C0975b bVar2;
            if (bVar != null) {
                bVar2 = fs3.m17347n(this.f12034a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int e = fs3.m17350r(this.f12034a, i);
            C0977j.C0978a aVar = this.f12035d;
            if (aVar.f5260a != e || !w67.m29346c(aVar.f5261b, bVar2)) {
                this.f12035d = fs3.this.f12027f.mo7645F(e, bVar2, 0);
            }
            C0909b.C0910a aVar2 = this.f12036e;
            if (aVar2.f5006a == e && w67.m29346c(aVar2.f5007b, bVar2)) {
                return true;
            }
            this.f12036e = fs3.this.f12028g.mo7395u(e, bVar2);
            return true;
        }

        /* renamed from: d0 */
        public void mo7385d0(int i, C0973i.C0975b bVar) {
            if (mo20158b(i, bVar)) {
                this.f12036e.mo7390j();
            }
        }

        /* renamed from: j0 */
        public void mo7606j0(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3, IOException iOException, boolean z) {
            if (mo20158b(i, bVar)) {
                this.f12035d.mo7658y(vi3, jr3, iOException, z);
            }
        }

        /* renamed from: l0 */
        public void mo7386l0(int i, C0973i.C0975b bVar) {
            if (mo20158b(i, bVar)) {
                this.f12036e.mo7393m();
            }
        }

        /* renamed from: n0 */
        public void mo7607n0(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3) {
            if (mo20158b(i, bVar)) {
                this.f12035d.mo7655v(vi3, jr3);
            }
        }
    }

    /* renamed from: fs3$b */
    /* compiled from: MediaSourceList */
    public static final class C2324b {

        /* renamed from: a */
        public final C0973i f12038a;

        /* renamed from: b */
        public final C0973i.C0976c f12039b;

        /* renamed from: c */
        public final C2323a f12040c;

        public C2324b(C0973i iVar, C0973i.C0976c cVar, C2323a aVar) {
            this.f12038a = iVar;
            this.f12039b = cVar;
            this.f12040c = aVar;
        }
    }

    /* renamed from: fs3$c */
    /* compiled from: MediaSourceList */
    public static final class C2325c implements ds3 {

        /* renamed from: a */
        public final C0968g f12041a;

        /* renamed from: b */
        public final Object f12042b = new Object();

        /* renamed from: c */
        public final List<C0973i.C0975b> f12043c = new ArrayList();

        /* renamed from: d */
        public int f12044d;

        /* renamed from: e */
        public boolean f12045e;

        public C2325c(C0973i iVar, boolean z) {
            this.f12041a = new C0968g(iVar, z);
        }

        /* renamed from: a */
        public Object mo18924a() {
            return this.f12042b;
        }

        /* renamed from: b */
        public C0831s mo18925b() {
            return this.f12041a.mo7634M();
        }

        /* renamed from: c */
        public void mo20159c(int i) {
            this.f12044d = i;
            this.f12045e = false;
            this.f12043c.clear();
        }
    }

    /* renamed from: fs3$d */
    /* compiled from: MediaSourceList */
    public interface C2326d {
        /* renamed from: b */
        void mo11227b();
    }

    public fs3(C2326d dVar, C3142qf qfVar, Handler handler, br4 br4) {
        this.f12022a = br4;
        this.f12026e = dVar;
        C0977j.C0978a aVar = new C0977j.C0978a();
        this.f12027f = aVar;
        C0909b.C0910a aVar2 = new C0909b.C0910a();
        this.f12028g = aVar2;
        this.f12029h = new HashMap<>();
        this.f12030i = new HashSet();
        aVar.mo7646g(handler, qfVar);
        aVar2.mo7387g(handler, qfVar);
    }

    /* renamed from: m */
    public static Object m17346m(Object obj) {
        return C3568x5.m29876B(obj);
    }

    /* renamed from: n */
    public static C0973i.C0975b m17347n(C2325c cVar, C0973i.C0975b bVar) {
        for (int i = 0; i < cVar.f12043c.size(); i++) {
            if (cVar.f12043c.get(i).f15662d == bVar.f15662d) {
                return bVar.mo7638c(m17349p(cVar, bVar.f15659a));
            }
        }
        return null;
    }

    /* renamed from: o */
    public static Object m17348o(Object obj) {
        return C3568x5.m29877C(obj);
    }

    /* renamed from: p */
    public static Object m17349p(C2325c cVar, Object obj) {
        return C3568x5.m29878E(cVar.f12042b, obj);
    }

    /* renamed from: r */
    public static int m17350r(C2325c cVar, int i) {
        return i + cVar.f12044d;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m17351t(C0973i iVar, C0831s sVar) {
        this.f12026e.mo11227b();
    }

    /* renamed from: A */
    public C0831s mo20139A(int i, int i2, x06 x06) {
        boolean z;
        if (i < 0 || i > i2 || i2 > mo20150q()) {
            z = false;
        } else {
            z = true;
        }
        C2725kr.m20981a(z);
        this.f12031j = x06;
        mo20140B(i, i2);
        return mo20146i();
    }

    /* renamed from: B */
    public final void mo20140B(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            C2325c remove = this.f12023b.remove(i3);
            this.f12025d.remove(remove.f12042b);
            mo20144g(i3, -remove.f12041a.mo7634M().mo6882t());
            remove.f12045e = true;
            if (this.f12032k) {
                mo20152u(remove);
            }
        }
    }

    /* renamed from: C */
    public C0831s mo20141C(List<C2325c> list, x06 x06) {
        mo20140B(0, this.f12023b.size());
        return mo20143f(this.f12023b.size(), list, x06);
    }

    /* renamed from: D */
    public C0831s mo20142D(x06 x06) {
        int q = mo20150q();
        if (x06.getLength() != q) {
            x06 = x06.mo27644e().mo27646g(0, q);
        }
        this.f12031j = x06;
        return mo20146i();
    }

    /* renamed from: f */
    public C0831s mo20143f(int i, List<C2325c> list, x06 x06) {
        if (!list.isEmpty()) {
            this.f12031j = x06;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C2325c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    C2325c cVar2 = this.f12023b.get(i2 - 1);
                    cVar.mo20159c(cVar2.f12044d + cVar2.f12041a.mo7634M().mo6882t());
                } else {
                    cVar.mo20159c(0);
                }
                mo20144g(i2, cVar.f12041a.mo7634M().mo6882t());
                this.f12023b.add(i2, cVar);
                this.f12025d.put(cVar.f12042b, cVar);
                if (this.f12032k) {
                    mo20155x(cVar);
                    if (this.f12024c.isEmpty()) {
                        this.f12030i.add(cVar);
                    } else {
                        mo20147j(cVar);
                    }
                }
            }
        }
        return mo20146i();
    }

    /* renamed from: g */
    public final void mo20144g(int i, int i2) {
        while (i < this.f12023b.size()) {
            this.f12023b.get(i).f12044d += i2;
            i++;
        }
    }

    /* renamed from: h */
    public C0971h mo20145h(C0973i.C0975b bVar, C2891nf nfVar, long j) {
        Object o = m17348o(bVar.f15659a);
        C0973i.C0975b c = bVar.mo7638c(m17346m(bVar.f15659a));
        C2325c cVar = (C2325c) C2725kr.m20985e(this.f12025d.get(o));
        mo20149l(cVar);
        cVar.f12043c.add(c);
        C0966f I = cVar.f12041a.mo7197c(c, nfVar, j);
        this.f12024c.put(I, cVar);
        mo20148k();
        return I;
    }

    /* renamed from: i */
    public C0831s mo20146i() {
        if (this.f12023b.isEmpty()) {
            return C0831s.f4433a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f12023b.size(); i2++) {
            C2325c cVar = this.f12023b.get(i2);
            cVar.f12044d = i;
            i += cVar.f12041a.mo7634M().mo6882t();
        }
        return new dr4(this.f12023b, this.f12031j);
    }

    /* renamed from: j */
    public final void mo20147j(C2325c cVar) {
        C2324b bVar = this.f12029h.get(cVar);
        if (bVar != null) {
            bVar.f12038a.mo7573k(bVar.f12039b);
        }
    }

    /* renamed from: k */
    public final void mo20148k() {
        Iterator<C2325c> it = this.f12030i.iterator();
        while (it.hasNext()) {
            C2325c next = it.next();
            if (next.f12043c.isEmpty()) {
                mo20147j(next);
                it.remove();
            }
        }
    }

    /* renamed from: l */
    public final void mo20149l(C2325c cVar) {
        this.f12030i.add(cVar);
        C2324b bVar = this.f12029h.get(cVar);
        if (bVar != null) {
            bVar.f12038a.mo7570h(bVar.f12039b);
        }
    }

    /* renamed from: q */
    public int mo20150q() {
        return this.f12023b.size();
    }

    /* renamed from: s */
    public boolean mo20151s() {
        return this.f12032k;
    }

    /* renamed from: u */
    public final void mo20152u(C2325c cVar) {
        if (cVar.f12045e && cVar.f12043c.isEmpty()) {
            C2324b bVar = (C2324b) C2725kr.m20985e(this.f12029h.remove(cVar));
            bVar.f12038a.mo7572j(bVar.f12039b);
            bVar.f12038a.mo7567b(bVar.f12040c);
            bVar.f12038a.mo7569f(bVar.f12040c);
            this.f12030i.remove(cVar);
        }
    }

    /* renamed from: v */
    public C0831s mo20153v(int i, int i2, int i3, x06 x06) {
        boolean z;
        if (i < 0 || i > i2 || i2 > mo20150q() || i3 < 0) {
            z = false;
        } else {
            z = true;
        }
        C2725kr.m20981a(z);
        this.f12031j = x06;
        if (i == i2 || i == i3) {
            return mo20146i();
        }
        int min = Math.min(i, i3);
        int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int i4 = this.f12023b.get(min).f12044d;
        w67.m29389x0(this.f12023b, i, i2, i3);
        while (min <= max) {
            C2325c cVar = this.f12023b.get(min);
            cVar.f12044d = i4;
            i4 += cVar.f12041a.mo7634M().mo6882t();
            min++;
        }
        return mo20146i();
    }

    /* renamed from: w */
    public void mo20154w(ov6 ov6) {
        C2725kr.m20987g(!this.f12032k);
        this.f12033l = ov6;
        for (int i = 0; i < this.f12023b.size(); i++) {
            C2325c cVar = this.f12023b.get(i);
            mo20155x(cVar);
            this.f12030i.add(cVar);
        }
        this.f12032k = true;
    }

    /* renamed from: x */
    public final void mo20155x(C2325c cVar) {
        C0968g gVar = cVar.f12041a;
        es3 es3 = new es3(this);
        C2323a aVar = new C2323a(cVar);
        this.f12029h.put(cVar, new C2324b(gVar, es3, aVar));
        gVar.mo7566a(w67.m29388x(), aVar);
        gVar.mo7568e(w67.m29388x(), aVar);
        gVar.mo7571i(es3, this.f12033l, this.f12022a);
    }

    /* renamed from: y */
    public void mo20156y() {
        for (C2324b next : this.f12029h.values()) {
            try {
                next.f12038a.mo7572j(next.f12039b);
            } catch (RuntimeException e) {
                gk3.m18127d("MediaSourceList", "Failed to release child source.", e);
            }
            next.f12038a.mo7567b(next.f12040c);
            next.f12038a.mo7569f(next.f12040c);
        }
        this.f12029h.clear();
        this.f12030i.clear();
        this.f12032k = false;
    }

    /* renamed from: z */
    public void mo20157z(C0971h hVar) {
        C2325c cVar = (C2325c) C2725kr.m20985e(this.f12024c.remove(hVar));
        cVar.f12041a.mo7203g(hVar);
        cVar.f12043c.remove(((C0966f) hVar).f5238a);
        if (!this.f12024c.isEmpty()) {
            mo20148k();
        }
        mo20152u(cVar);
    }
}
