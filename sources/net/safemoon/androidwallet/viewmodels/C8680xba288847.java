package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.utils.ReflectionCustomContract;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/utils/ReflectionCustomContract;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel$reflectionCustomContract$2 */
/* compiled from: CustomReflectionContractTokenViewModel.kt */
public final class C8680xba288847 extends Lambda implements pc2<ReflectionCustomContract> {
    public final /* synthetic */ CustomReflectionContractTokenViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8680xba288847(CustomReflectionContractTokenViewModel customReflectionContractTokenViewModel) {
        super(0);
        this.this$0 = customReflectionContractTokenViewModel;
    }

    public final ReflectionCustomContract invoke() {
        Application b = this.this$0.mo27549b();
        vx2.m53590f(b, "getApplication()");
        return new ReflectionCustomContract(b, this.this$0.mo61188r());
    }
}
