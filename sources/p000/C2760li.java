package p000;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, mo44877d2 = {"Landroid/content/Context;", "context", "Lki;", "a", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: li */
/* compiled from: AndroidFontResolveInterceptor.android.kt */
public final class C2760li {
    /* renamed from: a */
    public static final C2683ki m21456a(Context context) {
        int i;
        vx2.m53591g(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            i = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i = 0;
        }
        return new C2683ki(i);
    }
}
