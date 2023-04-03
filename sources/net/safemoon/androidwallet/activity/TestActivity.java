package net.safemoon.androidwallet.activity;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import net.safemoon.androidwallet.ERC20;
import net.safemoon.androidwallet.SafeswapRouter;
import net.safemoon.androidwallet.p020ui.wallet.Convert;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/TestActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TestActivity.kt */
public final class TestActivity extends AppCompatActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new View(this));
        vj7 a = uj7.m72805a(new hn2("https://nourl.com"));
        cw0 create = cw0.create(C9377u.m72498c(getApplication()));
        String address = create.getAddress();
        vx2.m53590f(address, "credentails.address");
        ol0.m70350b0(address, "Address");
        h96 h96 = new h96(Convert.m68281c("10", Convert.Unit.GWEI).toBigInteger(), new i81().getGasLimit());
        Object unused = c50.m56307b((CoroutineContext) null, new TestActivity$onCreate$1(a, create, ERC20.m64654r("0xDD6999Ec25948811d7c671051f5B4E44B175239e", a, create, h96), SafeswapRouter.m64687q("0xc04c3408EA62778072DBc8c14AA9d52FC77EeE8a", a, create, h96), ck0.m33065m("0xdd6999ec25948811d7c671051f5b4e44b175239e", "0xae13d989daC2f0dEbFf460aC112a837C89BAa7cd"), (ns0<? super TestActivity$onCreate$1>) null), 1, (Object) null);
    }
}
