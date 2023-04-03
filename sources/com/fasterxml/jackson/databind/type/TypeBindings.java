package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TypeBindings implements Serializable {

    /* renamed from: a */
    public static final String[] f10136a;

    /* renamed from: d */
    public static final JavaType[] f10137d;

    /* renamed from: e */
    public static final TypeBindings f10138e;
    private static final long serialVersionUID = 1;
    private final int _hashCode;
    private final String[] _names;
    private final JavaType[] _types;
    private final String[] _unboundVariables;

    /* renamed from: com.fasterxml.jackson.databind.type.TypeBindings$a */
    public static final class C2053a {

        /* renamed from: a */
        public final Class<?> f10139a;

        /* renamed from: b */
        public final JavaType[] f10140b;

        /* renamed from: c */
        public final int f10141c;

        public C2053a(Class<?> cls, JavaType[] javaTypeArr, int i) {
            this.f10139a = cls;
            this.f10140b = javaTypeArr;
            this.f10141c = i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != C2053a.class) {
                return false;
            }
            C2053a aVar = (C2053a) obj;
            if (this.f10141c == aVar.f10141c && this.f10139a == aVar.f10139a) {
                JavaType[] javaTypeArr = aVar.f10140b;
                int length = this.f10140b.length;
                if (length == javaTypeArr.length) {
                    for (int i = 0; i < length; i++) {
                        if (!this.f10140b[i].equals(javaTypeArr[i])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f10141c;
        }

        public String toString() {
            return this.f10139a.getName() + "<>";
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.type.TypeBindings$b */
    public static class C2054b {

        /* renamed from: a */
        public static final TypeVariable<?>[] f10142a = AbstractList.class.getTypeParameters();

        /* renamed from: b */
        public static final TypeVariable<?>[] f10143b = Collection.class.getTypeParameters();

        /* renamed from: c */
        public static final TypeVariable<?>[] f10144c = Iterable.class.getTypeParameters();

        /* renamed from: d */
        public static final TypeVariable<?>[] f10145d = List.class.getTypeParameters();

        /* renamed from: e */
        public static final TypeVariable<?>[] f10146e = ArrayList.class.getTypeParameters();

        /* renamed from: f */
        public static final TypeVariable<?>[] f10147f = Map.class.getTypeParameters();

        /* renamed from: g */
        public static final TypeVariable<?>[] f10148g = HashMap.class.getTypeParameters();

        /* renamed from: h */
        public static final TypeVariable<?>[] f10149h = LinkedHashMap.class.getTypeParameters();

        /* renamed from: a */
        public static TypeVariable<?>[] m14328a(Class<?> cls) {
            if (cls == Collection.class) {
                return f10143b;
            }
            if (cls == List.class) {
                return f10145d;
            }
            if (cls == ArrayList.class) {
                return f10146e;
            }
            if (cls == AbstractList.class) {
                return f10142a;
            }
            if (cls == Iterable.class) {
                return f10144c;
            }
            return cls.getTypeParameters();
        }

        /* renamed from: b */
        public static TypeVariable<?>[] m14329b(Class<?> cls) {
            if (cls == Map.class) {
                return f10147f;
            }
            if (cls == HashMap.class) {
                return f10148g;
            }
            if (cls == LinkedHashMap.class) {
                return f10149h;
            }
            return cls.getTypeParameters();
        }
    }

    static {
        String[] strArr = new String[0];
        f10136a = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        f10137d = javaTypeArr;
        f10138e = new TypeBindings(strArr, javaTypeArr, (String[]) null);
    }

    public TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? f10136a : strArr;
        this._names = strArr;
        javaTypeArr = javaTypeArr == null ? f10137d : javaTypeArr;
        this._types = javaTypeArr;
        if (strArr.length == javaTypeArr.length) {
            int length = javaTypeArr.length;
            int i = 1;
            for (int i2 = 0; i2 < length; i2++) {
                i += this._types[i2].hashCode();
            }
            this._unboundVariables = strArr2;
            this._hashCode = i;
            return;
        }
        throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + javaTypeArr.length + ")");
    }

    public static TypeBindings create(Class<?> cls, List<JavaType> list) {
        JavaType[] javaTypeArr;
        if (list == null || list.isEmpty()) {
            javaTypeArr = f10137d;
        } else {
            javaTypeArr = (JavaType[]) list.toArray(f10137d);
        }
        return create(cls, javaTypeArr);
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType javaType) {
        int i;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null) {
            i = 0;
        } else {
            i = typeParameters.length;
        }
        if (i == 0) {
            return f10138e;
        }
        if (i == 1) {
            return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, (String[]) null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + i);
    }

    public static TypeBindings emptyBindings() {
        return f10138e;
    }

    public Object asKey(Class<?> cls) {
        return new C2053a(cls, this._types, this._hashCode);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!wf0.m29481H(obj, getClass())) {
            return false;
        }
        TypeBindings typeBindings = (TypeBindings) obj;
        int length = this._types.length;
        if (length != typeBindings.size()) {
            return false;
        }
        JavaType[] javaTypeArr = typeBindings._types;
        for (int i = 0; i < length; i++) {
            if (!javaTypeArr[i].equals(this._types[i])) {
                return false;
            }
        }
        return true;
    }

    public JavaType findBoundType(String str) {
        JavaType selfReferencedType;
        int length = this._names.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(this._names[i])) {
                JavaType javaType = this._types[i];
                if (!(javaType instanceof ResolvedRecursiveType) || (selfReferencedType = ((ResolvedRecursiveType) javaType).getSelfReferencedType()) == null) {
                    return javaType;
                }
                return selfReferencedType;
            }
        }
        return null;
    }

    public String getBoundName(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this._names;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    public JavaType getBoundType(int i) {
        if (i < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this._types;
        if (i >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i];
    }

    public List<JavaType> getTypeParameters() {
        JavaType[] javaTypeArr = this._types;
        if (javaTypeArr.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(javaTypeArr);
    }

    public boolean hasUnbound(String str) {
        String[] strArr = this._unboundVariables;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this._unboundVariables[length]));
        return true;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public boolean isEmpty() {
        if (this._types.length == 0) {
            return true;
        }
        return false;
    }

    public Object readResolve() {
        String[] strArr = this._names;
        if (strArr == null || strArr.length == 0) {
            return f10138e;
        }
        return this;
    }

    public int size() {
        return this._types.length;
    }

    public String toString() {
        if (this._types.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int length = this._types.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(this._types[i].getGenericSignature());
        }
        sb.append('>');
        return sb.toString();
    }

    public JavaType[] typeParameterArray() {
        return this._types;
    }

    public TypeBindings withUnboundVariable(String str) {
        int i;
        String[] strArr;
        String[] strArr2 = this._unboundVariables;
        if (strArr2 == null) {
            i = 0;
        } else {
            i = strArr2.length;
        }
        if (i == 0) {
            strArr = new String[1];
        } else {
            strArr = (String[]) Arrays.copyOf(strArr2, i + 1);
        }
        strArr[i] = str;
        return new TypeBindings(this._names, this._types, strArr);
    }

    public static TypeBindings create(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = f10137d;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return create(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return create(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = f10136a;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        }
        if (strArr.length == javaTypeArr.length) {
            return new TypeBindings(strArr, javaTypeArr, (String[]) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot create TypeBindings for class ");
        sb.append(cls.getName());
        sb.append(" with ");
        sb.append(javaTypeArr.length);
        sb.append(" type parameter");
        sb.append(javaTypeArr.length == 1 ? "" : "s");
        sb.append(": class expects ");
        sb.append(strArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return f10138e;
        }
        if (javaTypeArr == null) {
            javaTypeArr = f10137d;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = typeParameters[i].getName();
        }
        if (length == javaTypeArr.length) {
            return new TypeBindings(strArr, javaTypeArr, (String[]) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot create TypeBindings for class ");
        sb.append(cls.getName());
        sb.append(" with ");
        sb.append(javaTypeArr.length);
        sb.append(" type parameter");
        sb.append(javaTypeArr.length == 1 ? "" : "s");
        sb.append(": class expects ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType) {
        int i;
        TypeVariable[] a = C2054b.m14328a(cls);
        if (a == null) {
            i = 0;
        } else {
            i = a.length;
        }
        if (i == 1) {
            return new TypeBindings(new String[]{a[0].getName()}, new JavaType[]{javaType}, (String[]) null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + i);
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType, JavaType javaType2) {
        int i;
        TypeVariable[] b = C2054b.m14329b(cls);
        if (b == null) {
            i = 0;
        } else {
            i = b.length;
        }
        if (i == 2) {
            return new TypeBindings(new String[]{b[0].getName(), b[1].getName()}, new JavaType[]{javaType, javaType2}, (String[]) null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + i);
    }

    public static TypeBindings create(List<String> list, List<JavaType> list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return f10138e;
        }
        return new TypeBindings((String[]) list.toArray(f10136a), (JavaType[]) list2.toArray(f10137d), (String[]) null);
    }
}
