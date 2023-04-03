package com.google.crypto.tink.shaded.protobuf;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d0 */
/* compiled from: MessageLiteToString */
public final class C4710d0 {
    /* renamed from: a */
    public static final String m37580a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m37581b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (Float.floatToRawIntBits(((Float) obj).floatValue()) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof ByteString) {
                return obj.equals(ByteString.EMPTY);
            }
            if (obj instanceof C4705c0) {
                if (obj == ((C4705c0) obj).getDefaultInstanceForType()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Enum)) {
                return false;
            } else {
                if (((Enum) obj).ordinal() == 0) {
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: c */
    public static final void m37582c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object c : (List) obj) {
                m37582c(sb, i, str, c);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c2 : ((Map) obj).entrySet()) {
                m37582c(sb, i, str, c2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(pn6.m50023c((String) obj));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof ByteString) {
                sb.append(": \"");
                sb.append(pn6.m50022b((ByteString) obj));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof GeneratedMessageLite) {
                sb.append(" {");
                m37583d((GeneratedMessageLite) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m37582c(sb, i4, "key", entry.getKey());
                m37582c(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: d */
    public static void m37583d(C4705c0 c0Var, StringBuilder sb, int i) {
        String str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : c0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str2 : treeSet) {
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            boolean z = true;
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String str3 = str.substring(0, 1).toLowerCase() + str.substring(1, str.length() - 4);
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m37582c(sb, i, m37580a(str3), GeneratedMessageLite.m37321p(method2, c0Var, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String str4 = str.substring(0, 1).toLowerCase() + str.substring(1, str.length() - 3);
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m37582c(sb, i, m37580a(str4), GeneratedMessageLite.m37321p(method3, c0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + str)) != null) {
                if (str.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + str.substring(0, str.length() - 5))) {
                    }
                }
                String str5 = str.substring(0, 1).toLowerCase() + str.substring(1);
                Method method4 = (Method) hashMap.get("get" + str);
                Method method5 = (Method) hashMap.get("has" + str);
                if (method4 != null) {
                    Object p = GeneratedMessageLite.m37321p(method4, c0Var, new Object[0]);
                    if (method5 != null) {
                        z = ((Boolean) GeneratedMessageLite.m37321p(method5, c0Var, new Object[0])).booleanValue();
                    } else if (m37581b(p)) {
                        z = false;
                    }
                    if (z) {
                        m37582c(sb, i, m37580a(str5), p);
                    }
                }
            }
        }
        if (c0Var instanceof GeneratedMessageLite.C4682c) {
            Iterator<Map.Entry<GeneratedMessageLite.C4683d, Object>> r = ((GeneratedMessageLite.C4682c) c0Var).extensions.mo35995r();
            while (r.hasNext()) {
                Map.Entry next = r.next();
                m37582c(sb, i, "[" + ((GeneratedMessageLite.C4683d) next.getKey()).getNumber() + "]", next.getValue());
            }
        }
        C4750n0 n0Var = ((GeneratedMessageLite) c0Var).unknownFields;
        if (n0Var != null) {
            n0Var.mo35978l(sb, i);
        }
    }

    /* renamed from: e */
    public static String m37584e(C4705c0 c0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m37583d(c0Var, sb, 0);
        return sb.toString();
    }
}
