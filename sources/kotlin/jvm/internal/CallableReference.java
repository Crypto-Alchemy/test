package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;

public abstract class CallableReference implements o83, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.f30982a;

    /* renamed from: a */
    public transient o83 f30981a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private final String signature;

    public static class NoReceiver implements Serializable {

        /* renamed from: a */
        public static final NoReceiver f30982a = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f30982a;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public o83 compute() {
        o83 o83 = this.f30981a;
        if (o83 != null) {
            return o83;
        }
        o83 computeReflected = computeReflected();
        this.f30981a = computeReflected;
        return computeReflected;
    }

    public abstract o83 computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public y83 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return ua5.m52728c(cls);
        }
        return ua5.m52727b(cls);
    }

    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    public o83 getReflected() {
        o83 compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public m93 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    public List<o93> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public CallableReference(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
