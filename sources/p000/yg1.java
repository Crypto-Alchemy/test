package p000;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: yg1 */
/* compiled from: DiskCacheWriteLocker */
public final class yg1 {

    /* renamed from: a */
    public final Map<String, C3675a> f20207a = new HashMap();

    /* renamed from: b */
    public final C3676b f20208b = new C3676b();

    /* renamed from: yg1$a */
    /* compiled from: DiskCacheWriteLocker */
    public static class C3675a {

        /* renamed from: a */
        public final Lock f20209a = new ReentrantLock();

        /* renamed from: b */
        public int f20210b;
    }

    /* renamed from: yg1$b */
    /* compiled from: DiskCacheWriteLocker */
    public static class C3676b {

        /* renamed from: a */
        public final Queue<C3675a> f20211a = new ArrayDeque();

        /* renamed from: a */
        public C3675a mo28058a() {
            C3675a poll;
            synchronized (this.f20211a) {
                poll = this.f20211a.poll();
            }
            if (poll == null) {
                return new C3675a();
            }
            return poll;
        }

        /* renamed from: b */
        public void mo28059b(C3675a aVar) {
            synchronized (this.f20211a) {
                if (this.f20211a.size() < 10) {
                    this.f20211a.offer(aVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo28056a(String str) {
        C3675a aVar;
        synchronized (this) {
            aVar = this.f20207a.get(str);
            if (aVar == null) {
                aVar = this.f20208b.mo28058a();
                this.f20207a.put(str, aVar);
            }
            aVar.f20210b++;
        }
        aVar.f20209a.lock();
    }

    /* renamed from: b */
    public void mo28057b(String str) {
        C3675a aVar;
        synchronized (this) {
            aVar = (C3675a) zt4.m31500d(this.f20207a.get(str));
            int i = aVar.f20210b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f20210b = i2;
                if (i2 == 0) {
                    C3675a remove = this.f20207a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f20208b.mo28059b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f20210b);
            }
        }
        aVar.f20209a.unlock();
    }
}
