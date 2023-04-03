package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.g */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class C4813g implements ServiceConnection {

    /* renamed from: a */
    public final Context f25459a;

    /* renamed from: d */
    public final Intent f25460d;

    /* renamed from: e */
    public final ScheduledExecutorService f25461e;

    /* renamed from: g */
    public final Queue<C4814a> f25462g;

    /* renamed from: k */
    public C4811f f25463k;

    /* renamed from: r */
    public boolean f25464r;

    /* renamed from: com.google.firebase.messaging.g$a */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static class C4814a {

        /* renamed from: a */
        public final Intent f25465a;

        /* renamed from: b */
        public final xl6<Void> f25466b = new xl6<>();

        public C4814a(Intent intent) {
            this.f25465a = intent;
        }

        /* renamed from: a */
        public void mo36290a(ScheduledExecutorService scheduledExecutorService) {
            mo36292c().mo48132c(scheduledExecutorService, new am7(scheduledExecutorService.schedule(new zl7(this), 9000, TimeUnit.MILLISECONDS)));
        }

        /* renamed from: b */
        public void mo36291b() {
            this.f25466b.mo49507e(null);
        }

        /* renamed from: c */
        public tl6<Void> mo36292c() {
            return this.f25466b.mo49503a();
        }

        /* renamed from: d */
        public final /* synthetic */ void mo36293d() {
            String action = this.f25465a.getAction();
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
            sb.append("Service took too long to process intent: ");
            sb.append(action);
            sb.append(" App may get closed.");
            mo36291b();
        }
    }

    public C4813g(Context context, String str) {
        this(context, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, new z24("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    public final void mo36284a() {
        while (!this.f25462g.isEmpty()) {
            this.f25462g.poll().mo36291b();
        }
    }

    /* renamed from: b */
    public final synchronized void mo36285b() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        while (!this.f25462g.isEmpty()) {
            boolean isLoggable2 = Log.isLoggable("FirebaseMessaging", 3);
            C4811f fVar = this.f25463k;
            if (fVar == null || !fVar.isBinderAlive()) {
                mo36287d();
                return;
            }
            boolean isLoggable3 = Log.isLoggable("FirebaseMessaging", 3);
            this.f25463k.mo36283b(this.f25462g.poll());
        }
    }

    /* renamed from: c */
    public synchronized tl6<Void> mo36286c(Intent intent) {
        C4814a aVar;
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        aVar = new C4814a(intent);
        aVar.mo36290a(this.f25461e);
        this.f25462g.add(aVar);
        mo36285b();
        return aVar.mo36292c();
    }

    /* renamed from: d */
    public final void mo36287d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z = this.f25464r;
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!z);
        }
        if (!this.f25464r) {
            this.f25464r = true;
            try {
                if (rp0.m51209b().mo47466a(this.f25459a, this.f25460d, this, 65)) {
                    return;
                }
            } catch (SecurityException unused) {
            }
            this.f25464r = false;
            mo36284a();
        }
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
        }
        this.f25464r = false;
        if (!(iBinder instanceof C4811f)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            mo36284a();
            return;
        }
        this.f25463k = (C4811f) iBinder;
        mo36285b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
        }
        mo36285b();
    }

    public C4813g(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f25462g = new ArrayDeque();
        this.f25464r = false;
        Context applicationContext = context.getApplicationContext();
        this.f25459a = applicationContext;
        this.f25460d = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f25461e = scheduledExecutorService;
    }
}
