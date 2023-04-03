package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.fragments.SwapFragment;
import net.safemoon.androidwallet.model.token.room.RoomToken;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/token/room/RoomToken;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/token/room/RoomToken;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$1 extends Lambda implements rc2<RoomToken, r37> {
    public final /* synthetic */ k04<SwapFragment.C8460b> $btnV2LiveData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$1(k04<SwapFragment.C8460b> k04) {
        super(1);
        this.$btnV2LiveData = k04;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RoomToken) obj);
        return r37.f33317a;
    }

    public final void invoke(RoomToken roomToken) {
        k04<SwapFragment.C8460b> k04 = this.$btnV2LiveData;
        SwapFragment.C8460b value = k04.getValue();
        if (value == null) {
            value = new SwapFragment.C8460b((RoomToken) null, (SwapViewModel.C8788c) null);
        }
        value.mo57723c(roomToken);
        k04.setValue(value);
    }
}
