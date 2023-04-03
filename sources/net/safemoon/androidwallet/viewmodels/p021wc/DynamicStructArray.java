package net.safemoon.androidwallet.viewmodels.p021wc;

import org.web3j.abi.datatypes.DynamicArray;
import p000.fz6;

/* renamed from: net.safemoon.androidwallet.viewmodels.wc.DynamicStructArray */
public class DynamicStructArray<T extends fz6> extends DynamicArray<T> {
    public String getTypeAsString() {
        return "(address,bytes)[]";
    }
}
