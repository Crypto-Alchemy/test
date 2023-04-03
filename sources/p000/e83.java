package p000;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.web3j.abi.datatypes.Utf8String;

/* renamed from: e83 */
/* compiled from: JvmNameResolverBase.kt */
public class e83 implements t24 {

    /* renamed from: d */
    public static final C7026a f37484d = new C7026a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final String f37485e;

    /* renamed from: f */
    public static final List<String> f37486f;

    /* renamed from: g */
    public static final Map<String, Integer> f37487g;

    /* renamed from: a */
    public final String[] f37488a;

    /* renamed from: b */
    public final Set<Integer> f37489b;

    /* renamed from: c */
    public final List<JvmProtoBuf.StringTableTypes.Record> f37490c;

    /* renamed from: e83$a */
    /* compiled from: JvmNameResolverBase.kt */
    public static final class C7026a {
        public C7026a() {
        }

        public /* synthetic */ C7026a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e83$b */
    /* compiled from: JvmNameResolverBase.kt */
    public /* synthetic */ class C7027b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37491a;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            f37491a = iArr;
        }
    }

    static {
        String i0 = CollectionsKt___CollectionsKt.m47338i0(ck0.m33065m('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);
        f37485e = i0;
        List<String> m = ck0.m33065m(i0 + "/Any", i0 + "/Nothing", i0 + "/Unit", i0 + "/Throwable", i0 + "/Number", i0 + "/Byte", i0 + "/Double", i0 + "/Float", i0 + "/Int", i0 + "/Long", i0 + "/Short", i0 + "/Boolean", i0 + "/Char", i0 + "/CharSequence", i0 + "/String", i0 + "/Comparable", i0 + "/Enum", i0 + "/Array", i0 + "/ByteArray", i0 + "/DoubleArray", i0 + "/FloatArray", i0 + "/IntArray", i0 + "/LongArray", i0 + "/ShortArray", i0 + "/BooleanArray", i0 + "/CharArray", i0 + "/Cloneable", i0 + "/Annotation", i0 + "/collections/Iterable", i0 + "/collections/MutableIterable", i0 + "/collections/Collection", i0 + "/collections/MutableCollection", i0 + "/collections/List", i0 + "/collections/MutableList", i0 + "/collections/Set", i0 + "/collections/MutableSet", i0 + "/collections/Map", i0 + "/collections/MutableMap", i0 + "/collections/Map.Entry", i0 + "/collections/MutableMap.MutableEntry", i0 + "/collections/Iterator", i0 + "/collections/MutableIterator", i0 + "/collections/ListIterator", i0 + "/collections/MutableListIterator");
        f37486f = m;
        Iterable<wt2<T>> Q0 = CollectionsKt___CollectionsKt.m47319Q0(m);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(Q0, 10)), 16));
        for (wt2 next : Q0) {
            linkedHashMap.put((String) next.mo49266d(), Integer.valueOf(next.mo49265c()));
        }
        f37487g = linkedHashMap;
    }

    public e83(String[] strArr, Set<Integer> set, List<JvmProtoBuf.StringTableTypes.Record> list) {
        vx2.m53591g(strArr, "strings");
        vx2.m53591g(set, "localNameIndices");
        vx2.m53591g(list, "records");
        this.f37488a = strArr;
        this.f37489b = set;
        this.f37490c = list;
    }

    /* renamed from: a */
    public boolean mo51403a(int i) {
        return this.f37489b.contains(Integer.valueOf(i));
    }

    /* renamed from: b */
    public String mo51404b(int i) {
        return getString(i);
    }

    public String getString(int i) {
        String str;
        boolean z;
        int i2 = i;
        JvmProtoBuf.StringTableTypes.Record record = this.f37490c.get(i2);
        if (record.hasString()) {
            str = record.getString();
        } else {
            if (record.hasPredefinedIndex()) {
                List<String> list = f37486f;
                int size = list.size();
                int predefinedIndex = record.getPredefinedIndex();
                if (predefinedIndex < 0 || predefinedIndex >= size) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    str = list.get(record.getPredefinedIndex());
                }
            }
            str = this.f37488a[i2];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            vx2.m53590f(substringIndexList, "substringIndexList");
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            vx2.m53590f(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                vx2.m53590f(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    vx2.m53590f(str, Utf8String.TYPE_NAME);
                    str = str.substring(num.intValue(), num2.intValue());
                    vx2.m53590f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        String str2 = str;
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            vx2.m53590f(replaceCharList, "replaceCharList");
            vx2.m53590f(str2, Utf8String.TYPE_NAME);
            str2 = yb6.m74331H(str2, (char) replaceCharList.get(0).intValue(), (char) replaceCharList.get(1).intValue(), false, 4, (Object) null);
        }
        String str3 = str2;
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i3 = C7027b.f37491a[operation.ordinal()];
        if (i3 == 2) {
            vx2.m53590f(str3, Utf8String.TYPE_NAME);
            str3 = yb6.m74331H(str3, DecodedChar.FNC1, '.', false, 4, (Object) null);
        } else if (i3 == 3) {
            if (str3.length() >= 2) {
                vx2.m53590f(str3, Utf8String.TYPE_NAME);
                str3 = str3.substring(1, str3.length() - 1);
                vx2.m53590f(str3, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String str4 = str3;
            vx2.m53590f(str4, Utf8String.TYPE_NAME);
            str3 = yb6.m74331H(str4, DecodedChar.FNC1, '.', false, 4, (Object) null);
        }
        vx2.m53590f(str3, Utf8String.TYPE_NAME);
        return str3;
    }
}
