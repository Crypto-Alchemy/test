package com.onesignal;

import android.location.Location;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;
import com.onesignal.OneSignal;

/* renamed from: com.onesignal.h */
/* compiled from: HMSLocationController */
public class C5239h extends LocationController {

    /* renamed from: j */
    public static FusedLocationProviderClient f26335j;

    /* renamed from: k */
    public static C5242c f26336k;

    /* renamed from: com.onesignal.h$a */
    /* compiled from: HMSLocationController */
    public class C5240a implements OnFailureListener {
    }

    /* renamed from: com.onesignal.h$b */
    /* compiled from: HMSLocationController */
    public class C5241b implements OnSuccessListener<Location> {
    }

    /* renamed from: com.onesignal.h$c */
    /* compiled from: HMSLocationController */
    public static class C5242c extends LocationCallback {

        /* renamed from: a */
        public FusedLocationProviderClient f26337a;

        public C5242c(FusedLocationProviderClient fusedLocationProviderClient) {
            this.f26337a = fusedLocationProviderClient;
            mo38831a();
        }

        /* renamed from: a */
        public final void mo38831a() {
            long j;
            if (OneSignal.m40347O0()) {
                j = 270000;
            } else {
                j = 570000;
            }
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (((double) j) * 1.5d)).setPriority(102);
            OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "HMSLocationController Huawei LocationServices requestLocationUpdates!");
            this.f26337a.requestLocationUpdates(priority, this, LocationController.m40099h().getLooper());
        }
    }

    /* renamed from: e */
    public static void m40855e() {
        synchronized (LocationController.f25884d) {
            f26335j = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m40856l() {
        /*
            java.lang.Object r0 = com.onesignal.LocationController.f25884d
            monitor-enter(r0)
            com.onesignal.OneSignal$LOG_LEVEL r1 = com.onesignal.OneSignal.LOG_LEVEL.DEBUG     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "HMSLocationController onFocusChange!"
            com.onesignal.OneSignal.m40376a(r1, r2)     // Catch:{ all -> 0x002c }
            boolean r1 = com.onesignal.LocationController.m40102k()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0016
            com.huawei.hms.location.FusedLocationProviderClient r1 = f26335j     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x0016:
            com.huawei.hms.location.FusedLocationProviderClient r1 = f26335j     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            com.onesignal.h$c r2 = f26336k     // Catch:{ all -> 0x002c }
            if (r2 == 0) goto L_0x0021
            r1.removeLocationUpdates(r2)     // Catch:{ all -> 0x002c }
        L_0x0021:
            com.onesignal.h$c r1 = new com.onesignal.h$c     // Catch:{ all -> 0x002c }
            com.huawei.hms.location.FusedLocationProviderClient r2 = f26335j     // Catch:{ all -> 0x002c }
            r1.<init>(r2)     // Catch:{ all -> 0x002c }
            f26336k = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5239h.m40856l():void");
    }

    /* renamed from: p */
    public static void m40857p() {
        m40858q();
    }

    /* renamed from: q */
    public static void m40858q() {
        synchronized (LocationController.f25884d) {
            if (f26335j == null) {
                try {
                    f26335j = LocationServices.getFusedLocationProviderClient(LocationController.f25887g);
                } catch (Exception e) {
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                    OneSignal.m40376a(log_level, "Huawei LocationServices getFusedLocationProviderClient failed! " + e);
                    m40855e();
                    return;
                }
            }
            Location location = LocationController.f25888h;
            if (location != null) {
                LocationController.m40095d(location);
            } else {
                f26335j.getLastLocation().addOnSuccessListener(new C5241b()).addOnFailureListener(new C5240a());
            }
        }
    }
}
