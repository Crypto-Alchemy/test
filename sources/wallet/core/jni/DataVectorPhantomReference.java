package wallet.core.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: DataVector */
class DataVectorPhantomReference extends PhantomReference<DataVector> {
    private static ReferenceQueue<DataVector> queue = new ReferenceQueue<>();
    private static Set<DataVectorPhantomReference> references = new HashSet();
    private long nativeHandle;

    private DataVectorPhantomReference(DataVector dataVector, long j) {
        super(dataVector, queue);
        this.nativeHandle = j;
    }

    public static void doDeletes() {
        for (DataVectorPhantomReference dataVectorPhantomReference = (DataVectorPhantomReference) queue.poll(); dataVectorPhantomReference != null; dataVectorPhantomReference = (DataVectorPhantomReference) queue.poll()) {
            DataVector.nativeDelete(dataVectorPhantomReference.nativeHandle);
            references.remove(dataVectorPhantomReference);
        }
    }

    public static void register(DataVector dataVector, long j) {
        references.add(new DataVectorPhantomReference(dataVector, j));
    }
}
