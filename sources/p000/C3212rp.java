package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: rp */
/* compiled from: ApplicationVersionSignature */
public final class C3212rp {

    /* renamed from: a */
    public static final ConcurrentMap<String, z93> f17324a = new ConcurrentHashMap();

    /* renamed from: a */
    public static PackageInfo m26352a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot resolve info for");
            sb.append(context.getPackageName());
            return null;
        }
    }

    /* renamed from: b */
    public static String m26353b(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    /* renamed from: c */
    public static z93 m26354c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, z93> concurrentMap = f17324a;
        z93 z93 = concurrentMap.get(packageName);
        if (z93 != null) {
            return z93;
        }
        z93 d = m26355d(context);
        z93 putIfAbsent = concurrentMap.putIfAbsent(packageName, d);
        if (putIfAbsent == null) {
            return d;
        }
        return putIfAbsent;
    }

    /* renamed from: d */
    public static z93 m26355d(Context context) {
        return new df4(m26353b(m26352a(context)));
    }
}
