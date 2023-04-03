package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;
import org.web3j.abi.C9084b;
import org.web3j.abi.TypeReference;

/* renamed from: xd2 */
/* compiled from: FunctionEncoder */
public abstract class xd2 {
    private static xd2 DEFAULT_ENCODER;
    private static final ServiceLoader<yd2> loader = ServiceLoader.load(yd2.class);

    public static String buildMethodId(String str) {
        return pc4.toHexString(jl2.sha3(str.getBytes())).substring(0, 10);
    }

    public static String buildMethodSignature(String str, List<fz6> list) {
        return str + "(" + ((String) list.stream().map(new wd2()).collect(Collectors.joining(","))) + ")";
    }

    private static xd2 defaultEncoder() {
        if (DEFAULT_ENCODER == null) {
            DEFAULT_ENCODER = new h81();
        }
        return DEFAULT_ENCODER;
    }

    public static String encode(gd2 gd2) {
        return encoder().encodeFunction(gd2);
    }

    public static String encodeConstructor(List<fz6> list) {
        return encoder().encodeParameters(list);
    }

    public static String encodeConstructorPacked(List<fz6> list) {
        return encoder().encodePackedParameters(list);
    }

    private static xd2 encoder() {
        Iterator<yd2> it = loader.iterator();
        if (it.hasNext()) {
            return (xd2) it.next().get();
        }
        return defaultEncoder();
    }

    public static gd2 makeFunction(String str, List<String> list, List<Object> list2, List<String> list3) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list2.iterator();
        for (String instantiateType : list) {
            arrayList.add(C9084b.instantiateType(instantiateType, it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String makeTypeReference : list3) {
            arrayList2.add(TypeReference.makeTypeReference(makeTypeReference));
        }
        return new gd2(str, arrayList, arrayList2);
    }

    public abstract String encodeFunction(gd2 gd2);

    public abstract String encodePackedParameters(List<fz6> list);

    public abstract String encodeParameters(List<fz6> list);

    public abstract String encodeWithSelector(String str, List<fz6> list);

    public static String encode(String str, List<fz6> list) {
        return encoder().encodeWithSelector(str, list);
    }
}
