package p000;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lze2;", "", "Landroid/content/Intent;", "b", "a", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "c", "Z", "startApp", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: ze2 */
/* compiled from: GenerateNotificationOpenIntent.kt */
public final class ze2 {

    /* renamed from: a */
    public final Context f36133a;

    /* renamed from: b */
    public final Intent f36134b;

    /* renamed from: c */
    public final boolean f36135c;

    public ze2(Context context, Intent intent, boolean z) {
        vx2.m53591g(context, "context");
        this.f36133a = context;
        this.f36134b = intent;
        this.f36135c = z;
    }

    /* renamed from: a */
    public final Intent mo49829a() {
        Intent launchIntentForPackage;
        if (!this.f36135c || (launchIntentForPackage = this.f36133a.getPackageManager().getLaunchIntentForPackage(this.f36133a.getPackageName())) == null) {
            return null;
        }
        vx2.m53590f(launchIntentForPackage, "context.packageManager.g…           ?: return null");
        launchIntentForPackage.setPackage((String) null);
        launchIntentForPackage.setFlags(270532608);
        return launchIntentForPackage;
    }

    /* renamed from: b */
    public final Intent mo49830b() {
        Intent intent = this.f36134b;
        if (intent != null) {
            return intent;
        }
        return mo49829a();
    }
}
