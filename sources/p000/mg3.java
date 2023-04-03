package p000;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* renamed from: mg3 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class mg3 {

    /* renamed from: a */
    public final Object f31694a;

    public mg3(Activity activity) {
        cu4.m43222l(activity, "Activity must not be null");
        this.f31694a = activity;
    }

    /* renamed from: a */
    public final Activity mo45784a() {
        return (Activity) this.f31694a;
    }

    /* renamed from: b */
    public final FragmentActivity mo45785b() {
        return (FragmentActivity) this.f31694a;
    }

    /* renamed from: c */
    public final boolean mo45786c() {
        return this.f31694a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean mo45787d() {
        return this.f31694a instanceof FragmentActivity;
    }
}
