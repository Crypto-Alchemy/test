package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LiveData;
import java.math.BigDecimal;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.common.LoadingState;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/BestMaxFragment;", "Lkf1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onViewCreated", "onDetach", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Landroid/app/Dialog;", "p", "onStart", "Landroidx/fragment/app/FragmentManager;", "manager", "I", "Ldf1;", "P", "Ldf1;", "binding", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "Q", "Lef3;", "D", "()Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "swapViewModel", "<init>", "()V", "U", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: BestMaxFragment.kt */
public final class BestMaxFragment extends kf1 {

    /* renamed from: U */
    public static final C8278a f41710U = new C8278a((DefaultConstructorMarker) null);

    /* renamed from: P */
    public df1 f41711P;

    /* renamed from: Q */
    public final ef3 f41712Q;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/BestMaxFragment$a;", "", "Lnet/safemoon/androidwallet/dialogs/BestMaxFragment;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.BestMaxFragment$a */
    /* compiled from: BestMaxFragment.kt */
    public static final class C8278a {
        public C8278a() {
        }

        public /* synthetic */ C8278a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BestMaxFragment mo57164a() {
            BestMaxFragment bestMaxFragment = new BestMaxFragment();
            bestMaxFragment.setArguments(new Bundle());
            return bestMaxFragment;
        }
    }

    public BestMaxFragment() {
        super(R.layout.dialog_best_max_fragment);
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new BestMaxFragment$special$$inlined$viewModels$default$1(new BestMaxFragment$swapViewModel$2(this)));
        this.f41712Q = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SwapViewModel.class), new BestMaxFragment$special$$inlined$viewModels$default$2(b), new BestMaxFragment$special$$inlined$viewModels$default$3((pc2) null, b), new BestMaxFragment$special$$inlined$viewModels$default$4(this, b));
    }

    /* renamed from: E */
    public static final void m65937E(BestMaxFragment bestMaxFragment, View view) {
        vx2.m53591g(bestMaxFragment, "this$0");
        bestMaxFragment.mo22266k();
    }

    /* renamed from: F */
    public static final void m65938F(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: G */
    public static final void m65939G(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: H */
    public static final void m65940H(BestMaxFragment bestMaxFragment, View view) {
        vx2.m53591g(bestMaxFragment, "this$0");
        BigDecimal value = bestMaxFragment.mo57162D().mo61611i0().getValue();
        if (value != null) {
            if (bestMaxFragment.mo57162D().mo61561G0().getValue() != null) {
                bestMaxFragment.mo57162D().mo61630w0().postValue(value);
            }
            bestMaxFragment.mo22266k();
        }
    }

    /* renamed from: D */
    public final SwapViewModel mo57162D() {
        return (SwapViewModel) this.f41712Q.getValue();
    }

    /* renamed from: I */
    public final void mo57163I(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, BestMaxFragment.class.getCanonicalName());
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        vx2.m53591g(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        mo57162D().mo61562H();
        mo57162D().mo61610h0().postValue(LoadingState.Normal);
        mo57162D().mo61611i0().postValue(null);
    }

    public void onStart() {
        super.onStart();
        Dialog n = mo22269n();
        if (n != null) {
            Window window = n.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window2 = n.getWindow();
            if (window2 != null) {
                window2.setLayout(-1, -2);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        df1 a = df1.m43476a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41711P = a;
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.shake);
        loadAnimation.setRepeatMode(1);
        loadAnimation.setRepeatCount(-1);
        df1 df1 = this.f41711P;
        df1 df12 = null;
        if (df1 == null) {
            vx2.m53605u("binding");
            df1 = null;
        }
        df1.f28180j.startAnimation(loadAnimation);
        df1 df13 = this.f41711P;
        if (df13 == null) {
            vx2.m53605u("binding");
            df13 = null;
        }
        df13.f28172b.setOnClickListener(new v00(this));
        LiveData<X> a2 = qw6.m25941a(mo57162D().mo61610h0());
        vx2.m53590f(a2, "Transformations.distinctUntilChanged(this)");
        a2.observe(getViewLifecycleOwner(), new w00(new BestMaxFragment$onViewCreated$2(this)));
        LiveData<X> a3 = qw6.m25941a(mo57162D().mo61611i0());
        vx2.m53590f(a3, "Transformations.distinctUntilChanged(this)");
        a3.observe(getViewLifecycleOwner(), new x00(new BestMaxFragment$onViewCreated$3(this)));
        df1 df14 = this.f41711P;
        if (df14 == null) {
            vx2.m53605u("binding");
        } else {
            df12 = df14;
        }
        df12.f28173c.setOnClickListener(new y00(this));
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        Dialog p = super.mo22273p(bundle);
        vx2.m53590f(p, "super.onCreateDialog(savedInstanceState)");
        p.requestWindowFeature(1);
        return p;
    }
}
