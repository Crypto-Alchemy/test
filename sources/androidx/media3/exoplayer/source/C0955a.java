package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.source.C0973i;
import androidx.media3.exoplayer.source.C0977j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.media3.exoplayer.source.a */
/* compiled from: BaseMediaSource */
public abstract class C0955a implements C0973i {

    /* renamed from: a */
    public final ArrayList<C0973i.C0976c> f5188a = new ArrayList<>(1);

    /* renamed from: b */
    public final HashSet<C0973i.C0976c> f5189b = new HashSet<>(1);

    /* renamed from: c */
    public final C0977j.C0978a f5190c = new C0977j.C0978a();

    /* renamed from: d */
    public final C0909b.C0910a f5191d = new C0909b.C0910a();

    /* renamed from: e */
    public Looper f5192e;

    /* renamed from: f */
    public C0831s f5193f;

    /* renamed from: g */
    public br4 f5194g;

    /* renamed from: A */
    public abstract void mo7181A();

    /* renamed from: a */
    public final void mo7566a(Handler handler, C0977j jVar) {
        C2725kr.m20985e(handler);
        C2725kr.m20985e(jVar);
        this.f5190c.mo7646g(handler, jVar);
    }

    /* renamed from: b */
    public final void mo7567b(C0977j jVar) {
        this.f5190c.mo7642C(jVar);
    }

    /* renamed from: e */
    public final void mo7568e(Handler handler, C0909b bVar) {
        C2725kr.m20985e(handler);
        C2725kr.m20985e(bVar);
        this.f5191d.mo7387g(handler, bVar);
    }

    /* renamed from: f */
    public final void mo7569f(C0909b bVar) {
        this.f5191d.mo7394t(bVar);
    }

    /* renamed from: h */
    public final void mo7570h(C0973i.C0976c cVar) {
        C2725kr.m20985e(this.f5192e);
        boolean isEmpty = this.f5189b.isEmpty();
        this.f5189b.add(cVar);
        if (isEmpty) {
            mo7582v();
        }
    }

    /* renamed from: i */
    public final void mo7571i(C0973i.C0976c cVar, ov6 ov6, br4 br4) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f5192e;
        if (looper == null || looper == myLooper) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        this.f5194g = br4;
        C0831s sVar = this.f5193f;
        this.f5188a.add(cVar);
        if (this.f5192e == null) {
            this.f5192e = myLooper;
            this.f5189b.add(cVar);
            mo7205y(ov6);
        } else if (sVar != null) {
            mo7570h(cVar);
            cVar.mo7639a(this, sVar);
        }
    }

    /* renamed from: j */
    public final void mo7572j(C0973i.C0976c cVar) {
        this.f5188a.remove(cVar);
        if (this.f5188a.isEmpty()) {
            this.f5192e = null;
            this.f5193f = null;
            this.f5194g = null;
            this.f5189b.clear();
            mo7181A();
            return;
        }
        mo7573k(cVar);
    }

    /* renamed from: k */
    public final void mo7573k(C0973i.C0976c cVar) {
        boolean z = !this.f5189b.isEmpty();
        this.f5189b.remove(cVar);
        if (z && this.f5189b.isEmpty()) {
            mo7581u();
        }
    }

    /* renamed from: n */
    public /* synthetic */ boolean mo7574n() {
        return vr3.m29082b(this);
    }

    /* renamed from: o */
    public /* synthetic */ C0831s mo7575o() {
        return vr3.m29081a(this);
    }

    /* renamed from: p */
    public final C0909b.C0910a mo7576p(int i, C0973i.C0975b bVar) {
        return this.f5191d.mo7395u(i, bVar);
    }

    /* renamed from: q */
    public final C0909b.C0910a mo7577q(C0973i.C0975b bVar) {
        return this.f5191d.mo7395u(0, bVar);
    }

    /* renamed from: r */
    public final C0977j.C0978a mo7578r(int i, C0973i.C0975b bVar, long j) {
        return this.f5190c.mo7645F(i, bVar, j);
    }

    /* renamed from: s */
    public final C0977j.C0978a mo7579s(C0973i.C0975b bVar) {
        return this.f5190c.mo7645F(0, bVar, 0);
    }

    /* renamed from: t */
    public final C0977j.C0978a mo7580t(C0973i.C0975b bVar, long j) {
        C2725kr.m20985e(bVar);
        return this.f5190c.mo7645F(0, bVar, j);
    }

    /* renamed from: u */
    public void mo7581u() {
    }

    /* renamed from: v */
    public void mo7582v() {
    }

    /* renamed from: w */
    public final br4 mo7583w() {
        return (br4) C2725kr.m20989i(this.f5194g);
    }

    /* renamed from: x */
    public final boolean mo7584x() {
        return !this.f5189b.isEmpty();
    }

    /* renamed from: y */
    public abstract void mo7205y(ov6 ov6);

    /* renamed from: z */
    public final void mo7585z(C0831s sVar) {
        this.f5193f = sVar;
        Iterator<C0973i.C0976c> it = this.f5188a.iterator();
        while (it.hasNext()) {
            it.next().mo7639a(this, sVar);
        }
    }
}
