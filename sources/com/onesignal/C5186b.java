package com.onesignal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.OneSignal;
import com.onesignal.shortcutbadger.ShortcutBadgeException;

/* renamed from: com.onesignal.b */
/* compiled from: BadgeCountUpdater */
public class C5186b {

    /* renamed from: a */
    public static int f26161a = -1;

    /* renamed from: a */
    public static boolean m40594a(Context context) {
        int i;
        int i2 = f26161a;
        if (i2 == -1) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    if ("DISABLE".equals(bundle.getString("com.onesignal.BadgeCount"))) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    f26161a = i;
                } else {
                    f26161a = 1;
                }
            } catch (PackageManager.NameNotFoundException e) {
                f26161a = 0;
                OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e);
            }
            if (f26161a == 1) {
                return true;
            }
            return false;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m40595b(Context context) {
        if (!m40594a(context) || !OSUtils.m40274a(context)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static void m40596c(di4 di4, Context context) {
        if (m40595b(context)) {
            m40598e(context);
        }
    }

    /* renamed from: d */
    public static void m40597d(int i, Context context) {
        if (m40594a(context)) {
            try {
                v06.m53172a(context, i);
            } catch (ShortcutBadgeException unused) {
            }
        }
    }

    /* renamed from: e */
    public static void m40598e(Context context) {
        int i = 0;
        for (StatusBarNotification f : ei4.m43978d(context)) {
            if (!C5291m.m41086f(f)) {
                i++;
            }
        }
        m40597d(i, context);
    }
}
