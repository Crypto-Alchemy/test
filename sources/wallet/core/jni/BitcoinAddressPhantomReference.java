package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: BitcoinAddress */
class BitcoinAddressPhantomReference extends PhantomReference<BitcoinAddress> {
    private static ReferenceQueue<BitcoinAddress> queue = new ReferenceQueue<>();
    private static Set<BitcoinAddressPhantomReference> references = new HashSet();
    private long nativeHandle;

    private BitcoinAddressPhantomReference(BitcoinAddress bitcoinAddress, long j) {
        super(bitcoinAddress, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (BitcoinAddressPhantomReference bitcoinAddressPhantomReference = (BitcoinAddressPhantomReference) queue.poll(); bitcoinAddressPhantomReference != null; bitcoinAddressPhantomReference = (BitcoinAddressPhantomReference) queue.poll()) {
            BitcoinAddress.nativeDelete(bitcoinAddressPhantomReference.nativeHandle);
            references.remove(bitcoinAddressPhantomReference);
        }
    }

    public static void register(BitcoinAddress bitcoinAddress, long j) {
        references.add(new BitcoinAddressPhantomReference(bitcoinAddress, j));
    }
}
