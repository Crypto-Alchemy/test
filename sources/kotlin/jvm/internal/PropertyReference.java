package kotlin.jvm.internal;

import p000.i93;

public abstract class PropertyReference extends CallableReference implements i93 {
    public PropertyReference() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (!getOwner().equals(propertyReference.getOwner()) || !getName().equals(propertyReference.getName()) || !getSignature().equals(propertyReference.getSignature()) || !vx2.m53586b(getBoundReceiver(), propertyReference.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof i93) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public abstract /* synthetic */ i93.C5953b getGetter();

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        o83 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public PropertyReference(Object obj) {
        super(obj);
    }

    public i93 getReflected() {
        return (i93) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) != 1 ? false : true);
    }
}
