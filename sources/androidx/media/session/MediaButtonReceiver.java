package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.support.p002v4.media.MediaBrowserCompat;
import android.support.p002v4.media.session.MediaControllerCompat;
import android.view.KeyEvent;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    public static class C0771a extends MediaBrowserCompat.C0046c {

        /* renamed from: c */
        public final Context f4107c;

        /* renamed from: d */
        public final Intent f4108d;

        /* renamed from: e */
        public final BroadcastReceiver.PendingResult f4109e;

        /* renamed from: f */
        public MediaBrowserCompat f4110f;

        public C0771a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f4107c = context;
            this.f4108d = intent;
            this.f4109e = pendingResult;
        }

        /* renamed from: a */
        public void mo645a() {
            new MediaControllerCompat(this.f4107c, this.f4110f.mo634c()).mo707a((KeyEvent) this.f4108d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            mo6516e();
        }

        /* renamed from: b */
        public void mo646b() {
            mo6516e();
        }

        /* renamed from: c */
        public void mo647c() {
            mo6516e();
        }

        /* renamed from: e */
        public final void mo6516e() {
            this.f4110f.mo633b();
            this.f4109e.finish();
        }

        /* renamed from: f */
        public void mo6517f(MediaBrowserCompat mediaBrowserCompat) {
            this.f4110f = mediaBrowserCompat;
        }
    }

    /* renamed from: a */
    public static ComponentName m5240a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignore unsupported intent: ");
            sb.append(intent);
            return;
        }
        ComponentName a = m5240a(context, "android.intent.action.MEDIA_BUTTON");
        if (a != null) {
            intent.setComponent(a);
            zr0.m31449l(context, intent);
            return;
        }
        ComponentName a2 = m5240a(context, "android.media.browse.MediaBrowserService");
        if (a2 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C0771a aVar = new C0771a(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a2, aVar, (Bundle) null);
            aVar.mo6517f(mediaBrowserCompat);
            mediaBrowserCompat.mo632a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}
