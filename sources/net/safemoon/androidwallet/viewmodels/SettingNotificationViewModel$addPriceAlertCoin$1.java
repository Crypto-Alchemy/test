package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.model.RoomCoinPriceAlert;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$addPriceAlertCoin$1", mo48632f = "SettingNotificationViewModel.kt", mo48633l = {194}, mo48634m = "invokeSuspend")
/* compiled from: SettingNotificationViewModel.kt */
public final class SettingNotificationViewModel$addPriceAlertCoin$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Coin $coin;
    public int label;
    public final /* synthetic */ SettingNotificationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingNotificationViewModel$addPriceAlertCoin$1(SettingNotificationViewModel settingNotificationViewModel, Coin coin, ns0<? super SettingNotificationViewModel$addPriceAlertCoin$1> ns0) {
        super(2, ns0);
        this.this$0 = settingNotificationViewModel;
        this.$coin = coin;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new SettingNotificationViewModel$addPriceAlertCoin$1(this.this$0, this.$coin, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((SettingNotificationViewModel$addPriceAlertCoin$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            ei0 i2 = this.this$0.mo61418v();
            Integer id = this.$coin.getId();
            String name = this.$coin.getName();
            String symbol = this.$coin.getSymbol();
            String slug = this.$coin.getSlug();
            String coin = this.$coin.toString();
            vx2.m53590f(id, "id");
            int intValue = id.intValue();
            vx2.m53590f(symbol, "symbol");
            vx2.m53590f(name, PublicResolver.FUNC_NAME);
            vx2.m53590f(slug, "slug");
            vx2.m53590f(coin, "toString()");
            RoomCoinPriceAlert roomCoinPriceAlert = new RoomCoinPriceAlert(intValue, symbol, name, slug, coin);
            this.label = 1;
            if (i2.mo51480e(roomCoinPriceAlert, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
