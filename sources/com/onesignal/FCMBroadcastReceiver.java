package com.onesignal;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.onesignal.C5270k;
import com.onesignal.OneSignal;

public class FCMBroadcastReceiver extends WakefulBroadcastReceiver {

    /* renamed from: com.onesignal.FCMBroadcastReceiver$a */
    public class C5094a implements C5270k.C5275e {
        public C5094a() {
        }

        /* renamed from: a */
        public void mo38374a(C5270k.C5276f fVar) {
            if (fVar == null) {
                FCMBroadcastReceiver.this.mo38381j();
            } else if (fVar.mo38941a() || fVar.mo38942b()) {
                FCMBroadcastReceiver.this.mo38380h();
            } else {
                FCMBroadcastReceiver.this.mo38381j();
            }
        }
    }

    /* renamed from: com.onesignal.FCMBroadcastReceiver$b */
    public class C5095b implements C5270k.C5275e {

        /* renamed from: a */
        public final /* synthetic */ C5270k.C5275e f25857a;

        /* renamed from: b */
        public final /* synthetic */ Context f25858b;

        /* renamed from: c */
        public final /* synthetic */ Bundle f25859c;

        public C5095b(C5270k.C5275e eVar, Context context, Bundle bundle) {
            this.f25857a = eVar;
            this.f25858b = context;
            this.f25859c = bundle;
        }

        /* renamed from: a */
        public void mo38374a(C5270k.C5276f fVar) {
            if (fVar == null || !fVar.mo38943c()) {
                FCMBroadcastReceiver.m40032k(this.f25858b, this.f25859c);
                this.f25857a.mo38374a(fVar);
                return;
            }
            this.f25857a.mo38374a(fVar);
        }
    }

    /* renamed from: f */
    public static boolean m40029f(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return false;
        }
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null || "gcm".equals(stringExtra)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static void m40030g(Context context, Intent intent, Bundle bundle, C5270k.C5275e eVar) {
        if (!m40029f(intent)) {
            eVar.mo38374a((C5270k.C5276f) null);
        }
        C5270k.m41001h(context, bundle, new C5095b(eVar, context, bundle));
    }

    /* renamed from: i */
    public static t50 m40031i(Bundle bundle, t50 t50) {
        t50.putString("json_payload", C5270k.m40994a(bundle).toString());
        t50.mo47987d("timestamp", Long.valueOf(OneSignal.m40443w0().mo46064a() / 1000));
        return t50;
    }

    /* renamed from: k */
    public static void m40032k(Context context, Bundle bundle) {
        boolean z;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "startFCMService from: " + context + " and bundle: " + bundle);
        if (!C5270k.m40996c(bundle)) {
            OneSignal.m40376a(log_level, "startFCMService with no remote resources, no need for services");
            C5270k.m41003j(context, m40031i(bundle, v50.m53227a()));
            return;
        }
        if (Integer.parseInt(bundle.getString("pri", "0")) > 9) {
            z = true;
        } else {
            z = false;
        }
        if (z || Build.VERSION.SDK_INT < 26) {
            try {
                m40034m(context, bundle);
            } catch (IllegalStateException unused) {
                m40033l(context, bundle);
            }
        } else {
            m40033l(context, bundle);
        }
    }

    @TargetApi(21)
    /* renamed from: l */
    public static void m40033l(Context context, Bundle bundle) {
        t50 i = m40031i(bundle, v50.m53227a());
        Intent intent = new Intent(context, FCMIntentJobService.class);
        intent.putExtra("Bundle:Parcelable:Extras", (Parcelable) i.mo47988e());
        FCMIntentJobService.m40039j(context, intent);
    }

    /* renamed from: m */
    public static void m40034m(Context context, Bundle bundle) {
        WakefulBroadcastReceiver.m5019c(context, new Intent().replaceExtras((Bundle) m40031i(bundle, new u50()).mo47988e()).setComponent(new ComponentName(context.getPackageName(), FCMIntentService.class.getName())));
    }

    /* renamed from: h */
    public final void mo38380h() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    /* renamed from: j */
    public final void mo38381j() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null && !"google.com/iid".equals(extras.getString("from"))) {
            OneSignal.m40338L0(context);
            m40030g(context, intent, extras, new C5094a());
        }
    }
}
