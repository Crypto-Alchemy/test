package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: HDWallet */
class HDWalletPhantomReference extends PhantomReference<HDWallet> {
    private static ReferenceQueue<HDWallet> queue = new ReferenceQueue<>();
    private static Set<HDWalletPhantomReference> references = new HashSet();
    private long nativeHandle;

    private HDWalletPhantomReference(HDWallet hDWallet, long j) {
        super(hDWallet, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (HDWalletPhantomReference hDWalletPhantomReference = (HDWalletPhantomReference) queue.poll(); hDWalletPhantomReference != null; hDWalletPhantomReference = (HDWalletPhantomReference) queue.poll()) {
            HDWallet.nativeDelete(hDWalletPhantomReference.nativeHandle);
            references.remove(hDWalletPhantomReference);
        }
    }

    public static void register(HDWallet hDWallet, long j) {
        references.add(new HDWalletPhantomReference(hDWallet, j));
    }
}
