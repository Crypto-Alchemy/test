package net.safemoon.androidwallet.activity;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.BasicActivity;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTImportWalletOptionActivity;", "Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "onBackPressed", "Lp9;", "r", "Lef3;", "V", "()Lp9;", "binding", "<init>", "()V", "s", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTImportWalletOptionActivity.kt */
public final class AKTImportWalletOptionActivity extends BasicActivity {

    /* renamed from: s */
    public static final C8142a f41296s = new C8142a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public final ef3 f41297r = C6169a.m47232a(new AKTImportWalletOptionActivity$binding$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTImportWalletOptionActivity$a;", "", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTImportWalletOptionActivity$a */
    /* compiled from: AKTImportWalletOptionActivity.kt */
    public static final class C8142a {
        public C8142a() {
        }

        public /* synthetic */ C8142a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: W */
    public static final void m64977W(AKTImportWalletOptionActivity aKTImportWalletOptionActivity, View view) {
        vx2.m53591g(aKTImportWalletOptionActivity, "this$0");
        AKTImportWordActivity.f41298I.mo56665a(aKTImportWalletOptionActivity, 12);
    }

    /* renamed from: X */
    public static final void m64978X(AKTImportWalletOptionActivity aKTImportWalletOptionActivity, View view) {
        vx2.m53591g(aKTImportWalletOptionActivity, "this$0");
        AKTImportWordActivity.f41298I.mo56665a(aKTImportWalletOptionActivity, 24);
    }

    /* renamed from: Y */
    public static final void m64979Y(AKTImportWalletOptionActivity aKTImportWalletOptionActivity, View view) {
        vx2.m53591g(aKTImportWalletOptionActivity, "this$0");
        AKTImportPrivateKeyActivity.f41294C.mo56654a(aKTImportWalletOptionActivity);
    }

    /* renamed from: Z */
    public static final void m64980Z(AKTImportWalletOptionActivity aKTImportWalletOptionActivity, View view) {
        vx2.m53591g(aKTImportWalletOptionActivity, "this$0");
        MyApplicationClass.m64669c().f41193y = true;
        AKTHomeActivity.m64858g1(aKTImportWalletOptionActivity);
        aKTImportWalletOptionActivity.finish();
    }

    /* renamed from: V */
    public final C6342p9 mo56657V() {
        return (C6342p9) this.f41297r.getValue();
    }

    public void onBackPressed() {
        MyApplicationClass.m64669c().f41193y = true;
        AKTHomeActivity.m64858g1(this);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56657V().mo46668b());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawableResource(R.drawable.ic_bg);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C6342p9 V = mo56657V();
        V.f32602j.setOnClickListener(new C6789a1(this));
        V.f32603k.setOnClickListener(new C6840b1(this));
        V.f32601i.setOnClickListener(new C6915c1(this));
        V.f32594b.setOnClickListener(new C6958d1(this));
        mo56995J();
    }
}
