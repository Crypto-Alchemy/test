package net.safemoon.androidwallet.views;

import android.content.ClipboardManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.activity.common.BasicActivity;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Landroid/content/ClipboardManager;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CustomRecoveryWalletLayout.kt */
public final class CustomRecoveryWalletLayout$manager$2 extends Lambda implements pc2<ClipboardManager> {
    public final /* synthetic */ CustomRecoveryWalletLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomRecoveryWalletLayout$manager$2(CustomRecoveryWalletLayout customRecoveryWalletLayout) {
        super(0);
        this.this$0 = customRecoveryWalletLayout;
    }

    public final ClipboardManager invoke() {
        BasicActivity attachedActivity = this.this$0.getAttachedActivity();
        Object systemService = attachedActivity != null ? attachedActivity.getSystemService("clipboard") : null;
        if (systemService instanceof ClipboardManager) {
            return (ClipboardManager) systemService;
        }
        return null;
    }
}
