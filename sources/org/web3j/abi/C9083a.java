package org.web3j.abi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Array;
import org.web3j.abi.datatypes.Bytes;
import org.web3j.abi.datatypes.BytesType;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.StaticArray;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;

/* renamed from: org.web3j.abi.a */
/* compiled from: DefaultFunctionReturnDecoder */
public class C9083a extends FunctionReturnDecoder {
    private static List<fz6> build(String str, List<TypeReference<fz6>> list) {
        fz6 fz6;
        Class<StaticArray> cls = StaticArray.class;
        Class<StaticStruct> cls2 = StaticStruct.class;
        Class<DynamicStruct> cls3 = DynamicStruct.class;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (TypeReference next : list) {
            try {
                int dataOffset = getDataOffset(str, i, next);
                Class classType = next.getClassType();
                if (cls3.isAssignableFrom(classType)) {
                    fz6 = C9084b.decodeDynamicStruct(str, dataOffset, next);
                } else if (DynamicArray.class.isAssignableFrom(classType)) {
                    fz6 = C9084b.decodeDynamicArray(str, dataOffset, next);
                } else {
                    if (next instanceof TypeReference.StaticArrayTypeReference) {
                        int size = ((TypeReference.StaticArrayTypeReference) next).getSize();
                        fz6 = C9084b.decodeStaticArray(str, dataOffset, next, size);
                        i += size * 64;
                    } else if (cls2.isAssignableFrom(classType)) {
                        fz6 = C9084b.decodeStaticStruct(str, dataOffset, next);
                        i += Utils.staticStructNestedPublicFieldsFlatList(classType).size() * 64;
                    } else if (cls.isAssignableFrom(classType)) {
                        int parseInt = Integer.parseInt(classType.getSimpleName().substring(cls.getSimpleName().length()));
                        fz6 decodeStaticArray = C9084b.decodeStaticArray(str, dataOffset, next, parseInt);
                        if (!cls3.isAssignableFrom(Utils.getParameterizedTypeFromArray(next))) {
                            if (cls2.isAssignableFrom(Utils.getParameterizedTypeFromArray(next))) {
                                i += Utils.staticStructNestedPublicFieldsFlatList(Utils.getParameterizedTypeFromArray(next)).size() * parseInt * 64;
                            } else if (!Utf8String.class.isAssignableFrom(Utils.getParameterizedTypeFromArray(next))) {
                                i += parseInt * 64;
                            }
                            fz6 = decodeStaticArray;
                        }
                        i += 64;
                        fz6 = decodeStaticArray;
                    } else {
                        fz6 = C9084b.decode(str, dataOffset, classType);
                    }
                    arrayList.add(fz6);
                }
                i += 64;
                arrayList.add(fz6);
            } catch (ClassNotFoundException e) {
                throw new UnsupportedOperationException("Invalid class reference provided", e);
            }
        }
        return arrayList;
    }

    public static <T extends fz6> int getDataOffset(String str, int i, TypeReference<?> typeReference) throws ClassNotFoundException {
        Class<?> classType = typeReference.getClassType();
        if (DynamicBytes.class.isAssignableFrom(classType) || Utf8String.class.isAssignableFrom(classType) || DynamicArray.class.isAssignableFrom(classType) || hasDynamicOffsetInStaticArray(typeReference, i)) {
            return C9084b.decodeUintAsInt(str, i) << 1;
        }
        return i;
    }

    private static boolean hasDynamicOffsetInStaticArray(TypeReference<?> typeReference, int i) throws ClassNotFoundException {
        try {
            if (!StaticArray.class.isAssignableFrom(typeReference.getClassType())) {
                return false;
            }
            if (DynamicStruct.class.isAssignableFrom(Utils.getParameterizedTypeFromArray(typeReference)) || C9084b.isDynamic(Utils.getParameterizedTypeFromArray(typeReference))) {
                return true;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public <T extends fz6> fz6 decodeEventParameter(String str, TypeReference<T> typeReference) {
        String cleanHexPrefix = pc4.cleanHexPrefix(str);
        try {
            Class<T> classType = typeReference.getClassType();
            if (Bytes.class.isAssignableFrom(classType)) {
                return C9084b.decodeBytes(cleanHexPrefix, Class.forName(classType.getName()));
            }
            if (!Array.class.isAssignableFrom(classType) && !BytesType.class.isAssignableFrom(classType)) {
                if (!Utf8String.class.isAssignableFrom(classType)) {
                    return C9084b.decode(cleanHexPrefix, classType);
                }
            }
            return C9084b.decodeBytes(cleanHexPrefix, Bytes32.class);
        } catch (ClassNotFoundException e) {
            throw new UnsupportedOperationException("Invalid class reference provided", e);
        }
    }

    public List<fz6> decodeFunctionResult(String str, List<TypeReference<fz6>> list) {
        String cleanHexPrefix = pc4.cleanHexPrefix(str);
        if (pb6.isEmpty(cleanHexPrefix)) {
            return Collections.emptyList();
        }
        return build(cleanHexPrefix, list);
    }
}
