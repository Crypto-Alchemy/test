package net.safemoon.androidwallet.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.transaction.details.TransactionDetailsData;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.TransferViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b3\u00104J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0003J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u0014\u0010\u001a\u001a\u00020\u00128\u0002XD¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00128\u0002XD¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001b\u0010!\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u00101¨\u00066"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/TransferNotificationDetailsFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "onResume", "D", "Lnet/safemoon/androidwallet/model/transaction/details/TransactionDetailsData;", "details", "J", "", "receiptStatus", "H", "", "isClickable", "I", "k", "Ljava/lang/String;", "STATUS_0", "r", "STATUS_1", "s", "Lef3;", "B", "()Z", "newTransaction", "Lnet/safemoon/androidwallet/viewmodels/TransferViewModel;", "x", "C", "()Lnet/safemoon/androidwallet/viewmodels/TransferViewModel;", "transferViewModel", "Lcb2;", "y", "Lcb2;", "mBinding", "Ldw6;", "A", "Ldw6;", "detailsViewModel", "", "Lnet/safemoon/androidwallet/common/TokenType;", "Ljava/util/List;", "estimateGasTokenOnNewTransactionDepended", "<init>", "()V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TransferNotificationDetailsFragment.kt */
public final class TransferNotificationDetailsFragment extends BaseMainFragment {

    /* renamed from: C */
    public static final C8507a f42267C = new C8507a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public dw6 f42268A;

    /* renamed from: B */
    public final List<TokenType> f42269B = ck0.m33065m(TokenType.MULTI_COIN_BITCOIN, TokenType.MULTI_COIN_DOGE);

    /* renamed from: k */
    public final String f42270k = "0";

    /* renamed from: r */
    public final String f42271r = "1";

    /* renamed from: s */
    public final ef3 f42272s = C6169a.m47232a(new TransferNotificationDetailsFragment$newTransaction$2(this));

    /* renamed from: x */
    public final ef3 f42273x = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(TransferViewModel.class), new C8508x77f26372(this), new C8509x77f26373((pc2) null, this), new C8510x77f26374(this));

    /* renamed from: y */
    public cb2 f42274y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/TransferNotificationDetailsFragment$a;", "", "", "ARG_NEW_TRANSACTION", "Ljava/lang/String;", "BUNDLE_EXTRA_TRANSACTION_HASH", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.TransferNotificationDetailsFragment$a */
    /* compiled from: TransferNotificationDetailsFragment.kt */
    public static final class C8507a {
        public C8507a() {
        }

        public /* synthetic */ C8507a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: E */
    public static final void m67619E(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: F */
    public static final void m67620F(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: G */
    public static final void m67621G(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: K */
    public static final void m67622K(TransferNotificationDetailsFragment transferNotificationDetailsFragment, String str, TransactionDetailsData transactionDetailsData, View view) {
        vx2.m53591g(transferNotificationDetailsFragment, "this$0");
        vx2.m53591g(str, "$link");
        vx2.m53591g(transactionDetailsData, "$details");
        transferNotificationDetailsFragment.mo57924I(false);
        String hash = transactionDetailsData.getHash();
        transferNotificationDetailsFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str + hash)));
    }

    /* renamed from: L */
    public static final void m67623L(TransferNotificationDetailsFragment transferNotificationDetailsFragment, View view) {
        vx2.m53591g(transferNotificationDetailsFragment, "this$0");
        transferNotificationDetailsFragment.mo50752i();
    }

    /* renamed from: B */
    public final boolean mo57920B() {
        return ((Boolean) this.f42272s.getValue()).booleanValue();
    }

    /* renamed from: C */
    public final TransferViewModel mo57921C() {
        return (TransferViewModel) this.f42273x.getValue();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: D */
    public final void mo57922D() {
        mo57921C().mo61761j().postValue(null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dw6 dw6 = this.f42268A;
        vx2.m53588d(dw6);
        dw6.mo51295c().observe(getViewLifecycleOwner(), new yv6(new TransferNotificationDetailsFragment$observeViewModel$1(this, ref$ObjectRef)));
        mo57921C().mo61761j().observe(getViewLifecycleOwner(), new zv6(new TransferNotificationDetailsFragment$observeViewModel$2(ref$ObjectRef, this)));
    }

    /* renamed from: H */
    public final void mo57923H(String str) {
        cb2 cb2 = this.f42274y;
        if (cb2 == null) {
            return;
        }
        if (vx2.m53586b(str, this.f42271r)) {
            cb2.f21656d.setColorFilter(zr0.m31440c(requireContext(), R.color.green));
            cb2.f21667o.setText(R.string.transfer_confirmed);
        } else if (vx2.m53586b(str, this.f42270k)) {
            cb2.f21656d.setColorFilter(zr0.m31440c(requireContext(), R.color.red));
            cb2.f21667o.setText(R.string.transfer_failed);
        } else {
            cb2.f21656d.setColorFilter(zr0.m31440c(requireContext(), R.color.yellow));
            cb2.f21667o.setText(R.string.transfer_pending);
        }
    }

    /* renamed from: I */
    public final void mo57924I(boolean z) {
        cb2 cb2 = this.f42274y;
        if (cb2 != null) {
            vx2.m53588d(cb2);
            cb2.f21660h.setClickable(z);
        }
    }

    /* renamed from: J */
    public final void mo57925J(TransactionDetailsData transactionDetailsData) {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        int i;
        String str4;
        if (getActivity() != null) {
            if (!mo57920B()) {
                if (transactionDetailsData.getStatus()) {
                    str4 = this.f42271r;
                } else {
                    str4 = this.f42270k;
                }
                mo57923H(str4);
            }
            TokenType.C8246a aVar = TokenType.Companion;
            TokenType c = aVar.mo57100c(transactionDetailsData.getChain());
            Context requireContext = requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            Wallet c2 = ol0.m70351c(requireContext);
            ConstraintLayout constraintLayout = null;
            if (c2 != null) {
                str = c2.getAddress(c.getCoinType().getValue());
            } else {
                str = null;
            }
            if (str != null) {
                Locale locale = Locale.ROOT;
                vx2.m53590f(locale, "ROOT");
                str2 = str.toLowerCase(locale);
                vx2.m53590f(str2, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            String to = transactionDetailsData.getTo();
            Locale locale2 = Locale.ROOT;
            vx2.m53590f(locale2, "ROOT");
            String lowerCase = to.toLowerCase(locale2);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (vx2.m53586b(str2, lowerCase)) {
                str3 = getString(R.string.tx_received);
                vx2.m53590f(str3, "getString(R.string.tx_received)");
                cb2 cb2 = this.f42274y;
                vx2.m53588d(cb2);
                cb2.f21665m.setText(getString(R.string.tx_from) + " " + transactionDetailsData.getFrom());
            } else {
                str3 = getString(R.string.tx_sent);
                vx2.m53590f(str3, "getString(R.string.tx_sent)");
                cb2 cb22 = this.f42274y;
                vx2.m53588d(cb22);
                cb22.f21665m.setText(getString(R.string.tx_to) + " " + transactionDetailsData.getTo());
            }
            cb2 cb23 = this.f42274y;
            vx2.m53588d(cb23);
            cb23.f21664l.setText(str3);
            cb2 cb24 = this.f42274y;
            vx2.m53588d(cb24);
            cb24.f21666n.setText(getString(R.string.tx_total) + " " + ol0.m70374p(transactionDetailsData.getAmount(), 0, (RoundingMode) null, false, 6, (Object) null) + " " + transactionDetailsData.getTokenSymbol());
            if (!this.f42269B.contains(aVar.mo57100c(transactionDetailsData.getChain()))) {
                cb2 cb25 = this.f42274y;
                if (cb25 != null) {
                    constraintLayout = cb25.f21654b;
                }
                if (constraintLayout != null) {
                    if (transactionDetailsData.getGasUsed().length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || vx2.m53586b(transactionDetailsData.getGasUsed(), "0")) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    constraintLayout.setVisibility(i);
                }
                cb2 cb26 = this.f42274y;
                vx2.m53588d(cb26);
                cb26.f21663k.setText(getString(R.string.tx_network_fee) + " " + transactionDetailsData.getGasUsed() + " " + c.getNativeToken());
            }
            Common common = Common.f42577a;
            Date z3 = common.mo60919z(transactionDetailsData.getCreatedAt());
            if (z3 != null) {
                cb2 cb27 = this.f42274y;
                vx2.m53588d(cb27);
                TextView textView = cb27.f21661i;
                Context requireContext2 = requireContext();
                vx2.m53590f(requireContext2, "requireContext()");
                textView.setText(common.mo60899e(z3, requireContext2));
            }
            String r = common.mo60911r(c);
            cb2 cb28 = this.f42274y;
            vx2.m53588d(cb28);
            TextView textView2 = cb28.f21660h;
            cb6 cb6 = cb6.f21669a;
            Locale locale3 = Locale.getDefault();
            String string = getString(R.string.view_transaction_on_bsc);
            vx2.m53590f(string, "getString(R.string.view_transaction_on_bsc)");
            String format = String.format(locale3, string, Arrays.copyOf(new Object[]{c.getPlaneName()}, 1));
            vx2.m53590f(format, "format(locale, format, *args)");
            textView2.setText(format);
            cb2 cb29 = this.f42274y;
            vx2.m53588d(cb29);
            cb29.f21660h.setOnClickListener(new bw6(this, r, transactionDetailsData));
            cb2 cb210 = this.f42274y;
            vx2.m53588d(cb210);
            cb210.f21659g.f21125c.setOnClickListener(new cw6(this));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        this.f42274y = cb2.m32892a(layoutInflater.inflate(R.layout.fragment_transaction_notification_details, viewGroup, false));
        dw6 dw6 = (dw6) new zt6().mo6370a(dw6.class);
        this.f42268A = dw6;
        vx2.m53588d(dw6);
        String string = requireArguments().getString("transactionHash");
        vx2.m53588d(string);
        dw6.mo51294b(string);
        cb2 cb2 = this.f42274y;
        vx2.m53588d(cb2);
        cb2.f21659g.f21127e.setText(getText(R.string.Transfer_detail));
        mo57922D();
        cb2 cb22 = this.f42274y;
        vx2.m53588d(cb22);
        ConstraintLayout b = cb22.mo29913b();
        vx2.m53590f(b, "mBinding!!.root");
        return b;
    }

    public void onResume() {
        super.onResume();
        mo57924I(true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        mo57921C().mo61762k().postValue(null);
        mo57921C().mo61762k().observe(getViewLifecycleOwner(), new aw6(new TransferNotificationDetailsFragment$onViewCreated$1(this)));
    }
}
