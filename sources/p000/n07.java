package p000;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Array;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Bytes;
import org.web3j.abi.datatypes.BytesType;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Fixed;
import org.web3j.abi.datatypes.FixedPointType;
import org.web3j.abi.datatypes.NumericType;
import org.web3j.abi.datatypes.StaticArray;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Ufixed;
import org.web3j.abi.datatypes.Uint;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.primitive.PrimitiveType;

/* renamed from: n07 */
/* compiled from: TypeEncoder */
public class n07 {
    private n07() {
    }

    private static <T extends fz6> String arrayEncodePacked(Array<T> array) {
        if (isSupportingEncodedPacked(array)) {
            if (array.getValue().isEmpty()) {
                return "";
            }
            if (array instanceof DynamicArray) {
                return encode(array).substring(64);
            }
            if (array instanceof StaticArray) {
                return encode(array);
            }
        }
        throw new UnsupportedOperationException("Type cannot be packed encoded: " + array.getClass());
    }

    public static String encode(fz6 fz6) {
        if (fz6 instanceof NumericType) {
            return encodeNumeric((NumericType) fz6);
        }
        if (fz6 instanceof Address) {
            return encodeAddress((Address) fz6);
        }
        if (fz6 instanceof Bool) {
            return encodeBool((Bool) fz6);
        }
        if (fz6 instanceof Bytes) {
            return encodeBytes((Bytes) fz6);
        }
        if (fz6 instanceof DynamicBytes) {
            return encodeDynamicBytes((DynamicBytes) fz6);
        }
        if (fz6 instanceof Utf8String) {
            return encodeString((Utf8String) fz6);
        }
        if (fz6 instanceof StaticArray) {
            StaticArray staticArray = (StaticArray) fz6;
            if (DynamicStruct.class.isAssignableFrom(staticArray.getComponentType())) {
                return encodeStaticArrayWithDynamicStruct(staticArray);
            }
            return encodeArrayValues(staticArray);
        } else if (fz6 instanceof DynamicStruct) {
            return encodeDynamicStruct((DynamicStruct) fz6);
        } else {
            if (fz6 instanceof DynamicArray) {
                return encodeDynamicArray((DynamicArray) fz6);
            }
            if (fz6 instanceof PrimitiveType) {
                return encode(((PrimitiveType) fz6).toSolidityType());
            }
            throw new UnsupportedOperationException("Type cannot be encoded: " + fz6.getClass());
        }
    }

    public static String encodeAddress(Address address) {
        return encodeNumeric(address.toUint());
    }

    public static <T extends fz6> String encodeArrayValues(Array<T> array) {
        StringBuilder sb = new StringBuilder();
        for (fz6 encode : array.getValue()) {
            sb.append(encode(encode));
        }
        return sb.toString();
    }

    private static <T extends fz6> String encodeArrayValuesOffsets(DynamicArray<T> dynamicArray) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        StringBuilder sb = new StringBuilder();
        if (dynamicArray.getValue().isEmpty() || !(dynamicArray.getValue().get(0) instanceof DynamicBytes)) {
            z = false;
        } else {
            z = true;
        }
        if (dynamicArray.getValue().isEmpty() || !(dynamicArray.getValue().get(0) instanceof Utf8String)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (dynamicArray.getValue().isEmpty() || !(dynamicArray.getValue().get(0) instanceof DynamicStruct)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z || z2) {
            long j = 0;
            for (int i2 = 0; i2 < dynamicArray.getValue().size(); i2++) {
                if (i2 == 0) {
                    j = (long) (dynamicArray.getValue().size() * 32);
                } else {
                    if (z) {
                        i = ((byte[]) ((fz6) dynamicArray.getValue().get(i2 - 1)).getValue()).length;
                    } else {
                        i = ((String) ((fz6) dynamicArray.getValue().get(i2 - 1)).getValue()).length();
                    }
                    j += (long) (((((i + 32) - 1) / 32) * 32) + 32);
                }
                sb.append(pc4.toHexStringNoPrefix(pc4.toBytesPadded(new BigInteger(Long.toString(j)), 32)));
            }
        } else if (z3) {
            sb.append(encodeStructsArraysOffsets(dynamicArray));
        }
        return sb.toString();
    }

    public static String encodeBool(Bool bool) {
        byte[] bArr = new byte[32];
        if (bool.getValue().booleanValue()) {
            bArr[31] = 1;
        }
        return pc4.toHexStringNoPrefix(bArr);
    }

    public static String encodeBytes(BytesType bytesType) {
        byte[] value = bytesType.getValue();
        int length = value.length;
        int i = length % 32;
        if (i != 0) {
            byte[] bArr = new byte[((32 - i) + length)];
            System.arraycopy(value, 0, bArr, 0, length);
            value = bArr;
        }
        return pc4.toHexStringNoPrefix(value);
    }

    public static <T extends fz6> String encodeDynamicArray(DynamicArray<T> dynamicArray) {
        String encode = encode(new Uint(BigInteger.valueOf((long) dynamicArray.getValue().size())));
        String encodeArrayValuesOffsets = encodeArrayValuesOffsets(dynamicArray);
        String encodeArrayValues = encodeArrayValues(dynamicArray);
        return encode + encodeArrayValuesOffsets + encodeArrayValues;
    }

    public static String encodeDynamicBytes(DynamicBytes dynamicBytes) {
        String encode = encode(new Uint(BigInteger.valueOf((long) dynamicBytes.getValue().length)));
        String encodeBytes = encodeBytes(dynamicBytes);
        return encode + encodeBytes;
    }

    public static String encodeDynamicStruct(DynamicStruct dynamicStruct) {
        String encodeDynamicStructValues = encodeDynamicStructValues(dynamicStruct);
        return encodeDynamicStructValues;
    }

    private static String encodeDynamicStructValues(DynamicStruct dynamicStruct) {
        int i = 0;
        for (int i2 = 0; i2 < dynamicStruct.getValue().size(); i2++) {
            fz6 fz6 = (fz6) dynamicStruct.getValue().get(i2);
            if (isDynamic(fz6)) {
                i += 32;
            } else {
                i += fz6.bytes32PaddedLength();
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < dynamicStruct.getValue().size(); i3++) {
            fz6 fz62 = (fz6) dynamicStruct.getValue().get(i3);
            if (isDynamic(fz62)) {
                arrayList.add(pc4.toHexStringNoPrefix(pc4.toBytesPadded(new BigInteger(Long.toString((long) i)), 32)));
                String encode = encode(fz62);
                arrayList2.add(encode);
                i += encode.length() >> 1;
            } else {
                arrayList.add(encode((fz6) dynamicStruct.getValue().get(i3)));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        return l07.m63654a("", arrayList3);
    }

    public static String encodeNumeric(NumericType numericType) {
        byte[] byteArray = toByteArray(numericType);
        byte paddingValue = getPaddingValue(numericType);
        byte[] bArr = new byte[32];
        if (paddingValue != 0) {
            for (int i = 0; i < 32; i++) {
                bArr[i] = paddingValue;
            }
        }
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        return pc4.toHexStringNoPrefix(bArr);
    }

    public static String encodePacked(fz6 fz6) {
        if (fz6 instanceof Utf8String) {
            return removePadding(encode(fz6), fz6);
        }
        if (fz6 instanceof DynamicBytes) {
            return encode(fz6).substring(64);
        }
        if (fz6 instanceof DynamicArray) {
            return arrayEncodePacked((DynamicArray) fz6);
        }
        if (fz6 instanceof StaticArray) {
            return arrayEncodePacked((StaticArray) fz6);
        }
        if (fz6 instanceof PrimitiveType) {
            return encodePacked(((PrimitiveType) fz6).toSolidityType());
        }
        return removePadding(encode(fz6), fz6);
    }

    private static <T extends fz6> String encodeStaticArrayWithDynamicStruct(Array<T> array) {
        String encodeStructsArraysOffsets = encodeStructsArraysOffsets(array);
        String encodeArrayValues = encodeArrayValues(array);
        return encodeStructsArraysOffsets + encodeArrayValues;
    }

    public static String encodeString(Utf8String utf8String) {
        return encodeDynamicBytes(new DynamicBytes(utf8String.getValue().getBytes(StandardCharsets.UTF_8)));
    }

    private static <T extends fz6> String encodeStructsArraysOffsets(Array<T> array) {
        StringBuilder sb = new StringBuilder();
        long size = (long) array.getValue().size();
        List list = (List) array.getValue().stream().map(new m07()).collect(Collectors.toList());
        for (int i = 0; i < array.getValue().size(); i++) {
            if (i == 0) {
                size *= 32;
            } else {
                size += (long) (((String) list.get(i - 1)).length() / 2);
            }
            sb.append(pc4.toHexStringNoPrefix(pc4.toBytesPadded(new BigInteger(Long.toString(size)), 32)));
        }
        return sb.toString();
    }

    private static byte getPaddingValue(NumericType numericType) {
        if (numericType.getValue().signum() == -1) {
            return -1;
        }
        return 0;
    }

    public static boolean isDynamic(fz6 fz6) {
        if ((fz6 instanceof DynamicBytes) || (fz6 instanceof Utf8String) || (fz6 instanceof DynamicArray) || ((fz6 instanceof StaticArray) && DynamicStruct.class.isAssignableFrom(((StaticArray) fz6).getComponentType()))) {
            return true;
        }
        return false;
    }

    private static <T extends fz6> boolean isSupportingEncodedPacked(Array<T> array) {
        if (Utf8String.class.isAssignableFrom(array.getComponentType()) || DynamicStruct.class.isAssignableFrom(array.getComponentType()) || DynamicArray.class.isAssignableFrom(array.getComponentType()) || StaticStruct.class.isAssignableFrom(array.getComponentType()) || FixedPointType.class.isAssignableFrom(array.getComponentType()) || DynamicBytes.class.isAssignableFrom(array.getComponentType())) {
            return false;
        }
        return true;
    }

    public static String removePadding(String str, fz6 fz6) {
        if (fz6 instanceof NumericType) {
            if ((fz6 instanceof Ufixed) || (fz6 instanceof Fixed)) {
                return str;
            }
            return str.substring(64 - (((NumericType) fz6).getBitSize() / 4), 64);
        } else if (fz6 instanceof Address) {
            return str.substring(64 - (((Address) fz6).toUint().getBitSize() / 4), 64);
        } else {
            if (fz6 instanceof Bool) {
                return str.substring(62, 64);
            }
            if (fz6 instanceof Bytes) {
                return str.substring(0, ((BytesType) fz6).getValue().length * 2);
            }
            if (fz6 instanceof Utf8String) {
                return str.substring(64, (((Utf8String) fz6).getValue().getBytes(StandardCharsets.UTF_8).length * 2) + 64);
            }
            throw new UnsupportedOperationException("Type cannot be encoded: " + fz6.getClass());
        }
    }

    private static byte[] toByteArray(NumericType numericType) {
        BigInteger value = numericType.getValue();
        if ((!(numericType instanceof Ufixed) && !(numericType instanceof Uint)) || value.bitLength() != 256) {
            return value.toByteArray();
        }
        byte[] bArr = new byte[32];
        System.arraycopy(value.toByteArray(), 1, bArr, 0, 32);
        return bArr;
    }
}
