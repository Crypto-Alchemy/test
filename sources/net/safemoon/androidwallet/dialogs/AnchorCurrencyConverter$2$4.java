package net.safemoon.androidwallet.dialogs;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AnchorCurrencyConverter.kt */
public final class AnchorCurrencyConverter$2$4 extends Lambda implements pc2<r37> {
    public final /* synthetic */ ve1 $this_with;
    public final /* synthetic */ AnchorCurrencyConverter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchorCurrencyConverter$2$4(AnchorCurrencyConverter anchorCurrencyConverter, ve1 ve1) {
        super(0);
        this.this$0 = anchorCurrencyConverter;
        this.$this_with = ve1;
    }

    public final void invoke() {
        this.this$0.f41692i = true;
        this.$this_with.f34928b.showNext();
        AnchorCurrencyConverter anchorCurrencyConverter = this.this$0;
        AnchorCurrencyConverter.m65902t(anchorCurrencyConverter, new RoomFiat(anchorCurrencyConverter.f41689f), (List) null, 2, (Object) null);
        this.this$0.mo57131u().notifyDataSetChanged();
    }
}
