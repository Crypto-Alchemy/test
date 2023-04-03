package net.safemoon.androidwallet.utils;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/view/View;", "it", "Lr37;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CameraPermissionLauncher.kt */
public final class CameraPermissionLauncher$onClickRequestPermission$1 extends Lambda implements rc2<View, r37> {
    public final /* synthetic */ CameraPermissionLauncher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraPermissionLauncher$onClickRequestPermission$1(CameraPermissionLauncher cameraPermissionLauncher) {
        super(1);
        this.this$0 = cameraPermissionLauncher;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return r37.f33317a;
    }

    public final void invoke(View view) {
        vx2.m53591g(view, "it");
        this.this$0.f42576d.mo27473a("android.permission.CAMERA");
    }
}
