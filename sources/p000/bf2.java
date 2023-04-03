package p000;

import androidx.paging.LoadType;
import kotlin.Metadata;

@Metadata(mo44875bv = {1, 0, 3}, mo44878k = 3, mo44879mv = {1, 4, 2})
/* renamed from: bf2 */
public final /* synthetic */ class bf2 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f8124a;

    static {
        int[] iArr = new int[LoadType.values().length];
        f8124a = iArr;
        iArr[LoadType.REFRESH.ordinal()] = 1;
        iArr[LoadType.PREPEND.ordinal()] = 2;
        iArr[LoadType.APPEND.ordinal()] = 3;
    }
}
