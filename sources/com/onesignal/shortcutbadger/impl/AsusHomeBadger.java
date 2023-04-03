package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

public class AsusHomeBadger implements C5719cx {
    /* renamed from: a */
    public List<String> mo39106a() {
        return Arrays.asList(new String[]{"com.asus.launcher"});
    }

    /* renamed from: b */
    public void mo39107b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (g40.m44510a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new ShortcutBadgeException("unable to resolve intent: " + intent.toString());
    }
}
