package p000;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: qg3 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface qg3 {
    /* renamed from: b */
    void mo30607b(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: d */
    <T extends LifecycleCallback> T mo30608d(String str, Class<T> cls);

    /* renamed from: g */
    Activity mo30610g();

    void startActivityForResult(Intent intent, int i);
}
