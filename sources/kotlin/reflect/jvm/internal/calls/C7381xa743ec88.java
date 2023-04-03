package kotlin.reflect.jvm.internal.calls;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "", "T", "", "invoke", "()Ljava/lang/Integer;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2 */
/* compiled from: AnnotationConstructorCaller.kt */
public final class C7381xa743ec88 extends Lambda implements pc2<Integer> {
    public final /* synthetic */ Map<String, Object> $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7381xa743ec88(Map<String, ? extends Object> map) {
        super(0);
        this.$values = map;
    }

    public final Integer invoke() {
        int i;
        int i2 = 0;
        for (Map.Entry entry : this.$values.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof boolean[]) {
                i = Arrays.hashCode((boolean[]) value);
            } else if (value instanceof char[]) {
                i = Arrays.hashCode((char[]) value);
            } else if (value instanceof byte[]) {
                i = Arrays.hashCode((byte[]) value);
            } else if (value instanceof short[]) {
                i = Arrays.hashCode((short[]) value);
            } else if (value instanceof int[]) {
                i = Arrays.hashCode((int[]) value);
            } else if (value instanceof float[]) {
                i = Arrays.hashCode((float[]) value);
            } else if (value instanceof long[]) {
                i = Arrays.hashCode((long[]) value);
            } else if (value instanceof double[]) {
                i = Arrays.hashCode((double[]) value);
            } else if (value instanceof Object[]) {
                i = Arrays.hashCode((Object[]) value);
            } else {
                i = value.hashCode();
            }
            i2 += i ^ (str.hashCode() * 127);
        }
        return Integer.valueOf(i2);
    }
}
