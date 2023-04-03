package org.web3j.abi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicBytes;

public abstract class FunctionReturnDecoder {
    private static final FunctionReturnDecoder decoder;

    static {
        FunctionReturnDecoder functionReturnDecoder;
        Iterator<S> it = ServiceLoader.load(be2.class).iterator();
        if (it.hasNext()) {
            functionReturnDecoder = (FunctionReturnDecoder) ((be2) it.next()).get();
        } else {
            functionReturnDecoder = new C9083a();
        }
        decoder = functionReturnDecoder;
    }

    public static List<fz6> decode(String str, List<TypeReference<fz6>> list) {
        return decoder.decodeFunctionResult(str, list);
    }

    public static String decodeAddress(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TypeReference<Address>() {
        });
        List<fz6> decodeFunctionResult = decoder.decodeFunctionResult(str, arrayList);
        if (decodeFunctionResult.isEmpty()) {
            return null;
        }
        return ((Address) decodeFunctionResult.get(0)).getValue();
    }

    public static byte[] decodeDynamicBytes(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TypeReference<DynamicBytes>() {
        });
        List<fz6> decodeFunctionResult = decoder.decodeFunctionResult(str, arrayList);
        if (decodeFunctionResult.isEmpty()) {
            return null;
        }
        return ((DynamicBytes) decodeFunctionResult.get(0)).getValue();
    }

    public static <T extends fz6> fz6 decodeIndexedValue(String str, TypeReference<T> typeReference) {
        return decoder.decodeEventParameter(str, typeReference);
    }

    public abstract <T extends fz6> fz6 decodeEventParameter(String str, TypeReference<T> typeReference);

    public abstract List<fz6> decodeFunctionResult(String str, List<TypeReference<fz6>> list);
}
