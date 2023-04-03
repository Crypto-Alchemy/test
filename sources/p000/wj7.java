package p000;

import java.util.List;

/* renamed from: wj7 */
/* compiled from: Web3jRx */
public interface wj7 {
    g52<rr1> blockFlowable(boolean z);

    g52<String> ethBlockHashFlowable();

    g52<hk3> ethLogFlowable(bs1 bs1);

    g52<String> ethPendingTransactionHashFlowable();

    g52<lk3> logsNotifications(List<String> list, List<String> list2);

    g52<f64> newHeadsNotifications();

    g52<pt6> pendingTransactionFlowable();

    g52<rr1> replayPastAndFutureBlocksFlowable(x61 x61, boolean z);

    g52<pt6> replayPastAndFutureTransactionsFlowable(x61 x61);

    g52<rr1> replayPastBlocksFlowable(x61 x61, x61 x612, boolean z);

    g52<rr1> replayPastBlocksFlowable(x61 x61, x61 x612, boolean z, boolean z2);

    g52<rr1> replayPastBlocksFlowable(x61 x61, boolean z);

    g52<rr1> replayPastBlocksFlowable(x61 x61, boolean z, g52<rr1> g52);

    g52<pt6> replayPastTransactionsFlowable(x61 x61);

    g52<pt6> replayPastTransactionsFlowable(x61 x61, x61 x612);

    g52<pt6> transactionFlowable();
}
