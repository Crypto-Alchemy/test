package androidx.compose.p004ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.layout.AlignmentLineKt$LastBaseline$1 */
/* compiled from: AlignmentLine.kt */
public /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements fd2<Integer, Integer, Integer> {
    public static final AlignmentLineKt$LastBaseline$1 INSTANCE = new AlignmentLineKt$LastBaseline$1();

    public AlignmentLineKt$LastBaseline$1() {
        super(2, yo3.class, "max", "max(II)I", 1);
    }

    public final Integer invoke(int i, int i2) {
        return Integer.valueOf(Math.max(i, i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
