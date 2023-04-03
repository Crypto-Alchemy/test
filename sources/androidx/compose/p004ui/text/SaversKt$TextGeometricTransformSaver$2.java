package androidx.compose.p004ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lqn6;", "invoke", "(Ljava/lang/Object;)Lqn6;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2 */
/* compiled from: Savers.kt */
public final class SaversKt$TextGeometricTransformSaver$2 extends Lambda implements rc2<Object, qn6> {
    public static final SaversKt$TextGeometricTransformSaver$2 INSTANCE = new SaversKt$TextGeometricTransformSaver$2();

    public SaversKt$TextGeometricTransformSaver$2() {
        super(1);
    }

    public final qn6 invoke(Object obj) {
        vx2.m53591g(obj, "it");
        List list = (List) obj;
        return new qn6(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }
}
