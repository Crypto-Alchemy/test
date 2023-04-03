package org.web3j.ens.contracts.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Bytes4;
import org.web3j.abi.datatypes.generated.Uint256;
import p000.gt0;

public class PublicResolver extends gt0 {
    public static final ft1 ABICHANGED_EVENT = new ft1("ABIChanged", Arrays.asList(new TypeReference[]{new TypeReference<Bytes32>(true) {
    }, new TypeReference<Uint256>(true) {
    }}));
    public static final ft1 ADDRCHANGED_EVENT = new ft1("AddrChanged", Arrays.asList(new TypeReference[]{new TypeReference<Bytes32>(true) {
    }, new TypeReference<Address>() {
    }}));
    private static final String BINARY = "608060405234801561001057600080fd5b506040516020806111dd833981016040525160008054600160a060020a03909216600160a060020a031990921691909117905561118b806100526000396000f3006080604052600436106100c45763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166301ffc9a781146100c957806310f13a8c146100ff5780632203ab561461019d57806329cd62ea146102375780632dff6941146102555780633b3b57de1461027f57806359d1d43c146102b3578063623195b014610386578063691f3431146103e657806377372213146103fe578063c3d014d61461045c578063c869023314610477578063d5fa2b00146104a8575b600080fd5b3480156100d557600080fd5b506100eb600160e060020a0319600435166104cc565b604080519115158252519081900360200190f35b34801561010b57600080fd5b5060408051602060046024803582810135601f810185900485028601850190965285855261019b95833595369560449491939091019190819084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a9998810197919650918201945092508291508401838280828437509497506106399650505050505050565b005b3480156101a957600080fd5b506101b860043560243561084d565b6040518083815260200180602001828103825283818151815260200191508051906020019080838360005b838110156101fb5781810151838201526020016101e3565b50505050905090810190601f1680156102285780820380516001836020036101000a031916815260200191505b50935050505060405180910390f35b34801561024357600080fd5b5061019b600435602435604435610959565b34801561026157600080fd5b5061026d600435610a5d565b60408051918252519081900360200190f35b34801561028b57600080fd5b50610297600435610a73565b60408051600160a060020a039092168252519081900360200190f35b3480156102bf57600080fd5b5060408051602060046024803582810135601f8101859004850286018501909652858552610311958335953695604494919390910191908190840183828082843750949750610a8e9650505050505050565b6040805160208082528351818301528351919283929083019185019080838360005b8381101561034b578181015183820152602001610333565b50505050905090810190601f1680156103785780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561039257600080fd5b50604080516020600460443581810135601f810184900484028501840190955284845261019b948235946024803595369594606494920191908190840183828082843750949750610b979650505050505050565b3480156103f257600080fd5b50610311600435610c9c565b34801561040a57600080fd5b5060408051602060046024803582810135601f810185900485028601850190965285855261019b958335953695604494919390910191908190840183828082843750949750610d409650505050505050565b34801561046857600080fd5b5061019b600435602435610e9a565b34801561048357600080fd5b5061048f600435610f7f565b6040805192835260208301919091528051918290030190f35b3480156104b457600080fd5b5061019b600435600160a060020a0360243516610f9c565b6000600160e060020a031982167f3b3b57de00000000000000000000000000000000000000000000000000000000148061052f5750600160e060020a031982167fd8389dc500000000000000000000000000000000000000000000000000000000145b806105635750600160e060020a031982167f691f343100000000000000000000000000000000000000000000000000000000145b806105975750600160e060020a031982167f2203ab5600000000000000000000000000000000000000000000000000000000145b806105cb5750600160e060020a031982167fc869023300000000000000000000000000000000000000000000000000000000145b806105ff5750600160e060020a031982167f59d1d43c00000000000000000000000000000000000000000000000000000000145b806106335750600160e060020a031982167f01ffc9a700000000000000000000000000000000000000000000000000000000145b92915050565b6000805460408051600080516020611140833981519152815260048101879052905186933393600160a060020a0316926302571be39260248083019360209383900390910190829087803b15801561069057600080fd5b505af11580156106a4573d6000803e3d6000fd5b505050506040513d60208110156106ba57600080fd5b5051600160a060020a0316146106cf57600080fd5b6000848152600160209081526040918290209151855185936005019287929182918401908083835b602083106107165780518252601f1990920191602091820191016106f7565b51815160209384036101000a6000190180199092169116179052920194855250604051938490038101909320845161075795919491909101925090506110a4565b50826040518082805190602001908083835b602083106107885780518252601f199092019160209182019101610769565b51815160209384036101000a60001901801990921691161790526040805192909401829003822081835289518383015289519096508a95507fd8c9334b1a9c2f9da342a0a2b32629c1a229b6445dad78947f674b44444a7550948a94508392908301919085019080838360005b8381101561080d5781810151838201526020016107f5565b50505050905090810190601f16801561083a5780820380516001836020036101000a031916815260200191505b509250505060405180910390a350505050565b60008281526001602081905260409091206060905b83831161094c578284161580159061089b5750600083815260068201602052604081205460026000196101006001841615020190911604115b1561094157600083815260068201602090815260409182902080548351601f6002600019610100600186161502019093169290920491820184900484028101840190945280845290918301828280156109355780601f1061090a57610100808354040283529160200191610935565b820191906000526020600020905b81548152906001019060200180831161091857829003601f168201915b50505050509150610951565b600290920291610862565b600092505b509250929050565b6000805460408051600080516020611140833981519152815260048101879052905186933393600160a060020a0316926302571be39260248083019360209383900390910190829087803b1580156109b057600080fd5b505af11580156109c4573d6000803e3d6000fd5b505050506040513d60208110156109da57600080fd5b5051600160a060020a0316146109ef57600080fd5b604080518082018252848152602080820185815260008881526001835284902092516003840155516004909201919091558151858152908101849052815186927f1d6f5e03d3f63eb58751986629a5439baee5079ff04f345becb66e23eb154e46928290030190a250505050565b6000908152600160208190526040909120015490565b600090815260016020526040902054600160a060020a031690565b600082815260016020908152604091829020915183516060936005019285929182918401908083835b60208310610ad65780518252601f199092019160209182019101610ab7565b518151600019602094850361010090810a820192831692199390931691909117909252949092019687526040805197889003820188208054601f6002600183161590980290950116959095049283018290048202880182019052818752929450925050830182828015610b8a5780601f10610b5f57610100808354040283529160200191610b8a565b820191906000526020600020905b815481529060010190602001808311610b6d57829003601f168201915b5050505050905092915050565b6000805460408051600080516020611140833981519152815260048101879052905186933393600160a060020a0316926302571be39260248083019360209383900390910190829087803b158015610bee57600080fd5b505af1158015610c02573d6000803e3d6000fd5b505050506040513d6020811015610c1857600080fd5b5051600160a060020a031614610c2d57600080fd5b6000198301831615610c3e57600080fd5b600084815260016020908152604080832086845260060182529091208351610c68928501906110a4565b50604051839085907faa121bbeef5f32f5961a2a28966e769023910fc9479059ee3495d4c1a696efe390600090a350505050565b6000818152600160208181526040928390206002908101805485516000199582161561010002959095011691909104601f81018390048302840183019094528383526060939091830182828015610d345780601f10610d0957610100808354040283529160200191610d34565b820191906000526020600020905b815481529060010190602001808311610d1757829003601f168201915b50505050509050919050565b6000805460408051600080516020611140833981519152815260048101869052905185933393600160a060020a0316926302571be39260248083019360209383900390910190829087803b158015610d9757600080fd5b505af1158015610dab573d6000803e3d6000fd5b505050506040513d6020811015610dc157600080fd5b5051600160a060020a031614610dd657600080fd5b60008381526001602090815260409091208351610dfb926002909201918501906110a4565b50604080516020808252845181830152845186937fb7d29e911041e8d9b843369e890bcb72c9388692ba48b65ac54e7214c4c348f79387939092839283019185019080838360005b83811015610e5b578181015183820152602001610e43565b50505050905090810190601f168015610e885780820380516001836020036101000a031916815260200191505b509250505060405180910390a2505050565b6000805460408051600080516020611140833981519152815260048101869052905185933393600160a060020a0316926302571be39260248083019360209383900390910190829087803b158015610ef157600080fd5b505af1158015610f05573d6000803e3d6000fd5b505050506040513d6020811015610f1b57600080fd5b5051600160a060020a031614610f3057600080fd5b6000838152600160208181526040928390209091018490558151848152915185927f0424b6fe0d9c3bdbece0e7879dc241bb0c22e900be8b6c168b4ee08bd9bf83bc92908290030190a2505050565b600090815260016020526040902060038101546004909101549091565b6000805460408051600080516020611140833981519152815260048101869052905185933393600160a060020a0316926302571be39260248083019360209383900390910190829087803b158015610ff357600080fd5b505af1158015611007573d6000803e3d6000fd5b505050506040513d602081101561101d57600080fd5b5051600160a060020a03161461103257600080fd5b600083815260016020908152604091829020805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0386169081179091558251908152915185927f52d7d861f09ab3d26239d492e8968629f95e9e318cf0b73bfddc441522a15fd292908290030190a2505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106110e557805160ff1916838001178555611112565b82800160010185558215611112579182015b828111156111125782518255916020019190600101906110f7565b5061111e929150611122565b5090565b61113c91905b8082111561111e5760008155600101611128565b90560002571be300000000000000000000000000000000000000000000000000000000a165627a7a72305820c27de7e59fab6007ff39ba74a6a8d7e8a5eac02905b0a26fee254f94ff3ae4b60029";
    public static final ft1 CONTENTCHANGED_EVENT = new ft1("ContentChanged", Arrays.asList(new TypeReference[]{new TypeReference<Bytes32>(true) {
    }, new TypeReference<Bytes32>() {
    }}));
    public static final String FUNC_ABI = "ABI";
    public static final String FUNC_ADDR = "addr";
    public static final String FUNC_CONTENT = "content";
    public static final String FUNC_NAME = "name";
    public static final String FUNC_PUBKEY = "pubkey";
    public static final String FUNC_SETABI = "setABI";
    public static final String FUNC_SETADDR = "setAddr";
    public static final String FUNC_SETCONTENT = "setContent";
    public static final String FUNC_SETNAME = "setName";
    public static final String FUNC_SETPUBKEY = "setPubkey";
    public static final String FUNC_SETTEXT = "setText";
    public static final String FUNC_SUPPORTSINTERFACE = "supportsInterface";
    public static final String FUNC_TEXT = "text";
    public static final ft1 NAMECHANGED_EVENT = new ft1("NameChanged", Arrays.asList(new TypeReference[]{new TypeReference<Bytes32>(true) {
    }, new TypeReference<Utf8String>() {
    }}));
    public static final ft1 PUBKEYCHANGED_EVENT = new ft1("PubkeyChanged", Arrays.asList(new TypeReference[]{new TypeReference<Bytes32>(true) {
    }, new TypeReference<Bytes32>() {
    }, new TypeReference<Bytes32>() {
    }}));
    public static final ft1 TEXTCHANGED_EVENT = new ft1("TextChanged", Arrays.asList(new TypeReference[]{new TypeReference<Bytes32>(true) {
    }, new TypeReference<Utf8String>(true) {
    }, new TypeReference<Utf8String>() {
    }}));

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$a */
    public class C9133a implements Callable<ty6<BigInteger, byte[]>> {
        public final /* synthetic */ gd2 val$function;

        public C9133a(gd2 gd2) {
            this.val$function = gd2;
        }

        public ty6<BigInteger, byte[]> call() throws Exception {
            List access$000 = PublicResolver.this.lambda$executeRemoteCallMultipleValueReturn$2(this.val$function);
            return new ty6<>((BigInteger) ((fz6) access$000.get(0)).getValue(), (byte[]) ((fz6) access$000.get(1)).getValue());
        }
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$b */
    public class C9134b implements Callable<ty6<byte[], byte[]>> {
        public final /* synthetic */ gd2 val$function;

        public C9134b(gd2 gd2) {
            this.val$function = gd2;
        }

        public ty6<byte[], byte[]> call() throws Exception {
            List access$100 = PublicResolver.this.lambda$executeRemoteCallMultipleValueReturn$2(this.val$function);
            return new ty6<>((byte[]) ((fz6) access$100.get(0)).getValue(), (byte[]) ((fz6) access$100.get(1)).getValue());
        }
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$c */
    public class C9135c implements jd2<hk3, C9142j> {
        public C9135c() {
        }

        public C9142j apply(hk3 hk3) {
            gt0.C7143b access$200 = PublicResolver.this.lambda$extractEventParametersWithLog$12(PublicResolver.ADDRCHANGED_EVENT, hk3);
            C9142j jVar = new C9142j();
            jVar.log = hk3;
            jVar.node = (byte[]) access$200.getIndexedValues().get(0).getValue();
            jVar.f43952a = (String) access$200.getNonIndexedValues().get(0).getValue();
            return jVar;
        }
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$d */
    public class C9136d implements jd2<hk3, C9143k> {
        public C9136d() {
        }

        public C9143k apply(hk3 hk3) {
            gt0.C7143b access$300 = PublicResolver.this.lambda$extractEventParametersWithLog$12(PublicResolver.CONTENTCHANGED_EVENT, hk3);
            C9143k kVar = new C9143k();
            kVar.log = hk3;
            kVar.node = (byte[]) access$300.getIndexedValues().get(0).getValue();
            kVar.hash = (byte[]) access$300.getNonIndexedValues().get(0).getValue();
            return kVar;
        }
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$e */
    public class C9137e implements jd2<hk3, C9144l> {
        public C9137e() {
        }

        public C9144l apply(hk3 hk3) {
            gt0.C7143b access$400 = PublicResolver.this.lambda$extractEventParametersWithLog$12(PublicResolver.NAMECHANGED_EVENT, hk3);
            C9144l lVar = new C9144l();
            lVar.log = hk3;
            lVar.node = (byte[]) access$400.getIndexedValues().get(0).getValue();
            lVar.name = (String) access$400.getNonIndexedValues().get(0).getValue();
            return lVar;
        }
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$f */
    public class C9138f implements jd2<hk3, C9141i> {
        public C9138f() {
        }

        public C9141i apply(hk3 hk3) {
            gt0.C7143b access$500 = PublicResolver.this.lambda$extractEventParametersWithLog$12(PublicResolver.ABICHANGED_EVENT, hk3);
            C9141i iVar = new C9141i();
            iVar.log = hk3;
            iVar.node = (byte[]) access$500.getIndexedValues().get(0).getValue();
            iVar.contentType = (BigInteger) access$500.getIndexedValues().get(1).getValue();
            return iVar;
        }
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$g */
    public class C9139g implements jd2<hk3, C9145m> {
        public C9139g() {
        }

        public C9145m apply(hk3 hk3) {
            gt0.C7143b access$600 = PublicResolver.this.lambda$extractEventParametersWithLog$12(PublicResolver.PUBKEYCHANGED_EVENT, hk3);
            C9145m mVar = new C9145m();
            mVar.log = hk3;
            mVar.node = (byte[]) access$600.getIndexedValues().get(0).getValue();
            mVar.f43953x = (byte[]) access$600.getNonIndexedValues().get(0).getValue();
            mVar.f43954y = (byte[]) access$600.getNonIndexedValues().get(1).getValue();
            return mVar;
        }
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$h */
    public class C9140h implements jd2<hk3, C9146n> {
        public C9140h() {
        }

        public C9146n apply(hk3 hk3) {
            gt0.C7143b access$700 = PublicResolver.this.lambda$extractEventParametersWithLog$12(PublicResolver.TEXTCHANGED_EVENT, hk3);
            C9146n nVar = new C9146n();
            nVar.log = hk3;
            nVar.node = (byte[]) access$700.getIndexedValues().get(0).getValue();
            nVar.indexedKey = (byte[]) access$700.getIndexedValues().get(1).getValue();
            nVar.key = (String) access$700.getNonIndexedValues().get(0).getValue();
            return nVar;
        }
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$i */
    public static class C9141i {
        public BigInteger contentType;
        public hk3 log;
        public byte[] node;
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$j */
    public static class C9142j {

        /* renamed from: a */
        public String f43952a;
        public hk3 log;
        public byte[] node;
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$k */
    public static class C9143k {
        public byte[] hash;
        public hk3 log;
        public byte[] node;
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$l */
    public static class C9144l {
        public hk3 log;
        public String name;
        public byte[] node;
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$m */
    public static class C9145m {
        public hk3 log;
        public byte[] node;

        /* renamed from: x */
        public byte[] f43953x;

        /* renamed from: y */
        public byte[] f43954y;
    }

    /* renamed from: org.web3j.ens.contracts.generated.PublicResolver$n */
    public static class C9146n {
        public byte[] indexedKey;
        public String key;
        public hk3 log;
        public byte[] node;
    }

    @Deprecated
    public PublicResolver(String str, vj7 vj7, cw0 cw0, BigInteger bigInteger, BigInteger bigInteger2) {
        super(BINARY, str, vj7, cw0, bigInteger, bigInteger2);
    }

    public static pc5<PublicResolver> deploy(vj7 vj7, cw0 cw0, it0 it0, String str) {
        return gt0.deployRemoteCall(PublicResolver.class, vj7, cw0, it0, BINARY, xd2.encodeConstructor(Arrays.asList(new fz6[]{new Address(str)})));
    }

    @Deprecated
    public static PublicResolver load(String str, vj7 vj7, cw0 cw0, BigInteger bigInteger, BigInteger bigInteger2) {
        return new PublicResolver(str, vj7, cw0, bigInteger, bigInteger2);
    }

    public pc5<ty6<BigInteger, byte[]>> ABI(byte[] bArr, BigInteger bigInteger) {
        return new pc5<>(new C9133a(new gd2(FUNC_ABI, Arrays.asList(new fz6[]{new Bytes32(bArr), new Uint256(bigInteger)}), Arrays.asList(new TypeReference[]{new TypeReference<Uint256>() {
        }, new TypeReference<DynamicBytes>() {
        }}))));
    }

    public g52<C9141i> aBIChangedEventFlowable(bs1 bs1) {
        return this.web3j.ethLogFlowable(bs1).mo42753D(new C9138f());
    }

    public pc5<String> addr(byte[] bArr) {
        return executeRemoteCallSingleValueReturn(new gd2(FUNC_ADDR, Arrays.asList(new fz6[]{new Bytes32(bArr)}), Arrays.asList(new TypeReference[]{new TypeReference<Address>() {
        }})), String.class);
    }

    public g52<C9142j> addrChangedEventFlowable(bs1 bs1) {
        return this.web3j.ethLogFlowable(bs1).mo42753D(new C9135c());
    }

    public pc5<byte[]> content(byte[] bArr) {
        return executeRemoteCallSingleValueReturn(new gd2(FUNC_CONTENT, Arrays.asList(new fz6[]{new Bytes32(bArr)}), Arrays.asList(new TypeReference[]{new TypeReference<Bytes32>() {
        }})), byte[].class);
    }

    public g52<C9143k> contentChangedEventFlowable(bs1 bs1) {
        return this.web3j.ethLogFlowable(bs1).mo42753D(new C9136d());
    }

    public List<C9141i> getABIChangedEvents(au6 au6) {
        List<gt0.C7143b> extractEventParametersWithLog = extractEventParametersWithLog(ABICHANGED_EVENT, au6);
        ArrayList arrayList = new ArrayList(extractEventParametersWithLog.size());
        for (gt0.C7143b next : extractEventParametersWithLog) {
            C9141i iVar = new C9141i();
            iVar.log = next.getLog();
            iVar.node = (byte[]) next.getIndexedValues().get(0).getValue();
            iVar.contentType = (BigInteger) next.getIndexedValues().get(1).getValue();
            arrayList.add(iVar);
        }
        return arrayList;
    }

    public List<C9142j> getAddrChangedEvents(au6 au6) {
        List<gt0.C7143b> extractEventParametersWithLog = extractEventParametersWithLog(ADDRCHANGED_EVENT, au6);
        ArrayList arrayList = new ArrayList(extractEventParametersWithLog.size());
        for (gt0.C7143b next : extractEventParametersWithLog) {
            C9142j jVar = new C9142j();
            jVar.log = next.getLog();
            jVar.node = (byte[]) next.getIndexedValues().get(0).getValue();
            jVar.f43952a = (String) next.getNonIndexedValues().get(0).getValue();
            arrayList.add(jVar);
        }
        return arrayList;
    }

    public List<C9143k> getContentChangedEvents(au6 au6) {
        List<gt0.C7143b> extractEventParametersWithLog = extractEventParametersWithLog(CONTENTCHANGED_EVENT, au6);
        ArrayList arrayList = new ArrayList(extractEventParametersWithLog.size());
        for (gt0.C7143b next : extractEventParametersWithLog) {
            C9143k kVar = new C9143k();
            kVar.log = next.getLog();
            kVar.node = (byte[]) next.getIndexedValues().get(0).getValue();
            kVar.hash = (byte[]) next.getNonIndexedValues().get(0).getValue();
            arrayList.add(kVar);
        }
        return arrayList;
    }

    public List<C9144l> getNameChangedEvents(au6 au6) {
        List<gt0.C7143b> extractEventParametersWithLog = extractEventParametersWithLog(NAMECHANGED_EVENT, au6);
        ArrayList arrayList = new ArrayList(extractEventParametersWithLog.size());
        for (gt0.C7143b next : extractEventParametersWithLog) {
            C9144l lVar = new C9144l();
            lVar.log = next.getLog();
            lVar.node = (byte[]) next.getIndexedValues().get(0).getValue();
            lVar.name = (String) next.getNonIndexedValues().get(0).getValue();
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public List<C9145m> getPubkeyChangedEvents(au6 au6) {
        List<gt0.C7143b> extractEventParametersWithLog = extractEventParametersWithLog(PUBKEYCHANGED_EVENT, au6);
        ArrayList arrayList = new ArrayList(extractEventParametersWithLog.size());
        for (gt0.C7143b next : extractEventParametersWithLog) {
            C9145m mVar = new C9145m();
            mVar.log = next.getLog();
            mVar.node = (byte[]) next.getIndexedValues().get(0).getValue();
            mVar.f43953x = (byte[]) next.getNonIndexedValues().get(0).getValue();
            mVar.f43954y = (byte[]) next.getNonIndexedValues().get(1).getValue();
            arrayList.add(mVar);
        }
        return arrayList;
    }

    public List<C9146n> getTextChangedEvents(au6 au6) {
        List<gt0.C7143b> extractEventParametersWithLog = extractEventParametersWithLog(TEXTCHANGED_EVENT, au6);
        ArrayList arrayList = new ArrayList(extractEventParametersWithLog.size());
        for (gt0.C7143b next : extractEventParametersWithLog) {
            C9146n nVar = new C9146n();
            nVar.log = next.getLog();
            nVar.node = (byte[]) next.getIndexedValues().get(0).getValue();
            nVar.indexedKey = (byte[]) next.getIndexedValues().get(1).getValue();
            nVar.key = (String) next.getNonIndexedValues().get(0).getValue();
            arrayList.add(nVar);
        }
        return arrayList;
    }

    public pc5<String> name(byte[] bArr) {
        return executeRemoteCallSingleValueReturn(new gd2(FUNC_NAME, Arrays.asList(new fz6[]{new Bytes32(bArr)}), Arrays.asList(new TypeReference[]{new TypeReference<Utf8String>() {
        }})), String.class);
    }

    public g52<C9144l> nameChangedEventFlowable(bs1 bs1) {
        return this.web3j.ethLogFlowable(bs1).mo42753D(new C9137e());
    }

    public pc5<ty6<byte[], byte[]>> pubkey(byte[] bArr) {
        return new pc5<>(new C9134b(new gd2(FUNC_PUBKEY, Arrays.asList(new fz6[]{new Bytes32(bArr)}), Arrays.asList(new TypeReference[]{new TypeReference<Bytes32>() {
        }, new TypeReference<Bytes32>() {
        }}))));
    }

    public g52<C9145m> pubkeyChangedEventFlowable(bs1 bs1) {
        return this.web3j.ethLogFlowable(bs1).mo42753D(new C9139g());
    }

    public pc5<au6> setABI(byte[] bArr, BigInteger bigInteger, byte[] bArr2) {
        return executeRemoteCallTransaction(new gd2(FUNC_SETABI, Arrays.asList(new fz6[]{new Bytes32(bArr), new Uint256(bigInteger), new DynamicBytes(bArr2)}), Collections.emptyList()));
    }

    public pc5<au6> setAddr(byte[] bArr, String str) {
        return executeRemoteCallTransaction(new gd2(FUNC_SETADDR, Arrays.asList(new fz6[]{new Bytes32(bArr), new Address(str)}), Collections.emptyList()));
    }

    public pc5<au6> setContent(byte[] bArr, byte[] bArr2) {
        return executeRemoteCallTransaction(new gd2(FUNC_SETCONTENT, Arrays.asList(new fz6[]{new Bytes32(bArr), new Bytes32(bArr2)}), Collections.emptyList()));
    }

    public pc5<au6> setName(byte[] bArr, String str) {
        return executeRemoteCallTransaction(new gd2(FUNC_SETNAME, Arrays.asList(new fz6[]{new Bytes32(bArr), new Utf8String(str)}), Collections.emptyList()));
    }

    public pc5<au6> setPubkey(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return executeRemoteCallTransaction(new gd2(FUNC_SETPUBKEY, Arrays.asList(new fz6[]{new Bytes32(bArr), new Bytes32(bArr2), new Bytes32(bArr3)}), Collections.emptyList()));
    }

    public pc5<au6> setText(byte[] bArr, String str, String str2) {
        return executeRemoteCallTransaction(new gd2(FUNC_SETTEXT, Arrays.asList(new fz6[]{new Bytes32(bArr), new Utf8String(str), new Utf8String(str2)}), Collections.emptyList()));
    }

    public pc5<Boolean> supportsInterface(byte[] bArr) {
        return executeRemoteCallSingleValueReturn(new gd2(FUNC_SUPPORTSINTERFACE, Arrays.asList(new fz6[]{new Bytes4(bArr)}), Arrays.asList(new TypeReference[]{new TypeReference<Bool>() {
        }})), Boolean.class);
    }

    public pc5<String> text(byte[] bArr, String str) {
        return executeRemoteCallSingleValueReturn(new gd2(FUNC_TEXT, Arrays.asList(new fz6[]{new Bytes32(bArr), new Utf8String(str)}), Arrays.asList(new TypeReference[]{new TypeReference<Utf8String>() {
        }})), String.class);
    }

    public g52<C9146n> textChangedEventFlowable(bs1 bs1) {
        return this.web3j.ethLogFlowable(bs1).mo42753D(new C9140h());
    }

    public PublicResolver(String str, vj7 vj7, cw0 cw0, it0 it0) {
        super(BINARY, str, vj7, cw0, it0);
    }

    @Deprecated
    public static PublicResolver load(String str, vj7 vj7, yt6 yt6, BigInteger bigInteger, BigInteger bigInteger2) {
        return new PublicResolver(str, vj7, yt6, bigInteger, bigInteger2);
    }

    public g52<C9141i> aBIChangedEventFlowable(x61 x61, x61 x612) {
        bs1 bs1 = new bs1(x61, x612, getContractAddress());
        bs1.addSingleTopic(kt1.encode(ABICHANGED_EVENT));
        return aBIChangedEventFlowable(bs1);
    }

    public g52<C9142j> addrChangedEventFlowable(x61 x61, x61 x612) {
        bs1 bs1 = new bs1(x61, x612, getContractAddress());
        bs1.addSingleTopic(kt1.encode(ADDRCHANGED_EVENT));
        return addrChangedEventFlowable(bs1);
    }

    public g52<C9143k> contentChangedEventFlowable(x61 x61, x61 x612) {
        bs1 bs1 = new bs1(x61, x612, getContractAddress());
        bs1.addSingleTopic(kt1.encode(CONTENTCHANGED_EVENT));
        return contentChangedEventFlowable(bs1);
    }

    public g52<C9144l> nameChangedEventFlowable(x61 x61, x61 x612) {
        bs1 bs1 = new bs1(x61, x612, getContractAddress());
        bs1.addSingleTopic(kt1.encode(NAMECHANGED_EVENT));
        return nameChangedEventFlowable(bs1);
    }

    public g52<C9145m> pubkeyChangedEventFlowable(x61 x61, x61 x612) {
        bs1 bs1 = new bs1(x61, x612, getContractAddress());
        bs1.addSingleTopic(kt1.encode(PUBKEYCHANGED_EVENT));
        return pubkeyChangedEventFlowable(bs1);
    }

    public g52<C9146n> textChangedEventFlowable(x61 x61, x61 x612) {
        bs1 bs1 = new bs1(x61, x612, getContractAddress());
        bs1.addSingleTopic(kt1.encode(TEXTCHANGED_EVENT));
        return textChangedEventFlowable(bs1);
    }

    @Deprecated
    public PublicResolver(String str, vj7 vj7, yt6 yt6, BigInteger bigInteger, BigInteger bigInteger2) {
        super(BINARY, str, vj7, yt6, bigInteger, bigInteger2);
    }

    public static pc5<PublicResolver> deploy(vj7 vj7, yt6 yt6, it0 it0, String str) {
        return gt0.deployRemoteCall(PublicResolver.class, vj7, yt6, it0, BINARY, xd2.encodeConstructor(Arrays.asList(new fz6[]{new Address(str)})));
    }

    public static PublicResolver load(String str, vj7 vj7, cw0 cw0, it0 it0) {
        return new PublicResolver(str, vj7, cw0, it0);
    }

    public PublicResolver(String str, vj7 vj7, yt6 yt6, it0 it0) {
        super(BINARY, str, vj7, yt6, it0);
    }

    public static PublicResolver load(String str, vj7 vj7, yt6 yt6, it0 it0) {
        return new PublicResolver(str, vj7, yt6, it0);
    }

    @Deprecated
    public static pc5<PublicResolver> deploy(vj7 vj7, cw0 cw0, BigInteger bigInteger, BigInteger bigInteger2, String str) {
        return gt0.deployRemoteCall(PublicResolver.class, vj7, cw0, bigInteger, bigInteger2, BINARY, xd2.encodeConstructor(Arrays.asList(new fz6[]{new Address(str)})));
    }

    @Deprecated
    public static pc5<PublicResolver> deploy(vj7 vj7, yt6 yt6, BigInteger bigInteger, BigInteger bigInteger2, String str) {
        return gt0.deployRemoteCall(PublicResolver.class, vj7, yt6, bigInteger, bigInteger2, BINARY, xd2.encodeConstructor(Arrays.asList(new fz6[]{new Address(str)})));
    }
}
