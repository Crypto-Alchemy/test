package p000;

import java.io.IOException;

/* renamed from: xg5 */
/* compiled from: RevertReasonExtractor */
public class xg5 {
    public static final String MISSING_REASON = "N/A";

    public static String extractRevertReason(au6 au6, String str, vj7 vj7, Boolean bool) throws IOException {
        String retrieveRevertReason;
        if (au6.getRevertReason() != null) {
            return au6.getRevertReason();
        }
        if (!bool.booleanValue() || (retrieveRevertReason = retrieveRevertReason(au6, str, vj7)) == null) {
            return MISSING_REASON;
        }
        au6.setRevertReason(retrieveRevertReason);
        return retrieveRevertReason;
    }

    public static String retrieveRevertReason(au6 au6, String str, vj7 vj7) throws IOException {
        if (au6.getBlockNumber() == null) {
            return null;
        }
        return vj7.ethCall(qt6.createEthCallTransaction(au6.getFrom(), au6.getTo(), str), w61.m73487b(au6.getBlockNumber())).send().getRevertReason();
    }
}
