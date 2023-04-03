package net.safemoon.androidwallet.dialogs;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: ProgressLoading.kt */
public final class ProgressLoading$canCancel$2 extends Lambda implements pc2<Boolean> {
    public final /* synthetic */ ProgressLoading this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressLoading$canCancel$2(ProgressLoading progressLoading) {
        super(0);
        this.this$0 = progressLoading;
    }

    public final Boolean invoke() {
        Bundle arguments = this.this$0.getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("CAN_CANCEL", false);
        }
        return Boolean.valueOf(z);
    }
}
