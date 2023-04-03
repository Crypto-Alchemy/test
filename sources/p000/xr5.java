package p000;

import androidx.compose.p004ui.window.SecureFlagPolicy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, mo44877d2 = {"Landroidx/compose/ui/window/SecureFlagPolicy;", "", "isSecureFlagSetOnParent", "a", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: xr5 */
/* compiled from: SecureFlagPolicy.android.kt */
public final class xr5 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: xr5$a */
    /* compiled from: SecureFlagPolicy.android.kt */
    public /* synthetic */ class C3637a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19964a;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            f19964a = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m30293a(SecureFlagPolicy secureFlagPolicy, boolean z) {
        vx2.m53591g(secureFlagPolicy, "<this>");
        int i = C3637a.f19964a[secureFlagPolicy.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        throw new NoWhenBranchMatchedException();
    }
}
