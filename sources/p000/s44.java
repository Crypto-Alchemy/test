package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Ls44;", "", "Landroid/content/Context;", "context", "Lr37;", "a", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: s44 */
/* compiled from: NavigateToAndroidSettingsForLocation.kt */
public final class s44 {

    /* renamed from: a */
    public static final s44 f33711a = new s44();

    /* renamed from: a */
    public final void mo47628a(Context context) {
        vx2.m53591g(context, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }
}
