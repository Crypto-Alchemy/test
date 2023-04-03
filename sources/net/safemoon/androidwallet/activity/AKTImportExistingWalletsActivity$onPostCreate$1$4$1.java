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
public final class AKTImportExistingWalletsActivity$onPostCreate$1$4$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ AKTImportExistingWalletsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTImportExistingWalletsActivity$onPostCreate$1$4$1(AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity) {
        super(0);
        this.this$0 = aKTImportExistingWalletsActivity;
    }

    /* renamed from: b */
    public static final void m64951b(AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity) {
        vx2.m53591g(aKTImportExistingWalletsActivity, "this$0");
        aKTImportExistingWalletsActivity.mo56642X0();
    }

    public final void invoke() {
        AKTImportExistingWalletsActivity aKTImportExistingWalletsActivity = this.this$0;
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = aKTImportExistingWalletsActivity.getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        aKTImportExistingWalletsActivity.f8528r = aVar.mo57297a(false, string, "");
        ProgressLoading v0 = this.this$0.f8528r;
        if (v0 != null) {
            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "supportFragmentManager");
            v0.mo57295D(supportFragmentManager);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new C8221d(this.this$0), 500);
    }
}
