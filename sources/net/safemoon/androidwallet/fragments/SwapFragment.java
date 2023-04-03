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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.C0684j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LiveData;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.google.mlkit.common.MlKitException;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.AnchorSwitchWallet;
import net.safemoon.androidwallet.dialogs.ConfirmSwapTransactionFragment;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.dialogs.SwapAutoSlippage;
import net.safemoon.androidwallet.dialogs.SwapSlipPage;
import net.safemoon.androidwallet.dialogs.SwapTransactionSpeed;
import net.safemoon.androidwallet.dialogs.SwapTransactionTimeLimit;
import net.safemoon.androidwallet.fragments.SelectCurrencyFragment;
import net.safemoon.androidwallet.fragments.SwapFragment$onSelectTokenTypeClickListener$2;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.common.LoadingState;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.model.token.room.RoomToken;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.HomeViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import net.safemoon.androidwallet.viewmodels.MyTokensListViewModel;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;
import net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Ë\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001l\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001B\t¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J \u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\u0012\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\u001a\u0010'\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u0004H\u0007R\u0014\u0010+\u001a\u00020(8\u0002XD¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002XD¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00108\u0002XD¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020,8\u0002XD¢\u0006\u0006\n\u0004\b3\u0010.R\u0014\u00106\u001a\u00020,8\u0002XD¢\u0006\u0006\n\u0004\b5\u0010.R\u0014\u00108\u001a\u00020\u00108\u0002XD¢\u0006\u0006\n\u0004\b7\u00101R\u0014\u0010:\u001a\u00020\u00108\u0002XD¢\u0006\u0006\n\u0004\b9\u00101R\u0014\u0010<\u001a\u00020\u00108\u0002XD¢\u0006\u0006\n\u0004\b;\u00101R\u0014\u0010?\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b.\u0010>R\u0014\u0010B\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010D\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\bC\u0010>R\u0016\u0010G\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010.R\u0016\u0010K\u001a\u00020,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010.R\u0016\u0010O\u001a\u00020L8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bM\u0010NR\u001b\u0010U\u001a\u00020P8BX\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001b\u0010Y\u001a\u00020V8BX\u0002¢\u0006\f\n\u0004\bF\u0010R\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0002¢\u0006\f\n\u0004\b[\u0010R\u001a\u0004\b\\\u0010]R\u001b\u0010c\u001a\u00020_8BX\u0002¢\u0006\f\n\u0004\b`\u0010R\u001a\u0004\ba\u0010bR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00020d8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010fR'\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020h8BX\u0002¢\u0006\f\n\u0004\bW\u0010R\u001a\u0004\bi\u0010jR\u001b\u0010o\u001a\u00020l8BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bm\u0010nR\u001d\u0010t\u001a\u0004\u0018\u00010p8BX\u0002¢\u0006\f\n\u0004\bq\u0010R\u001a\u0004\br\u0010sR\u001d\u0010y\u001a\u0004\u0018\u00010u8BX\u0002¢\u0006\f\n\u0004\bv\u0010R\u001a\u0004\bw\u0010xR\u0016\u0010}\u001a\u00020z8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010~\u001a\u00020z8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0007\u0010|R(\u0010\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0005\u0012\u00030\u000100d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010fR\u001b\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010fR\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SwapFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Lnet/safemoon/androidwallet/common/TokenType;", "e1", "", "isLoading", "Lr37;", "r1", "s1", "", "percentage", "l2", "t1", "m1", "h1", "canCancel", "", "title", "msg", "n2", "X0", "U0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "onPause", "onResume", "onDetach", "Landroidx/fragment/app/Fragment;", "newFragment", "isBack", "k2", "", "k", "J", "delayAfterChange", "", "r", "I", "percentageDiv", "s", "Ljava/lang/String;", "safetyMarginCons", "x", "IconSizeDefaultWidth", "y", "IconSizeDefaultHeight", "A", "WBNB", "B", "WETH", "C", "SAFEMOON", "H", "F", "PERCENT_25", "PERCENT_50", "L", "PERCENT_75", "M", "PERCENT_100", "P", "Z", "updateDefaultChain", "Q", "indexOfTop", "U", "indexOfBottom", "Lxa2;", "X", "Lxa2;", "binding", "Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "Y", "Lef3;", "Z0", "()Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "homeViewModel", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "b1", "()Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "e0", "g1", "()Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "swapViewModel", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "k0", "c1", "()Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "myTokenListViewModel", "", "v0", "Ljava/util/List;", "excludeSwap", "", "f1", "()Ljava/util/Map;", "swapChains", "net/safemoon/androidwallet/fragments/SwapFragment$onSelectTokenTypeClickListener$2$a", "d1", "()Lnet/safemoon/androidwallet/fragments/SwapFragment$onSelectTokenTypeClickListener$2$a;", "onSelectTokenTypeClickListener", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "o1", "Y0", "()Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "argDefaultSwapParam", "Lho2;", "p1", "a1", "()Lho2;", "iHomeActivity", "Lfe7;", "q1", "Lfe7;", "bindingSource", "bindingDestination", "Lkotlin/Pair;", "", "AutoSlippage", "disableReverseForUITopToken", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "u1", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "progressLoading", "<init>", "()V", "v1", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment extends BaseMainFragment {

    /* renamed from: v1 */
    public static final C8459a f42138v1 = new C8459a((DefaultConstructorMarker) null);

    /* renamed from: w1 */
    public static final double f42139w1 = 0.5d;

    /* renamed from: A */
    public final String f42140A = "WBNB";

    /* renamed from: B */
    public final String f42141B = "WETH";

    /* renamed from: C */
    public final String f42142C = "SAFEMOON";

    /* renamed from: H */
    public final float f42143H = 25.0f;

    /* renamed from: I */
    public final float f42144I = 50.0f;

    /* renamed from: L */
    public final float f42145L = 75.0f;

    /* renamed from: M */
    public final float f42146M = 100.0f;

    /* renamed from: P */
    public boolean f42147P = true;

    /* renamed from: Q */
    public int f42148Q = -1;

    /* renamed from: U */
    public int f42149U = -1;

    /* renamed from: X */
    public xa2 f42150X;

    /* renamed from: Y */
    public final ef3 f42151Y = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(HomeViewModel.class), new SwapFragment$special$$inlined$activityViewModels$default$1(this), new SwapFragment$special$$inlined$activityViewModels$default$2((pc2) null, this), new SwapFragment$special$$inlined$activityViewModels$default$3(this));

    /* renamed from: Z */
    public final ef3 f42152Z;

    /* renamed from: b1 */
    public final ef3 f42153b1;

    /* renamed from: e0 */
    public final ef3 f42154e0;

    /* renamed from: e1 */
    public final ef3 f42155e1;

    /* renamed from: k */
    public final long f42156k = 2500;

    /* renamed from: k0 */
    public final ef3 f42157k0;

    /* renamed from: o1 */
    public final ef3 f42158o1;

    /* renamed from: p1 */
    public final ef3 f42159p1;

    /* renamed from: q1 */
    public fe7 f42160q1;

    /* renamed from: r */
    public final int f42161r = 100;

    /* renamed from: r1 */
    public fe7 f42162r1;

    /* renamed from: s */
    public final String f42163s = "0.01";

    /* renamed from: s1 */
    public final List<Pair<String, Double>> f42164s1;

    /* renamed from: t1 */
    public final List<String> f42165t1;

    /* renamed from: u1 */
    public ProgressLoading f42166u1;

    /* renamed from: v0 */
    public final List<TokenType> f42167v0;

    /* renamed from: x */
    public final int f42168x = MlKitException.CODE_SCANNER_UNAVAILABLE;

    /* renamed from: y */
    public final int f42169y = MlKitException.CODE_SCANNER_UNAVAILABLE;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SwapFragment$a;", "", "", "ARG_SWAP_DEFAULT_PARAM", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwapFragment$a */
    /* compiled from: SwapFragment.kt */
    public static final class C8459a {
        public C8459a() {
        }

        public /* synthetic */ C8459a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SwapFragment$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lnet/safemoon/androidwallet/model/token/room/RoomToken;", "a", "Lnet/safemoon/androidwallet/model/token/room/RoomToken;", "()Lnet/safemoon/androidwallet/model/token/room/RoomToken;", "c", "(Lnet/safemoon/androidwallet/model/token/room/RoomToken;)V", "roomToken", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$c;", "b", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$c;", "()Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$c;", "d", "(Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$c;)V", "tokenType", "<init>", "(Lnet/safemoon/androidwallet/model/token/room/RoomToken;Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$c;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwapFragment$b */
    /* compiled from: SwapFragment.kt */
    public static final class C8460b {

        /* renamed from: a */
        public RoomToken f42170a;

        /* renamed from: b */
        public SwapViewModel.C8788c f42171b;

        public C8460b(RoomToken roomToken, SwapViewModel.C8788c cVar) {
            this.f42170a = roomToken;
            this.f42171b = cVar;
        }

        /* renamed from: a */
        public final RoomToken mo57721a() {
            return this.f42170a;
        }

        /* renamed from: b */
        public final SwapViewModel.C8788c mo57722b() {
            return this.f42171b;
        }

        /* renamed from: c */
        public final void mo57723c(RoomToken roomToken) {
            this.f42170a = roomToken;
        }

        /* renamed from: d */
        public final void mo57724d(SwapViewModel.C8788c cVar) {
            this.f42171b = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8460b)) {
                return false;
            }
            C8460b bVar = (C8460b) obj;
            return vx2.m53586b(this.f42170a, bVar.f42170a) && vx2.m53586b(this.f42171b, bVar.f42171b);
        }

        public int hashCode() {
            RoomToken roomToken = this.f42170a;
            int i = 0;
            int hashCode = (roomToken == null ? 0 : roomToken.hashCode()) * 31;
            SwapViewModel.C8788c cVar = this.f42171b;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            RoomToken roomToken = this.f42170a;
            SwapViewModel.C8788c cVar = this.f42171b;
            return "btnV2(roomToken=" + roomToken + ", tokenType=" + cVar + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\r"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwapFragment$c", "Lbp1;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "p0", "", "p1", "p2", "p3", "onTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwapFragment$c */
    /* compiled from: SwapFragment.kt */
    public static final class C8461c extends bp1 {

        /* renamed from: a */
        public final /* synthetic */ SwapFragment f42172a;

        public C8461c(SwapFragment swapFragment) {
            this.f42172a = swapFragment;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005a A[Catch:{ Exception -> 0x009b }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0066 A[Catch:{ Exception -> 0x009b }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0070 A[Catch:{ Exception -> 0x009b }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r8) {
            /*
                r7 = this;
                super.afterTextChanged(r8)
                net.safemoon.androidwallet.fragments.SwapFragment r0 = r7.f42172a     // Catch:{ Exception -> 0x009b }
                fe7 r0 = r0.f42162r1     // Catch:{ Exception -> 0x009b }
                r1 = 0
                java.lang.String r2 = "bindingDestination"
                if (r0 != 0) goto L_0x0012
                p000.vx2.m53605u(r2)     // Catch:{ Exception -> 0x009b }
                r0 = r1
            L_0x0012:
                net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r0 = r0.f28840m     // Catch:{ Exception -> 0x009b }
                boolean r0 = r0.isFocused()     // Catch:{ Exception -> 0x009b }
                if (r0 == 0) goto L_0x009f
                net.safemoon.androidwallet.fragments.SwapFragment r0 = r7.f42172a     // Catch:{ Exception -> 0x009b }
                net.safemoon.androidwallet.viewmodels.SwapViewModel r0 = r0.mo57712g1()     // Catch:{ Exception -> 0x009b }
                k04 r0 = r0.mo61561G0()     // Catch:{ Exception -> 0x009b }
                net.safemoon.androidwallet.viewmodels.SwapViewModel$a r3 = new net.safemoon.androidwallet.viewmodels.SwapViewModel$a     // Catch:{ Exception -> 0x009b }
                r4 = 1
                r5 = 0
                if (r8 == 0) goto L_0x0042
                int r6 = r8.length()     // Catch:{ Exception -> 0x009b }
                if (r6 <= 0) goto L_0x0032
                r6 = r4
                goto L_0x0033
            L_0x0032:
                r6 = r5
            L_0x0033:
                if (r6 == 0) goto L_0x0042
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x009b }
                java.math.BigDecimal r8 = p000.ol0.m70331K(r8)     // Catch:{ Exception -> 0x009b }
                if (r8 != 0) goto L_0x0047
                java.math.BigDecimal r8 = java.math.BigDecimal.ZERO     // Catch:{ Exception -> 0x009b }
                goto L_0x0047
            L_0x0042:
                java.math.BigDecimal r8 = new java.math.BigDecimal     // Catch:{ Exception -> 0x009b }
                r8.<init>(r5)     // Catch:{ Exception -> 0x009b }
            L_0x0047:
                java.lang.String r6 = "if (s != null && s.isNot…                        }"
                p000.vx2.m53590f(r8, r6)     // Catch:{ Exception -> 0x009b }
                r3.<init>(r5, r8)     // Catch:{ Exception -> 0x009b }
                r0.postValue(r3)     // Catch:{ Exception -> 0x009b }
                net.safemoon.androidwallet.fragments.SwapFragment r8 = r7.f42172a     // Catch:{ Exception -> 0x009b }
                fe7 r8 = r8.f42162r1     // Catch:{ Exception -> 0x009b }
                if (r8 != 0) goto L_0x005e
                p000.vx2.m53605u(r2)     // Catch:{ Exception -> 0x009b }
                r8 = r1
            L_0x005e:
                net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r8 = r8.f28840m     // Catch:{ Exception -> 0x009b }
                android.text.Editable r8 = r8.getText()     // Catch:{ Exception -> 0x009b }
                if (r8 == 0) goto L_0x006e
                boolean r8 = p000.yb6.m74325B(r8)     // Catch:{ Exception -> 0x009b }
                if (r8 == 0) goto L_0x006d
                goto L_0x006e
            L_0x006d:
                r4 = r5
            L_0x006e:
                if (r4 != 0) goto L_0x009f
                net.safemoon.androidwallet.fragments.SwapFragment r8 = r7.f42172a     // Catch:{ Exception -> 0x009b }
                fe7 r8 = r8.f42162r1     // Catch:{ Exception -> 0x009b }
                if (r8 != 0) goto L_0x007c
                p000.vx2.m53605u(r2)     // Catch:{ Exception -> 0x009b }
                goto L_0x007d
            L_0x007c:
                r1 = r8
            L_0x007d:
                net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r8 = r1.f28840m     // Catch:{ Exception -> 0x009b }
                android.text.Editable r8 = r8.getText()     // Catch:{ Exception -> 0x009b }
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x009b }
                double r0 = p000.ol0.m70330J(r8)     // Catch:{ Exception -> 0x009b }
                r2 = 0
                int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r8 <= 0) goto L_0x009f
                net.safemoon.androidwallet.fragments.SwapFragment r8 = r7.f42172a     // Catch:{ Exception -> 0x009b }
                android.content.Context r8 = r8.requireContext()     // Catch:{ Exception -> 0x009b }
                p000.a77.m55428f(r8)     // Catch:{ Exception -> 0x009b }
                goto L_0x009f
            L_0x009b:
                r8 = move-exception
                r8.printStackTrace()
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.SwapFragment.C8461c.afterTextChanged(android.text.Editable):void");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            boolean z;
            String obj;
            super.onTextChanged(charSequence, i, i2, i3);
            xa2 u0 = this.f42172a.f42150X;
            xa2 xa2 = null;
            if (u0 == null) {
                vx2.m53605u("binding");
                u0 = null;
            }
            u0.f35564b.setVisibility(8);
            fe7 v0 = this.f42172a.f42162r1;
            if (v0 == null) {
                vx2.m53605u("bindingDestination");
                v0 = null;
            }
            Editable text = v0.f28840m.getText();
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
                xa2 u02 = this.f42172a.f42150X;
                if (u02 == null) {
                    vx2.m53605u("binding");
                    u02 = null;
                }
                u02.f35565c.setVisibility(0);
                xa2 u03 = this.f42172a.f42150X;
                if (u03 == null) {
                    vx2.m53605u("binding");
                    u03 = null;
                }
                u03.f35566d.setVisibility(8);
                xa2 u04 = this.f42172a.f42150X;
                if (u04 == null) {
                    vx2.m53605u("binding");
                } else {
                    xa2 = u04;
                }
                xa2.f35586x.setVisibility(8);
                return;
            }
            xa2 u05 = this.f42172a.f42150X;
            if (u05 == null) {
                vx2.m53605u("binding");
                u05 = null;
            }
            u05.f35565c.setVisibility(8);
            xa2 u06 = this.f42172a.f42150X;
            if (u06 == null) {
                vx2.m53605u("binding");
                u06 = null;
            }
            u06.f35566d.setVisibility(0);
            xa2 u07 = this.f42172a.f42150X;
            if (u07 == null) {
                vx2.m53605u("binding");
            } else {
                xa2 = u07;
            }
            xa2.f35586x.setVisibility(8);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\r"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwapFragment$d", "Lbp1;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "p0", "", "p1", "p2", "p3", "onTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwapFragment$d */
    /* compiled from: SwapFragment.kt */
    public static final class C8462d extends bp1 {

        /* renamed from: a */
        public final /* synthetic */ SwapFragment f42173a;

        public C8462d(SwapFragment swapFragment) {
            this.f42173a = swapFragment;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005a A[Catch:{ Exception -> 0x009a }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006f A[Catch:{ Exception -> 0x009a }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r8) {
            /*
                r7 = this;
                super.afterTextChanged(r8)
                net.safemoon.androidwallet.fragments.SwapFragment r0 = r7.f42173a     // Catch:{ Exception -> 0x009a }
                fe7 r0 = r0.f42160q1     // Catch:{ Exception -> 0x009a }
                r1 = 0
                java.lang.String r2 = "bindingSource"
                if (r0 != 0) goto L_0x0012
                p000.vx2.m53605u(r2)     // Catch:{ Exception -> 0x009a }
                r0 = r1
            L_0x0012:
                net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r0 = r0.f28840m     // Catch:{ Exception -> 0x009a }
                boolean r0 = r0.isFocused()     // Catch:{ Exception -> 0x009a }
                if (r0 == 0) goto L_0x009e
                net.safemoon.androidwallet.fragments.SwapFragment r0 = r7.f42173a     // Catch:{ Exception -> 0x009a }
                net.safemoon.androidwallet.viewmodels.SwapViewModel r0 = r0.mo57712g1()     // Catch:{ Exception -> 0x009a }
                k04 r0 = r0.mo61561G0()     // Catch:{ Exception -> 0x009a }
                net.safemoon.androidwallet.viewmodels.SwapViewModel$a r3 = new net.safemoon.androidwallet.viewmodels.SwapViewModel$a     // Catch:{ Exception -> 0x009a }
                r4 = 0
                r5 = 1
                if (r8 == 0) goto L_0x0042
                int r6 = r8.length()     // Catch:{ Exception -> 0x009a }
                if (r6 <= 0) goto L_0x0032
                r6 = r5
                goto L_0x0033
            L_0x0032:
                r6 = r4
            L_0x0033:
                if (r6 == 0) goto L_0x0042
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x009a }
                java.math.BigDecimal r8 = p000.ol0.m70331K(r8)     // Catch:{ Exception -> 0x009a }
                if (r8 != 0) goto L_0x0047
                java.math.BigDecimal r8 = java.math.BigDecimal.ZERO     // Catch:{ Exception -> 0x009a }
                goto L_0x0047
            L_0x0042:
                java.math.BigDecimal r8 = new java.math.BigDecimal     // Catch:{ Exception -> 0x009a }
                r8.<init>(r4)     // Catch:{ Exception -> 0x009a }
            L_0x0047:
                java.lang.String r6 = "if (s != null && s.isNot…                        }"
                p000.vx2.m53590f(r8, r6)     // Catch:{ Exception -> 0x009a }
                r3.<init>(r5, r8)     // Catch:{ Exception -> 0x009a }
                r0.postValue(r3)     // Catch:{ Exception -> 0x009a }
                net.safemoon.androidwallet.fragments.SwapFragment r8 = r7.f42173a     // Catch:{ Exception -> 0x009a }
                fe7 r8 = r8.f42160q1     // Catch:{ Exception -> 0x009a }
                if (r8 != 0) goto L_0x005e
                p000.vx2.m53605u(r2)     // Catch:{ Exception -> 0x009a }
                r8 = r1
            L_0x005e:
                net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r8 = r8.f28840m     // Catch:{ Exception -> 0x009a }
                android.text.Editable r8 = r8.getText()     // Catch:{ Exception -> 0x009a }
                if (r8 == 0) goto L_0x006c
                boolean r8 = p000.yb6.m74325B(r8)     // Catch:{ Exception -> 0x009a }
                if (r8 == 0) goto L_0x006d
            L_0x006c:
                r4 = r5
            L_0x006d:
                if (r4 != 0) goto L_0x009e
                net.safemoon.androidwallet.fragments.SwapFragment r8 = r7.f42173a     // Catch:{ Exception -> 0x009a }
                fe7 r8 = r8.f42160q1     // Catch:{ Exception -> 0x009a }
                if (r8 != 0) goto L_0x007b
                p000.vx2.m53605u(r2)     // Catch:{ Exception -> 0x009a }
                goto L_0x007c
            L_0x007b:
                r1 = r8
            L_0x007c:
                net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext r8 = r1.f28840m     // Catch:{ Exception -> 0x009a }
                android.text.Editable r8 = r8.getText()     // Catch:{ Exception -> 0x009a }
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x009a }
                double r0 = p000.ol0.m70330J(r8)     // Catch:{ Exception -> 0x009a }
                r2 = 0
                int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r8 <= 0) goto L_0x009e
                net.safemoon.androidwallet.fragments.SwapFragment r8 = r7.f42173a     // Catch:{ Exception -> 0x009a }
                android.content.Context r8 = r8.requireContext()     // Catch:{ Exception -> 0x009a }
                p000.a77.m55428f(r8)     // Catch:{ Exception -> 0x009a }
                goto L_0x009e
            L_0x009a:
                r8 = move-exception
                r8.printStackTrace()
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.SwapFragment.C8462d.afterTextChanged(android.text.Editable):void");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            boolean z;
            String obj;
            super.onTextChanged(charSequence, i, i2, i3);
            xa2 u0 = this.f42173a.f42150X;
            xa2 xa2 = null;
            if (u0 == null) {
                vx2.m53605u("binding");
                u0 = null;
            }
            u0.f35564b.setVisibility(8);
            fe7 w0 = this.f42173a.f42160q1;
            if (w0 == null) {
                vx2.m53605u("bindingSource");
                w0 = null;
            }
            Editable text = w0.f28840m.getText();
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
                xa2 u02 = this.f42173a.f42150X;
                if (u02 == null) {
                    vx2.m53605u("binding");
                    u02 = null;
                }
                u02.f35565c.setVisibility(0);
                xa2 u03 = this.f42173a.f42150X;
                if (u03 == null) {
                    vx2.m53605u("binding");
                    u03 = null;
                }
                u03.f35566d.setVisibility(8);
                xa2 u04 = this.f42173a.f42150X;
                if (u04 == null) {
                    vx2.m53605u("binding");
                } else {
                    xa2 = u04;
                }
                xa2.f35586x.setVisibility(8);
                return;
            }
            xa2 u05 = this.f42173a.f42150X;
            if (u05 == null) {
                vx2.m53605u("binding");
                u05 = null;
            }
            u05.f35565c.setVisibility(8);
            xa2 u06 = this.f42173a.f42150X;
            if (u06 == null) {
                vx2.m53605u("binding");
                u06 = null;
            }
            u06.f35566d.setVisibility(0);
            xa2 u07 = this.f42173a.f42150X;
            if (u07 == null) {
                vx2.m53605u("binding");
            } else {
                xa2 = u07;
            }
            xa2.f35586x.setVisibility(8);
        }
    }

    public SwapFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new SwapFragment$special$$inlined$viewModels$default$2(new SwapFragment$special$$inlined$viewModels$default$1(this)));
        this.f42152Z = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MultiWalletViewModel.class), new SwapFragment$special$$inlined$viewModels$default$3(b), new SwapFragment$special$$inlined$viewModels$default$4((pc2) null, b), new SwapFragment$special$$inlined$viewModels$default$5(this, b));
        this.f42154e0 = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SwapViewModel.class), new SwapFragment$special$$inlined$activityViewModels$default$4(this), new SwapFragment$special$$inlined$activityViewModels$default$5((pc2) null, this), new SwapFragment$special$$inlined$activityViewModels$default$6(this));
        this.f42157k0 = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MyTokensListViewModel.class), new SwapFragment$special$$inlined$activityViewModels$default$7(this), new SwapFragment$special$$inlined$activityViewModels$default$8((pc2) null, this), new SwapFragment$myTokenListViewModel$2(this));
        this.f42167v0 = ck0.m33065m(TokenType.POLYGON, TokenType.AVALANCHE_C, TokenType.SOLANA, TokenType.MULTI_COIN);
        this.f42153b1 = C6169a.m47232a(new SwapFragment$swapChains$2(this));
        this.f42155e1 = C6169a.m47232a(new SwapFragment$onSelectTokenTypeClickListener$2(this));
        this.f42158o1 = C6169a.m47232a(new SwapFragment$argDefaultSwapParam$2(this));
        this.f42159p1 = C6169a.m47232a(new SwapFragment$iHomeActivity$2(this));
        this.f42164s1 = ck0.m33062j();
        this.f42165t1 = bk0.m32598e("SAFEMOON");
    }

    /* renamed from: A1 */
    public static final void m67111A1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: B1 */
    public static final void m67114B1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: C1 */
    public static final void m67117C1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: D1 */
    public static final void m67120D1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: E1 */
    public static final void m67123E1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: F1 */
    public static final void m67126F1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "this$0");
        SwapSlipPage a = SwapSlipPage.f41794U.mo57304a();
        FragmentManager childFragmentManager = swapFragment.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        a.mo57303R(childFragmentManager);
    }

    /* renamed from: G1 */
    public static final void m67129G1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "this$0");
        SwapTransactionSpeed a = SwapTransactionSpeed.f41799X.mo57313a();
        FragmentManager childFragmentManager = swapFragment.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        a.mo57312I(childFragmentManager);
    }

    /* renamed from: H1 */
    public static final void m67132H1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "this$0");
        SwapTransactionTimeLimit a = SwapTransactionTimeLimit.f41807U.mo57318a();
        FragmentManager childFragmentManager = swapFragment.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        a.mo57317H(childFragmentManager);
    }

    /* renamed from: I1 */
    public static final void m67135I1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "this$0");
        swapFragment.mo57712g1().mo61560G();
    }

    /* renamed from: J1 */
    public static final void m67138J1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "this$0");
        eg1 a = eg1.f37537X.mo51466a(new SwapFragment$onViewCreated$24$1(swapFragment), (pc2<r37>) null);
        FragmentManager childFragmentManager = swapFragment.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        a.mo51465G(childFragmentManager);
    }

    /* renamed from: K1 */
    public static final void m67141K1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: L1 */
    public static final void m67144L1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: M1 */
    public static final void m67147M1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: N1 */
    public static final void m67150N1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "$this_run");
        swapFragment.mo57715l2(swapFragment.f42143H);
    }

    /* renamed from: O1 */
    public static final void m67153O1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "$this_run");
        swapFragment.mo57715l2(swapFragment.f42144I);
    }

    /* renamed from: P1 */
    public static final void m67156P1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "$this_run");
        swapFragment.mo57715l2(swapFragment.f42145L);
    }

    /* renamed from: Q1 */
    public static final void m67159Q1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "$this_run");
        swapFragment.mo57715l2(swapFragment.f42146M);
    }

    /* renamed from: R1 */
    public static final void m67162R1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "$this_run");
        a77.m55427e(swapFragment.requireActivity());
        swapFragment.mo57714k2(SelectCurrencyFragment.f42080A.mo57647a(SelectCurrencyFragment.SWAPPATH.Source), true);
    }

    /* renamed from: S1 */
    public static final void m67165S1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "$this_run");
        C9001np.m69961j0(new WeakReference(swapFragment.requireActivity()), R.string.hint_from_swap_estimate, R.string.ok);
    }

    /* renamed from: T1 */
    public static final void m67168T1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "$this_run");
        a77.m55427e(swapFragment.requireActivity());
        swapFragment.mo57714k2(SelectCurrencyFragment.f42080A.mo57647a(SelectCurrencyFragment.SWAPPATH.Destination), true);
    }

    /* renamed from: U1 */
    public static final void m67170U1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "$this_run");
        C9001np.m69961j0(new WeakReference(swapFragment.requireActivity()), R.string.hint_to_swap_estimate, R.string.ok);
    }

    /* renamed from: V0 */
    public static final void m67172V0(fe7 fe7, View view) {
        vx2.m53591g(fe7, "$this_run");
        fe7.f28840m.setText("");
    }

    /* renamed from: V1 */
    public static final void m67173V1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: W0 */
    public static final void m67175W0(fe7 fe7, View view) {
        vx2.m53591g(fe7, "$this_run");
        fe7.f28840m.setText("");
    }

    /* renamed from: W1 */
    public static final void m67176W1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: X1 */
    public static final void m67178X1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Y1 */
    public static final void m67180Y1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Z1 */
    public static final void m67182Z1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: a2 */
    public static final void m67184a2(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: b2 */
    public static final void m67186b2(SwapFragment swapFragment, View view) {
        T t;
        T t2;
        String str;
        String str2;
        vx2.m53591g(swapFragment, "this$0");
        Iterator<T> it = swapFragment.f42164s1.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            Object first = ((Pair) t2).getFirst();
            Swap value = swapFragment.mo57712g1().mo61553B0().getValue();
            if (value != null) {
                str2 = value.symbol;
            } else {
                str2 = null;
            }
            if (vx2.m53586b(first, str2)) {
                break;
            }
        }
        Pair pair = (Pair) t2;
        Iterator<T> it2 = swapFragment.f42164s1.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            Object first2 = ((Pair) next).getFirst();
            Swap value2 = swapFragment.mo57712g1().mo61604c0().getValue();
            if (value2 != null) {
                str = value2.symbol;
            } else {
                str = null;
            }
            if (vx2.m53586b(first2, str)) {
                t = next;
                break;
            }
        }
        Pair pair2 = (Pair) t;
        if (pair == null) {
            pair = pair2;
        }
        if (pair != null) {
            Double value3 = swapFragment.mo57712g1().mo61631x0().getValue();
            vx2.m53588d(value3);
            if (value3.doubleValue() < ((Number) pair.getSecond()).doubleValue()) {
                WeakReference weakReference = new WeakReference(swapFragment.requireActivity());
                String string = swapFragment.getString(R.string.dialog_alert_slip_title);
                vx2.m53590f(string, "getString(R.string.dialog_alert_slip_title)");
                String string2 = swapFragment.getString(R.string.dialog_alert_slip_desc);
                vx2.m53590f(string2, "getString(R.string.dialog_alert_slip_desc)");
                String string3 = swapFragment.getString(R.string.dialog_alert_slip_button);
                vx2.m53590f(string3, "getString(R.string.dialog_alert_slip_button)");
                cb6 cb6 = cb6.f21669a;
                String format = String.format("DO_NOT_SHOW_ALERT_%s", Arrays.copyOf(new Object[]{pair.getFirst()}, 1));
                vx2.m53590f(format, "format(format, *args)");
                C9001np.m69917D0(weakReference, string, string2, string3, format, new ig6());
                return;
            }
        }
        ConfirmSwapTransactionFragment a = ConfirmSwapTransactionFragment.f41721X.mo57185a();
        FragmentManager childFragmentManager = swapFragment.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        a.mo57182R(childFragmentManager);
    }

    /* renamed from: c2 */
    public static final void m67188c2(View view) {
    }

    /* renamed from: d2 */
    public static final void m67190d2(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: e2 */
    public static final void m67192e2(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: f2 */
    public static final void m67194f2(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: g2 */
    public static final void m67196g2(SwapFragment swapFragment) {
        SwapViewModel.C8786a value;
        vx2.m53591g(swapFragment, "this$0");
        if (swapFragment.getChildFragmentManager().mo5981k0(R.id.content_main) == null && (value = swapFragment.mo57712g1().mo61561G0().getValue()) != null) {
            fe7 fe7 = null;
            if (value.mo61635b()) {
                fe7 fe72 = swapFragment.f42160q1;
                if (fe72 == null) {
                    vx2.m53605u("bindingSource");
                } else {
                    fe7 = fe72;
                }
                fe7.f28840m.requestFocus();
                return;
            }
            fe7 fe73 = swapFragment.f42162r1;
            if (fe73 == null) {
                vx2.m53605u("bindingDestination");
            } else {
                fe7 = fe73;
            }
            fe7.f28840m.requestFocus();
        }
    }

    /* renamed from: h2 */
    public static final boolean m67198h2(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "this$0");
        C7047eg egVar = new C7047eg(swapFragment.mo57708c1());
        Context requireContext = swapFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53590f(view, "it");
        xa2 xa2 = swapFragment.f42150X;
        if (xa2 == null) {
            vx2.m53605u("binding");
            xa2 = null;
        }
        egVar.mo51463f(requireContext, view, xa2.f35582t);
        return true;
    }

    /* renamed from: i1 */
    public static final void m67200i1(fe7 fe7, boolean z) {
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

    /* renamed from: i2 */
    public static final void m67201i2(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "this$0");
        AnchorSwitchWallet anchorSwitchWallet = new AnchorSwitchWallet(swapFragment.mo57707b1(), R.id.navigation_swap);
        Context requireContext = swapFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53590f(view, "it");
        xa2 xa2 = swapFragment.f42150X;
        if (xa2 == null) {
            vx2.m53605u("binding");
            xa2 = null;
        }
        anchorSwitchWallet.mo57160h(requireContext, view, xa2.f35582t);
    }

    /* renamed from: j1 */
    public static final void m67203j1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: j2 */
    public static final void m67204j2(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: k1 */
    public static final void m67206k1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: l1 */
    public static final void m67208l1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: m2 */
    public static final void m67210m2(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: n1 */
    public static final void m67212n1(fe7 fe7, boolean z) {
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

    /* renamed from: o1 */
    public static final void m67214o1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: p1 */
    public static final void m67216p1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: q1 */
    public static final void m67218q1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: u1 */
    public static final void m67227u1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: v1 */
    public static final void m67230v1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: w1 */
    public static final void m67233w1(SwapFragment swapFragment, View view) {
        vx2.m53591g(swapFragment, "this$0");
        swapFragment.requireActivity().onBackPressed();
    }

    /* renamed from: x1 */
    public static final void m67236x1(SwapFragment swapFragment, View view) {
        fe7 fe7;
        T t;
        String str;
        vx2.m53591g(swapFragment, "this$0");
        Iterator<T> it = swapFragment.f42165t1.iterator();
        while (true) {
            fe7 = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            String str2 = (String) t;
            Swap value = swapFragment.mo57712g1().mo61553B0().getValue();
            if (value != null) {
                str = value.symbol;
            } else {
                str = null;
            }
            if (vx2.m53586b(str2, str)) {
                break;
            }
        }
        if (((String) t) == null) {
            SwapViewModel g1 = swapFragment.mo57712g1();
            fe7 fe72 = swapFragment.f42160q1;
            if (fe72 == null) {
                vx2.m53605u("bindingSource");
                fe72 = null;
            }
            fe7 fe73 = swapFragment.f42162r1;
            if (fe73 == null) {
                vx2.m53605u("bindingDestination");
            } else {
                fe7 = fe73;
            }
            g1.mo61601a1(fe72, fe7);
            return;
        }
        FragmentActivity requireActivity = swapFragment.requireActivity();
        vx2.m53590f(requireActivity, "requireActivity()");
        String string = swapFragment.getString(R.string.warning_cant_swap);
        vx2.m53590f(string, "getString(R.string.warning_cant_swap)");
        fy0.m57957f(requireActivity, (String) null, string, true, (DialogInterface.OnDismissListener) null);
    }

    /* renamed from: y1 */
    public static final void m67239y1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: z1 */
    public static final void m67242z1(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: U0 */
    public final void mo57702U0() {
        fe7 fe7 = this.f42160q1;
        fe7 fe72 = null;
        if (fe7 == null) {
            vx2.m53605u("bindingSource");
            fe7 = null;
        }
        fe7.f28834g.setOnClickListener(new gg6(fe7));
        fe7 fe73 = this.f42162r1;
        if (fe73 == null) {
            vx2.m53605u("bindingDestination");
        } else {
            fe72 = fe73;
        }
        fe72.f28834g.setOnClickListener(new hg6(fe72));
    }

    /* renamed from: X0 */
    public final void mo57703X0() {
        ProgressLoading progressLoading = this.f42166u1;
        if (progressLoading != null) {
            progressLoading.mo22266k();
        }
    }

    /* renamed from: Y0 */
    public final UserTokenItemDisplayModel mo57704Y0() {
        return (UserTokenItemDisplayModel) this.f42158o1.getValue();
    }

    /* renamed from: Z0 */
    public final HomeViewModel mo57705Z0() {
        return (HomeViewModel) this.f42151Y.getValue();
    }

    /* renamed from: a1 */
    public final ho2 mo57706a1() {
        return (ho2) this.f42159p1.getValue();
    }

    /* renamed from: b1 */
    public final MultiWalletViewModel mo57707b1() {
        return (MultiWalletViewModel) this.f42152Z.getValue();
    }

    /* renamed from: c1 */
    public final MyTokensListViewModel mo57708c1() {
        return (MyTokensListViewModel) this.f42157k0.getValue();
    }

    /* renamed from: d1 */
    public final SwapFragment$onSelectTokenTypeClickListener$2.C8463a mo57709d1() {
        return (SwapFragment$onSelectTokenTypeClickListener$2.C8463a) this.f42155e1.getValue();
    }

    /* renamed from: e1 */
    public final TokenType mo57710e1() {
        boolean z;
        Map<String, TokenType> f1 = mo57711f1();
        boolean z2 = true;
        if (!f1.isEmpty()) {
            Iterator<Map.Entry<String, TokenType>> it = f1.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object value = it.next().getValue();
                Context requireContext = requireContext();
                vx2.m53590f(requireContext, "requireContext()");
                if (value == ol0.m70355e(requireContext)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = false;
        if (!z2) {
            return TokenType.Companion.mo57098a("BNB");
        }
        Context requireContext2 = requireContext();
        vx2.m53590f(requireContext2, "requireContext()");
        return ol0.m70355e(requireContext2);
    }

    /* renamed from: f1 */
    public final Map<String, TokenType> mo57711f1() {
        return (Map) this.f42153b1.getValue();
    }

    /* renamed from: g1 */
    public final SwapViewModel mo57712g1() {
        return (SwapViewModel) this.f42154e0.getValue();
    }

    /* renamed from: h1 */
    public final void mo57713h1() {
        fe7 fe7 = this.f42162r1;
        if (fe7 == null) {
            vx2.m53605u("bindingDestination");
            fe7 = null;
        }
        fe7.f28840m.mo62167d(new ng6(fe7));
        LiveData<X> a = qw6.m25941a(mo57712g1().mo61604c0());
        vx2.m53590f(a, "Transformations.distinctUntilChanged(this)");
        a.observe(getViewLifecycleOwner(), new pg6(new SwapFragment$initDestination$2(this)));
        mo57712g1().mo61602b0().observe(getViewLifecycleOwner(), new qg6(new SwapFragment$initDestination$3(this)));
        mo57712g1().mo61605d0().observe(getViewLifecycleOwner(), new rg6(new SwapFragment$initDestination$4(this)));
    }

    /* renamed from: k2 */
    public final void mo57714k2(Fragment fragment, boolean z) {
        C0684j q = getChildFragmentManager().mo5996q();
        vx2.m53590f(q, "childFragmentManager.beginTransaction()");
        vx2.m53588d(fragment);
        q.mo6270s(R.id.content_main, fragment);
        if (z) {
            q.mo6267h((String) null);
        }
        q.mo6139j();
    }

    /* renamed from: l2 */
    public final void mo57715l2(float f) {
        boolean z;
        BigDecimal value = mo57712g1().mo61552A0().getValue();
        if (value != null) {
            fe7 fe7 = this.f42160q1;
            fe7 fe72 = null;
            if (fe7 == null) {
                vx2.m53605u("bindingSource");
                fe7 = null;
            }
            fe7.f28840m.requestFocus();
            a77.m55428f(requireContext());
            Swap value2 = mo57712g1().mo61553B0().getValue();
            vx2.m53588d(value2);
            Swap swap = value2;
            BigDecimal multiply = value.multiply(new BigDecimal(String.valueOf(f / ((float) this.f42161r))));
            if (swap.symbol.equals("BNB") || swap.symbol.equals("ETH")) {
                if (f == this.f42146M) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String string = getResources().getString(R.string.loading);
                    vx2.m53590f(string, "resources.getString(R.string.loading)");
                    String string2 = getResources().getString(R.string.please_wait);
                    vx2.m53590f(string2, "resources.getString(R.string.please_wait)");
                    mo57717n2(false, string, string2);
                    SwapViewModel g1 = mo57712g1();
                    vx2.m53590f(multiply, "balance");
                    j36 j36 = new j36();
                    ug3 viewLifecycleOwner = getViewLifecycleOwner();
                    vx2.m53590f(viewLifecycleOwner, "viewLifecycleOwner");
                    j36.observe(viewLifecycleOwner, new fg6(new SwapFragment$setPercentageValue$1$1$1(multiply, this)));
                    r37 r37 = r37.f33317a;
                    g1.mo61570L(multiply, j36);
                    return;
                }
                BigDecimal multiply2 = value.subtract(new BigDecimal(this.f42163s)).multiply(new BigDecimal(String.valueOf(f / ((float) this.f42161r))));
                if (multiply.compareTo(value) > 0) {
                    multiply = multiply2;
                }
                String j = ol0.m70365j(multiply.doubleValue());
                vx2.m53590f(j, "safetyMargin.toDouble().decimal8()");
                if (ol0.m70330J(j) > Utils.DOUBLE_EPSILON) {
                    fe7 fe73 = this.f42160q1;
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
                    String string3 = getResources().getString(R.string.swap_error_insufficient_balance);
                    vx2.m53590f(string3, "resources.getString(R.st…ror_insufficient_balance)");
                    ol0.m70348a0(activity, string3);
                    return;
                }
                return;
            }
            String j2 = ol0.m70365j(multiply.doubleValue());
            vx2.m53590f(j2, "balance.toDouble().decimal8()");
            if (ol0.m70330J(j2) > Utils.DOUBLE_EPSILON) {
                fe7 fe74 = this.f42160q1;
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
                String string4 = getResources().getString(R.string.swap_error_insufficient_balance);
                vx2.m53590f(string4, "resources.getString(R.st…ror_insufficient_balance)");
                ol0.m70348a0(activity2, string4);
            }
        }
    }

    /* renamed from: m1 */
    public final void mo57716m1() {
        fe7 fe7 = this.f42160q1;
        if (fe7 == null) {
            vx2.m53605u("bindingSource");
            fe7 = null;
        }
        fe7.f28840m.mo62167d(new jg6(fe7));
        LiveData<X> a = qw6.m25941a(mo57712g1().mo61553B0());
        vx2.m53590f(a, "Transformations.distinctUntilChanged(this)");
        a.observe(getViewLifecycleOwner(), new kg6(new SwapFragment$initSource$2(this)));
        mo57712g1().mo61552A0().observe(getViewLifecycleOwner(), new lg6(new SwapFragment$initSource$3(this)));
        mo57712g1().mo61554C0().observe(getViewLifecycleOwner(), new mg6(new SwapFragment$initSource$4(this)));
    }

    /* renamed from: n2 */
    public final void mo57717n2(boolean z, String str, String str2) {
        ProgressLoading progressLoading;
        ProgressLoading progressLoading2 = this.f42166u1;
        boolean z2 = true;
        if (progressLoading2 == null || !progressLoading2.isVisible()) {
            z2 = false;
        }
        if (z2 && (progressLoading = this.f42166u1) != null) {
            progressLoading.mo22266k();
        }
        ProgressLoading a = ProgressLoading.f41785Y.mo57297a(z, str, str2);
        this.f42166u1 = a;
        if (a != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            vx2.m53590f(childFragmentManager, "childFragmentManager");
            a.mo57295D(childFragmentManager);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        List<TokenType> list = this.f42167v0;
        Context requireContext = requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        if (list.contains(ol0.m70355e(requireContext))) {
            this.f42147P = false;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return LayoutInflater.from(requireContext()).inflate(R.layout.fragment_swap, viewGroup, false);
    }

    public void onDetach() {
        super.onDetach();
        try {
            mo57712g1().mo61614j1();
            if (mo57712g1().mo61619m0().getValue() == LoadingState.Normal) {
                mo57712g1().mo61562H();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        int i;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        xa2 a = xa2.m54332a(view);
        vx2.m53590f(a, "bind(view)");
        this.f42150X = a;
        SwapViewModel g1 = mo57712g1();
        ug3 viewLifecycleOwner = getViewLifecycleOwner();
        vx2.m53590f(viewLifecycleOwner, "viewLifecycleOwner");
        g1.mo61603b1(viewLifecycleOwner);
        xa2 xa2 = null;
        mo57712g1().mo61573M0().postValue(null);
        mo57712g1().mo61561G0().postValue(null);
        k04<Double> O = mo57712g1().mo61576O();
        Double valueOf = Double.valueOf(Utils.DOUBLE_EPSILON);
        O.postValue(valueOf);
        mo57712g1().mo61574N().postValue(valueOf);
        Wallet.Companion companion = Wallet.Companion;
        String j = f06.m57519j(getContext(), "SAFEMOON_ACTIVE_WALLET", "");
        vx2.m53590f(j, "getString(\n             …         \"\"\n            )");
        Wallet wallet2 = companion.toWallet(j);
        if (wallet2 != null) {
            str = wallet2.displayName();
        } else {
            str = null;
        }
        xa2 xa22 = this.f42150X;
        if (xa22 == null) {
            vx2.m53605u("binding");
            xa22 = null;
        }
        xa22.f35558A.setText(str);
        k04 k04 = new k04();
        mo57708c1().mo61293E().observe(getViewLifecycleOwner(), new we6(new SwapFragment$onViewCreated$1(k04)));
        mo57712g1().mo61600a0().observe(getViewLifecycleOwner(), new ye6(new SwapFragment$onViewCreated$2(k04, this)));
        k04.observe(getViewLifecycleOwner(), new kf6(new SwapFragment$onViewCreated$3(this)));
        k04<SwapViewModel.C8788c> a0 = mo57712g1().mo61600a0();
        SwapViewModel.C8788c value = mo57712g1().mo61600a0().getValue();
        if (value != null) {
            value.mo61640b(mo57710e1());
        } else {
            value = null;
        }
        a0.postValue(value);
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getWindow().addFlags(Integer.MIN_VALUE);
        requireActivity.getWindow().setStatusBarColor(zr0.m31440c(requireActivity, 17170445));
        requireActivity.getWindow().setBackgroundDrawableResource(R.drawable.bottom_curve);
        xa2 xa23 = this.f42150X;
        if (xa23 == null) {
            vx2.m53605u("binding");
            xa23 = null;
        }
        fe7 a2 = fe7.m44306a(xa23.f35570h.findViewById(R.id.parent));
        vx2.m53590f(a2, "bind(binding.ccSource.findViewById(R.id.parent))");
        this.f42160q1 = a2;
        xa2 xa24 = this.f42150X;
        if (xa24 == null) {
            vx2.m53605u("binding");
            xa24 = null;
        }
        fe7 a3 = fe7.m44306a(xa24.f35569g.findViewById(R.id.parent));
        vx2.m53590f(a3, "bind(binding.ccDestinati…indViewById(R.id.parent))");
        this.f42162r1 = a3;
        fe7 fe7 = this.f42160q1;
        if (fe7 == null) {
            vx2.m53605u("bindingSource");
            fe7 = null;
        }
        fe7.f28840m.setText("");
        fe7 fe72 = this.f42162r1;
        if (fe72 == null) {
            vx2.m53605u("bindingDestination");
            fe72 = null;
        }
        fe72.f28840m.setText("");
        xa2 xa25 = this.f42150X;
        if (xa25 == null) {
            vx2.m53605u("binding");
            xa25 = null;
        }
        xa25.f35581s.f21727b.setOnClickListener(mo57709d1());
        xa2 xa26 = this.f42150X;
        if (xa26 == null) {
            vx2.m53605u("binding");
            xa26 = null;
        }
        MaterialTextView materialTextView = xa26.f35559B;
        vx2.m53590f(materialTextView, "binding.tvTotal");
        ol0.m70343W(materialTextView, new SwapFragment$onViewCreated$7(this));
        xa2 xa27 = this.f42150X;
        if (xa27 == null) {
            vx2.m53605u("binding");
            xa27 = null;
        }
        xa27.f35559B.setOnLongClickListener(new wf6(this));
        xa2 xa28 = this.f42150X;
        if (xa28 == null) {
            vx2.m53605u("binding");
            xa28 = null;
        }
        xa28.f35558A.setOnClickListener(new yf6(this));
        mo57708c1().mo61295G().observe(getViewLifecycleOwner(), new zf6(new SwapFragment$onViewCreated$10(this)));
        mo57712g1().mo61559F0().observe(getViewLifecycleOwner(), new ag6(new SwapFragment$onViewCreated$11(this)));
        xa2 xa29 = this.f42150X;
        if (xa29 == null) {
            vx2.m53605u("binding");
            xa29 = null;
        }
        AppCompatImageView appCompatImageView = xa29.f35580r;
        vx2.m53590f(appCompatImageView, "binding.ivBack");
        g06 g06 = g06.f37938a;
        Context requireContext = requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        if (g06.mo51833b(requireContext) != R.id.navigation_swap) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        appCompatImageView.setVisibility(i);
        xa2 xa210 = this.f42150X;
        if (xa210 == null) {
            vx2.m53605u("binding");
            xa210 = null;
        }
        xa210.f35580r.setOnClickListener(new bg6(this));
        mo57716m1();
        mo57713h1();
        xa2 xa211 = this.f42150X;
        if (xa211 == null) {
            vx2.m53605u("binding");
            xa211 = null;
        }
        xa211.f35579q.setOnClickListener(new cg6(this));
        mo57712g1().mo61630w0().observe(getViewLifecycleOwner(), new eg6(new SwapFragment$onViewCreated$14(this)));
        xa2 xa212 = this.f42150X;
        if (xa212 == null) {
            vx2.m53605u("binding");
            xa212 = null;
        }
        TextView textView = (TextView) xa212.mo49440b().findViewById(R.id.textScreenName);
        if (textView != null) {
            ol0.m70341U(textView);
            r37 r37 = r37.f33317a;
        }
        mo57712g1().mo61631x0().observe(getViewLifecycleOwner(), new hf6(new SwapFragment$onViewCreated$15(this)));
        mo57712g1().mo61613j0().observe(getViewLifecycleOwner(), new sf6(new SwapFragment$onViewCreated$16(this)));
        mo57712g1().mo61598Z().observe(getViewLifecycleOwner(), new dg6(new SwapFragment$onViewCreated$17(this)));
        mo57712g1().mo61571L0().observe(getViewLifecycleOwner(), new og6(new SwapFragment$onViewCreated$18(this)));
        mo57712g1().mo61569K0().observe(getViewLifecycleOwner(), new sg6(new SwapFragment$onViewCreated$19(this)));
        xa2 xa213 = this.f42150X;
        if (xa213 == null) {
            vx2.m53605u("binding");
            xa213 = null;
        }
        xa213.f35575m.setOnClickListener(new tg6(this));
        xa2 xa214 = this.f42150X;
        if (xa214 == null) {
            vx2.m53605u("binding");
            xa214 = null;
        }
        xa214.f35576n.setOnClickListener(new ug6(this));
        xa2 xa215 = this.f42150X;
        if (xa215 == null) {
            vx2.m53605u("binding");
            xa215 = null;
        }
        xa215.f35574l.setOnClickListener(new vg6(this));
        xa2 xa216 = this.f42150X;
        if (xa216 == null) {
            vx2.m53605u("binding");
            xa216 = null;
        }
        xa216.f35564b.setOnClickListener(new wg6(this));
        xa2 xa217 = this.f42150X;
        if (xa217 == null) {
            vx2.m53605u("binding");
            xa217 = null;
        }
        xa217.f35567e.setOnClickListener(new xe6(this));
        mo57712g1().mo61627t0().observe(getViewLifecycleOwner(), new ze6(new SwapFragment$onViewCreated$25(this)));
        mo57712g1().mo61578P().observe(getViewLifecycleOwner(), new af6(new SwapFragment$onViewCreated$26(this)));
        fe7 fe73 = this.f42160q1;
        if (fe73 == null) {
            vx2.m53605u("bindingSource");
            fe73 = null;
        }
        fe73.f28830c.setOnClickListener(new bf6(this));
        fe73.f28831d.setOnClickListener(new cf6(this));
        fe73.f28832e.setOnClickListener(new df6(this));
        fe73.f28833f.setOnClickListener(new ef6(this));
        fe73.f28835h.setOnClickListener(new ff6(this));
        fe73.f28840m.setFilters(new InputFilter[]{new xu2(valueOf, Double.valueOf(Double.MAX_VALUE))});
        AutofitEdittext autofitEdittext = fe73.f28840m;
        Common common = Common.f42577a;
        autofitEdittext.setHint(getString(R.string.hint_0, Character.valueOf(common.mo60892B())));
        fe73.f28838k.setOnClickListener(new gf6(this));
        fe7 fe74 = this.f42162r1;
        if (fe74 == null) {
            vx2.m53605u("bindingDestination");
            fe74 = null;
        }
        fe74.f28830c.setVisibility(4);
        fe74.f28831d.setVisibility(4);
        fe74.f28832e.setVisibility(4);
        fe74.f28833f.setVisibility(4);
        fe74.f28835h.setOnClickListener(new if6(this));
        fe74.f28840m.setFilters(new InputFilter[]{new xu2(valueOf, Double.valueOf(Double.MAX_VALUE))});
        fe74.f28840m.setHint(getString(R.string.hint_0, Character.valueOf(common.mo60892B())));
        fe74.f28838k.setOnClickListener(new jf6(this));
        mo57712g1().mo61561G0().observe(getViewLifecycleOwner(), new lf6(new SwapFragment$onViewCreated$29(this)));
        mo57712g1().mo61576O().observe(getViewLifecycleOwner(), new mf6(new SwapFragment$onViewCreated$30(this)));
        mo57712g1().mo61628u0().observe(getViewLifecycleOwner(), new nf6(new SwapFragment$onViewCreated$31(this)));
        mo57712g1().mo61574N().observe(getViewLifecycleOwner(), new of6(new SwapFragment$onViewCreated$32(this)));
        mo57712g1().mo61588U().observe(getViewLifecycleOwner(), new pf6(new SwapFragment$onViewCreated$33(this)));
        mo57712g1().mo61619m0().observe(getViewLifecycleOwner(), new qf6(new SwapFragment$onViewCreated$34(this)));
        mo57702U0();
        vo6 vo6 = new vo6(new C8462d(this), this.f42156k);
        vo6 vo62 = new vo6(new C8461c(this), this.f42156k);
        fe7 fe75 = this.f42160q1;
        if (fe75 == null) {
            vx2.m53605u("bindingSource");
            fe75 = null;
        }
        AutofitEdittext autofitEdittext2 = fe75.f28840m;
        autofitEdittext2.setEnabled(true);
        autofitEdittext2.setFocusableInTouchMode(true);
        autofitEdittext2.setFocusable(true);
        fe7 fe76 = this.f42160q1;
        if (fe76 == null) {
            vx2.m53605u("bindingSource");
            fe76 = null;
        }
        AutofitEdittext autofitEdittext3 = fe76.f28840m;
        fe7 fe77 = this.f42160q1;
        if (fe77 == null) {
            vx2.m53605u("bindingSource");
            fe77 = null;
        }
        AutofitEdittext autofitEdittext4 = fe77.f28840m;
        vx2.m53590f(autofitEdittext4, "bindingSource.newValue");
        autofitEdittext3.addTextChangedListener(new nc4(autofitEdittext4));
        fe7 fe78 = this.f42160q1;
        if (fe78 == null) {
            vx2.m53605u("bindingSource");
            fe78 = null;
        }
        fe78.f28840m.addTextChangedListener(vo6);
        fe7 fe79 = this.f42162r1;
        if (fe79 == null) {
            vx2.m53605u("bindingDestination");
            fe79 = null;
        }
        AutofitEdittext autofitEdittext5 = fe79.f28840m;
        fe7 fe710 = this.f42162r1;
        if (fe710 == null) {
            vx2.m53605u("bindingDestination");
            fe710 = null;
        }
        AutofitEdittext autofitEdittext6 = fe710.f28840m;
        vx2.m53590f(autofitEdittext6, "bindingDestination.newValue");
        autofitEdittext5.addTextChangedListener(new nc4(autofitEdittext6));
        fe7 fe711 = this.f42162r1;
        if (fe711 == null) {
            vx2.m53605u("bindingDestination");
            fe711 = null;
        }
        fe711.f28840m.addTextChangedListener(vo62);
        xa2 xa218 = this.f42150X;
        if (xa218 == null) {
            vx2.m53605u("binding");
        } else {
            xa2 = xa218;
        }
        xa2.f35566d.setOnClickListener(new rf6(this));
        mo57712g1().mo61573M0().observe(getViewLifecycleOwner(), new tf6(new SwapFragment$onViewCreated$38(this)));
        mo57712g1().mo61582R().observe(getViewLifecycleOwner(), new uf6(new SwapFragment$onViewCreated$39(this)));
        ho0.m58585b(mo57712g1().mo61610h0()).observe(getViewLifecycleOwner(), new vf6(new SwapFragment$onViewCreated$40(this)));
        getChildFragmentManager().mo5983l(new xf6(this));
    }

    /* renamed from: r1 */
    public final void mo57718r1(boolean z) {
        boolean z2 = !z;
        xa2 xa2 = this.f42150X;
        fe7 fe7 = null;
        if (xa2 == null) {
            vx2.m53605u("binding");
            xa2 = null;
        }
        xa2.f35579q.setEnabled(z2);
        xa2 xa22 = this.f42150X;
        if (xa22 == null) {
            vx2.m53605u("binding");
            xa22 = null;
        }
        xa22.f35575m.setEnabled(z2);
        xa2 xa23 = this.f42150X;
        if (xa23 == null) {
            vx2.m53605u("binding");
            xa23 = null;
        }
        xa23.f35576n.setEnabled(z2);
        xa2 xa24 = this.f42150X;
        if (xa24 == null) {
            vx2.m53605u("binding");
            xa24 = null;
        }
        xa24.f35574l.setEnabled(z2);
        fe7 fe72 = this.f42160q1;
        if (fe72 == null) {
            vx2.m53605u("bindingSource");
            fe72 = null;
        }
        fe72.f28835h.setEnabled(z2);
        fe7 fe73 = this.f42162r1;
        if (fe73 == null) {
            vx2.m53605u("bindingDestination");
        } else {
            fe7 = fe73;
        }
        fe7.f28835h.setEnabled(z2);
    }

    /* renamed from: s1 */
    public final void mo57719s1(boolean z) {
        boolean z2 = !z;
        mo57718r1(z);
        fe7 fe7 = this.f42160q1;
        if (fe7 == null) {
            vx2.m53605u("bindingSource");
            fe7 = null;
        }
        fe7.f28840m.setEnabled(z2);
        fe7.f28830c.setEnabled(z2);
        fe7.f28831d.setEnabled(z2);
        fe7.f28832e.setEnabled(z2);
        fe7.f28833f.setEnabled(z2);
    }

    /* renamed from: t1 */
    public final void mo57720t1() {
        Integer num;
        TokenType a;
        Swap value = mo57712g1().mo61553B0().getValue();
        Swap value2 = mo57712g1().mo61604c0().getValue();
        SwapViewModel.C8788c value3 = mo57712g1().mo61600a0().getValue();
        if (value3 == null || (a = value3.mo61639a()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(a.getChainId());
        }
        if (value == null || value2 == null || !vx2.m53586b(value.chainId, num) || !vx2.m53586b(value2.chainId, num) || vx2.m53586b(value.symbol, value2.symbol)) {
            mo57712g1().mo61631x0().setValue(Double.valueOf(f42139w1));
            return;
        }
        double B = ol0.m70322B(wy6.m54142a(value, value2));
        double d = f42139w1;
        if (B > d) {
            mo57712g1().mo61631x0().setValue(Double.valueOf(B));
            if (f06.m57514e(requireContext(), "SWAP_PAIR_DONT_SHOW_ME", true)) {
                try {
                    if (!isVisible()) {
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                SwapAutoSlippage a2 = SwapAutoSlippage.f41790U.mo57301a();
                FragmentManager childFragmentManager = getChildFragmentManager();
                vx2.m53590f(childFragmentManager, "childFragmentManager");
                a2.mo57300G(childFragmentManager);
                return;
            }
            return;
        }
        mo57712g1().mo61631x0().setValue(Double.valueOf(d));
    }
}
