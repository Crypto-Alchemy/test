package p000;

import android.content.ContentResolver;
import android.provider.Settings;

/* renamed from: gl */
/* compiled from: AnimatorDurationScaleProvider */
public class C5865gl {
    /* renamed from: a */
    public float mo42905a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
