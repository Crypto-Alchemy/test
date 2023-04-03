package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Landroid/content/Context;", "it", "invoke"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: ActivityNavigator.kt */
public final class ActivityNavigator$hostActivity$1 extends Lambda implements rc2<Context, Context> {
    public static final ActivityNavigator$hostActivity$1 INSTANCE = new ActivityNavigator$hostActivity$1();

    public ActivityNavigator$hostActivity$1() {
        super(1);
    }

    public final Context invoke(Context context) {
        vx2.m53591g(context, "it");
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
