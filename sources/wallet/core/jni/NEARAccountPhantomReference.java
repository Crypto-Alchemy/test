package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: NEARAccount */
class NEARAccountPhantomReference extends PhantomReference<NEARAccount> {
    private static ReferenceQueue<NEARAccount> queue = new ReferenceQueue<>();
    private static Set<NEARAccountPhantomReference> references = new HashSet();
    private long nativeHandle;

    private NEARAccountPhantomReference(NEARAccount nEARAccount, long j) {
        super(nEARAccount, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (NEARAccountPhantomReference nEARAccountPhantomReference = (NEARAccountPhantomReference) queue.poll(); nEARAccountPhantomReference != null; nEARAccountPhantomReference = (NEARAccountPhantomReference) queue.poll()) {
            NEARAccount.nativeDelete(nEARAccountPhantomReference.nativeHandle);
            references.remove(nEARAccountPhantomReference);
        }
    }

    public static void register(NEARAccount nEARAccount, long j) {
        references.add(new NEARAccountPhantomReference(nEARAccount, j));
    }
}
