package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.common.Gas;
import net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b%\u0010&J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#¨\u0006)"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/SwapTransactionSpeed;", "Lkf1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Landroid/app/Dialog;", "p", "onStart", "Landroidx/fragment/app/FragmentManager;", "manager", "I", "Lnet/safemoon/androidwallet/model/common/Gas;", "gas", "H", "Lzf1;", "P", "Lzf1;", "binding", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "Q", "Lef3;", "E", "()Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "swapViewModel", "Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel;", "U", "D", "()Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel;", "swapMigrationViewModel", "<init>", "()V", "X", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SwapTransactionSpeed.kt */
public final class SwapTransactionSpeed extends kf1 {

    /* renamed from: X */
    public static final C8314a f41799X = new C8314a((DefaultConstructorMarker) null);

    /* renamed from: P */
    public zf1 f41800P;

    /* renamed from: Q */
    public final ef3 f41801Q;

    /* renamed from: U */
    public final ef3 f41802U;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/SwapTransactionSpeed$a;", "", "Lnet/safemoon/androidwallet/dialogs/SwapTransactionSpeed;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.SwapTransactionSpeed$a */
    /* compiled from: SwapTransactionSpeed.kt */
    public static final class C8314a {
        public C8314a() {
        }

        public /* synthetic */ C8314a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SwapTransactionSpeed mo57313a() {
            SwapTransactionSpeed swapTransactionSpeed = new SwapTransactionSpeed();
            swapTransactionSpeed.setArguments(new Bundle());
            return swapTransactionSpeed;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/SwapTransactionSpeed$b", "Lpf4;", "Lnet/safemoon/androidwallet/model/common/Gas;", "t", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.SwapTransactionSpeed$b */
    /* compiled from: SwapTransactionSpeed.kt */
    public static final class C8315b implements pf4<Gas> {

        /* renamed from: a */
        public final /* synthetic */ SwapTransactionSpeed f41803a;

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: net.safemoon.androidwallet.dialogs.SwapTransactionSpeed$b$a */
        /* compiled from: SwapTransactionSpeed.kt */
        public /* synthetic */ class C8316a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f41804a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    net.safemoon.androidwallet.model.common.Gas[] r0 = net.safemoon.androidwallet.model.common.Gas.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    net.safemoon.androidwallet.model.common.Gas r1 = net.safemoon.androidwallet.model.common.Gas.Standard     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    net.safemoon.androidwallet.model.common.Gas r1 = net.safemoon.androidwallet.model.common.Gas.Fast     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    net.safemoon.androidwallet.model.common.Gas r1 = net.safemoon.androidwallet.model.common.Gas.Lightning     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f41804a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.dialogs.SwapTransactionSpeed.C8315b.C8316a.<clinit>():void");
            }
        }

        public C8315b(SwapTransactionSpeed swapTransactionSpeed) {
            this.f41803a = swapTransactionSpeed;
        }

        /* renamed from: a */
        public void onChanged(Gas gas) {
            int i;
            this.f41803a.mo57310E().mo61613j0().removeObserver(this);
            SwapTransactionSpeed swapTransactionSpeed = this.f41803a;
            if (gas == null) {
                i = -1;
            } else {
                i = C8316a.f41804a[gas.ordinal()];
            }
            zf1 zf1 = null;
            if (i == 1) {
                zf1 A = swapTransactionSpeed.f41800P;
                if (A == null) {
                    vx2.m53605u("binding");
                } else {
                    zf1 = A;
                }
                zf1.f36146e.setChecked(true);
            } else if (i == 2) {
                zf1 A2 = swapTransactionSpeed.f41800P;
                if (A2 == null) {
                    vx2.m53605u("binding");
                } else {
                    zf1 = A2;
                }
                zf1.f36144c.setChecked(true);
            } else if (i == 3) {
                zf1 A3 = swapTransactionSpeed.f41800P;
                if (A3 == null) {
                    vx2.m53605u("binding");
                } else {
                    zf1 = A3;
                }
                zf1.f36145d.setChecked(true);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/SwapTransactionSpeed$c", "Lpf4;", "Lnet/safemoon/androidwallet/model/common/Gas;", "t", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.SwapTransactionSpeed$c */
    /* compiled from: SwapTransactionSpeed.kt */
    public static final class C8317c implements pf4<Gas> {

        /* renamed from: a */
        public final /* synthetic */ SwapTransactionSpeed f41805a;

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: net.safemoon.androidwallet.dialogs.SwapTransactionSpeed$c$a */
        /* compiled from: SwapTransactionSpeed.kt */
        public /* synthetic */ class C8318a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f41806a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    net.safemoon.androidwallet.model.common.Gas[] r0 = net.safemoon.androidwallet.model.common.Gas.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    net.safemoon.androidwallet.model.common.Gas r1 = net.safemoon.androidwallet.model.common.Gas.Standard     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    net.safemoon.androidwallet.model.common.Gas r1 = net.safemoon.androidwallet.model.common.Gas.Fast     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    net.safemoon.androidwallet.model.common.Gas r1 = net.safemoon.androidwallet.model.common.Gas.Lightning     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f41806a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.dialogs.SwapTransactionSpeed.C8317c.C8318a.<clinit>():void");
            }
        }

        public C8317c(SwapTransactionSpeed swapTransactionSpeed) {
            this.f41805a = swapTransactionSpeed;
        }

        /* renamed from: a */
        public void onChanged(Gas gas) {
            int i;
            this.f41805a.mo57309D().mo61450P().removeObserver(this);
            SwapTransactionSpeed swapTransactionSpeed = this.f41805a;
            if (gas == null) {
                i = -1;
            } else {
                i = C8318a.f41806a[gas.ordinal()];
            }
            zf1 zf1 = null;
            if (i == 1) {
                zf1 A = swapTransactionSpeed.f41800P;
                if (A == null) {
                    vx2.m53605u("binding");
                } else {
                    zf1 = A;
                }
                zf1.f36146e.setChecked(true);
            } else if (i == 2) {
                zf1 A2 = swapTransactionSpeed.f41800P;
                if (A2 == null) {
                    vx2.m53605u("binding");
                } else {
                    zf1 = A2;
                }
                zf1.f36144c.setChecked(true);
            } else if (i == 3) {
                zf1 A3 = swapTransactionSpeed.f41800P;
                if (A3 == null) {
                    vx2.m53605u("binding");
                } else {
                    zf1 = A3;
                }
                zf1.f36145d.setChecked(true);
            }
        }
    }

    public SwapTransactionSpeed() {
        SwapTransactionSpeed$swapViewModel$2 swapTransactionSpeed$swapViewModel$2 = new SwapTransactionSpeed$swapViewModel$2(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        ef3 b = C6169a.m47233b(lazyThreadSafetyMode, new SwapTransactionSpeed$special$$inlined$viewModels$default$1(swapTransactionSpeed$swapViewModel$2));
        this.f41801Q = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SwapViewModel.class), new SwapTransactionSpeed$special$$inlined$viewModels$default$2(b), new SwapTransactionSpeed$special$$inlined$viewModels$default$3((pc2) null, b), new SwapTransactionSpeed$special$$inlined$viewModels$default$4(this, b));
        ef3 b2 = C6169a.m47233b(lazyThreadSafetyMode, new SwapTransactionSpeed$special$$inlined$viewModels$default$5(new SwapTransactionSpeed$swapMigrationViewModel$2(this)));
        this.f41802U = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SwapMigrationViewModel.class), new SwapTransactionSpeed$special$$inlined$viewModels$default$6(b2), new SwapTransactionSpeed$special$$inlined$viewModels$default$7((pc2) null, b2), new SwapTransactionSpeed$special$$inlined$viewModels$default$8(this, b2));
    }

    /* renamed from: F */
    public static final void m66235F(SwapTransactionSpeed swapTransactionSpeed, View view) {
        vx2.m53591g(swapTransactionSpeed, "this$0");
        zf1 zf1 = swapTransactionSpeed.f41800P;
        zf1 zf12 = null;
        if (zf1 == null) {
            vx2.m53605u("binding");
            zf1 = null;
        }
        if (zf1.f36146e.isChecked()) {
            swapTransactionSpeed.mo57311H(Gas.Standard);
        } else {
            zf1 zf13 = swapTransactionSpeed.f41800P;
            if (zf13 == null) {
                vx2.m53605u("binding");
                zf13 = null;
            }
            if (zf13.f36144c.isChecked()) {
                swapTransactionSpeed.mo57311H(Gas.Fast);
            } else {
                zf1 zf14 = swapTransactionSpeed.f41800P;
                if (zf14 == null) {
                    vx2.m53605u("binding");
                } else {
                    zf12 = zf14;
                }
                if (zf12.f36145d.isChecked()) {
                    swapTransactionSpeed.mo57311H(Gas.Lightning);
                }
            }
        }
        swapTransactionSpeed.mo22266k();
    }

    /* renamed from: G */
    public static final void m66236G(SwapTransactionSpeed swapTransactionSpeed, View view) {
        vx2.m53591g(swapTransactionSpeed, "this$0");
        swapTransactionSpeed.mo22266k();
    }

    /* renamed from: D */
    public final SwapMigrationViewModel mo57309D() {
        return (SwapMigrationViewModel) this.f41802U.getValue();
    }

    /* renamed from: E */
    public final SwapViewModel mo57310E() {
        return (SwapViewModel) this.f41801Q.getValue();
    }

    /* renamed from: H */
    public final void mo57311H(Gas gas) {
        mo57310E().mo61613j0().setValue(gas);
        mo57309D().mo61450P().setValue(gas);
    }

    /* renamed from: I */
    public final void mo57312I(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, SwapTransactionSpeed.class.getCanonicalName());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return LayoutInflater.from(requireContext()).inflate(R.layout.dialog_swap_transaction_speed, viewGroup, false);
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
        zf1 a = zf1.m55098a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41800P = a;
        mo57310E().mo61613j0().observe(getViewLifecycleOwner(), new C8315b(this));
        mo57309D().mo61450P().observe(getViewLifecycleOwner(), new C8317c(this));
        zf1 zf1 = this.f41800P;
        zf1 zf12 = null;
        if (zf1 == null) {
            vx2.m53605u("binding");
            zf1 = null;
        }
        zf1.f36143b.setOnClickListener(new cj6(this));
        zf1 zf13 = this.f41800P;
        if (zf13 == null) {
            vx2.m53605u("binding");
        } else {
            zf12 = zf13;
        }
        zf12.f36147f.setOnClickListener(new dj6(this));
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        Dialog p = super.mo22273p(bundle);
        vx2.m53590f(p, "super.onCreateDialog(savedInstanceState)");
        p.requestWindowFeature(1);
        return p;
    }
}
