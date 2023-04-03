package com.walletconnect.android.pairing.model;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Lcom/walletconnect/android/pairing/model/PairingParams;", "Lrg0;", "<init>", "()V", "DeleteParams", "a", "Lcom/walletconnect/android/pairing/model/PairingParams$DeleteParams;", "Lcom/walletconnect/android/pairing/model/PairingParams$a;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PairingParams.kt */
public abstract class PairingParams implements rg0 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lcom/walletconnect/android/pairing/model/PairingParams$a;", "Lcom/walletconnect/android/pairing/model/PairingParams;", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.android.pairing.model.PairingParams$a */
    /* compiled from: PairingParams.kt */
    public static final class C5576a extends PairingParams {
        public C5576a() {
            super((DefaultConstructorMarker) null);
        }
    }

    private PairingParams() {
    }

    public /* synthetic */ PairingParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lcom/walletconnect/android/pairing/model/PairingParams$DeleteParams;", "Lcom/walletconnect/android/pairing/model/PairingParams;", "", "a", "I", "()I", "code", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "message", "<init>", "(ILjava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: PairingParams.kt */
    public static final class DeleteParams extends PairingParams {

        /* renamed from: a */
        public final int f27221a;

        /* renamed from: b */
        public final String f27222b;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeleteParams(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? vx2.m53591g(iw2.f30141a, "<this>") : i, str);
        }

        /* renamed from: a */
        public final int mo40507a() {
            return this.f27221a;
        }

        /* renamed from: b */
        public final String mo40508b() {
            return this.f27222b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeleteParams(@y33(name = "code") int i, @y33(name = "message") String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            this.f27221a = i;
            this.f27222b = str;
        }
    }
}
