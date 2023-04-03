package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SegwitAddress */
class SegwitAddressPhantomReference extends PhantomReference<SegwitAddress> {
    private static ReferenceQueue<SegwitAddress> queue = new ReferenceQueue<>();
    private static Set<SegwitAddressPhantomReference> references = new HashSet();
    private long nativeHandle;

    private SegwitAddressPhantomReference(SegwitAddress segwitAddress, long j) {
        super(segwitAddress, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (SegwitAddressPhantomReference segwitAddressPhantomReference = (SegwitAddressPhantomReference) queue.poll(); segwitAddressPhantomReference != null; segwitAddressPhantomReference = (SegwitAddressPhantomReference) queue.poll()) {
            SegwitAddress.nativeDelete(segwitAddressPhantomReference.nativeHandle);
            references.remove(segwitAddressPhantomReference);
        }
    }

    public static void register(SegwitAddress segwitAddress, long j) {
        references.add(new SegwitAddressPhantomReference(segwitAddress, j));
    }
}
