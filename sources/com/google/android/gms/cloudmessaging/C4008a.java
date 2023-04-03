package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zza;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.cloudmessaging.a */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public class C4008a {

    /* renamed from: h */
    public static int f22137h;

    /* renamed from: i */
    public static PendingIntent f22138i;

    /* renamed from: j */
    public static final Executor f22139j = tk9.f34299a;

    /* renamed from: a */
    public final y16<String, xl6<Bundle>> f22140a = new y16<>();

    /* renamed from: b */
    public final Context f22141b;

    /* renamed from: c */
    public final di9 f22142c;

    /* renamed from: d */
    public final ScheduledExecutorService f22143d;

    /* renamed from: e */
    public Messenger f22144e;

    /* renamed from: f */
    public Messenger f22145f;

    /* renamed from: g */
    public zza f22146g;

    public C4008a(Context context) {
        this.f22141b = context;
        this.f22142c = new di9(context);
        this.f22144e = new Messenger(new lk9(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f22143d = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    public static final /* synthetic */ tl6 m33555b(Bundle bundle) throws Exception {
        if (m33561l(bundle)) {
            return jm6.m46619e(null);
        }
        return jm6.m46619e(bundle);
    }

    /* renamed from: d */
    public static final /* synthetic */ Bundle m33556d(tl6 tl6) throws Exception {
        if (tl6.mo48145p()) {
            return (Bundle) tl6.mo48141l();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(tl6.mo48140k());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", tl6.mo48140k());
    }

    /* renamed from: e */
    public static synchronized String m33557e() {
        String num;
        synchronized (C4008a.class) {
            int i = f22137h;
            f22137h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: g */
    public static synchronized void m33559g(Context context, Intent intent) {
        synchronized (C4008a.class) {
            if (f22138i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f22138i = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f22138i);
        }
    }

    /* renamed from: l */
    public static boolean m33561l(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public tl6<Bundle> mo30442a(Bundle bundle) {
        boolean z = true;
        if (this.f22142c.mo41930c() >= 12000000) {
            return pl8.m49990e(this.f22141b).mo46778f(1, bundle).mo48138i(f22139j, xi9.f35640a);
        }
        if (this.f22142c.mo41928a() == 0) {
            z = false;
        }
        if (!z) {
            return jm6.m46618d(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return mo30447m(bundle).mo48139j(f22139j, new nj9(this, bundle));
    }

    /* renamed from: c */
    public final /* synthetic */ tl6 mo30443c(Bundle bundle, tl6 tl6) throws Exception {
        if (tl6.mo48145p() && m33561l((Bundle) tl6.mo48141l())) {
            return mo30447m(bundle).mo48147r(f22139j, vj9.f34964a);
        }
        return tl6;
    }

    /* renamed from: h */
    public final void mo30444h(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zza.C4009a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zza) {
                        this.f22146g = (zza) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f22145f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3) && stringExtra2.length() != 0) {
                            "Received InstanceID error ".concat(stringExtra2);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length > 2 && "ID".equals(split[1])) {
                                String str = split[2];
                                String str2 = split[3];
                                if (str2.startsWith(":")) {
                                    str2 = str2.substring(1);
                                }
                                mo30445j(str, intent2.putExtra("error", str2).getExtras());
                            } else if (stringExtra2.length() != 0) {
                                "Unexpected structured response ".concat(stringExtra2);
                            }
                        } else {
                            synchronized (this.f22140a) {
                                for (int i = 0; i < this.f22140a.size(); i++) {
                                    mo30445j(this.f22140a.mo27919i(i), intent2.getExtras());
                                }
                            }
                        }
                    } else {
                        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            if (group != null) {
                                Bundle extras = intent2.getExtras();
                                extras.putString("registration_id", group2);
                                mo30445j(group, extras);
                            }
                        } else if (Log.isLoggable("Rpc", 3) && stringExtra.length() != 0) {
                            "Unexpected response string: ".concat(stringExtra);
                        }
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    if (valueOf2.length() != 0) {
                        "Unexpected response action: ".concat(valueOf2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30445j(java.lang.String r3, android.os.Bundle r4) {
        /*
            r2 = this;
            y16<java.lang.String, xl6<android.os.Bundle>> r0 = r2.f22140a
            monitor-enter(r0)
            y16<java.lang.String, xl6<android.os.Bundle>> r1 = r2.f22140a     // Catch:{ all -> 0x0023 }
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x0023 }
            xl6 r1 = (p000.xl6) r1     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x001e
            java.lang.String r4 = "Missing callback for "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0023 }
            int r1 = r3.length()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001c
            r4.concat(r3)     // Catch:{ all -> 0x0023 }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x001e:
            r1.mo49505c(r4)     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.C4008a.mo30445j(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: k */
    public final /* synthetic */ void mo30446k(String str, ScheduledFuture scheduledFuture, tl6 tl6) {
        synchronized (this.f22140a) {
            this.f22140a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* renamed from: m */
    public final tl6<Bundle> mo30447m(Bundle bundle) {
        String e = m33557e();
        xl6 xl6 = new xl6();
        synchronized (this.f22140a) {
            this.f22140a.put(e, xl6);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f22142c.mo41928a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m33559g(this.f22141b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 5);
        sb.append("|ID|");
        sb.append(e);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
        }
        intent.putExtra("google.messenger", this.f22144e);
        if (!(this.f22145f == null && this.f22146g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f22145f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f22146g.mo30449b(obtain);
                }
            } catch (RemoteException unused) {
            }
            xl6.mo49503a().mo48132c(f22139j, new dk9(this, e, this.f22143d.schedule(new fj9(xl6), 30, TimeUnit.SECONDS)));
            return xl6.mo49503a();
        }
        if (this.f22142c.mo41928a() == 2) {
            this.f22141b.sendBroadcast(intent);
        } else {
            this.f22141b.startService(intent);
        }
        xl6.mo49503a().mo48132c(f22139j, new dk9(this, e, this.f22143d.schedule(new fj9(xl6), 30, TimeUnit.SECONDS)));
        return xl6.mo49503a();
    }
}
