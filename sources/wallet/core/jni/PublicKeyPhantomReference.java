package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PublicKey */
class PublicKeyPhantomReference extends PhantomReference<PublicKey> {
    private static ReferenceQueue<PublicKey> queue = new ReferenceQueue<>();
    private static Set<PublicKeyPhantomReference> references = new HashSet();
    private long nativeHandle;

    private PublicKeyPhantomReference(PublicKey publicKey, long j) {
        super(publicKey, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (PublicKeyPhantomReference publicKeyPhantomReference = (PublicKeyPhantomReference) queue.poll(); publicKeyPhantomReference != null; publicKeyPhantomReference = (PublicKeyPhantomReference) queue.poll()) {
            PublicKey.nativeDelete(publicKeyPhantomReference.nativeHandle);
            references.remove(publicKeyPhantomReference);
        }
    }

    public static void register(PublicKey publicKey, long j) {
        references.add(new PublicKeyPhantomReference(publicKey, j));
    }
}
