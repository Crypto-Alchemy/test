package kotlin.reflect.jvm.internal.calls;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0007"}, mo44877d2 = {"<anonymous>", "", "T", "", "entry", "", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 */
/* compiled from: AnnotationConstructorCaller.kt */
public final class C7383xd18867f3 extends Lambda implements rc2<Map.Entry<? extends String, ? extends Object>, CharSequence> {
    public static final C7383xd18867f3 INSTANCE = new C7383xd18867f3();

    public C7383xd18867f3() {
        super(1);
    }

    public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
        String str;
        vx2.m53591g(entry, "entry");
        String key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            str = Arrays.toString((boolean[]) value);
            vx2.m53590f(str, "toString(this)");
        } else if (value instanceof char[]) {
            str = Arrays.toString((char[]) value);
            vx2.m53590f(str, "toString(this)");
        } else if (value instanceof byte[]) {
            str = Arrays.toString((byte[]) value);
            vx2.m53590f(str, "toString(this)");
        } else if (value instanceof short[]) {
            str = Arrays.toString((short[]) value);
            vx2.m53590f(str, "toString(this)");
        } else if (value instanceof int[]) {
            str = Arrays.toString((int[]) value);
            vx2.m53590f(str, "toString(this)");
        } else if (value instanceof float[]) {
            str = Arrays.toString((float[]) value);
            vx2.m53590f(str, "toString(this)");
        } else if (value instanceof long[]) {
            str = Arrays.toString((long[]) value);
            vx2.m53590f(str, "toString(this)");
        } else if (value instanceof double[]) {
            str = Arrays.toString((double[]) value);
            vx2.m53590f(str, "toString(this)");
        } else if (value instanceof Object[]) {
            str = Arrays.toString((Object[]) value);
            vx2.m53590f(str, "toString(this)");
        } else {
            str = value.toString();
        }
        return key + '=' + str;
    }
}
