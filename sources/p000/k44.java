package p000;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.navigation.NavController;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.ENS;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¨\u0006\u0013"}, mo44877d2 = {"Lk44;", "Landroidx/navigation/NavController;", "Lug3;", "owner", "Lr37;", "o0", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "p0", "", "enabled", "t", "Lgd7;", "viewModelStore", "q0", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: k44 */
/* compiled from: NavHostController.kt */
public class k44 extends NavController {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k44(Context context) {
        super(context);
        vx2.m53591g(context, "context");
    }

    /* renamed from: o0 */
    public final void mo8483o0(ug3 ug3) {
        vx2.m53591g(ug3, ENS.FUNC_OWNER);
        super.mo8483o0(ug3);
    }

    /* renamed from: p0 */
    public final void mo8485p0(OnBackPressedDispatcher onBackPressedDispatcher) {
        vx2.m53591g(onBackPressedDispatcher, "dispatcher");
        super.mo8485p0(onBackPressedDispatcher);
    }

    /* renamed from: q0 */
    public final void mo8487q0(gd7 gd7) {
        vx2.m53591g(gd7, "viewModelStore");
        super.mo8487q0(gd7);
    }

    /* renamed from: t */
    public final void mo8492t(boolean z) {
        super.mo8492t(z);
    }
}
