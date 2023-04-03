package androidx.paging.multicast;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {1, 0, 3}, mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Landroidx/paging/multicast/ChannelManager;", "T", "invoke"}, mo44878k = 3, mo44879mv = {1, 4, 2})
/* compiled from: Multicaster.kt */
public final class Multicaster$channelManager$2 extends Lambda implements pc2<ChannelManager<T>> {
    public final /* synthetic */ int $bufferSize;
    public final /* synthetic */ Multicaster this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Multicaster$channelManager$2(Multicaster multicaster, int i) {
        super(0);
        this.this$0 = multicaster;
        this.$bufferSize = i;
    }

    public final ChannelManager<T> invoke() {
        return new ChannelManager(this.this$0.f6269c, this.$bufferSize, this.this$0.f6271e, this.this$0.f6272f, this.this$0.f6273g, this.this$0.f6270d);
    }
}
