package p000;

import com.fasterxml.jackson.core.JsonFactory;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.internal.measurement.zzjd;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: v79 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class v79 {
    /* renamed from: a */
    public static String m53295a(r79 r79, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m53297c(r79, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m53296b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m53296b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m53296b(sb, i, str, b2);
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
                sb.append(y99.m54660a(zzjd.zzk((String) obj)));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof zzjd) {
                sb.append(": \"");
                sb.append(y99.m54660a((zzjd) obj));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof s49) {
                sb.append(" {");
                m53297c((s49) obj, sb, i + 2);
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
                m53296b(sb, i4, "key", entry.getKey());
                m53296b(sb, i4, "value", entry.getValue());
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

    /* renamed from: c */
    public static void m53297c(r79 r79, StringBuilder sb, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : r79.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str9 : treeSet) {
            if (str9.startsWith("get")) {
                str = str9.substring(3);
            } else {
                str = str9;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                if (valueOf2.length() != 0) {
                    str8 = valueOf.concat(valueOf2);
                } else {
                    str8 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str9);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m53296b(sb, i, m53298d(str8), s49.m51524k(method2, r79, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                if (valueOf4.length() != 0) {
                    str7 = valueOf3.concat(valueOf4);
                } else {
                    str7 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str9);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m53296b(sb, i, m53298d(str7), s49.m51524k(method3, r79, new Object[0]));
                }
            }
            if (str.length() != 0) {
                str2 = "set".concat(str);
            } else {
                str2 = new String("set");
            }
            if (((Method) hashMap2.get(str2)) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(str.substring(0, str.length() - 5));
                    if (valueOf5.length() != 0) {
                        str6 = "get".concat(valueOf5);
                    } else {
                        str6 = new String("get");
                    }
                    if (hashMap.containsKey(str6)) {
                    }
                }
                String valueOf6 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(str.substring(1));
                if (valueOf7.length() != 0) {
                    str3 = valueOf6.concat(valueOf7);
                } else {
                    str3 = new String(valueOf6);
                }
                if (str.length() != 0) {
                    str4 = "get".concat(str);
                } else {
                    str4 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str4);
                if (str.length() != 0) {
                    str5 = "has".concat(str);
                } else {
                    str5 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str5);
                if (method4 != null) {
                    Object k = s49.m51524k(method4, r79, new Object[0]);
                    if (method5 == null) {
                        if (k instanceof Boolean) {
                            if (!((Boolean) k).booleanValue()) {
                            }
                        } else if (k instanceof Integer) {
                            if (((Integer) k).intValue() == 0) {
                            }
                        } else if (k instanceof Float) {
                            if (((Float) k).floatValue() == Utils.FLOAT_EPSILON) {
                            }
                        } else if (!(k instanceof Double)) {
                            if (k instanceof String) {
                                z = k.equals("");
                            } else if (k instanceof zzjd) {
                                z = k.equals(zzjd.zzb);
                            } else if (k instanceof r79) {
                                if (k == ((r79) k).mo47631f()) {
                                }
                            } else if ((k instanceof Enum) && ((Enum) k).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (((Double) k).doubleValue() == Utils.DOUBLE_EPSILON) {
                        }
                    } else if (!((Boolean) s49.m51524k(method5, r79, new Object[0])).booleanValue()) {
                    }
                    m53296b(sb, i, m53298d(str3), k);
                }
            }
        }
        if (!(r79 instanceof k49)) {
            ca9 ca9 = ((s49) r79).zzc;
            if (ca9 != null) {
                ca9.mo29904g(sb, i);
                return;
            }
            return;
        }
        k49 k49 = (k49) r79;
        throw null;
    }

    /* renamed from: d */
    public static final String m53298d(String str) {
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
}
