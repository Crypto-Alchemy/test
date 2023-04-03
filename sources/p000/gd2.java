package p000;

import java.util.List;
import org.web3j.abi.TypeReference;
import org.web3j.abi.Utils;

/* renamed from: gd2 */
/* compiled from: Function */
public class gd2 {
    private List<fz6> inputParameters;
    private String name;
    private List<TypeReference<fz6>> outputParameters;

    public gd2(String str, List<fz6> list, List<TypeReference<?>> list2) {
        this.name = str;
        this.inputParameters = list;
        this.outputParameters = Utils.convert(list2);
    }

    public List<fz6> getInputParameters() {
        return this.inputParameters;
    }

    public String getName() {
        return this.name;
    }

    public List<TypeReference<fz6>> getOutputParameters() {
        return this.outputParameters;
    }
}
