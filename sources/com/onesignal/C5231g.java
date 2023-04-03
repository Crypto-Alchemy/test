package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.pm.PackageManager;

/* renamed from: com.onesignal.g */
/* compiled from: GooglePlayServicesUpgradePrompt */
public class C5231g {

    /* renamed from: com.onesignal.g$a */
    /* compiled from: GooglePlayServicesUpgradePrompt */
    public class C5232a implements Runnable {

        /* renamed from: com.onesignal.g$a$a */
        /* compiled from: GooglePlayServicesUpgradePrompt */
        public class C5233a implements DialogInterface.OnClickListener {
            public C5233a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C5342x0.m41399j(C5342x0.f26571a, "GT_DO_NOT_SHOW_MISSING_GPS", true);
            }
        }

        /* renamed from: com.onesignal.g$a$b */
        /* compiled from: GooglePlayServicesUpgradePrompt */
        public class C5234b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            public final /* synthetic */ Activity f26324a;

            public C5234b(Activity activity) {
                this.f26324a = activity;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C5231g.m40841a(this.f26324a);
            }
        }

        public void run() {
            Activity Q = OneSignal.m40352Q();
            if (Q != null) {
                String k = OSUtils.m40279k(Q, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
                String k2 = OSUtils.m40279k(Q, "onesignal_gms_missing_alert_button_update", "Update");
                String k3 = OSUtils.m40279k(Q, "onesignal_gms_missing_alert_button_skip", "Skip");
                new AlertDialog.Builder(Q).setMessage(k).setPositiveButton(k2, new C5234b(Q)).setNegativeButton(k3, new C5233a()).setNeutralButton(OSUtils.m40279k(Q, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
            }
        }
    }

    /* renamed from: a */
    public static void m40841a(Activity activity) {
        try {
            yh2 p = yh2.m54754p();
            PendingIntent e = p.mo49667e(activity, p.mo49669i(OneSignal.f26030e), 9000);
            if (e != null) {
                e.send();
            }
        } catch (PendingIntent.CanceledException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: c */
    public static boolean m40843c() {
        try {
            PackageManager packageManager = OneSignal.f26030e.getPackageManager();
            return !((String) packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager)).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static void m40844d() {
        if (OSUtils.m40253B() && m40843c() && !OneSignal.m40370X() && !C5342x0.m41391b(C5342x0.f26571a, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
            OSUtils.m40270S(new C5232a());
        }
    }
}
