package org.web3j.ens.contracts.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint64;
import p000.gt0;

public class ENS extends gt0 {
    private static final String BINARY = "608060405234801561001057600080fd5b5060008080526020527fad3228b676f7d3cd4284a5443f17f1962b36e491b30a40b2405849e597ba5fb58054600160a060020a03191633179055610500806100596000396000f3006080604052600436106100825763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416630178b8bf811461008757806302571be3146100bb57806306ab5923146100d357806314ab9038146100fc57806316a25cbd146101215780631896f70a146101565780635b0fc9c31461017a575b600080fd5b34801561009357600080fd5b5061009f60043561019e565b60408051600160a060020a039092168252519081900360200190f35b3480156100c757600080fd5b5061009f6004356101bc565b3480156100df57600080fd5b506100fa600435602435600160a060020a03604435166101d7565b005b34801561010857600080fd5b506100fa60043567ffffffffffffffff60243516610291565b34801561012d57600080fd5b5061013960043561035a565b6040805167ffffffffffffffff9092168252519081900360200190f35b34801561016257600080fd5b506100fa600435600160a060020a0360243516610391565b34801561018657600080fd5b506100fa600435600160a060020a0360243516610434565b600090815260208190526040902060010154600160a060020a031690565b600090815260208190526040902054600160a060020a031690565b6000838152602081905260408120548490600160a060020a031633146101fc57600080fd5b60408051868152602080820187905282519182900383018220600160a060020a03871683529251929450869288927fce0457fe73731f824cc272376169235128c118b49d344817417c6d108d155e8292908290030190a3506000908152602081905260409020805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03929092169190911790555050565b6000828152602081905260409020548290600160a060020a031633146102b657600080fd5b6040805167ffffffffffffffff84168152905184917f1d4f9bbfc9cab89d66e1a1562f2233ccbf1308cb4f63de2ead5787adddb8fa68919081900360200190a250600091825260208290526040909120600101805467ffffffffffffffff90921674010000000000000000000000000000000000000000027fffffffff0000000000000000ffffffffffffffffffffffffffffffffffffffff909216919091179055565b60009081526020819052604090206001015474010000000000000000000000000000000000000000900467ffffffffffffffff1690565b6000828152602081905260409020548290600160a060020a031633146103b657600080fd5b60408051600160a060020a0384168152905184917f335721b01866dc23fbee8b6b2c7b1e14d6f05c28cd35a2c934239f94095602a0919081900360200190a250600091825260208290526040909120600101805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03909216919091179055565b6000828152602081905260409020548290600160a060020a0316331461045957600080fd5b60408051600160a060020a0384168152905184917fd4735d920b0f87494915f556dd9b54c8f309026070caea5c737245152564d266919081900360200190a250600091825260208290526040909120805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a039092169190911790555600a165627a7a72305820f201bf7d54db31743dfa9e72c9529bab797c8e550d2355afb39d50e2ab48b4fb0029";
    public static final String FUNC_OWNER = "owner";
    public static final String FUNC_RESOLVER = "resolver";
    public static final String FUNC_SETOWNER = "setOwner";
    public static final String FUNC_SETRESOLVER = "setResolver";
    public static final String FUNC_SETSUBNODEOWNER = "setSubnodeOwner";
    public static final String FUNC_SETTTL = "setTTL";
    public static final String FUNC_TTL = "ttl";
    public static final ft1 NEWOWNER_EVENT = new ft1("NewOwner", Arrays.asList(new TypeReference[]{new TypeReference<Bytes32>(true) {
    }, new TypeReference<Bytes32>(true) {
    }, new TypeReference<Address>() {
    }}));
    public static final ft1 NEWRESOLVER_EVENT = new ft1("NewResolver", Arrays.asList(new TypeReference[]{new TypeReference<Bytes32>(true) {
    }, new TypeReference<Address>() {
    }}));
    public static final ft1 NEWTTL_EVENT = new ft1("NewTTL", Arrays.asList(new TypeReference[]{new TypeReference<Bytes32>(true) {
    }, new TypeReference<Uint64>() {
    }}));
    public static final ft1 TRANSFER_EVENT = new ft1("Transfer", Arrays.asList(new TypeReference[]{new TypeReference<Bytes32>(true) {
    }, new TypeReference<Address>() {
    }}));

    /* renamed from: org.web3j.ens.contracts.generated.ENS$a */
    public class C9102a implements jd2<hk3, C9106e> {
        public C9102a() {
        }

        public C9106e apply(hk3 hk3) {
            gt0.C7143b access$000 = ENS.this.lambda$extractEventParametersWithLog$12(ENS.NEWOWNER_EVENT, hk3);
            C9106e eVar = new C9106e();
            eVar.log = hk3;
            eVar.node = (byte[]) access$000.getIndexedValues().get(0).getValue();
            eVar.label = (byte[]) access$000.getIndexedValues().get(1).getValue();
            eVar.owner = (String) access$000.getNonIndexedValues().get(0).getValue();
            return eVar;
        }
    }

    /* renamed from: org.web3j.ens.contracts.generated.ENS$b */
    public class C9103b implements jd2<hk3, C9109h> {
        public C9103b() {
        }

        public C9109h apply(hk3 hk3) {
            gt0.C7143b access$100 = ENS.this.lambda$extractEventParametersWithLog$12(ENS.TRANSFER_EVENT, hk3);
            C9109h hVar = new C9109h();
            hVar.log = hk3;
            hVar.node = (byte[]) access$100.getIndexedValues().get(0).getValue();
            hVar.owner = (String) access$100.getNonIndexedValues().get(0).getValue();
            return hVar;
        }
    }

    /* renamed from: org.web3j.ens.contracts.generated.ENS$c */
    public class C9104c implements jd2<hk3, C9107f> {
        public C9104c() {
        }

        public C9107f apply(hk3 hk3) {
            gt0.C7143b access$200 = ENS.this.lambda$extractEventParametersWithLog$12(ENS.NEWRESOLVER_EVENT, hk3);
            C9107f fVar = new C9107f();
            fVar.log = hk3;
            fVar.node = (byte[]) access$200.getIndexedValues().get(0).getValue();
            fVar.resolver = (String) access$200.getNonIndexedValues().get(0).getValue();
            return fVar;
        }
    }

    /* renamed from: org.web3j.ens.contracts.generated.ENS$d */
    public class C9105d implements jd2<hk3, C9108g> {
        public C9105d() {
        }

        public C9108g apply(hk3 hk3) {
            gt0.C7143b access$300 = ENS.this.lambda$extractEventParametersWithLog$12(ENS.NEWTTL_EVENT, hk3);
            C9108g gVar = new C9108g();
            gVar.log = hk3;
            gVar.node = (byte[]) access$300.getIndexedValues().get(0).getValue();
            gVar.ttl = (BigInteger) access$300.getNonIndexedValues().get(0).getValue();
            return gVar;
        }
    }

    /* renamed from: org.web3j.ens.contracts.generated.ENS$e */
    public static class C9106e {
        public byte[] label;
        public hk3 log;
        public byte[] node;
        public String owner;
    }

    /* renamed from: org.web3j.ens.contracts.generated.ENS$f */
    public static class C9107f {
        public hk3 log;
        public byte[] node;
        public String resolver;
    }

    /* renamed from: org.web3j.ens.contracts.generated.ENS$g */
    public static class C9108g {
        public hk3 log;
        public byte[] node;
        public BigInteger ttl;
    }

    /* renamed from: org.web3j.ens.contracts.generated.ENS$h */
    public static class C9109h {
        public hk3 log;
        public byte[] node;
        public String owner;
    }

    @Deprecated
    public ENS(String str, vj7 vj7, cw0 cw0, BigInteger bigInteger, BigInteger bigInteger2) {
        super(BINARY, str, vj7, cw0, bigInteger, bigInteger2);
    }

    public static pc5<ENS> deploy(vj7 vj7, cw0 cw0, it0 it0) {
        return gt0.deployRemoteCall(ENS.class, vj7, cw0, it0, BINARY, "");
    }

    @Deprecated
    public static ENS load(String str, vj7 vj7, cw0 cw0, BigInteger bigInteger, BigInteger bigInteger2) {
        return new ENS(str, vj7, cw0, bigInteger, bigInteger2);
    }

    public List<C9106e> getNewOwnerEvents(au6 au6) {
        List<gt0.C7143b> extractEventParametersWithLog = extractEventParametersWithLog(NEWOWNER_EVENT, au6);
        ArrayList arrayList = new ArrayList(extractEventParametersWithLog.size());
        for (gt0.C7143b next : extractEventParametersWithLog) {
            C9106e eVar = new C9106e();
            eVar.log = next.getLog();
            eVar.node = (byte[]) next.getIndexedValues().get(0).getValue();
            eVar.label = (byte[]) next.getIndexedValues().get(1).getValue();
            eVar.owner = (String) next.getNonIndexedValues().get(0).getValue();
            arrayList.add(eVar);
        }
        return arrayList;
    }

    public List<C9107f> getNewResolverEvents(au6 au6) {
        List<gt0.C7143b> extractEventParametersWithLog = extractEventParametersWithLog(NEWRESOLVER_EVENT, au6);
        ArrayList arrayList = new ArrayList(extractEventParametersWithLog.size());
        for (gt0.C7143b next : extractEventParametersWithLog) {
            C9107f fVar = new C9107f();
            fVar.log = next.getLog();
            fVar.node = (byte[]) next.getIndexedValues().get(0).getValue();
            fVar.resolver = (String) next.getNonIndexedValues().get(0).getValue();
            arrayList.add(fVar);
        }
        return arrayList;
    }

    public List<C9108g> getNewTTLEvents(au6 au6) {
        List<gt0.C7143b> extractEventParametersWithLog = extractEventParametersWithLog(NEWTTL_EVENT, au6);
        ArrayList arrayList = new ArrayList(extractEventParametersWithLog.size());
        for (gt0.C7143b next : extractEventParametersWithLog) {
            C9108g gVar = new C9108g();
            gVar.log = next.getLog();
            gVar.node = (byte[]) next.getIndexedValues().get(0).getValue();
            gVar.ttl = (BigInteger) next.getNonIndexedValues().get(0).getValue();
            arrayList.add(gVar);
        }
        return arrayList;
    }

    public List<C9109h> getTransferEvents(au6 au6) {
        List<gt0.C7143b> extractEventParametersWithLog = extractEventParametersWithLog(TRANSFER_EVENT, au6);
        ArrayList arrayList = new ArrayList(extractEventParametersWithLog.size());
        for (gt0.C7143b next : extractEventParametersWithLog) {
            C9109h hVar = new C9109h();
            hVar.log = next.getLog();
            hVar.node = (byte[]) next.getIndexedValues().get(0).getValue();
            hVar.owner = (String) next.getNonIndexedValues().get(0).getValue();
            arrayList.add(hVar);
        }
        return arrayList;
    }

    public g52<C9106e> newOwnerEventFlowable(bs1 bs1) {
        return this.web3j.ethLogFlowable(bs1).mo42753D(new C9102a());
    }

    public g52<C9107f> newResolverEventFlowable(bs1 bs1) {
        return this.web3j.ethLogFlowable(bs1).mo42753D(new C9104c());
    }

    public g52<C9108g> newTTLEventFlowable(bs1 bs1) {
        return this.web3j.ethLogFlowable(bs1).mo42753D(new C9105d());
    }

    public pc5<String> owner(byte[] bArr) {
        return executeRemoteCallSingleValueReturn(new gd2(FUNC_OWNER, Arrays.asList(new fz6[]{new Bytes32(bArr)}), Arrays.asList(new TypeReference[]{new TypeReference<Address>() {
        }})), String.class);
    }

    public pc5<String> resolver(byte[] bArr) {
        return executeRemoteCallSingleValueReturn(new gd2(FUNC_RESOLVER, Arrays.asList(new fz6[]{new Bytes32(bArr)}), Arrays.asList(new TypeReference[]{new TypeReference<Address>() {
        }})), String.class);
    }

    public pc5<au6> setOwner(byte[] bArr, String str) {
        return executeRemoteCallTransaction(new gd2(FUNC_SETOWNER, Arrays.asList(new fz6[]{new Bytes32(bArr), new Address(str)}), Collections.emptyList()));
    }

    public pc5<au6> setResolver(byte[] bArr, String str) {
        return executeRemoteCallTransaction(new gd2(FUNC_SETRESOLVER, Arrays.asList(new fz6[]{new Bytes32(bArr), new Address(str)}), Collections.emptyList()));
    }

    public pc5<au6> setSubnodeOwner(byte[] bArr, byte[] bArr2, String str) {
        return executeRemoteCallTransaction(new gd2(FUNC_SETSUBNODEOWNER, Arrays.asList(new fz6[]{new Bytes32(bArr), new Bytes32(bArr2), new Address(str)}), Collections.emptyList()));
    }

    public pc5<au6> setTTL(byte[] bArr, BigInteger bigInteger) {
        return executeRemoteCallTransaction(new gd2(FUNC_SETTTL, Arrays.asList(new fz6[]{new Bytes32(bArr), new Uint64(bigInteger)}), Collections.emptyList()));
    }

    public g52<C9109h> transferEventFlowable(bs1 bs1) {
        return this.web3j.ethLogFlowable(bs1).mo42753D(new C9103b());
    }

    public pc5<BigInteger> ttl(byte[] bArr) {
        return executeRemoteCallSingleValueReturn(new gd2(FUNC_TTL, Arrays.asList(new fz6[]{new Bytes32(bArr)}), Arrays.asList(new TypeReference[]{new TypeReference<Uint64>() {
        }})), BigInteger.class);
    }

    public ENS(String str, vj7 vj7, cw0 cw0, it0 it0) {
        super(BINARY, str, vj7, cw0, it0);
    }

    public static pc5<ENS> deploy(vj7 vj7, yt6 yt6, it0 it0) {
        return gt0.deployRemoteCall(ENS.class, vj7, yt6, it0, BINARY, "");
    }

    @Deprecated
    public static ENS load(String str, vj7 vj7, yt6 yt6, BigInteger bigInteger, BigInteger bigInteger2) {
        return new ENS(str, vj7, yt6, bigInteger, bigInteger2);
    }

    public g52<C9106e> newOwnerEventFlowable(x61 x61, x61 x612) {
        bs1 bs1 = new bs1(x61, x612, getContractAddress());
        bs1.addSingleTopic(kt1.encode(NEWOWNER_EVENT));
        return newOwnerEventFlowable(bs1);
    }

    public g52<C9107f> newResolverEventFlowable(x61 x61, x61 x612) {
        bs1 bs1 = new bs1(x61, x612, getContractAddress());
        bs1.addSingleTopic(kt1.encode(NEWRESOLVER_EVENT));
        return newResolverEventFlowable(bs1);
    }

    public g52<C9108g> newTTLEventFlowable(x61 x61, x61 x612) {
        bs1 bs1 = new bs1(x61, x612, getContractAddress());
        bs1.addSingleTopic(kt1.encode(NEWTTL_EVENT));
        return newTTLEventFlowable(bs1);
    }

    public g52<C9109h> transferEventFlowable(x61 x61, x61 x612) {
        bs1 bs1 = new bs1(x61, x612, getContractAddress());
        bs1.addSingleTopic(kt1.encode(TRANSFER_EVENT));
        return transferEventFlowable(bs1);
    }

    @Deprecated
    public ENS(String str, vj7 vj7, yt6 yt6, BigInteger bigInteger, BigInteger bigInteger2) {
        super(BINARY, str, vj7, yt6, bigInteger, bigInteger2);
    }

    @Deprecated
    public static pc5<ENS> deploy(vj7 vj7, cw0 cw0, BigInteger bigInteger, BigInteger bigInteger2) {
        return gt0.deployRemoteCall(ENS.class, vj7, cw0, bigInteger, bigInteger2, BINARY, "");
    }

    public static ENS load(String str, vj7 vj7, cw0 cw0, it0 it0) {
        return new ENS(str, vj7, cw0, it0);
    }

    public ENS(String str, vj7 vj7, yt6 yt6, it0 it0) {
        super(BINARY, str, vj7, yt6, it0);
    }

    @Deprecated
    public static pc5<ENS> deploy(vj7 vj7, yt6 yt6, BigInteger bigInteger, BigInteger bigInteger2) {
        return gt0.deployRemoteCall(ENS.class, vj7, yt6, bigInteger, bigInteger2, BINARY, "");
    }

    public static ENS load(String str, vj7 vj7, yt6 yt6, it0 it0) {
        return new ENS(str, vj7, yt6, it0);
    }
}
