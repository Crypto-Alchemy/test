package p000;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java8.util.stream.C6065b;
import java8.util.stream.C6097i;
import org.web3j.protocol.core.DefaultBlockParameterName;
import p000.rr1;
import p018io.reactivex.BackpressureStrategy;

/* renamed from: m63 */
/* compiled from: JsonRpc2_0Rx */
public class m63 {
    private final ScheduledExecutorService scheduledExecutorService;
    private final nm5 scheduler;
    private final vj7 web3j;

    public m63(vj7 vj7, ScheduledExecutorService scheduledExecutorService2) {
        this.web3j = vj7;
        this.scheduledExecutorService = scheduledExecutorService2;
        this.scheduler = sm5.m51861b(scheduledExecutorService2);
    }

    private BigInteger getBlockNumber(x61 x61) throws IOException {
        if (x61 instanceof y61) {
            return ((y61) x61).getBlockNumber();
        }
        return this.web3j.ethGetBlockByNumber(x61, false).send().getBlock().getNumber();
    }

    private BigInteger getLatestBlockNumber() throws IOException {
        return getBlockNumber(DefaultBlockParameterName.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ vy4 lambda$blockFlowable$10(boolean z, String str) throws Exception {
        return this.web3j.ethGetBlockByHash(str, z).flowable();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$ethBlockHashFlowable$1(long j, l52 l52) throws Exception {
        run(new k30(this.web3j, new k63(l52)), l52, j);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$ethLogFlowable$5(bs1 bs1, long j, l52 l52) throws Exception {
        run(new kk3(this.web3j, new e63(l52), bs1), l52, j);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$ethPendingTransactionHashFlowable$3(long j, l52 l52) throws Exception {
        run(new hn4(this.web3j, new f63(l52)), l52, j);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ vy4 lambda$pendingTransactionFlowable$7(String str) throws Exception {
        return this.web3j.ethGetTransactionByHash(str).flowable();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ zd5 lambda$replayBlocksFlowableSync$11(boolean z, y61 y61) throws Exception {
        return this.web3j.ethGetBlockByNumber(y61, z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ vy4 lambda$replayPastBlocksFlowableSync$12(BigInteger bigInteger, boolean z, g52 g52) throws Exception {
        return replayPastBlocksFlowableSync(new y61(bigInteger.add(BigInteger.ONE)), z, g52);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pt6 lambda$toTransactions$13(rr1.C9284f fVar) {
        return (pt6) fVar.get();
    }

    private g52<rr1> replayBlocksFlowableSync(x61 x61, x61 x612, boolean z) {
        return replayBlocksFlowableSync(x61, x612, z, true);
    }

    private g52<rr1> replayPastBlocksFlowableSync(x61 x61, boolean z, g52<rr1> g52) {
        try {
            BigInteger blockNumber = getBlockNumber(x61);
            BigInteger latestBlockNumber = getLatestBlockNumber();
            if (blockNumber.compareTo(latestBlockNumber) > -1) {
                return g52;
            }
            return g52.m44530h(replayBlocksFlowableSync(new y61(blockNumber), new y61(latestBlockNumber), z), g52.m44533l(new j63(this, latestBlockNumber, z, g52)));
        } catch (IOException e) {
            return g52.m44535s(e);
        }
    }

    private <T> void run(o12<T> o12, l52<? super T> l52, long j) {
        o12.run(this.scheduledExecutorService, j);
        l52.setCancellable(new w53(o12));
    }

    /* access modifiers changed from: private */
    public static List<pt6> toTransactions(rr1 rr1) {
        return (List) C6097i.m46413b(rr1.getBlock().getTransactions()).mo43115b(new h63()).mo43116c(C6065b.m46364e());
    }

    public g52<rr1> blockFlowable(boolean z, long j) {
        return ethBlockHashFlowable(j).mo42775v(new g63(this, z));
    }

    public g52<String> ethBlockHashFlowable(long j) {
        return g52.m44532j(new l63(this, j), BackpressureStrategy.BUFFER);
    }

    public g52<hk3> ethLogFlowable(bs1 bs1, long j) {
        return g52.m44532j(new i63(this, bs1, j), BackpressureStrategy.BUFFER);
    }

    public g52<String> ethPendingTransactionHashFlowable(long j) {
        return g52.m44532j(new v53(this, j), BackpressureStrategy.BUFFER);
    }

    public g52<pt6> pendingTransactionFlowable(long j) {
        return ethPendingTransactionHashFlowable(j).mo42775v(new x53(this)).mo42774u(new y53()).mo42753D(new z53());
    }

    public g52<rr1> replayBlocksFlowable(x61 x61, x61 x612, boolean z) {
        return replayBlocksFlowable(x61, x612, z, true);
    }

    public g52<rr1> replayPastAndFutureBlocksFlowable(x61 x61, boolean z, long j) {
        return replayPastBlocksFlowable(x61, z, blockFlowable(z, j));
    }

    public g52<pt6> replayPastAndFutureTransactionsFlowable(x61 x61, long j) {
        return replayPastAndFutureBlocksFlowable(x61, true, j).mo42777x(new d63());
    }

    public g52<rr1> replayPastBlocksFlowable(x61 x61, boolean z, g52<rr1> g52) {
        return replayPastBlocksFlowableSync(x61, z, g52).mo42761L(this.scheduler);
    }

    public g52<pt6> replayPastTransactionsFlowable(x61 x61) {
        return replayPastBlocksFlowable(x61, true, g52.m44534r()).mo42777x(new d63());
    }

    public g52<pt6> replayTransactionsFlowable(x61 x61, x61 x612) {
        return replayBlocksFlowable(x61, x612, true).mo42777x(new d63());
    }

    public g52<pt6> transactionFlowable(long j) {
        return blockFlowable(true, j).mo42777x(new d63());
    }

    private g52<rr1> replayBlocksFlowableSync(x61 x61, x61 x612, boolean z, boolean z2) {
        try {
            return d62.range(getBlockNumber(x61), getBlockNumber(x612), z2).mo42753D(new a63()).mo42753D(new b63(this, z)).mo42775v(new c63());
        } catch (IOException e) {
            return g52.m44535s(e);
        }
    }

    public g52<rr1> replayBlocksFlowable(x61 x61, x61 x612, boolean z, boolean z2) {
        return replayBlocksFlowableSync(x61, x612, z, z2).mo42761L(this.scheduler);
    }

    public g52<rr1> replayPastBlocksFlowable(x61 x61, boolean z) {
        return replayPastBlocksFlowable(x61, z, g52.m44534r());
    }
}
