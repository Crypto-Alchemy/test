package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

public class VivoHomeBadger implements C5719cx {
    /* renamed from: a */
    public List<String> mo39106a() {
        return Arrays.asList(new String[]{"com.vivo.launcher"});
    }

    /* renamed from: b */
    public void mo39107b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i);
        context.sendBroadcast(intent);
    }
}
