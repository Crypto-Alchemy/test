package p000;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00030\u00030\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR$\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo44877d2 = {"Lji4;", "", "Lkotlin/Function1;", "Landroid/content/Intent;", "Lr37;", "callback", "Lwa;", "b", "Landroidx/appcompat/app/AppCompatActivity;", "a", "Landroidx/appcompat/app/AppCompatActivity;", "appCompatActivity", "kotlin.jvm.PlatformType", "Lwa;", "requestActivity", "c", "Lrc2;", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ji4 */
/* compiled from: OpenActivityForResult.kt */
public final class ji4 {

    /* renamed from: a */
    public final AppCompatActivity f38731a;

    /* renamed from: b */
    public final C3529wa<Intent> f38732b;

    /* renamed from: c */
    public rc2<? super Intent, r37> f38733c;

    public ji4(AppCompatActivity appCompatActivity) {
        vx2.m53591g(appCompatActivity, "appCompatActivity");
        this.f38731a = appCompatActivity;
        C3529wa<Intent> registerForActivityResult = appCompatActivity.registerForActivityResult(new C3474va(), new ii4(this));
        vx2.m53590f(registerForActivityResult, "appCompatActivity.regist…)\n            }\n        }");
        this.f38732b = registerForActivityResult;
    }

    /* renamed from: c */
    public static final void m59433c(ji4 ji4, ActivityResult activityResult) {
        vx2.m53591g(ji4, "this$0");
        if (activityResult.mo918b() == -1) {
            rc2<? super Intent, r37> rc2 = ji4.f38733c;
            if (rc2 == null) {
                vx2.m53605u("callback");
                rc2 = null;
            }
            rc2.invoke(activityResult.mo917a());
        }
    }

    /* renamed from: b */
    public final C3529wa<Intent> mo52724b(rc2<? super Intent, r37> rc2) {
        vx2.m53591g(rc2, "callback");
        this.f38733c = rc2;
        return this.f38732b;
    }
}
