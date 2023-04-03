package p000;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.assetpacks.C4468a;
import com.google.android.play.core.assetpacks.C4469b;
import com.google.android.play.core.assetpacks.C4481m;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* renamed from: hw7 */
public final class hw7 implements xt7<Object> {

    /* renamed from: a */
    public final xt7 f29745a;

    /* renamed from: b */
    public final xt7 f29746b;

    /* renamed from: c */
    public final /* synthetic */ int f29747c = 0;

    public hw7(xt7<ov7> xt7, xt7<Context> xt72) {
        this.f29745a = xt7;
        this.f29746b = xt72;
    }

    public hw7(xt7<Context> xt7, xt7<C4469b> xt72, byte[] bArr) {
        this.f29746b = xt7;
        this.f29745a = xt72;
    }

    public hw7(xt7<Context> xt7, xt7<rs7> xt72, char[] cArr) {
        this.f29745a = xt7;
        this.f29746b = xt72;
    }

    public hw7(xt7<C4469b> xt7, xt7<yw7> xt72, int[] iArr) {
        this.f29746b = xt7;
        this.f29745a = xt72;
    }

    public hw7(xt7<Context> xt7, xt7<lu7> xt72, short[] sArr) {
        this.f29745a = xt7;
        this.f29746b = xt72;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42984a() {
        int i = this.f29747c;
        if (i == 0) {
            Object a = this.f29745a.mo42984a();
            Context b = ((kw7) this.f29746b).mo42984a();
            ov7 ov7 = (ov7) a;
            ns7.m49001h(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
            ns7.m49001h(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
            PlayCoreDialogWrapperActivity.m36473a(b);
            ns7.m49004k(ov7);
            return ov7;
        } else if (i == 1) {
            return new cs7(((kw7) this.f29746b).mo42984a(), (C4469b) this.f29745a.mo42984a());
        } else {
            if (i == 2) {
                return new C4468a(((kw7) this.f29745a).mo42984a(), (rs7) this.f29746b.mo42984a());
            }
            if (i == 3) {
                return new C4469b(((kw7) this.f29745a).mo42984a(), (lu7) this.f29746b.mo42984a());
            }
            return new C4481m((C4469b) this.f29746b.mo42984a(), vt7.m53503c(this.f29745a));
        }
    }
}
