package p000;

import androidx.paging.LoadType;
import kotlin.Metadata;

@Metadata(mo44875bv = {1, 0, 3}, mo44878k = 3, mo44879mv = {1, 4, 2})
/* renamed from: zi3 */
public final /* synthetic */ class zi3 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f20558a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f20559b;

    static {
        int[] iArr = new int[LoadType.values().length];
        f20558a = iArr;
        LoadType loadType = LoadType.APPEND;
        iArr[loadType.ordinal()] = 1;
        LoadType loadType2 = LoadType.PREPEND;
        iArr[loadType2.ordinal()] = 2;
        LoadType loadType3 = LoadType.REFRESH;
        iArr[loadType3.ordinal()] = 3;
        int[] iArr2 = new int[LoadType.values().length];
        f20559b = iArr2;
        iArr2[loadType3.ordinal()] = 1;
        iArr2[loadType.ordinal()] = 2;
        iArr2[loadType2.ordinal()] = 3;
    }
}
