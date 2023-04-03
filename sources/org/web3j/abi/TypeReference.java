package org.web3j.abi;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public abstract class TypeReference<T extends fz6> implements Comparable<TypeReference<T>> {
    public static Pattern ARRAY_SUFFIX = Pattern.compile("\\[(\\d*)]");
    private final boolean indexed;
    private final Type type;

    public static abstract class StaticArrayTypeReference<T extends fz6> extends TypeReference<T> {
        private final int size;

        public StaticArrayTypeReference(int i) {
            this.size = i;
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return TypeReference.super.compareTo((TypeReference) obj);
        }

        public int getSize() {
            return this.size;
        }
    }

    public TypeReference() {
        this(false);
    }

    public static <T extends fz6> TypeReference<T> create(Class<T> cls) {
        return create(cls, false);
    }

    public static Class<? extends fz6> getAtomicTypeClass(String str, boolean z) throws ClassNotFoundException {
        if (!ARRAY_SUFFIX.matcher(str).find()) {
            return C7927n5.getType(str, z);
        }
        throw new ClassNotFoundException("getAtomicTypeClass does not work with array types. See makeTypeReference()");
    }

    public static TypeReference makeTypeReference(String str) throws ClassNotFoundException {
        return makeTypeReference(str, false, false);
    }

    public int compareTo(TypeReference<T> typeReference) {
        return 0;
    }

    public Class<T> getClassType() throws ClassNotFoundException {
        Type type2 = getType();
        if (getType() instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type2).getRawType();
        }
        return Class.forName(Utils.getTypeName(type2));
    }

    public TypeReference getSubTypeReference() {
        return null;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isIndexed() {
        return this.indexed;
    }

    public TypeReference(boolean z) {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this.type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            this.indexed = z;
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public static <T extends fz6> TypeReference<T> create(final Class<T> cls, boolean z) {
        return new TypeReference<T>(z) {
            public /* bridge */ /* synthetic */ int compareTo(Object obj) {
                return TypeReference.super.compareTo((TypeReference) obj);
            }

            public Type getType() {
                return cls;
            }
        };
    }

    public static TypeReference makeTypeReference(String str, final boolean z, boolean z2) throws ClassNotFoundException {
        final Class cls;
        Matcher matcher = ARRAY_SUFFIX.matcher(str);
        if (!matcher.find()) {
            return create(getAtomicTypeClass(str, z2), z);
        }
        int start = matcher.start();
        final TypeReference<? extends fz6> create = create(getAtomicTypeClass(str.substring(0, start), z2), z);
        int length = str.length();
        while (start < length) {
            String group = matcher.group(1);
            if (group == null || group.equals("")) {
                create = new TypeReference<DynamicArray>(z) {

                    /* renamed from: org.web3j.abi.TypeReference$2$a */
                    public class C9079a implements ParameterizedType {
                        public C9079a() {
                        }

                        public Type[] getActualTypeArguments() {
                            return new Type[]{create.getType()};
                        }

                        public Type getOwnerType() {
                            return Class.class;
                        }

                        public Type getRawType() {
                            return DynamicArray.class;
                        }
                    }

                    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
                        return TypeReference.super.compareTo((TypeReference) obj);
                    }

                    public TypeReference getSubTypeReference() {
                        return create;
                    }

                    public Type getType() {
                        return new C9079a();
                    }
                };
            } else {
                int parseInt = Integer.parseInt(group);
                if (parseInt <= 32) {
                    cls = Class.forName("org.web3j.abi.datatypes.generated.StaticArray" + group);
                } else {
                    cls = StaticArray.class;
                }
                create = new StaticArrayTypeReference<StaticArray>(parseInt) {

                    /* renamed from: org.web3j.abi.TypeReference$3$a */
                    public class C9081a implements ParameterizedType {
                        public C9081a() {
                        }

                        public Type[] getActualTypeArguments() {
                            return new Type[]{create.getType()};
                        }

                        public Type getOwnerType() {
                            return Class.class;
                        }

                        public Type getRawType() {
                            return cls;
                        }
                    }

                    public TypeReference getSubTypeReference() {
                        return create;
                    }

                    public Type getType() {
                        return new C9081a();
                    }

                    public boolean isIndexed() {
                        return z;
                    }
                };
            }
            start = matcher.end();
            matcher = ARRAY_SUFFIX.matcher(str);
            if (!matcher.find(start) && start != length) {
                throw new ClassNotFoundException("Unable to make TypeReference from " + str);
            }
        }
        return create;
    }
}
