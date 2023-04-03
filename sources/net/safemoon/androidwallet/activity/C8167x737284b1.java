package net.safemoon.androidwallet.activity;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/content/DialogInterface;", "it", "Lr37;", "invoke", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.activity.AKTSecurityQuestionsActivity$showConfirmSecurityQuestionsDialog$1 */
/* compiled from: AKTSecurityQuestionsActivity.kt */
public final class C8167x737284b1 extends Lambda implements rc2<DialogInterface, r37> {
    public final /* synthetic */ AKTSecurityQuestionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8167x737284b1(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity) {
        super(1);
        this.this$0 = aKTSecurityQuestionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DialogInterface) obj);
        return r37.f33317a;
    }

    public final void invoke(DialogInterface dialogInterface) {
        vx2.m53591g(dialogInterface, "it");
        if (this.this$0.f41354e1) {
            AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity = this.this$0;
            this.this$0.mo56735B1(aKTSecurityQuestionsActivity.mo56741Y0(aKTSecurityQuestionsActivity.mo56746d1()));
            return;
        }
        AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity2 = this.this$0;
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = aKTSecurityQuestionsActivity2.getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        aKTSecurityQuestionsActivity2.f8528r = aVar.mo57297a(false, string, "");
        ProgressLoading E0 = this.this$0.f8528r;
        if (E0 != null) {
            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "supportFragmentManager");
            E0.mo57295D(supportFragmentManager);
        }
        AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity3 = this.this$0;
        aKTSecurityQuestionsActivity3.mo56753v1(aKTSecurityQuestionsActivity3.mo56746d1());
    }
}
