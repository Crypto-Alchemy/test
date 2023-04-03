package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: NervosAddress */
class NervosAddressPhantomReference extends PhantomReference<NervosAddress> {
    private static ReferenceQueue<NervosAddress> queue = new ReferenceQueue<>();
    private static Set<NervosAddressPhantomReference> references = new HashSet();
    private long nativeHandle;

    private NervosAddressPhantomReference(NervosAddress nervosAddress, long j) {
        super(nervosAddress, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (NervosAddressPhantomReference nervosAddressPhantomReference = (NervosAddressPhantomReference) queue.poll(); nervosAddressPhantomReference != null; nervosAddressPhantomReference = (NervosAddressPhantomReference) queue.poll()) {
            NervosAddress.nativeDelete(nervosAddressPhantomReference.nativeHandle);
            references.remove(nervosAddressPhantomReference);
        }
    }

    public static void register(NervosAddress nervosAddress, long j) {
        references.add(new NervosAddressPhantomReference(nervosAddress, j));
    }
}
