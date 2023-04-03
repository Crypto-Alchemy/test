package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.BasicActivity;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/ImportWalletOptionActivity;", "Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "Lga;", "r", "Lef3;", "V", "()Lga;", "binding", "<init>", "()V", "s", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ImportWalletOptionActivity.kt */
public final class ImportWalletOptionActivity extends BasicActivity {

    /* renamed from: s */
    public static final C8188a f41452s = new C8188a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public final ef3 f41453r = C6169a.m47232a(new ImportWalletOptionActivity$binding$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/ImportWalletOptionActivity$a;", "", "Landroid/content/Context;", "context", "Lr37;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.ImportWalletOptionActivity$a */
    /* compiled from: ImportWalletOptionActivity.kt */
    public static final class C8188a {
        public C8188a() {
        }

        public /* synthetic */ C8188a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56853a(Context context) {
            vx2.m53591g(context, "context");
            context.startActivity(new Intent(context, ImportWalletOptionActivity.class));
        }
    }

    /* renamed from: W */
    public static final void m65362W(ImportWalletOptionActivity importWalletOptionActivity, View view) {
        vx2.m53591g(importWalletOptionActivity, "this$0");
        ImportWordActivity.f41454C.mo56860a(importWalletOptionActivity, 12);
    }

    /* renamed from: X */
    public static final void m65363X(ImportWalletOptionActivity importWalletOptionActivity, View view) {
        vx2.m53591g(importWalletOptionActivity, "this$0");
        ImportWordActivity.f41454C.mo56860a(importWalletOptionActivity, 24);
    }

    /* renamed from: Y */
    public static final void m65364Y(ImportWalletOptionActivity importWalletOptionActivity, View view) {
        vx2.m53591g(importWalletOptionActivity, "this$0");
        ImportPrivateKeyActivity.f41450A.mo56850a(importWalletOptionActivity);
    }

    /* renamed from: Z */
    public static final void m65365Z(ImportWalletOptionActivity importWalletOptionActivity, View view) {
        vx2.m53591g(importWalletOptionActivity, "this$0");
        importWalletOptionActivity.onBackPressed();
    }

    /* renamed from: V */
    public final C5859ga mo56852V() {
        return (C5859ga) this.f41453r.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56852V().mo42857b());
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
        C5859ga V = mo56852V();
        V.f29142j.setOnClickListener(new ts2(this));
        V.f29143k.setOnClickListener(new us2(this));
        V.f29141i.setOnClickListener(new vs2(this));
        V.f29134b.setOnClickListener(new ws2(this));
        mo56995J();
    }
}
