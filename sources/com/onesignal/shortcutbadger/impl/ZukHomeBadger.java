package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Collections;
import java.util.List;

public class ZukHomeBadger implements C5719cx {

    /* renamed from: a */
    public final Uri f26538a = Uri.parse("content://com.android.badge/badge");

    /* renamed from: a */
    public List<String> mo39106a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @TargetApi(11)
    /* renamed from: b */
    public void mo39107b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f26538a, "setAppBadgeCount", (String) null, bundle);
    }
}
