package p000;

import com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicIntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicLongDeserializer;
import com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: w23 */
/* compiled from: JdkDeserializers */
public class w23 {

    /* renamed from: a */
    public static final HashSet<String> f18975a = new HashSet<>();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, AtomicInteger.class, AtomicLong.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for (int i = 0; i < 7; i++) {
            f18975a.add(clsArr[i].getName());
        }
        for (Class name : FromStringDeserializer.types()) {
            f18975a.add(name.getName());
        }
    }

    /* renamed from: a */
    public static o43<?> m29236a(Class<?> cls, String str) {
        if (!f18975a.contains(str)) {
            return null;
        }
        FromStringDeserializer<?> findDeserializer = FromStringDeserializer.findDeserializer(cls);
        if (findDeserializer != null) {
            return findDeserializer;
        }
        if (cls == UUID.class) {
            return new UUIDDeserializer();
        }
        if (cls == StackTraceElement.class) {
            return new StackTraceElementDeserializer();
        }
        if (cls == AtomicBoolean.class) {
            return new AtomicBooleanDeserializer();
        }
        if (cls == AtomicInteger.class) {
            return new AtomicIntegerDeserializer();
        }
        if (cls == AtomicLong.class) {
            return new AtomicLongDeserializer();
        }
        if (cls == ByteBuffer.class) {
            return new ByteBufferDeserializer();
        }
        if (cls == Void.class) {
            return NullifyingDeserializer.instance;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m29237b(Class<?> cls) {
        return f18975a.contains(cls.getName());
    }
}
