package net.safemoon.androidwallet.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentViewModelLazyKt;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.viewmodels.TransferViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\bB\u0010CJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u001c\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u0014\u0010 \u001a\u00020\u001d8\u0002XD¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00168\u0002XD¢\u0006\u0006\n\u0004\b+\u0010,R#\u00102\u001a\n .*\u0004\u0018\u00010\u000e0\u000e8BX\u0002¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u00106R\u001d\u0010;\u001a\u0004\u0018\u00010\u00128BX\u0002¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b<\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u0002030?8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010@¨\u0006E"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/TransferDetailsFragmentStatus;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "onResume", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "details", "newTranaction", "M", "", "receiptStatus", "K", "contractAddress", "", "chainId", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "G", "", "isClickable", "L", "", "k", "J", "TIME_MUL", "Lcb2;", "r", "Lcb2;", "mBinding", "Lnet/safemoon/androidwallet/viewmodels/TransferViewModel;", "s", "Lef3;", "H", "()Lnet/safemoon/androidwallet/viewmodels/TransferViewModel;", "transferViewModel", "x", "I", "DECIMA", "kotlin.jvm.PlatformType", "y", "F", "()Lnet/safemoon/androidwallet/model/transaction/history/Result;", "requestTransaction", "Lnet/safemoon/androidwallet/common/TokenType;", "A", "D", "()Lnet/safemoon/androidwallet/common/TokenType;", "chainType", "B", "C", "()Ljava/lang/String;", "address", "E", "()Z", "newTransaction", "", "Ljava/util/List;", "excludeForAddress", "<init>", "()V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TransferDetailsFragmentStatus.kt */
public final class TransferDetailsFragmentStatus extends BaseMainFragment {

    /* renamed from: I */
    public static final C8490a f42239I = new C8490a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f42240A = C6169a.m47232a(new TransferDetailsFragmentStatus$chainType$2(this));

    /* renamed from: B */
    public final ef3 f42241B = C6169a.m47232a(new TransferDetailsFragmentStatus$address$2(this));

    /* renamed from: C */
    public final ef3 f42242C = C6169a.m47232a(new TransferDetailsFragmentStatus$newTransaction$2(this));

    /* renamed from: H */
    public final List<TokenType> f42243H = ck0.m33065m(TokenType.MULTI_COIN_BITCOIN, TokenType.MULTI_COIN_DOGE);

    /* renamed from: k */
    public final long f42244k = 1000;

    /* renamed from: r */
    public cb2 f42245r;

    /* renamed from: s */
    public final ef3 f42246s = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(TransferViewModel.class), new C8491x9633cf6f(this), new C8492x9633cf70((pc2) null, this), new C8493x9633cf71(this));

    /* renamed from: x */
    public final int f42247x = 18;

    /* renamed from: y */
    public final ef3 f42248y = C6169a.m47232a(new TransferDetailsFragmentStatus$requestTransaction$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/TransferDetailsFragmentStatus$a;", "", "", "ARG_CHAIN", "Ljava/lang/String;", "ARG_NEW_TRANSACTION", "ARG_RECEIPT", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.TransferDetailsFragmentStatus$a */
    /* compiled from: TransferDetailsFragmentStatus.kt */
    public static final class C8490a {
        public C8490a() {
        }

        public /* synthetic */ C8490a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: I */
    public static final void m67503I(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: J */
    public static final void m67504J(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: N */
    public static /* synthetic */ void m67505N(TransferDetailsFragmentStatus transferDetailsFragmentStatus, Result result, Result result2, int i, Object obj) {
        if ((i & 2) != 0) {
            result2 = null;
        }
        transferDetailsFragmentStatus.mo57876M(result, result2);
    }

    /* renamed from: O */
    public static final void m67506O(TransferDetailsFragmentStatus transferDetailsFragmentStatus, View view) {
        vx2.m53591g(transferDetailsFragmentStatus, "this$0");
        transferDetailsFragmentStatus.mo50752i();
    }

    /* renamed from: P */
    public static final void m67507P(TransferDetailsFragmentStatus transferDetailsFragmentStatus, String str, Result result, View view) {
        vx2.m53591g(transferDetailsFragmentStatus, "this$0");
        vx2.m53591g(str, "$link");
        vx2.m53591g(result, "$details");
        transferDetailsFragmentStatus.mo57875L(false);
        String str2 = result.hash;
        transferDetailsFragmentStatus.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str + str2)));
    }

    /* renamed from: C */
    public final String mo57868C() {
        return (String) this.f42241B.getValue();
    }

    /* renamed from: D */
    public final TokenType mo57869D() {
        return (TokenType) this.f42240A.getValue();
    }

    /* renamed from: E */
    public final boolean mo57870E() {
        return ((Boolean) this.f42242C.getValue()).booleanValue();
    }

    /* renamed from: F */
    public final Result mo57871F() {
        return (Result) this.f42248y.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: net.safemoon.androidwallet.model.token.abstraction.IToken} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: net.safemoon.androidwallet.model.token.abstraction.IToken} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: net.safemoon.androidwallet.model.token.abstraction.IToken} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: net.safemoon.androidwallet.model.token.abstraction.IToken} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final net.safemoon.androidwallet.model.token.abstraction.IToken mo57872G(java.lang.String r8, int r9) {
        /*
            r7 = this;
            net.safemoon.androidwallet.viewmodels.TransferViewModel r0 = r7.mo57873H()
            k04 r0 = r0.mo61756e()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            r3 = r2
            net.safemoon.androidwallet.model.token.abstraction.IToken r3 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r3
            java.lang.String r4 = r3.getContractAddress()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r6 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            p000.vx2.m53590f(r4, r6)
            if (r8 == 0) goto L_0x003b
            java.lang.String r5 = r8.toLowerCase(r5)
            p000.vx2.m53590f(r5, r6)
            goto L_0x003c
        L_0x003b:
            r5 = r1
        L_0x003c:
            boolean r4 = p000.vx2.m53586b(r4, r5)
            if (r4 == 0) goto L_0x004a
            int r3 = r3.getChainId()
            if (r3 != r9) goto L_0x004a
            r3 = 1
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 == 0) goto L_0x0015
            r1 = r2
        L_0x004e:
            net.safemoon.androidwallet.model.token.abstraction.IToken r1 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r1
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.TransferDetailsFragmentStatus.mo57872G(java.lang.String, int):net.safemoon.androidwallet.model.token.abstraction.IToken");
    }

    /* renamed from: H */
    public final TransferViewModel mo57873H() {
        return (TransferViewModel) this.f42246s.getValue();
    }

    /* renamed from: K */
    public final void mo57874K(String str) {
        cb2 cb2 = this.f42245r;
        if (cb2 == null) {
            return;
        }
        if (vx2.m53586b(str, "1")) {
            cb2.f21656d.setColorFilter(zr0.m31440c(requireContext(), R.color.green));
            cb2.f21667o.setText(R.string.transfer_confirmed);
        } else if (vx2.m53586b(str, "0")) {
            cb2.f21656d.setColorFilter(zr0.m31440c(requireContext(), R.color.red));
            cb2.f21667o.setText(R.string.transfer_failed);
        } else {
            cb2.f21656d.setColorFilter(zr0.m31440c(requireContext(), R.color.yellow));
            cb2.f21667o.setText(R.string.transfer_pending);
        }
    }

    /* renamed from: L */
    public final void mo57875L(boolean z) {
        cb2 cb2 = this.f42245r;
        if (cb2 != null) {
            vx2.m53588d(cb2);
            cb2.f21660h.setClickable(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01d0, code lost:
        if (r14 != null) goto L_0x0218;
     */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x063e  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x065d  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57876M(net.safemoon.androidwallet.model.transaction.history.Result r32, net.safemoon.androidwallet.model.transaction.history.Result r33) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            cb2 r3 = r0.f42245r
            if (r3 == 0) goto L_0x0734
            androidx.cardview.widget.CardView r4 = r3.f21655c
            r5 = 0
            r4.setVisibility(r5)
            android.widget.ProgressBar r4 = r3.f21657e
            r6 = 8
            r4.setVisibility(r6)
            java.lang.String r4 = r1.gasUsed
            if (r4 != 0) goto L_0x0021
            if (r2 == 0) goto L_0x0020
            java.lang.String r4 = r2.gasUsed
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            java.lang.String r8 = r1.gasPrice
            if (r8 != 0) goto L_0x002b
            if (r2 == 0) goto L_0x002a
            java.lang.String r8 = r2.gasPrice
            goto L_0x002b
        L_0x002a:
            r8 = 0
        L_0x002b:
            java.lang.String r9 = "clL"
            java.lang.String r10 = ""
            java.lang.String r11 = " "
            if (r4 == 0) goto L_0x009b
            if (r8 == 0) goto L_0x009b
            java.math.BigInteger r12 = new java.math.BigInteger
            r12.<init>(r4)
            java.math.BigInteger r4 = new java.math.BigInteger
            r4.<init>(r8)
            java.math.BigInteger r4 = r12.multiply(r4)
            java.lang.String r8 = "gasUsed.toBigInteger().m…(gasPrice.toBigInteger())"
            p000.vx2.m53590f(r4, r8)
            int r8 = r0.f42247x
            java.math.BigDecimal r4 = p000.ol0.m70376r(r4, r8)
            double r12 = r4.doubleValue()
            java.lang.Double r4 = java.lang.Double.valueOf(r12)
            r8 = 2131952737(0x7f130461, float:1.9541925E38)
            java.lang.String r8 = r0.getString(r8)
            double r12 = r4.doubleValue()
            r14 = 0
            r15 = 0
            r16 = 1
            r17 = 2
            r18 = 0
            java.lang.String r12 = p000.ol0.m70374p(r12, r14, r15, r16, r17, r18)
            net.safemoon.androidwallet.common.TokenType r13 = r31.mo57869D()
            java.lang.String r13 = r13.getNativeToken()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r8)
            r14.append(r11)
            r14.append(r12)
            r14.append(r11)
            r14.append(r13)
            java.lang.String r8 = r14.toString()
            android.widget.TextView r12 = r3.f21663k
            r12.setText(r8)
            androidx.constraintlayout.widget.ConstraintLayout r12 = r3.f21654b
            p000.vx2.m53590f(r12, r9)
            r12.setVisibility(r5)
            goto L_0x00a5
        L_0x009b:
            androidx.constraintlayout.widget.ConstraintLayout r4 = r3.f21654b
            p000.vx2.m53590f(r4, r9)
            r4.setVisibility(r6)
            r8 = r10
            r4 = 0
        L_0x00a5:
            boolean r9 = r1.offlinePending
            r12 = 2131952743(0x7f130467, float:1.9541937E38)
            java.lang.String r15 = "tvTo"
            java.lang.String r6 = "it.from"
            java.lang.String r7 = "-"
            java.lang.String r13 = "it.to"
            r14 = 1
            java.lang.String r5 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            if (r9 == 0) goto L_0x01b6
            android.widget.TextView r2 = r3.f21666n
            java.lang.String r4 = r0.getString(r12)
            java.lang.String r8 = r1.value
            java.lang.String r9 = r1.tokenSymbol
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r11)
            r12.append(r8)
            r12.append(r11)
            r12.append(r9)
            java.lang.String r4 = r12.toString()
            r2.setText(r4)
            java.lang.String r2 = r1.from
            p000.vx2.m53590f(r2, r6)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r4)
            p000.vx2.m53590f(r2, r5)
            java.lang.String r6 = r1.f42485to
            p000.vx2.m53590f(r6, r13)
            java.lang.String r6 = r6.toLowerCase(r4)
            p000.vx2.m53590f(r6, r5)
            boolean r2 = p000.yb6.m74344y(r2, r6, r14)
            if (r2 == 0) goto L_0x010f
            android.widget.TextView r2 = r3.f21664l
            r4 = 2131952739(0x7f130463, float:1.954193E38)
            java.lang.String r4 = r0.getString(r4)
            r2.setText(r4)
            android.widget.TextView r2 = r3.f21665m
            r2.setText(r10)
            goto L_0x069b
        L_0x010f:
            java.lang.String r2 = r31.mo57868C()
            if (r2 == 0) goto L_0x011d
            java.lang.String r2 = r2.toLowerCase(r4)
            p000.vx2.m53590f(r2, r5)
            goto L_0x011e
        L_0x011d:
            r2 = 0
        L_0x011e:
            java.lang.String r6 = r1.f42485to
            p000.vx2.m53590f(r6, r13)
            java.lang.String r4 = r6.toLowerCase(r4)
            p000.vx2.m53590f(r4, r5)
            boolean r2 = p000.vx2.m53586b(r2, r4)
            if (r2 == 0) goto L_0x0173
            android.widget.TextView r2 = r3.f21664l
            r4 = 2131952738(0x7f130462, float:1.9541927E38)
            java.lang.String r4 = r0.getString(r4)
            r2.setText(r4)
            android.widget.TextView r2 = r3.f21665m
            r4 = 2131952736(0x7f130460, float:1.9541923E38)
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r5 = r1.from
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r11)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r2.setText(r4)
            android.widget.TextView r2 = r3.f21665m
            p000.vx2.m53590f(r2, r15)
            java.lang.String r4 = r1.from
            boolean r4 = r4.equals(r7)
            r4 = r4 ^ r14
            if (r4 == 0) goto L_0x016c
            r6 = 0
            goto L_0x016e
        L_0x016c:
            r6 = 8
        L_0x016e:
            r2.setVisibility(r6)
            goto L_0x069b
        L_0x0173:
            android.widget.TextView r2 = r3.f21664l
            r4 = 2131952740(0x7f130464, float:1.9541931E38)
            java.lang.String r4 = r0.getString(r4)
            r2.setText(r4)
            android.widget.TextView r2 = r3.f21665m
            r4 = 2131952742(0x7f130466, float:1.9541935E38)
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r5 = r1.f42485to
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r11)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r2.setText(r4)
            android.widget.TextView r2 = r3.f21665m
            p000.vx2.m53590f(r2, r15)
            java.lang.String r4 = r1.f42485to
            boolean r4 = r4.equals(r7)
            r4 = r4 ^ r14
            if (r4 == 0) goto L_0x01af
            r6 = 0
            goto L_0x01b1
        L_0x01af:
            r6 = 8
        L_0x01b1:
            r2.setVisibility(r6)
            goto L_0x069b
        L_0x01b6:
            java.lang.String r9 = r1.contractAddress
            java.lang.String r12 = "it.contractAddress"
            if (r9 == 0) goto L_0x01d3
            p000.vx2.m53590f(r9, r12)
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x01c7
            r9 = r14
            goto L_0x01c8
        L_0x01c7:
            r9 = 0
        L_0x01c8:
            if (r9 == 0) goto L_0x01d3
            java.lang.Integer r9 = r1.tokenDecimal
            if (r9 == 0) goto L_0x01d3
            java.lang.String r14 = r1.tokenSymbol
            if (r14 == 0) goto L_0x01d3
            goto L_0x0218
        L_0x01d3:
            java.lang.String r9 = r1.contractAddress
            if (r9 == 0) goto L_0x01e7
            p000.vx2.m53590f(r9, r12)
            net.safemoon.androidwallet.common.TokenType r12 = r31.mo57869D()
            int r12 = r12.getChainId()
            net.safemoon.androidwallet.model.token.abstraction.IToken r9 = r0.mo57872G(r9, r12)
            goto L_0x01e8
        L_0x01e7:
            r9 = 0
        L_0x01e8:
            if (r9 != 0) goto L_0x020b
            net.safemoon.androidwallet.common.TokenType r9 = r31.mo57869D()
            int r9 = r9.getChainId()
            net.safemoon.androidwallet.model.token.abstraction.IToken r9 = r0.mo57872G(r10, r9)
            if (r9 == 0) goto L_0x0208
            int r12 = r9.getDecimals()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r9 = r9.getSymbol()
            r37 r14 = p000.r37.f33317a
            r14 = r9
            goto L_0x0217
        L_0x0208:
            r9 = 0
            r14 = 0
            goto L_0x0218
        L_0x020b:
            int r12 = r9.getDecimals()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r14 = r9.getSymbol()
        L_0x0217:
            r9 = r12
        L_0x0218:
            r20 = 0
            java.lang.String r12 = "it.value"
            r22 = r4
            java.lang.String r4 = "to"
            if (r9 == 0) goto L_0x0562
            if (r14 == 0) goto L_0x0562
            r23 = r14
            net.safemoon.androidwallet.common.TokenType$a r14 = net.safemoon.androidwallet.common.TokenType.Companion
            net.safemoon.androidwallet.common.TokenType r24 = r31.mo57869D()
            r25 = r9
            int r9 = r24.getChainId()
            net.safemoon.androidwallet.common.TokenType r9 = r14.mo57099b(r9)
            net.safemoon.androidwallet.common.TokenType r14 = net.safemoon.androidwallet.common.TokenType.SOLANA
            if (r9 == r14) goto L_0x0343
            net.safemoon.androidwallet.common.TokenType r14 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_BITCOIN
            if (r9 == r14) goto L_0x0343
            net.safemoon.androidwallet.common.TokenType r14 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE
            if (r9 != r14) goto L_0x0244
            goto L_0x0343
        L_0x0244:
            net.safemoon.androidwallet.common.MyCoinType r2 = r9.getCoinType()
            net.safemoon.androidwallet.common.SimilarTypeGroup r2 = r2.getSimilarTypeGroup()
            net.safemoon.androidwallet.common.SimilarTypeGroup r7 = net.safemoon.androidwallet.common.SimilarTypeGroup.EVM_CAPABILITY
            if (r2 != r7) goto L_0x04ba
            java.lang.String r2 = r1.from
            p000.vx2.m53590f(r2, r6)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r6)
            p000.vx2.m53590f(r2, r5)
            java.lang.String r7 = r1.f42485to
            p000.vx2.m53590f(r7, r13)
            java.lang.String r7 = r7.toLowerCase(r6)
            p000.vx2.m53590f(r7, r5)
            r9 = 1
            boolean r2 = p000.yb6.m74344y(r2, r7, r9)
            if (r2 == 0) goto L_0x0284
            android.widget.TextView r2 = r3.f21664l
            r6 = 2131952739(0x7f130463, float:1.954193E38)
            java.lang.String r6 = r0.getString(r6)
            r2.setText(r6)
            android.widget.TextView r2 = r3.f21665m
            r2.setText(r10)
            goto L_0x04ba
        L_0x0284:
            java.lang.String r2 = r31.mo57868C()
            if (r2 == 0) goto L_0x0292
            java.lang.String r2 = r2.toLowerCase(r6)
            p000.vx2.m53590f(r2, r5)
            goto L_0x0293
        L_0x0292:
            r2 = 0
        L_0x0293:
            java.lang.String r7 = r1.f42485to
            p000.vx2.m53590f(r7, r13)
            java.lang.String r6 = r7.toLowerCase(r6)
            p000.vx2.m53590f(r6, r5)
            boolean r2 = p000.vx2.m53586b(r2, r6)
            if (r2 == 0) goto L_0x02d3
            android.widget.TextView r2 = r3.f21664l
            r6 = 2131952738(0x7f130462, float:1.9541927E38)
            java.lang.String r6 = r0.getString(r6)
            r2.setText(r6)
            android.widget.TextView r2 = r3.f21665m
            r6 = 2131952736(0x7f130460, float:1.9541923E38)
            java.lang.String r6 = r0.getString(r6)
            java.lang.String r7 = r1.from
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r11)
            r9.append(r7)
            java.lang.String r6 = r9.toString()
            r2.setText(r6)
            goto L_0x04ba
        L_0x02d3:
            java.lang.String r2 = r1.input
            java.lang.String r6 = "0x"
            boolean r2 = p000.vx2.m53586b(r2, r6)
            if (r2 != 0) goto L_0x0318
            android.widget.TextView r2 = r3.f21664l
            r6 = 2131952741(0x7f130465, float:1.9541933E38)
            java.lang.String r6 = r0.getString(r6)
            r2.setText(r6)
            android.widget.TextView r2 = r3.f21665m
            r6 = 2131952742(0x7f130466, float:1.9541935E38)
            java.lang.String r6 = r0.getString(r6)
            java.lang.String r7 = r1.f42485to
            int r9 = r7.length()
            if (r9 != 0) goto L_0x02fc
            r9 = 1
            goto L_0x02fd
        L_0x02fc:
            r9 = 0
        L_0x02fd:
            if (r9 == 0) goto L_0x0301
            java.lang.String r7 = r1.contractAddress
        L_0x0301:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r11)
            r9.append(r7)
            java.lang.String r6 = r9.toString()
            r2.setText(r6)
            goto L_0x04ba
        L_0x0318:
            android.widget.TextView r2 = r3.f21664l
            r6 = 2131952740(0x7f130464, float:1.9541931E38)
            java.lang.String r6 = r0.getString(r6)
            r2.setText(r6)
            android.widget.TextView r2 = r3.f21665m
            r6 = 2131952742(0x7f130466, float:1.9541935E38)
            java.lang.String r6 = r0.getString(r6)
            java.lang.String r7 = r1.f42485to
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r7)
            java.lang.String r6 = r9.toString()
            r2.setText(r6)
            goto L_0x04ba
        L_0x0343:
            java.lang.String r9 = r1.from
            p000.vx2.m53590f(r9, r6)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r6)
            p000.vx2.m53590f(r9, r5)
            java.lang.String r13 = r1.f42485to
            if (r13 == 0) goto L_0x0360
            p000.vx2.m53590f(r13, r4)
            java.lang.String r13 = r13.toLowerCase(r6)
            p000.vx2.m53590f(r13, r5)
            goto L_0x0361
        L_0x0360:
            r13 = 0
        L_0x0361:
            r14 = 1
            boolean r9 = p000.yb6.m74344y(r9, r13, r14)
            if (r9 == 0) goto L_0x037b
            android.widget.TextView r2 = r3.f21664l
            r6 = 2131952739(0x7f130463, float:1.954193E38)
            java.lang.String r6 = r0.getString(r6)
            r2.setText(r6)
            android.widget.TextView r2 = r3.f21665m
            r2.setText(r10)
            goto L_0x04ba
        L_0x037b:
            java.lang.String r9 = r31.mo57868C()
            if (r9 == 0) goto L_0x0389
            java.lang.String r9 = r9.toLowerCase(r6)
            p000.vx2.m53590f(r9, r5)
            goto L_0x038a
        L_0x0389:
            r9 = 0
        L_0x038a:
            java.lang.String r10 = r1.f42485to
            if (r10 == 0) goto L_0x0399
            p000.vx2.m53590f(r10, r4)
            java.lang.String r10 = r10.toLowerCase(r6)
            p000.vx2.m53590f(r10, r5)
            goto L_0x039a
        L_0x0399:
            r10 = 0
        L_0x039a:
            boolean r9 = p000.vx2.m53586b(r9, r10)
            if (r9 == 0) goto L_0x042a
            java.lang.String r9 = r1.from
            if (r2 == 0) goto L_0x03ea
            net.safemoon.androidwallet.common.TokenType r10 = r31.mo57869D()
            net.safemoon.androidwallet.common.TokenType r13 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE
            if (r10 == r13) goto L_0x03b4
            net.safemoon.androidwallet.common.TokenType r10 = r31.mo57869D()
            net.safemoon.androidwallet.common.TokenType r13 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_BITCOIN
            if (r10 != r13) goto L_0x03ea
        L_0x03b4:
            java.lang.String r9 = r2.from
            if (r9 == 0) goto L_0x03c5
            java.lang.String r10 = "from"
            p000.vx2.m53590f(r9, r10)
            java.lang.String r9 = r9.toLowerCase(r6)
            p000.vx2.m53590f(r9, r5)
            goto L_0x03c6
        L_0x03c5:
            r9 = 0
        L_0x03c6:
            java.lang.String r10 = r31.mo57868C()
            if (r10 == 0) goto L_0x03d4
            java.lang.String r6 = r10.toLowerCase(r6)
            p000.vx2.m53590f(r6, r5)
            goto L_0x03d5
        L_0x03d4:
            r6 = 0
        L_0x03d5:
            boolean r6 = p000.vx2.m53586b(r9, r6)
            if (r6 == 0) goto L_0x03de
            java.lang.String r2 = r2.f42485to
            goto L_0x03e0
        L_0x03de:
            java.lang.String r2 = r2.from
        L_0x03e0:
            r9 = r2
            if (r9 != 0) goto L_0x03e5
            r9 = r7
            goto L_0x03ea
        L_0x03e5:
            java.lang.String r2 = "if(newTranaction.from?.l…wTranaction.from } ?: \"-\""
            p000.vx2.m53590f(r9, r2)
        L_0x03ea:
            android.widget.TextView r2 = r3.f21664l
            r6 = 2131952738(0x7f130462, float:1.9541927E38)
            java.lang.String r6 = r0.getString(r6)
            r2.setText(r6)
            android.widget.TextView r2 = r3.f21665m
            r6 = 2131952736(0x7f130460, float:1.9541923E38)
            java.lang.String r6 = r0.getString(r6)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r11)
            r10.append(r9)
            java.lang.String r6 = r10.toString()
            r2.setText(r6)
            android.widget.TextView r2 = r3.f21665m
            p000.vx2.m53590f(r2, r15)
            boolean r6 = r9.equals(r7)
            r7 = 1
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0423
            r6 = 0
            goto L_0x0425
        L_0x0423:
            r6 = 8
        L_0x0425:
            r2.setVisibility(r6)
            goto L_0x04ba
        L_0x042a:
            java.lang.String r9 = r1.f42485to
            if (r2 == 0) goto L_0x0474
            net.safemoon.androidwallet.common.TokenType r10 = r31.mo57869D()
            net.safemoon.androidwallet.common.TokenType r13 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE
            if (r10 == r13) goto L_0x043e
            net.safemoon.androidwallet.common.TokenType r10 = r31.mo57869D()
            net.safemoon.androidwallet.common.TokenType r13 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_BITCOIN
            if (r10 != r13) goto L_0x0474
        L_0x043e:
            java.lang.String r9 = r2.from
            if (r9 == 0) goto L_0x044f
            java.lang.String r10 = "from"
            p000.vx2.m53590f(r9, r10)
            java.lang.String r9 = r9.toLowerCase(r6)
            p000.vx2.m53590f(r9, r5)
            goto L_0x0450
        L_0x044f:
            r9 = 0
        L_0x0450:
            java.lang.String r10 = r31.mo57868C()
            if (r10 == 0) goto L_0x045e
            java.lang.String r6 = r10.toLowerCase(r6)
            p000.vx2.m53590f(r6, r5)
            goto L_0x045f
        L_0x045e:
            r6 = 0
        L_0x045f:
            boolean r6 = p000.vx2.m53586b(r9, r6)
            if (r6 == 0) goto L_0x0468
            java.lang.String r2 = r2.f42485to
            goto L_0x046a
        L_0x0468:
            java.lang.String r2 = r2.from
        L_0x046a:
            r9 = r2
            if (r9 != 0) goto L_0x046f
            r9 = r7
            goto L_0x0474
        L_0x046f:
            java.lang.String r2 = "if(newTranaction.from?.l…wTranaction.from } ?: \"-\""
            p000.vx2.m53590f(r9, r2)
        L_0x0474:
            android.widget.TextView r2 = r3.f21664l
            r6 = 2131952740(0x7f130464, float:1.9541931E38)
            java.lang.String r6 = r0.getString(r6)
            r2.setText(r6)
            android.widget.TextView r2 = r3.f21665m
            r6 = 2131952742(0x7f130466, float:1.9541935E38)
            java.lang.String r6 = r0.getString(r6)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r9)
            java.lang.String r6 = r10.toString()
            r2.setText(r6)
            android.widget.TextView r2 = r3.f21665m
            p000.vx2.m53590f(r2, r15)
            if (r9 == 0) goto L_0x04ac
            boolean r6 = r9.equals(r7)
            r7 = 1
            if (r6 != r7) goto L_0x04ad
            r19 = r7
            goto L_0x04af
        L_0x04ac:
            r7 = 1
        L_0x04ad:
            r19 = 0
        L_0x04af:
            r6 = r19 ^ 1
            if (r6 == 0) goto L_0x04b5
            r6 = 0
            goto L_0x04b7
        L_0x04b5:
            r6 = 8
        L_0x04b7:
            r2.setVisibility(r6)
        L_0x04ba:
            java.lang.String r2 = r1.value
            p000.vx2.m53590f(r2, r12)
            java.math.BigDecimal r6 = new java.math.BigDecimal
            r6.<init>(r2)
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            boolean r2 = p000.vx2.m53586b(r6, r2)
            if (r2 == 0) goto L_0x04da
            android.widget.TextView r2 = r3.f21666n
            r2.setText(r8)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r3.f21654b
            r4 = 8
            r2.setVisibility(r4)
            goto L_0x069b
        L_0x04da:
            java.lang.String r2 = r1.value
            p000.vx2.m53590f(r2, r12)
            int r6 = r25.intValue()
            java.math.BigDecimal r2 = p000.ol0.m70375q(r2, r6)
            double r6 = r2.doubleValue()
            boolean r2 = r31.mo57870E()
            if (r2 != 0) goto L_0x052a
            net.safemoon.androidwallet.common.TokenType r2 = r31.mo57869D()
            net.safemoon.androidwallet.common.TokenType r8 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE
            if (r2 != r8) goto L_0x052a
            java.lang.String r2 = r31.mo57868C()
            if (r2 == 0) goto L_0x0509
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r8)
            p000.vx2.m53590f(r2, r5)
            goto L_0x050a
        L_0x0509:
            r2 = 0
        L_0x050a:
            java.lang.String r8 = r1.f42485to
            if (r8 == 0) goto L_0x051b
            p000.vx2.m53590f(r8, r4)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r4 = r8.toLowerCase(r4)
            p000.vx2.m53590f(r4, r5)
            goto L_0x051c
        L_0x051b:
            r4 = 0
        L_0x051c:
            boolean r2 = p000.vx2.m53586b(r2, r4)
            if (r2 != 0) goto L_0x052a
            if (r22 == 0) goto L_0x0528
            double r20 = r22.doubleValue()
        L_0x0528:
            double r6 = r6 - r20
        L_0x052a:
            r24 = r6
            android.widget.TextView r2 = r3.f21666n
            r4 = 2131952743(0x7f130467, float:1.9541937E38)
            java.lang.String r4 = r0.getString(r4)
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 6
            r30 = 0
            java.lang.String r5 = p000.ol0.m70374p(r24, r26, r27, r28, r29, r30)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r11)
            r6.append(r5)
            r6.append(r11)
            r14 = r23
            r6.append(r14)
            java.lang.String r4 = r6.toString()
            r2.setText(r4)
            goto L_0x069b
        L_0x0562:
            java.lang.String r7 = r1.from
            p000.vx2.m53590f(r7, r6)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r6)
            p000.vx2.m53590f(r7, r5)
            java.lang.String r8 = r1.f42485to
            p000.vx2.m53590f(r8, r13)
            java.lang.String r8 = r8.toLowerCase(r6)
            p000.vx2.m53590f(r8, r5)
            r9 = 1
            boolean r7 = p000.yb6.m74344y(r7, r8, r9)
            if (r7 == 0) goto L_0x0596
            android.widget.TextView r7 = r3.f21664l
            r8 = 2131952739(0x7f130463, float:1.954193E38)
            java.lang.String r8 = r0.getString(r8)
            r7.setText(r8)
            android.widget.TextView r7 = r3.f21665m
            r7.setText(r10)
            goto L_0x0610
        L_0x0596:
            java.lang.String r7 = r31.mo57868C()
            if (r7 == 0) goto L_0x05a4
            java.lang.String r7 = r7.toLowerCase(r6)
            p000.vx2.m53590f(r7, r5)
            goto L_0x05a5
        L_0x05a4:
            r7 = 0
        L_0x05a5:
            java.lang.String r8 = r1.f42485to
            p000.vx2.m53590f(r8, r13)
            java.lang.String r8 = r8.toLowerCase(r6)
            p000.vx2.m53590f(r8, r5)
            boolean r7 = p000.vx2.m53586b(r7, r8)
            if (r7 == 0) goto L_0x05e4
            android.widget.TextView r7 = r3.f21664l
            r8 = 2131952738(0x7f130462, float:1.9541927E38)
            java.lang.String r8 = r0.getString(r8)
            r7.setText(r8)
            android.widget.TextView r7 = r3.f21665m
            r8 = 2131952736(0x7f130460, float:1.9541923E38)
            java.lang.String r8 = r0.getString(r8)
            java.lang.String r9 = r1.from
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r10.append(r11)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            r7.setText(r8)
            goto L_0x0610
        L_0x05e4:
            android.widget.TextView r7 = r3.f21664l
            r8 = 2131952740(0x7f130464, float:1.9541931E38)
            java.lang.String r8 = r0.getString(r8)
            r7.setText(r8)
            android.widget.TextView r7 = r3.f21665m
            r8 = 2131952742(0x7f130466, float:1.9541935E38)
            java.lang.String r8 = r0.getString(r8)
            java.lang.String r9 = r1.f42485to
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r10.append(r11)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            r7.setText(r8)
        L_0x0610:
            java.lang.String r7 = r1.value
            p000.vx2.m53590f(r7, r12)
            java.lang.Integer r8 = r1.tokenDecimal
            java.lang.String r9 = "it.tokenDecimal"
            p000.vx2.m53590f(r8, r9)
            int r8 = r8.intValue()
            java.math.BigDecimal r7 = p000.ol0.m70375q(r7, r8)
            double r7 = r7.doubleValue()
            boolean r9 = r31.mo57870E()
            if (r9 != 0) goto L_0x0665
            if (r2 == 0) goto L_0x0665
            net.safemoon.androidwallet.common.TokenType r2 = r31.mo57869D()
            net.safemoon.androidwallet.common.TokenType r9 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE
            if (r2 != r9) goto L_0x0665
            java.lang.String r2 = r31.mo57868C()
            if (r2 == 0) goto L_0x0646
            java.lang.String r2 = r2.toLowerCase(r6)
            p000.vx2.m53590f(r2, r5)
            goto L_0x0647
        L_0x0646:
            r2 = 0
        L_0x0647:
            java.lang.String r9 = r1.f42485to
            if (r9 == 0) goto L_0x0656
            p000.vx2.m53590f(r9, r4)
            java.lang.String r4 = r9.toLowerCase(r6)
            p000.vx2.m53590f(r4, r5)
            goto L_0x0657
        L_0x0656:
            r4 = 0
        L_0x0657:
            boolean r2 = p000.vx2.m53586b(r2, r4)
            if (r2 != 0) goto L_0x0665
            if (r22 == 0) goto L_0x0663
            double r20 = r22.doubleValue()
        L_0x0663:
            double r7 = r7 - r20
        L_0x0665:
            r20 = r7
            android.widget.TextView r2 = r3.f21666n
            r4 = 2131952743(0x7f130467, float:1.9541937E38)
            java.lang.String r4 = r0.getString(r4)
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 6
            r26 = 0
            java.lang.String r5 = p000.ol0.m70374p(r20, r22, r23, r24, r25, r26)
            java.lang.String r6 = r1.tokenSymbol
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r11)
            r7.append(r5)
            r7.append(r11)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            r2.setText(r4)
        L_0x069b:
            r37 r2 = p000.r37.f33317a
            boolean r2 = r31.mo57870E()
            if (r2 != 0) goto L_0x06ad
            java.lang.String r2 = r1.txreceiptStatus
            java.lang.String r4 = "details.txreceiptStatus"
            p000.vx2.m53590f(r2, r4)
            r0.mo57874K(r2)
        L_0x06ad:
            net.safemoon.androidwallet.utils.Common r2 = net.safemoon.androidwallet.utils.Common.f42577a
            android.widget.TextView r4 = r3.f21661i
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            java.util.Date r6 = new java.util.Date
            java.lang.String r7 = r1.timeStamp
            java.lang.String r8 = "details.timeStamp"
            p000.vx2.m53590f(r7, r8)
            long r7 = java.lang.Long.parseLong(r7)
            long r9 = r0.f42244k
            long r7 = r7 * r9
            r6.<init>(r7)
            r5.setTime(r6)
            java.util.Date r5 = r5.getTime()
            java.lang.String r6 = "getInstance().apply {\n  …E_MUL)\n            }.time"
            p000.vx2.m53590f(r5, r6)
            android.content.Context r6 = r31.requireContext()
            java.lang.String r7 = "requireContext()"
            p000.vx2.m53590f(r6, r7)
            java.lang.String r5 = r2.mo60899e(r5, r6)
            r4.setText(r5)
            net.safemoon.androidwallet.common.TokenType r4 = r31.mo57869D()
            java.lang.String r2 = r2.mo60911r(r4)
            android.widget.TextView r4 = r3.f21660h
            cb6 r5 = p000.cb6.f21669a
            java.util.Locale r5 = java.util.Locale.getDefault()
            r6 = 2131952769(0x7f130481, float:1.954199E38)
            java.lang.String r6 = r0.getString(r6)
            java.lang.String r7 = "getString(R.string.view_transaction_on_bsc)"
            p000.vx2.m53590f(r6, r7)
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            net.safemoon.androidwallet.common.TokenType r9 = r31.mo57869D()
            java.lang.String r9 = r9.getPlaneName()
            r10 = 0
            r8[r10] = r9
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r8, r7)
            java.lang.String r5 = java.lang.String.format(r5, r6, r7)
            java.lang.String r6 = "format(locale, format, *args)"
            p000.vx2.m53590f(r5, r6)
            r4.setText(r5)
            android.widget.TextView r4 = r3.f21660h
            gu6 r5 = new gu6
            r5.<init>(r0, r2, r1)
            r4.setOnClickListener(r5)
            b36 r1 = r3.f21659g
            android.widget.ImageView r1 = r1.f21125c
            hu6 r2 = new hu6
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0734:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.TransferDetailsFragmentStatus.mo57876M(net.safemoon.androidwallet.model.transaction.history.Result, net.safemoon.androidwallet.model.transaction.history.Result):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        cb2 a = cb2.m32892a(layoutInflater.inflate(R.layout.fragment_transaction_notification_details, viewGroup, false));
        this.f42245r = a;
        vx2.m53588d(a);
        a.f21659g.f21127e.setText(getText(R.string.Transfer_detail));
        cb2 cb2 = this.f42245r;
        vx2.m53588d(cb2);
        return cb2.mo29913b();
    }

    public void onResume() {
        super.onResume();
        mo57875L(true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        mo57873H().mo61762k().postValue(null);
        mo57873H().mo61761j().postValue(null);
        mo57873H().mo61755d(mo57869D());
        mo57873H().mo61756e().observe(getViewLifecycleOwner(), new eu6(new TransferDetailsFragmentStatus$onViewCreated$1(this)));
        mo57873H().mo61762k().observe(getViewLifecycleOwner(), new fu6(new TransferDetailsFragmentStatus$onViewCreated$2(this)));
        String C = mo57868C();
        if (C != null) {
            TransferViewModel H = mo57873H();
            TokenType D = mo57869D();
            String str = mo57871F().hash;
            vx2.m53590f(str, "requestTransaction.hash");
            H.mo61763l(D, str, C);
        }
        if (mo57871F().offlinePending) {
            return;
        }
        if (mo57869D() == TokenType.MULTI_COIN_DOGE || mo57869D() == TokenType.MULTI_COIN_BITCOIN) {
            TransferViewModel H2 = mo57873H();
            String str2 = mo57871F().hash;
            vx2.m53590f(str2, "requestTransaction.hash");
            H2.mo61758g(str2);
            vg3.m28804a(this).mo6301b(new TransferDetailsFragmentStatus$onViewCreated$4(this, (ns0<? super TransferDetailsFragmentStatus$onViewCreated$4>) null));
        }
    }
}
