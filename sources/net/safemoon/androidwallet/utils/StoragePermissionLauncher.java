package net.safemoon.androidwallet.utils;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lnet/safemoon/androidwallet/utils/StoragePermissionLauncher;", "", "Landroid/view/View;", "view", "Lkotlin/Function0;", "Lr37;", "onStoragePermission", "onStoragePermissionDenied", "c", "Landroidx/appcompat/app/AppCompatActivity;", "a", "Landroidx/appcompat/app/AppCompatActivity;", "activityCompat", "b", "Lpc2;", "Lwa;", "", "kotlin.jvm.PlatformType", "d", "Lwa;", "requestPermissionLauncher", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: StoragePermissionLauncher.kt */
public final class StoragePermissionLauncher {

    /* renamed from: a */
    public final AppCompatActivity f42599a;

    /* renamed from: b */
    public pc2<r37> f42600b;

    /* renamed from: c */
    public pc2<r37> f42601c;

    /* renamed from: d */
    public final C3529wa<String> f42602d;

    public StoragePermissionLauncher(AppCompatActivity appCompatActivity) {
        vx2.m53591g(appCompatActivity, "activityCompat");
        this.f42599a = appCompatActivity;
        C3529wa<String> registerForActivityResult = appCompatActivity.registerForActivityResult(new C3399ua(), new ga6(this));
        vx2.m53590f(registerForActivityResult, "activityCompat.registerF…)\n            }\n        }");
        this.f42602d = registerForActivityResult;
    }

    /* renamed from: d */
    public static final void m68349d(StoragePermissionLauncher storagePermissionLauncher, boolean z) {
        vx2.m53591g(storagePermissionLauncher, "this$0");
        pc2<r37> pc2 = null;
        if (z) {
            pc2<r37> pc22 = storagePermissionLauncher.f42600b;
            if (pc22 == null) {
                vx2.m53605u("onStoragePermission");
            } else {
                pc2 = pc22;
            }
            pc2.invoke();
            return;
        }
        pc2<r37> pc23 = storagePermissionLauncher.f42601c;
        if (pc23 == null) {
            vx2.m53605u("onStoragePermissionDenied");
        } else {
            pc2 = pc23;
        }
        pc2.invoke();
    }

    /* renamed from: c */
    public final void mo60949c(View view, pc2<r37> pc2, pc2<r37> pc22) {
        vx2.m53591g(view, "view");
        vx2.m53591g(pc2, "onStoragePermission");
        vx2.m53591g(pc22, "onStoragePermissionDenied");
        this.f42600b = pc2;
        this.f42601c = pc22;
        if (zr0.m31438a(this.f42599a, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            pc2.invoke();
        } else if (C3582x9.m29965w(this.f42599a, "android.permission.READ_EXTERNAL_STORAGE")) {
            String string = this.f42599a.getString(R.string.permission_required);
            vx2.m53590f(string, "activityCompat.getString…ring.permission_required)");
            ol0.m70352c0(view, view, string, -2, this.f42599a.getString(R.string.action_ok), new StoragePermissionLauncher$onClickRequestPermission$1(this));
        } else {
            this.f42602d.mo27473a("android.permission.READ_EXTERNAL_STORAGE");
        }
    }
}
