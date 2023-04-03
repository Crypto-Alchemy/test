package p000;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, mo44877d2 = {"Lce6;", "", "Landroid/database/Cursor;", "cursor", "Landroid/net/Uri;", "a", "Landroid/app/ActivityManager;", "activityManager", "", "b", "<init>", "()V", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ce6 */
/* compiled from: SupportSQLiteCompat.kt */
public final class ce6 {

    /* renamed from: a */
    public static final ce6 f8420a = new ce6();

    /* renamed from: a */
    public static final Uri m11844a(Cursor cursor) {
        vx2.m53591g(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        vx2.m53590f(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    /* renamed from: b */
    public static final boolean m11845b(ActivityManager activityManager) {
        vx2.m53591g(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
