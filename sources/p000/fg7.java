package p000;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: fg7 */
/* compiled from: WakeLocks */
public class fg7 {

    /* renamed from: a */
    public static final String f11832a = qk3.m25728f("WakeLocks");

    /* renamed from: b */
    public static final WeakHashMap<PowerManager.WakeLock, String> f11833b = new WeakHashMap<>();

    /* renamed from: a */
    public static void m16991a() {
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f11833b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                qk3.m25726c().mo25139h(f11832a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
    }

    /* renamed from: b */
    public static PowerManager.WakeLock m16992b(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f11833b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, str2);
        }
        return newWakeLock;
    }
}
