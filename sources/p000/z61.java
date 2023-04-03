package p000;

import android.util.SparseIntArray;
import okhttp3.internal.http2.Http2;

/* renamed from: z61 */
/* compiled from: DefaultByteArrayPoolParams */
public class z61 {
    /* renamed from: a */
    public static ms4 m30987a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(Http2.INITIAL_MAX_FRAME_SIZE, 5);
        return new ms4(81920, 1048576, sparseIntArray);
    }
}
