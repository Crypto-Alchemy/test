package com.onesignal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.OneSignal;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class LocationController {

    /* renamed from: a */
    public static final List<C5106e> f25881a = new ArrayList();

    /* renamed from: b */
    public static ConcurrentHashMap<PermissionType, C5103b> f25882b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static boolean f25883c;

    /* renamed from: d */
    public static final Object f25884d = new C5102a();

    /* renamed from: e */
    public static C5104c f25885e;

    /* renamed from: f */
    public static Thread f25886f;

    /* renamed from: g */
    public static Context f25887g;

    /* renamed from: h */
    public static Location f25888h;

    /* renamed from: i */
    public static String f25889i;

    public enum PermissionType {
        STARTUP,
        PROMPT_LOCATION,
        SYNC_SERVICE
    }

    /* renamed from: com.onesignal.LocationController$a */
    public class C5102a {
    }

    /* renamed from: com.onesignal.LocationController$b */
    public interface C5103b {
        /* renamed from: a */
        void mo38437a(C5105d dVar);

        PermissionType getType();
    }

    /* renamed from: com.onesignal.LocationController$c */
    public static class C5104c extends HandlerThread {

        /* renamed from: a */
        public Handler f25891a = new Handler(getLooper());

        public C5104c() {
            super("OSH_LocationHandlerThread");
            start();
        }
    }

    /* renamed from: com.onesignal.LocationController$d */
    public static class C5105d {

        /* renamed from: a */
        public Double f25892a;

        /* renamed from: b */
        public Double f25893b;

        /* renamed from: c */
        public Float f25894c;

        /* renamed from: d */
        public Integer f25895d;

        /* renamed from: e */
        public Boolean f25896e;

        /* renamed from: f */
        public Long f25897f;

        public String toString() {
            return "LocationPoint{lat=" + this.f25892a + ", log=" + this.f25893b + ", accuracy=" + this.f25894c + ", type=" + this.f25895d + ", bg=" + this.f25896e + ", timeStamp=" + this.f25897f + '}';
        }
    }

    /* renamed from: com.onesignal.LocationController$e */
    public static abstract class C5106e implements C5103b {
        /* renamed from: b */
        public void mo38440b(OneSignal.PromptActionResult promptActionResult) {
        }
    }

    /* renamed from: a */
    public static void m40092a(C5103b bVar) {
        if (bVar instanceof C5106e) {
            List<C5106e> list = f25881a;
            synchronized (list) {
                list.add((C5106e) bVar);
            }
        }
    }

    /* renamed from: b */
    public static void m40093b(Context context, boolean z, boolean z2) {
        try {
            if (Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions).contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                f25889i = "android.permission.ACCESS_BACKGROUND_LOCATION";
            }
            if (f25889i == null || !z) {
                m40105n(z, OneSignal.PromptActionResult.PERMISSION_GRANTED);
                m40107p();
                return;
            }
            C5264j.f26409a.mo38921d(z2, f25889i);
        } catch (PackageManager.NameNotFoundException e) {
            m40105n(z, OneSignal.PromptActionResult.ERROR);
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m40094c(C5105d dVar) {
        Thread thread;
        Class<LocationController> cls = LocationController.class;
        HashMap hashMap = new HashMap();
        synchronized (cls) {
            hashMap.putAll(f25882b);
            f25882b.clear();
            thread = f25886f;
        }
        for (PermissionType permissionType : hashMap.keySet()) {
            ((C5103b) hashMap.get(permissionType)).mo38437a(dVar);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == f25886f) {
            synchronized (cls) {
                if (thread == f25886f) {
                    f25886f = null;
                }
            }
        }
        m40106o(OneSignal.m40443w0().mo46064a());
    }

    /* renamed from: d */
    public static void m40095d(Location location) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "LocationController fireCompleteForLocation with location: " + location);
        C5105d dVar = new C5105d();
        dVar.f25894c = Float.valueOf(location.getAccuracy());
        dVar.f25896e = Boolean.valueOf(OneSignal.m40347O0() ^ true);
        dVar.f25895d = Integer.valueOf(f25883c ^ true ? 1 : 0);
        dVar.f25897f = Long.valueOf(location.getTime());
        if (f25883c) {
            dVar.f25892a = Double.valueOf(new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
            dVar.f25893b = Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
        } else {
            dVar.f25892a = Double.valueOf(location.getLatitude());
            dVar.f25893b = Double.valueOf(location.getLongitude());
        }
        m40094c(dVar);
        m40104m(f25887g);
    }

    /* renamed from: e */
    public static void m40096e() {
        synchronized (f25884d) {
            if (m40101j()) {
                C5206d.m40671e();
            } else if (m40102k()) {
                C5239h.m40855e();
            }
        }
        m40094c((C5105d) null);
    }

    /* renamed from: f */
    public static long m40097f() {
        return C5342x0.m41393d(C5342x0.f26571a, "OS_LAST_LOCATION_TIME", -600000);
    }

    /* renamed from: g */
    public static void m40098g(Context context, boolean z, boolean z2, C5103b bVar) {
        int i;
        m40092a(bVar);
        f25887g = context;
        f25882b.put(bVar.getType(), bVar);
        if (!OneSignal.m40353Q0()) {
            m40105n(z, OneSignal.PromptActionResult.ERROR);
            m40096e();
            return;
        }
        int a = C6285nj.m48809a(context, "android.permission.ACCESS_FINE_LOCATION");
        int i2 = -1;
        if (a == -1) {
            i = C6285nj.m48809a(context, "android.permission.ACCESS_COARSE_LOCATION");
            f25883c = true;
        } else {
            i = -1;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            i2 = C6285nj.m48809a(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        if (a != 0) {
            try {
                List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                OneSignal.PromptActionResult promptActionResult = OneSignal.PromptActionResult.PERMISSION_DENIED;
                if (asList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                    f25889i = "android.permission.ACCESS_FINE_LOCATION";
                } else if (!asList.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                    OneSignal.m40387d1(OneSignal.LOG_LEVEL.INFO, "Location permissions not added on AndroidManifest file");
                    promptActionResult = OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST;
                } else if (i != 0) {
                    f25889i = "android.permission.ACCESS_COARSE_LOCATION";
                } else if (i3 >= 29 && asList.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    f25889i = "android.permission.ACCESS_BACKGROUND_LOCATION";
                }
                if (f25889i != null && z) {
                    C5264j.f26409a.mo38921d(z2, f25889i);
                } else if (i == 0) {
                    m40105n(z, OneSignal.PromptActionResult.PERMISSION_GRANTED);
                    m40107p();
                } else {
                    m40105n(z, promptActionResult);
                    m40096e();
                }
            } catch (PackageManager.NameNotFoundException e) {
                m40105n(z, OneSignal.PromptActionResult.ERROR);
                e.printStackTrace();
            }
        } else if (i3 < 29 || i2 == 0) {
            m40105n(z, OneSignal.PromptActionResult.PERMISSION_GRANTED);
            m40107p();
        } else {
            m40093b(context, z, z2);
        }
    }

    /* renamed from: h */
    public static C5104c m40099h() {
        if (f25885e == null) {
            synchronized (f25884d) {
                if (f25885e == null) {
                    f25885e = new C5104c();
                }
            }
        }
        return f25885e;
    }

    /* renamed from: i */
    public static boolean m40100i(Context context) {
        if (C6285nj.m48809a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || C6285nj.m48809a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m40101j() {
        if (!OSUtils.m40253B() || !OSUtils.m40287s()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m40102k() {
        if (!OSUtils.m40258G() || !OSUtils.m40290v()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m40103l() {
        /*
            java.lang.Object r0 = f25884d
            monitor-enter(r0)
            boolean r1 = m40101j()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x000e
            com.onesignal.C5206d.m40672l()     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x000e:
            boolean r1 = m40102k()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0017
            com.onesignal.C5239h.m40856l()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.LocationController.m40103l():void");
    }

    /* renamed from: m */
    public static boolean m40104m(Context context) {
        long j;
        if (!m40100i(context)) {
            OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "LocationController scheduleUpdate not possible, location permission not enabled");
            return false;
        } else if (!OneSignal.m40353Q0()) {
            OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "LocationController scheduleUpdate not possible, location shared not enabled");
            return false;
        } else {
            long a = OneSignal.m40443w0().mo46064a() - m40097f();
            if (OneSignal.m40347O0()) {
                j = 300;
            } else {
                j = 600;
            }
            long j2 = j * 1000;
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40387d1(log_level, "LocationController scheduleUpdate lastTime: " + a + " minTime: " + j2);
            C5312q0.m41240q().mo39081r(context, j2 - a);
            return true;
        }
    }

    /* renamed from: n */
    public static void m40105n(boolean z, OneSignal.PromptActionResult promptActionResult) {
        if (!z) {
            OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "LocationController sendAndClearPromptHandlers from non prompt flow");
            return;
        }
        List<C5106e> list = f25881a;
        synchronized (list) {
            OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "LocationController calling prompt handlers");
            for (C5106e b : list) {
                b.mo38440b(promptActionResult);
            }
            f25881a.clear();
        }
    }

    /* renamed from: o */
    public static void m40106o(long j) {
        C5342x0.m41401l(C5342x0.f26571a, "OS_LAST_LOCATION_TIME", j);
    }

    /* renamed from: p */
    public static void m40107p() {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "LocationController startGetLocation with lastLocation: " + f25888h);
        try {
            if (m40101j()) {
                C5206d.m40673p();
            } else if (m40102k()) {
                C5239h.m40857p();
            } else {
                OneSignal.m40376a(OneSignal.LOG_LEVEL.WARN, "LocationController startGetLocation not possible, no location dependency found");
                m40096e();
            }
        } catch (Throwable th) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.WARN, "Location permission exists but there was an error initializing: ", th);
            m40096e();
        }
    }
}
