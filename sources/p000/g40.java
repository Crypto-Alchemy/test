package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: g40 */
/* compiled from: BroadcastHelper */
public class g40 {
    /* renamed from: a */
    public static boolean m44510a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }
}
