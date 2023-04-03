package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.google.android.play.core.assetpacks.h */
final class C4476h extends ResultReceiver {

    /* renamed from: a */
    public final /* synthetic */ nv7 f24739a;

    /* renamed from: d */
    public final /* synthetic */ ov7 f24740d;

    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f24739a.mo46239e(-1);
            this.f24740d.f32463g.mo43375a((PendingIntent) null);
        } else if (i != 2) {
            this.f24739a.mo46238d(new AssetPackException(-100));
        } else {
            this.f24739a.mo46239e(0);
        }
    }
}
