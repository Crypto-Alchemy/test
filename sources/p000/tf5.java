package p000;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* renamed from: tf5 */
/* compiled from: ResourceUnityVersionProvider */
public class tf5 implements y37 {

    /* renamed from: a */
    public final Context f34256a;

    /* renamed from: b */
    public boolean f34257b = false;

    /* renamed from: c */
    public String f34258c;

    public tf5(Context context) {
        this.f34256a = context;
    }

    /* renamed from: a */
    public String mo48103a() {
        if (!this.f34257b) {
            this.f34258c = CommonUtils.m38423z(this.f34256a);
            this.f34257b = true;
        }
        String str = this.f34258c;
        if (str != null) {
            return str;
        }
        return null;
    }
}
