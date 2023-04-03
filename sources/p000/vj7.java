package p000;

import java.math.BigInteger;
import java.util.List;

/* renamed from: vj7 */
/* compiled from: Web3j */
public interface vj7 extends at1, wj7, f00 {
    /* synthetic */ zd5<?, C6932cd> adminNodeInfo();

    /* synthetic */ zd5<?, C6968dd> adminPeers();

    /* synthetic */ g52<rr1> blockFlowable(boolean z);

    /* synthetic */ zd5<?, p21> dbGetHex(String str, String str2);

    /* synthetic */ zd5<?, q21> dbGetString(String str, String str2);

    /* synthetic */ zd5<?, r21> dbPutHex(String str, String str2, String str3);

    /* synthetic */ zd5<?, s21> dbPutString(String str, String str2, String str3);

    /* synthetic */ zd5<?, qr1> ethAccounts();

    /* synthetic */ g52<String> ethBlockHashFlowable();

    /* synthetic */ zd5<?, sr1> ethBlockNumber();

    /* synthetic */ zd5<?, tr1> ethCall(qt6 qt6, x61 x61);

    /* synthetic */ zd5<?, ur1> ethChainId();

    /* synthetic */ zd5<?, vr1> ethCoinbase();

    /* synthetic */ zd5<?, wr1> ethCompileLLL(String str);

    /* synthetic */ zd5<?, xr1> ethCompileSerpent(String str);

    /* synthetic */ zd5<?, yr1> ethCompileSolidity(String str);

    /* synthetic */ zd5<?, zr1> ethEstimateGas(qt6 qt6);

    /* synthetic */ zd5<?, cs1> ethGasPrice();

    /* synthetic */ zd5<?, ds1> ethGetBalance(String str, x61 x61);

    /* synthetic */ zd5<?, rr1> ethGetBlockByHash(String str, boolean z);

    /* synthetic */ zd5<?, rr1> ethGetBlockByNumber(x61 x61, boolean z);

    /* synthetic */ zd5<?, es1> ethGetBlockTransactionCountByHash(String str);

    /* synthetic */ zd5<?, fs1> ethGetBlockTransactionCountByNumber(x61 x61);

    /* synthetic */ zd5<?, gs1> ethGetCode(String str, x61 x61);

    /* synthetic */ zd5<?, hs1> ethGetCompilers();

    /* synthetic */ zd5<?, ps1> ethGetFilterChanges(BigInteger bigInteger);

    /* synthetic */ zd5<?, ps1> ethGetFilterLogs(BigInteger bigInteger);

    /* synthetic */ zd5<?, ps1> ethGetLogs(bs1 bs1);

    /* synthetic */ zd5<?, is1> ethGetStorageAt(String str, BigInteger bigInteger, x61 x61);

    /* synthetic */ zd5<?, ys1> ethGetTransactionByBlockHashAndIndex(String str, BigInteger bigInteger);

    /* synthetic */ zd5<?, ys1> ethGetTransactionByBlockNumberAndIndex(x61 x61, BigInteger bigInteger);

    /* synthetic */ zd5<?, ys1> ethGetTransactionByHash(String str);

    /* synthetic */ zd5<?, js1> ethGetTransactionCount(String str, x61 x61);

    /* synthetic */ zd5<?, ks1> ethGetTransactionReceipt(String str);

    /* synthetic */ zd5<?, rr1> ethGetUncleByBlockHashAndIndex(String str, BigInteger bigInteger);

    /* synthetic */ zd5<?, rr1> ethGetUncleByBlockNumberAndIndex(x61 x61, BigInteger bigInteger);

    /* synthetic */ zd5<?, ls1> ethGetUncleCountByBlockHash(String str);

    /* synthetic */ zd5<?, ms1> ethGetUncleCountByBlockNumber(x61 x61);

    /* synthetic */ zd5<?, ns1> ethGetWork();

    /* synthetic */ zd5<?, os1> ethHashrate();

    /* synthetic */ g52<hk3> ethLogFlowable(bs1 bs1);

    /* synthetic */ zd5<?, qs1> ethMining();

    /* synthetic */ zd5<?, as1> ethNewBlockFilter();

    /* synthetic */ zd5<?, as1> ethNewFilter(bs1 bs1);

    /* synthetic */ zd5<?, as1> ethNewPendingTransactionFilter();

    /* synthetic */ g52<String> ethPendingTransactionHashFlowable();

    /* synthetic */ zd5<?, rs1> ethProtocolVersion();

    /* synthetic */ zd5<?, ss1> ethSendRawTransaction(String str);

    /* synthetic */ zd5<?, ss1> ethSendTransaction(qt6 qt6);

    /* synthetic */ zd5<?, ts1> ethSign(String str, String str2);

    /* synthetic */ zd5<?, us1> ethSubmitHashrate(String str, String str2);

    /* synthetic */ zd5<?, vs1> ethSubmitWork(String str, String str2, String str3);

    /* synthetic */ zd5<?, xs1> ethSyncing();

    /* synthetic */ zd5<?, zs1> ethUninstallFilter(BigInteger bigInteger);

    /* synthetic */ g52<lk3> logsNotifications(List<String> list, List<String> list2);

    /* synthetic */ zd5<?, k54> netListening();

    /* synthetic */ zd5<?, l54> netPeerCount();

    /* synthetic */ zd5<?, n54> netVersion();

    /* synthetic */ c00 newBatch();

    /* synthetic */ g52<f64> newHeadsNotifications();

    /* synthetic */ g52<pt6> pendingTransactionFlowable();

    /* synthetic */ g52<rr1> replayPastAndFutureBlocksFlowable(x61 x61, boolean z);

    /* synthetic */ g52<pt6> replayPastAndFutureTransactionsFlowable(x61 x61);

    /* synthetic */ g52<rr1> replayPastBlocksFlowable(x61 x61, x61 x612, boolean z);

    /* synthetic */ g52<rr1> replayPastBlocksFlowable(x61 x61, x61 x612, boolean z, boolean z2);

    /* synthetic */ g52<rr1> replayPastBlocksFlowable(x61 x61, boolean z);

    /* synthetic */ g52<rr1> replayPastBlocksFlowable(x61 x61, boolean z, g52<rr1> g52);

    /* synthetic */ g52<pt6> replayPastTransactionsFlowable(x61 x61);

    /* synthetic */ g52<pt6> replayPastTransactionsFlowable(x61 x61, x61 x612);

    /* synthetic */ zd5<?, j06> shhAddToGroup(String str);

    /* synthetic */ zd5<?, m06> shhGetFilterChanges(BigInteger bigInteger);

    /* synthetic */ zd5<?, m06> shhGetMessages(BigInteger bigInteger);

    /* synthetic */ zd5<?, l06> shhHasIdentity(String str);

    /* synthetic */ zd5<?, n06> shhNewFilter(k06 k06);

    /* synthetic */ zd5<?, o06> shhNewGroup();

    /* synthetic */ zd5<?, p06> shhNewIdentity();

    /* synthetic */ zd5<?, q06> shhPost(r06 r06);

    /* synthetic */ zd5<?, s06> shhUninstallFilter(BigInteger bigInteger);

    /* synthetic */ zd5<?, t06> shhVersion();

    void shutdown();

    /* synthetic */ g52<pt6> transactionFlowable();

    /* synthetic */ zd5<?, rj7> web3ClientVersion();

    /* synthetic */ zd5<?, sj7> web3Sha3(String str);
}
