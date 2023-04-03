package p000;

/* renamed from: af5 */
/* compiled from: ResolvedType */
public abstract class af5 {
    public abstract af5 containedType(int i);

    public abstract int containedTypeCount();

    public abstract String containedTypeName(int i);

    public abstract af5 getContentType();

    public abstract af5 getKeyType();

    @Deprecated
    public Class<?> getParameterSource() {
        return null;
    }

    public abstract Class<?> getRawClass();

    public abstract af5 getReferencedType();

    public abstract boolean hasGenericTypes();

    public abstract boolean hasRawClass(Class<?> cls);

    public abstract boolean isAbstract();

    public abstract boolean isArrayType();

    public abstract boolean isCollectionLikeType();

    public abstract boolean isConcrete();

    public abstract boolean isContainerType();

    public abstract boolean isEnumType();

    public abstract boolean isFinal();

    public abstract boolean isInterface();

    public abstract boolean isMapLikeType();

    public abstract boolean isPrimitive();

    public boolean isReferenceType() {
        if (getReferencedType() != null) {
            return true;
        }
        return false;
    }

    public abstract boolean isThrowable();

    public abstract String toCanonical();
}
