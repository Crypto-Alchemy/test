package p000;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import okhttp3.internal.http2.Http2;

/* renamed from: g91 */
/* compiled from: DefaultNativeMemoryChunkPoolParams */
public class g91 {
    /* renamed from: a */
    public static ms4 m17688a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE, 5);
        sparseIntArray.put(2048, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(Http2.INITIAL_MAX_FRAME_SIZE, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        return new ms4(m17690c(), m17689b(), sparseIntArray);
    }

    /* renamed from: b */
    public static int m17689b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return min / 2;
        }
        return (min / 4) * 3;
    }

    /* renamed from: c */
    public static int m17690c() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 3145728;
        }
        if (min < 33554432) {
            return 6291456;
        }
        return 12582912;
    }
}
