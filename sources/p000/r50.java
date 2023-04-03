package p000;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000e"}, mo44877d2 = {"Lr50;", "", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/util/Size;", "value", "Lr37;", "a", "Landroid/util/SizeF;", "b", "<init>", "()V", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: r50 */
/* compiled from: Bundle.kt */
public final class r50 {

    /* renamed from: a */
    public static final r50 f17129a = new r50();

    /* renamed from: a */
    public static final void m26063a(Bundle bundle, String str, Size size) {
        vx2.m53591g(bundle, "bundle");
        vx2.m53591g(str, "key");
        bundle.putSize(str, size);
    }

    /* renamed from: b */
    public static final void m26064b(Bundle bundle, String str, SizeF sizeF) {
        vx2.m53591g(bundle, "bundle");
        vx2.m53591g(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
