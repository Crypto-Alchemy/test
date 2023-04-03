package net.safemoon.androidwallet;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.TypeReference;
import org.web3j.abi.Utils;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.generated.Uint256;

public class SafeswapTradeRouter extends gt0 {

    /* renamed from: a */
    public static final ft1 f41220a = new ft1("NewFeeJar", Arrays.asList(new TypeReference[]{new TypeReference<Address>() {
    }}));

    /* renamed from: net.safemoon.androidwallet.SafeswapTradeRouter$10 */
    class C811110 extends TypeReference<Bool> {
    }

    /* renamed from: net.safemoon.androidwallet.SafeswapTradeRouter$3 */
    class C81123 extends TypeReference<Address> {
    }

    /* renamed from: net.safemoon.androidwallet.SafeswapTradeRouter$4 */
    class C81134 extends TypeReference<Address> {
    }

    /* renamed from: net.safemoon.androidwallet.SafeswapTradeRouter$5 */
    class C81145 extends TypeReference<Uint256> {
    }

    /* renamed from: net.safemoon.androidwallet.SafeswapTradeRouter$6 */
    class C81156 extends TypeReference<Uint256> {
    }

    /* renamed from: net.safemoon.androidwallet.SafeswapTradeRouter$8 */
    class C81178 extends TypeReference<Uint256> {
    }

    /* renamed from: net.safemoon.androidwallet.SafeswapTradeRouter$9 */
    class C81189 extends TypeReference<Address> {
    }

    public static class Trade extends DynamicStruct {

        /* renamed from: a */
        public BigInteger f41222a;

        /* renamed from: b */
        public BigInteger f41223b;

        /* renamed from: c */
        public List<Address> f41224c;

        /* renamed from: d */
        public Address f41225d;

        /* renamed from: e */
        public BigInteger f41226e;

        public Trade(BigInteger bigInteger, BigInteger bigInteger2, List<Address> list, String str, BigInteger bigInteger3) {
            super(new Uint256(bigInteger), new Uint256(bigInteger2), new DynamicArray(Address.class, list), new Address(str), new Uint256(bigInteger3));
            this.f41222a = bigInteger;
            this.f41223b = bigInteger2;
            this.f41224c = list;
            this.f41225d = new Address(str);
            this.f41226e = bigInteger3;
        }

        public String getTypeAsString() {
            return super.getTypeAsString().replace("dynamicarray", "address[]");
        }
    }

    public SafeswapTradeRouter(String str, vj7 vj7, cw0 cw0, it0 it0) {
        super("60a060405260405162000dc838038062000dc883398101604081905262000026916200044a565b82816200005560017f360894a13ba1a3210667c828492db98dca3e2076cc3735a920a3ca505d382bbd6200052a565b60008051602062000d818339815191521462000075576200007562000550565b62000083828260006200013c565b50620000b3905060017fb53127684a568b3173ae13b9f8a6016e243e63b6e8ee1178d6a717850b5d61046200052a565b60008051602062000d6183398151915214620000d357620000d362000550565b6001600160a01b038216608081905260008051602062000d618339815191528381556040805160008152602081019390935290917f7e644d79422f17c01e4894b5f4f588d331ebfa28653d42ae832dc59e38c9798f910160405180910390a150505050620005b9565b620001478362000179565b600082511180620001555750805b156200017457620001728383620001bb60201b620002681760201c565b505b505050565b6200018481620001ea565b6040516001600160a01b038216907fbc7cd75a20ee27fd9adebab32041f755214dbc6bffa90cc0225b39da2e5c2d3b90600090a250565b6060620001e3838360405180606001604052806027815260200162000da160279139620002b2565b9392505050565b62000200816200039860201b620002941760201c565b620002685760405162461bcd60e51b815260206004820152602d60248201527f455243313936373a206e657720696d706c656d656e746174696f6e206973206e60448201526c1bdd08184818dbdb9d1c9858dd609a1b60648201526084015b60405180910390fd5b806200029160008051602062000d8183398151915260001b620003a760201b6200020d1760201c565b80546001600160a01b0319166001600160a01b039290921691909117905550565b60606001600160a01b0384163b6200031c5760405162461bcd60e51b815260206004820152602660248201527f416464726573733a2064656c65676174652063616c6c20746f206e6f6e2d636f6044820152651b9d1c9858dd60d21b60648201526084016200025f565b600080856001600160a01b03168560405162000339919062000566565b600060405180830381855af49150503d806000811462000376576040519150601f19603f3d011682016040523d82523d6000602084013e6200037b565b606091505b5090925090506200038e828286620003aa565b9695505050505050565b6001600160a01b03163b151590565b90565b60608315620003bb575081620001e3565b825115620003cc5782518084602001fd5b8160405162461bcd60e51b81526004016200025f919062000584565b80516001600160a01b03811681146200040057600080fd5b919050565b634e487b7160e01b600052604160045260246000fd5b60005b83811015620004385781810151838201526020016200041e565b83811115620001725750506000910152565b6000806000606084860312156200046057600080fd5b6200046b84620003e8565b92506200047b60208501620003e8565b60408501519092506001600160401b03808211156200049957600080fd5b818601915086601f830112620004ae57600080fd5b815181811115620004c357620004c362000405565b604051601f8201601f19908116603f01168101908382118183101715620004ee57620004ee62000405565b816040528281528960208487010111156200050857600080fd5b6200051b8360208301602088016200041b565b80955050505050509250925092565b6000828210156200054b57634e487b7160e01b600052601160045260246000fd5b500390565b634e487b7160e01b600052600160045260246000fd5b600082516200057a8184602087016200041b565b9190910192915050565b6020815260008251806020840152620005a58160408501602087016200041b565b601f01601f19169190910160400192915050565b60805161076a620005f76000396000818160f80152818161014f015281816101d20152818161021d0152818161024601526102ae015261076a6000f3fe6080604052600436106100435760003560e01c80633659cfe61461005a5780634f1ef2861461007a5780635c60da1b1461008d578063f851a440146100be57610052565b36610052576100506100d3565b005b6100506100d3565b34801561006657600080fd5b506100506100753660046105f4565b6100ed565b61005061008836600461060f565b610144565b34801561009957600080fd5b506100a26101c5565b6040516001600160a01b03909116815260200160405180910390f35b3480156100ca57600080fd5b506100a2610210565b6100db6102a3565b6100eb6100e6610352565b610385565b565b336001600160a01b037f000000000000000000000000000000000000000000000000000000000000000016141561013c57610139816040518060200160405280600081525060006103a9565b50565b6101396100d3565b336001600160a01b037f00000000000000000000000000000000000000000000000000000000000000001614156101bd576101b88383838080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250600192506103a9915050565b505050565b6101b86100d3565b6000336001600160a01b037f000000000000000000000000000000000000000000000000000000000000000016141561020557610200610352565b905090565b61020d6100d3565b90565b6000336001600160a01b037f000000000000000000000000000000000000000000000000000000000000000016141561020557507f000000000000000000000000000000000000000000000000000000000000000090565b606061028d838360405180606001604052806027815260200161070e602791396103d4565b9392505050565b6001600160a01b03163b151590565b336001600160a01b037f00000000000000000000000000000000000000000000000000000000000000001614156100eb5760405162461bcd60e51b815260206004820152604260248201527f5472616e73706172656e745570677261646561626c6550726f78793a2061646d60448201527f696e2063616e6e6f742066616c6c6261636b20746f2070726f78792074617267606482015261195d60f21b608482015260a4015b60405180910390fd5b60006102007f360894a13ba1a3210667c828492db98dca3e2076cc3735a920a3ca505d382bbc546001600160a01b031690565b3660008037600080366000845af43d6000803e8080156103a4573d6000f35b3d6000fd5b6103b2836104b1565b6000825111806103bf5750805b156101b8576103ce8383610268565b50505050565b60606001600160a01b0384163b61043c5760405162461bcd60e51b815260206004820152602660248201527f416464726573733a2064656c65676174652063616c6c20746f206e6f6e2d636f6044820152651b9d1c9858dd60d21b6064820152608401610349565b600080856001600160a01b03168560405161045791906106be565b600060405180830381855af49150503d8060008114610492576040519150601f19603f3d011682016040523d82523d6000602084013e610497565b606091505b50915091506104a78282866104f1565b9695505050505050565b6104ba8161052a565b6040516001600160a01b038216907fbc7cd75a20ee27fd9adebab32041f755214dbc6bffa90cc0225b39da2e5c2d3b90600090a250565b6060831561050057508161028d565b8251156105105782518084602001fd5b8160405162461bcd60e51b815260040161034991906106da565b6001600160a01b0381163b6105975760405162461bcd60e51b815260206004820152602d60248201527f455243313936373a206e657720696d706c656d656e746174696f6e206973206e60448201526c1bdd08184818dbdb9d1c9858dd609a1b6064820152608401610349565b7f360894a13ba1a3210667c828492db98dca3e2076cc3735a920a3ca505d382bbc80546001600160a01b0319166001600160a01b0392909216919091179055565b80356001600160a01b03811681146105ef57600080fd5b919050565b60006020828403121561060657600080fd5b61028d826105d8565b60008060006040848603121561062457600080fd5b61062d846105d8565b9250602084013567ffffffffffffffff8082111561064a57600080fd5b818601915086601f83011261065e57600080fd5b81358181111561066d57600080fd5b87602082850101111561067f57600080fd5b6020830194508093505050509250925092565b60005b838110156106ad578181015183820152602001610695565b838111156103ce5750506000910152565b600082516106d0818460208701610692565b9190910192915050565b60208152600082518060208401526106f9816040850160208701610692565b601f01601f1916919091016040019291505056fe416464726573733a206c6f772d6c6576656c2064656c65676174652063616c6c206661696c6564a2646970667358221220df7c3a59236e9c0807dba996c5ce2edaf778f89517c7e1a40b27d38763fe2e5964736f6c634300080b0033b53127684a568b3173ae13b9f8a6016e243e63b6e8ee1178d6a717850b5d6103360894a13ba1a3210667c828492db98dca3e2076cc3735a920a3ca505d382bbc416464726573733a206c6f772d6c6576656c2064656c65676174652063616c6c206661696c6564000000000000000000000000318a89db781d5609a879e9ec7fffbf5100a56d6100000000000000000000000061851bf371d7db212836f6ab412e67639562b41600000000000000000000000000000000000000000000000000000000000000600000000000000000000000000000000000000000000000000000000000000044485cc955000000000000000000000000678ee23173dce625a90ed651e91ca5138149f5900000000000000000000000001f5e3785aa4605908e12f8049f9c12a9f32980bb00000000000000000000000000000000000000000000000000000000", str, vj7, cw0, it0);
    }

    /* renamed from: u */
    public static SafeswapTradeRouter m64708u(String str, vj7 vj7, cw0 cw0, it0 it0) {
        return new SafeswapTradeRouter(str, vj7, cw0, it0);
    }

    /* renamed from: A */
    public h75 mo56524A(Trade trade, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return h75.createTransaction(bigInteger2, bigInteger3, bigInteger4, this.contractAddress, bigInteger, xd2.encode(new gd2("swapTokensForExactTokensWithFeeAmount", Arrays.asList(new fz6[]{trade}), Collections.emptyList())));
    }

    /* renamed from: n */
    public rc5<BigInteger> mo56525n(BigInteger bigInteger, List<String> list) {
        Class<Address> cls = Address.class;
        return executeRemoteCallSingleValueReturn(new gd2("getSwapFees", Arrays.asList(new fz6[]{new Uint256(bigInteger), new DynamicArray(cls, Utils.typeMap(list, cls))}), Arrays.asList(new TypeReference[]{new TypeReference<Uint256>() {
        }})), BigInteger.class);
    }

    /* renamed from: o */
    public qt6 mo56526o(Trade trade, BigInteger bigInteger) {
        return qt6.createFunctionCallTransaction(trade.f41225d.getValue(), (BigInteger) null, (BigInteger) null, (BigInteger) null, this.contractAddress, bigInteger, xd2.encode(new gd2("swapETHForExactTokensWithFeeAmount", Arrays.asList(new fz6[]{trade, new Uint256(bigInteger)}), Collections.emptyList())));
    }

    /* renamed from: p */
    public qt6 mo56527p(Trade trade, BigInteger bigInteger) {
        return qt6.createFunctionCallTransaction(trade.f41225d.getValue(), (BigInteger) null, (BigInteger) null, (BigInteger) null, this.contractAddress, bigInteger, xd2.encode(new gd2("swapExactETHForTokensWithFeeAmount", Arrays.asList(new fz6[]{trade, new Uint256(bigInteger)}), Collections.emptyList())));
    }

    /* renamed from: q */
    public qt6 mo56528q(Trade trade, BigInteger bigInteger) {
        return qt6.createFunctionCallTransaction(trade.f41225d.getValue(), (BigInteger) null, (BigInteger) null, (BigInteger) null, this.contractAddress, bigInteger, xd2.encode(new gd2("swapExactTokensForETHAndFeeAmount", Arrays.asList(new fz6[]{trade}), Collections.emptyList())));
    }

    /* renamed from: r */
    public qt6 mo56529r(Trade trade, BigInteger bigInteger) {
        return qt6.createFunctionCallTransaction(trade.f41225d.getValue(), (BigInteger) null, (BigInteger) null, (BigInteger) null, this.contractAddress, bigInteger, xd2.encode(new gd2("swapExactTokensForTokensWithFeeAmount", Arrays.asList(new fz6[]{trade}), Collections.emptyList())));
    }

    /* renamed from: s */
    public qt6 mo56530s(Trade trade, BigInteger bigInteger) {
        return qt6.createFunctionCallTransaction(trade.f41225d.getValue(), (BigInteger) null, (BigInteger) null, (BigInteger) null, this.contractAddress, bigInteger, xd2.encode(new gd2("swapTokensForExactETHAndFeeAmount", Arrays.asList(new fz6[]{trade}), Collections.emptyList())));
    }

    /* renamed from: t */
    public qt6 mo56531t(Trade trade, BigInteger bigInteger) {
        return qt6.createFunctionCallTransaction(trade.f41225d.getValue(), (BigInteger) null, (BigInteger) null, (BigInteger) null, this.contractAddress, bigInteger, xd2.encode(new gd2("swapTokensForExactTokensWithFeeAmount", Arrays.asList(new fz6[]{trade}), Collections.emptyList())));
    }

    /* renamed from: v */
    public h75 mo56532v(Trade trade, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return h75.createTransaction(bigInteger2, bigInteger3, bigInteger4, this.contractAddress, bigInteger, xd2.encode(new gd2("swapETHForExactTokensWithFeeAmount", Arrays.asList(new fz6[]{trade, new Uint256(bigInteger)}), Collections.emptyList())));
    }

    /* renamed from: w */
    public h75 mo56533w(Trade trade, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return h75.createTransaction(bigInteger2, bigInteger3, bigInteger4, this.contractAddress, bigInteger, xd2.encode(new gd2("swapExactETHForTokensWithFeeAmount", Arrays.asList(new fz6[]{trade, new Uint256(bigInteger)}), Collections.emptyList())));
    }

    /* renamed from: x */
    public h75 mo56534x(Trade trade, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return h75.createTransaction(bigInteger2, bigInteger3, bigInteger4, this.contractAddress, bigInteger, xd2.encode(new gd2("swapExactTokensForETHAndFeeAmount", Arrays.asList(new fz6[]{trade}), Collections.emptyList())));
    }

    /* renamed from: y */
    public h75 mo56535y(Trade trade, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return h75.createTransaction(bigInteger2, bigInteger3, bigInteger4, this.contractAddress, bigInteger, xd2.encode(new gd2("swapExactTokensForTokensWithFeeAmount", Arrays.asList(new fz6[]{trade}), Collections.emptyList())));
    }

    /* renamed from: z */
    public h75 mo56536z(Trade trade, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return h75.createTransaction(bigInteger2, bigInteger3, bigInteger4, this.contractAddress, bigInteger, xd2.encode(new gd2("swapTokensForExactETHAndFeeAmount", Arrays.asList(new fz6[]{trade}), Collections.emptyList())));
    }
}
