package net.safemoon.androidwallet.model.walletConnect;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction;", "", "signatures", "", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction$Signatures;", "feePayer", "", "instructions", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction$Instruction;", "recentBlockhash", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getFeePayer", "()Ljava/lang/String;", "getInstructions", "()Ljava/util/List;", "getRecentBlockhash", "getSignatures", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Instruction", "Signature", "Signatures", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSolanaSignTransaction.kt */
public final class WCSolanaSignTransaction {
    private final String feePayer;
    private final List<Instruction> instructions;
    private final String recentBlockhash;
    private final List<Signatures> signatures;

    @Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction$Instruction;", "", "programId", "", "data", "", "", "keys", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction$Instruction$Key;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getKeys", "getProgramId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Key", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCSolanaSignTransaction.kt */
    public static final class Instruction {
        private final List<Integer> data;
        private final List<Key> keys;
        private final String programId;

        @Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction$Instruction$Key;", "", "isSigner", "", "isWritable", "pubkey", "", "(ZZLjava/lang/String;)V", "()Z", "getPubkey", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* compiled from: WCSolanaSignTransaction.kt */
        public static final class Key {
            private final boolean isSigner;
            private final boolean isWritable;
            private final String pubkey;

            public Key(boolean z, boolean z2, String str) {
                vx2.m53591g(str, PublicResolver.FUNC_PUBKEY);
                this.isSigner = z;
                this.isWritable = z2;
                this.pubkey = str;
            }

            public static /* synthetic */ Key copy$default(Key key, boolean z, boolean z2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = key.isSigner;
                }
                if ((i & 2) != 0) {
                    z2 = key.isWritable;
                }
                if ((i & 4) != 0) {
                    str = key.pubkey;
                }
                return key.copy(z, z2, str);
            }

            public final boolean component1() {
                return this.isSigner;
            }

            public final boolean component2() {
                return this.isWritable;
            }

            public final String component3() {
                return this.pubkey;
            }

            public final Key copy(boolean z, boolean z2, String str) {
                vx2.m53591g(str, PublicResolver.FUNC_PUBKEY);
                return new Key(z, z2, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Key)) {
                    return false;
                }
                Key key = (Key) obj;
                return this.isSigner == key.isSigner && this.isWritable == key.isWritable && vx2.m53586b(this.pubkey, key.pubkey);
            }

            public final String getPubkey() {
                return this.pubkey;
            }

            public int hashCode() {
                boolean z = this.isSigner;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                boolean z3 = this.isWritable;
                if (!z3) {
                    z2 = z3;
                }
                return ((i + (z2 ? 1 : 0)) * 31) + this.pubkey.hashCode();
            }

            public final boolean isSigner() {
                return this.isSigner;
            }

            public final boolean isWritable() {
                return this.isWritable;
            }

            public String toString() {
                boolean z = this.isSigner;
                boolean z2 = this.isWritable;
                String str = this.pubkey;
                return "Key(isSigner=" + z + ", isWritable=" + z2 + ", pubkey=" + str + ")";
            }
        }

        public Instruction(String str, List<Integer> list, List<Key> list2) {
            vx2.m53591g(str, "programId");
            vx2.m53591g(list, "data");
            vx2.m53591g(list2, "keys");
            this.programId = str;
            this.data = list;
            this.keys = list2;
        }

        public static /* synthetic */ Instruction copy$default(Instruction instruction, String str, List<Integer> list, List<Key> list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = instruction.programId;
            }
            if ((i & 2) != 0) {
                list = instruction.data;
            }
            if ((i & 4) != 0) {
                list2 = instruction.keys;
            }
            return instruction.copy(str, list, list2);
        }

        public final String component1() {
            return this.programId;
        }

        public final List<Integer> component2() {
            return this.data;
        }

        public final List<Key> component3() {
            return this.keys;
        }

        public final Instruction copy(String str, List<Integer> list, List<Key> list2) {
            vx2.m53591g(str, "programId");
            vx2.m53591g(list, "data");
            vx2.m53591g(list2, "keys");
            return new Instruction(str, list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Instruction)) {
                return false;
            }
            Instruction instruction = (Instruction) obj;
            return vx2.m53586b(this.programId, instruction.programId) && vx2.m53586b(this.data, instruction.data) && vx2.m53586b(this.keys, instruction.keys);
        }

        public final List<Integer> getData() {
            return this.data;
        }

        public final List<Key> getKeys() {
            return this.keys;
        }

        public final String getProgramId() {
            return this.programId;
        }

        public int hashCode() {
            return (((this.programId.hashCode() * 31) + this.data.hashCode()) * 31) + this.keys.hashCode();
        }

        public String toString() {
            String str = this.programId;
            List<Integer> list = this.data;
            List<Key> list2 = this.keys;
            return "Instruction(programId=" + str + ", data=" + list + ", keys=" + list2 + ")";
        }
    }

    @Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction$Signature;", "", "type", "", "data", "", "(Ljava/lang/String;[I)V", "getData", "()[I", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCSolanaSignTransaction.kt */
    public static final class Signature {
        private final int[] data;
        private final String type;

        public Signature(String str, int[] iArr) {
            vx2.m53591g(str, "type");
            vx2.m53591g(iArr, "data");
            this.type = str;
            this.data = iArr;
        }

        public static /* synthetic */ Signature copy$default(Signature signature, String str, int[] iArr, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signature.type;
            }
            if ((i & 2) != 0) {
                iArr = signature.data;
            }
            return signature.copy(str, iArr);
        }

        public final String component1() {
            return this.type;
        }

        public final int[] component2() {
            return this.data;
        }

        public final Signature copy(String str, int[] iArr) {
            vx2.m53591g(str, "type");
            vx2.m53591g(iArr, "data");
            return new Signature(str, iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Signature)) {
                return false;
            }
            Signature signature = (Signature) obj;
            return vx2.m53586b(this.type, signature.type) && vx2.m53586b(this.data, signature.data);
        }

        public final int[] getData() {
            return this.data;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + Arrays.hashCode(this.data);
        }

        public String toString() {
            String str = this.type;
            String arrays = Arrays.toString(this.data);
            return "Signature(type=" + str + ", data=" + arrays + ")";
        }
    }

    @Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction$Signatures;", "", "signature", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction$Signature;", "publicKey", "", "(Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction$Signature;Ljava/lang/String;)V", "getPublicKey", "()Ljava/lang/String;", "getSignature", "()Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction$Signature;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCSolanaSignTransaction.kt */
    public static final class Signatures {
        private final String publicKey;
        private final Signature signature;

        public Signatures(Signature signature2, String str) {
            vx2.m53591g(str, "publicKey");
            this.signature = signature2;
            this.publicKey = str;
        }

        public static /* synthetic */ Signatures copy$default(Signatures signatures, Signature signature2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                signature2 = signatures.signature;
            }
            if ((i & 2) != 0) {
                str = signatures.publicKey;
            }
            return signatures.copy(signature2, str);
        }

        public final Signature component1() {
            return this.signature;
        }

        public final String component2() {
            return this.publicKey;
        }

        public final Signatures copy(Signature signature2, String str) {
            vx2.m53591g(str, "publicKey");
            return new Signatures(signature2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Signatures)) {
                return false;
            }
            Signatures signatures = (Signatures) obj;
            return vx2.m53586b(this.signature, signatures.signature) && vx2.m53586b(this.publicKey, signatures.publicKey);
        }

        public final String getPublicKey() {
            return this.publicKey;
        }

        public final Signature getSignature() {
            return this.signature;
        }

        public int hashCode() {
            Signature signature2 = this.signature;
            return ((signature2 == null ? 0 : signature2.hashCode()) * 31) + this.publicKey.hashCode();
        }

        public String toString() {
            Signature signature2 = this.signature;
            String str = this.publicKey;
            return "Signatures(signature=" + signature2 + ", publicKey=" + str + ")";
        }
    }

    public WCSolanaSignTransaction(List<Signatures> list, String str, List<Instruction> list2, String str2) {
        vx2.m53591g(list, "signatures");
        vx2.m53591g(str, "feePayer");
        vx2.m53591g(list2, "instructions");
        vx2.m53591g(str2, "recentBlockhash");
        this.signatures = list;
        this.feePayer = str;
        this.instructions = list2;
        this.recentBlockhash = str2;
    }

    public static /* synthetic */ WCSolanaSignTransaction copy$default(WCSolanaSignTransaction wCSolanaSignTransaction, List<Signatures> list, String str, List<Instruction> list2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wCSolanaSignTransaction.signatures;
        }
        if ((i & 2) != 0) {
            str = wCSolanaSignTransaction.feePayer;
        }
        if ((i & 4) != 0) {
            list2 = wCSolanaSignTransaction.instructions;
        }
        if ((i & 8) != 0) {
            str2 = wCSolanaSignTransaction.recentBlockhash;
        }
        return wCSolanaSignTransaction.copy(list, str, list2, str2);
    }

    public final List<Signatures> component1() {
        return this.signatures;
    }

    public final String component2() {
        return this.feePayer;
    }

    public final List<Instruction> component3() {
        return this.instructions;
    }

    public final String component4() {
        return this.recentBlockhash;
    }

    public final WCSolanaSignTransaction copy(List<Signatures> list, String str, List<Instruction> list2, String str2) {
        vx2.m53591g(list, "signatures");
        vx2.m53591g(str, "feePayer");
        vx2.m53591g(list2, "instructions");
        vx2.m53591g(str2, "recentBlockhash");
        return new WCSolanaSignTransaction(list, str, list2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCSolanaSignTransaction)) {
            return false;
        }
        WCSolanaSignTransaction wCSolanaSignTransaction = (WCSolanaSignTransaction) obj;
        return vx2.m53586b(this.signatures, wCSolanaSignTransaction.signatures) && vx2.m53586b(this.feePayer, wCSolanaSignTransaction.feePayer) && vx2.m53586b(this.instructions, wCSolanaSignTransaction.instructions) && vx2.m53586b(this.recentBlockhash, wCSolanaSignTransaction.recentBlockhash);
    }

    public final String getFeePayer() {
        return this.feePayer;
    }

    public final List<Instruction> getInstructions() {
        return this.instructions;
    }

    public final String getRecentBlockhash() {
        return this.recentBlockhash;
    }

    public final List<Signatures> getSignatures() {
        return this.signatures;
    }

    public int hashCode() {
        return (((((this.signatures.hashCode() * 31) + this.feePayer.hashCode()) * 31) + this.instructions.hashCode()) * 31) + this.recentBlockhash.hashCode();
    }

    public String toString() {
        List<Signatures> list = this.signatures;
        String str = this.feePayer;
        List<Instruction> list2 = this.instructions;
        String str2 = this.recentBlockhash;
        return "WCSolanaSignTransaction(signatures=" + list + ", feePayer=" + str + ", instructions=" + list2 + ", recentBlockhash=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WCSolanaSignTransaction(List list, String str, List list2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ck0.m33062j() : list, str, (i & 4) != 0 ? ck0.m33062j() : list2, str2);
    }
}
