package org.web3j.abi;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Bytes;
import org.web3j.abi.datatypes.BytesType;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Fixed;
import org.web3j.abi.datatypes.FixedPointType;
import org.web3j.abi.datatypes.Int;
import org.web3j.abi.datatypes.IntType;
import org.web3j.abi.datatypes.NumericType;
import org.web3j.abi.datatypes.StaticArray;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Ufixed;
import org.web3j.abi.datatypes.Uint;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint160;
import org.web3j.abi.datatypes.primitive.Double;
import org.web3j.abi.datatypes.primitive.Float;

/* renamed from: org.web3j.abi.b */
/* compiled from: TypeDecoder */
public class C9084b {
    public static final int MAX_BYTE_LENGTH_FOR_HEX_STRING = 64;

    public static List arrayToList(Object obj) {
        int length = Array.getLength(obj);
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(Array.get(obj, i));
        }
        return arrayList;
    }

    public static BigInteger asBigInteger(Object obj) {
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).toBigInteger();
        }
        if (obj instanceof String) {
            return pc4.toBigInt((String) obj);
        }
        if (obj instanceof byte[]) {
            return pc4.toBigInt((byte[]) obj);
        }
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Float)) {
            return BigDecimal.valueOf(((Number) obj).doubleValue()).toBigInteger();
        }
        if (obj instanceof Number) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        return null;
    }

    public static <T extends org.web3j.abi.datatypes.Array> T decode(String str, int i, TypeReference<T> typeReference) {
        Class<?> cls = ((ParameterizedType) typeReference.getType()).getRawType().getClass();
        if (StaticArray.class.isAssignableFrom(cls)) {
            return (org.web3j.abi.datatypes.Array) decodeStaticArray(str, i, typeReference, 1);
        }
        if (DynamicArray.class.isAssignableFrom(cls)) {
            return (org.web3j.abi.datatypes.Array) decodeDynamicArray(str, i, typeReference);
        }
        throw new UnsupportedOperationException("Unsupported TypeReference: " + cls.getName() + ", only Array types can be passed as TypeReferences");
    }

    public static Address decodeAddress(String str) {
        return new Address((Uint) decodeNumeric(str, Uint160.class));
    }

    private static <T extends fz6> T decodeArrayElements(String str, int i, TypeReference<T> typeReference, int i2, BiFunction<List<T>, String, T> biFunction) {
        T t;
        T t2;
        try {
            Class<T> parameterizedTypeFromArray = Utils.getParameterizedTypeFromArray(typeReference);
            int i3 = 0;
            if (ac6.class.isAssignableFrom(parameterizedTypeFromArray)) {
                ArrayList arrayList = new ArrayList(i2);
                int i4 = i;
                while (i3 < i2) {
                    if (DynamicStruct.class.isAssignableFrom(parameterizedTypeFromArray)) {
                        t2 = decodeDynamicStruct(str, C9083a.getDataOffset(str, i4, typeReference) + i, TypeReference.create(parameterizedTypeFromArray));
                    } else {
                        t2 = decodeStaticStruct(str, i4, TypeReference.create(parameterizedTypeFromArray));
                    }
                    arrayList.add(t2);
                    i3++;
                    i4 += getSingleElementLength(str, i4, parameterizedTypeFromArray) * 64;
                }
                return (fz6) biFunction.apply(arrayList, Utils.getSimpleTypeName(parameterizedTypeFromArray));
            } else if (!org.web3j.abi.datatypes.Array.class.isAssignableFrom(parameterizedTypeFromArray)) {
                ArrayList arrayList2 = new ArrayList(i2);
                int i5 = i;
                while (i3 < i2) {
                    if (isDynamic(parameterizedTypeFromArray)) {
                        t = decode(str, C9083a.getDataOffset(str, i5, typeReference) + i, parameterizedTypeFromArray);
                        i5 += 64;
                    } else {
                        t = decode(str, i5, parameterizedTypeFromArray);
                        i5 += getSingleElementLength(str, i5, parameterizedTypeFromArray) * 64;
                    }
                    arrayList2.add(t);
                    i3++;
                }
                return (fz6) biFunction.apply(arrayList2, Utils.getSimpleTypeName(parameterizedTypeFromArray));
            } else {
                throw new UnsupportedOperationException("Arrays of arrays are not currently supported for external functions, seehttp://solidity.readthedocs.io/en/develop/types.html#members");
            }
        } catch (ClassNotFoundException e) {
            throw new UnsupportedOperationException("Unable to access parameterized type " + Utils.getTypeName(typeReference.getType()), e);
        }
    }

    public static Bool decodeBool(String str, int i) {
        return new Bool(pc4.toBigInt(str.substring(i, i + 64)).equals(BigInteger.ONE));
    }

    public static <T extends Bytes> T decodeBytes(String str, Class<T> cls) {
        return decodeBytes(str, 0, cls);
    }

    public static <T extends fz6> T decodeDynamicArray(String str, int i, TypeReference<T> typeReference) {
        return decodeArrayElements(str, i + 64, typeReference, decodeUintAsInt(str, i), new e07());
    }

    public static DynamicBytes decodeDynamicBytes(String str, int i) {
        int i2 = i + 64;
        return new DynamicBytes(pc4.hexStringToByteArray(str.substring(i2, (decodeUintAsInt(str, i) << 1) + i2)));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class, java.lang.Class<T>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T extends p000.fz6> T decodeDynamicParameterFromStruct(java.lang.String r0, int r1, int r2, java.lang.Class<T> r3, java.lang.Class<T> r4) {
        /*
            int r2 = r2 + r1
            java.lang.String r0 = r0.substring(r1, r2)
            java.lang.Class<org.web3j.abi.datatypes.DynamicStruct> r1 = org.web3j.abi.datatypes.DynamicStruct.class
            boolean r1 = r1.isAssignableFrom(r3)
            r2 = 0
            if (r1 == 0) goto L_0x0017
            org.web3j.abi.TypeReference r1 = org.web3j.abi.TypeReference.create(r3)
            fz6 r0 = decodeDynamicStruct(r0, r2, r1)
            goto L_0x002c
        L_0x0017:
            java.lang.Class<org.web3j.abi.datatypes.DynamicArray> r1 = org.web3j.abi.datatypes.DynamicArray.class
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L_0x0028
            org.web3j.abi.TypeReference r1 = org.web3j.abi.Utils.getDynamicArrayTypeReference(r4)
            fz6 r0 = decodeDynamicArray(r0, r2, r1)
            goto L_0x002c
        L_0x0028:
            fz6 r0 = decode(r0, r3)
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.web3j.abi.C9084b.decodeDynamicParameterFromStruct(java.lang.String, int, int, java.lang.Class, java.lang.Class):fz6");
    }

    public static <T extends fz6> T decodeDynamicStruct(String str, int i, TypeReference<T> typeReference) {
        return decodeDynamicStructElements(str, i, typeReference, new h07(typeReference));
    }

    private static int decodeDynamicStructDynamicParameterOffset(String str) {
        return decodeUintAsInt(str, 0) * 2;
    }

    private static <T extends fz6> T decodeDynamicStructElements(String str, int i, TypeReference<T> typeReference, BiFunction<List<T>, String, T> biFunction) {
        int intValue;
        int intValue2;
        fz6 decode;
        int bytes32PaddedLength;
        String str2 = str;
        try {
            Class<T> classType = typeReference.getClassType();
            Constructor findStructConstructor = Utils.findStructConstructor(classType);
            int a = findStructConstructor.getParameterCount();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (int i3 = 0; i3 < a; i3++) {
                Class cls = findStructConstructor.getParameterTypes()[i3];
                int i4 = i + i2;
                if (isDynamic(cls)) {
                    arrayList.add(Integer.valueOf(decodeDynamicStructDynamicParameterOffset(str.substring(i4, i4 + 64)) + i));
                    i2 += 64;
                } else {
                    if (StaticStruct.class.isAssignableFrom(cls)) {
                        decode = decodeStaticStruct(str.substring(i4), 0, TypeReference.create(cls));
                        bytes32PaddedLength = Utils.staticStructNestedPublicFieldsFlatList(classType).size() * 64;
                    } else {
                        decode = decode(str.substring(i4), 0, cls);
                        bytes32PaddedLength = decode.bytes32PaddedLength() * 2;
                    }
                    i2 += bytes32PaddedLength;
                    hashMap.put(Integer.valueOf(i3), decode);
                }
            }
            int dynamicStructDynamicParametersCount = getDynamicStructDynamicParametersCount(findStructConstructor.getParameterTypes());
            int i5 = 0;
            for (int i6 = 0; i6 < a; i6++) {
                Class cls2 = findStructConstructor.getParameterTypes()[i6];
                if (isDynamic(cls2)) {
                    boolean z = true;
                    if (i5 != dynamicStructDynamicParametersCount - 1) {
                        z = false;
                    }
                    if (z) {
                        intValue = str.length();
                        intValue2 = ((Integer) arrayList.get(i5)).intValue();
                    } else {
                        intValue = ((Integer) arrayList.get(i5 + 1)).intValue();
                        intValue2 = ((Integer) arrayList.get(i5)).intValue();
                    }
                    hashMap.put(Integer.valueOf(i6), decodeDynamicParameterFromStruct(str, ((Integer) arrayList.get(i5)).intValue(), intValue - intValue2, cls2, Utils.extractParameterFromAnnotation(findStructConstructor.getParameterAnnotations()[i6])));
                    i5++;
                }
            }
            String simpleTypeName = Utils.getSimpleTypeName(classType);
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < a; i7++) {
                arrayList2.add(hashMap.get(Integer.valueOf(i7)));
            }
            return (fz6) biFunction.apply(arrayList2, simpleTypeName);
        } catch (ClassNotFoundException e) {
            throw new UnsupportedOperationException("Unable to access parameterized type " + Utils.getTypeName(typeReference.getType()), e);
        }
    }

    public static <T extends NumericType> T decodeNumeric(String str, Class<T> cls) {
        try {
            byte[] hexStringToByteArray = pc4.hexStringToByteArray(str);
            int typeLengthInBytes = getTypeLengthInBytes(cls);
            byte[] bArr = new byte[(typeLengthInBytes + 1)];
            if (Int.class.isAssignableFrom(cls) || Fixed.class.isAssignableFrom(cls)) {
                bArr[0] = hexStringToByteArray[0];
            }
            System.arraycopy(hexStringToByteArray, 32 - typeLengthInBytes, bArr, 1, typeLengthInBytes);
            BigInteger bigInteger = new BigInteger(bArr);
            return (NumericType) cls.getConstructor(new Class[]{BigInteger.class}).newInstance(new Object[]{bigInteger});
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new UnsupportedOperationException("Unable to create instance of " + cls.getName(), e);
        }
    }

    public static <T extends fz6> T decodeStaticArray(String str, int i, TypeReference<T> typeReference, int i2) {
        return decodeArrayElements(str, i, typeReference, i2, new f07(i2));
    }

    public static <T extends fz6> T decodeStaticStruct(String str, int i, TypeReference<T> typeReference) {
        return decodeStaticStructElement(str, i, typeReference, new i07(typeReference));
    }

    private static <T extends fz6> T decodeStaticStructElement(String str, int i, TypeReference<T> typeReference, BiFunction<List<T>, String, T> biFunction) {
        fz6 fz6;
        int i2;
        try {
            Class<T> classType = typeReference.getClassType();
            Constructor findStructConstructor = Utils.findStructConstructor(classType);
            int a = findStructConstructor.getParameterCount();
            ArrayList arrayList = new ArrayList(a);
            int i3 = 0;
            while (i3 < a) {
                Class cls = findStructConstructor.getParameterTypes()[i3];
                if (StaticStruct.class.isAssignableFrom(cls)) {
                    i2 = (classType.getDeclaredFields()[i3].getType().getConstructors()[0].getParameters().length * 64) + i;
                    fz6 = decodeStaticStruct(str.substring(i, i2), 0, TypeReference.create(cls));
                } else {
                    i2 = i + 64;
                    fz6 = decode(str.substring(i, i2), 0, cls);
                }
                arrayList.add(fz6);
                i3++;
                i = i2;
            }
            return (fz6) biFunction.apply(arrayList, Utils.getSimpleTypeName(classType));
        } catch (ClassNotFoundException e) {
            throw new UnsupportedOperationException("Unable to access parameterized type " + Utils.getTypeName(typeReference.getType()), e);
        }
    }

    public static int decodeUintAsInt(String str, int i) {
        return ((Uint) decode(str.substring(i, i + 64), 0, Uint.class)).getValue().intValue();
    }

    public static Utf8String decodeUtf8String(String str, int i) {
        return new Utf8String(new String(decodeDynamicBytes(str, i).getValue(), StandardCharsets.UTF_8));
    }

    private static <T extends fz6> int getDynamicStructDynamicParametersCount(Class<?>[] clsArr) {
        return (int) Arrays.stream(clsArr).filter(new g07()).count();
    }

    public static <T extends fz6> int getSingleElementLength(String str, int i, Class<T> cls) {
        if (str.length() == i) {
            return 0;
        }
        if (DynamicBytes.class.isAssignableFrom(cls) || Utf8String.class.isAssignableFrom(cls)) {
            return (decodeUintAsInt(str, i) / 32) + 2;
        }
        if (StaticStruct.class.isAssignableFrom(cls)) {
            return Utils.staticStructNestedPublicFieldsFlatList(cls).size();
        }
        return 1;
    }

    public static <T extends NumericType> int getTypeLength(Class<T> cls) {
        if (IntType.class.isAssignableFrom(cls)) {
            String[] split = cls.getSimpleName().split("(" + Uint.class.getSimpleName() + "|" + Int.class.getSimpleName() + ")");
            if (split.length == 2) {
                return Integer.parseInt(split[1]);
            }
            return 256;
        } else if (!FixedPointType.class.isAssignableFrom(cls)) {
            return 256;
        } else {
            String[] split2 = cls.getSimpleName().split("(" + Ufixed.class.getSimpleName() + "|" + Fixed.class.getSimpleName() + ")");
            if (split2.length != 2) {
                return 256;
            }
            String[] split3 = split2[1].split("x");
            return Integer.parseInt(split3[0]) + Integer.parseInt(split3[1]);
        }
    }

    public static <T extends NumericType> int getTypeLengthInBytes(Class<T> cls) {
        return getTypeLength(cls) >> 3;
    }

    public static fz6 instantiateArrayType(TypeReference typeReference, Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        List<Object> list;
        int i;
        Constructor<?> constructor;
        if (obj instanceof List) {
            list = (List) obj;
        } else if (obj.getClass().isArray()) {
            list = arrayToList(obj);
        } else {
            throw new ClassCastException("Arg of type " + obj.getClass() + " should be a list to instantiate web3j Array");
        }
        if (typeReference instanceof TypeReference.StaticArrayTypeReference) {
            i = ((TypeReference.StaticArrayTypeReference) typeReference).getSize();
        } else {
            i = -1;
        }
        if (i <= 0) {
            constructor = DynamicArray.class.getConstructor(new Class[]{Class.class, List.class});
        } else {
            constructor = Class.forName("org.web3j.abi.datatypes.generated.StaticArray" + i).getConstructor(new Class[]{Class.class, List.class});
        }
        ArrayList arrayList = new ArrayList(list.size());
        TypeReference subTypeReference = typeReference.getSubTypeReference();
        for (Object instantiateType : list) {
            arrayList.add(instantiateType(subTypeReference, instantiateType));
        }
        return (fz6) constructor.newInstance(new Object[]{subTypeReference.getClassType(), arrayList});
    }

    public static fz6 instantiateAtomicType(Class<?> cls, Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Object obj2 = null;
        if (NumericType.class.isAssignableFrom(cls)) {
            obj2 = asBigInteger(obj);
        } else {
            if (BytesType.class.isAssignableFrom(cls)) {
                if (!(obj instanceof byte[])) {
                    if (obj instanceof BigInteger) {
                        obj2 = ((BigInteger) obj).toByteArray();
                    } else if (obj instanceof String) {
                        obj2 = pc4.hexStringToByteArray((String) obj);
                    }
                }
            } else if (Utf8String.class.isAssignableFrom(cls)) {
                obj2 = obj.toString();
            } else if (Address.class.isAssignableFrom(cls)) {
                if (!(obj instanceof BigInteger) && !(obj instanceof Uint160)) {
                    obj2 = obj.toString();
                }
            } else if (Bool.class.isAssignableFrom(cls)) {
                if (!(obj instanceof Boolean)) {
                    BigInteger asBigInteger = asBigInteger(obj);
                    if (asBigInteger != null) {
                        obj2 = Boolean.valueOf(!asBigInteger.equals(BigInteger.ZERO));
                    }
                }
            }
            obj2 = obj;
        }
        if (obj2 != null) {
            return (fz6) cls.getConstructor(new Class[]{obj2.getClass()}).newInstance(new Object[]{obj2});
        }
        throw new InstantiationException("Could not create type " + cls + " from arg " + obj.toString() + " of type " + obj.getClass());
    }

    private static <T extends fz6> T instantiateStaticArray(List<T> list, int i) {
        try {
            return (fz6) Class.forName("org.web3j.abi.datatypes.generated.StaticArray" + i).getConstructor(new Class[]{List.class}).newInstance(new Object[]{list});
        } catch (ReflectiveOperationException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    private static <T extends fz6> T instantiateStruct(TypeReference<T> typeReference, List<T> list) {
        try {
            Constructor findStructConstructor = Utils.findStructConstructor(typeReference.getClassType());
            findStructConstructor.setAccessible(true);
            return (fz6) findStructConstructor.newInstance(list.toArray());
        } catch (ReflectiveOperationException e) {
            throw new UnsupportedOperationException("Constructor cannot accept" + Arrays.toString(list.toArray()), e);
        }
    }

    public static fz6 instantiateType(String str, Object obj) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        return instantiateType(TypeReference.makeTypeReference(str), obj);
    }

    public static <T extends fz6> boolean isDynamic(Class<T> cls) {
        if (DynamicBytes.class.isAssignableFrom(cls) || Utf8String.class.isAssignableFrom(cls) || DynamicArray.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ fz6 lambda$decodeDynamicArray$2(List list, String str) {
        return new DynamicArray(C7927n5.getType(str), list);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ fz6 lambda$decodeDynamicStruct$3(TypeReference typeReference, List list, String str) {
        if (!list.isEmpty()) {
            return instantiateStruct(typeReference, list);
        }
        throw new UnsupportedOperationException("Zero length fixed array is invalid type");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ fz6 lambda$decodeStaticArray$0(int i, List list, String str) {
        if (!list.isEmpty()) {
            return instantiateStaticArray(list, i);
        }
        throw new UnsupportedOperationException("Zero length fixed array is invalid type");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ fz6 lambda$decodeStaticStruct$1(TypeReference typeReference, List list, String str) {
        if (!list.isEmpty()) {
            return instantiateStruct(typeReference, list);
        }
        throw new UnsupportedOperationException("Zero length fixed array is invalid type");
    }

    public static <T extends Bytes> T decodeBytes(String str, int i, Class<T> cls) {
        try {
            Object hexStringToByteArray = pc4.hexStringToByteArray(str.substring(i, (Integer.parseInt(cls.getSimpleName().split(Bytes.class.getSimpleName())[1]) << 1) + i));
            return (Bytes) cls.getConstructor(new Class[]{byte[].class}).newInstance(new Object[]{hexStringToByteArray});
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new UnsupportedOperationException("Unable to create instance of " + cls.getName(), e);
        }
    }

    public static fz6 instantiateType(TypeReference typeReference, Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Class classType = typeReference.getClassType();
        if (org.web3j.abi.datatypes.Array.class.isAssignableFrom(classType)) {
            return instantiateArrayType(typeReference, obj);
        }
        return instantiateAtomicType(classType, obj);
    }

    public static <T extends fz6> T decode(String str, int i, Class<T> cls) {
        if (NumericType.class.isAssignableFrom(cls)) {
            return decodeNumeric(str.substring(i), cls);
        }
        if (Address.class.isAssignableFrom(cls)) {
            return decodeAddress(str.substring(i));
        }
        if (Bool.class.isAssignableFrom(cls)) {
            return decodeBool(str, i);
        }
        if (Bytes.class.isAssignableFrom(cls)) {
            return decodeBytes(str, i, cls);
        }
        if (DynamicBytes.class.isAssignableFrom(cls)) {
            return decodeDynamicBytes(str, i);
        }
        if (Utf8String.class.isAssignableFrom(cls)) {
            return decodeUtf8String(str, i);
        }
        if (org.web3j.abi.datatypes.Array.class.isAssignableFrom(cls)) {
            throw new UnsupportedOperationException("Array types must be wrapped in a TypeReference");
        }
        throw new UnsupportedOperationException("Type cannot be encoded: " + cls.getClass());
    }

    public static <T extends fz6> T decode(String str, Class<T> cls) {
        return decode(str, 0, cls);
    }
}
