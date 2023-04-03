package com.onesignal.shortcutbadger.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

public class HuaweiHomeBadger implements C5719cx {
    /* renamed from: a */
    public List<String> mo39106a() {
        return Arrays.asList(new String[]{"com.huawei.android.launcher"});
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public void mo39107b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", componentName.getClassName());
        bundle.putInt("badgenumber", i);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
    }
}
