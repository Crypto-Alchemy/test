package p000;

import java.math.BigInteger;

/* renamed from: at1 */
/* compiled from: Ethereum */
public interface at1 {
    zd5<?, C6932cd> adminNodeInfo();

    zd5<?, C6968dd> adminPeers();

    zd5<?, p21> dbGetHex(String str, String str2);

    zd5<?, q21> dbGetString(String str, String str2);

    zd5<?, r21> dbPutHex(String str, String str2, String str3);

    zd5<?, s21> dbPutString(String str, String str2, String str3);

    zd5<?, qr1> ethAccounts();

    zd5<?, sr1> ethBlockNumber();

    zd5<?, tr1> ethCall(qt6 qt6, x61 x61);

    zd5<?, ur1> ethChainId();

    zd5<?, vr1> ethCoinbase();

    zd5<?, wr1> ethCompileLLL(String str);

    zd5<?, xr1> ethCompileSerpent(String str);

    zd5<?, yr1> ethCompileSolidity(String str);

    zd5<?, zr1> ethEstimateGas(qt6 qt6);

    zd5<?, cs1> ethGasPrice();

    zd5<?, ds1> ethGetBalance(String str, x61 x61);

    zd5<?, rr1> ethGetBlockByHash(String str, boolean z);

    zd5<?, rr1> ethGetBlockByNumber(x61 x61, boolean z);

    zd5<?, es1> ethGetBlockTransactionCountByHash(String str);

    zd5<?, fs1> ethGetBlockTransactionCountByNumber(x61 x61);

    zd5<?, gs1> ethGetCode(String str, x61 x61);

    zd5<?, hs1> ethGetCompilers();

    zd5<?, ps1> ethGetFilterChanges(BigInteger bigInteger);

    zd5<?, ps1> ethGetFilterLogs(BigInteger bigInteger);

    zd5<?, ps1> ethGetLogs(bs1 bs1);

    zd5<?, is1> ethGetStorageAt(String str, BigInteger bigInteger, x61 x61);

    zd5<?, ys1> ethGetTransactionByBlockHashAndIndex(String str, BigInteger bigInteger);

    zd5<?, ys1> ethGetTransactionByBlockNumberAndIndex(x61 x61, BigInteger bigInteger);

    zd5<?, ys1> ethGetTransactionByHash(String str);

    zd5<?, js1> ethGetTransactionCount(String str, x61 x61);

    zd5<?, ks1> ethGetTransactionReceipt(String str);

    zd5<?, rr1> ethGetUncleByBlockHashAndIndex(String str, BigInteger bigInteger);

    zd5<?, rr1> ethGetUncleByBlockNumberAndIndex(x61 x61, BigInteger bigInteger);

    zd5<?, ls1> ethGetUncleCountByBlockHash(String str);

    zd5<?, ms1> ethGetUncleCountByBlockNumber(x61 x61);

    zd5<?, ns1> ethGetWork();

    zd5<?, os1> ethHashrate();

    zd5<?, qs1> ethMining();

    zd5<?, as1> ethNewBlockFilter();

    zd5<?, as1> ethNewFilter(bs1 bs1);

    zd5<?, as1> ethNewPendingTransactionFilter();

    zd5<?, rs1> ethProtocolVersion();

    zd5<?, ss1> ethSendRawTransaction(String str);

    zd5<?, ss1> ethSendTransaction(qt6 qt6);

    zd5<?, ts1> ethSign(String str, String str2);

    zd5<?, us1> ethSubmitHashrate(String str, String str2);

    zd5<?, vs1> ethSubmitWork(String str, String str2, String str3);

    zd5<?, xs1> ethSyncing();

    zd5<?, zs1> ethUninstallFilter(BigInteger bigInteger);

    zd5<?, k54> netListening();

    zd5<?, l54> netPeerCount();

    zd5<?, n54> netVersion();

    zd5<?, j06> shhAddToGroup(String str);

    zd5<?, m06> shhGetFilterChanges(BigInteger bigInteger);

    zd5<?, m06> shhGetMessages(BigInteger bigInteger);

    zd5<?, l06> shhHasIdentity(String str);

    zd5<?, n06> shhNewFilter(k06 k06);

    zd5<?, o06> shhNewGroup();

    zd5<?, p06> shhNewIdentity();

    zd5<?, q06> shhPost(r06 r06);

    zd5<?, s06> shhUninstallFilter(BigInteger bigInteger);

    zd5<?, t06> shhVersion();

    zd5<?, rj7> web3ClientVersion();

    zd5<?, sj7> web3Sha3(String str);
}
