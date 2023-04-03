package p000;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java8.util.stream.C6065b;
import java8.util.stream.C6097i;
import org.web3j.abi.FunctionReturnDecoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.p025tx.exceptions.ContractCallException;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.exceptions.TransactionException;

/* renamed from: gt0 */
/* compiled from: Contract */
public abstract class gt0 extends hn3 {
    public static final String BIN_NOT_PROVIDED = "Bin file was not provided";
    public static final String FUNC_DEPLOY = "deploy";
    public static final BigInteger GAS_LIMIT = BigInteger.valueOf(4300000);
    public String contractAddress;
    public final String contractBinary;
    public x61 defaultBlockParameter;
    public Map<String, String> deployedAddresses;
    public it0 gasProvider;
    public au6 transactionReceipt;

    /* renamed from: gt0$b */
    /* compiled from: Contract */
    public static class C7143b {
        private final ku1 eventValues;
        private final hk3 log;

        public List<fz6> getIndexedValues() {
            return this.eventValues.getIndexedValues();
        }

        public hk3 getLog() {
            return this.log;
        }

        public List<fz6> getNonIndexedValues() {
            return this.eventValues.getNonIndexedValues();
        }

        private C7143b(ku1 ku1, hk3 hk3) {
            this.eventValues = ku1;
            this.log = hk3;
        }
    }

    public gt0(String str, String str2, vj7 vj7, yt6 yt6, it0 it0) {
        this(new pq1(vj7), str, str2, vj7, yt6, it0);
    }

    public static <S extends fz6, T> List<T> convertToNative(List<S> list) {
        ArrayList arrayList = new ArrayList();
        for (S value : list) {
            arrayList.add(value.getValue());
        }
        return arrayList;
    }

    private static <T extends gt0> T create(T t, String str, String str2, BigInteger bigInteger) throws IOException, TransactionException {
        au6 executeTransaction = t.executeTransaction(str + str2, bigInteger, FUNC_DEPLOY, true);
        String contractAddress2 = executeTransaction.getContractAddress();
        if (contractAddress2 != null) {
            t.setContractAddress(contractAddress2);
            t.setTransactionReceipt(executeTransaction);
            return t;
        }
        throw new RuntimeException("Empty contract address returned");
    }

    public static <T extends gt0> T deploy(Class<T> cls, vj7 vj7, cw0 cw0, it0 it0, String str, String str2, BigInteger bigInteger) throws RuntimeException, TransactionException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[]{String.class, vj7.class, cw0.class, it0.class});
            declaredConstructor.setAccessible(true);
            return create((gt0) declaredConstructor.newInstance(new Object[]{null, vj7, cw0, it0}), str, str2, bigInteger);
        } catch (TransactionException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static <T extends gt0> pc5<T> deployRemoteCall(Class<T> cls, vj7 vj7, cw0 cw0, BigInteger bigInteger, BigInteger bigInteger2, String str, String str2, BigInteger bigInteger3) {
        return new pc5<>(new dt0(cls, vj7, cw0, bigInteger, bigInteger2, str, str2, bigInteger3));
    }

    private List<fz6> executeCall(gd2 gd2) throws IOException {
        return FunctionReturnDecoder.decode(call(this.contractAddress, xd2.encode(gd2), this.defaultBlockParameter), gd2.getOutputParameters());
    }

    public static ku1 staticExtractEventParameters(ft1 ft1, hk3 hk3) {
        List<String> topics = hk3.getTopics();
        String encode = kt1.encode(ft1);
        if (topics == null || topics.size() == 0) {
            return null;
        }
        int i = 0;
        if (!topics.get(0).equals(encode)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<fz6> decode = FunctionReturnDecoder.decode(hk3.getData(), ft1.getNonIndexedParameters());
        List<TypeReference<fz6>> indexedParameters = ft1.getIndexedParameters();
        while (i < indexedParameters.size()) {
            int i2 = i + 1;
            arrayList.add(FunctionReturnDecoder.decodeIndexedValue(topics.get(i2), indexedParameters.get(i)));
            i = i2;
        }
        return new ku1(arrayList, decode);
    }

    public static C7143b staticExtractEventParametersWithLog(ft1 ft1, hk3 hk3) {
        ku1 staticExtractEventParameters = staticExtractEventParameters(ft1, hk3);
        if (staticExtractEventParameters == null) {
            return null;
        }
        return new C7143b(staticExtractEventParameters, hk3);
    }

    /* renamed from: executeCallMultipleValueReturn */
    public List<fz6> lambda$executeRemoteCallMultipleValueReturn$2(gd2 gd2) throws IOException {
        return executeCall(gd2);
    }

    /* renamed from: executeCallSingleValueReturn */
    public <T extends fz6> T lambda$executeRemoteCallSingleValueReturn$0(gd2 gd2) throws IOException {
        List<fz6> executeCall = executeCall(gd2);
        if (!executeCall.isEmpty()) {
            return (fz6) executeCall.get(0);
        }
        return null;
    }

    public rc5<List<fz6>> executeRemoteCallMultipleValueReturn(gd2 gd2) {
        return new rc5<>(gd2, new xs0(this, gd2));
    }

    public <T extends fz6> rc5<T> executeRemoteCallSingleValueReturn(gd2 gd2) {
        return new rc5<>(gd2, new et0(this, gd2));
    }

    public rc5<au6> executeRemoteCallTransaction(gd2 gd2) {
        return new rc5<>(gd2, new ys0(this, gd2));
    }

    /* renamed from: executeTransaction */
    public au6 lambda$executeRemoteCallTransaction$3(gd2 gd2) throws IOException, TransactionException {
        return lambda$executeRemoteCallTransaction$4(gd2, BigInteger.ZERO);
    }

    /* renamed from: extractEventParameters */
    public ku1 lambda$extractEventParameters$11(ft1 ft1, hk3 hk3) {
        return staticExtractEventParameters(ft1, hk3);
    }

    /* renamed from: extractEventParametersWithLog */
    public C7143b lambda$extractEventParametersWithLog$12(ft1 ft1, hk3 hk3) {
        return staticExtractEventParametersWithLog(ft1, hk3);
    }

    public String getContractAddress() {
        return this.contractAddress;
    }

    public String getContractBinary() {
        return this.contractBinary;
    }

    public final String getDeployedAddress(String str) {
        String str2;
        Map<String, String> map = this.deployedAddresses;
        if (map != null) {
            str2 = map.get(str);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return getStaticDeployedAddress(str);
        }
        return str2;
    }

    public BigInteger getGasPrice() {
        return this.gasProvider.getGasPrice();
    }

    public String getStaticDeployedAddress(String str) {
        return null;
    }

    public qi4<au6> getTransactionReceipt() {
        return qi4.m50603e(this.transactionReceipt);
    }

    public boolean isValid() throws IOException {
        if (this.contractBinary.equals(BIN_NOT_PROVIDED)) {
            throw new UnsupportedOperationException("Contract binary not present in contract wrapper, please generate your wrapper using -abiFile=<file>");
        } else if (!this.contractAddress.equals("")) {
            gs1 code = this.transactionManager.getCode(this.contractAddress, DefaultBlockParameterName.LATEST);
            if (code.hasError()) {
                return false;
            }
            String cleanHexPrefix = pc4.cleanHexPrefix(code.getCode());
            int indexOf = cleanHexPrefix.indexOf("a165627a7a72305820");
            if (indexOf != -1) {
                cleanHexPrefix = cleanHexPrefix.substring(0, indexOf);
            }
            if (cleanHexPrefix.isEmpty() || !this.contractBinary.contains(cleanHexPrefix)) {
                return false;
            }
            return true;
        } else {
            throw new UnsupportedOperationException("Contract binary not present, you will need to regenerate your smart contract wrapper with web3j v2.2.0+");
        }
    }

    public String resolveContractAddress(String str) {
        return this.ensResolver.resolve(str);
    }

    public void setContractAddress(String str) {
        this.contractAddress = str;
    }

    public void setDefaultBlockParameter(x61 x61) {
        this.defaultBlockParameter = x61;
    }

    public final void setDeployedAddress(String str, String str2) {
        if (this.deployedAddresses == null) {
            this.deployedAddresses = new HashMap();
        }
        this.deployedAddresses.put(str, str2);
    }

    public void setGasPrice(BigInteger bigInteger) {
        this.gasProvider = new h96(bigInteger, this.gasProvider.getGasLimit());
    }

    public void setGasProvider(it0 it0) {
        this.gasProvider = it0;
    }

    public void setTransactionReceipt(au6 au6) {
        this.transactionReceipt = au6;
    }

    public gt0(pq1 pq1, String str, String str2, vj7 vj7, yt6 yt6, it0 it0) {
        super(pq1, vj7, yt6);
        this.defaultBlockParameter = DefaultBlockParameterName.LATEST;
        this.contractAddress = resolveContractAddress(str2);
        this.contractBinary = str;
        this.gasProvider = it0;
    }

    public static <T extends gt0> pc5<T> deployRemoteCall(Class<T> cls, vj7 vj7, cw0 cw0, BigInteger bigInteger, BigInteger bigInteger2, String str, String str2) {
        return deployRemoteCall(cls, vj7, cw0, bigInteger, bigInteger2, str, str2, BigInteger.ZERO);
    }

    /* access modifiers changed from: private */
    /* renamed from: executeTransaction */
    public au6 lambda$executeRemoteCallTransaction$4(gd2 gd2, BigInteger bigInteger) throws IOException, TransactionException {
        return executeTransaction(xd2.encode(gd2), bigInteger, gd2.getName());
    }

    public <T> rc5<T> executeRemoteCallSingleValueReturn(gd2 gd2, Class<T> cls) {
        return new rc5<>(gd2, new rs0(this, gd2, cls));
    }

    public rc5<au6> executeRemoteCallTransaction(gd2 gd2, BigInteger bigInteger) {
        return new rc5<>(gd2, new ct0(this, gd2, bigInteger));
    }

    public List<ku1> extractEventParameters(ft1 ft1, au6 au6) {
        return (List) C6097i.m46413b(au6.getLogs()).mo43115b(new zs0(this, ft1)).mo43114a(new at0()).mo43116c(C6065b.m46364e());
    }

    public List<C7143b> extractEventParametersWithLog(ft1 ft1, au6 au6) {
        return (List) C6097i.m46413b(au6.getLogs()).mo43115b(new ft0(this, ft1)).mo43114a(new ss0()).mo43116c(C6065b.m46364e());
    }

    public static <T extends gt0> pc5<T> deployRemoteCall(Class<T> cls, vj7 vj7, cw0 cw0, it0 it0, String str, String str2, BigInteger bigInteger) {
        return new pc5<>(new vs0(cls, vj7, cw0, it0, str, str2, bigInteger));
    }

    public au6 executeTransaction(String str, BigInteger bigInteger, String str2) throws TransactionException, IOException {
        return executeTransaction(str, bigInteger, str2, false);
    }

    public static <T extends gt0> pc5<T> deployRemoteCall(Class<T> cls, vj7 vj7, cw0 cw0, it0 it0, String str, String str2) {
        return new pc5<>(new ts0(cls, vj7, cw0, it0, str, str2));
    }

    /* renamed from: executeCallSingleValueReturn */
    public <T extends fz6, R> R lambda$executeRemoteCallSingleValueReturn$1(gd2 gd2, Class<R> cls) throws IOException {
        R executeCallSingleValueReturn = lambda$executeRemoteCallSingleValueReturn$0(gd2);
        if (executeCallSingleValueReturn != null) {
            R value = executeCallSingleValueReturn.getValue();
            if (cls.isAssignableFrom(executeCallSingleValueReturn.getClass())) {
                return executeCallSingleValueReturn;
            }
            if (cls.isAssignableFrom(value.getClass())) {
                return value;
            }
            if (executeCallSingleValueReturn.getClass().equals(Address.class) && cls.equals(String.class)) {
                return executeCallSingleValueReturn.toString();
            }
            throw new ContractCallException("Unable to convert response: " + value + " to expected type: " + cls.getSimpleName());
        }
        throw new ContractCallException("Empty value (0x) returned from contract");
    }

    public au6 executeTransaction(String str, BigInteger bigInteger, String str2, boolean z) throws TransactionException, IOException {
        au6 send = send(this.contractAddress, str, bigInteger, this.gasProvider.getGasPrice(str2), this.gasProvider.getGasLimit(str2), z);
        if (send.isStatusOK()) {
            return send;
        }
        Object[] objArr = new Object[4];
        objArr[0] = send.getTransactionHash();
        objArr[1] = send.getStatus();
        objArr[2] = send.getGasUsedRaw() != null ? send.getGasUsed().toString() : "unknown";
        objArr[3] = xg5.extractRevertReason(send, str, this.web3j, Boolean.TRUE);
        throw new TransactionException(String.format("Transaction %s has failed with status: %s. Gas used: %s. Revert reason: '%s'.", objArr), send);
    }

    public static <T extends gt0> pc5<T> deployRemoteCall(Class<T> cls, vj7 vj7, yt6 yt6, BigInteger bigInteger, BigInteger bigInteger2, String str, String str2, BigInteger bigInteger3) {
        return new pc5<>(new ws0(cls, vj7, yt6, bigInteger, bigInteger2, str, str2, bigInteger3));
    }

    public static <T extends gt0> pc5<T> deployRemoteCall(Class<T> cls, vj7 vj7, yt6 yt6, BigInteger bigInteger, BigInteger bigInteger2, String str, String str2) {
        return deployRemoteCall(cls, vj7, yt6, bigInteger, bigInteger2, str, str2, BigInteger.ZERO);
    }

    public gt0(String str, String str2, vj7 vj7, cw0 cw0, it0 it0) {
        this(new pq1(vj7), str, str2, vj7, (yt6) new i75(vj7, cw0), it0);
    }

    public static <T extends gt0> pc5<T> deployRemoteCall(Class<T> cls, vj7 vj7, yt6 yt6, it0 it0, String str, String str2, BigInteger bigInteger) {
        return new pc5<>(new us0(cls, vj7, yt6, it0, str, str2, bigInteger));
    }

    @Deprecated
    public gt0(String str, String str2, vj7 vj7, yt6 yt6, BigInteger bigInteger, BigInteger bigInteger2) {
        this(new pq1(vj7), str, str2, vj7, yt6, (it0) new h96(bigInteger, bigInteger2));
    }

    public static <T extends gt0> T deploy(Class<T> cls, vj7 vj7, yt6 yt6, it0 it0, String str, String str2, BigInteger bigInteger) throws RuntimeException, TransactionException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[]{String.class, vj7.class, yt6.class, it0.class});
            declaredConstructor.setAccessible(true);
            return create((gt0) declaredConstructor.newInstance(new Object[]{null, vj7, yt6, it0}), str, str2, bigInteger);
        } catch (TransactionException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static <T extends gt0> pc5<T> deployRemoteCall(Class<T> cls, vj7 vj7, yt6 yt6, it0 it0, String str, String str2) {
        return new pc5<>(new bt0(cls, vj7, yt6, it0, str, str2));
    }

    @Deprecated
    public gt0(String str, String str2, vj7 vj7, cw0 cw0, BigInteger bigInteger, BigInteger bigInteger2) {
        this(str, str2, vj7, (yt6) new i75(vj7, cw0), bigInteger, bigInteger2);
    }

    @Deprecated
    public gt0(String str, vj7 vj7, yt6 yt6, BigInteger bigInteger, BigInteger bigInteger2) {
        this("", str, vj7, yt6, bigInteger, bigInteger2);
    }

    @Deprecated
    public gt0(String str, vj7 vj7, cw0 cw0, BigInteger bigInteger, BigInteger bigInteger2) {
        this("", str, vj7, (yt6) new i75(vj7, cw0), bigInteger, bigInteger2);
    }

    @Deprecated
    public static <T extends gt0> T deploy(Class<T> cls, vj7 vj7, cw0 cw0, BigInteger bigInteger, BigInteger bigInteger2, String str, String str2, BigInteger bigInteger3) throws RuntimeException, TransactionException {
        return deploy(cls, vj7, cw0, (it0) new h96(bigInteger, bigInteger2), str, str2, bigInteger3);
    }

    @Deprecated
    public static <T extends gt0> T deploy(Class<T> cls, vj7 vj7, yt6 yt6, BigInteger bigInteger, BigInteger bigInteger2, String str, String str2, BigInteger bigInteger3) throws RuntimeException, TransactionException {
        return deploy(cls, vj7, yt6, (it0) new h96(bigInteger, bigInteger2), str, str2, bigInteger3);
    }
}
