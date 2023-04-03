package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import org.web3j.abi.datatypes.Int;

public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.CHAR, "char", "C", "java.lang.Character"),
    BYTE(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.SHORT, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.INT, Int.TYPE_NAME, "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.FLOAT, "float", "F", "java.lang.Float"),
    LONG(PrimitiveType.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");
    

    /* renamed from: a */
    public static final Set<u82> f40103a = null;

    /* renamed from: d */
    public static final Map<String, JvmPrimitiveType> f40104d = null;

    /* renamed from: e */
    public static final Map<PrimitiveType, JvmPrimitiveType> f40105e = null;

    /* renamed from: g */
    public static final Map<String, JvmPrimitiveType> f40106g = null;
    private final String desc;
    private final String name;
    private final PrimitiveType primitiveType;
    private final u82 wrapperFqName;

    /* access modifiers changed from: public */
    static {
        int i;
        f40103a = new HashSet();
        f40104d = new HashMap();
        f40105e = new EnumMap(PrimitiveType.class);
        f40106g = new HashMap();
        for (JvmPrimitiveType jvmPrimitiveType : values()) {
            f40103a.add(jvmPrimitiveType.getWrapperFqName());
            f40104d.put(jvmPrimitiveType.getJavaKeywordName(), jvmPrimitiveType);
            f40105e.put(jvmPrimitiveType.getPrimitiveType(), jvmPrimitiveType);
            f40106g.put(jvmPrimitiveType.getDesc(), jvmPrimitiveType);
        }
    }

    /* access modifiers changed from: public */
    JvmPrimitiveType(PrimitiveType primitiveType2, String str, String str2, String str3) {
        if (primitiveType2 == null) {
            m62468a(6);
        }
        if (str == null) {
            m62468a(7);
        }
        if (str2 == null) {
            m62468a(8);
        }
        if (str3 == null) {
            m62468a(9);
        }
        this.primitiveType = primitiveType2;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new u82(str3);
    }

    public static JvmPrimitiveType get(String str) {
        if (str == null) {
            m62468a(1);
        }
        JvmPrimitiveType jvmPrimitiveType = f40104d.get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public String getDesc() {
        String str = this.desc;
        if (str == null) {
            m62468a(12);
        }
        return str;
    }

    public String getJavaKeywordName() {
        String str = this.name;
        if (str == null) {
            m62468a(11);
        }
        return str;
    }

    public PrimitiveType getPrimitiveType() {
        PrimitiveType primitiveType2 = this.primitiveType;
        if (primitiveType2 == null) {
            m62468a(10);
        }
        return primitiveType2;
    }

    public u82 getWrapperFqName() {
        u82 u82 = this.wrapperFqName;
        if (u82 == null) {
            m62468a(13);
        }
        return u82;
    }

    public static JvmPrimitiveType get(PrimitiveType primitiveType2) {
        if (primitiveType2 == null) {
            m62468a(3);
        }
        JvmPrimitiveType jvmPrimitiveType = f40105e.get(primitiveType2);
        if (jvmPrimitiveType == null) {
            m62468a(4);
        }
        return jvmPrimitiveType;
    }
}
