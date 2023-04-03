package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SolanaAddress */
class SolanaAddressPhantomReference extends PhantomReference<SolanaAddress> {
    private static ReferenceQueue<SolanaAddress> queue = new ReferenceQueue<>();
    private static Set<SolanaAddressPhantomReference> references = new HashSet();
    private long nativeHandle;

    private SolanaAddressPhantomReference(SolanaAddress solanaAddress, long j) {
        super(solanaAddress, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (SolanaAddressPhantomReference solanaAddressPhantomReference = (SolanaAddressPhantomReference) queue.poll(); solanaAddressPhantomReference != null; solanaAddressPhantomReference = (SolanaAddressPhantomReference) queue.poll()) {
            SolanaAddress.nativeDelete(solanaAddressPhantomReference.nativeHandle);
            references.remove(solanaAddressPhantomReference);
        }
    }

    public static void register(SolanaAddress solanaAddress, long j) {
        references.add(new SolanaAddressPhantomReference(solanaAddress, j));
    }
}
