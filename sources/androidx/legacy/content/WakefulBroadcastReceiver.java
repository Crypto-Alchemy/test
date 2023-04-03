package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

@Deprecated
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final SparseArray<PowerManager.WakeLock> f3892a = new SparseArray<>();

    /* renamed from: d */
    public static int f3893d = 1;

    /* renamed from: b */
    public static boolean m5018b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f3892a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No active wake lock id #");
            sb.append(intExtra);
            return true;
        }
    }

    /* renamed from: c */
    public static ComponentName m5019c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f3892a;
        synchronized (sparseArray) {
            int i = f3893d;
            int i2 = i + 1;
            f3893d = i2;
            if (i2 <= 0) {
                f3893d = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            sparseArray.put(i, newWakeLock);
            return startService;
        }
    }
}
