package p000;

import org.web3j.ens.EnsResolutionException;

/* renamed from: jt0 */
/* compiled from: Contracts */
public class jt0 {
    public static final String MAINNET = "0x00000000000C2E074eC69A0dFb2997BA6C7d2e1e";
    public static final String RINKEBY = "0x00000000000C2E074eC69A0dFb2997BA6C7d2e1e";
    public static final String ROPSTEN = "0x00000000000C2E074eC69A0dFb2997BA6C7d2e1e";

    public static String resolveRegistryContract(String str) {
        Long valueOf = Long.valueOf(Long.parseLong(str));
        if (valueOf.equals(1L) || valueOf.equals(3L) || valueOf.equals(4L)) {
            return "0x00000000000C2E074eC69A0dFb2997BA6C7d2e1e";
        }
        throw new EnsResolutionException("Unable to resolve ENS registry contract for network id: " + str);
    }
}
