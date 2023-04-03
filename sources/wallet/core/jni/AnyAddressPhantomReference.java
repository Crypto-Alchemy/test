package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: AnyAddress */
class AnyAddressPhantomReference extends PhantomReference<AnyAddress> {
    private static ReferenceQueue<AnyAddress> queue = new ReferenceQueue<>();
    private static Set<AnyAddressPhantomReference> references = new HashSet();
    private long nativeHandle;

    private AnyAddressPhantomReference(AnyAddress anyAddress, long j) {
        super(anyAddress, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (AnyAddressPhantomReference anyAddressPhantomReference = (AnyAddressPhantomReference) queue.poll(); anyAddressPhantomReference != null; anyAddressPhantomReference = (AnyAddressPhantomReference) queue.poll()) {
            AnyAddress.nativeDelete(anyAddressPhantomReference.nativeHandle);
            references.remove(anyAddressPhantomReference);
        }
    }

    public static void register(AnyAddress anyAddress, long j) {
        references.add(new AnyAddressPhantomReference(anyAddress, j));
    }
}
