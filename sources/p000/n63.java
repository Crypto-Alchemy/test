package p000;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.web3j.abi.datatypes.Address;

/* renamed from: n63 */
/* compiled from: JsonRpc2_0Web3j */
public class n63 implements vj7 {
    public static final int DEFAULT_BLOCK_TIME = 15000;
    private final long blockTime;
    private final ScheduledExecutorService scheduledExecutorService;
    private final m63 web3jRx;
    public final xj7 web3jService;

    public n63(xj7 xj7) {
        this(xj7, yt6.DEFAULT_POLLING_FREQUENCY, C9649yr.defaultExecutorService());
    }

    private Map<String, Object> createLogsParams(List<String> list, List<String> list2) {
        HashMap hashMap = new HashMap();
        if (!list.isEmpty()) {
            hashMap.put(Address.TYPE_NAME, list);
        }
        if (!list2.isEmpty()) {
            hashMap.put("topics", list2);
        }
        return hashMap;
    }

    public zd5<?, C6932cd> adminNodeInfo() {
        return new zd5<>("admin_nodeInfo", Collections.emptyList(), this.web3jService, C6932cd.class);
    }

    public zd5<?, C6968dd> adminPeers() {
        return new zd5<>("admin_peers", Collections.emptyList(), this.web3jService, C6968dd.class);
    }

    public g52<rr1> blockFlowable(boolean z) {
        return this.web3jRx.blockFlowable(z, this.blockTime);
    }

    public zd5<?, p21> dbGetHex(String str, String str2) {
        return new zd5<>("db_getHex", Arrays.asList(new String[]{str, str2}), this.web3jService, p21.class);
    }

    public zd5<?, q21> dbGetString(String str, String str2) {
        return new zd5<>("db_getString", Arrays.asList(new String[]{str, str2}), this.web3jService, q21.class);
    }

    public zd5<?, r21> dbPutHex(String str, String str2, String str3) {
        return new zd5<>("db_putHex", Arrays.asList(new String[]{str, str2, str3}), this.web3jService, r21.class);
    }

    public zd5<?, s21> dbPutString(String str, String str2, String str3) {
        return new zd5<>("db_putString", Arrays.asList(new String[]{str, str2, str3}), this.web3jService, s21.class);
    }

    public zd5<?, qr1> ethAccounts() {
        return new zd5<>("eth_accounts", Collections.emptyList(), this.web3jService, qr1.class);
    }

    public g52<String> ethBlockHashFlowable() {
        return this.web3jRx.ethBlockHashFlowable(this.blockTime);
    }

    public zd5<?, sr1> ethBlockNumber() {
        return new zd5<>("eth_blockNumber", Collections.emptyList(), this.web3jService, sr1.class);
    }

    public zd5<?, tr1> ethCall(qt6 qt6, x61 x61) {
        return new zd5<>("eth_call", Arrays.asList(new Object[]{qt6, x61}), this.web3jService, tr1.class);
    }

    public zd5<?, ur1> ethChainId() {
        return new zd5<>("eth_chainId", Collections.emptyList(), this.web3jService, ur1.class);
    }

    public zd5<?, vr1> ethCoinbase() {
        return new zd5<>("eth_coinbase", Collections.emptyList(), this.web3jService, vr1.class);
    }

    public zd5<?, wr1> ethCompileLLL(String str) {
        return new zd5<>("eth_compileLLL", Arrays.asList(new String[]{str}), this.web3jService, wr1.class);
    }

    public zd5<?, xr1> ethCompileSerpent(String str) {
        return new zd5<>("eth_compileSerpent", Arrays.asList(new String[]{str}), this.web3jService, xr1.class);
    }

    public zd5<?, yr1> ethCompileSolidity(String str) {
        return new zd5<>("eth_compileSolidity", Arrays.asList(new String[]{str}), this.web3jService, yr1.class);
    }

    public zd5<?, zr1> ethEstimateGas(qt6 qt6) {
        return new zd5<>("eth_estimateGas", Arrays.asList(new qt6[]{qt6}), this.web3jService, zr1.class);
    }

    public zd5<?, cs1> ethGasPrice() {
        return new zd5<>("eth_gasPrice", Collections.emptyList(), this.web3jService, cs1.class);
    }

    public zd5<?, ds1> ethGetBalance(String str, x61 x61) {
        return new zd5<>("eth_getBalance", Arrays.asList(new String[]{str, x61.getValue()}), this.web3jService, ds1.class);
    }

    public zd5<?, rr1> ethGetBlockByHash(String str, boolean z) {
        return new zd5<>("eth_getBlockByHash", Arrays.asList(new Serializable[]{str, Boolean.valueOf(z)}), this.web3jService, rr1.class);
    }

    public zd5<?, rr1> ethGetBlockByNumber(x61 x61, boolean z) {
        return new zd5<>("eth_getBlockByNumber", Arrays.asList(new Serializable[]{x61.getValue(), Boolean.valueOf(z)}), this.web3jService, rr1.class);
    }

    public zd5<?, es1> ethGetBlockTransactionCountByHash(String str) {
        return new zd5<>("eth_getBlockTransactionCountByHash", Arrays.asList(new String[]{str}), this.web3jService, es1.class);
    }

    public zd5<?, fs1> ethGetBlockTransactionCountByNumber(x61 x61) {
        return new zd5<>("eth_getBlockTransactionCountByNumber", Arrays.asList(new String[]{x61.getValue()}), this.web3jService, fs1.class);
    }

    public zd5<?, gs1> ethGetCode(String str, x61 x61) {
        return new zd5<>("eth_getCode", Arrays.asList(new String[]{str, x61.getValue()}), this.web3jService, gs1.class);
    }

    public zd5<?, hs1> ethGetCompilers() {
        return new zd5<>("eth_getCompilers", Collections.emptyList(), this.web3jService, hs1.class);
    }

    public zd5<?, ps1> ethGetFilterChanges(BigInteger bigInteger) {
        return new zd5<>("eth_getFilterChanges", Arrays.asList(new String[]{pc4.toHexStringWithPrefixSafe(bigInteger)}), this.web3jService, ps1.class);
    }

    public zd5<?, ps1> ethGetFilterLogs(BigInteger bigInteger) {
        return new zd5<>("eth_getFilterLogs", Arrays.asList(new String[]{pc4.toHexStringWithPrefixSafe(bigInteger)}), this.web3jService, ps1.class);
    }

    public zd5<?, ps1> ethGetLogs(bs1 bs1) {
        return new zd5<>("eth_getLogs", Arrays.asList(new bs1[]{bs1}), this.web3jService, ps1.class);
    }

    public zd5<?, is1> ethGetStorageAt(String str, BigInteger bigInteger, x61 x61) {
        return new zd5<>("eth_getStorageAt", Arrays.asList(new String[]{str, pc4.encodeQuantity(bigInteger), x61.getValue()}), this.web3jService, is1.class);
    }

    public zd5<?, ys1> ethGetTransactionByBlockHashAndIndex(String str, BigInteger bigInteger) {
        return new zd5<>("eth_getTransactionByBlockHashAndIndex", Arrays.asList(new String[]{str, pc4.encodeQuantity(bigInteger)}), this.web3jService, ys1.class);
    }

    public zd5<?, ys1> ethGetTransactionByBlockNumberAndIndex(x61 x61, BigInteger bigInteger) {
        return new zd5<>("eth_getTransactionByBlockNumberAndIndex", Arrays.asList(new String[]{x61.getValue(), pc4.encodeQuantity(bigInteger)}), this.web3jService, ys1.class);
    }

    public zd5<?, ys1> ethGetTransactionByHash(String str) {
        return new zd5<>("eth_getTransactionByHash", Arrays.asList(new String[]{str}), this.web3jService, ys1.class);
    }

    public zd5<?, js1> ethGetTransactionCount(String str, x61 x61) {
        return new zd5<>("eth_getTransactionCount", Arrays.asList(new String[]{str, x61.getValue()}), this.web3jService, js1.class);
    }

    public zd5<?, ks1> ethGetTransactionReceipt(String str) {
        return new zd5<>("eth_getTransactionReceipt", Arrays.asList(new String[]{str}), this.web3jService, ks1.class);
    }

    public zd5<?, rr1> ethGetUncleByBlockHashAndIndex(String str, BigInteger bigInteger) {
        return new zd5<>("eth_getUncleByBlockHashAndIndex", Arrays.asList(new String[]{str, pc4.encodeQuantity(bigInteger)}), this.web3jService, rr1.class);
    }

    public zd5<?, rr1> ethGetUncleByBlockNumberAndIndex(x61 x61, BigInteger bigInteger) {
        return new zd5<>("eth_getUncleByBlockNumberAndIndex", Arrays.asList(new String[]{x61.getValue(), pc4.encodeQuantity(bigInteger)}), this.web3jService, rr1.class);
    }

    public zd5<?, ls1> ethGetUncleCountByBlockHash(String str) {
        return new zd5<>("eth_getUncleCountByBlockHash", Arrays.asList(new String[]{str}), this.web3jService, ls1.class);
    }

    public zd5<?, ms1> ethGetUncleCountByBlockNumber(x61 x61) {
        return new zd5<>("eth_getUncleCountByBlockNumber", Arrays.asList(new String[]{x61.getValue()}), this.web3jService, ms1.class);
    }

    public zd5<?, ns1> ethGetWork() {
        return new zd5<>("eth_getWork", Collections.emptyList(), this.web3jService, ns1.class);
    }

    public zd5<?, os1> ethHashrate() {
        return new zd5<>("eth_hashrate", Collections.emptyList(), this.web3jService, os1.class);
    }

    public g52<hk3> ethLogFlowable(bs1 bs1) {
        return this.web3jRx.ethLogFlowable(bs1, this.blockTime);
    }

    public zd5<?, qs1> ethMining() {
        return new zd5<>("eth_mining", Collections.emptyList(), this.web3jService, qs1.class);
    }

    public zd5<?, as1> ethNewBlockFilter() {
        return new zd5<>("eth_newBlockFilter", Collections.emptyList(), this.web3jService, as1.class);
    }

    public zd5<?, as1> ethNewFilter(bs1 bs1) {
        return new zd5<>("eth_newFilter", Arrays.asList(new bs1[]{bs1}), this.web3jService, as1.class);
    }

    public zd5<?, as1> ethNewPendingTransactionFilter() {
        return new zd5<>("eth_newPendingTransactionFilter", Collections.emptyList(), this.web3jService, as1.class);
    }

    public g52<String> ethPendingTransactionHashFlowable() {
        return this.web3jRx.ethPendingTransactionHashFlowable(this.blockTime);
    }

    public zd5<?, rs1> ethProtocolVersion() {
        return new zd5<>("eth_protocolVersion", Collections.emptyList(), this.web3jService, rs1.class);
    }

    public zd5<?, ss1> ethSendRawTransaction(String str) {
        return new zd5<>("eth_sendRawTransaction", Arrays.asList(new String[]{str}), this.web3jService, ss1.class);
    }

    public zd5<?, ss1> ethSendTransaction(qt6 qt6) {
        return new zd5<>("eth_sendTransaction", Arrays.asList(new qt6[]{qt6}), this.web3jService, ss1.class);
    }

    public zd5<?, ts1> ethSign(String str, String str2) {
        return new zd5<>("eth_sign", Arrays.asList(new String[]{str, str2}), this.web3jService, ts1.class);
    }

    public zd5<?, us1> ethSubmitHashrate(String str, String str2) {
        return new zd5<>("eth_submitHashrate", Arrays.asList(new String[]{str, str2}), this.web3jService, us1.class);
    }

    public zd5<?, vs1> ethSubmitWork(String str, String str2, String str3) {
        return new zd5<>("eth_submitWork", Arrays.asList(new String[]{str, str2, str3}), this.web3jService, vs1.class);
    }

    public zd5<?, xs1> ethSyncing() {
        return new zd5<>("eth_syncing", Collections.emptyList(), this.web3jService, xs1.class);
    }

    public zd5<?, zs1> ethUninstallFilter(BigInteger bigInteger) {
        return new zd5<>("eth_uninstallFilter", Arrays.asList(new String[]{pc4.toHexStringWithPrefixSafe(bigInteger)}), this.web3jService, zs1.class);
    }

    public g52<lk3> logsNotifications(List<String> list, List<String> list2) {
        Map<String, Object> createLogsParams = createLogsParams(list, list2);
        return this.web3jService.subscribe(new zd5("eth_subscribe", Arrays.asList(new Object[]{"logs", createLogsParams}), this.web3jService, ws1.class), "eth_unsubscribe", lk3.class);
    }

    public zd5<?, k54> netListening() {
        return new zd5<>("net_listening", Collections.emptyList(), this.web3jService, k54.class);
    }

    public zd5<?, l54> netPeerCount() {
        return new zd5<>("net_peerCount", Collections.emptyList(), this.web3jService, l54.class);
    }

    public zd5<?, n54> netVersion() {
        return new zd5<>("net_version", Collections.emptyList(), this.web3jService, n54.class);
    }

    public c00 newBatch() {
        return new c00(this.web3jService);
    }

    public g52<f64> newHeadsNotifications() {
        return this.web3jService.subscribe(new zd5("eth_subscribe", Collections.singletonList("newHeads"), this.web3jService, ws1.class), "eth_unsubscribe", f64.class);
    }

    public g52<pt6> pendingTransactionFlowable() {
        return this.web3jRx.pendingTransactionFlowable(this.blockTime);
    }

    public g52<rr1> replayPastAndFutureBlocksFlowable(x61 x61, boolean z) {
        return this.web3jRx.replayPastAndFutureBlocksFlowable(x61, z, this.blockTime);
    }

    public g52<pt6> replayPastAndFutureTransactionsFlowable(x61 x61) {
        return this.web3jRx.replayPastAndFutureTransactionsFlowable(x61, this.blockTime);
    }

    public g52<rr1> replayPastBlocksFlowable(x61 x61, x61 x612, boolean z) {
        return this.web3jRx.replayBlocksFlowable(x61, x612, z);
    }

    public g52<pt6> replayPastTransactionsFlowable(x61 x61, x61 x612) {
        return this.web3jRx.replayTransactionsFlowable(x61, x612);
    }

    public zd5<?, j06> shhAddToGroup(String str) {
        return new zd5<>("shh_addToGroup", Arrays.asList(new String[]{str}), this.web3jService, j06.class);
    }

    public zd5<?, m06> shhGetFilterChanges(BigInteger bigInteger) {
        return new zd5<>("shh_getFilterChanges", Arrays.asList(new String[]{pc4.toHexStringWithPrefixSafe(bigInteger)}), this.web3jService, m06.class);
    }

    public zd5<?, m06> shhGetMessages(BigInteger bigInteger) {
        return new zd5<>("shh_getMessages", Arrays.asList(new String[]{pc4.toHexStringWithPrefixSafe(bigInteger)}), this.web3jService, m06.class);
    }

    public zd5<?, l06> shhHasIdentity(String str) {
        return new zd5<>("shh_hasIdentity", Arrays.asList(new String[]{str}), this.web3jService, l06.class);
    }

    public zd5<?, n06> shhNewFilter(k06 k06) {
        return new zd5<>("shh_newFilter", Arrays.asList(new k06[]{k06}), this.web3jService, n06.class);
    }

    public zd5<?, o06> shhNewGroup() {
        return new zd5<>("shh_newGroup", Collections.emptyList(), this.web3jService, o06.class);
    }

    public zd5<?, p06> shhNewIdentity() {
        return new zd5<>("shh_newIdentity", Collections.emptyList(), this.web3jService, p06.class);
    }

    public zd5<?, q06> shhPost(r06 r06) {
        return new zd5<>("shh_post", Arrays.asList(new r06[]{r06}), this.web3jService, q06.class);
    }

    public zd5<?, s06> shhUninstallFilter(BigInteger bigInteger) {
        return new zd5<>("shh_uninstallFilter", Arrays.asList(new String[]{pc4.toHexStringWithPrefixSafe(bigInteger)}), this.web3jService, s06.class);
    }

    public zd5<?, t06> shhVersion() {
        return new zd5<>("shh_version", Collections.emptyList(), this.web3jService, t06.class);
    }

    public void shutdown() {
        this.scheduledExecutorService.shutdown();
        try {
            this.web3jService.close();
        } catch (IOException e) {
            throw new RuntimeException("Failed to close web3j service", e);
        }
    }

    public g52<pt6> transactionFlowable() {
        return this.web3jRx.transactionFlowable(this.blockTime);
    }

    public zd5<?, rj7> web3ClientVersion() {
        return new zd5<>("web3_clientVersion", Collections.emptyList(), this.web3jService, rj7.class);
    }

    public zd5<?, sj7> web3Sha3(String str) {
        return new zd5<>("web3_sha3", Arrays.asList(new String[]{str}), this.web3jService, sj7.class);
    }

    public n63(xj7 xj7, long j, ScheduledExecutorService scheduledExecutorService2) {
        this.web3jService = xj7;
        this.web3jRx = new m63(this, scheduledExecutorService2);
        this.blockTime = j;
        this.scheduledExecutorService = scheduledExecutorService2;
    }

    public g52<rr1> replayPastBlocksFlowable(x61 x61, x61 x612, boolean z, boolean z2) {
        return this.web3jRx.replayBlocksFlowable(x61, x612, z, z2);
    }

    public g52<pt6> replayPastTransactionsFlowable(x61 x61) {
        return this.web3jRx.replayPastTransactionsFlowable(x61);
    }

    public g52<rr1> replayPastBlocksFlowable(x61 x61, boolean z, g52<rr1> g52) {
        return this.web3jRx.replayPastBlocksFlowable(x61, z, g52);
    }

    public g52<rr1> replayPastBlocksFlowable(x61 x61, boolean z) {
        return this.web3jRx.replayPastBlocksFlowable(x61, z);
    }
}
