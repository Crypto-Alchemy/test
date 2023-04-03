package p000;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.C4468a;

/* renamed from: wq7 */
public final class wq7 extends oq7<Void> {

    /* renamed from: c */
    public final int f35409c;

    /* renamed from: d */
    public final String f35410d;

    /* renamed from: e */
    public final int f35411e;

    /* renamed from: f */
    public final /* synthetic */ C4468a f35412f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wq7(C4468a aVar, nv7<Void> nv7, int i, String str, int i2) {
        super(aVar, nv7);
        this.f35412f = aVar;
        this.f35409c = i;
        this.f35410d = str;
        this.f35411e = i2;
    }

    /* renamed from: e1 */
    public final void mo43031e1(Bundle bundle) {
        this.f35412f.f24705c.mo42953b();
        int i = bundle.getInt("error_code");
        C4468a.f24701f.mo46853b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f35411e;
        if (i2 > 0) {
            this.f35412f.mo34152x(this.f35409c, this.f35410d, i2 - 1);
        }
    }
}
