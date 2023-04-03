package net.safemoon.androidwallet.fragments.preference;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.repository.FcmDataSource;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/repository/FcmDataSource;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: DefaultLanguageFragment.kt */
public final class DefaultLanguageFragment$fcmDataSource$2 extends Lambda implements pc2<FcmDataSource> {
    public final /* synthetic */ DefaultLanguageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultLanguageFragment$fcmDataSource$2(DefaultLanguageFragment defaultLanguageFragment) {
        super(0);
        this.this$0 = defaultLanguageFragment;
    }

    public final FcmDataSource invoke() {
        Application application = this.this$0.requireActivity().getApplication();
        vx2.m53590f(application, "requireActivity().application");
        return new FcmDataSource(application);
    }
}
