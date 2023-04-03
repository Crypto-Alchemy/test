package net.safemoon.androidwallet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.BasicActivity;
import net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/SwitchWalletActivity;", "Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "Lbb;", "r", "Lef3;", "Y", "()Lbb;", "binding", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "s", "Z", "()Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "Lfj7;", "x", "b0", "()Lfj7;", "walletAdapter", "Lnet/safemoon/androidwallet/adapter/touchHelper/RecyclerTouchListener;", "y", "a0", "()Lnet/safemoon/androidwallet/adapter/touchHelper/RecyclerTouchListener;", "touchListener", "<init>", "()V", "A", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SwitchWalletActivity.kt */
public final class SwitchWalletActivity extends BasicActivity {

    /* renamed from: A */
    public static final C8201a f41499A = new C8201a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public final ef3 f41500r = C6169a.m47232a(new SwitchWalletActivity$binding$2(this));

    /* renamed from: s */
    public final ef3 f41501s = new dd7(ua5.m52727b(MultiWalletViewModel.class), new SwitchWalletActivity$special$$inlined$viewModels$default$2(this), new SwitchWalletActivity$special$$inlined$viewModels$default$1(this), new SwitchWalletActivity$special$$inlined$viewModels$default$3((pc2) null, this));

    /* renamed from: x */
    public final ef3 f41502x = C6169a.m47232a(new SwitchWalletActivity$walletAdapter$2(this));

    /* renamed from: y */
    public final ef3 f41503y = C6169a.m47232a(new SwitchWalletActivity$touchListener$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/SwitchWalletActivity$a;", "", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.SwitchWalletActivity$a */
    /* compiled from: SwitchWalletActivity.kt */
    public static final class C8201a {
        public C8201a() {
        }

        public /* synthetic */ C8201a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c0 */
    public static final void m65527c0(SwitchWalletActivity switchWalletActivity, View view) {
        vx2.m53591g(switchWalletActivity, "this$0");
        switchWalletActivity.onBackPressed();
    }

    /* renamed from: d0 */
    public static final void m65528d0(SwitchWalletActivity switchWalletActivity, View view) {
        vx2.m53591g(switchWalletActivity, "this$0");
        switchWalletActivity.startActivity(new Intent(switchWalletActivity, MainActivity.class));
    }

    /* renamed from: e0 */
    public static final void m65529e0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Y */
    public final C3888bb mo56919Y() {
        return (C3888bb) this.f41500r.getValue();
    }

    /* renamed from: Z */
    public final MultiWalletViewModel mo56920Z() {
        return (MultiWalletViewModel) this.f41501s.getValue();
    }

    /* renamed from: a0 */
    public final RecyclerTouchListener mo56921a0() {
        return (RecyclerTouchListener) this.f41503y.getValue();
    }

    /* renamed from: b0 */
    public final fj7 mo56922b0() {
        return (fj7) this.f41502x.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56919Y().mo29516b());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C3888bb Y = mo56919Y();
        Y.f21216b.setLayoutManager(new LinearLayoutManager(this, 1, false));
        Y.f21216b.setAdapter(mo56922b0());
        tr6 tr6 = Y.f21217c;
        tr6.f34318d.setOnClickListener(new lj6(this));
        tr6.f34320f.setText(R.string.switch_wallet_screen_title);
        tr6.f34317c.setOnClickListener(new mj6(this));
        mo56920Z().mo61261w().observe(this, new nj6(new SwitchWalletActivity$onPostCreate$2(this)));
        mo56995J();
    }
}
