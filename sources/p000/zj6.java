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
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: zj6 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class zj6 implements Runnable {

    /* renamed from: a */
    public final long f36171a;

    /* renamed from: d */
    public final PowerManager.WakeLock f36172d;

    /* renamed from: e */
    public final FirebaseMessaging f36173e;

    /* renamed from: g */
    public ExecutorService f36174g = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new z24("firebase-iid-executor"));

    /* renamed from: zj6$a */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static class C6771a extends BroadcastReceiver {

        /* renamed from: a */
        public zj6 f36175a;

        public C6771a(zj6 zj6) {
            this.f36175a = zj6;
        }

        /* renamed from: a */
        public void mo49865a() {
            zj6.m55135c();
            this.f36175a.mo49861b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            zj6 zj6 = this.f36175a;
            if (zj6 != null && zj6.mo49862d()) {
                zj6.m55135c();
                this.f36175a.f36173e.mo36211e(this.f36175a, 0);
                this.f36175a.mo49861b().unregisterReceiver(this);
                this.f36175a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public zj6(FirebaseMessaging firebaseMessaging, long j) {
        this.f36173e = firebaseMessaging;
        this.f36171a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo49861b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f36172d = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    public static boolean m55135c() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Context mo49861b() {
        return this.f36173e.mo36212f();
    }

    /* renamed from: d */
    public boolean mo49862d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) mo49861b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo49863e() throws IOException {
        try {
            if (this.f36173e.mo36209c() == null) {
                return false;
            }
            return true;
        } catch (IOException e) {
            if (oh2.m49308g(e.getMessage())) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (nx5.m49067b().mo46248e(mo49861b())) {
            this.f36172d.acquire();
        }
        try {
            this.f36173e.mo36227w(true);
            if (!this.f36173e.mo36218n()) {
                this.f36173e.mo36227w(false);
                if (!nx5.m49067b().mo46248e(mo49861b())) {
                    return;
                }
            } else if (!nx5.m49067b().mo46247d(mo49861b()) || mo49862d()) {
                if (mo49863e()) {
                    this.f36173e.mo36227w(false);
                } else {
                    this.f36173e.mo36230z(this.f36171a);
                }
                if (!nx5.m49067b().mo46248e(mo49861b())) {
                    return;
                }
            } else {
                new C6771a(this).mo49865a();
                if (!nx5.m49067b().mo46248e(mo49861b())) {
                    return;
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            this.f36173e.mo36227w(false);
            if (!nx5.m49067b().mo46248e(mo49861b())) {
                return;
            }
        } catch (Throwable th) {
            if (nx5.m49067b().mo46248e(mo49861b())) {
                this.f36172d.release();
            }
            throw th;
        }
        this.f36172d.release();
    }
}
