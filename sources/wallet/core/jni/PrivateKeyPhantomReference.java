package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PrivateKey */
class PrivateKeyPhantomReference extends PhantomReference<PrivateKey> {
    private static ReferenceQueue<PrivateKey> queue = new ReferenceQueue<>();
    private static Set<PrivateKeyPhantomReference> references = new HashSet();
    private long nativeHandle;

    private PrivateKeyPhantomReference(PrivateKey privateKey, long j) {
        super(privateKey, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (PrivateKeyPhantomReference privateKeyPhantomReference = (PrivateKeyPhantomReference) queue.poll(); privateKeyPhantomReference != null; privateKeyPhantomReference = (PrivateKeyPhantomReference) queue.poll()) {
            PrivateKey.nativeDelete(privateKeyPhantomReference.nativeHandle);
            references.remove(privateKeyPhantomReference);
        }
    }

    public static void register(PrivateKey privateKey, long j) {
        references.add(new PrivateKeyPhantomReference(privateKey, j));
    }
}
