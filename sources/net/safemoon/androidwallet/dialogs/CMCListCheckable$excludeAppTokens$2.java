package net.safemoon.androidwallet.dialogs;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CMCListCheckable.kt */
public final class CMCListCheckable$excludeAppTokens$2 extends Lambda implements pc2<Boolean> {
    public final /* synthetic */ CMCListCheckable this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CMCListCheckable$excludeAppTokens$2(CMCListCheckable cMCListCheckable) {
        super(0);
        this.this$0 = cMCListCheckable;
    }

    public final Boolean invoke() {
        Bundle arguments = this.this$0.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("ARG_EXCLUDE_APP_TOKENS", false));
        }
        return null;
    }
}
