package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: FIOAccount */
class FIOAccountPhantomReference extends PhantomReference<FIOAccount> {
    private static ReferenceQueue<FIOAccount> queue = new ReferenceQueue<>();
    private static Set<FIOAccountPhantomReference> references = new HashSet();
    private long nativeHandle;

    private FIOAccountPhantomReference(FIOAccount fIOAccount, long j) {
        super(fIOAccount, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (FIOAccountPhantomReference fIOAccountPhantomReference = (FIOAccountPhantomReference) queue.poll(); fIOAccountPhantomReference != null; fIOAccountPhantomReference = (FIOAccountPhantomReference) queue.poll()) {
            FIOAccount.nativeDelete(fIOAccountPhantomReference.nativeHandle);
            references.remove(fIOAccountPhantomReference);
        }
    }

    public static void register(FIOAccount fIOAccount, long j) {
        references.add(new FIOAccountPhantomReference(fIOAccount, j));
    }
}
