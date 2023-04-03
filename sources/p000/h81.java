package p000;

import java.math.BigInteger;
import java.util.List;
import org.web3j.abi.Utils;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.StaticArray;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Uint;

/* renamed from: h81 */
/* compiled from: DefaultFunctionEncoder */
public class h81 extends xd2 {
    private static int getLength(List<fz6> list) {
        int size;
        int i = 0;
        for (fz6 next : list) {
            boolean z = next instanceof StaticArray;
            if (z) {
                StaticArray staticArray = (StaticArray) next;
                if (StaticStruct.class.isAssignableFrom(staticArray.getComponentType())) {
                    size = Utils.staticStructNestedPublicFieldsFlatList(staticArray.getComponentType()).size() * staticArray.getValue().size();
                    i += size;
                }
            }
            if ((!z || !DynamicStruct.class.isAssignableFrom(((StaticArray) next).getComponentType())) && z) {
                size = ((StaticArray) next).getValue().size();
                i += size;
            } else {
                i++;
            }
        }
        return i;
    }

    public String encodeFunction(gd2 gd2) {
        List<fz6> inputParameters = gd2.getInputParameters();
        return encodeParameters(inputParameters, new StringBuilder(xd2.buildMethodId(xd2.buildMethodSignature(gd2.getName(), inputParameters))));
    }

    public String encodePackedParameters(List<fz6> list) {
        StringBuilder sb = new StringBuilder();
        for (fz6 encodePacked : list) {
            sb.append(n07.encodePacked(encodePacked));
        }
        return sb.toString();
    }

    public String encodeParameters(List<fz6> list) {
        return encodeParameters(list, new StringBuilder());
    }

    public String encodeWithSelector(String str, List<fz6> list) {
        return encodeParameters(list, new StringBuilder(str));
    }

    private static String encodeParameters(List<fz6> list, StringBuilder sb) {
        int length = getLength(list) * 32;
        StringBuilder sb2 = new StringBuilder();
        for (fz6 next : list) {
            String encode = n07.encode(next);
            if (n07.isDynamic(next)) {
                sb.append(n07.encodeNumeric(new Uint(BigInteger.valueOf((long) length))));
                sb2.append(encode);
                length += encode.length() >> 1;
            } else {
                sb.append(encode);
            }
        }
        sb.append(sb2);
        return sb.toString();
    }
}
