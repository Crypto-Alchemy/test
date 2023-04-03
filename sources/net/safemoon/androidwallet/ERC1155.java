package net.safemoon.androidwallet;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;

public class ERC1155 extends gt0 {

    /* renamed from: a */
    public static final ft1 f41164a = new ft1("ApprovalForAll", Arrays.asList(new TypeReference[]{new TypeReference<Address>(true) {
    }, new TypeReference<Address>(true) {
    }, new TypeReference<Bool>() {
    }}));

    /* renamed from: b */
    public static final ft1 f41165b = new ft1("TransferBatch", Arrays.asList(new TypeReference[]{new TypeReference<Address>(true) {
    }, new TypeReference<Address>(true) {
    }, new TypeReference<Address>(true) {
    }, new TypeReference<DynamicArray<Uint256>>() {
    }, new TypeReference<DynamicArray<Uint256>>() {
    }}));

    /* renamed from: c */
    public static final ft1 f41166c = new ft1("TransferSingle", Arrays.asList(new TypeReference[]{new TypeReference<Address>(true) {
    }, new TypeReference<Address>(true) {
    }, new TypeReference<Address>(true) {
    }, new TypeReference<Uint256>() {
    }, new TypeReference<Uint256>() {
    }}));

    /* renamed from: d */
    public static final ft1 f41167d = new ft1("URI", Arrays.asList(new TypeReference[]{new TypeReference<Utf8String>() {
    }, new TypeReference<Uint256>(true) {
    }}));

    /* renamed from: net.safemoon.androidwallet.ERC1155$21 */
    class C794821 extends TypeReference<DynamicArray<Uint256>> {
    }

    /* renamed from: net.safemoon.androidwallet.ERC1155$23 */
    class C794923 extends TypeReference<Bool> {
    }

    /* renamed from: net.safemoon.androidwallet.ERC1155$24 */
    class C795024 extends TypeReference<Bool> {
    }

    /* renamed from: net.safemoon.androidwallet.ERC1155$25 */
    class C795125 extends TypeReference<Utf8String> {
    }

    public ERC1155(String str, vj7 vj7, cw0 cw0, it0 it0) {
        super("60806040523480156200001157600080fd5b506040516200162e3803806200162e833981016040819052620000349162000105565b6200003f8162000046565b5062000234565b80516200005b9060029060208401906200005f565b5050565b8280546200006d90620001e1565b90600052602060002090601f016020900481019282620000915760008555620000dc565b82601f10620000ac57805160ff1916838001178555620000dc565b82800160010185558215620000dc579182015b82811115620000dc578251825591602001919060010190620000bf565b50620000ea929150620000ee565b5090565b5b80821115620000ea5760008155600101620000ef565b600060208083850312156200011957600080fd5b82516001600160401b03808211156200013157600080fd5b818501915085601f8301126200014657600080fd5b8151818111156200015b576200015b6200021e565b604051601f8201601f19908116603f011681019083821181831017156200018657620001866200021e565b8160405282815288868487010111156200019f57600080fd5b600093505b82841015620001c35784840186015181850187015292850192620001a4565b82841115620001d55760008684830101525b98975050505050505050565b600181811c90821680620001f657607f821691505b602082108114156200021857634e487b7160e01b600052602260045260246000fd5b50919050565b634e487b7160e01b600052604160045260246000fd5b6113ea80620002446000396000f3fe608060405234801561001057600080fd5b50600436106100875760003560e01c80634e1273f41161005b5780634e1273f41461010a578063a22cb4651461012a578063e985e9c51461013d578063f242432a1461017957600080fd5b8062fdd58e1461008c57806301ffc9a7146100b25780630e89341c146100d55780632eb2c2d6146100f5575b600080fd5b61009f61009a366004610e49565b61018c565b6040519081526020015b60405180910390f35b6100c56100c0366004610f44565b610223565b60405190151581526020016100a9565b6100e86100e3366004610f85565b610275565b6040516100a9919061110a565b610108610103366004610cfe565b610309565b005b61011d610118366004610e73565b6103a0565b6040516100a991906110c9565b610108610138366004610e0d565b6104ca565b6100c561014b366004610ccb565b6001600160a01b03918216600090815260016020908152604080832093909416825291909152205460ff1690565b610108610187366004610da8565b6104d9565b60006001600160a01b0383166101fd5760405162461bcd60e51b815260206004820152602b60248201527f455243313135353a2062616c616e636520717565727920666f7220746865207a60448201526a65726f206164647265737360a81b60648201526084015b60405180910390fd5b506000908152602081815260408083206001600160a01b03949094168352929052205490565b60006001600160e01b03198216636cdb3d1360e11b148061025457506001600160e01b031982166303a24d0760e21b145b8061026f57506301ffc9a760e01b6001600160e01b03198316145b92915050565b60606002805461028490611230565b80601f01602080910402602001604051908101604052809291908181526020018280546102b090611230565b80156102fd5780601f106102d2576101008083540402835291602001916102fd565b820191906000526020600020905b8154815290600101906020018083116102e057829003601f168201915b50505050509050919050565b6001600160a01b0385163314806103255750610325853361014b565b61038c5760405162461bcd60e51b815260206004820152603260248201527f455243313135353a207472616e736665722063616c6c6572206973206e6f74206044820152711bdddb995c881b9bdc88185c1c1c9bdd995960721b60648201526084016101f4565b6103998585858585610560565b5050505050565b606081518351146104055760405162461bcd60e51b815260206004820152602960248201527f455243313135353a206163636f756e747320616e6420696473206c656e677468604482015268040dad2e6dac2e8c6d60bb1b60648201526084016101f4565b6000835167ffffffffffffffff811115610421576104216112df565b60405190808252806020026020018201604052801561044a578160200160208202803683370190505b50905060005b84518110156104c25761049585828151811061046e5761046e6112c9565b6020026020010151858381518110610488576104886112c9565b602002602001015161018c565b8282815181106104a7576104a76112c9565b60209081029190910101526104bb81611298565b9050610450565b509392505050565b6104d533838361073d565b5050565b6001600160a01b0385163314806104f557506104f5853361014b565b6105535760405162461bcd60e51b815260206004820152602960248201527f455243313135353a2063616c6c6572206973206e6f74206f776e6572206e6f7260448201526808185c1c1c9bdd995960ba1b60648201526084016101f4565b610399858585858561081e565b81518351146105c25760405162461bcd60e51b815260206004820152602860248201527f455243313135353a2069647320616e6420616d6f756e7473206c656e677468206044820152670dad2e6dac2e8c6d60c31b60648201526084016101f4565b6001600160a01b0384166105e85760405162461bcd60e51b81526004016101f490611165565b3360005b84518110156106cf576000858281518110610609576106096112c9565b602002602001015190506000858381518110610627576106276112c9565b602090810291909101810151600084815280835260408082206001600160a01b038e1683529093529190912054909150818110156106775760405162461bcd60e51b81526004016101f4906111aa565b6000838152602081815260408083206001600160a01b038e8116855292528083208585039055908b168252812080548492906106b4908490611218565b92505081905550505050806106c890611298565b90506105ec565b50846001600160a01b0316866001600160a01b0316826001600160a01b03167f4a39dc06d4c0dbc64b70af90fd698a233a518aa5d07e595d983b8c0526c8f7fb878760405161071f9291906110dc565b60405180910390a4610735818787878787610944565b505050505050565b816001600160a01b0316836001600160a01b031614156107b15760405162461bcd60e51b815260206004820152602960248201527f455243313135353a2073657474696e6720617070726f76616c20737461747573604482015268103337b91039b2b63360b91b60648201526084016101f4565b6001600160a01b03838116600081815260016020908152604080832094871680845294825291829020805460ff191686151590811790915591519182527f17307eab39ab6107e8899845ad3d59bd9653f200f220920489ca2b5937696c31910160405180910390a3505050565b6001600160a01b0384166108445760405162461bcd60e51b81526004016101f490611165565b3361085d81878761085488610aaf565b61039988610aaf565b6000848152602081815260408083206001600160a01b038a1684529091529020548381101561089e5760405162461bcd60e51b81526004016101f4906111aa565b6000858152602081815260408083206001600160a01b038b81168552925280832087850390559088168252812080548692906108db908490611218565b909155505060408051868152602081018690526001600160a01b03808916928a821692918616917fc3d58168c5ae7397731d063d5bbf3d657854427343f4c083240f7aacaa2d0f62910160405180910390a461093b828888888888610afa565b50505050505050565b6001600160a01b0384163b156107355760405163bc197c8160e01b81526001600160a01b0385169063bc197c81906109889089908990889088908890600401611026565b602060405180830381600087803b1580156109a257600080fd5b505af19250505080156109d2575060408051601f3d908101601f191682019092526109cf91810190610f68565b60015b610a7f576109de6112f5565b806308c379a01415610a1857506109f3611311565b806109fe5750610a1a565b8060405162461bcd60e51b81526004016101f4919061110a565b505b60405162461bcd60e51b815260206004820152603460248201527f455243313135353a207472616e7366657220746f206e6f6e20455243313135356044820152732932b1b2b4bb32b91034b6b83632b6b2b73a32b960611b60648201526084016101f4565b6001600160e01b0319811663bc197c8160e01b1461093b5760405162461bcd60e51b81526004016101f49061111d565b60408051600180825281830190925260609160009190602080830190803683370190505090508281600081518110610ae957610ae96112c9565b602090810291909101015292915050565b6001600160a01b0384163b156107355760405163f23a6e6160e01b81526001600160a01b0385169063f23a6e6190610b3e9089908990889088908890600401611084565b602060405180830381600087803b158015610b5857600080fd5b505af1925050508015610b88575060408051601f3d908101601f19168201909252610b8591810190610f68565b60015b610b94576109de6112f5565b6001600160e01b0319811663f23a6e6160e01b1461093b5760405162461bcd60e51b81526004016101f49061111d565b80356001600160a01b0381168114610bdb57600080fd5b919050565b600082601f830112610bf157600080fd5b81356020610bfe826111f4565b604051610c0b828261126b565b8381528281019150858301600585901b87018401881015610c2b57600080fd5b60005b85811015610c4a57813584529284019290840190600101610c2e565b5090979650505050505050565b600082601f830112610c6857600080fd5b813567ffffffffffffffff811115610c8257610c826112df565b604051610c99601f8301601f19166020018261126b565b818152846020838601011115610cae57600080fd5b816020850160208301376000918101602001919091529392505050565b60008060408385031215610cde57600080fd5b610ce783610bc4565b9150610cf560208401610bc4565b90509250929050565b600080600080600060a08688031215610d1657600080fd5b610d1f86610bc4565b9450610d2d60208701610bc4565b9350604086013567ffffffffffffffff80821115610d4a57600080fd5b610d5689838a01610be0565b94506060880135915080821115610d6c57600080fd5b610d7889838a01610be0565b93506080880135915080821115610d8e57600080fd5b50610d9b88828901610c57565b9150509295509295909350565b600080600080600060a08688031215610dc057600080fd5b610dc986610bc4565b9450610dd760208701610bc4565b93506040860135925060608601359150608086013567ffffffffffffffff811115610e0157600080fd5b610d9b88828901610c57565b60008060408385031215610e2057600080fd5b610e2983610bc4565b915060208301358015158114610e3e57600080fd5b809150509250929050565b60008060408385031215610e5c57600080fd5b610e6583610bc4565b946020939093013593505050565b60008060408385031215610e8657600080fd5b823567ffffffffffffffff80821115610e9e57600080fd5b818501915085601f830112610eb257600080fd5b81356020610ebf826111f4565b604051610ecc828261126b565b8381528281019150858301600585901b870184018b1015610eec57600080fd5b600096505b84871015610f1657610f0281610bc4565b835260019690960195918301918301610ef1565b5096505086013592505080821115610f2d57600080fd5b50610f3a85828601610be0565b9150509250929050565b600060208284031215610f5657600080fd5b8135610f618161139b565b9392505050565b600060208284031215610f7a57600080fd5b8151610f618161139b565b600060208284031215610f9757600080fd5b5035919050565b600081518084526020808501945080840160005b83811015610fce57815187529582019590820190600101610fb2565b509495945050505050565b6000815180845260005b81811015610fff57602081850181015186830182015201610fe3565b81811115611011576000602083870101525b50601f01601f19169290920160200192915050565b6001600160a01b0386811682528516602082015260a06040820181905260009061105290830186610f9e565b82810360608401526110648186610f9e565b905082810360808401526110788185610fd9565b98975050505050505050565b6001600160a01b03868116825285166020820152604081018490526060810183905260a0608082018190526000906110be90830184610fd9565b979650505050505050565b602081526000610f616020830184610f9e565b6040815260006110ef6040830185610f9e565b82810360208401526111018185610f9e565b95945050505050565b602081526000610f616020830184610fd9565b60208082526028908201527f455243313135353a204552433131353552656365697665722072656a656374656040820152676420746f6b656e7360c01b606082015260800190565b60208082526025908201527f455243313135353a207472616e7366657220746f20746865207a65726f206164604082015264647265737360d81b606082015260800190565b6020808252602a908201527f455243313135353a20696e73756666696369656e742062616c616e636520666f60408201526939103a3930b739b332b960b11b606082015260800190565b600067ffffffffffffffff82111561120e5761120e6112df565b5060051b60200190565b6000821982111561122b5761122b6112b3565b500190565b600181811c9082168061124457607f821691505b6020821081141561126557634e487b7160e01b600052602260045260246000fd5b50919050565b601f8201601f1916810167ffffffffffffffff81118282101715611291576112916112df565b6040525050565b60006000198214156112ac576112ac6112b3565b5060010190565b634e487b7160e01b600052601160045260246000fd5b634e487b7160e01b600052603260045260246000fd5b634e487b7160e01b600052604160045260246000fd5b600060033d111561130e5760046000803e5060005160e01c5b90565b600060443d101561131f5790565b6040516003193d81016004833e81513d67ffffffffffffffff816024840111818411171561134f57505050505090565b82850191508151818111156113675750505050505090565b843d87010160208285010111156113815750505050505090565b6113906020828601018761126b565b509095945050505050565b6001600160e01b0319811681146113b157600080fd5b5056fea26469706673582212205e4eac77b73c2d2c1fe4fdee5822dcffc5a383972ffbe7c88f5874c828db6b4864736f6c63430008070033", str, vj7, cw0, it0);
    }

    /* renamed from: p */
    public static ERC1155 m64649p(String str, vj7 vj7, cw0 cw0, it0 it0) {
        return new ERC1155(str, vj7, cw0, it0);
    }

    /* renamed from: n */
    public rc5<BigInteger> mo56473n(String str, BigInteger bigInteger) {
        return executeRemoteCallSingleValueReturn(new gd2("balanceOf", Arrays.asList(new fz6[]{new Address(160, str), new Uint256(bigInteger)}), Arrays.asList(new TypeReference[]{new TypeReference<Uint256>() {
        }})), BigInteger.class);
    }

    /* renamed from: o */
    public gd2 mo56474o(String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        return new gd2("safeTransferFrom", Arrays.asList(new fz6[]{new Address(160, str), new Address(160, str2), new Uint256(bigInteger), new Uint256(bigInteger2), new DynamicBytes(bArr)}), Collections.emptyList());
    }

    /* renamed from: q */
    public h75 mo56475q(String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6) {
        return h75.createTransaction(bigInteger3, bigInteger4, bigInteger5, this.contractAddress, bigInteger6, xd2.encode(mo56474o(str, str2, bigInteger, bigInteger2, bArr)));
    }

    /* renamed from: r */
    public qt6 mo56476r(String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        return qt6.createEthCallTransaction(str, this.contractAddress, xd2.encode(mo56474o(str, str2, bigInteger, bigInteger2, bArr)));
    }
}