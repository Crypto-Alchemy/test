package p000;

import org.web3j.ens.EnsResolutionException;
import org.web3j.ens.contracts.generated.ENS;
import org.web3j.ens.contracts.generated.PublicResolver;
import org.web3j.protocol.core.DefaultBlockParameterName;

/* renamed from: pq1 */
/* compiled from: EnsResolver */
public class pq1 {
    public static final long DEFAULT_SYNC_THRESHOLD = 180000;
    public static final String REVERSE_NAME_SUFFIX = ".addr.reverse";
    private final int addressLength;
    private long syncThreshold;
    private final yt6 transactionManager;
    private final vj7 web3j;

    public pq1(vj7 vj7, long j, int i) {
        this.web3j = vj7;
        this.transactionManager = new tg0(vj7, (String) null);
        this.syncThreshold = j;
        this.addressLength = i;
    }

    public static boolean isValidEnsName(String str) {
        return isValidEnsName(str, 40);
    }

    private PublicResolver lookupResolver(String str) throws Exception {
        return PublicResolver.load(ENS.load(jt0.resolveRegistryContract(this.web3j.netVersion().send().getNetVersion()), this.web3j, this.transactionManager, (it0) new i81()).resolver(s24.nameHashAsBytes(str)).send(), this.web3j, this.transactionManager, (it0) new i81());
    }

    public long getSyncThreshold() {
        return this.syncThreshold;
    }

    public boolean isSynced() throws Exception {
        if (this.web3j.ethSyncing().send().isSyncing()) {
            return false;
        }
        if (System.currentTimeMillis() - this.syncThreshold < yl0.longValueExact(this.web3j.ethGetBlockByNumber(DefaultBlockParameterName.LATEST, false).send().getBlock().getTimestamp()) * 1000) {
            return true;
        }
        return false;
    }

    public PublicResolver obtainPublicResolver(String str) {
        if (isValidEnsName(str, this.addressLength)) {
            try {
                if (isSynced()) {
                    return lookupResolver(str);
                }
                throw new EnsResolutionException("Node is not currently synced");
            } catch (Exception e) {
                throw new EnsResolutionException("Unable to determine sync status of node", e);
            }
        } else {
            throw new EnsResolutionException("EnsName is invalid: " + str);
        }
    }

    public String resolve(String str) {
        if (!isValidEnsName(str, this.addressLength)) {
            return str;
        }
        try {
            String send = obtainPublicResolver(str).addr(s24.nameHashAsBytes(str)).send();
            if (ej7.isValidAddress(send)) {
                return send;
            }
            throw new RuntimeException("Unable to resolve address for name: " + str);
        } catch (Exception e) {
            throw new RuntimeException("Unable to execute Ethereum request", e);
        }
    }

    public String reverseResolve(String str) {
        if (ej7.isValidAddress(str, this.addressLength)) {
            String str2 = pc4.cleanHexPrefix(str) + REVERSE_NAME_SUFFIX;
            try {
                String send = obtainPublicResolver(str2).name(s24.nameHashAsBytes(str2)).send();
                if (isValidEnsName(send, this.addressLength)) {
                    return send;
                }
                throw new RuntimeException("Unable to resolve name for address: " + str);
            } catch (Exception e) {
                throw new RuntimeException("Unable to execute Ethereum request", e);
            }
        } else {
            throw new EnsResolutionException("Address is invalid: " + str);
        }
    }

    public void setSyncThreshold(long j) {
        this.syncThreshold = j;
    }

    public static boolean isValidEnsName(String str, int i) {
        return str != null && (str.contains(".") || !ej7.isValidAddress(str, i));
    }

    public pq1(vj7 vj7, long j) {
        this(vj7, j, 40);
    }

    public pq1(vj7 vj7) {
        this(vj7, DEFAULT_SYNC_THRESHOLD);
    }
}
