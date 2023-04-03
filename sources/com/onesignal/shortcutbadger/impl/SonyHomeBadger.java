package com.onesignal.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

public class SonyHomeBadger implements C5719cx {

    /* renamed from: a */
    public final Uri f26534a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b */
    public AsyncQueryHandler f26535b;

    /* renamed from: com.onesignal.shortcutbadger.impl.SonyHomeBadger$a */
    public class C5326a extends AsyncQueryHandler {
        public C5326a(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    /* renamed from: d */
    public static void m41307d(Context context, ComponentName componentName, int i) {
        boolean z;
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
        context.sendBroadcast(intent);
    }

    /* renamed from: h */
    public static boolean m41308h(Context context) {
        if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public List<String> mo39106a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    /* renamed from: b */
    public void mo39107b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (m41308h(context)) {
            mo39112e(context, componentName, i);
        } else {
            m41307d(context, componentName, i);
        }
    }

    /* renamed from: c */
    public final ContentValues mo39111c(int i, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    /* renamed from: e */
    public final void mo39112e(Context context, ComponentName componentName, int i) {
        if (i >= 0) {
            ContentValues c = mo39111c(i, componentName);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f26535b == null) {
                    this.f26535b = new C5326a(context.getApplicationContext().getContentResolver());
                }
                mo39113f(c);
                return;
            }
            mo39114g(context, c);
        }
    }

    /* renamed from: f */
    public final void mo39113f(ContentValues contentValues) {
        this.f26535b.startInsert(0, (Object) null, this.f26534a, contentValues);
    }

    /* renamed from: g */
    public final void mo39114g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f26534a, contentValues);
    }
}
