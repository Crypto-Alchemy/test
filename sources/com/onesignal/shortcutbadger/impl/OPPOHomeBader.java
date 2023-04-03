package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Collections;
import java.util.List;

public class OPPOHomeBader implements C5719cx {

    /* renamed from: a */
    public int f26531a = -1;

    /* renamed from: a */
    public List<String> mo39106a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    /* renamed from: b */
    public void mo39107b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (this.f26531a != i) {
            this.f26531a = i;
            mo39109c(context, i);
        }
    }

    @TargetApi(11)
    /* renamed from: c */
    public final void mo39109c(Context context, int i) throws ShortcutBadgeException {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable unused) {
            throw new ShortcutBadgeException("Unable to execute Badge By Content Provider");
        }
    }
}
