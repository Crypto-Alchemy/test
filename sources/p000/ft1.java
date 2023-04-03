package p000;

import java.util.List;
import java.util.stream.Collectors;
import org.web3j.abi.TypeReference;
import org.web3j.abi.Utils;

/* renamed from: ft1 */
/* compiled from: Event */
public class ft1 {
    private String name;
    private List<TypeReference<fz6>> parameters;

    public ft1(String str, List<TypeReference<?>> list) {
        this.name = str;
        this.parameters = Utils.convert(list);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getNonIndexedParameters$0(TypeReference typeReference) {
        return !typeReference.isIndexed();
    }

    public List<TypeReference<fz6>> getIndexedParameters() {
        return (List) this.parameters.stream().filter(new ct1()).collect(Collectors.toList());
    }

    public String getName() {
        return this.name;
    }

    public List<TypeReference<fz6>> getNonIndexedParameters() {
        return (List) this.parameters.stream().filter(new bt1()).collect(Collectors.toList());
    }

    public List<TypeReference<fz6>> getParameters() {
        return this.parameters;
    }
}
