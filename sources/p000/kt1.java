package p000;

import java.util.List;
import java.util.stream.Collectors;
import org.web3j.abi.TypeReference;

/* renamed from: kt1 */
/* compiled from: EventEncoder */
public class kt1 {
    private kt1() {
    }

    public static String buildEventSignature(String str) {
        return pc4.toHexString(jl2.sha3(str.getBytes()));
    }

    public static <T extends fz6> String buildMethodSignature(String str, List<TypeReference<T>> list) {
        return str + "(" + ((String) list.stream().map(new jt1()).collect(Collectors.joining(","))) + ")";
    }

    public static String encode(ft1 ft1) {
        return buildEventSignature(buildMethodSignature(ft1.getName(), ft1.getParameters()));
    }
}
