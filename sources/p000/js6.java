package p000;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.C4803a;
import java.io.IOException;

/* renamed from: js6 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class js6 implements Runnable {

    /* renamed from: r */
    public static final Object f30573r = new Object();

    /* renamed from: s */
    public static Boolean f30574s;

    /* renamed from: x */
    public static Boolean f30575x;

    /* renamed from: a */
    public final Context f30576a;

    /* renamed from: d */
    public final zu3 f30577d;

    /* renamed from: e */
    public final PowerManager.WakeLock f30578e;

    /* renamed from: g */
    public final is6 f30579g;

    /* renamed from: k */
    public final long f30580k;

    /* renamed from: js6$a */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public class C6120a extends BroadcastReceiver {

        /* renamed from: a */
        public js6 f30581a;

        public C6120a(js6 js6) {
            this.f30581a = js6;
        }

        /* renamed from: a */
        public void mo44570a() {
            boolean unused = js6.m46724j();
            js6.this.f30576a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            js6 js6 = this.f30581a;
            if (js6 != null) {
                if (js6.mo44568i()) {
                    boolean b = js6.m46724j();
                    this.f30581a.f30579g.mo43911k(this.f30581a, 0);
                    context.unregisterReceiver(this);
                    this.f30581a = null;
                }
            }
        }
    }

    public js6(is6 is6, Context context, zu3 zu3, long j) {
        this.f30579g = is6;
        this.f30576a = context;
        this.f30580k = j;
        this.f30577d = zu3;
        this.f30578e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    public static String m46720e(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    /* renamed from: f */
    public static boolean m46721f(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f30573r) {
            Boolean bool = f30575x;
            if (bool == null) {
                z = m46722g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f30575x = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    public static boolean m46722g(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        m46720e(str);
        return false;
    }

    /* renamed from: h */
    public static boolean m46723h(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f30573r) {
            Boolean bool = f30574s;
            if (bool == null) {
                z = m46722g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f30574s = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: j */
    public static boolean m46724j() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final synchronized boolean mo44568i() {
        NetworkInfo networkInfo;
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f30576a.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        if (m46723h(this.f30576a)) {
            this.f30578e.acquire(C4803a.f25448a);
        }
        try {
            this.f30579g.mo43912l(true);
            if (!this.f30577d.mo49981g()) {
                this.f30579g.mo43912l(false);
                if (m46723h(this.f30576a)) {
                    try {
                        this.f30578e.release();
                    } catch (RuntimeException unused) {
                    }
                }
            } else if (!m46721f(this.f30576a) || mo44568i()) {
                if (this.f30579g.mo43915o()) {
                    this.f30579g.mo43912l(false);
                } else {
                    this.f30579g.mo43916p(this.f30580k);
                }
                if (m46723h(this.f30576a)) {
                    try {
                        this.f30578e.release();
                    } catch (RuntimeException unused2) {
                    }
                }
            } else {
                new C6120a(this).mo44570a();
                if (m46723h(this.f30576a)) {
                    try {
                        this.f30578e.release();
                    } catch (RuntimeException unused3) {
                    }
                }
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Failed to sync topics. Won't retry sync. ".concat(valueOf);
            }
            this.f30579g.mo43912l(false);
            if (m46723h(this.f30576a)) {
                try {
                    this.f30578e.release();
                } catch (RuntimeException unused4) {
                }
            }
        } catch (Throwable th) {
            if (m46723h(this.f30576a)) {
                try {
                    this.f30578e.release();
                } catch (RuntimeException unused5) {
                }
            }
            throw th;
        }
    }
}
