package p000;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import p000.m44;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0004J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0004J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0004J\b\u0010\u0010\u001a\u00020\bH\u0004R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lbz;", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavController;", "h", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onViewCreated", "Lj44;", "directions", "j", "", "animateNavigation", "k", "i", "a", "Landroidx/navigation/NavController;", "navigationController", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bz */
/* compiled from: BaseNavigationFragment.kt */
public abstract class C6912bz extends Fragment {

    /* renamed from: a */
    public NavController f37022a;

    /* renamed from: h */
    public final NavController mo50751h() {
        return this.f37022a;
    }

    /* renamed from: i */
    public final void mo50752i() {
        a77.m55427e(requireActivity());
        NavController navController = this.f37022a;
        if (navController != null) {
            navController.mo8464U();
        }
        if (this.f37022a != null) {
            return;
        }
        if (requireActivity().getSupportFragmentManager().mo6000r0() == 0) {
            requireActivity().onBackPressed();
        } else {
            requireActivity().getSupportFragmentManager().mo5968e1();
        }
    }

    /* renamed from: j */
    public final void mo50753j(j44 j44) {
        vx2.m53591g(j44, "directions");
        mo50754k(j44, true);
    }

    /* renamed from: k */
    public final void mo50754k(j44 j44, boolean z) {
        vx2.m53591g(j44, "directions");
        try {
            a77.m55427e(requireActivity());
            if (z) {
                NavController navController = this.f37022a;
                if (navController != null) {
                    navController.mo8461R(j44, new m44.C2804a().mo23035b(R.anim.screen_slide_in).mo23036c(R.anim.screen_fade_out).mo23038e(R.anim.screen_fade_in).mo23039f(R.anim.screen_slide_out).mo23034a());
                    return;
                }
                return;
            }
            NavController navController2 = this.f37022a;
            if (navController2 != null) {
                navController2.mo8460Q(j44);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        Fragment k0 = requireActivity().getSupportFragmentManager().mo5981k0(R.id.nav_host_fragment);
        vx2.m53589e(k0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.f37022a = ((NavHostFragment) k0).mo8616k();
    }
}
