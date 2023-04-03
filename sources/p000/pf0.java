package p000;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* renamed from: pf0 */
/* compiled from: ClassMapperLite.kt */
public final class pf0 {

    /* renamed from: a */
    public static final pf0 f44039a = new pf0();

    /* renamed from: b */
    public static final String f44040b = CollectionsKt___CollectionsKt.m47338i0(ck0.m33065m('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);

    /* renamed from: c */
    public static final Map<String, String> f44041c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List m = ck0.m33065m("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int b = pw4.m50172b(0, m.size() - 1, 2);
        if (b >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f44040b;
                sb.append(str);
                sb.append('/');
                sb.append((String) m.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), m.get(i2));
                linkedHashMap.put(str + '/' + ((String) m.get(i)) + "Array", '[' + ((String) m.get(i2)));
                if (i == b) {
                    break;
                }
                i += 2;
            }
        }
        linkedHashMap.put(f44040b + "/Unit", "V");
        m71004a(linkedHashMap, "Any", "java/lang/Object");
        m71004a(linkedHashMap, "Nothing", "java/lang/Void");
        m71004a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : ck0.m33065m("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m71004a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : ck0.m33065m("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m71004a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            m71004a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m71004a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m71004a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m71004a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m71004a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            StringBuilder sb2 = new StringBuilder();
            String str4 = f44040b;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i3);
            m71004a(linkedHashMap, "Function" + i3, sb2.toString());
            m71004a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : ck0.m33065m("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m71004a(linkedHashMap, str5 + ".Companion", f44040b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f44041c = linkedHashMap;
    }

    /* renamed from: a */
    public static final void m71004a(Map<String, String> map, String str, String str2) {
        map.put(f44040b + '/' + str, 'L' + str2 + ';');
    }

    /* renamed from: b */
    public static final String m71005b(String str) {
        vx2.m53591g(str, "classId");
        String str2 = f44041c.get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + yb6.m74331H(str, '.', DecodedChar.FNC1, false, 4, (Object) null) + ';';
    }
}
