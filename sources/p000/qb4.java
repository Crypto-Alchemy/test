package p000;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.oo2;

/* renamed from: qb4 */
/* compiled from: NotificationManagerCompat */
public final class qb4 {

    /* renamed from: c */
    public static final Object f16895c = new Object();

    /* renamed from: d */
    public static String f16896d;

    /* renamed from: e */
    public static Set<String> f16897e = new HashSet();

    /* renamed from: f */
    public static final Object f16898f = new Object();

    /* renamed from: g */
    public static C3135c f16899g;

    /* renamed from: a */
    public final Context f16900a;

    /* renamed from: b */
    public final NotificationManager f16901b;

    /* renamed from: qb4$a */
    /* compiled from: NotificationManagerCompat */
    public static class C3133a implements C3137d {

        /* renamed from: a */
        public final String f16902a;

        /* renamed from: b */
        public final int f16903b;

        /* renamed from: c */
        public final String f16904c;

        /* renamed from: d */
        public final Notification f16905d;

        public C3133a(String str, int i, String str2, Notification notification) {
            this.f16902a = str;
            this.f16903b = i;
            this.f16904c = str2;
            this.f16905d = notification;
        }

        /* renamed from: a */
        public void mo25055a(oo2 oo2) throws RemoteException {
            oo2.mo24034l1(this.f16902a, this.f16903b, this.f16904c, this.f16905d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f16902a + ", id:" + this.f16903b + ", tag:" + this.f16904c + "]";
        }
    }

    /* renamed from: qb4$b */
    /* compiled from: NotificationManagerCompat */
    public static class C3134b {

        /* renamed from: a */
        public final ComponentName f16906a;

        /* renamed from: b */
        public final IBinder f16907b;

        public C3134b(ComponentName componentName, IBinder iBinder) {
            this.f16906a = componentName;
            this.f16907b = iBinder;
        }
    }

    /* renamed from: qb4$c */
    /* compiled from: NotificationManagerCompat */
    public static class C3135c implements Handler.Callback, ServiceConnection {

        /* renamed from: a */
        public final Context f16908a;

        /* renamed from: d */
        public final HandlerThread f16909d;

        /* renamed from: e */
        public final Handler f16910e;

        /* renamed from: g */
        public final Map<ComponentName, C3136a> f16911g = new HashMap();

        /* renamed from: k */
        public Set<String> f16912k = new HashSet();

        /* renamed from: qb4$c$a */
        /* compiled from: NotificationManagerCompat */
        public static class C3136a {

            /* renamed from: a */
            public final ComponentName f16913a;

            /* renamed from: b */
            public boolean f16914b = false;

            /* renamed from: c */
            public oo2 f16915c;

            /* renamed from: d */
            public ArrayDeque<C3137d> f16916d = new ArrayDeque<>();

            /* renamed from: e */
            public int f16917e = 0;

            public C3136a(ComponentName componentName) {
                this.f16913a = componentName;
            }
        }

        public C3135c(Context context) {
            this.f16908a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f16909d = handlerThread;
            handlerThread.start();
            this.f16910e = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        public final boolean mo25057a(C3136a aVar) {
            if (aVar.f16914b) {
                return true;
            }
            boolean bindService = this.f16908a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f16913a), this, 33);
            aVar.f16914b = bindService;
            if (bindService) {
                aVar.f16917e = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to bind to listener ");
                sb.append(aVar.f16913a);
                this.f16908a.unbindService(this);
            }
            return aVar.f16914b;
        }

        /* renamed from: b */
        public final void mo25058b(C3136a aVar) {
            if (aVar.f16914b) {
                this.f16908a.unbindService(this);
                aVar.f16914b = false;
            }
            aVar.f16915c = null;
        }

        /* renamed from: c */
        public final void mo25059c(C3137d dVar) {
            mo25067j();
            for (C3136a next : this.f16911g.values()) {
                next.f16916d.add(dVar);
                mo25063g(next);
            }
        }

        /* renamed from: d */
        public final void mo25060d(ComponentName componentName) {
            C3136a aVar = this.f16911g.get(componentName);
            if (aVar != null) {
                mo25063g(aVar);
            }
        }

        /* renamed from: e */
        public final void mo25061e(ComponentName componentName, IBinder iBinder) {
            C3136a aVar = this.f16911g.get(componentName);
            if (aVar != null) {
                aVar.f16915c = oo2.C2975a.m23928E0(iBinder);
                aVar.f16917e = 0;
                mo25063g(aVar);
            }
        }

        /* renamed from: f */
        public final void mo25062f(ComponentName componentName) {
            C3136a aVar = this.f16911g.get(componentName);
            if (aVar != null) {
                mo25058b(aVar);
            }
        }

        /* renamed from: g */
        public final void mo25063g(C3136a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(aVar.f16913a);
                sb.append(", ");
                sb.append(aVar.f16916d.size());
                sb.append(" queued tasks");
            }
            if (!aVar.f16916d.isEmpty()) {
                if (!mo25057a(aVar) || aVar.f16915c == null) {
                    mo25066i(aVar);
                    return;
                }
                while (true) {
                    C3137d peek = aVar.f16916d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Sending task ");
                            sb2.append(peek);
                        }
                        peek.mo25055a(aVar.f16915c);
                        aVar.f16916d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Remote service has died: ");
                            sb3.append(aVar.f16913a);
                        }
                    } catch (RemoteException unused2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("RemoteException communicating with ");
                        sb4.append(aVar.f16913a);
                    }
                }
                if (!aVar.f16916d.isEmpty()) {
                    mo25066i(aVar);
                }
            }
        }

        /* renamed from: h */
        public void mo25064h(C3137d dVar) {
            this.f16910e.obtainMessage(0, dVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                mo25059c((C3137d) message.obj);
                return true;
            } else if (i == 1) {
                C3134b bVar = (C3134b) message.obj;
                mo25061e(bVar.f16906a, bVar.f16907b);
                return true;
            } else if (i == 2) {
                mo25062f((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                mo25060d((ComponentName) message.obj);
                return true;
            }
        }

        /* renamed from: i */
        public final void mo25066i(C3136a aVar) {
            if (!this.f16910e.hasMessages(3, aVar.f16913a)) {
                int i = aVar.f16917e + 1;
                aVar.f16917e = i;
                if (i > 6) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Giving up on delivering ");
                    sb.append(aVar.f16916d.size());
                    sb.append(" tasks to ");
                    sb.append(aVar.f16913a);
                    sb.append(" after ");
                    sb.append(aVar.f16917e);
                    sb.append(" retries");
                    aVar.f16916d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Scheduling retry for ");
                    sb2.append(i2);
                    sb2.append(" ms");
                }
                this.f16910e.sendMessageDelayed(this.f16910e.obtainMessage(3, aVar.f16913a), (long) i2);
            }
        }

        /* renamed from: j */
        public final void mo25067j() {
            Set<String> e = qb4.m25578e(this.f16908a);
            if (!e.equals(this.f16912k)) {
                this.f16912k = e;
                List<ResolveInfo> queryIntentServices = this.f16908a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (e.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f16911g.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Adding listener record for ");
                            sb2.append(componentName2);
                        }
                        this.f16911g.put(componentName2, new C3136a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C3136a>> it = this.f16911g.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Removing listener record for ");
                            sb3.append(next2.getKey());
                        }
                        mo25058b((C3136a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
            }
            this.f16910e.obtainMessage(1, new C3134b(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
            }
            this.f16910e.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: qb4$d */
    /* compiled from: NotificationManagerCompat */
    public interface C3137d {
        /* renamed from: a */
        void mo25055a(oo2 oo2) throws RemoteException;
    }

    public qb4(Context context) {
        this.f16900a = context;
        this.f16901b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: d */
    public static qb4 m25577d(Context context) {
        return new qb4(context);
    }

    /* renamed from: e */
    public static Set<String> m25578e(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f16895c) {
            if (string != null) {
                if (!string.equals(f16896d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f16897e = hashSet;
                    f16896d = string;
                }
            }
            set = f16897e;
        }
        return set;
    }

    /* renamed from: i */
    public static boolean m25579i(Notification notification) {
        Bundle a = f94.m16673a(notification);
        if (a == null || !a.getBoolean("android.support.useSideChannel")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo25049a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f16901b.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f16900a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f16900a.getApplicationInfo();
        String packageName = this.f16900a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public void mo25050b(int i) {
        mo25051c((String) null, i);
    }

    /* renamed from: c */
    public void mo25051c(String str, int i) {
        this.f16901b.cancel(str, i);
    }

    /* renamed from: f */
    public void mo25052f(int i, Notification notification) {
        mo25053g((String) null, i, notification);
    }

    /* renamed from: g */
    public void mo25053g(String str, int i, Notification notification) {
        if (m25579i(notification)) {
            mo25054h(new C3133a(this.f16900a.getPackageName(), i, str, notification));
            this.f16901b.cancel(str, i);
            return;
        }
        this.f16901b.notify(str, i, notification);
    }

    /* renamed from: h */
    public final void mo25054h(C3137d dVar) {
        synchronized (f16898f) {
            if (f16899g == null) {
                f16899g = new C3135c(this.f16900a.getApplicationContext());
            }
            f16899g.mo25064h(dVar);
        }
    }
}
