package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.clearcut.C4003a;
import com.google.android.gms.internal.vision.C4095b0;
import com.google.android.gms.internal.vision.C4127k;

@Keep
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public class VisionClearcutLogger {
    private final C4003a zza;
    private boolean zzb = true;

    public VisionClearcutLogger(@RecentlyNonNull Context context) {
        this.zza = new C4003a(context, "VISION", (String) null);
    }

    public final void zza(int i, C4127k kVar) {
        byte[] g = kVar.mo31221g();
        if (i < 0 || i > 3) {
            fd3.m44255d("Illegal event code: %d", Integer.valueOf(i));
            return;
        }
        try {
            if (this.zzb) {
                this.zza.mo30419a(g).mo30421b(i).mo30420a();
                return;
            }
            C4127k.C4128a x = C4127k.m34303x();
            try {
                x.mo31185f(g, 0, g.length, C4095b0.m34204c());
                fd3.m44253b("Would have logged:\n%s", x.toString());
            } catch (Exception e) {
                fd3.m44254c(e, "Parsing error", new Object[0]);
            }
        } catch (Exception e2) {
            vp8.m53450b(e2);
            fd3.m44254c(e2, "Failed to log", new Object[0]);
        }
    }
}
