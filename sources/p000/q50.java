package p000;

import android.os.Bundle;
import android.os.IBinder;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\f"}, mo44877d2 = {"Lq50;", "", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/os/IBinder;", "value", "Lr37;", "a", "<init>", "()V", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: q50 */
/* compiled from: Bundle.kt */
public final class q50 {

    /* renamed from: a */
    public static final q50 f16799a = new q50();

    /* renamed from: a */
    public static final void m25415a(Bundle bundle, String str, IBinder iBinder) {
        vx2.m53591g(bundle, "bundle");
        vx2.m53591g(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
