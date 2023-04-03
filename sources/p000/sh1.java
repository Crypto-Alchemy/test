package p000;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import com.google.firebase.messaging.C4806c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.f94;
import p000.ql0;

/* renamed from: sh1 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class sh1 {

    /* renamed from: a */
    public final Executor f33891a;

    /* renamed from: b */
    public final Context f33892b;

    /* renamed from: c */
    public final C4806c f33893c;

    public sh1(Context context, C4806c cVar, Executor executor) {
        this.f33891a = executor;
        this.f33892b = context;
        this.f33893c = cVar;
    }

    /* renamed from: a */
    public boolean mo47788a() {
        if (this.f33893c.mo36252a("gcm.n.noui")) {
            return true;
        }
        if (mo47789b()) {
            return false;
        }
        qq2 d = mo47791d();
        ql0.C6415a d2 = ql0.m50620d(this.f33892b, this.f33893c);
        mo47792e(d2.f33152a, d);
        mo47790c(d2);
        return true;
    }

    /* renamed from: b */
    public final boolean mo47789b() {
        if (((KeyguardManager) this.f33892b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!xp4.m54481f()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f33892b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo47790c(ql0.C6415a aVar) {
        ((NotificationManager) this.f33892b.getSystemService("notification")).notify(aVar.f33153b, aVar.f33154c, aVar.f33152a.mo19790b());
    }

    /* renamed from: d */
    public final qq2 mo47791d() {
        qq2 c = qq2.m50820c(this.f33893c.mo36266p("gcm.n.image"));
        if (c != null) {
            c.mo47245e(this.f33891a);
        }
        return c;
    }

    /* renamed from: e */
    public final void mo47792e(f94.C2277e eVar, qq2 qq2) {
        if (qq2 != null) {
            try {
                Bitmap bitmap = (Bitmap) jm6.m46616b(qq2.mo47244d(), 5, TimeUnit.SECONDS);
                eVar.mo19807t(bitmap);
                eVar.mo19784C(new f94.C2271b().mo19778i(bitmap).mo19777h((Bitmap) null));
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getCause());
                StringBuilder sb = new StringBuilder(valueOf.length() + 26);
                sb.append("Failed to download image: ");
                sb.append(valueOf);
            } catch (InterruptedException unused) {
                qq2.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                qq2.close();
            }
        }
    }
}
