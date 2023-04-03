package androidx.compose.p004ui.window;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\" \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, mo44877d2 = {"Landroid/view/View;", "", "a", "Lhy4;", "", "Lhy4;", "getLocalPopupTestTag", "()Lhy4;", "LocalPopupTestTag", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt */
/* compiled from: AndroidPopup.android.kt */
public final class AndroidPopup_androidKt {

    /* renamed from: a */
    public static final hy4<String> f2249a = CompositionLocalKt.m2037c((h56) null, AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE, 1, (Object) null);

    /* renamed from: a */
    public static final boolean m3310a(View view) {
        WindowManager.LayoutParams layoutParams;
        vx2.m53591g(view, "<this>");
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }
}
