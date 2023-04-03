package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.repository.ReflectionDataSource;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CustomReflectionContractTokenViewModel.kt */
public final class CustomReflectionContractTokenViewModel$reflectionDataSource$2 extends Lambda implements pc2<ReflectionDataSource> {
    public final /* synthetic */ Application $application;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomReflectionContractTokenViewModel$reflectionDataSource$2(Application application) {
        super(0);
        this.$application = application;
    }

    public final ReflectionDataSource invoke() {
        return va5.f45251a.mo66465a(this.$application);
    }
}
