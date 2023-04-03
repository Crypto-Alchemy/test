package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: StoredKey */
class StoredKeyPhantomReference extends PhantomReference<StoredKey> {
    private static ReferenceQueue<StoredKey> queue = new ReferenceQueue<>();
    private static Set<StoredKeyPhantomReference> references = new HashSet();
    private long nativeHandle;

    private StoredKeyPhantomReference(StoredKey storedKey, long j) {
        super(storedKey, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (StoredKeyPhantomReference storedKeyPhantomReference = (StoredKeyPhantomReference) queue.poll(); storedKeyPhantomReference != null; storedKeyPhantomReference = (StoredKeyPhantomReference) queue.poll()) {
            StoredKey.nativeDelete(storedKeyPhantomReference.nativeHandle);
            references.remove(storedKeyPhantomReference);
        }
    }

    public static void register(StoredKey storedKey, long j) {
        references.add(new StoredKeyPhantomReference(storedKey, j));
    }
}
