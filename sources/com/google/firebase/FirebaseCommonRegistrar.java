package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.heartbeatinfo.C4781a;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements en0 {
    /* renamed from: e */
    public static /* synthetic */ String m38388e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* renamed from: f */
    public static /* synthetic */ String m38389f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || Build.VERSION.SDK_INT < 24) {
            return "";
        }
        return String.valueOf(applicationInfo.minSdkVersion);
    }

    /* renamed from: g */
    public static /* synthetic */ String m38390g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "";
        }
        return "embedded";
    }

    /* renamed from: h */
    public static /* synthetic */ String m38391h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return m38392i(installerPackageName);
        }
        return "";
    }

    /* renamed from: i */
    public static String m38392i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<sm0<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(va1.m53314c());
        arrayList.add(C4781a.m38429e());
        arrayList.add(jg3.m46505b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(jg3.m46505b("fire-core", "20.0.0"));
        arrayList.add(jg3.m46505b("device-name", m38392i(Build.PRODUCT)));
        arrayList.add(jg3.m46505b("device-model", m38392i(Build.DEVICE)));
        arrayList.add(jg3.m46505b("device-brand", m38392i(Build.BRAND)));
        arrayList.add(jg3.m46506c("android-target-sdk", new g22()));
        arrayList.add(jg3.m46506c("android-min-sdk", new h22()));
        arrayList.add(jg3.m46506c("android-platform", new i22()));
        arrayList.add(jg3.m46506c("android-installer", new j22()));
        String a = pc3.m49853a();
        if (a != null) {
            arrayList.add(jg3.m46505b("kotlin", a));
        }
        return arrayList;
    }
}
