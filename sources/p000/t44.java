package p000;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import net.sqlcipher.database.SQLiteDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lt44;", "", "Landroid/content/Context;", "context", "Lr37;", "a", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: t44 */
/* compiled from: NavigateToAndroidSettingsForNotifications.kt */
public final class t44 {

    /* renamed from: a */
    public static final t44 f34111a = new t44();

    /* renamed from: a */
    public final void mo47979a(Context context) {
        vx2.m53591g(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.putExtra("app_package", context.getPackageName());
        intent.putExtra("app_uid", context.getApplicationInfo().uid);
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }
}
