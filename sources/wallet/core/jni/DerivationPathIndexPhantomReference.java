package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: DerivationPathIndex */
class DerivationPathIndexPhantomReference extends PhantomReference<DerivationPathIndex> {
    private static ReferenceQueue<DerivationPathIndex> queue = new ReferenceQueue<>();
    private static Set<DerivationPathIndexPhantomReference> references = new HashSet();
    private long nativeHandle;

    private DerivationPathIndexPhantomReference(DerivationPathIndex derivationPathIndex, long j) {
        super(derivationPathIndex, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (DerivationPathIndexPhantomReference derivationPathIndexPhantomReference = (DerivationPathIndexPhantomReference) queue.poll(); derivationPathIndexPhantomReference != null; derivationPathIndexPhantomReference = (DerivationPathIndexPhantomReference) queue.poll()) {
            DerivationPathIndex.nativeDelete(derivationPathIndexPhantomReference.nativeHandle);
            references.remove(derivationPathIndexPhantomReference);
        }
    }

    public static void register(DerivationPathIndex derivationPathIndex, long j) {
        references.add(new DerivationPathIndexPhantomReference(derivationPathIndex, j));
    }
}
