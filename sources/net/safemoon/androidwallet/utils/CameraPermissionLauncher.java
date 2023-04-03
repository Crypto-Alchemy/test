package net.safemoon.androidwallet.utils;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lnet/safemoon/androidwallet/utils/CameraPermissionLauncher;", "", "Landroid/view/View;", "view", "Lkotlin/Function0;", "Ljava/lang/Void;", "onCameraPermission", "Lr37;", "c", "Landroidx/appcompat/app/AppCompatActivity;", "a", "Landroidx/appcompat/app/AppCompatActivity;", "activityCompat", "b", "Landroid/view/View;", "layout", "Lpc2;", "Lwa;", "", "kotlin.jvm.PlatformType", "d", "Lwa;", "requestPermissionLauncher", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Landroid/view/View;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CameraPermissionLauncher.kt */
public final class CameraPermissionLauncher {

    /* renamed from: a */
    public final AppCompatActivity f42573a;

    /* renamed from: b */
    public final View f42574b;

    /* renamed from: c */
    public pc2<Void> f42575c;

    /* renamed from: d */
    public final C3529wa<String> f42576d;

    public CameraPermissionLauncher(AppCompatActivity appCompatActivity, View view) {
        vx2.m53591g(appCompatActivity, "activityCompat");
        vx2.m53591g(view, "layout");
        this.f42573a = appCompatActivity;
        this.f42574b = view;
        C3529wa<String> registerForActivityResult = appCompatActivity.registerForActivityResult(new C3399ua(), new da0(this));
        vx2.m53590f(registerForActivityResult, "activityCompat.registerF…)\n            }\n        }");
        this.f42576d = registerForActivityResult;
    }

    /* renamed from: d */
    public static final void m68288d(CameraPermissionLauncher cameraPermissionLauncher, boolean z) {
        vx2.m53591g(cameraPermissionLauncher, "this$0");
        if (z) {
            pc2<Void> pc2 = cameraPermissionLauncher.f42575c;
            if (pc2 == null) {
                vx2.m53605u("onCameraPermission");
                pc2 = null;
            }
            pc2.invoke();
        }
    }

    /* renamed from: c */
    public final void mo60887c(View view, pc2<Void> pc2) {
        vx2.m53591g(view, "view");
        vx2.m53591g(pc2, "onCameraPermission");
        this.f42575c = pc2;
        if (zr0.m31438a(this.f42573a, "android.permission.CAMERA") == 0) {
            pc2.invoke();
        } else if (C3582x9.m29965w(this.f42573a, "android.permission.CAMERA")) {
            View view2 = this.f42574b;
            String string = this.f42573a.getString(R.string.permission_required);
            vx2.m53590f(string, "activityCompat.getString…ring.permission_required)");
            ol0.m70352c0(view2, view, string, -2, this.f42573a.getString(R.string.action_ok), new CameraPermissionLauncher$onClickRequestPermission$1(this));
        } else {
            this.f42576d.mo27473a("android.permission.CAMERA");
        }
    }
}
