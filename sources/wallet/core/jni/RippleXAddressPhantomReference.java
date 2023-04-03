package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RippleXAddress */
class RippleXAddressPhantomReference extends PhantomReference<RippleXAddress> {
    private static ReferenceQueue<RippleXAddress> queue = new ReferenceQueue<>();
    private static Set<RippleXAddressPhantomReference> references = new HashSet();
    private long nativeHandle;

    private RippleXAddressPhantomReference(RippleXAddress rippleXAddress, long j) {
        super(rippleXAddress, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (RippleXAddressPhantomReference rippleXAddressPhantomReference = (RippleXAddressPhantomReference) queue.poll(); rippleXAddressPhantomReference != null; rippleXAddressPhantomReference = (RippleXAddressPhantomReference) queue.poll()) {
            RippleXAddress.nativeDelete(rippleXAddressPhantomReference.nativeHandle);
            references.remove(rippleXAddressPhantomReference);
        }
    }

    public static void register(RippleXAddress rippleXAddress, long j) {
        references.add(new RippleXAddressPhantomReference(rippleXAddress, j));
    }
}
