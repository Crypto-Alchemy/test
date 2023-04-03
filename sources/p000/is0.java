package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: is0 */
/* compiled from: ContextUtils */
public class is0 {
    /* renamed from: a */
    public static Activity m45933a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
