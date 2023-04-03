package com.onesignal;

import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.onesignal.OneSignal;

/* renamed from: com.onesignal.d */
/* compiled from: GMSLocationController */
public class C5206d extends LocationController {

    /* renamed from: j */
    public static ai2 f26221j;

    /* renamed from: k */
    public static C5210d f26222k;

    /* renamed from: com.onesignal.d$a */
    /* compiled from: GMSLocationController */
    public class C5207a implements Runnable {
        public void run() {
            try {
                Thread.sleep((long) C5206d.m40676s());
                OneSignal.m40376a(OneSignal.LOG_LEVEL.WARN, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.");
                LocationController.m40096e();
                LocationController.m40104m(LocationController.f25887g);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: com.onesignal.d$b */
    /* compiled from: GMSLocationController */
    public static class C5208b {
        /* renamed from: a */
        public static Location m40679a(GoogleApiClient googleApiClient) {
            synchronized (LocationController.f25884d) {
                if (!googleApiClient.mo30502g()) {
                    return null;
                }
                Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
                return lastLocation;
            }
        }

        /* renamed from: b */
        public static void m40680b(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
            try {
                synchronized (LocationController.f25884d) {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    if (googleApiClient.mo30502g()) {
                        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
                    }
                }
            } catch (Throwable th) {
                OneSignal.m40379b(OneSignal.LOG_LEVEL.WARN, "FusedLocationApi.requestLocationUpdates failed!", th);
            }
        }
    }

    /* renamed from: com.onesignal.d$c */
    /* compiled from: GMSLocationController */
    public static class C5209c implements GoogleApiClient.C4011b, GoogleApiClient.C4012c {
        public C5209c() {
        }

        public /* synthetic */ C5209c(C5207a aVar) {
            this();
        }

        public void onConnected(Bundle bundle) {
            synchronized (LocationController.f25884d) {
                if (C5206d.f26221j != null) {
                    if (C5206d.f26221j.mo28984c() != null) {
                        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                        OneSignal.m40376a(log_level, "GMSLocationController GoogleApiClientListener onConnected lastLocation: " + LocationController.f25888h);
                        if (LocationController.f25888h == null) {
                            LocationController.f25888h = C5208b.m40679a(C5206d.f26221j.mo28984c());
                            OneSignal.m40376a(log_level, "GMSLocationController GoogleApiClientListener lastLocation: " + LocationController.f25888h);
                            Location location = LocationController.f25888h;
                            if (location != null) {
                                LocationController.m40095d(location);
                            }
                        }
                        C5206d.f26222k = new C5210d(C5206d.f26221j.mo28984c());
                        return;
                    }
                }
                OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "GMSLocationController GoogleApiClientListener onConnected googleApiClient not available, returning");
            }
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, "GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult);
            C5206d.m40671e();
        }

        public void onConnectionSuspended(int i) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, "GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i);
            C5206d.m40671e();
        }
    }

    /* renamed from: com.onesignal.d$d */
    /* compiled from: GMSLocationController */
    public static class C5210d implements LocationListener {

        /* renamed from: a */
        public GoogleApiClient f26223a;

        public C5210d(GoogleApiClient googleApiClient) {
            this.f26223a = googleApiClient;
            mo38724a();
        }

        /* renamed from: a */
        public final void mo38724a() {
            long j;
            if (OneSignal.m40347O0()) {
                j = 270000;
            } else {
                j = 570000;
            }
            if (this.f26223a != null) {
                LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (((double) j) * 1.5d)).setPriority(102);
                OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "GMSLocationController GoogleApiClient requestLocationUpdates!");
                C5208b.m40680b(this.f26223a, priority, this);
            }
        }
    }

    /* renamed from: e */
    public static void m40671e() {
        synchronized (LocationController.f25884d) {
            ai2 ai2 = f26221j;
            if (ai2 != null) {
                ai2.mo28983b();
            }
            f26221j = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m40672l() {
        /*
            java.lang.Object r0 = com.onesignal.LocationController.f25884d
            monitor-enter(r0)
            com.onesignal.OneSignal$LOG_LEVEL r1 = com.onesignal.OneSignal.LOG_LEVEL.DEBUG     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "GMSLocationController onFocusChange!"
            com.onesignal.OneSignal.m40376a(r1, r2)     // Catch:{ all -> 0x0037 }
            ai2 r1 = f26221j     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0035
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.mo28984c()     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.mo30502g()     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0019
            goto L_0x0035
        L_0x0019:
            ai2 r1 = f26221j     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0033
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.mo28984c()     // Catch:{ all -> 0x0037 }
            com.onesignal.d$d r2 = f26222k     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x002c
            com.google.android.gms.location.FusedLocationProviderApi r2 = com.google.android.gms.location.LocationServices.FusedLocationApi     // Catch:{ all -> 0x0037 }
            com.onesignal.d$d r3 = f26222k     // Catch:{ all -> 0x0037 }
            r2.removeLocationUpdates(r1, r3)     // Catch:{ all -> 0x0037 }
        L_0x002c:
            com.onesignal.d$d r2 = new com.onesignal.d$d     // Catch:{ all -> 0x0037 }
            r2.<init>(r1)     // Catch:{ all -> 0x0037 }
            f26222k = r2     // Catch:{ all -> 0x0037 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5206d.m40672l():void");
    }

    /* renamed from: p */
    public static void m40673p() {
        m40677t();
    }

    /* renamed from: s */
    public static int m40676s() {
        return 30000;
    }

    /* renamed from: t */
    public static void m40677t() {
        if (LocationController.f25886f == null) {
            synchronized (LocationController.f25884d) {
                m40678u();
                if (f26221j != null) {
                    Location location = LocationController.f25888h;
                    if (location != null) {
                        LocationController.m40095d(location);
                    }
                }
                C5209c cVar = new C5209c((C5207a) null);
                ai2 ai2 = new ai2(new GoogleApiClient.C4010a(LocationController.f25887g).mo30506a(LocationServices.API).mo30507b(cVar).mo30508c(cVar).mo30510e(LocationController.m40099h().f25891a).mo30509d());
                f26221j = ai2;
                ai2.mo28982a();
            }
        }
    }

    /* renamed from: u */
    public static void m40678u() {
        Thread thread = new Thread(new C5207a(), "OS_GMS_LOCATION_FALLBACK");
        LocationController.f25886f = thread;
        thread.start();
    }
}
