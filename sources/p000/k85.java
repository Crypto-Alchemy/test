package p000;

import android.app.Activity;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0006"}, mo44877d2 = {"Landroid/app/Activity;", "", "isEnabled", "Lr37;", "a", "b", "library-recent-hide_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: k85 */
/* compiled from: RecentAppsThumbnailHidingActivity.kt */
public final class k85 {
    /* renamed from: a */
    public static final void m20571a(Activity activity, boolean z) {
        vx2.m53591g(activity, "<this>");
        if (z) {
            activity.getWindow().setFlags(8192, 8192);
        } else {
            activity.getWindow().clearFlags(8192);
        }
    }

    /* renamed from: b */
    public static final boolean m20572b(Activity activity) {
        vx2.m53591g(activity, "<this>");
        if ((activity.getWindow().getAttributes().flags & 8192) != 0) {
            return true;
        }
        return false;
    }
}
