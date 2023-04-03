package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: di9 */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class di9 {

    /* renamed from: a */
    public final Context f28195a;

    /* renamed from: b */
    public int f28196b;

    /* renamed from: c */
    public int f28197c = 0;

    public di9(Context context) {
        this.f28195a = context;
    }

    /* renamed from: a */
    public final synchronized int mo41928a() {
        int i = this.f28197c;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f28195a.getPackageManager();
        if (tn7.m52384a(this.f28195a).mo45808b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!xp4.m54483h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f28197c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (xp4.m54483h()) {
                this.f28197c = 2;
            } else {
                this.f28197c = 1;
            }
            return this.f28197c;
        }
        this.f28197c = 2;
        return 2;
    }

    /* renamed from: b */
    public final PackageInfo mo41929b(String str) {
        try {
            return tn7.m52384a(this.f28195a).mo45811e(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            return null;
        }
    }

    /* renamed from: c */
    public final synchronized int mo41930c() {
        PackageInfo b;
        if (this.f28196b == 0 && (b = mo41929b("com.google.android.gms")) != null) {
            this.f28196b = b.versionCode;
        }
        return this.f28196b;
    }
}
