package p000;

import com.walletconnect.android.internal.common.p013di.CoreNetworkModuleKt$coreAndroidNetworkModule$1;
import okhttp3.Interceptor;
import okhttp3.Response;

/* renamed from: xt0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class xt0 implements Interceptor {

    /* renamed from: a */
    public final /* synthetic */ String f35689a;

    public /* synthetic */ xt0(String str) {
        this.f35689a = str;
    }

    public final Response intercept(Interceptor.Chain chain) {
        return CoreNetworkModuleKt$coreAndroidNetworkModule$1.C55391.invoke$lambda$0(this.f35689a, chain);
    }
}
