package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.onesignal.NotificationOpenedReceiver;
import com.onesignal.NotificationOpenedReceiverAndroid22AndOlder;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u0004H\u0003R\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lhx2;", "", "", "notificationId", "Landroid/content/Intent;", "b", "requestCode", "oneSignalIntent", "Landroid/app/PendingIntent;", "a", "c", "Ljava/lang/Class;", "Ljava/lang/Class;", "notificationOpenedClassAndroid23Plus", "notificationOpenedClassAndroid22AndOlder", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: hx2 */
/* compiled from: IntentGeneratorForAttachingToNotifications.kt */
public final class hx2 {

    /* renamed from: a */
    public final Class<?> f29750a = NotificationOpenedReceiver.class;

    /* renamed from: b */
    public final Class<?> f29751b = NotificationOpenedReceiverAndroid22AndOlder.class;

    /* renamed from: c */
    public final Context f29752c;

    public hx2(Context context) {
        vx2.m53591g(context, "context");
        this.f29752c = context;
    }

    /* renamed from: a */
    public final PendingIntent mo43413a(int i, Intent intent) {
        vx2.m53591g(intent, "oneSignalIntent");
        return PendingIntent.getActivity(this.f29752c, i, intent, 201326592);
    }

    /* renamed from: b */
    public final Intent mo43414b(int i) {
        Intent addFlags = mo43415c().putExtra("androidNotificationId", i).addFlags(603979776);
        vx2.m53590f(addFlags, "intent\n            .putE…Y_CLEAR_TOP\n            )");
        return addFlags;
    }

    /* renamed from: c */
    public final Intent mo43415c() {
        return new Intent(this.f29752c, this.f29750a);
    }
}
