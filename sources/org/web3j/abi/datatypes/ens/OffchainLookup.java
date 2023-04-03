package org.web3j.abi.datatypes.ens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.web3j.abi.FunctionReturnDecoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes4;

public class OffchainLookup extends DynamicStruct {
    private static final List outputParameters;
    private byte[] callData;
    private byte[] callbackFunction;
    private byte[] extraData;
    private String sender;
    private List<String> urls;

    static {
        ArrayList arrayList = new ArrayList();
        outputParameters = arrayList;
        arrayList.addAll(Arrays.asList(new TypeReference[]{new TypeReference<Address>() {
        }, new TypeReference<DynamicArray<Utf8String>>() {
        }, new TypeReference<DynamicBytes>() {
        }, new TypeReference<Bytes4>() {
        }, new TypeReference<DynamicBytes>() {
        }}));
    }

    public OffchainLookup(String str, List<String> list, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(new Address(str), new DynamicArray(Utf8String.class, (List) list.stream().map(new rf4()).collect(Collectors.toList())), new DynamicBytes(bArr2), new Bytes4(bArr), new DynamicBytes(bArr3));
        this.sender = str;
        this.urls = list;
        this.callData = bArr;
        this.callbackFunction = bArr2;
        this.extraData = bArr3;
    }

    public static OffchainLookup build(byte[] bArr) {
        List<fz6> decode = FunctionReturnDecoder.decode(pc4.toHexString(bArr), outputParameters);
        return new OffchainLookup((Address) decode.get(0), (DynamicArray<Utf8String>) (DynamicArray) decode.get(1), (DynamicBytes) decode.get(2), (Bytes4) decode.get(3), (DynamicBytes) decode.get(4));
    }

    public byte[] getCallData() {
        return this.callData;
    }

    public byte[] getCallbackFunction() {
        return this.callbackFunction;
    }

    public byte[] getExtraData() {
        return this.extraData;
    }

    public String getSender() {
        return this.sender;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public void setCallData(byte[] bArr) {
        this.callData = bArr;
    }

    public void setCallbackFunction(byte[] bArr) {
        this.callbackFunction = bArr;
    }

    public void setExtraData(byte[] bArr) {
        this.extraData = bArr;
    }

    public void setSender(String str) {
        this.sender = str;
    }

    public void setUrls(List<String> list) {
        this.urls = list;
    }

    public OffchainLookup(Address address, DynamicArray<Utf8String> dynamicArray, DynamicBytes dynamicBytes, Bytes4 bytes4, DynamicBytes dynamicBytes2) {
        super(address, dynamicArray, dynamicBytes, bytes4, dynamicBytes2);
        this.sender = address.getValue();
        this.urls = (List) dynamicArray.getValue().stream().map(new sf4()).collect(Collectors.toList());
        this.callData = dynamicBytes.getValue();
        this.callbackFunction = bytes4.getValue();
        this.extraData = dynamicBytes2.getValue();
    }
}
