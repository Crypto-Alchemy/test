package p000;

import com.google.android.play.core.assetpacks.C4469b;
import com.google.android.play.core.assetpacks.C4474f;
import com.google.android.play.core.assetpacks.C4477i;
import java.util.concurrent.Executor;

/* renamed from: st7 */
public final class st7 implements xt7<C4477i> {

    /* renamed from: a */
    public final xt7 f34003a;

    /* renamed from: b */
    public final xt7 f34004b;

    /* renamed from: c */
    public final xt7 f34005c;

    /* renamed from: d */
    public final xt7 f34006d;

    /* renamed from: e */
    public final /* synthetic */ int f34007e = 0;

    public st7(xt7<C4469b> xt7, xt7<yw7> xt72, xt7<rs7> xt73, xt7<Executor> xt74) {
        this.f34003a = xt7;
        this.f34004b = xt72;
        this.f34005c = xt73;
        this.f34006d = xt74;
    }

    public st7(xt7<C4469b> xt7, xt7<yw7> xt72, xt7<hr7> xt73, xt7<rs7> xt74, byte[] bArr) {
        this.f34003a = xt7;
        this.f34004b = xt72;
        this.f34005c = xt73;
        this.f34006d = xt74;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42984a() {
        if (this.f34007e != 0) {
            return new C4474f((C4469b) this.f34003a.mo42984a(), vt7.m53503c(this.f34004b), vt7.m53503c(this.f34005c), (rs7) this.f34006d.mo42984a());
        }
        Object a = this.f34003a.mo42984a();
        return new C4477i((C4469b) a, vt7.m53503c(this.f34004b), (rs7) this.f34005c.mo42984a(), vt7.m53503c(this.f34006d));
    }
}
