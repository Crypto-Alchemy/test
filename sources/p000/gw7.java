package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: gw7 */
public final class gw7 implements th4, gh4 {

    /* renamed from: a */
    public final CountDownLatch f29378a = new CountDownLatch(1);

    public /* synthetic */ gw7(byte[] bArr) {
    }

    /* renamed from: a */
    public final void mo42680a(Exception exc) {
        this.f29378a.countDown();
    }

    /* renamed from: b */
    public final void mo43013b() throws InterruptedException {
        this.f29378a.await();
    }

    public final void onSuccess(Object obj) {
        this.f29378a.countDown();
    }
}
