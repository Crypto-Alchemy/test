package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0798k;
import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.source.C0973i;
import androidx.media3.exoplayer.upstream.C1018a;
import androidx.media3.exoplayer.upstream.C1019b;
import com.google.common.collect.ImmutableList;
import p000.d21;
import p000.x11;

/* renamed from: androidx.media3.exoplayer.source.s */
/* compiled from: SingleSampleMediaSource */
public final class C1008s extends C0955a {

    /* renamed from: h */
    public final d21 f5433h;

    /* renamed from: i */
    public final x11.C3565a f5434i;

    /* renamed from: j */
    public final C0792h f5435j;

    /* renamed from: k */
    public final long f5436k;

    /* renamed from: l */
    public final C1019b f5437l;

    /* renamed from: m */
    public final boolean f5438m;

    /* renamed from: n */
    public final C0831s f5439n;

    /* renamed from: o */
    public final C0798k f5440o;

    /* renamed from: p */
    public ov6 f5441p;

    /* renamed from: androidx.media3.exoplayer.source.s$b */
    /* compiled from: SingleSampleMediaSource */
    public static final class C1010b {

        /* renamed from: a */
        public final x11.C3565a f5442a;

        /* renamed from: b */
        public C1019b f5443b = new C1018a();

        /* renamed from: c */
        public boolean f5444c = true;

        /* renamed from: d */
        public Object f5445d;

        /* renamed from: e */
        public String f5446e;

        public C1010b(x11.C3565a aVar) {
            this.f5442a = (x11.C3565a) C2725kr.m20985e(aVar);
        }

        /* renamed from: a */
        public C1008s mo7804a(C0798k.C0814l lVar, long j) {
            return new C1008s(this.f5446e, lVar, this.f5442a, j, this.f5443b, this.f5444c, this.f5445d);
        }

        /* renamed from: b */
        public C1010b mo7805b(C1019b bVar) {
            if (bVar == null) {
                bVar = new C1018a();
            }
            this.f5443b = bVar;
            return this;
        }
    }

    /* renamed from: A */
    public void mo7181A() {
    }

    /* renamed from: c */
    public C0971h mo7197c(C0973i.C0975b bVar, C2891nf nfVar, long j) {
        return new C1004r(this.f5433h, this.f5434i, this.f5441p, this.f5435j, this.f5436k, this.f5437l, mo7579s(bVar), this.f5438m);
    }

    /* renamed from: d */
    public C0798k mo7199d() {
        return this.f5440o;
    }

    /* renamed from: g */
    public void mo7203g(C0971h hVar) {
        ((C1004r) hVar).mo7801p();
    }

    /* renamed from: m */
    public void mo7204m() {
    }

    /* renamed from: y */
    public void mo7205y(ov6 ov6) {
        this.f5441p = ov6;
        mo7585z(this.f5439n);
    }

    public C1008s(String str, C0798k.C0814l lVar, x11.C3565a aVar, long j, C1019b bVar, boolean z, Object obj) {
        C0798k.C0814l lVar2 = lVar;
        this.f5434i = aVar;
        this.f5436k = j;
        this.f5437l = bVar;
        this.f5438m = z;
        C0798k a = new C0798k.C0801c().mo6759g(Uri.EMPTY).mo6756d(lVar2.f4323a.toString()).mo6757e(ImmutableList.m36628of(lVar)).mo6758f(obj).mo6753a();
        this.f5440o = a;
        C0792h.C0794b U = new C0792h.C0794b().mo6670e0((String) dy3.m43720a(lVar2.f4324b, "text/x-unknown")).mo6661V(lVar2.f4325c).mo6672g0(lVar2.f4326d).mo6668c0(lVar2.f4327e).mo6660U(lVar2.f4328f);
        String str2 = lVar2.f4329g;
        this.f5435j = U.mo6658S(str2 == null ? str : str2).mo6644E();
        this.f5433h = new d21.C2129b().mo18411i(lVar2.f4323a).mo18404b(1).mo18403a();
        this.f5439n = new m36(j, true, false, false, (Object) null, a);
    }
}
