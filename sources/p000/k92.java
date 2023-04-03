package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: k92 */
/* compiled from: FragmentContainer */
public abstract class k92 {
    @Deprecated
    /* renamed from: b */
    public Fragment mo22232b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: c */
    public abstract View mo5861c(int i);

    /* renamed from: d */
    public abstract boolean mo5862d();
}
