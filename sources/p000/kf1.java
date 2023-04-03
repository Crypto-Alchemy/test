package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.C0684j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

/* renamed from: kf1 */
/* compiled from: DialogFragment */
public class kf1 extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: A */
    public boolean f14046A;

    /* renamed from: B */
    public pf4<ug3> f14047B = new C2677d();

    /* renamed from: C */
    public Dialog f14048C;

    /* renamed from: H */
    public boolean f14049H;

    /* renamed from: I */
    public boolean f14050I;

    /* renamed from: L */
    public boolean f14051L;

    /* renamed from: M */
    public boolean f14052M = false;

    /* renamed from: a */
    public Handler f14053a;

    /* renamed from: d */
    public Runnable f14054d = new C2674a();

    /* renamed from: e */
    public DialogInterface.OnCancelListener f14055e = new C2675b();

    /* renamed from: g */
    public DialogInterface.OnDismissListener f14056g = new C2676c();

    /* renamed from: k */
    public int f14057k = 0;

    /* renamed from: r */
    public int f14058r = 0;

    /* renamed from: s */
    public boolean f14059s = true;

    /* renamed from: x */
    public boolean f14060x = true;

    /* renamed from: y */
    public int f14061y = -1;

    /* renamed from: kf1$a */
    /* compiled from: DialogFragment */
    public class C2674a implements Runnable {
        public C2674a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            kf1.this.f14056g.onDismiss(kf1.this.f14048C);
        }
    }

    /* renamed from: kf1$b */
    /* compiled from: DialogFragment */
    public class C2675b implements DialogInterface.OnCancelListener {
        public C2675b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (kf1.this.f14048C != null) {
                kf1 kf1 = kf1.this;
                kf1.onCancel(kf1.f14048C);
            }
        }
    }

    /* renamed from: kf1$c */
    /* compiled from: DialogFragment */
    public class C2676c implements DialogInterface.OnDismissListener {
        public C2676c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (kf1.this.f14048C != null) {
                kf1 kf1 = kf1.this;
                kf1.onDismiss(kf1.f14048C);
            }
        }
    }

    /* renamed from: kf1$d */
    /* compiled from: DialogFragment */
    public class C2677d implements pf4<ug3> {
        public C2677d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void onChanged(ug3 ug3) {
            if (ug3 != null && kf1.this.f14060x) {
                View requireView = kf1.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (kf1.this.f14048C != null) {
                    if (FragmentManager.m4630K0(3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DialogFragment ");
                        sb.append(this);
                        sb.append(" setting the content view on ");
                        sb.append(kf1.this.f14048C);
                    }
                    kf1.this.f14048C.setContentView(requireView);
                }
            }
        }
    }

    /* renamed from: kf1$e */
    /* compiled from: DialogFragment */
    public class C2678e extends k92 {

        /* renamed from: a */
        public final /* synthetic */ k92 f14066a;

        public C2678e(k92 k92) {
            this.f14066a = k92;
        }

        /* renamed from: c */
        public View mo5861c(int i) {
            if (this.f14066a.mo5862d()) {
                return this.f14066a.mo5861c(i);
            }
            return kf1.this.mo22274q(i);
        }

        /* renamed from: d */
        public boolean mo5862d() {
            if (this.f14066a.mo5862d() || kf1.this.mo22275r()) {
                return true;
            }
            return false;
        }
    }

    public kf1() {
    }

    public k92 createFragmentContainer() {
        return new C2678e(super.createFragmentContainer());
    }

    /* renamed from: k */
    public void mo22266k() {
        mo22268m(false, false, false);
    }

    /* renamed from: l */
    public void mo22267l() {
        mo22268m(true, false, false);
    }

    /* renamed from: m */
    public final void mo22268m(boolean z, boolean z2, boolean z3) {
        if (!this.f14050I) {
            this.f14050I = true;
            this.f14051L = false;
            Dialog dialog = this.f14048C;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f14048C.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f14053a.getLooper()) {
                        onDismiss(this.f14048C);
                    } else {
                        this.f14053a.post(this.f14054d);
                    }
                }
            }
            this.f14049H = true;
            if (this.f14061y >= 0) {
                if (z3) {
                    getParentFragmentManager().mo5976i1(this.f14061y, 1);
                } else {
                    getParentFragmentManager().mo5969f1(this.f14061y, 1, z);
                }
                this.f14061y = -1;
                return;
            }
            C0684j q = getParentFragmentManager().mo5996q();
            q.mo6273w(true);
            q.mo6146r(this);
            if (z3) {
                q.mo6141l();
            } else if (z) {
                q.mo6140k();
            } else {
                q.mo6139j();
            }
        }
    }

    /* renamed from: n */
    public Dialog mo22269n() {
        return this.f14048C;
    }

    /* renamed from: o */
    public int mo22270o() {
        return this.f14058r;
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.f14047B);
        if (!this.f14051L) {
            this.f14050I = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.f14053a = new Handler();
        if (this.mContainerId == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f14060x = z;
        if (bundle != null) {
            this.f14057k = bundle.getInt("android:style", 0);
            this.f14058r = bundle.getInt("android:theme", 0);
            this.f14059s = bundle.getBoolean("android:cancelable", true);
            this.f14060x = bundle.getBoolean("android:showsDialog", this.f14060x);
            this.f14061y = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f14048C;
        if (dialog != null) {
            this.f14049H = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f14048C.dismiss();
            if (!this.f14050I) {
                onDismiss(this.f14048C);
            }
            this.f14048C = null;
            this.f14052M = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.f14051L && !this.f14050I) {
            this.f14050I = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.f14047B);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f14049H) {
            if (FragmentManager.m4630K0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
            }
            mo22268m(true, true, false);
        }
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.f14060x || this.f14046A) {
            if (FragmentManager.m4630K0(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.f14060x) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mShowsDialog = false: ");
                    sb.append(str);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mCreatingDialog = true: ");
                    sb2.append(str);
                }
            }
            return onGetLayoutInflater;
        }
        mo22276s(bundle);
        if (FragmentManager.m4630K0(2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("get layout inflater for DialogFragment ");
            sb3.append(this);
            sb3.append(" from dialog context");
        }
        Dialog dialog = this.f14048C;
        if (dialog != null) {
            return onGetLayoutInflater.cloneInContext(dialog.getContext());
        }
        return onGetLayoutInflater;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f14048C;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f14057k;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f14058r;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f14059s;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f14060x;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f14061y;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.f14048C;
        if (dialog != null) {
            this.f14049H = false;
            dialog.show();
            View decorView = this.f14048C.getWindow().getDecorView();
            me7.m22275b(decorView, this);
            oe7.m23782a(decorView, this);
            ViewTreeSavedStateRegistryOwner.m9848b(decorView, this);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.f14048C;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f14048C != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f14048C.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new zm0(requireContext(), mo22270o());
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.f14048C != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f14048C.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: q */
    public View mo22274q(int i) {
        Dialog dialog = this.f14048C;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    /* renamed from: r */
    public boolean mo22275r() {
        return this.f14052M;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: s */
    public final void mo22276s(Bundle bundle) {
        if (this.f14060x && !this.f14052M) {
            try {
                this.f14046A = true;
                Dialog p = mo22273p(bundle);
                this.f14048C = p;
                if (this.f14060x) {
                    mo22280w(p, this.f14057k);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f14048C.setOwnerActivity((Activity) context);
                    }
                    this.f14048C.setCancelable(this.f14059s);
                    this.f14048C.setOnCancelListener(this.f14055e);
                    this.f14048C.setOnDismissListener(this.f14056g);
                    this.f14052M = true;
                } else {
                    this.f14048C = null;
                }
                this.f14046A = false;
            } catch (Throwable th) {
                this.f14046A = false;
                throw th;
            }
        }
    }

    /* renamed from: t */
    public final Dialog mo22277t() {
        Dialog n = mo22269n();
        if (n != null) {
            return n;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: u */
    public void mo22278u(boolean z) {
        this.f14060x = z;
    }

    /* renamed from: v */
    public void mo22279v(int i, int i2) {
        if (FragmentManager.m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
        }
        this.f14057k = i;
        if (i == 2 || i == 3) {
            this.f14058r = 16973913;
        }
        if (i2 != 0) {
            this.f14058r = i2;
        }
    }

    /* renamed from: w */
    public void mo22280w(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: x */
    public void mo22281x(FragmentManager fragmentManager, String str) {
        this.f14050I = false;
        this.f14051L = true;
        C0684j q = fragmentManager.mo5996q();
        q.mo6273w(true);
        q.mo6264e(this, str);
        q.mo6139j();
    }

    public kf1(int i) {
        super(i);
    }
}
