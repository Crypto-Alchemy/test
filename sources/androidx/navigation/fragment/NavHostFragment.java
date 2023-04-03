package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.C1131a;

public class NavHostFragment extends Fragment {

    /* renamed from: a */
    public k44 f6086a;

    /* renamed from: d */
    public Boolean f6087d = null;

    /* renamed from: e */
    public View f6088e;

    /* renamed from: g */
    public int f6089g;

    /* renamed from: k */
    public boolean f6090k;

    /* renamed from: i */
    public static NavController m8359i(Fragment fragment) {
        Dialog dialog;
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).mo8616k();
            }
            Fragment B0 = fragment2.getParentFragmentManager().mo5916B0();
            if (B0 instanceof NavHostFragment) {
                return ((NavHostFragment) B0).mo8616k();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return Navigation.m8328c(view);
        }
        if (fragment instanceof kf1) {
            dialog = ((kf1) fragment).mo22269n();
        } else {
            dialog = null;
        }
        if (dialog != null && dialog.getWindow() != null) {
            return Navigation.m8328c(dialog.getWindow().getDecorView());
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
    }

    @Deprecated
    /* renamed from: h */
    public Navigator<? extends C1131a.C1132a> mo8614h() {
        return new C1131a(requireContext(), getChildFragmentManager(), mo8615j());
    }

    /* renamed from: j */
    public final int mo8615j() {
        int id = getId();
        if (id == 0 || id == -1) {
            return b35.nav_host_fragment_container;
        }
        return id;
    }

    /* renamed from: k */
    public final NavController mo8616k() {
        k44 k44 = this.f6086a;
        if (k44 != null) {
            return k44;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    /* renamed from: l */
    public void mo8617l(NavController navController) {
        navController.mo8451G().mo11356b(new DialogFragmentNavigator(requireContext(), getChildFragmentManager()));
        navController.mo8451G().mo11356b(mo8614h());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.f6090k) {
            getParentFragmentManager().mo5996q().mo6148v(this).mo6139j();
        }
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        ((DialogFragmentNavigator) this.f6086a.mo8451G().mo11358d(DialogFragmentNavigator.class)).mo8611n(fragment);
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        Bundle bundle2;
        k44 k44 = new k44(requireContext());
        this.f6086a = k44;
        k44.mo8483o0(this);
        this.f6086a.mo8485p0(requireActivity().getOnBackPressedDispatcher());
        k44 k442 = this.f6086a;
        Boolean bool = this.f6087d;
        int i = 0;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        k442.mo8492t(z);
        Bundle bundle3 = null;
        this.f6087d = null;
        this.f6086a.mo8487q0(getViewModelStore());
        mo8617l(this.f6086a);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f6090k = true;
                getParentFragmentManager().mo5996q().mo6148v(this).mo6139j();
            }
            this.f6089g = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.f6086a.mo8475h0(bundle2);
        }
        int i2 = this.f6089g;
        if (i2 != 0) {
            this.f6086a.mo8478k0(i2);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i = arguments.getInt("android-support-nav:fragment:graphId");
            }
            if (arguments != null) {
                bundle3 = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
            }
            if (i != 0) {
                this.f6086a.mo8479l0(i, bundle3);
            }
        }
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(mo8615j());
        return fragmentContainerView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f6088e;
        if (view != null && Navigation.m8328c(view) == this.f6086a) {
            Navigation.m8329f(this.f6088e, (NavController) null);
        }
        this.f6088e = null;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i65.NavHost);
        int resourceId = obtainStyledAttributes.getResourceId(i65.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f6089g = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, j55.NavHostFragment);
        if (obtainStyledAttributes2.getBoolean(j55.NavHostFragment_defaultNavHost, false)) {
            this.f6090k = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
        k44 k44 = this.f6086a;
        if (k44 != null) {
            k44.mo8492t(z);
        } else {
            this.f6087d = Boolean.valueOf(z);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle j0 = this.f6086a.mo8477j0();
        if (j0 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", j0);
        }
        if (this.f6090k) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i = this.f6089g;
        if (i != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            Navigation.m8329f(view, this.f6086a);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.f6088e = view2;
                if (view2.getId() == getId()) {
                    Navigation.m8329f(this.f6088e, this.f6086a);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }
}
