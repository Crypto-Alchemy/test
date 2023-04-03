package net.safemoon.androidwallet.views;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CustomRecoveryWalletLayout.kt */
public final class CustomRecoveryWalletLayout$isBioAuth$2 extends Lambda implements pc2<Boolean> {
    public final /* synthetic */ CustomRecoveryWalletLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomRecoveryWalletLayout$isBioAuth$2(CustomRecoveryWalletLayout customRecoveryWalletLayout) {
        super(0);
        this.this$0 = customRecoveryWalletLayout;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(f06.m57514e(this.this$0.getAttachedActivity(), "TWO_FACTOR", false));
    }
}
