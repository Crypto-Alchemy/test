package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.internal.vision.C4090a;
import com.google.android.gms.internal.vision.C4105e0;
import com.google.android.gms.internal.vision.C4112f;
import com.google.android.gms.internal.vision.C4124j;
import com.google.android.gms.internal.vision.C4127k;
import com.google.android.gms.internal.vision.zzfi$zzf;
import com.google.android.gms.internal.vision.zzfi$zzj;
import com.google.android.gms.internal.vision.zzs;
import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public class LogUtils {
    public static C4127k zza(long j, int i, String str, String str2, List<C4124j> list, zzs zzs) {
        C4112f.C4113a x = C4112f.m34255x();
        zzfi$zzf.C4146a y = zzfi$zzf.m34346x().mo31237x(str2).mo31235v(j).mo31238y((long) i);
        y.mo31236w(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((zzfi$zzf) ((C4105e0) y.mo31184e()));
        return (C4127k) ((C4105e0) C4127k.m34303x().mo31219v((C4112f) ((C4105e0) x.mo31204w(arrayList).mo31203v((zzfi$zzj) ((C4105e0) zzfi$zzj.m34363x().mo31248w((long) zzs.f23050d).mo31247v((long) zzs.f23049a).mo31249x((long) zzs.f23051e).mo31250y(zzs.f23052g).mo31184e())).mo31184e())).mo31184e());
    }

    private static String zzb(Context context) {
        try {
            return tn7.m52384a(context).mo45811e(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            fd3.m44254c(e, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static C4090a zza(Context context) {
        C4090a.C4091a v = C4090a.m34192x().mo31155v(context.getPackageName());
        String zzb = zzb(context);
        if (zzb != null) {
            v.mo31156w(zzb);
        }
        return (C4090a) ((C4105e0) v.mo31184e());
    }
}
