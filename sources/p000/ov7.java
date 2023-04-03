package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.C4469b;
import com.google.android.play.core.assetpacks.C4477i;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ov7 */
public final class ov7 {

    /* renamed from: k */
    public static final pq7 f32456k = new pq7("AssetPackManager");

    /* renamed from: a */
    public final C4469b f32457a;

    /* renamed from: b */
    public final rt7<yw7> f32458b;

    /* renamed from: c */
    public final hr7 f32459c;

    /* renamed from: d */
    public final mw7 f32460d;

    /* renamed from: e */
    public final C4477i f32461e;

    /* renamed from: f */
    public final rs7 f32462f;

    /* renamed from: g */
    public final hs7 f32463g;

    /* renamed from: h */
    public final rt7<Executor> f32464h;

    /* renamed from: i */
    public final cq7 f32465i;

    /* renamed from: j */
    public final Handler f32466j = new Handler(Looper.getMainLooper());

    public ov7(C4469b bVar, rt7<yw7> rt7, hr7 hr7, mw7 mw7, C4477i iVar, rs7 rs7, hs7 hs7, rt7<Executor> rt72, cq7 cq7) {
        this.f32457a = bVar;
        this.f32458b = rt7;
        this.f32459c = hr7;
        this.f32460d = mw7;
        this.f32461e = iVar;
        this.f32462f = rs7;
        this.f32463g = hs7;
        this.f32464h = rt72;
        this.f32465i = cq7;
    }

    /* renamed from: a */
    public final void mo46550a(boolean z) {
        boolean e = this.f32459c.mo49913e();
        this.f32459c.mo49911c(z);
        if (z && !e) {
            mo46553f();
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo46551b() {
        this.f32457a.mo34161I();
        this.f32457a.mo34158F();
        this.f32457a.mo34162J();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo46552c() {
        ul6<List<String>> e = this.f32458b.mo47486a().mo29745e(this.f32457a.mo34175q());
        C4469b bVar = this.f32457a;
        bVar.getClass();
        e.mo41741b(this.f32464h.mo47486a(), ev7.m44100a(bVar));
        e.mo41740a(this.f32464h.mo47486a(), fv7.f29010a);
    }

    /* renamed from: f */
    public final void mo46553f() {
        this.f32464h.mo47486a().execute(new av7(this, (byte[]) null));
    }
}
