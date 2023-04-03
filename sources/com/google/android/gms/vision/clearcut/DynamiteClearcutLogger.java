package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.C4127k;
import java.util.concurrent.ExecutorService;

@Keep
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public class DynamiteClearcutLogger {
    private static final ExecutorService zza = zk8.m55143a().mo29730j(2, ly8.f31460a);
    private ma8 zzb = new ma8(0.03333333333333333d);
    /* access modifiers changed from: private */
    public VisionClearcutLogger zzc;

    public DynamiteClearcutLogger(@RecentlyNonNull Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i, C4127k kVar) {
        if (i != 3 || this.zzb.mo45730a()) {
            zza.execute(new s48(this, i, kVar));
        } else {
            fd3.m44256e("Skipping image analysis log due to rate limiting", new Object[0]);
        }
    }
}
