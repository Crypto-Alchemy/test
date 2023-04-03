package net.safemoon.androidwallet.model.rpc2.solana;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaLatestBlockHashRequest;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaRequest;", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaLatestBlockHashRequest.kt */
public final class SolanaLatestBlockHashRequest extends SolanaRequest {
    public SolanaLatestBlockHashRequest() {
        super("getLatestBlockhash", ck0.m33058f(new Commitment(CommonKt.getCOMMIT_FINALIZED())));
    }
}
