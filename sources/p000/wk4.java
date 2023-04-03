package p000;

import androidx.paging.LoadType;
import kotlin.Metadata;

@Metadata(mo44875bv = {1, 0, 3}, mo44878k = 3, mo44879mv = {1, 4, 2})
/* renamed from: wk4 */
public final /* synthetic */ class wk4 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f19149a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f19150b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f19151c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f19152d;

    /* renamed from: e */
    public static final /* synthetic */ int[] f19153e;

    static {
        int[] iArr = new int[LoadType.values().length];
        f19149a = iArr;
        LoadType loadType = LoadType.REFRESH;
        iArr[loadType.ordinal()] = 1;
        int[] iArr2 = new int[LoadType.values().length];
        f19150b = iArr2;
        iArr2[loadType.ordinal()] = 1;
        int[] iArr3 = new int[LoadType.values().length];
        f19151c = iArr3;
        LoadType loadType2 = LoadType.PREPEND;
        iArr3[loadType2.ordinal()] = 1;
        LoadType loadType3 = LoadType.APPEND;
        iArr3[loadType3.ordinal()] = 2;
        iArr3[loadType.ordinal()] = 3;
        int[] iArr4 = new int[LoadType.values().length];
        f19152d = iArr4;
        iArr4[loadType2.ordinal()] = 1;
        iArr4[loadType3.ordinal()] = 2;
        int[] iArr5 = new int[LoadType.values().length];
        f19153e = iArr5;
        iArr5[loadType2.ordinal()] = 1;
    }
}
