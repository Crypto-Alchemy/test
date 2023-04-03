package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/SwapTransactionTimeLimit;", "Lkf1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Landroid/app/Dialog;", "p", "onStart", "Landroidx/fragment/app/FragmentManager;", "manager", "H", "Lyf1;", "P", "Lyf1;", "binding", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "Q", "Lef3;", "D", "()Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "swapViewModel", "<init>", "()V", "U", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SwapTransactionTimeLimit.kt */
public final class SwapTransactionTimeLimit extends kf1 {

    /* renamed from: U */
    public static final C8319a f41807U = new C8319a((DefaultConstructorMarker) null);

    /* renamed from: P */
    public yf1 f41808P;

    /* renamed from: Q */
    public final ef3 f41809Q;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/SwapTransactionTimeLimit$a;", "", "Lnet/safemoon/androidwallet/dialogs/SwapTransactionTimeLimit;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.SwapTransactionTimeLimit$a */
    /* compiled from: SwapTransactionTimeLimit.kt */
    public static final class C8319a {
        public C8319a() {
        }

        public /* synthetic */ C8319a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SwapTransactionTimeLimit mo57318a() {
            SwapTransactionTimeLimit swapTransactionTimeLimit = new SwapTransactionTimeLimit();
            swapTransactionTimeLimit.setArguments(new Bundle());
            return swapTransactionTimeLimit;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/SwapTransactionTimeLimit$b", "Lpf4;", "", "t", "Lr37;", "a", "(Ljava/lang/Integer;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.SwapTransactionTimeLimit$b */
    /* compiled from: SwapTransactionTimeLimit.kt */
    public static final class C8320b implements pf4<Integer> {

        /* renamed from: a */
        public final /* synthetic */ SwapTransactionTimeLimit f41810a;

        public C8320b(SwapTransactionTimeLimit swapTransactionTimeLimit) {
            this.f41810a = swapTransactionTimeLimit;
        }

        /* renamed from: a */
        public void onChanged(Integer num) {
            this.f41810a.mo57316D().mo61598Z().removeObserver(this);
            yf1 B = this.f41810a.f41808P;
            if (B == null) {
                vx2.m53605u("binding");
                B = null;
            }
            B.f35866e.setText(String.valueOf(num));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/SwapTransactionTimeLimit$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.SwapTransactionTimeLimit$c */
    /* compiled from: SwapTransactionTimeLimit.kt */
    public static final class C8321c implements TextWatcher {
        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public SwapTransactionTimeLimit() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new SwapTransactionTimeLimit$special$$inlined$viewModels$default$1(new SwapTransactionTimeLimit$swapViewModel$2(this)));
        this.f41809Q = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SwapViewModel.class), new SwapTransactionTimeLimit$special$$inlined$viewModels$default$2(b), new SwapTransactionTimeLimit$special$$inlined$viewModels$default$3((pc2) null, b), new SwapTransactionTimeLimit$special$$inlined$viewModels$default$4(this, b));
    }

    /* renamed from: E */
    public static final boolean m66250E(SwapTransactionTimeLimit swapTransactionTimeLimit, TextView textView, int i, KeyEvent keyEvent) {
        vx2.m53591g(swapTransactionTimeLimit, "this$0");
        if (i != 6) {
            return false;
        }
        yf1 yf1 = swapTransactionTimeLimit.f41808P;
        if (yf1 == null) {
            vx2.m53605u("binding");
            yf1 = null;
        }
        yf1.f35863b.performClick();
        return true;
    }

    /* renamed from: F */
    public static final void m66251F(SwapTransactionTimeLimit swapTransactionTimeLimit, View view) {
        vx2.m53591g(swapTransactionTimeLimit, "this$0");
        swapTransactionTimeLimit.mo22266k();
    }

    /* renamed from: G */
    public static final void m66252G(SwapTransactionTimeLimit swapTransactionTimeLimit, View view) {
        int i;
        boolean z;
        vx2.m53591g(swapTransactionTimeLimit, "this$0");
        yf1 yf1 = swapTransactionTimeLimit.f41808P;
        if (yf1 == null) {
            vx2.m53605u("binding");
            yf1 = null;
        }
        Editable text = yf1.f35866e.getText();
        k04<Integer> Z = swapTransactionTimeLimit.mo57316D().mo61598Z();
        if (text != null) {
            if (text.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 0;
                Z.setValue(i);
                swapTransactionTimeLimit.mo22266k();
            }
        }
        i = Integer.valueOf(Integer.parseInt(String.valueOf(text)));
        Z.setValue(i);
        swapTransactionTimeLimit.mo22266k();
    }

    /* renamed from: D */
    public final SwapViewModel mo57316D() {
        return (SwapViewModel) this.f41809Q.getValue();
    }

    /* renamed from: H */
    public final void mo57317H(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, SwapTransactionTimeLimit.class.getCanonicalName());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return LayoutInflater.from(requireContext()).inflate(R.layout.dialog_swap_transaction_limit, viewGroup, false);
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
        yf1 a = yf1.m54738a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41808P = a;
        mo57316D().mo61598Z().observe(getViewLifecycleOwner(), new C8320b(this));
        yf1 yf1 = this.f41808P;
        yf1 yf12 = null;
        if (yf1 == null) {
            vx2.m53605u("binding");
            yf1 = null;
        }
        yf1.f35866e.setFilters(new InputFilter[]{new xu2("1", "60")});
        yf1 yf13 = this.f41808P;
        if (yf13 == null) {
            vx2.m53605u("binding");
            yf13 = null;
        }
        yf13.f35866e.addTextChangedListener(new C8321c());
        yf1 yf14 = this.f41808P;
        if (yf14 == null) {
            vx2.m53605u("binding");
            yf14 = null;
        }
        yf14.f35866e.setOnEditorActionListener(new ej6(this));
        yf1 yf15 = this.f41808P;
        if (yf15 == null) {
            vx2.m53605u("binding");
            yf15 = null;
        }
        yf15.f35864c.setOnClickListener(new fj6(this));
        yf1 yf16 = this.f41808P;
        if (yf16 == null) {
            vx2.m53605u("binding");
        } else {
            yf12 = yf16;
        }
        yf12.f35863b.setOnClickListener(new gj6(this));
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        Dialog p = super.mo22273p(bundle);
        vx2.m53590f(p, "super.onCreateDialog(savedInstanceState)");
        p.requestWindowFeature(1);
        return p;
    }
}
