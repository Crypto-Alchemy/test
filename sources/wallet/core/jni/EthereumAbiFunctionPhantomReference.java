package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: EthereumAbiFunction */
class EthereumAbiFunctionPhantomReference extends PhantomReference<EthereumAbiFunction> {
    private static ReferenceQueue<EthereumAbiFunction> queue = new ReferenceQueue<>();
    private static Set<EthereumAbiFunctionPhantomReference> references = new HashSet();
    private long nativeHandle;

    private EthereumAbiFunctionPhantomReference(EthereumAbiFunction ethereumAbiFunction, long j) {
        super(ethereumAbiFunction, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (EthereumAbiFunctionPhantomReference ethereumAbiFunctionPhantomReference = (EthereumAbiFunctionPhantomReference) queue.poll(); ethereumAbiFunctionPhantomReference != null; ethereumAbiFunctionPhantomReference = (EthereumAbiFunctionPhantomReference) queue.poll()) {
            EthereumAbiFunction.nativeDelete(ethereumAbiFunctionPhantomReference.nativeHandle);
            references.remove(ethereumAbiFunctionPhantomReference);
        }
    }

    public static void register(EthereumAbiFunction ethereumAbiFunction, long j) {
        references.add(new EthereumAbiFunctionPhantomReference(ethereumAbiFunction, j));
    }
}
