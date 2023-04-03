package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: SignatureBuildingComponents.kt */
public final class SignatureBuildingComponents {

    /* renamed from: a */
    public static final SignatureBuildingComponents f39611a = new SignatureBuildingComponents();

    /* renamed from: b */
    public final String[] mo53809b(String... strArr) {
        vx2.m53591g(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: c */
    public final String mo53810c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* renamed from: d */
    public final Set<String> mo53811d(String str, String... strArr) {
        vx2.m53591g(str, "internalName");
        vx2.m53591g(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public final Set<String> mo53812e(String str, String... strArr) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(strArr, "signatures");
        return mo53811d(mo53815h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: f */
    public final Set<String> mo53813f(String str, String... strArr) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(strArr, "signatures");
        return mo53811d(mo53816i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: g */
    public final String mo53814g(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        return "java/util/function/" + str;
    }

    /* renamed from: h */
    public final String mo53815h(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        return "java/lang/" + str;
    }

    /* renamed from: i */
    public final String mo53816i(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        return "java/util/" + str;
    }

    /* renamed from: j */
    public final String mo53817j(String str, List<String> list, String str2) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(list, "parameters");
        vx2.m53591g(str2, "ret");
        return str + '(' + CollectionsKt___CollectionsKt.m47338i0(list, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, SignatureBuildingComponents$jvmDescriptor$1.INSTANCE, 30, (Object) null) + ')' + mo53810c(str2);
    }

    /* renamed from: k */
    public final String mo53818k(String str, String str2) {
        vx2.m53591g(str, "internalName");
        vx2.m53591g(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
