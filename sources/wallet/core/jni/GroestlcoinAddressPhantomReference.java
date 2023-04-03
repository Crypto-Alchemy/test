package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GroestlcoinAddress */
class GroestlcoinAddressPhantomReference extends PhantomReference<GroestlcoinAddress> {
    private static ReferenceQueue<GroestlcoinAddress> queue = new ReferenceQueue<>();
    private static Set<GroestlcoinAddressPhantomReference> references = new HashSet();
    private long nativeHandle;

    private GroestlcoinAddressPhantomReference(GroestlcoinAddress groestlcoinAddress, long j) {
        super(groestlcoinAddress, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (GroestlcoinAddressPhantomReference groestlcoinAddressPhantomReference = (GroestlcoinAddressPhantomReference) queue.poll(); groestlcoinAddressPhantomReference != null; groestlcoinAddressPhantomReference = (GroestlcoinAddressPhantomReference) queue.poll()) {
            GroestlcoinAddress.nativeDelete(groestlcoinAddressPhantomReference.nativeHandle);
            references.remove(groestlcoinAddressPhantomReference);
        }
    }

    public static void register(GroestlcoinAddress groestlcoinAddress, long j) {
        references.add(new GroestlcoinAddressPhantomReference(groestlcoinAddress, j));
    }
}
