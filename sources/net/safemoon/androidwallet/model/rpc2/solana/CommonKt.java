package net.safemoon.androidwallet.model.rpc2.solana;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001XD¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003¨\u0006\b"}, mo44877d2 = {"COMMIT_CONFIRMED", "", "getCOMMIT_CONFIRMED", "()Ljava/lang/String;", "COMMIT_FINALIZED", "getCOMMIT_FINALIZED", "COMMIT_PROCESSED", "getCOMMIT_PROCESSED", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Common.kt */
public final class CommonKt {
    private static final String COMMIT_CONFIRMED = "confirmed";
    private static final String COMMIT_FINALIZED = "finalized";
    private static final String COMMIT_PROCESSED = "processed";

    public static final String getCOMMIT_CONFIRMED() {
        return COMMIT_CONFIRMED;
    }

    public static final String getCOMMIT_FINALIZED() {
        return COMMIT_FINALIZED;
    }

    public static final String getCOMMIT_PROCESSED() {
        return COMMIT_PROCESSED;
    }
}
