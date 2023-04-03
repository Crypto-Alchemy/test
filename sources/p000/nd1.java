package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;

/* renamed from: nd1 */
/* compiled from: DeserializationProblemHandler */
public abstract class nd1 {

    /* renamed from: a */
    public static final Object f15523a = new Object();

    /* renamed from: a */
    public Object mo23648a(DeserializationContext deserializationContext, Class<?> cls, Object obj, Throwable th) throws IOException {
        return f15523a;
    }

    @Deprecated
    /* renamed from: b */
    public Object mo23649b(DeserializationContext deserializationContext, Class<?> cls, JsonParser jsonParser, String str) throws IOException {
        return f15523a;
    }

    /* renamed from: c */
    public Object mo23650c(DeserializationContext deserializationContext, Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str) throws IOException {
        return mo23649b(deserializationContext, cls, jsonParser, str);
    }

    /* renamed from: d */
    public JavaType mo23651d(DeserializationContext deserializationContext, JavaType javaType, r07 r07, String str) throws IOException {
        return null;
    }

    /* renamed from: e */
    public Object mo23652e(DeserializationContext deserializationContext, JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str) throws IOException {
        return mo23653f(deserializationContext, javaType.getRawClass(), jsonToken, jsonParser, str);
    }

    @Deprecated
    /* renamed from: f */
    public Object mo23653f(DeserializationContext deserializationContext, Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str) throws IOException {
        return f15523a;
    }

    /* renamed from: g */
    public boolean mo23654g(DeserializationContext deserializationContext, JsonParser jsonParser, o43<?> o43, Object obj, String str) throws IOException {
        return false;
    }

    /* renamed from: h */
    public JavaType mo23655h(DeserializationContext deserializationContext, JavaType javaType, String str, r07 r07, String str2) throws IOException {
        return null;
    }

    /* renamed from: i */
    public Object mo23656i(DeserializationContext deserializationContext, Class<?> cls, String str, String str2) throws IOException {
        return f15523a;
    }

    /* renamed from: j */
    public Object mo23657j(DeserializationContext deserializationContext, JavaType javaType, Object obj, JsonParser jsonParser) throws IOException {
        return f15523a;
    }

    /* renamed from: k */
    public Object mo23658k(DeserializationContext deserializationContext, Class<?> cls, Number number, String str) throws IOException {
        return f15523a;
    }

    /* renamed from: l */
    public Object mo23659l(DeserializationContext deserializationContext, Class<?> cls, String str, String str2) throws IOException {
        return f15523a;
    }
}
