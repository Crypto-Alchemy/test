package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: wv7 */
public final /* synthetic */ class wv7 implements ThreadFactory {

    /* renamed from: d */
    public static final ThreadFactory f35449d = new wv7();

    /* renamed from: e */
    public static final ThreadFactory f35450e = new wv7((byte[]) null);

    /* renamed from: a */
    public final /* synthetic */ int f35451a = 0;

    public wv7() {
    }

    public wv7(byte[] bArr) {
    }

    public final Thread newThread(Runnable runnable) {
        return this.f35451a != 0 ? new Thread(runnable, "AssetPackBackgroundExecutor") : new Thread(runnable, "UpdateListenerExecutor");
    }
}
