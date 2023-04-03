package net.safemoon.androidwallet.fragments.contact;

import android.content.ClipboardManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Landroid/content/ClipboardManager;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: BaseContactFragment.kt */
public final class BaseContactFragment$manager$2 extends Lambda implements pc2<ClipboardManager> {
    public final /* synthetic */ BaseContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseContactFragment$manager$2(BaseContactFragment baseContactFragment) {
        super(0);
        this.this$0 = baseContactFragment;
    }

    public final ClipboardManager invoke() {
        Object systemService = this.this$0.requireActivity().getSystemService("clipboard");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        return (ClipboardManager) systemService;
    }
}
