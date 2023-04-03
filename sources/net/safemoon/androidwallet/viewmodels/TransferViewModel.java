package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.ReceiptStatus;
import net.safemoon.androidwallet.model.request.EvmRequestTransaction;
import net.safemoon.androidwallet.model.rpc2.bitcoin.BtcTxDetails;
import net.safemoon.androidwallet.model.rpc2.doge.details.DogeTxDetails;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.transaction.details.TransactionDetails;
import net.safemoon.androidwallet.model.transaction.details.TransactionDetailsData;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer;
import org.web3j.abi.datatypes.Address;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002F\"B\u000f\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00040\u0012J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ#\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR1\u0010&\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 !*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010 0 0\u001f8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u001f8\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150\u001f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b+\u0010%R$\u00103\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001d\u00107\u001a\b\u0012\u0004\u0012\u0002040\u001f8\u0006¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b6\u0010%R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b8\u0010%R$\u0010?\u001a\u0004\u0018\u0001098\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u001f8\u0006¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b5\u0010%\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/TransferViewModel;", "Lwj;", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Lr37;", "d", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "iToken", "", "receiver", "", "amount", "h", "hash", "g", "address", "l", "n", "Lkotlin/Function1;", "errorCallBack", "r", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "m", "transactionHash", "Lnet/safemoon/androidwallet/model/request/EvmRequestTransaction;", "q", "Lnet/safemoon/androidwallet/viewmodels/TransferViewModel$b;", "transferModel", "", "s", "(Lnet/safemoon/androidwallet/model/token/abstraction/IToken;Lnet/safemoon/androidwallet/viewmodels/TransferViewModel$b;Lns0;)Ljava/lang/Object;", "Lk04;", "", "kotlin.jvm.PlatformType", "b", "Lk04;", "e", "()Lk04;", "allTokensList", "Lnet/safemoon/androidwallet/model/ReceiptStatus;", "c", "k", "statusOfNewTransaction", "j", "resultOfNewTransaction", "Lnet/safemoon/androidwallet/viewmodels/blockChainClass/Transfer;", "Lnet/safemoon/androidwallet/viewmodels/blockChainClass/Transfer;", "o", "()Lnet/safemoon/androidwallet/viewmodels/blockChainClass/Transfer;", "setTransfer", "(Lnet/safemoon/androidwallet/viewmodels/blockChainClass/Transfer;)V", "transfer", "Lnet/safemoon/androidwallet/viewmodels/TransferViewModel$a;", "f", "i", "gasFee", "p", "Ly23;", "Ly23;", "getEstimateGasJob", "()Ly23;", "setEstimateGasJob", "(Ly23;)V", "estimateGasJob", "Lnet/safemoon/androidwallet/model/transaction/details/TransactionDetailsData;", "detailsData", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TransferViewModel.kt */
public final class TransferViewModel extends C3552wj {

    /* renamed from: b */
    public final k04<List<IToken>> f42990b = new k04<>(ck0.m33062j());

    /* renamed from: c */
    public final k04<ReceiptStatus> f42991c = new k04<>();

    /* renamed from: d */
    public final k04<Result> f42992d = new k04<>();

    /* renamed from: e */
    public Transfer f42993e;

    /* renamed from: f */
    public final k04<C8862a> f42994f = new k04<>();

    /* renamed from: g */
    public final k04<C8863b> f42995g = new k04<>();

    /* renamed from: h */
    public y23 f42996h;

    /* renamed from: i */
    public final k04<TransactionDetailsData> f42997i = new k04<>(null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/TransferViewModel$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "hasSuccess", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "fee", "<init>", "(ZLjava/lang/Double;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$a */
    /* compiled from: TransferViewModel.kt */
    public static final class C8862a {

        /* renamed from: a */
        public final boolean f42998a;

        /* renamed from: b */
        public final Double f42999b;

        public C8862a(boolean z, Double d) {
            this.f42998a = z;
            this.f42999b = d;
        }

        /* renamed from: a */
        public final Double mo61771a() {
            return this.f42999b;
        }

        /* renamed from: b */
        public final boolean mo61772b() {
            return this.f42998a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8862a)) {
                return false;
            }
            C8862a aVar = (C8862a) obj;
            return this.f42998a == aVar.f42998a && vx2.m53586b(this.f42999b, aVar.f42999b);
        }

        public int hashCode() {
            boolean z = this.f42998a;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            Double d = this.f42999b;
            return i + (d == null ? 0 : d.hashCode());
        }

        public String toString() {
            boolean z = this.f42998a;
            Double d = this.f42999b;
            return "GasFee(hasSuccess=" + z + ", fee=" + d + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¨\u0006\t"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/TransferViewModel$c", "Lig5;", "Lnet/safemoon/androidwallet/model/transaction/details/TransactionDetails;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$c */
    /* compiled from: TransferViewModel.kt */
    public static final class C8864c extends ig5<TransactionDetails> {

        /* renamed from: a */
        public final /* synthetic */ TransferViewModel f43004a;

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$c$a */
        /* compiled from: TransferViewModel.kt */
        public /* synthetic */ class C8865a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f43005a;

            static {
                int[] iArr = new int[TokenType.values().length];
                try {
                    iArr[TokenType.SOLANA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f43005a = iArr;
            }
        }

        public C8864c(TransferViewModel transferViewModel) {
            this.f43004a = transferViewModel;
        }

        /* renamed from: b */
        public void mo47104b(k90<TransactionDetails> k90, bg5<TransactionDetails> bg5) {
            TransactionDetailsData transactionDetailsData;
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50578a() != null) {
                TransactionDetails a = bg5.mo50578a();
                if (a != null) {
                    transactionDetailsData = a.getData();
                } else {
                    transactionDetailsData = null;
                }
                if (transactionDetailsData != null) {
                    k04<TransactionDetailsData> f = this.f43004a.mo61757f();
                    TransactionDetails a2 = bg5.mo50578a();
                    vx2.m53588d(a2);
                    TransactionDetailsData data = a2.getData();
                    if (C8865a.f43005a[TokenType.Companion.mo57100c(data.getChain()).ordinal()] == 1) {
                        String plainString = new BigDecimal(data.getGasUsed()).divide(BigDecimal.ONE.multiply(BigDecimal.TEN.pow(9))).toPlainString();
                        vx2.m53590f(plainString, "gasUsed.toBigDecimal().d….pow(9))).toPlainString()");
                        data.setGasUsed(plainString);
                    }
                    f.setValue(data);
                }
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/TransferViewModel$d", "Lp90;", "Lnet/safemoon/androidwallet/model/rpc2/doge/details/DogeTxDetails;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$d */
    /* compiled from: TransferViewModel.kt */
    public static final class C8866d implements p90<DogeTxDetails> {

        /* renamed from: a */
        public final /* synthetic */ String f43006a;

        /* renamed from: b */
        public final /* synthetic */ TransferViewModel f43007b;

        public C8866d(String str, TransferViewModel transferViewModel) {
            this.f43006a = str;
            this.f43007b = transferViewModel;
        }

        /* renamed from: a */
        public void mo47103a(k90<DogeTxDetails> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00e7  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo47104b(p000.k90<net.safemoon.androidwallet.model.rpc2.doge.details.DogeTxDetails> r20, p000.bg5<net.safemoon.androidwallet.model.rpc2.doge.details.DogeTxDetails> r21) {
            /*
                r19 = this;
                r0 = r19
                java.lang.String r1 = "call"
                r2 = r20
                p000.vx2.m53591g(r2, r1)
                java.lang.String r1 = "response"
                r2 = r21
                p000.vx2.m53591g(r2, r1)
                boolean r1 = r21.mo50581e()
                if (r1 == 0) goto L_0x01ce
                java.lang.Object r1 = r21.mo50578a()
                net.safemoon.androidwallet.model.rpc2.doge.details.DogeTxDetails r1 = (net.safemoon.androidwallet.model.rpc2.doge.details.DogeTxDetails) r1
                if (r1 == 0) goto L_0x01ce
                net.safemoon.androidwallet.model.rpc2.doge.details.Transaction r1 = r1.getTransaction()
                if (r1 == 0) goto L_0x01ce
                java.lang.String r2 = r0.f43006a
                net.safemoon.androidwallet.viewmodels.TransferViewModel r3 = r0.f43007b
                java.util.List r4 = r1.getInputs()
                boolean r5 = r4 instanceof java.util.Collection
                r6 = 0
                r7 = 1
                if (r5 == 0) goto L_0x003a
                boolean r5 = r4.isEmpty()
                if (r5 == 0) goto L_0x003a
            L_0x0038:
                r4 = r6
                goto L_0x005c
            L_0x003a:
                java.util.Iterator r4 = r4.iterator()
            L_0x003e:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0038
                java.lang.Object r5 = r4.next()
                net.safemoon.androidwallet.model.rpc2.doge.details.Input r5 = (net.safemoon.androidwallet.model.rpc2.doge.details.Input) r5
                java.lang.String r5 = r5.getAddress()
                if (r5 == 0) goto L_0x0058
                boolean r5 = p000.yb6.m74344y(r5, r2, r7)
                if (r5 != r7) goto L_0x0058
                r5 = r7
                goto L_0x0059
            L_0x0058:
                r5 = r6
            L_0x0059:
                if (r5 == 0) goto L_0x003e
                r4 = r7
            L_0x005c:
                java.lang.String r5 = r1.getBlockHash()
                if (r5 == 0) goto L_0x0065
                java.lang.String r5 = "1"
                goto L_0x0067
            L_0x0065:
                java.lang.String r5 = ""
            L_0x0067:
                r17 = r5
                r8 = 0
                java.lang.String r5 = "-"
                if (r4 != r7) goto L_0x00e7
                if (r2 != 0) goto L_0x0073
                r4 = r5
                goto L_0x0074
            L_0x0073:
                r4 = r2
            L_0x0074:
                java.util.List r10 = r1.getInputs()
                java.util.Iterator r10 = r10.iterator()
                r11 = r8
            L_0x007d:
                boolean r13 = r10.hasNext()
                if (r13 == 0) goto L_0x0093
                java.lang.Object r13 = r10.next()
                net.safemoon.androidwallet.model.rpc2.doge.details.Input r13 = (net.safemoon.androidwallet.model.rpc2.doge.details.Input) r13
                java.lang.String r13 = r13.getValue()
                double r13 = java.lang.Double.parseDouble(r13)
                double r11 = r11 + r13
                goto L_0x007d
            L_0x0093:
                java.util.List r10 = r1.getOutputs()
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.Iterator r10 = r10.iterator()
            L_0x00a0:
                boolean r14 = r10.hasNext()
                if (r14 == 0) goto L_0x00c2
                java.lang.Object r14 = r10.next()
                r15 = r14
                net.safemoon.androidwallet.model.rpc2.doge.details.Output r15 = (net.safemoon.androidwallet.model.rpc2.doge.details.Output) r15
                java.lang.String r15 = r15.getAddress()
                if (r15 == 0) goto L_0x00bb
                boolean r15 = p000.yb6.m74344y(r15, r2, r7)
                if (r15 != r7) goto L_0x00bb
                r15 = r7
                goto L_0x00bc
            L_0x00bb:
                r15 = r6
            L_0x00bc:
                if (r15 == 0) goto L_0x00a0
                r13.add(r14)
                goto L_0x00a0
            L_0x00c2:
                java.util.Iterator r2 = r13.iterator()
            L_0x00c6:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x00dc
                java.lang.Object r6 = r2.next()
                net.safemoon.androidwallet.model.rpc2.doge.details.Output r6 = (net.safemoon.androidwallet.model.rpc2.doge.details.Output) r6
                java.lang.String r6 = r6.getValue()
                double r6 = java.lang.Double.parseDouble(r6)
                double r8 = r8 + r6
                goto L_0x00c6
            L_0x00dc:
                double r11 = r11 - r8
                java.lang.String r2 = r1.getFee()
                double r6 = java.lang.Double.parseDouble(r2)
                double r11 = r11 - r6
                goto L_0x013b
            L_0x00e7:
                if (r2 != 0) goto L_0x00eb
                r4 = r5
                goto L_0x00ec
            L_0x00eb:
                r4 = r2
            L_0x00ec:
                java.util.List r10 = r1.getOutputs()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r10 = r10.iterator()
            L_0x00f9:
                boolean r12 = r10.hasNext()
                if (r12 == 0) goto L_0x011b
                java.lang.Object r12 = r10.next()
                r13 = r12
                net.safemoon.androidwallet.model.rpc2.doge.details.Output r13 = (net.safemoon.androidwallet.model.rpc2.doge.details.Output) r13
                java.lang.String r13 = r13.getAddress()
                if (r13 == 0) goto L_0x0114
                boolean r13 = p000.yb6.m74344y(r13, r2, r7)
                if (r13 != r7) goto L_0x0114
                r13 = r7
                goto L_0x0115
            L_0x0114:
                r13 = r6
            L_0x0115:
                if (r13 == 0) goto L_0x00f9
                r11.add(r12)
                goto L_0x00f9
            L_0x011b:
                java.util.Iterator r2 = r11.iterator()
            L_0x011f:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0135
                java.lang.Object r6 = r2.next()
                net.safemoon.androidwallet.model.rpc2.doge.details.Output r6 = (net.safemoon.androidwallet.model.rpc2.doge.details.Output) r6
                java.lang.String r6 = r6.getValue()
                double r6 = java.lang.Double.parseDouble(r6)
                double r8 = r8 + r6
                goto L_0x011f
            L_0x0135:
                r11 = r8
                r18 = r5
                r5 = r4
                r4 = r18
            L_0x013b:
                java.math.BigDecimal r2 = new java.math.BigDecimal
                java.math.BigDecimal r6 = java.math.BigDecimal.ONE
                java.math.BigDecimal r7 = java.math.BigDecimal.TEN
                r8 = 8
                java.math.BigDecimal r7 = r7.pow(r8)
                java.math.BigDecimal r6 = r6.multiply(r7)
                long r6 = r6.longValue()
                double r6 = (double) r6
                double r6 = r6 * r11
                java.lang.String r6 = java.lang.String.valueOf(r6)
                r2.<init>(r6)
                java.math.BigInteger r2 = r2.toBigInteger()
                long r6 = r2.longValue()
                java.lang.String r2 = java.lang.String.valueOf(r6)
                net.safemoon.androidwallet.model.transaction.history.Result r6 = new net.safemoon.androidwallet.model.transaction.history.Result
                long r7 = r1.getTime()
                java.lang.String r9 = java.lang.String.valueOf(r7)
                java.lang.String r10 = r1.getHash()
                java.lang.String r13 = r2.toString()
                java.math.BigDecimal r2 = new java.math.BigDecimal
                java.lang.String r1 = r1.getFee()
                double r7 = java.lang.Double.parseDouble(r1)
                java.math.BigDecimal r1 = java.math.BigDecimal.ONE
                java.math.BigDecimal r11 = java.math.BigDecimal.TEN
                r12 = 9
                java.math.BigDecimal r11 = r11.pow(r12)
                java.math.BigDecimal r1 = r1.multiply(r11)
                long r14 = r1.longValue()
                double r14 = (double) r14
                double r7 = r7 * r14
                java.lang.String r1 = java.lang.String.valueOf(r7)
                r2.<init>(r1)
                java.math.BigInteger r1 = r2.toBigInteger()
                long r1 = r1.longValue()
                java.lang.String r14 = java.lang.String.valueOf(r1)
                java.math.BigDecimal r1 = java.math.BigDecimal.ONE
                java.math.BigDecimal r2 = java.math.BigDecimal.TEN
                java.math.BigDecimal r2 = r2.pow(r12)
                java.math.BigDecimal r1 = r1.multiply(r2)
                java.lang.String r15 = r1.toPlainString()
                r16 = 8
                r8 = r6
                r11 = r4
                r12 = r5
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE
                java.lang.String r1 = r1.getNativeToken()
                r6.tokenSymbol = r1
                k04 r1 = r3.mo61761j()
                r1.postValue(r6)
            L_0x01ce:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.TransferViewModel.C8866d.mo47104b(k90, bg5):void");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/TransferViewModel$e", "Lp90;", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$e */
    /* compiled from: TransferViewModel.kt */
    public static final class C8867e implements p90<BtcTxDetails> {

        /* renamed from: a */
        public final /* synthetic */ String f43008a;

        /* renamed from: b */
        public final /* synthetic */ TransferViewModel f43009b;

        public C8867e(String str, TransferViewModel transferViewModel) {
            this.f43008a = str;
            this.f43009b = transferViewModel;
        }

        /* renamed from: a */
        public void mo47103a(k90<BtcTxDetails> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
        }

        /* renamed from: b */
        public void mo47104b(k90<BtcTxDetails> k90, bg5<BtcTxDetails> bg5) {
            BtcTxDetails a;
            Boolean bool;
            String str;
            double d;
            String str2;
            double d2;
            Integer value;
            boolean z;
            String addr;
            String str3;
            double d3;
            double d4;
            double d5;
            Integer value2;
            boolean z2;
            String addr2;
            double d6;
            BtcTxDetails.Input.PrevOut prevOut;
            Integer value3;
            boolean z3;
            boolean z4;
            BtcTxDetails.Input.PrevOut prevOut2;
            String addr3;
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50581e() && (a = bg5.mo50578a()) != null) {
                String str4 = this.f43008a;
                TransferViewModel transferViewModel = this.f43009b;
                List<BtcTxDetails.Input> inputs = a.getInputs();
                if (inputs != null) {
                    if (!inputs.isEmpty()) {
                        Iterator<T> it = inputs.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            BtcTxDetails.Input input = (BtcTxDetails.Input) it.next();
                            if (input == null || (prevOut2 = input.getPrevOut()) == null || (addr3 = prevOut2.getAddr()) == null || !yb6.m74344y(addr3, str4, true)) {
                                z4 = false;
                                continue;
                            } else {
                                z4 = true;
                                continue;
                            }
                            if (z4) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = false;
                    bool = Boolean.valueOf(z3);
                } else {
                    bool = null;
                }
                Integer blockHeight = a.getBlockHeight();
                if (blockHeight != null) {
                    blockHeight.intValue();
                    str = "1";
                } else {
                    str = "";
                }
                String str5 = str;
                boolean b = vx2.m53586b(bool, Boolean.TRUE);
                String str6 = "-";
                double d7 = Utils.DOUBLE_EPSILON;
                if (b) {
                    if (str4 == null) {
                        str3 = str6;
                    } else {
                        str3 = str4;
                    }
                    double d8 = 0.0d;
                    for (BtcTxDetails.Input input2 : a.getInputs()) {
                        if (input2 == null || (prevOut = input2.getPrevOut()) == null || (value3 = prevOut.getValue()) == null) {
                            d6 = 0.0d;
                        } else {
                            d6 = (double) value3.intValue();
                        }
                        d8 += d6;
                    }
                    List<BtcTxDetails.Out> out = a.getOut();
                    if (out != null) {
                        ArrayList<BtcTxDetails.Out> arrayList = new ArrayList<>();
                        for (T next : out) {
                            BtcTxDetails.Out out2 = (BtcTxDetails.Out) next;
                            if (out2 == null || (addr2 = out2.getAddr()) == null || !yb6.m74344y(addr2, str4, true)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                arrayList.add(next);
                            }
                        }
                        d3 = 0.0d;
                        for (BtcTxDetails.Out out3 : arrayList) {
                            if (out3 == null || (value2 = out3.getValue()) == null) {
                                d5 = 0.0d;
                            } else {
                                d5 = (double) value2.intValue();
                            }
                            d3 += d5;
                        }
                    } else {
                        d3 = 0.0d;
                    }
                    double d9 = d8 - d3;
                    Integer fee = a.getFee();
                    if (fee != null) {
                        d4 = (double) fee.intValue();
                    } else {
                        d4 = 0.0d;
                    }
                    d = d9 - d4;
                    String str7 = str6;
                    str6 = str3;
                    str2 = str7;
                } else {
                    if (str4 == null) {
                        str2 = str6;
                    } else {
                        str2 = str4;
                    }
                    List<BtcTxDetails.Out> out4 = a.getOut();
                    if (out4 != null) {
                        ArrayList<BtcTxDetails.Out> arrayList2 = new ArrayList<>();
                        for (T next2 : out4) {
                            BtcTxDetails.Out out5 = (BtcTxDetails.Out) next2;
                            if (out5 == null || (addr = out5.getAddr()) == null || !yb6.m74344y(addr, str4, true)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                arrayList2.add(next2);
                            }
                        }
                        d = 0.0d;
                        for (BtcTxDetails.Out out6 : arrayList2) {
                            if (out6 == null || (value = out6.getValue()) == null) {
                                d2 = 0.0d;
                            } else {
                                d2 = (double) value.intValue();
                            }
                            d += d2;
                        }
                    } else {
                        d = 0.0d;
                    }
                }
                String valueOf = String.valueOf(new BigDecimal(String.valueOf(((double) BigDecimal.ONE.multiply(BigDecimal.TEN.pow(8)).longValue()) * d)).toBigInteger().longValue());
                String valueOf2 = String.valueOf(a.getTime());
                String hash = a.getHash();
                String bigDecimal = ol0.m70375q(valueOf, 8).toString();
                Integer fee2 = a.getFee();
                if (fee2 != null) {
                    d7 = (double) fee2.intValue();
                }
                Result result = new Result(valueOf2, hash, str6, str2, bigDecimal, new BigDecimal(String.valueOf(d7)).toBigInteger().toString(), BigDecimal.ONE.multiply(BigDecimal.TEN.pow(10)).toPlainString(), 8, str5);
                result.tokenSymbol = TokenType.MULTI_COIN_BITCOIN.getNativeToken();
                transferViewModel.mo61761j().postValue(result);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
    }

    /* renamed from: d */
    public final void mo61755d(TokenType tokenType) {
        vx2.m53591g(tokenType, "tokenType");
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new TransferViewModel$fetchAllTokens$1(this, tokenType, (ns0<? super TransferViewModel$fetchAllTokens$1>) null), 3, (Object) null);
    }

    /* renamed from: e */
    public final k04<List<IToken>> mo61756e() {
        return this.f42990b;
    }

    /* renamed from: f */
    public final k04<TransactionDetailsData> mo61757f() {
        return this.f42997i;
    }

    /* renamed from: g */
    public final void mo61758g(String str) {
        vx2.m53591g(str, "hash");
        C9384u3.m72574o().mo66083b(str).mo50512X(new C8864c(this));
    }

    /* renamed from: h */
    public final void mo61759h(IToken iToken, String str, double d) {
        vx2.m53591g(iToken, "iToken");
        vx2.m53591g(str, "receiver");
        Application b = mo27549b();
        vx2.m53590f(b, "getApplication()");
        this.f42993e = new Transfer(b, iToken, str, d);
        y23 y23 = this.f42996h;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f42996h = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new TransferViewModel$getEstimateGas$1(this, (ns0<? super TransferViewModel$getEstimateGas$1>) null), 3, (Object) null);
    }

    /* renamed from: i */
    public final k04<C8862a> mo61760i() {
        return this.f42994f;
    }

    /* renamed from: j */
    public final k04<Result> mo61761j() {
        return this.f42992d;
    }

    /* renamed from: k */
    public final k04<ReceiptStatus> mo61762k() {
        return this.f42991c;
    }

    /* renamed from: l */
    public final void mo61763l(TokenType tokenType, String str, String str2) {
        vx2.m53591g(tokenType, "tokenType");
        vx2.m53591g(str, "hash");
        vx2.m53591g(str2, Address.TYPE_NAME);
        if (tokenType == TokenType.MULTI_COIN_DOGE) {
            ol0.m70377s(tokenType).mo52391m(str).mo50512X(new C8866d(str2, this));
        } else if (tokenType == TokenType.MULTI_COIN_BITCOIN) {
            ol0.m70377s(tokenType).mo52390l(str).mo50512X(new C8867e(str2, this));
        }
    }

    /* renamed from: m */
    public final Result mo61764m(IToken iToken) {
        String b;
        String str;
        String str2;
        String str3;
        BigInteger h;
        BigDecimal scale;
        BigInteger k;
        BigDecimal scale2;
        BigInteger r;
        BigDecimal scale3;
        vx2.m53591g(iToken, "iToken");
        C8863b value = this.f42995g.getValue();
        String str4 = null;
        if (value == null || (b = value.mo61777b()) == null) {
            return null;
        }
        Result result = new Result();
        result.timeStamp = String.valueOf(Common.f42577a.mo60912s());
        result.hash = b;
        Transfer transfer = this.f42993e;
        vx2.m53588d(transfer);
        result.from = transfer.mo61856c();
        result.contractAddress = iToken.getContractAddress();
        Transfer transfer2 = this.f42993e;
        vx2.m53588d(transfer2);
        result.f42485to = transfer2.mo61868p();
        Transfer transfer3 = this.f42993e;
        boolean z = true;
        if (transfer3 == null || (r = transfer3.mo61870r()) == null || (scale3 = new BigDecimal(r).setScale(0)) == null) {
            str = null;
        } else {
            str = ol0.m70360g0(scale3, 0, 1, (Object) null);
        }
        result.value = str;
        result.tokenName = iToken.getName();
        result.tokenSymbol = iToken.getSymbol();
        result.tokenDecimal = Integer.valueOf(iToken.getDecimals());
        Transfer transfer4 = this.f42993e;
        if (transfer4 == null || (k = Transfer.m69210k(transfer4, (Double) null, 1, (Object) null)) == null || (scale2 = new BigDecimal(k).setScale(0)) == null) {
            str2 = null;
        } else {
            str2 = ol0.m70360g0(scale2, 0, 1, (Object) null);
        }
        result.gasPrice = str2;
        Transfer transfer5 = this.f42993e;
        if (!(transfer5 == null || (h = transfer5.mo61861h()) == null || (scale = new BigDecimal(h).setScale(0)) == null)) {
            str4 = ol0.m70360g0(scale, 0, 1, (Object) null);
        }
        result.gasUsed = str4;
        if (iToken.getContractAddress().length() != 0) {
            z = false;
        }
        if (z) {
            str3 = "0x";
        } else {
            str3 = "00000";
        }
        result.input = str3;
        return result;
    }

    /* renamed from: n */
    public final void mo61765n(String str, TokenType tokenType, String str2) {
        vx2.m53591g(str, "hash");
        vx2.m53591g(tokenType, "tokenType");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new TransferViewModel$getTransactionStatus$1(tokenType, str, this, (ns0<? super TransferViewModel$getTransactionStatus$1>) null), 3, (Object) null);
    }

    /* renamed from: o */
    public final Transfer mo61766o() {
        return this.f42993e;
    }

    /* renamed from: p */
    public final k04<C8863b> mo61767p() {
        return this.f42995g;
    }

    /* renamed from: q */
    public final EvmRequestTransaction mo61768q(IToken iToken, String str) {
        String str2;
        String str3;
        Double d;
        Double d2;
        BigInteger h;
        BigDecimal scale;
        String p;
        String c;
        vx2.m53591g(iToken, "iToken");
        String str4 = null;
        if (str == null) {
            return null;
        }
        Transfer transfer = this.f42993e;
        if (transfer == null || (c = transfer.mo61856c()) == null) {
            str2 = null;
        } else {
            str2 = StringsKt__StringsKt.m63090V0(c).toString();
        }
        vx2.m53588d(str2);
        Transfer transfer2 = this.f42993e;
        if (transfer2 == null || (p = transfer2.mo61868p()) == null) {
            str3 = null;
        } else {
            str3 = StringsKt__StringsKt.m63090V0(p).toString();
        }
        vx2.m53588d(str3);
        Transfer transfer3 = this.f42993e;
        if (transfer3 != null) {
            d = Double.valueOf(transfer3.mo61857d());
        } else {
            d = null;
        }
        vx2.m53588d(d);
        double doubleValue = d.doubleValue();
        String symbol = iToken.getSymbol();
        Transfer transfer4 = this.f42993e;
        if (transfer4 != null) {
            d2 = transfer4.mo61864l();
        } else {
            d2 = null;
        }
        vx2.m53588d(d2);
        EvmRequestTransaction evmRequestTransaction = new EvmRequestTransaction(str, str2, str3, doubleValue, symbol, (long) d2.doubleValue(), TokenType.Companion.mo57099b(iToken.getChainId()).getOptionalName(), Common.f42577a.mo60903j());
        Transfer transfer5 = this.f42993e;
        if (!(transfer5 == null || (h = transfer5.mo61861h()) == null || (scale = new BigDecimal(h).setScale(0)) == null)) {
            str4 = ol0.m70360g0(scale, 0, 1, (Object) null);
        }
        evmRequestTransaction.setGasUsed(str4);
        return evmRequestTransaction;
    }

    /* renamed from: r */
    public final void mo61769r(IToken iToken, rc2<? super Double, r37> rc2) {
        vx2.m53591g(iToken, "iToken");
        vx2.m53591g(rc2, "errorCallBack");
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new TransferViewModel$sendTransfer$1(this, rc2, iToken, (ns0<? super TransferViewModel$sendTransfer$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0251, code lost:
        r0 = r0.status;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0254, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0257, code lost:
        r2 = r0;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0259, code lost:
        p000.vx2.m53588d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0260, code lost:
        if (r0.length() <= 0) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0262, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0264, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0265, code lost:
        if (r0 == false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0267, code lost:
        r5 = r5.mo27549b();
        p000.vx2.m53590f(r5, "getApplication()");
        r16 = new net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer(r5, new net.safemoon.androidwallet.model.token.gson.GsonToken("Fake", "", "", "", net.safemoon.androidwallet.common.TokenType.Companion.mo57100c(r2.getChainName()).getChainId(), 0, false, "", 0, (java.lang.String) null, com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON, com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON, com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON, 7936, (kotlin.jvm.internal.DefaultConstructorMarker) null), r2.getTo(), r2.getAmount());
        r5 = r2.getTransactionHash();
        r3.L$0 = r2;
        r3.L$1 = null;
        r3.label = 7;
        r0 = r16.mo61867o(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02c3, code lost:
        if (r0 != r4) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c5, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02c6, code lost:
        r0 = (p000.ks1) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02c8, code lost:
        if (r0 == null) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ce, code lost:
        if (r0.getError() != null) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02d0, code lost:
        r0 = (p000.au6) r0.getResult();
        r2.setTransactionIndex(r0.getTransactionIndexRaw());
        r2.setBlockHash(r0.getBlockHash());
        r2.setBlockNumber(r0.getBlockNumberRaw());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02ef, code lost:
        if (r0.isStatusOK() == false) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02f1, code lost:
        r7 = p000.a40.m31673d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02f7, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r7 = p000.a40.m31673d(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r2.setStatus(r7);
        r2.setGasUsed(r0.getGasUsedRaw());
        r0 = p000.C9384u3.m72574o().mo66091j(r2);
        p000.vx2.m53590f(r0, "getSafeMoonClient().save…ction(requestTransaction)");
        r3.L$0 = null;
        r3.label = 8;
        r0 = retrofit2.KotlinExtensions.m71521c(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x031b, code lost:
        if (r0 != r4) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x031d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0324, code lost:
        if (((p000.bg5) r0).mo50581e() == false) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x032d, code lost:
        throw new java.lang.Exception("Response Fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x032e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x032f, code lost:
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0337, code lost:
        throw new java.lang.Exception("Response Fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x033d, code lost:
        throw new java.lang.Exception("Response Fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0366, code lost:
        r0 = (p000.bg5) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x038f, code lost:
        r0 = (p000.bg5) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0395, code lost:
        if (r0.mo50581e() == false) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0397, code lost:
        r5 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction) r0.mo50578a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x039d, code lost:
        if (r5 == null) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x039f, code lost:
        r10 = r5.getFees();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03a3, code lost:
        if (r10 != null) goto L_0x03a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03a6, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03a7, code lost:
        if (r5 == null) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03ad, code lost:
        if (r5.getBlockhash() == null) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03af, code lost:
        r5 = "1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03b1, code lost:
        r5 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03b3, code lost:
        r35 = r9;
        r9 = r5;
        r5 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03b9, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03be, code lost:
        if (r9.length() <= 0) goto L_0x03c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03c0, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03c2, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03c3, code lost:
        if (r10 == false) goto L_0x045e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03c5, code lost:
        r0 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction) r0.mo50578a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03cb, code lost:
        if (r0 == null) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03cd, code lost:
        r10 = r0.getBlockhash();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03d1, code lost:
        if (r10 == null) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03d3, code lost:
        r10 = okhttp3.internal.Util.toHexString(r10.hashCode());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03dc, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03dd, code lost:
        r2.setTransactionIndex("0x" + r10);
        r2.setBlockHash(r0.getTxid());
        r2.setBlockNumber(r0.getBlockhash());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0401, code lost:
        if (p000.vx2.m53586b(r9, "1") == false) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0403, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0408, code lost:
        r9 = p000.a40.m31673d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x040b, code lost:
        r0 = true;
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r9 = p000.a40.m31673d(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0411, code lost:
        r2.setStatus(r9);
        r2.setGasUsed("0x" + okhttp3.internal.Util.toHexString(java.lang.Long.parseLong(r5)));
        r2 = p000.C9384u3.m72574o().mo66091j(r2);
        p000.vx2.m53590f(r2, "getSafeMoonClient().save…ction(requestTransaction)");
        r3.L$0 = null;
        r3.label = 3;
        r2 = retrofit2.KotlinExtensions.m71521c(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0442, code lost:
        if (r2 != r4) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0444, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x044b, code lost:
        if (((p000.bg5) r2).mo50581e() == false) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x044d, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0454, code lost:
        throw new java.lang.Exception("Response Fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0455, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x045d, code lost:
        throw new java.lang.Exception("Response Fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0464, code lost:
        throw new java.lang.Exception("Response Fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x046c, code lost:
        r0 = r0.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0470, code lost:
        if (r0 != null) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0472, code lost:
        p000.ol0.m70350b0(r0, "TxnListService-Error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0477, code lost:
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x047c, code lost:
        return p000.a40.m31670a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ea, code lost:
        r0 = (p000.bg5) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f0, code lost:
        p000.vx2.m53588d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f7, code lost:
        if (r0.mo50581e() == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f9, code lost:
        r10 = r0.mo50578a();
        p000.vx2.m53588d(r10);
        r10 = (net.safemoon.androidwallet.model.transaction.solana.SolStatus) r10;
        r12 = r10.getStatus();
        r14 = java.util.Locale.ROOT;
        r12 = r12.toLowerCase(r14);
        p000.vx2.m53590f(r12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        r14 = "Success".toLowerCase(r14);
        p000.vx2.m53590f(r14, "this as java.lang.String).toLowerCase(Locale.ROOT)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        if (p000.vx2.m53586b(r12, r14) == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011e, code lost:
        r2 = java.lang.String.valueOf(r10.getFee());
        r9 = "1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0129, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012e, code lost:
        if (r9.length() <= 0) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0130, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0132, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0133, code lost:
        if (r10 == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0135, code lost:
        r0 = (net.safemoon.androidwallet.model.transaction.solana.SolStatus) r0.mo50578a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013b, code lost:
        if (r0 == null) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
        r10 = new kotlin.jvm.internal.Ref$ObjectRef();
        r17 = r5.getTransactionHash();
        r18 = r5.getFrom();
        r19 = r5.getTo();
        r20 = r5.getAmount();
        r22 = r5.getSymbol();
        r6 = r6.f42993e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        if (r6 == null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015c, code lost:
        r6 = r6.mo61863j((java.lang.Double) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0161, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0162, code lost:
        p000.vx2.m53588d(r6);
        r16 = new net.safemoon.androidwallet.model.request.EvmRequestTransaction(r17, r18, r19, r20, r22, r6.longValue(), r5.getChainName(), r5.getRequestTime());
        r16.setTransactionIndex("0x" + okhttp3.internal.Util.toHexString(r0.getSlot()));
        r16.setBlockHash(r0.getTxHash());
        r16.setBlockNumber(java.lang.String.valueOf(r0.getSlot()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a6, code lost:
        if (p000.vx2.m53586b(r9, "1") == false) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a8, code lost:
        r5 = p000.a40.m31673d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ae, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b3, code lost:
        r5 = p000.a40.m31673d(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r16.setStatus(r5);
        r16.setGasUsed("0x" + okhttp3.internal.Util.toHexString(java.lang.Long.parseLong(r2)));
        r10.element = r16;
        r0 = p000.C9384u3.m72574o().mo66091j((net.safemoon.androidwallet.model.request.EvmRequestTransaction) r10.element);
        p000.vx2.m53590f(r0, "getSafeMoonClient().save…on(requestTransactionNew)");
        r3.L$0 = null;
        r3.L$1 = null;
        r3.label = 5;
        r0 = retrofit2.KotlinExtensions.m71521c(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ef, code lost:
        if (r0 != r4) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f1, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f8, code lost:
        if (((p000.bg5) r0).mo50581e() == false) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01fa, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0202, code lost:
        throw new java.lang.Exception("Response Fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0208, code lost:
        throw new java.lang.Exception("Response Fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x020e, code lost:
        throw new java.lang.Exception("Response Fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0241, code lost:
        r0 = (p000.bg5) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0243, code lost:
        if (r0 == null) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0245, code lost:
        r0 = (net.safemoon.androidwallet.model.ReceiptStatus) r0.mo50578a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x024b, code lost:
        if (r0 == null) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x024d, code lost:
        r0 = r0.result;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x024f, code lost:
        if (r0 == null) goto L_0x0254;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c A[SYNTHETIC, Splitter:B:10:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A[Catch:{ Exception -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069 A[Catch:{ Exception -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:73:0x01b4=Splitter:B:73:0x01b4, B:122:0x02fc=Splitter:B:122:0x02fc} */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61770s(net.safemoon.androidwallet.model.token.abstraction.IToken r37, net.safemoon.androidwallet.viewmodels.TransferViewModel.C8863b r38, p000.ns0<? super java.lang.Boolean> r39) {
        /*
            r36 = this;
            r1 = r36
            r0 = r39
            java.lang.String r2 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            boolean r3 = r0 instanceof net.safemoon.androidwallet.viewmodels.TransferViewModel$submitTx$1
            if (r3 == 0) goto L_0x0019
            r3 = r0
            net.safemoon.androidwallet.viewmodels.TransferViewModel$submitTx$1 r3 = (net.safemoon.androidwallet.viewmodels.TransferViewModel$submitTx$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            net.safemoon.androidwallet.viewmodels.TransferViewModel$submitTx$1 r3 = new net.safemoon.androidwallet.viewmodels.TransferViewModel$submitTx$1
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.result
            java.lang.Object r4 = p000.wx2.m54101d()
            int r5 = r3.label
            java.lang.String r6 = "getSafeMoonClient().save…ction(requestTransaction)"
            java.lang.String r7 = "0x"
            java.lang.String r8 = "1"
            java.lang.String r9 = "0"
            java.lang.String r11 = "Response Fail"
            r13 = 0
            switch(r5) {
                case 0: goto L_0x0087;
                case 1: goto L_0x007e;
                case 2: goto L_0x0075;
                case 3: goto L_0x0069;
                case 4: goto L_0x005c;
                case 5: goto L_0x0057;
                case 6: goto L_0x004a;
                case 7: goto L_0x0041;
                case 8: goto L_0x003c;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003c:
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x031e
        L_0x0041:
            java.lang.Object r2 = r3.L$0
            net.safemoon.androidwallet.model.request.EvmRequestTransaction r2 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r2
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x02c6
        L_0x004a:
            java.lang.Object r2 = r3.L$1
            net.safemoon.androidwallet.model.request.EvmRequestTransaction r2 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r2
            java.lang.Object r5 = r3.L$0
            net.safemoon.androidwallet.viewmodels.TransferViewModel r5 = (net.safemoon.androidwallet.viewmodels.TransferViewModel) r5
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0241
        L_0x0057:
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x01f2
        L_0x005c:
            java.lang.Object r5 = r3.L$1
            net.safemoon.androidwallet.model.request.EvmRequestTransaction r5 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r5
            java.lang.Object r6 = r3.L$0
            net.safemoon.androidwallet.viewmodels.TransferViewModel r6 = (net.safemoon.androidwallet.viewmodels.TransferViewModel) r6
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x00ea
        L_0x0069:
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x0071 }
            r2 = r0
            r0 = 1
            r8 = 0
            goto L_0x0445
        L_0x0071:
            r0 = move-exception
            r8 = 0
            goto L_0x046c
        L_0x0075:
            java.lang.Object r2 = r3.L$0
            net.safemoon.androidwallet.model.request.EvmRequestTransaction r2 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r2
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x038f
        L_0x007e:
            java.lang.Object r2 = r3.L$0
            net.safemoon.androidwallet.model.request.EvmRequestTransaction r2 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r2
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0366
        L_0x0087:
            p000.hg5.m45199b(r0)
            java.lang.String r0 = r38.mo61777b()     // Catch:{ Exception -> 0x0071 }
            r5 = r37
            net.safemoon.androidwallet.model.request.EvmRequestTransaction r0 = r1.mo61768q(r5, r0)     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.common.TokenType$a r5 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x0071 }
            p000.vx2.m53588d(r0)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r14 = r0.getChainName()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.common.TokenType r5 = r5.mo57100c(r14)     // Catch:{ Exception -> 0x0071 }
            int r14 = r5.getChainId()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.common.TokenType r15 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_BITCOIN     // Catch:{ Exception -> 0x0071 }
            int r10 = r15.getChainId()     // Catch:{ Exception -> 0x0071 }
            r12 = 2
            if (r14 == r10) goto L_0x0341
            int r10 = r5.getChainId()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.common.TokenType r14 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE     // Catch:{ Exception -> 0x0071 }
            int r14 = r14.getChainId()     // Catch:{ Exception -> 0x0071 }
            if (r10 != r14) goto L_0x00bc
            goto L_0x0341
        L_0x00bc:
            int r10 = r5.getChainId()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.common.TokenType r14 = net.safemoon.androidwallet.common.TokenType.SOLANA     // Catch:{ Exception -> 0x0071 }
            int r14 = r14.getChainId()     // Catch:{ Exception -> 0x0071 }
            if (r10 != r14) goto L_0x020f
            i30 r5 = p000.ol0.m70377s(r5)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r6 = r0.getTransactionHash()     // Catch:{ Exception -> 0x0071 }
            k90 r5 = p000.i30.C7204a.m58796e(r5, r6, r13, r12, r13)     // Catch:{ Exception -> 0x0071 }
            if (r5 == 0) goto L_0x00ed
            r3.L$0 = r1     // Catch:{ Exception -> 0x0071 }
            r3.L$1 = r0     // Catch:{ Exception -> 0x0071 }
            r6 = 4
            r3.label = r6     // Catch:{ Exception -> 0x0071 }
            java.lang.Object r5 = retrofit2.KotlinExtensions.m71521c(r5, r3)     // Catch:{ Exception -> 0x0071 }
            if (r5 != r4) goto L_0x00e4
            return r4
        L_0x00e4:
            r6 = r1
            r35 = r5
            r5 = r0
            r0 = r35
        L_0x00ea:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x0071 }
            goto L_0x00f0
        L_0x00ed:
            r5 = r0
            r6 = r1
            r0 = r13
        L_0x00f0:
            p000.vx2.m53588d(r0)     // Catch:{ Exception -> 0x0071 }
            boolean r10 = r0.mo50581e()     // Catch:{ Exception -> 0x0071 }
            if (r10 == 0) goto L_0x0129
            java.lang.Object r10 = r0.mo50578a()     // Catch:{ Exception -> 0x0071 }
            p000.vx2.m53588d(r10)     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.model.transaction.solana.SolStatus r10 = (net.safemoon.androidwallet.model.transaction.solana.SolStatus) r10     // Catch:{ Exception -> 0x0071 }
            java.lang.String r12 = r10.getStatus()     // Catch:{ Exception -> 0x0071 }
            java.util.Locale r14 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x0071 }
            java.lang.String r12 = r12.toLowerCase(r14)     // Catch:{ Exception -> 0x0071 }
            p000.vx2.m53590f(r12, r2)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r15 = "Success"
            java.lang.String r14 = r15.toLowerCase(r14)     // Catch:{ Exception -> 0x0071 }
            p000.vx2.m53590f(r14, r2)     // Catch:{ Exception -> 0x0071 }
            boolean r2 = p000.vx2.m53586b(r12, r14)     // Catch:{ Exception -> 0x0071 }
            if (r2 == 0) goto L_0x0129
            int r2 = r10.getFee()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r9 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0071 }
            r2 = r9
            r9 = r8
            goto L_0x012a
        L_0x0129:
            r2 = r9
        L_0x012a:
            int r10 = r9.length()     // Catch:{ Exception -> 0x0071 }
            if (r10 <= 0) goto L_0x0132
            r10 = 1
            goto L_0x0133
        L_0x0132:
            r10 = 0
        L_0x0133:
            if (r10 == 0) goto L_0x0209
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.model.transaction.solana.SolStatus r0 = (net.safemoon.androidwallet.model.transaction.solana.SolStatus) r0     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x0203
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ Exception -> 0x0071 }
            r10.<init>()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.model.request.EvmRequestTransaction r12 = new net.safemoon.androidwallet.model.request.EvmRequestTransaction     // Catch:{ Exception -> 0x0071 }
            java.lang.String r17 = r5.getTransactionHash()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r18 = r5.getFrom()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r19 = r5.getTo()     // Catch:{ Exception -> 0x0071 }
            double r20 = r5.getAmount()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r22 = r5.getSymbol()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer r6 = r6.f42993e     // Catch:{ Exception -> 0x0071 }
            if (r6 == 0) goto L_0x0161
            java.math.BigInteger r6 = r6.mo61863j(r13)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0162
        L_0x0161:
            r6 = r13
        L_0x0162:
            p000.vx2.m53588d(r6)     // Catch:{ Exception -> 0x0071 }
            long r23 = r6.longValue()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r25 = r5.getChainName()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r26 = r5.getRequestTime()     // Catch:{ Exception -> 0x0071 }
            r16 = r12
            r16.<init>(r17, r18, r19, r20, r22, r23, r25, r26)     // Catch:{ Exception -> 0x0071 }
            int r5 = r0.getSlot()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r5 = okhttp3.internal.Util.toHexString((int) r5)     // Catch:{ Exception -> 0x0071 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0071 }
            r6.<init>()     // Catch:{ Exception -> 0x0071 }
            r6.append(r7)     // Catch:{ Exception -> 0x0071 }
            r6.append(r5)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0071 }
            r12.setTransactionIndex(r5)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r5 = r0.getTxHash()     // Catch:{ Exception -> 0x0071 }
            r12.setBlockHash(r5)     // Catch:{ Exception -> 0x0071 }
            int r0 = r0.getSlot()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0071 }
            r12.setBlockNumber(r0)     // Catch:{ Exception -> 0x0071 }
            boolean r0 = p000.vx2.m53586b(r9, r8)     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x01ae
            r0 = 1
            java.lang.Integer r5 = p000.a40.m31673d(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x01b4
        L_0x01ae:
            r5 = 0
            java.lang.Integer r0 = p000.a40.m31673d(r5)     // Catch:{ Exception -> 0x032e }
            r5 = r0
        L_0x01b4:
            r12.setStatus(r5)     // Catch:{ Exception -> 0x0071 }
            long r5 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r0 = okhttp3.internal.Util.toHexString((long) r5)     // Catch:{ Exception -> 0x0071 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0071 }
            r2.<init>()     // Catch:{ Exception -> 0x0071 }
            r2.append(r7)     // Catch:{ Exception -> 0x0071 }
            r2.append(r0)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0071 }
            r12.setGasUsed(r0)     // Catch:{ Exception -> 0x0071 }
            r10.element = r12     // Catch:{ Exception -> 0x0071 }
            tk5 r0 = p000.C9384u3.m72574o()     // Catch:{ Exception -> 0x0071 }
            T r2 = r10.element     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.model.request.EvmRequestTransaction r2 = (net.safemoon.androidwallet.model.request.EvmRequestTransaction) r2     // Catch:{ Exception -> 0x0071 }
            k90 r0 = r0.mo66091j(r2)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r2 = "getSafeMoonClient().save…on(requestTransactionNew)"
            p000.vx2.m53590f(r0, r2)     // Catch:{ Exception -> 0x0071 }
            r3.L$0 = r13     // Catch:{ Exception -> 0x0071 }
            r3.L$1 = r13     // Catch:{ Exception -> 0x0071 }
            r2 = 5
            r3.label = r2     // Catch:{ Exception -> 0x0071 }
            java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r3)     // Catch:{ Exception -> 0x0071 }
            if (r0 != r4) goto L_0x01f2
            return r4
        L_0x01f2:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x0071 }
            boolean r0 = r0.mo50581e()     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x01fd
        L_0x01fa:
            r10 = 1
            goto L_0x0478
        L_0x01fd:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0071 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0071 }
            throw r0     // Catch:{ Exception -> 0x0071 }
        L_0x0203:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0071 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0071 }
            throw r0     // Catch:{ Exception -> 0x0071 }
        L_0x0209:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0071 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0071 }
            throw r0     // Catch:{ Exception -> 0x0071 }
        L_0x020f:
            net.safemoon.androidwallet.common.MyCoinType r2 = r5.getCoinType()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.common.SimilarTypeGroup r2 = r2.getSimilarTypeGroup()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.common.SimilarTypeGroup r7 = net.safemoon.androidwallet.common.SimilarTypeGroup.EVM_CAPABILITY     // Catch:{ Exception -> 0x0071 }
            if (r2 != r7) goto L_0x033e
            i30 r2 = p000.ol0.m70377s(r5)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r7 = r0.getTransactionHash()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r5 = p000.ol0.m70382x(r5)     // Catch:{ Exception -> 0x0071 }
            k90 r2 = r2.mo52378a(r7, r5)     // Catch:{ Exception -> 0x0071 }
            if (r2 == 0) goto L_0x0256
            r3.L$0 = r1     // Catch:{ Exception -> 0x0071 }
            r3.L$1 = r0     // Catch:{ Exception -> 0x0071 }
            r5 = 6
            r3.label = r5     // Catch:{ Exception -> 0x0071 }
            java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r2, r3)     // Catch:{ Exception -> 0x0071 }
            if (r2 != r4) goto L_0x023b
            return r4
        L_0x023b:
            r5 = r1
            r35 = r2
            r2 = r0
            r0 = r35
        L_0x0241:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x0254
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.model.ReceiptStatus r0 = (net.safemoon.androidwallet.model.ReceiptStatus) r0     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x0254
            net.safemoon.androidwallet.model.ReceiptStatus$Result r0 = r0.result     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x0254
            java.lang.String r0 = r0.status     // Catch:{ Exception -> 0x0071 }
            goto L_0x0259
        L_0x0254:
            r0 = r2
            goto L_0x0257
        L_0x0256:
            r5 = r1
        L_0x0257:
            r2 = r0
            r0 = r13
        L_0x0259:
            p000.vx2.m53588d(r0)     // Catch:{ Exception -> 0x0071 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0071 }
            if (r0 <= 0) goto L_0x0264
            r0 = 1
            goto L_0x0265
        L_0x0264:
            r0 = 0
        L_0x0265:
            if (r0 == 0) goto L_0x0338
            net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer     // Catch:{ Exception -> 0x0071 }
            android.app.Application r5 = r5.mo27549b()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r7 = "getApplication()"
            p000.vx2.m53590f(r5, r7)     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.model.token.gson.GsonToken r7 = new net.safemoon.androidwallet.model.token.gson.GsonToken     // Catch:{ Exception -> 0x0071 }
            java.lang.String r17 = "Fake"
            java.lang.String r18 = ""
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            net.safemoon.androidwallet.common.TokenType$a r8 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x0071 }
            java.lang.String r9 = r2.getChainName()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.common.TokenType r8 = r8.mo57100c(r9)     // Catch:{ Exception -> 0x0071 }
            int r21 = r8.getChainId()     // Catch:{ Exception -> 0x0071 }
            r22 = 0
            r23 = 0
            java.lang.String r24 = ""
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 7936(0x1f00, float:1.1121E-41)
            r34 = 0
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r34)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r19 = r2.getTo()     // Catch:{ Exception -> 0x0071 }
            double r20 = r2.getAmount()     // Catch:{ Exception -> 0x0071 }
            r16 = r0
            r17 = r5
            r18 = r7
            r16.<init>(r17, r18, r19, r20)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r5 = r2.getTransactionHash()     // Catch:{ Exception -> 0x0071 }
            r3.L$0 = r2     // Catch:{ Exception -> 0x0071 }
            r3.L$1 = r13     // Catch:{ Exception -> 0x0071 }
            r7 = 7
            r3.label = r7     // Catch:{ Exception -> 0x0071 }
            java.lang.Object r0 = r0.mo61867o(r5, r3)     // Catch:{ Exception -> 0x0071 }
            if (r0 != r4) goto L_0x02c6
            return r4
        L_0x02c6:
            ks1 r0 = (p000.ks1) r0     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x0332
            ag5$a r5 = r0.getError()     // Catch:{ Exception -> 0x0071 }
            if (r5 != 0) goto L_0x0332
            java.lang.Object r0 = r0.getResult()     // Catch:{ Exception -> 0x0071 }
            au6 r0 = (p000.au6) r0     // Catch:{ Exception -> 0x0071 }
            java.lang.String r5 = r0.getTransactionIndexRaw()     // Catch:{ Exception -> 0x0071 }
            r2.setTransactionIndex(r5)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r5 = r0.getBlockHash()     // Catch:{ Exception -> 0x0071 }
            r2.setBlockHash(r5)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r5 = r0.getBlockNumberRaw()     // Catch:{ Exception -> 0x0071 }
            r2.setBlockNumber(r5)     // Catch:{ Exception -> 0x0071 }
            boolean r5 = r0.isStatusOK()     // Catch:{ Exception -> 0x0071 }
            if (r5 == 0) goto L_0x02f7
            r5 = 1
            java.lang.Integer r7 = p000.a40.m31673d(r5)     // Catch:{ Exception -> 0x0071 }
            goto L_0x02fc
        L_0x02f7:
            r5 = 0
            java.lang.Integer r7 = p000.a40.m31673d(r5)     // Catch:{ Exception -> 0x032e }
        L_0x02fc:
            r2.setStatus(r7)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r0 = r0.getGasUsedRaw()     // Catch:{ Exception -> 0x0071 }
            r2.setGasUsed(r0)     // Catch:{ Exception -> 0x0071 }
            tk5 r0 = p000.C9384u3.m72574o()     // Catch:{ Exception -> 0x0071 }
            k90 r0 = r0.mo66091j(r2)     // Catch:{ Exception -> 0x0071 }
            p000.vx2.m53590f(r0, r6)     // Catch:{ Exception -> 0x0071 }
            r3.L$0 = r13     // Catch:{ Exception -> 0x0071 }
            r2 = 8
            r3.label = r2     // Catch:{ Exception -> 0x0071 }
            java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r3)     // Catch:{ Exception -> 0x0071 }
            if (r0 != r4) goto L_0x031e
            return r4
        L_0x031e:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x0071 }
            boolean r0 = r0.mo50581e()     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x0328
            goto L_0x01fa
        L_0x0328:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0071 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0071 }
            throw r0     // Catch:{ Exception -> 0x0071 }
        L_0x032e:
            r0 = move-exception
            r8 = r5
            goto L_0x046c
        L_0x0332:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0071 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0071 }
            throw r0     // Catch:{ Exception -> 0x0071 }
        L_0x0338:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0071 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0071 }
            throw r0     // Catch:{ Exception -> 0x0071 }
        L_0x033e:
            r10 = 0
            goto L_0x0478
        L_0x0341:
            int r2 = r5.getChainId()     // Catch:{ Exception -> 0x0071 }
            int r10 = r15.getChainId()     // Catch:{ Exception -> 0x0071 }
            if (r2 != r10) goto L_0x0369
            ll1 r2 = p000.ll1.f40640a     // Catch:{ Exception -> 0x0071 }
            java.lang.String r5 = r0.getTransactionHash()     // Catch:{ Exception -> 0x0071 }
            k90 r2 = r2.mo55916b(r5)     // Catch:{ Exception -> 0x0071 }
            r3.L$0 = r0     // Catch:{ Exception -> 0x0071 }
            r5 = 1
            r3.label = r5     // Catch:{ Exception -> 0x0071 }
            java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r2, r3)     // Catch:{ Exception -> 0x0071 }
            if (r2 != r4) goto L_0x0361
            return r4
        L_0x0361:
            r35 = r2
            r2 = r0
            r0 = r35
        L_0x0366:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x0071 }
            goto L_0x0391
        L_0x0369:
            int r2 = r5.getChainId()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.common.TokenType r5 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE     // Catch:{ Exception -> 0x0071 }
            int r5 = r5.getChainId()     // Catch:{ Exception -> 0x0071 }
            if (r2 != r5) goto L_0x0465
            ll1 r2 = p000.ll1.f40640a     // Catch:{ Exception -> 0x0071 }
            java.lang.String r5 = r0.getTransactionHash()     // Catch:{ Exception -> 0x0071 }
            k90 r2 = r2.mo55919e(r5)     // Catch:{ Exception -> 0x0071 }
            r3.L$0 = r0     // Catch:{ Exception -> 0x0071 }
            r3.label = r12     // Catch:{ Exception -> 0x0071 }
            java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r2, r3)     // Catch:{ Exception -> 0x0071 }
            if (r2 != r4) goto L_0x038a
            return r4
        L_0x038a:
            r35 = r2
            r2 = r0
            r0 = r35
        L_0x038f:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x0071 }
        L_0x0391:
            boolean r5 = r0.mo50581e()     // Catch:{ Exception -> 0x0071 }
            if (r5 == 0) goto L_0x03b9
            java.lang.Object r5 = r0.mo50578a()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction r5 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction) r5     // Catch:{ Exception -> 0x0071 }
            if (r5 == 0) goto L_0x03a7
            java.lang.String r10 = r5.getFees()     // Catch:{ Exception -> 0x0071 }
            if (r10 != 0) goto L_0x03a6
            goto L_0x03a7
        L_0x03a6:
            r9 = r10
        L_0x03a7:
            if (r5 == 0) goto L_0x03b1
            java.lang.String r5 = r5.getBlockhash()     // Catch:{ Exception -> 0x0071 }
            if (r5 == 0) goto L_0x03b1
            r5 = r8
            goto L_0x03b3
        L_0x03b1:
            java.lang.String r5 = ""
        L_0x03b3:
            r35 = r9
            r9 = r5
            r5 = r35
            goto L_0x03ba
        L_0x03b9:
            r5 = r9
        L_0x03ba:
            int r10 = r9.length()     // Catch:{ Exception -> 0x0071 }
            if (r10 <= 0) goto L_0x03c2
            r10 = 1
            goto L_0x03c3
        L_0x03c2:
            r10 = 0
        L_0x03c3:
            if (r10 == 0) goto L_0x045e
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x0071 }
            net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction r0 = (net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction) r0     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x0457
            java.lang.String r10 = r0.getBlockhash()     // Catch:{ Exception -> 0x0071 }
            if (r10 == 0) goto L_0x03dc
            int r10 = r10.hashCode()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r10 = okhttp3.internal.Util.toHexString((int) r10)     // Catch:{ Exception -> 0x0071 }
            goto L_0x03dd
        L_0x03dc:
            r10 = r13
        L_0x03dd:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0071 }
            r12.<init>()     // Catch:{ Exception -> 0x0071 }
            r12.append(r7)     // Catch:{ Exception -> 0x0071 }
            r12.append(r10)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r10 = r12.toString()     // Catch:{ Exception -> 0x0071 }
            r2.setTransactionIndex(r10)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r10 = r0.getTxid()     // Catch:{ Exception -> 0x0071 }
            r2.setBlockHash(r10)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r0 = r0.getBlockhash()     // Catch:{ Exception -> 0x0071 }
            r2.setBlockNumber(r0)     // Catch:{ Exception -> 0x0071 }
            boolean r0 = p000.vx2.m53586b(r9, r8)     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x040b
            r0 = 1
            java.lang.Integer r8 = p000.a40.m31673d(r0)     // Catch:{ Exception -> 0x0071 }
            r9 = r8
            r8 = 0
            goto L_0x0411
        L_0x040b:
            r0 = 1
            r8 = 0
            java.lang.Integer r9 = p000.a40.m31673d(r8)     // Catch:{ Exception -> 0x0455 }
        L_0x0411:
            r2.setStatus(r9)     // Catch:{ Exception -> 0x0455 }
            long r9 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x0455 }
            java.lang.String r5 = okhttp3.internal.Util.toHexString((long) r9)     // Catch:{ Exception -> 0x0455 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0455 }
            r9.<init>()     // Catch:{ Exception -> 0x0455 }
            r9.append(r7)     // Catch:{ Exception -> 0x0455 }
            r9.append(r5)     // Catch:{ Exception -> 0x0455 }
            java.lang.String r5 = r9.toString()     // Catch:{ Exception -> 0x0455 }
            r2.setGasUsed(r5)     // Catch:{ Exception -> 0x0455 }
            tk5 r5 = p000.C9384u3.m72574o()     // Catch:{ Exception -> 0x0455 }
            k90 r2 = r5.mo66091j(r2)     // Catch:{ Exception -> 0x0455 }
            p000.vx2.m53590f(r2, r6)     // Catch:{ Exception -> 0x0455 }
            r3.L$0 = r13     // Catch:{ Exception -> 0x0455 }
            r5 = 3
            r3.label = r5     // Catch:{ Exception -> 0x0455 }
            java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r2, r3)     // Catch:{ Exception -> 0x0455 }
            if (r2 != r4) goto L_0x0445
            return r4
        L_0x0445:
            bg5 r2 = (p000.bg5) r2     // Catch:{ Exception -> 0x0455 }
            boolean r2 = r2.mo50581e()     // Catch:{ Exception -> 0x0455 }
            if (r2 == 0) goto L_0x044f
            r10 = r0
            goto L_0x0478
        L_0x044f:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0455 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0455 }
            throw r0     // Catch:{ Exception -> 0x0455 }
        L_0x0455:
            r0 = move-exception
            goto L_0x046c
        L_0x0457:
            r8 = 0
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0455 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0455 }
            throw r0     // Catch:{ Exception -> 0x0455 }
        L_0x045e:
            r8 = 0
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0455 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0455 }
            throw r0     // Catch:{ Exception -> 0x0455 }
        L_0x0465:
            r8 = 0
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0455 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0455 }
            throw r0     // Catch:{ Exception -> 0x0455 }
        L_0x046c:
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x0477
            java.lang.String r2 = "TxnListService-Error"
            p000.ol0.m70350b0(r0, r2)
        L_0x0477:
            r10 = r8
        L_0x0478:
            java.lang.Boolean r0 = p000.a40.m31670a(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.TransferViewModel.mo61770s(net.safemoon.androidwallet.model.token.abstraction.IToken, net.safemoon.androidwallet.viewmodels.TransferViewModel$b, ns0):java.lang.Object");
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u0017\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/TransferViewModel$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "()Z", "hasSuccess", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "transactionReceipt", "", "c", "Ljava/lang/Double;", "getEstimatedGas", "()Ljava/lang/Double;", "estimatedGas", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "isSubmittedToServer", "<init>", "(ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$b */
    /* compiled from: TransferViewModel.kt */
    public static final class C8863b {

        /* renamed from: a */
        public final boolean f43000a;

        /* renamed from: b */
        public final String f43001b;

        /* renamed from: c */
        public final Double f43002c;

        /* renamed from: d */
        public Boolean f43003d;

        public C8863b(boolean z, String str, Double d, Boolean bool) {
            this.f43000a = z;
            this.f43001b = str;
            this.f43002c = d;
            this.f43003d = bool;
        }

        /* renamed from: a */
        public final boolean mo61776a() {
            return this.f43000a;
        }

        /* renamed from: b */
        public final String mo61777b() {
            return this.f43001b;
        }

        /* renamed from: c */
        public final Boolean mo61778c() {
            return this.f43003d;
        }

        /* renamed from: d */
        public final void mo61779d(Boolean bool) {
            this.f43003d = bool;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8863b)) {
                return false;
            }
            C8863b bVar = (C8863b) obj;
            return this.f43000a == bVar.f43000a && vx2.m53586b(this.f43001b, bVar.f43001b) && vx2.m53586b(this.f43002c, bVar.f43002c) && vx2.m53586b(this.f43003d, bVar.f43003d);
        }

        public int hashCode() {
            boolean z = this.f43000a;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String str = this.f43001b;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            Double d = this.f43002c;
            int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
            Boolean bool = this.f43003d;
            if (bool != null) {
                i2 = bool.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            boolean z = this.f43000a;
            String str = this.f43001b;
            Double d = this.f43002c;
            Boolean bool = this.f43003d;
            return "TransferResponse(hasSuccess=" + z + ", transactionReceipt=" + str + ", estimatedGas=" + d + ", isSubmittedToServer=" + bool + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C8863b(boolean z, String str, Double d, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : bool);
        }
    }
}
