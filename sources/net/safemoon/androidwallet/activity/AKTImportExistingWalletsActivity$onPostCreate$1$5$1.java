package net.safemoon.androidwallet.activity;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTImportExistingWalletsActivity.kt */
public final class AKTImportExistingWalletsActivity$onPostCreate$1$5$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ AKTImportExistingWalletsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTImportExistingWalletsActivity$onPostCreate$1$5$1(AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity) {
        super(0);
        this.this$0 = aKTImportExistingWalletsActivity;
    }

    /* renamed from: b */
    public static final void m64953b(AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity, boolean z, String str) {
        vx2.m53591g(aKTImportExistingWalletsActivity, "this$0");
        aKTImportExistingWalletsActivity.mo56639U0();
        f06.m57523n(aKTImportExistingWalletsActivity, "TWO_FACTOR", Boolean.valueOf(z));
        aKTImportExistingWalletsActivity.mo12167j0("API_KEY", str);
        String w0 = aKTImportExistingWalletsActivity.mo56630E0();
        vx2.m53590f(w0, "masterMnemonic");
        aKTImportExistingWalletsActivity.mo56644Z0(w0, false, false);
    }

    public final void invoke() {
        AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity = this.this$0;
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = aKTImportExistingWalletsActivity.getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        aKTImportExistingWalletsActivity.f8528r = aVar.mo57297a(false, string, "");
        ProgressLoading v0 = this.this$0.f8528r;
        FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
        vx2.m53590f(supportFragmentManager, "supportFragmentManager");
        v0.mo57295D(supportFragmentManager);
        boolean d = f06.m57513d(this.this$0, "TWO_FACTOR");
        String d2 = up1.m72959d(this.this$0, "API_KEY", "");
        this.this$0.mo12158W();
        new Handler(Looper.getMainLooper()).postDelayed(new C8222e(this.this$0, d, d2), 500);
    }
}
