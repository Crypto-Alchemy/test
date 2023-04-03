package p000;

import android.content.Context;
import com.google.android.play.core.assetpacks.C4469b;
import com.google.android.play.core.assetpacks.C4477i;
import com.google.android.play.core.assetpacks.C4480l;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: ku7 */
public final class ku7 implements xt7<C4480l> {

    /* renamed from: a */
    public final xt7 f31076a;

    /* renamed from: b */
    public final xt7 f31077b;

    /* renamed from: c */
    public final xt7 f31078c;

    /* renamed from: d */
    public final xt7 f31079d;

    /* renamed from: e */
    public final xt7 f31080e;

    /* renamed from: f */
    public final xt7 f31081f;

    /* renamed from: g */
    public final /* synthetic */ int f31082g = 0;

    public ku7(xt7<C4469b> xt7, xt7<yw7> xt72, xt7<C4477i> xt73, xt7<Executor> xt74, xt7<rs7> xt75, xt7<cq7> xt76) {
        this.f31076a = xt7;
        this.f31077b = xt72;
        this.f31078c = xt73;
        this.f31079d = xt74;
        this.f31080e = xt75;
        this.f31081f = xt76;
    }

    public ku7(xt7<String> xt7, xt7<hr7> xt72, xt7<rs7> xt73, xt7<Context> xt74, xt7<lu7> xt75, xt7<Executor> xt76, byte[] bArr) {
        this.f31081f = xt7;
        this.f31077b = xt72;
        this.f31080e = xt73;
        this.f31079d = xt74;
        this.f31078c = xt75;
        this.f31076a = xt76;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42984a() {
        if (this.f31082g != 0) {
            String str = (String) this.f31081f.mo42984a();
            Object a = this.f31077b.mo42984a();
            Object a2 = this.f31080e.mo42984a();
            Context b = ((kw7) this.f31079d).mo42984a();
            Object a3 = this.f31078c.mo42984a();
            return new bu7(str != null ? new File(b.getExternalFilesDir((String) null), str) : b.getExternalFilesDir((String) null), (hr7) a, (rs7) a2, b, (lu7) a3, vt7.m53503c(this.f31076a));
        }
        Object a4 = this.f31076a.mo42984a();
        return new C4480l((C4469b) a4, vt7.m53503c(this.f31077b), (C4477i) this.f31078c.mo42984a(), vt7.m53503c(this.f31079d), (rs7) this.f31080e.mo42984a(), (cq7) this.f31081f.mo42984a());
    }
}
