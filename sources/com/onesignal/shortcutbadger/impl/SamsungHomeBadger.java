package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

public class SamsungHomeBadger implements C5719cx {

    /* renamed from: b */
    public static final String[] f26532b = {"_id", "class"};

    /* renamed from: a */
    public DefaultBadger f26533a = new DefaultBadger();

    /* renamed from: a */
    public List<String> mo39106a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    /* renamed from: b */
    public void mo39107b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        DefaultBadger defaultBadger = this.f26533a;
        if (defaultBadger == null || !defaultBadger.mo39108c(context)) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, f26532b, "package=?", new String[]{componentName.getPackageName()}, (String) null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z = false;
                    while (cursor.moveToNext()) {
                        contentResolver.update(parse, mo39110c(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        contentResolver.insert(parse, mo39110c(componentName, i, true));
                    }
                }
            } finally {
                gh0.m44724a(cursor);
            }
        } else {
            this.f26533a.mo39107b(context, componentName, i);
        }
    }

    /* renamed from: c */
    public final ContentValues mo39110c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }
}
