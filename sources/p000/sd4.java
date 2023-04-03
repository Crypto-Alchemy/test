package p000;

import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;

@Metadata(mo44875bv = {1, 0, 3}, mo44878k = 3, mo44879mv = {1, 4, 2})
/* renamed from: sd4 */
public final /* synthetic */ class sd4 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f33826a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f33827b;

    static {
        int[] iArr = new int[OSInfluenceType.values().length];
        f33826a = iArr;
        OSInfluenceType oSInfluenceType = OSInfluenceType.DIRECT;
        iArr[oSInfluenceType.ordinal()] = 1;
        OSInfluenceType oSInfluenceType2 = OSInfluenceType.INDIRECT;
        iArr[oSInfluenceType2.ordinal()] = 2;
        int[] iArr2 = new int[OSInfluenceType.values().length];
        f33827b = iArr2;
        iArr2[oSInfluenceType.ordinal()] = 1;
        iArr2[oSInfluenceType2.ordinal()] = 2;
    }
}
