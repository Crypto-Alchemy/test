package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.google.android.play.core.appupdate.b */
final class C4467b extends ResultReceiver {

    /* renamed from: a */
    public final /* synthetic */ nv7 f24694a;

    public final void onReceiveResult(int i, Bundle bundle) {
        nv7 nv7;
        int i2 = 1;
        if (i == 1) {
            nv7 = this.f24694a;
            i2 = -1;
        } else if (i != 2) {
            nv7 = this.f24694a;
        } else {
            nv7 = this.f24694a;
            i2 = 0;
        }
        nv7.mo46239e(Integer.valueOf(i2));
    }
}
