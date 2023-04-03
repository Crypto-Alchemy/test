package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lk04;", "Lnet/safemoon/androidwallet/common/TokenType;", "kotlin.jvm.PlatformType", "invoke", "()Lk04;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$selectedTokenType$2 extends Lambda implements pc2<k04<TokenType>> {
    public final /* synthetic */ Application $application;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$selectedTokenType$2(Application application) {
        super(0);
        this.$application = application;
    }

    public final k04<TokenType> invoke() {
        return new k04<>(ol0.m70355e(this.$application));
    }
}
