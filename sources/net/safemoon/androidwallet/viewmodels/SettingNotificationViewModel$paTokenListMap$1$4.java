package net.safemoon.androidwallet.viewmodels;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.RoomCoinPriceAlert;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/RoomCoinPriceAlert;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SettingNotificationViewModel.kt */
public final class SettingNotificationViewModel$paTokenListMap$1$4 extends Lambda implements rc2<List<? extends RoomCoinPriceAlert>, r37> {
    public final /* synthetic */ SettingNotificationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingNotificationViewModel$paTokenListMap$1$4(SettingNotificationViewModel settingNotificationViewModel) {
        super(1);
        this.this$0 = settingNotificationViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<RoomCoinPriceAlert>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<RoomCoinPriceAlert> list) {
        Integer y = this.this$0.mo61421y();
        if (y != null && y.intValue() == -1) {
            this.this$0.mo61414r(-1);
        }
    }
}
