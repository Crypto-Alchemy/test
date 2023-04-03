package p000;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¨\u0006\f"}, mo44877d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Ljava/lang/StackTraceElement;", "d", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/StackTraceElement;", "Lv21;", "b", "", "c", "expected", "actual", "Lr37;", "a", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: w21 */
/* compiled from: DebugMetadata.kt */
public final class w21 {
    /* renamed from: a */
    public static final void m53672a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    public static final v21 m53673b(BaseContinuationImpl baseContinuationImpl) {
        return (v21) baseContinuationImpl.getClass().getAnnotation(v21.class);
    }

    /* renamed from: c */
    public static final int m53674c(BaseContinuationImpl baseContinuationImpl) {
        Integer num;
        int i;
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m53675d(BaseContinuationImpl baseContinuationImpl) {
        int i;
        String str;
        vx2.m53591g(baseContinuationImpl, "<this>");
        v21 b = m53673b(baseContinuationImpl);
        if (b == null) {
            return null;
        }
        m53672a(1, b.mo48635v());
        int c = m53674c(baseContinuationImpl);
        if (c < 0) {
            i = -1;
        } else {
            i = b.mo48633l()[c];
        }
        String b2 = px3.f32871a.mo46919b(baseContinuationImpl);
        if (b2 == null) {
            str = b.mo48631c();
        } else {
            str = b2 + '/' + b.mo48631c();
        }
        return new StackTraceElement(str, b.mo48634m(), b.mo48632f(), i);
    }
}
