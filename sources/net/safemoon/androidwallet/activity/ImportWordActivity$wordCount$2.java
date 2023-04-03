package net.safemoon.androidwallet.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: ImportWordActivity.kt */
public final class ImportWordActivity$wordCount$2 extends Lambda implements pc2<Integer> {
    public final /* synthetic */ ImportWordActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImportWordActivity$wordCount$2(ImportWordActivity importWordActivity) {
        super(0);
        this.this$0 = importWordActivity;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.this$0.getIntent().getIntExtra("WORD_COUNT", 12));
    }
}
