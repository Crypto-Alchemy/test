package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: BitcoinScript */
class BitcoinScriptPhantomReference extends PhantomReference<BitcoinScript> {
    private static ReferenceQueue<BitcoinScript> queue = new ReferenceQueue<>();
    private static Set<BitcoinScriptPhantomReference> references = new HashSet();
    private long nativeHandle;

    private BitcoinScriptPhantomReference(BitcoinScript bitcoinScript, long j) {
        super(bitcoinScript, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (BitcoinScriptPhantomReference bitcoinScriptPhantomReference = (BitcoinScriptPhantomReference) queue.poll(); bitcoinScriptPhantomReference != null; bitcoinScriptPhantomReference = (BitcoinScriptPhantomReference) queue.poll()) {
            BitcoinScript.nativeDelete(bitcoinScriptPhantomReference.nativeHandle);
            references.remove(bitcoinScriptPhantomReference);
        }
    }

    public static void register(BitcoinScript bitcoinScript, long j) {
        references.add(new BitcoinScriptPhantomReference(bitcoinScript, j));
    }
}
