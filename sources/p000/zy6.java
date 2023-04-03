package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

/* renamed from: zy6 */
/* compiled from: TwilightManager */
public class zy6 {

    /* renamed from: d */
    public static zy6 f20727d;

    /* renamed from: a */
    public final Context f20728a;

    /* renamed from: b */
    public final LocationManager f20729b;

    /* renamed from: c */
    public final C3767a f20730c = new C3767a();

    /* renamed from: zy6$a */
    /* compiled from: TwilightManager */
    public static class C3767a {

        /* renamed from: a */
        public boolean f20731a;

        /* renamed from: b */
        public long f20732b;

        /* renamed from: c */
        public long f20733c;

        /* renamed from: d */
        public long f20734d;

        /* renamed from: e */
        public long f20735e;

        /* renamed from: f */
        public long f20736f;
    }

    public zy6(Context context, LocationManager locationManager) {
        this.f20728a = context;
        this.f20729b = locationManager;
    }

    /* renamed from: a */
    public static zy6 m31590a(Context context) {
        if (f20727d == null) {
            Context applicationContext = context.getApplicationContext();
            f20727d = new zy6(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f20727d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public final Location mo28679b() {
        Location location;
        Location location2 = null;
        if (kn4.m20930c(this.f20728a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = mo28680c("network");
        } else {
            location = null;
        }
        if (kn4.m20930c(this.f20728a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = mo28680c("gps");
        }
        if (location2 == null || location == null) {
            if (location2 != null) {
                return location2;
            }
            return location;
        } else if (location2.getTime() > location.getTime()) {
            return location2;
        } else {
            return location;
        }
    }

    /* renamed from: c */
    public final Location mo28680c(String str) {
        try {
            if (this.f20729b.isProviderEnabled(str)) {
                return this.f20729b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo28681d() {
        C3767a aVar = this.f20730c;
        if (mo28682e()) {
            return aVar.f20731a;
        }
        Location b = mo28679b();
        if (b != null) {
            mo28683f(b);
            return aVar.f20731a;
        }
        int i = Calendar.getInstance().get(11);
        if (i < 6 || i >= 22) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo28682e() {
        if (this.f20730c.f20736f > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo28683f(Location location) {
        long j;
        long j2;
        C3767a aVar = this.f20730c;
        long currentTimeMillis = System.currentTimeMillis();
        yy6 b = yy6.m30873b();
        yy6 yy6 = b;
        yy6.mo28275a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = b.f20407a;
        yy6.mo28275a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (b.f20409c != 1) {
            z = false;
        }
        boolean z2 = z;
        long j4 = b.f20408b;
        long j5 = b.f20407a;
        long j6 = j3;
        long j7 = j5;
        long j8 = 86400000 + currentTimeMillis;
        long j9 = j4;
        boolean z3 = z2;
        b.mo28275a(j8, location.getLatitude(), location.getLongitude());
        long j10 = b.f20408b;
        if (j9 == -1 || j7 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis > j7) {
                j2 = 0 + j10;
            } else if (currentTimeMillis > j9) {
                j2 = 0 + j7;
            } else {
                j2 = 0 + j9;
            }
            j = j2 + 60000;
        }
        aVar.f20731a = z3;
        aVar.f20732b = j6;
        aVar.f20733c = j9;
        aVar.f20734d = j7;
        aVar.f20735e = j10;
        aVar.f20736f = j;
    }
}
