package kotlin.jvm.internal;

public class FunctionReference extends CallableReference implements td2, z83 {
    private final int arity;
    private final int flags;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    public o83 computeReflected() {
        return ua5.m52726a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (!getName().equals(functionReference.getName()) || !getSignature().equals(functionReference.getSignature()) || this.flags != functionReference.flags || this.arity != functionReference.arity || !vx2.m53586b(getBoundReceiver(), functionReference.getBoundReceiver()) || !vx2.m53586b(getOwner(), functionReference.getOwner())) {
                return false;
            }
            return true;
        } else if (obj instanceof z83) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int i;
        if (getOwner() == null) {
            i = 0;
        } else {
            i = getOwner().hashCode() * 31;
        }
        return ((i + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        o83 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    public z83 getReflected() {
        return (z83) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
