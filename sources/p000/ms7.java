package p000;

import android.content.Context;
import com.google.android.play.core.assetpacks.AssetPackExtractionService;
import com.google.android.play.core.assetpacks.C4468a;
import com.google.android.play.core.assetpacks.C4469b;
import com.google.android.play.core.assetpacks.C4472d;
import com.google.android.play.core.assetpacks.C4474f;
import com.google.android.play.core.assetpacks.C4475g;
import com.google.android.play.core.assetpacks.C4477i;
import com.google.android.play.core.assetpacks.C4478j;
import com.google.android.play.core.assetpacks.C4479k;
import com.google.android.play.core.assetpacks.C4480l;
import com.google.android.play.core.assetpacks.C4481m;
import com.google.android.play.core.assetpacks.C4484p;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.concurrent.Executor;

/* renamed from: ms7 */
public final class ms7 implements aq7 {

    /* renamed from: A */
    public xt7<cs7> f31769A;

    /* renamed from: a */
    public final aw7 f31770a;

    /* renamed from: b */
    public xt7<Context> f31771b;

    /* renamed from: c */
    public xt7<lu7> f31772c;

    /* renamed from: d */
    public xt7<C4469b> f31773d;

    /* renamed from: e */
    public xt7<rs7> f31774e;

    /* renamed from: f */
    public xt7<C4468a> f31775f;

    /* renamed from: g */
    public xt7<String> f31776g = vt7.m53502b(new nw7(this.f31771b));

    /* renamed from: h */
    public xt7<yw7> f31777h = new tt7();

    /* renamed from: i */
    public xt7<Executor> f31778i;

    /* renamed from: j */
    public xt7<C4477i> f31779j;

    /* renamed from: k */
    public xt7<hr7> f31780k;

    /* renamed from: l */
    public xt7<C4474f> f31781l;

    /* renamed from: m */
    public xt7<C4484p> f31782m;

    /* renamed from: n */
    public xt7<C4479k> f31783n;

    /* renamed from: o */
    public xt7<cq7> f31784o;

    /* renamed from: p */
    public xt7<C4480l> f31785p;

    /* renamed from: q */
    public xt7<C4481m> f31786q;

    /* renamed from: r */
    public xt7<C4472d> f31787r;

    /* renamed from: s */
    public xt7<C4478j> f31788s;

    /* renamed from: t */
    public xt7<C4475g> f31789t;

    /* renamed from: u */
    public xt7<hs7> f31790u;

    /* renamed from: v */
    public xt7<Executor> f31791v;

    /* renamed from: w */
    public xt7<bu7> f31792w;

    /* renamed from: x */
    public xt7<mw7> f31793x;

    /* renamed from: y */
    public xt7<ov7> f31794y;

    /* renamed from: z */
    public xt7<Object> f31795z;

    public /* synthetic */ ms7(aw7 aw7) {
        this.f31770a = aw7;
        kw7 kw7 = new kw7(aw7);
        this.f31771b = kw7;
        xt7<lu7> b = vt7.m53502b(new gu7((xt7<Context>) kw7, (char[]) null));
        this.f31772c = b;
        this.f31773d = vt7.m53502b(new hw7(this.f31771b, b, (short[]) null));
        xt7<rs7> b2 = vt7.m53502b(ss7.f33996a);
        this.f31774e = b2;
        this.f31775f = vt7.m53502b(new hw7(this.f31771b, b2, (char[]) null));
        xt7<Executor> b3 = vt7.m53502b(dw7.f28330a);
        this.f31778i = b3;
        this.f31779j = vt7.m53502b(new st7(this.f31773d, this.f31777h, this.f31774e, b3));
        tt7 tt7 = new tt7();
        this.f31780k = tt7;
        this.f31781l = vt7.m53502b(new st7(this.f31773d, this.f31777h, tt7, this.f31774e, (byte[]) null));
        this.f31782m = vt7.m53502b(new gu7(this.f31773d, (short[]) null));
        this.f31783n = vt7.m53502b(new gu7(this.f31773d));
        xt7<cq7> b4 = vt7.m53502b(qt7.m50863b());
        this.f31784o = b4;
        this.f31785p = vt7.m53502b(new ku7(this.f31773d, this.f31777h, this.f31779j, this.f31778i, this.f31774e, b4));
        this.f31786q = vt7.m53502b(new hw7(this.f31773d, this.f31777h, (int[]) null));
        xt7<C4472d> b5 = vt7.m53502b(new gu7(this.f31777h, (byte[]) null));
        this.f31787r = b5;
        xt7<C4478j> b6 = vt7.m53502b(new wt7(this.f31779j, this.f31773d, b5));
        this.f31788s = b6;
        this.f31789t = vt7.m53502b(new ps7(this.f31779j, this.f31777h, this.f31781l, this.f31782m, this.f31783n, this.f31785p, this.f31786q, b6));
        this.f31790u = vt7.m53502b(js7.f30583a);
        xt7<Executor> b7 = vt7.m53502b(pw7.f32858a);
        this.f31791v = b7;
        tt7.m52444b(this.f31780k, vt7.m53502b(new ps7(this.f31771b, this.f31779j, this.f31789t, this.f31777h, this.f31774e, this.f31790u, this.f31778i, b7, (byte[]) null)));
        xt7<bu7> b8 = vt7.m53502b(new ku7(this.f31776g, this.f31780k, this.f31774e, this.f31771b, this.f31772c, this.f31778i, (byte[]) null));
        this.f31792w = b8;
        tt7.m52444b(this.f31777h, vt7.m53502b(new wt7(this.f31771b, this.f31775f, b8, (byte[]) null)));
        xt7<mw7> b9 = vt7.m53502b(iv7.m46031b(this.f31771b));
        this.f31793x = b9;
        xt7<ov7> b10 = vt7.m53502b(new rv7(this.f31773d, this.f31777h, this.f31780k, b9, this.f31779j, this.f31774e, this.f31790u, this.f31778i, this.f31784o));
        this.f31794y = b10;
        this.f31795z = vt7.m53502b(new hw7(b10, this.f31771b));
        this.f31769A = vt7.m53502b(new hw7(this.f31771b, this.f31773d, (byte[]) null));
    }

    /* renamed from: a */
    public final void mo29038a(ExtractionForegroundService extractionForegroundService) {
        extractionForegroundService.f24698d = kw7.m47563c(this.f31770a);
        extractionForegroundService.f24699e = this.f31794y.mo42984a();
    }

    /* renamed from: b */
    public final void mo29039b(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.f24696a = this.f31769A.mo42984a();
    }
}
