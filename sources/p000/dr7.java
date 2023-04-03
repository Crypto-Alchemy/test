package p000;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;

/* renamed from: dr7 */
public final /* synthetic */ class dr7 implements Runnable {

    /* renamed from: a */
    public final hr7 f28282a;

    /* renamed from: d */
    public final Bundle f28283d;

    /* renamed from: e */
    public final AssetPackState f28284e;

    public dr7(hr7 hr7, Bundle bundle, AssetPackState assetPackState) {
        this.f28282a = hr7;
        this.f28283d = bundle;
        this.f28284e = assetPackState;
    }

    public final void run() {
        this.f28282a.mo43372h(this.f28283d, this.f28284e);
    }
}
