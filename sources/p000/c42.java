package p000;

import androidx.paging.LoadType;
import kotlin.Metadata;

@Metadata(mo44875bv = {1, 0, 3}, mo44878k = 3, mo44879mv = {1, 4, 2})
/* renamed from: c42 */
public final /* synthetic */ class c42 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f8325a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f8326b;

    static {
        int[] iArr = new int[LoadType.values().length];
        f8325a = iArr;
        LoadType loadType = LoadType.PREPEND;
        iArr[loadType.ordinal()] = 1;
        LoadType loadType2 = LoadType.APPEND;
        iArr[loadType2.ordinal()] = 2;
        int[] iArr2 = new int[LoadType.values().length];
        f8326b = iArr2;
        iArr2[LoadType.REFRESH.ordinal()] = 1;
        iArr2[loadType.ordinal()] = 2;
        iArr2[loadType2.ordinal()] = 3;
    }
}
