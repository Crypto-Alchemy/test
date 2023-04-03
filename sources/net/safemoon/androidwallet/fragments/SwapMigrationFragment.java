package net.safemoon.androidwallet.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LiveData;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.google.mlkit.common.MlKitException;
import java.math.BigDecimal;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.AnchorSwitchWallet;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.dialogs.SwapTransactionSpeed;
import net.safemoon.androidwallet.dialogs.SwapTransactionTimeLimit;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.common.LoadingState;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import net.safemoon.androidwallet.provider.AskAuthorizeProvider;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.HomeViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import net.safemoon.androidwallet.viewmodels.MyTokensListViewModel;
import net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel;
import net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 b2\u00020\u0001:\u0001cB\u0007¢\u0006\u0004\b`\u0010aJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0002J \u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u000bH\u0002J\b\u0010 \u001a\u00020\u000bH\u0002R\u0014\u0010#\u001a\u00020\u001b8\u0002XD¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001b8\u0002XD¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010'\u001a\u00020\u001b8\u0002XD¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010)\u001a\u00020\u001b8\u0002XD¢\u0006\u0006\n\u0004\b(\u0010\"R\u0014\u0010+\u001a\u00020\u001b8\u0002XD¢\u0006\u0006\n\u0004\b*\u0010\"R\u0014\u0010/\u001a\u00020,8\u0002XD¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020,8\u0002XD¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00103\u001a\u00020,8\u0002XD¢\u0006\u0006\n\u0004\b2\u0010.R\u0016\u00107\u001a\u0002048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0002¢\u0006\f\n\u0004\b.\u00109\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0002¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020B8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bF\u0010DR\u001b\u0010L\u001a\u00020H8BX\u0002¢\u0006\f\n\u0004\bI\u00109\u001a\u0004\bJ\u0010KR\u001d\u0010Q\u001a\u0004\u0018\u00010M8BX\u0002¢\u0006\f\n\u0004\bN\u00109\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0002¢\u0006\f\n\u0004\bS\u00109\u001a\u0004\bT\u0010UR\u001d\u0010[\u001a\u0004\u0018\u00010W8BX\u0002¢\u0006\f\n\u0004\bX\u00109\u001a\u0004\bY\u0010ZR\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006d"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SwapMigrationFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "onDetach", "", "hidden", "onHiddenChanged", "u0", "isLoading", "Q0", "R0", "", "percentage", "u1", "L0", "G0", "canCancel", "", "title", "msg", "v1", "A0", "x0", "k", "Ljava/lang/String;", "SAFETY_MARGIN", "r", "BNB_SYMBOY", "s", "ETH_SYMBOY", "x", "SFM_SYMBOY", "y", "SAFEMOON_SYMBOY", "", "A", "I", "PERCENTAGE_DIV", "B", "DEFAULT_WIDTH", "C", "DEFAULT_HEIGHT", "Lxa2;", "H", "Lxa2;", "binding", "Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "Lef3;", "getHomeViewModel", "()Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "homeViewModel", "Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel;", "L", "F0", "()Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel;", "swapViewModel", "Lfe7;", "M", "Lfe7;", "bindingSource", "P", "bindingDestination", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "Q", "E0", "()Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "myTokenListViewModel", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "U", "B0", "()Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "argDefaultSwapParam", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "X", "D0", "()Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "Lho2;", "Y", "C0", "()Lho2;", "iHomeActivity", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "Z", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "progressLoading", "<init>", "()V", "e0", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment extends BaseMainFragment {

    /* renamed from: e0 */
    public static final C8466a f42177e0 = new C8466a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final int f42178A = 100;

    /* renamed from: B */
    public final int f42179B = MlKitException.CODE_SCANNER_UNAVAILABLE;

    /* renamed from: C */
    public final int f42180C = MlKitException.CODE_SCANNER_UNAVAILABLE;

    /* renamed from: H */
    public xa2 f42181H;

    /* renamed from: I */
    public final ef3 f42182I = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(HomeViewModel.class), new C8469xffbb74c1(this), new C8470xffbb74c2((pc2) null, this), new C8471xffbb74c3(this));

    /* renamed from: L */
    public final ef3 f42183L;

    /* renamed from: M */
    public fe7 f42184M;

    /* renamed from: P */
    public fe7 f42185P;

    /* renamed from: Q */
    public final ef3 f42186Q;

    /* renamed from: U */
    public final ef3 f42187U;

    /* renamed from: X */
    public final ef3 f42188X;

    /* renamed from: Y */
    public final ef3 f42189Y;

    /* renamed from: Z */
    public ProgressLoading f42190Z;

    /* renamed from: k */
    public final String f42191k = "0.01";

    /* renamed from: r */
    public final String f42192r = "BNB";

    /* renamed from: s */
    public final String f42193s = "ETH";

    /* renamed from: x */
    public final String f42194x = "SFM";

    /* renamed from: y */
    public final String f42195y = "SAFEMOON";

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SwapMigrationFragment$a;", "", "", "ARG_SWAP_DEFAULT_PARAM", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwapMigrationFragment$a */
    /* compiled from: SwapMigrationFragment.kt */
    public static final class C8466a {
        public C8466a() {
        }

        public /* synthetic */ C8466a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwapMigrationFragment$b", "Lpi1;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwapMigrationFragment$b */
    /* compiled from: SwapMigrationFragment.kt */
    public static final class C8467b extends pi1 {

        /* renamed from: e */
        public final /* synthetic */ SwapMigrationFragment f42196e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8467b(SwapMigrationFragment swapMigrationFragment, AutofitEdittext autofitEdittext) {
            super(autofitEdittext);
            this.f42196e = swapMigrationFragment;
            vx2.m53590f(autofitEdittext, "newValue");
        }

        public void afterTextChanged(Editable editable) {
            BigDecimal bigDecimal;
            boolean z;
            super.afterTextChanged(editable);
            fe7 j0 = this.f42196e.f42184M;
            if (j0 == null) {
                vx2.m53605u("bindingSource");
                j0 = null;
            }
            if (!j0.f28840m.isFocused()) {
                k04<SwapMigrationViewModel.C8738a> d0 = this.f42196e.mo57762F0().mo61464d0();
                if (editable != null) {
                    if (editable.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        bigDecimal = new BigDecimal(String.valueOf(ol0.m70330J(editable.toString())));
                        d0.postValue(new SwapMigrationViewModel.C8738a(false, bigDecimal));
                    }
                }
                bigDecimal = new BigDecimal(0);
                d0.postValue(new SwapMigrationViewModel.C8738a(false, bigDecimal));
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwapMigrationFragment$c", "Lpi1;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "", "start", "before", "count", "onTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwapMigrationFragment$c */
    /* compiled from: SwapMigrationFragment.kt */
    public static final class C8468c extends pi1 {

        /* renamed from: e */
        public final /* synthetic */ SwapMigrationFragment f42197e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8468c(SwapMigrationFragment swapMigrationFragment, AutofitEdittext autofitEdittext) {
            super(autofitEdittext);
            this.f42197e = swapMigrationFragment;
            vx2.m53590f(autofitEdittext, "newValue");
        }

        public void afterTextChanged(Editable editable) {
            BigDecimal bigDecimal;
            boolean z;
            super.afterTextChanged(editable);
            try {
                fe7 j0 = this.f42197e.f42184M;
                if (j0 == null) {
                    vx2.m53605u("bindingSource");
                    j0 = null;
                }
                if (j0.f28840m.isFocused()) {
                    k04<SwapMigrationViewModel.C8738a> d0 = this.f42197e.mo57762F0().mo61464d0();
                    if (editable != null) {
                        if (editable.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            bigDecimal = new BigDecimal(String.valueOf(ol0.m70330J(editable.toString())));
                            d0.postValue(new SwapMigrationViewModel.C8738a(true, bigDecimal));
                        }
                    }
                    bigDecimal = new BigDecimal(0);
                    d0.postValue(new SwapMigrationViewModel.C8738a(true, bigDecimal));
                }
            } catch (Exception unused) {
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            boolean z;
            String obj;
            vx2.m53591g(charSequence, "s");
            super.onTextChanged(charSequence, i, i2, i3);
            xa2 h0 = this.f42197e.f42181H;
            xa2 xa2 = null;
            if (h0 == null) {
                vx2.m53605u("binding");
                h0 = null;
            }
            h0.f35564b.setVisibility(8);
            fe7 j0 = this.f42197e.f42184M;
            if (j0 == null) {
                vx2.m53605u("bindingSource");
                j0 = null;
            }
            Editable text = j0.f28840m.getText();
            if (text == null || (obj = text.toString()) == null) {
                str = null;
            } else {
                str = StringsKt__StringsKt.m63090V0(obj).toString();
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                xa2 h02 = this.f42197e.f42181H;
                if (h02 == null) {
                    vx2.m53605u("binding");
                    h02 = null;
                }
                h02.f35565c.setVisibility(0);
                xa2 h03 = this.f42197e.f42181H;
                if (h03 == null) {
                    vx2.m53605u("binding");
                } else {
                    xa2 = h03;
                }
                xa2.f35566d.setVisibility(8);
                return;
            }
            xa2 h04 = this.f42197e.f42181H;
            if (h04 == null) {
                vx2.m53605u("binding");
                h04 = null;
            }
            h04.f35565c.setVisibility(8);
            xa2 h05 = this.f42197e.f42181H;
            if (h05 == null) {
                vx2.m53605u("binding");
            } else {
                xa2 = h05;
            }
            xa2.f35566d.setVisibility(0);
        }
    }

    public SwapMigrationFragment() {
        SwapMigrationFragment$special$$inlined$viewModels$default$1 swapMigrationFragment$special$$inlined$viewModels$default$1 = new SwapMigrationFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        ef3 b = C6169a.m47233b(lazyThreadSafetyMode, new SwapMigrationFragment$special$$inlined$viewModels$default$2(swapMigrationFragment$special$$inlined$viewModels$default$1));
        this.f42183L = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SwapMigrationViewModel.class), new SwapMigrationFragment$special$$inlined$viewModels$default$3(b), new SwapMigrationFragment$special$$inlined$viewModels$default$4((pc2) null, b), new SwapMigrationFragment$special$$inlined$viewModels$default$5(this, b));
        this.f42186Q = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MyTokensListViewModel.class), new C8472xffbb74c4(this), new C8473xffbb74c5((pc2) null, this), new SwapMigrationFragment$myTokenListViewModel$2(this));
        this.f42187U = C6169a.m47232a(new SwapMigrationFragment$argDefaultSwapParam$2(this));
        ef3 b2 = C6169a.m47233b(lazyThreadSafetyMode, new SwapMigrationFragment$special$$inlined$viewModels$default$7(new SwapMigrationFragment$special$$inlined$viewModels$default$6(this)));
        this.f42188X = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MultiWalletViewModel.class), new SwapMigrationFragment$special$$inlined$viewModels$default$8(b2), new SwapMigrationFragment$special$$inlined$viewModels$default$9((pc2) null, b2), new SwapMigrationFragment$special$$inlined$viewModels$default$10(this, b2));
        this.f42189Y = C6169a.m47232a(new SwapMigrationFragment$iHomeActivity$2(this));
    }

    /* renamed from: H0 */
    public static final void m67278H0(fe7 fe7, boolean z) {
        int i;
        vx2.m53591g(fe7, "$this_run");
        MaterialButton materialButton = fe7.f28834g;
        vx2.m53590f(materialButton, "btnClearText");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        materialButton.setVisibility(i);
    }

    /* renamed from: I0 */
    public static final void m67280I0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: J0 */
    public static final void m67282J0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: K0 */
    public static final void m67284K0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: M0 */
    public static final void m67287M0(fe7 fe7, boolean z) {
        int i;
        vx2.m53591g(fe7, "$this_run");
        MaterialButton materialButton = fe7.f28834g;
        vx2.m53590f(materialButton, "btnClearText");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        materialButton.setVisibility(i);
    }

    /* renamed from: N0 */
    public static final void m67289N0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: O0 */
    public static final void m67291O0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: P0 */
    public static final void m67293P0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: S0 */
    public static final void m67297S0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: T0 */
    public static final void m67299T0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: U0 */
    public static final void m67301U0(SwapMigrationFragment swapMigrationFragment, View view) {
        vx2.m53591g(swapMigrationFragment, "this$0");
        SwapTransactionSpeed a = SwapTransactionSpeed.f41799X.mo57313a();
        FragmentManager childFragmentManager = swapMigrationFragment.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        a.mo57312I(childFragmentManager);
    }

    /* renamed from: V0 */
    public static final void m67303V0(SwapMigrationFragment swapMigrationFragment, View view) {
        vx2.m53591g(swapMigrationFragment, "this$0");
        SwapTransactionTimeLimit a = SwapTransactionTimeLimit.f41807U.mo57318a();
        FragmentManager childFragmentManager = swapMigrationFragment.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        a.mo57317H(childFragmentManager);
    }

    /* renamed from: W0 */
    public static final void m67305W0(SwapMigrationFragment swapMigrationFragment, View view) {
        vx2.m53591g(swapMigrationFragment, "this$0");
        swapMigrationFragment.mo57762F0().mo61480x();
    }

    /* renamed from: X0 */
    public static final void m67307X0(SwapMigrationFragment swapMigrationFragment, View view) {
        vx2.m53591g(swapMigrationFragment, "this$0");
        eg1 a = eg1.f37537X.mo51466a(new SwapMigrationFragment$onViewCreated$15$1(swapMigrationFragment), (pc2<r37>) null);
        FragmentManager childFragmentManager = swapMigrationFragment.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        a.mo51465G(childFragmentManager);
    }

    /* renamed from: Y0 */
    public static final void m67309Y0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Z0 */
    public static final void m67311Z0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: a1 */
    public static final void m67313a1(SwapMigrationFragment swapMigrationFragment, View view) {
        vx2.m53591g(swapMigrationFragment, "$this_run");
        swapMigrationFragment.mo57768u1(25.0f);
    }

    /* renamed from: b1 */
    public static final void m67315b1(SwapMigrationFragment swapMigrationFragment, View view) {
        vx2.m53591g(swapMigrationFragment, "$this_run");
        swapMigrationFragment.mo57768u1(50.0f);
    }

    /* renamed from: c1 */
    public static final void m67317c1(SwapMigrationFragment swapMigrationFragment, View view) {
        vx2.m53591g(swapMigrationFragment, "$this_run");
        swapMigrationFragment.mo57768u1(75.0f);
    }

    /* renamed from: d1 */
    public static final void m67319d1(SwapMigrationFragment swapMigrationFragment, View view) {
        vx2.m53591g(swapMigrationFragment, "$this_run");
        swapMigrationFragment.mo57768u1(100.0f);
    }

    /* renamed from: e1 */
    public static final void m67321e1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: f1 */
    public static final void m67323f1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: g1 */
    public static final void m67325g1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: h1 */
    public static final void m67327h1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: i1 */
    public static final void m67329i1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: j1 */
    public static final void m67331j1(SwapMigrationFragment swapMigrationFragment, View view) {
        vx2.m53591g(swapMigrationFragment, "this$0");
        swapMigrationFragment.requireActivity().onBackPressed();
    }

    /* renamed from: k1 */
    public static final void m67333k1(SwapMigrationFragment swapMigrationFragment, View view) {
        vx2.m53591g(swapMigrationFragment, "this$0");
        Context requireContext = swapMigrationFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        new AskAuthorizeProvider(requireContext, swapMigrationFragment.mo58053m()).mo60705a(new SwapMigrationFragment$onViewCreated$25$1(swapMigrationFragment), SwapMigrationFragment$onViewCreated$25$2.INSTANCE);
    }

    /* renamed from: l1 */
    public static final void m67335l1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: m1 */
    public static final void m67337m1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: n1 */
    public static final void m67339n1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: o1 */
    public static final void m67341o1(SwapMigrationFragment swapMigrationFragment, View view) {
        String str;
        vx2.m53591g(swapMigrationFragment, "this$0");
        FragmentActivity requireActivity = swapMigrationFragment.requireActivity();
        vx2.m53590f(requireActivity, "requireActivity()");
        Object[] objArr = new Object[1];
        Swap value = swapMigrationFragment.mo57762F0().mo61446L().getValue();
        if (value != null) {
            str = value.name;
        } else {
            str = null;
        }
        objArr[0] = str;
        String string = swapMigrationFragment.getString(R.string.warning_cant_swap, objArr);
        vx2.m53590f(string, "getString(R.string.warni…tionLiveData.value?.name)");
        fy0.m57957f(requireActivity, (String) null, string, true, (DialogInterface.OnDismissListener) null);
    }

    /* renamed from: p1 */
    public static final void m67343p1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: q1 */
    public static final void m67345q1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: r1 */
    public static final void m67348r1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: s1 */
    public static final void m67351s1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: t1 */
    public static final void m67354t1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m67357v0(SwapMigrationFragment swapMigrationFragment, View view) {
        vx2.m53591g(swapMigrationFragment, "this$0");
        AnchorSwitchWallet anchorSwitchWallet = new AnchorSwitchWallet(swapMigrationFragment.mo57760D0(), R.id.navigation_swap);
        Context requireContext = swapMigrationFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53590f(view, "it");
        xa2 xa2 = swapMigrationFragment.f42181H;
        if (xa2 == null) {
            vx2.m53605u("binding");
            xa2 = null;
        }
        anchorSwitchWallet.mo57160h(requireContext, view, xa2.f35582t);
    }

    /* renamed from: w0 */
    public static final boolean m67359w0(SwapMigrationFragment swapMigrationFragment, View view) {
        vx2.m53591g(swapMigrationFragment, "this$0");
        C7047eg egVar = new C7047eg(swapMigrationFragment.mo57761E0());
        Context requireContext = swapMigrationFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53590f(view, "it");
        xa2 xa2 = swapMigrationFragment.f42181H;
        if (xa2 == null) {
            vx2.m53605u("binding");
            xa2 = null;
        }
        egVar.mo51463f(requireContext, view, xa2.f35582t);
        return true;
    }

    /* renamed from: y0 */
    public static final void m67362y0(fe7 fe7, View view) {
        vx2.m53591g(fe7, "$this_run");
        fe7.f28840m.setText("");
    }

    /* renamed from: z0 */
    public static final void m67364z0(fe7 fe7, View view) {
        vx2.m53591g(fe7, "$this_run");
        fe7.f28840m.setText("");
    }

    /* renamed from: A0 */
    public final void mo57757A0() {
        ProgressLoading progressLoading = this.f42190Z;
        if (progressLoading != null) {
            progressLoading.mo22266k();
        }
    }

    /* renamed from: B0 */
    public final UserTokenItemDisplayModel mo57758B0() {
        return (UserTokenItemDisplayModel) this.f42187U.getValue();
    }

    /* renamed from: C0 */
    public final ho2 mo57759C0() {
        return (ho2) this.f42189Y.getValue();
    }

    /* renamed from: D0 */
    public final MultiWalletViewModel mo57760D0() {
        return (MultiWalletViewModel) this.f42188X.getValue();
    }

    /* renamed from: E0 */
    public final MyTokensListViewModel mo57761E0() {
        return (MyTokensListViewModel) this.f42186Q.getValue();
    }

    /* renamed from: F0 */
    public final SwapMigrationViewModel mo57762F0() {
        return (SwapMigrationViewModel) this.f42183L.getValue();
    }

    /* renamed from: G0 */
    public final void mo57763G0() {
        fe7 fe7 = this.f42185P;
        if (fe7 == null) {
            vx2.m53605u("bindingDestination");
            fe7 = null;
        }
        fe7.f28840m.mo62167d(new bi6(fe7));
        LiveData<X> a = qw6.m25941a(mo57762F0().mo61446L());
        vx2.m53590f(a, "Transformations.distinctUntilChanged(this)");
        a.observe(getViewLifecycleOwner(), new ci6(new SwapMigrationFragment$initDestination$2(this)));
        mo57762F0().mo61445K().observe(getViewLifecycleOwner(), new di6(new SwapMigrationFragment$initDestination$3(this)));
        mo57762F0().mo61447M().observe(getViewLifecycleOwner(), new ei6(new SwapMigrationFragment$initDestination$4(this)));
    }

    /* renamed from: L0 */
    public final void mo57764L0() {
        fe7 fe7 = this.f42184M;
        if (fe7 == null) {
            vx2.m53605u("bindingSource");
            fe7 = null;
        }
        fe7.f28840m.mo62167d(new xh6(fe7));
        LiveData<X> a = qw6.m25941a(mo57762F0().mo61459Y());
        vx2.m53590f(a, "Transformations.distinctUntilChanged(this)");
        a.observe(getViewLifecycleOwner(), new yh6(new SwapMigrationFragment$initSource$2(this)));
        mo57762F0().mo61458X().observe(getViewLifecycleOwner(), new zh6(new SwapMigrationFragment$initSource$3(this)));
        mo57762F0().mo61460Z().observe(getViewLifecycleOwner(), new ai6(new SwapMigrationFragment$initSource$4(this)));
    }

    /* renamed from: Q0 */
    public final void mo57765Q0(boolean z) {
        boolean z2 = !z;
        xa2 xa2 = this.f42181H;
        fe7 fe7 = null;
        if (xa2 == null) {
            vx2.m53605u("binding");
            xa2 = null;
        }
        xa2.f35579q.setEnabled(z2);
        xa2 xa22 = this.f42181H;
        if (xa22 == null) {
            vx2.m53605u("binding");
            xa22 = null;
        }
        xa22.f35575m.setEnabled(z2);
        xa2 xa23 = this.f42181H;
        if (xa23 == null) {
            vx2.m53605u("binding");
            xa23 = null;
        }
        xa23.f35576n.setEnabled(z2);
        xa2 xa24 = this.f42181H;
        if (xa24 == null) {
            vx2.m53605u("binding");
            xa24 = null;
        }
        xa24.f35574l.setEnabled(z2);
        fe7 fe72 = this.f42184M;
        if (fe72 == null) {
            vx2.m53605u("bindingSource");
            fe72 = null;
        }
        fe72.f28835h.setEnabled(z2);
        fe7 fe73 = this.f42185P;
        if (fe73 == null) {
            vx2.m53605u("bindingDestination");
        } else {
            fe7 = fe73;
        }
        fe7.f28835h.setEnabled(z2);
    }

    /* renamed from: R0 */
    public final void mo57766R0(boolean z) {
        boolean z2 = !z;
        mo57765Q0(z);
        fe7 fe7 = this.f42184M;
        fe7 fe72 = null;
        if (fe7 == null) {
            vx2.m53605u("bindingSource");
            fe7 = null;
        }
        fe7.f28840m.setEnabled(z2);
        fe7.f28830c.setEnabled(z2);
        fe7.f28831d.setEnabled(z2);
        fe7.f28832e.setEnabled(z2);
        fe7.f28833f.setEnabled(z2);
        fe7 fe73 = this.f42185P;
        if (fe73 == null) {
            vx2.m53605u("bindingDestination");
        } else {
            fe72 = fe73;
        }
        fe72.f28840m.setEnabled(z2);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return LayoutInflater.from(requireContext()).inflate(R.layout.fragment_swap, viewGroup, false);
    }

    public void onDetach() {
        super.onDetach();
        if (mo57762F0().mo61453S().getValue() == LoadingState.Normal) {
            mo57762F0().mo61482y();
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        xa2 a = xa2.m54332a(view);
        vx2.m53590f(a, "bind(view)");
        this.f42181H = a;
        SwapMigrationViewModel F0 = mo57762F0();
        ug3 viewLifecycleOwner = getViewLifecycleOwner();
        vx2.m53590f(viewLifecycleOwner, "viewLifecycleOwner");
        F0.mo61476p0(viewLifecycleOwner);
        xa2 xa2 = null;
        mo57762F0().mo61467g0().postValue(null);
        mo57762F0().mo61464d0().postValue(null);
        k04<Double> E = mo57762F0().mo61439E();
        Double valueOf = Double.valueOf(Utils.DOUBLE_EPSILON);
        E.postValue(valueOf);
        mo57762F0().mo61437C().postValue(valueOf);
        xa2 xa22 = this.f42181H;
        if (xa22 == null) {
            vx2.m53605u("binding");
            xa22 = null;
        }
        xa22.f35577o.setPadding(0, 0, 0, 0);
        xa2 xa23 = this.f42181H;
        if (xa23 == null) {
            vx2.m53605u("binding");
            xa23 = null;
        }
        xa23.f35581s.f21728c.setVisibility(8);
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getWindow().addFlags(Integer.MIN_VALUE);
        requireActivity.getWindow().setStatusBarColor(zr0.m31440c(requireActivity, 17170445));
        requireActivity.getWindow().setBackgroundDrawableResource(R.drawable.bottom_curve);
        xa2 xa24 = this.f42181H;
        if (xa24 == null) {
            vx2.m53605u("binding");
            xa24 = null;
        }
        fe7 a2 = fe7.m44306a(xa24.f35570h.findViewById(R.id.parent));
        vx2.m53590f(a2, "bind(binding.ccSource.findViewById(R.id.parent))");
        this.f42184M = a2;
        xa2 xa25 = this.f42181H;
        if (xa25 == null) {
            vx2.m53605u("binding");
            xa25 = null;
        }
        fe7 a3 = fe7.m44306a(xa25.f35569g.findViewById(R.id.parent));
        vx2.m53590f(a3, "bind(binding.ccDestinati…indViewById(R.id.parent))");
        this.f42185P = a3;
        fe7 fe7 = this.f42184M;
        if (fe7 == null) {
            vx2.m53605u("bindingSource");
            fe7 = null;
        }
        fe7.f28840m.setText("");
        fe7 fe72 = this.f42185P;
        if (fe72 == null) {
            vx2.m53605u("bindingDestination");
            fe72 = null;
        }
        fe72.f28840m.setText("");
        Wallet.Companion companion = Wallet.Companion;
        String j = f06.m57519j(getContext(), "SAFEMOON_ACTIVE_WALLET", "");
        vx2.m53590f(j, "getString(context, Share…FEMOON_ACTIVE_WALLET, \"\")");
        Wallet wallet2 = companion.toWallet(j);
        if (wallet2 != null) {
            str = wallet2.displayName();
        } else {
            str = null;
        }
        xa2 xa26 = this.f42181H;
        if (xa26 == null) {
            vx2.m53605u("binding");
            xa26 = null;
        }
        xa26.f35558A.setText(str);
        mo57767u0();
        mo57761E0().mo61298J().observe(getViewLifecycleOwner(), new yg6(new SwapMigrationFragment$onViewCreated$2(this)));
        mo57762F0().mo61463c0().observe(getViewLifecycleOwner(), new ah6(new SwapMigrationFragment$onViewCreated$3(this)));
        xa2 xa27 = this.f42181H;
        if (xa27 == null) {
            vx2.m53605u("binding");
            xa27 = null;
        }
        xa27.f35580r.setOnClickListener(new kh6(this));
        mo57764L0();
        mo57763G0();
        xa2 xa28 = this.f42181H;
        if (xa28 == null) {
            vx2.m53605u("binding");
            xa28 = null;
        }
        xa28.f35579q.setOnClickListener(new lh6(this));
        mo57762F0().mo61456V().observe(getViewLifecycleOwner(), new mh6(new SwapMigrationFragment$onViewCreated$6(this)));
        xa2 xa29 = this.f42181H;
        if (xa29 == null) {
            vx2.m53605u("binding");
            xa29 = null;
        }
        TextView textView = (TextView) xa29.mo49440b().findViewById(R.id.textScreenName);
        if (textView != null) {
            ol0.m70341U(textView);
        }
        mo57762F0().mo61457W().postValue(valueOf);
        mo57762F0().mo61457W().observe(getViewLifecycleOwner(), new nh6(new SwapMigrationFragment$onViewCreated$7(this)));
        xa2 xa210 = this.f42181H;
        if (xa210 == null) {
            vx2.m53605u("binding");
            xa210 = null;
        }
        xa210.f35575m.setVisibility(8);
        xa2 xa211 = this.f42181H;
        if (xa211 == null) {
            vx2.m53605u("binding");
            xa211 = null;
        }
        xa211.f35574l.setVisibility(8);
        xa2 xa212 = this.f42181H;
        if (xa212 == null) {
            vx2.m53605u("binding");
            xa212 = null;
        }
        xa212.f35567e.setVisibility(8);
        mo57762F0().mo61450P().observe(getViewLifecycleOwner(), new oh6(new SwapMigrationFragment$onViewCreated$8(this)));
        mo57762F0().mo61444J().observe(getViewLifecycleOwner(), new ph6(new SwapMigrationFragment$onViewCreated$9(this)));
        mo57762F0().mo61466f0().observe(getViewLifecycleOwner(), new qh6(new SwapMigrationFragment$onViewCreated$10(this)));
        mo57762F0().mo61465e0().observe(getViewLifecycleOwner(), new rh6(new SwapMigrationFragment$onViewCreated$11(this)));
        xa2 xa213 = this.f42181H;
        if (xa213 == null) {
            vx2.m53605u("binding");
            xa213 = null;
        }
        xa213.f35576n.setOnClickListener(new jh6(this));
        xa2 xa214 = this.f42181H;
        if (xa214 == null) {
            vx2.m53605u("binding");
            xa214 = null;
        }
        xa214.f35574l.setOnClickListener(new uh6(this));
        xa2 xa215 = this.f42181H;
        if (xa215 == null) {
            vx2.m53605u("binding");
            xa215 = null;
        }
        xa215.f35564b.setOnClickListener(new fi6(this));
        xa2 xa216 = this.f42181H;
        if (xa216 == null) {
            vx2.m53605u("binding");
            xa216 = null;
        }
        xa216.f35567e.setOnClickListener(new gi6(this));
        mo57762F0().mo61440F().observe(getViewLifecycleOwner(), new hi6(new SwapMigrationFragment$onViewCreated$16(this)));
        fe7 fe73 = this.f42184M;
        if (fe73 == null) {
            vx2.m53605u("bindingSource");
            fe73 = null;
        }
        fe73.f28830c.setOnClickListener(new ii6(this));
        fe73.f28831d.setOnClickListener(new ji6(this));
        fe73.f28832e.setOnClickListener(new ki6(this));
        fe73.f28833f.setOnClickListener(new li6(this));
        fe73.f28840m.setFilters(new InputFilter[]{new xu2(valueOf, Double.valueOf(Double.MAX_VALUE))});
        AutofitEdittext autofitEdittext = fe73.f28840m;
        Common common = Common.f42577a;
        autofitEdittext.setHint(getString(R.string.hint_0, Character.valueOf(common.mo60892B())));
        fe7 fe74 = this.f42185P;
        if (fe74 == null) {
            vx2.m53605u("bindingDestination");
            fe74 = null;
        }
        fe74.f28830c.setVisibility(4);
        fe74.f28831d.setVisibility(4);
        fe74.f28832e.setVisibility(4);
        fe74.f28833f.setVisibility(4);
        fe74.f28840m.setFilters(new InputFilter[]{new xu2(valueOf, Double.valueOf(Double.MAX_VALUE))});
        fe74.f28840m.setHint(getString(R.string.hint_0, Character.valueOf(common.mo60892B())));
        mo57762F0().mo61464d0().observe(getViewLifecycleOwner(), new zg6(new SwapMigrationFragment$onViewCreated$19(this)));
        mo57762F0().mo61439E().observe(getViewLifecycleOwner(), new bh6(new SwapMigrationFragment$onViewCreated$20(this)));
        mo57762F0().mo61437C().observe(getViewLifecycleOwner(), new ch6(new SwapMigrationFragment$onViewCreated$21(this)));
        mo57762F0().mo61442H().observe(getViewLifecycleOwner(), new dh6(new SwapMigrationFragment$onViewCreated$22(this)));
        mo57762F0().mo61453S().observe(getViewLifecycleOwner(), new eh6(new SwapMigrationFragment$onViewCreated$23(this)));
        mo57770x0();
        fe7 fe75 = this.f42184M;
        if (fe75 == null) {
            vx2.m53605u("bindingSource");
            fe75 = null;
        }
        C8468c cVar = new C8468c(this, fe75.f28840m);
        fe7 fe76 = this.f42185P;
        if (fe76 == null) {
            vx2.m53605u("bindingDestination");
            fe76 = null;
        }
        C8467b bVar = new C8467b(this, fe76.f28840m);
        fe7 fe77 = this.f42184M;
        if (fe77 == null) {
            vx2.m53605u("bindingSource");
            fe77 = null;
        }
        AutofitEdittext autofitEdittext2 = fe77.f28840m;
        autofitEdittext2.setEnabled(true);
        autofitEdittext2.setFocusableInTouchMode(true);
        autofitEdittext2.setFocusable(true);
        fe7 fe78 = this.f42184M;
        if (fe78 == null) {
            vx2.m53605u("bindingSource");
            fe78 = null;
        }
        AutofitEdittext autofitEdittext3 = fe78.f28840m;
        fe7 fe79 = this.f42184M;
        if (fe79 == null) {
            vx2.m53605u("bindingSource");
            fe79 = null;
        }
        AutofitEdittext autofitEdittext4 = fe79.f28840m;
        vx2.m53590f(autofitEdittext4, "bindingSource.newValue");
        autofitEdittext3.addTextChangedListener(new nc4(autofitEdittext4));
        fe7 fe710 = this.f42184M;
        if (fe710 == null) {
            vx2.m53605u("bindingSource");
            fe710 = null;
        }
        fe710.f28840m.addTextChangedListener(cVar);
        fe7 fe711 = this.f42185P;
        if (fe711 == null) {
            vx2.m53605u("bindingDestination");
            fe711 = null;
        }
        AutofitEdittext autofitEdittext5 = fe711.f28840m;
        fe7 fe712 = this.f42185P;
        if (fe712 == null) {
            vx2.m53605u("bindingDestination");
            fe712 = null;
        }
        AutofitEdittext autofitEdittext6 = fe712.f28840m;
        vx2.m53590f(autofitEdittext6, "bindingDestination.newValue");
        autofitEdittext5.addTextChangedListener(new nc4(autofitEdittext6));
        fe7 fe713 = this.f42185P;
        if (fe713 == null) {
            vx2.m53605u("bindingDestination");
            fe713 = null;
        }
        fe713.f28840m.addTextChangedListener(bVar);
        xa2 xa217 = this.f42181H;
        if (xa217 == null) {
            vx2.m53605u("binding");
        } else {
            xa2 = xa217;
        }
        xa2.f35566d.setOnClickListener(new fh6(this));
        mo57762F0().mo61467g0().observe(getViewLifecycleOwner(), new gh6(new SwapMigrationFragment$onViewCreated$26(this)));
        mo57762F0().mo61441G().observe(getViewLifecycleOwner(), new hh6(new SwapMigrationFragment$onViewCreated$27(this)));
        ho0.m58585b(mo57762F0().mo61449O()).observe(getViewLifecycleOwner(), new ih6(new SwapMigrationFragment$onViewCreated$28(this)));
    }

    /* renamed from: u0 */
    public final void mo57767u0() {
        if (this.f42181H == null) {
            vx2.m53605u("binding");
        }
        xa2 xa2 = this.f42181H;
        xa2 xa22 = null;
        if (xa2 == null) {
            vx2.m53605u("binding");
            xa2 = null;
        }
        MaterialTextView materialTextView = xa2.f35559B;
        vx2.m53590f(materialTextView, "binding.tvTotal");
        ol0.m70343W(materialTextView, new SwapMigrationFragment$bind$2(this));
        xa2 xa23 = this.f42181H;
        if (xa23 == null) {
            vx2.m53605u("binding");
            xa23 = null;
        }
        xa23.f35558A.setOnClickListener(new sh6(this));
        xa2 xa24 = this.f42181H;
        if (xa24 == null) {
            vx2.m53605u("binding");
        } else {
            xa22 = xa24;
        }
        xa22.f35559B.setOnLongClickListener(new th6(this));
    }

    /* renamed from: u1 */
    public final void mo57768u1(float f) {
        BigDecimal value = mo57762F0().mo61458X().getValue();
        if (value != null) {
            fe7 fe7 = this.f42184M;
            fe7 fe72 = null;
            if (fe7 == null) {
                vx2.m53605u("bindingSource");
                fe7 = null;
            }
            fe7.f28840m.requestFocus();
            a77.m55428f(requireContext());
            Swap value2 = mo57762F0().mo61459Y().getValue();
            vx2.m53588d(value2);
            Swap swap = value2;
            BigDecimal multiply = value.multiply(new BigDecimal(String.valueOf(f / ((float) this.f42178A))));
            if (swap.symbol.equals(this.f42192r) || swap.symbol.equals(this.f42193s)) {
                BigDecimal multiply2 = value.subtract(new BigDecimal(this.f42191k)).multiply(new BigDecimal(String.valueOf(f / ((float) this.f42178A))));
                BigDecimal subtract = value.subtract(new BigDecimal(String.valueOf(0.01d)));
                vx2.m53590f(subtract, "this.subtract(other)");
                if (multiply.compareTo(subtract) > 0) {
                    multiply = multiply2;
                }
                String j = ol0.m70365j(multiply.doubleValue());
                vx2.m53590f(j, "safetyMargin.toDouble().decimal8()");
                if (ol0.m70330J(j) > Utils.DOUBLE_EPSILON) {
                    fe7 fe73 = this.f42184M;
                    if (fe73 == null) {
                        vx2.m53605u("bindingSource");
                    } else {
                        fe72 = fe73;
                    }
                    fe72.f28840m.setText(ol0.m70365j(multiply.doubleValue()));
                    return;
                }
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    vx2.m53590f(activity, "activity");
                    String string = getResources().getString(R.string.swap_error_insufficient_balance);
                    vx2.m53590f(string, "resources.getString(R.st…ror_insufficient_balance)");
                    ol0.m70348a0(activity, string);
                    return;
                }
                return;
            }
            String j2 = ol0.m70365j(multiply.doubleValue());
            vx2.m53590f(j2, "balance.toDouble().decimal8()");
            if (ol0.m70330J(j2) > Utils.DOUBLE_EPSILON) {
                fe7 fe74 = this.f42184M;
                if (fe74 == null) {
                    vx2.m53605u("bindingSource");
                } else {
                    fe72 = fe74;
                }
                fe72.f28840m.setText(ol0.m70365j(multiply.doubleValue()));
                return;
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                vx2.m53590f(activity2, "activity");
                String string2 = getResources().getString(R.string.swap_error_insufficient_balance);
                vx2.m53590f(string2, "resources.getString(R.st…ror_insufficient_balance)");
                ol0.m70348a0(activity2, string2);
            }
        }
    }

    /* renamed from: v1 */
    public final void mo57769v1(boolean z, String str, String str2) {
        ProgressLoading progressLoading;
        ProgressLoading progressLoading2 = this.f42190Z;
        boolean z2 = true;
        if (progressLoading2 == null || !progressLoading2.isVisible()) {
            z2 = false;
        }
        if (z2 && (progressLoading = this.f42190Z) != null) {
            progressLoading.mo22266k();
        }
        ProgressLoading a = ProgressLoading.f41785Y.mo57297a(z, str, str2);
        this.f42190Z = a;
        if (a != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            vx2.m53590f(childFragmentManager, "childFragmentManager");
            a.mo57295D(childFragmentManager);
        }
    }

    /* renamed from: x0 */
    public final void mo57770x0() {
        fe7 fe7 = this.f42184M;
        fe7 fe72 = null;
        if (fe7 == null) {
            vx2.m53605u("bindingSource");
            fe7 = null;
        }
        fe7.f28834g.setOnClickListener(new vh6(fe7));
        fe7 fe73 = this.f42185P;
        if (fe73 == null) {
            vx2.m53605u("bindingDestination");
        } else {
            fe72 = fe73;
        }
        fe72.f28834g.setOnClickListener(new wh6(fe72));
    }
}
