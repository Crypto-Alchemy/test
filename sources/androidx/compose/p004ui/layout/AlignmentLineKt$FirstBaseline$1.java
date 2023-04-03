package androidx.compose.p004ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.layout.AlignmentLineKt$FirstBaseline$1 */
/* compiled from: AlignmentLine.kt */
public /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements fd2<Integer, Integer, Integer> {
    public static final AlignmentLineKt$FirstBaseline$1 INSTANCE = new AlignmentLineKt$FirstBaseline$1();

    public AlignmentLineKt$FirstBaseline$1() {
        super(2, yo3.class, "min", "min(II)I", 1);
    }

    public final Integer invoke(int i, int i2) {
        return Integer.valueOf(Math.min(i, i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
