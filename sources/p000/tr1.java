package p000;

import java.util.Collections;
import java.util.List;
import org.web3j.abi.FunctionReturnDecoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Utf8String;

/* renamed from: tr1 */
/* compiled from: EthCall */
public class tr1 extends ag5<String> {
    private static final String errorMethodId = "0x08c379a0";
    private static final List<TypeReference<fz6>> revertReasonType = Collections.singletonList(TypeReference.create(C7927n5.getType(Utf8String.TYPE_NAME)));

    private boolean isErrorInResult() {
        if (getValue() == null || !getValue().startsWith(errorMethodId)) {
            return false;
        }
        return true;
    }

    public String getRevertReason() {
        if (isErrorInResult()) {
            return ((Utf8String) FunctionReturnDecoder.decode(getValue().substring(10), revertReasonType).get(0)).getValue();
        }
        if (hasError()) {
            return getError().getMessage();
        }
        return null;
    }

    public String getValue() {
        return (String) getResult();
    }

    public boolean isReverted() {
        if (hasError() || isErrorInResult()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean reverts() {
        return isReverted();
    }
}
