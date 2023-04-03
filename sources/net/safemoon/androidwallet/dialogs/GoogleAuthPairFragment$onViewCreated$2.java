package net.safemoon.androidwallet.dialogs;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: GoogleAuthPairFragment.kt */
public final class GoogleAuthPairFragment$onViewCreated$2 extends Lambda implements rc2<Bitmap, r37> {
    public final /* synthetic */ GoogleAuthPairFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GoogleAuthPairFragment$onViewCreated$2(GoogleAuthPairFragment googleAuthPairFragment) {
        super(1);
        this.this$0 = googleAuthPairFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Bitmap) obj);
        return r37.f33317a;
    }

    public final void invoke(Bitmap bitmap) {
        t92 H = this.this$0.f41754Q;
        if (H == null) {
            vx2.m53605u("binding");
            H = null;
        }
        H.f34161i.setImageBitmap(bitmap);
    }
}
