package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: vw7 */
public final class vw7 implements xt7<Executor> {

    /* renamed from: a */
    public final /* synthetic */ int f35183a = 0;

    public vw7() {
    }

    public vw7(byte[] bArr) {
    }

    public vw7(char[] cArr) {
    }

    public vw7(short[] sArr) {
    }

    /* renamed from: b */
    public static Executor m53580b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(wv7.f35449d);
        ns7.m49004k(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: c */
    public static Executor m53581c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(wv7.f35450e);
        ns7.m49004k(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: d */
    public static hs7 m53582d() {
        return new hs7();
    }

    /* renamed from: e */
    public static rs7 m53583e() {
        return new rs7();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42984a() {
        int i = this.f35183a;
        return i != 0 ? i != 1 ? i != 2 ? m53583e() : m53582d() : m53581c() : m53580b();
    }
}
