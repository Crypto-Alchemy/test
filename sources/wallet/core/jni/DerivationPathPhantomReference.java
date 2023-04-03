package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: DerivationPath */
class DerivationPathPhantomReference extends PhantomReference<DerivationPath> {
    private static ReferenceQueue<DerivationPath> queue = new ReferenceQueue<>();
    private static Set<DerivationPathPhantomReference> references = new HashSet();
    private long nativeHandle;

    private DerivationPathPhantomReference(DerivationPath derivationPath, long j) {
        super(derivationPath, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (DerivationPathPhantomReference derivationPathPhantomReference = (DerivationPathPhantomReference) queue.poll(); derivationPathPhantomReference != null; derivationPathPhantomReference = (DerivationPathPhantomReference) queue.poll()) {
            DerivationPath.nativeDelete(derivationPathPhantomReference.nativeHandle);
            references.remove(derivationPathPhantomReference);
        }
    }

    public static void register(DerivationPath derivationPath, long j) {
        references.add(new DerivationPathPhantomReference(derivationPath, j));
    }
}
