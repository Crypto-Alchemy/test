package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.ArrayList;
import java.util.List;

public class DefaultBadger implements C5719cx {
    /* renamed from: a */
    public List<String> mo39106a() {
        return new ArrayList(0);
    }

    /* renamed from: b */
    public void mo39107b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        if (g40.m44510a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new ShortcutBadgeException("unable to resolve intent: " + intent.toString());
    }

    /* renamed from: c */
    public boolean mo39108c(Context context) {
        return g40.m44510a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"));
    }
}
