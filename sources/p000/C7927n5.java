package p000;

import com.fasterxml.jackson.core.JsonFactory;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.Uint;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes1;
import org.web3j.abi.datatypes.generated.Bytes10;
import org.web3j.abi.datatypes.generated.Bytes11;
import org.web3j.abi.datatypes.generated.Bytes12;
import org.web3j.abi.datatypes.generated.Bytes13;
import org.web3j.abi.datatypes.generated.Bytes14;
import org.web3j.abi.datatypes.generated.Bytes15;
import org.web3j.abi.datatypes.generated.Bytes16;
import org.web3j.abi.datatypes.generated.Bytes17;
import org.web3j.abi.datatypes.generated.Bytes18;
import org.web3j.abi.datatypes.generated.Bytes19;
import org.web3j.abi.datatypes.generated.Bytes2;
import org.web3j.abi.datatypes.generated.Bytes20;
import org.web3j.abi.datatypes.generated.Bytes21;
import org.web3j.abi.datatypes.generated.Bytes22;
import org.web3j.abi.datatypes.generated.Bytes23;
import org.web3j.abi.datatypes.generated.Bytes24;
import org.web3j.abi.datatypes.generated.Bytes25;
import org.web3j.abi.datatypes.generated.Bytes26;
import org.web3j.abi.datatypes.generated.Bytes27;
import org.web3j.abi.datatypes.generated.Bytes28;
import org.web3j.abi.datatypes.generated.Bytes29;
import org.web3j.abi.datatypes.generated.Bytes3;
import org.web3j.abi.datatypes.generated.Bytes30;
import org.web3j.abi.datatypes.generated.Bytes31;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Bytes4;
import org.web3j.abi.datatypes.generated.Bytes5;
import org.web3j.abi.datatypes.generated.Bytes6;
import org.web3j.abi.datatypes.generated.Bytes7;
import org.web3j.abi.datatypes.generated.Bytes8;
import org.web3j.abi.datatypes.generated.Bytes9;
import org.web3j.abi.datatypes.generated.Int104;
import org.web3j.abi.datatypes.generated.Int112;
import org.web3j.abi.datatypes.generated.Int120;
import org.web3j.abi.datatypes.generated.Int128;
import org.web3j.abi.datatypes.generated.Int136;
import org.web3j.abi.datatypes.generated.Int144;
import org.web3j.abi.datatypes.generated.Int152;
import org.web3j.abi.datatypes.generated.Int16;
import org.web3j.abi.datatypes.generated.Int160;
import org.web3j.abi.datatypes.generated.Int168;
import org.web3j.abi.datatypes.generated.Int176;
import org.web3j.abi.datatypes.generated.Int184;
import org.web3j.abi.datatypes.generated.Int192;
import org.web3j.abi.datatypes.generated.Int200;
import org.web3j.abi.datatypes.generated.Int208;
import org.web3j.abi.datatypes.generated.Int216;
import org.web3j.abi.datatypes.generated.Int224;
import org.web3j.abi.datatypes.generated.Int232;
import org.web3j.abi.datatypes.generated.Int24;
import org.web3j.abi.datatypes.generated.Int240;
import org.web3j.abi.datatypes.generated.Int248;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Int32;
import org.web3j.abi.datatypes.generated.Int40;
import org.web3j.abi.datatypes.generated.Int48;
import org.web3j.abi.datatypes.generated.Int56;
import org.web3j.abi.datatypes.generated.Int64;
import org.web3j.abi.datatypes.generated.Int72;
import org.web3j.abi.datatypes.generated.Int8;
import org.web3j.abi.datatypes.generated.Int80;
import org.web3j.abi.datatypes.generated.Int88;
import org.web3j.abi.datatypes.generated.Int96;
import org.web3j.abi.datatypes.generated.Uint104;
import org.web3j.abi.datatypes.generated.Uint112;
import org.web3j.abi.datatypes.generated.Uint120;
import org.web3j.abi.datatypes.generated.Uint128;
import org.web3j.abi.datatypes.generated.Uint136;
import org.web3j.abi.datatypes.generated.Uint144;
import org.web3j.abi.datatypes.generated.Uint152;
import org.web3j.abi.datatypes.generated.Uint16;
import org.web3j.abi.datatypes.generated.Uint160;
import org.web3j.abi.datatypes.generated.Uint168;
import org.web3j.abi.datatypes.generated.Uint176;
import org.web3j.abi.datatypes.generated.Uint184;
import org.web3j.abi.datatypes.generated.Uint192;
import org.web3j.abi.datatypes.generated.Uint200;
import org.web3j.abi.datatypes.generated.Uint208;
import org.web3j.abi.datatypes.generated.Uint216;
import org.web3j.abi.datatypes.generated.Uint224;
import org.web3j.abi.datatypes.generated.Uint232;
import org.web3j.abi.datatypes.generated.Uint24;
import org.web3j.abi.datatypes.generated.Uint240;
import org.web3j.abi.datatypes.generated.Uint248;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint32;
import org.web3j.abi.datatypes.generated.Uint40;
import org.web3j.abi.datatypes.generated.Uint48;
import org.web3j.abi.datatypes.generated.Uint56;
import org.web3j.abi.datatypes.generated.Uint64;
import org.web3j.abi.datatypes.generated.Uint72;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.abi.datatypes.generated.Uint80;
import org.web3j.abi.datatypes.generated.Uint88;
import org.web3j.abi.datatypes.generated.Uint96;
import org.web3j.abi.datatypes.primitive.Byte;
import org.web3j.abi.datatypes.primitive.Char;
import org.web3j.abi.datatypes.primitive.Double;
import org.web3j.abi.datatypes.primitive.Float;
import org.web3j.abi.datatypes.primitive.Int;
import org.web3j.abi.datatypes.primitive.Long;
import org.web3j.abi.datatypes.primitive.Short;

/* renamed from: n5 */
/* compiled from: AbiTypes */
public final class C7927n5 {
    private C7927n5() {
    }

    public static Class<? extends fz6> getType(String str) {
        return getType(str, false);
    }

    public static String getTypeAString(Class<? extends fz6> cls) {
        if (Utf8String.class.equals(cls)) {
            return Utf8String.TYPE_NAME;
        }
        if (DynamicBytes.class.equals(cls)) {
            return "bytes";
        }
        return cls.getSimpleName().toLowerCase();
    }

    public static Class<? extends fz6> getType(String str, boolean z) {
        Class<Short> cls = Short.class;
        Class<Int> cls2 = Int.class;
        Class<Long> cls3 = Long.class;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1374008026:
                if (str.equals("bytes1")) {
                    c = 0;
                    break;
                }
                break;
            case -1374008025:
                if (str.equals("bytes2")) {
                    c = 1;
                    break;
                }
                break;
            case -1374008024:
                if (str.equals("bytes3")) {
                    c = 2;
                    break;
                }
                break;
            case -1374008023:
                if (str.equals("bytes4")) {
                    c = 3;
                    break;
                }
                break;
            case -1374008022:
                if (str.equals("bytes5")) {
                    c = 4;
                    break;
                }
                break;
            case -1374008021:
                if (str.equals("bytes6")) {
                    c = 5;
                    break;
                }
                break;
            case -1374008020:
                if (str.equals("bytes7")) {
                    c = 6;
                    break;
                }
                break;
            case -1374008019:
                if (str.equals("bytes8")) {
                    c = 7;
                    break;
                }
                break;
            case -1374008018:
                if (str.equals("bytes9")) {
                    c = 8;
                    break;
                }
                break;
            case -1325958191:
                if (str.equals("double")) {
                    c = 9;
                    break;
                }
                break;
            case -1183814746:
                if (str.equals("int104")) {
                    c = 10;
                    break;
                }
                break;
            case -1183814717:
                if (str.equals("int112")) {
                    c = 11;
                    break;
                }
                break;
            case -1183814688:
                if (str.equals("int120")) {
                    c = 12;
                    break;
                }
                break;
            case -1183814680:
                if (str.equals("int128")) {
                    c = 13;
                    break;
                }
                break;
            case -1183814651:
                if (str.equals("int136")) {
                    c = 14;
                    break;
                }
                break;
            case -1183814622:
                if (str.equals("int144")) {
                    c = 15;
                    break;
                }
                break;
            case -1183814593:
                if (str.equals("int152")) {
                    c = 16;
                    break;
                }
                break;
            case -1183814564:
                if (str.equals("int160")) {
                    c = 17;
                    break;
                }
                break;
            case -1183814556:
                if (str.equals("int168")) {
                    c = 18;
                    break;
                }
                break;
            case -1183814527:
                if (str.equals("int176")) {
                    c = 19;
                    break;
                }
                break;
            case -1183814498:
                if (str.equals("int184")) {
                    c = 20;
                    break;
                }
                break;
            case -1183814469:
                if (str.equals("int192")) {
                    c = 21;
                    break;
                }
                break;
            case -1183813789:
                if (str.equals("int200")) {
                    c = 22;
                    break;
                }
                break;
            case -1183813781:
                if (str.equals("int208")) {
                    c = 23;
                    break;
                }
                break;
            case -1183813752:
                if (str.equals("int216")) {
                    c = 24;
                    break;
                }
                break;
            case -1183813723:
                if (str.equals("int224")) {
                    c = 25;
                    break;
                }
                break;
            case -1183813694:
                if (str.equals("int232")) {
                    c = 26;
                    break;
                }
                break;
            case -1183813665:
                if (str.equals("int240")) {
                    c = 27;
                    break;
                }
                break;
            case -1183813657:
                if (str.equals("int248")) {
                    c = 28;
                    break;
                }
                break;
            case -1183813628:
                if (str.equals("int256")) {
                    c = 29;
                    break;
                }
                break;
            case -1147692044:
                if (str.equals(Address.TYPE_NAME)) {
                    c = 30;
                    break;
                }
                break;
            case -891985903:
                if (str.equals(Utf8String.TYPE_NAME)) {
                    c = 31;
                    break;
                }
                break;
            case -844996865:
                if (str.equals("uint16")) {
                    c = ' ';
                    break;
                }
                break;
            case -844996836:
                if (str.equals("uint24")) {
                    c = '!';
                    break;
                }
                break;
            case -844996807:
                if (str.equals("uint32")) {
                    c = JsonFactory.DEFAULT_QUOTE_CHAR;
                    break;
                }
                break;
            case -844996778:
                if (str.equals("uint40")) {
                    c = '#';
                    break;
                }
                break;
            case -844996770:
                if (str.equals("uint48")) {
                    c = DecodedChar.FNC1;
                    break;
                }
                break;
            case -844996741:
                if (str.equals("uint56")) {
                    c = '%';
                    break;
                }
                break;
            case -844996712:
                if (str.equals("uint64")) {
                    c = '&';
                    break;
                }
                break;
            case -844996683:
                if (str.equals("uint72")) {
                    c = '\'';
                    break;
                }
                break;
            case -844996654:
                if (str.equals("uint80")) {
                    c = '(';
                    break;
                }
                break;
            case -844996646:
                if (str.equals("uint88")) {
                    c = ')';
                    break;
                }
                break;
            case -844996617:
                if (str.equals("uint96")) {
                    c = '*';
                    break;
                }
                break;
            case -425099173:
                if (str.equals("uint104")) {
                    c = '+';
                    break;
                }
                break;
            case -425099144:
                if (str.equals("uint112")) {
                    c = ',';
                    break;
                }
                break;
            case -425099115:
                if (str.equals("uint120")) {
                    c = '-';
                    break;
                }
                break;
            case -425099107:
                if (str.equals("uint128")) {
                    c = '.';
                    break;
                }
                break;
            case -425099078:
                if (str.equals("uint136")) {
                    c = '/';
                    break;
                }
                break;
            case -425099049:
                if (str.equals("uint144")) {
                    c = '0';
                    break;
                }
                break;
            case -425099020:
                if (str.equals("uint152")) {
                    c = '1';
                    break;
                }
                break;
            case -425098991:
                if (str.equals("uint160")) {
                    c = '2';
                    break;
                }
                break;
            case -425098983:
                if (str.equals("uint168")) {
                    c = '3';
                    break;
                }
                break;
            case -425098954:
                if (str.equals("uint176")) {
                    c = '4';
                    break;
                }
                break;
            case -425098925:
                if (str.equals("uint184")) {
                    c = '5';
                    break;
                }
                break;
            case -425098896:
                if (str.equals("uint192")) {
                    c = '6';
                    break;
                }
                break;
            case -425098216:
                if (str.equals("uint200")) {
                    c = '7';
                    break;
                }
                break;
            case -425098208:
                if (str.equals("uint208")) {
                    c = '8';
                    break;
                }
                break;
            case -425098179:
                if (str.equals("uint216")) {
                    c = '9';
                    break;
                }
                break;
            case -425098150:
                if (str.equals("uint224")) {
                    c = ':';
                    break;
                }
                break;
            case -425098121:
                if (str.equals("uint232")) {
                    c = ';';
                    break;
                }
                break;
            case -425098092:
                if (str.equals("uint240")) {
                    c = '<';
                    break;
                }
                break;
            case -425098084:
                if (str.equals("uint248")) {
                    c = '=';
                    break;
                }
                break;
            case -425098055:
                if (str.equals("uint256")) {
                    c = '>';
                    break;
                }
                break;
            case 104431:
                if (str.equals(org.web3j.abi.datatypes.Int.TYPE_NAME)) {
                    c = '?';
                    break;
                }
                break;
            case 3029738:
                if (str.equals(Bool.TYPE_NAME)) {
                    c = '@';
                    break;
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    c = 'A';
                    break;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    c = 'B';
                    break;
                }
                break;
            case 3237417:
                if (str.equals("int8")) {
                    c = 'C';
                    break;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    c = 'D';
                    break;
                }
                break;
            case 3589978:
                if (str.equals(Uint.TYPE_NAME)) {
                    c = 'E';
                    break;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    c = 'F';
                    break;
                }
                break;
            case 94224491:
                if (str.equals("bytes")) {
                    c = 'G';
                    break;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    c = 'H';
                    break;
                }
                break;
            case 100359764:
                if (str.equals("int16")) {
                    c = 'I';
                    break;
                }
                break;
            case 100359793:
                if (str.equals("int24")) {
                    c = 'J';
                    break;
                }
                break;
            case 100359822:
                if (str.equals("int32")) {
                    c = 'K';
                    break;
                }
                break;
            case 100359851:
                if (str.equals("int40")) {
                    c = 'L';
                    break;
                }
                break;
            case 100359859:
                if (str.equals("int48")) {
                    c = 'M';
                    break;
                }
                break;
            case 100359888:
                if (str.equals("int56")) {
                    c = 'N';
                    break;
                }
                break;
            case 100359917:
                if (str.equals("int64")) {
                    c = 'O';
                    break;
                }
                break;
            case 100359946:
                if (str.equals("int72")) {
                    c = 'P';
                    break;
                }
                break;
            case 100359975:
                if (str.equals("int80")) {
                    c = 'Q';
                    break;
                }
                break;
            case 100359983:
                if (str.equals("int88")) {
                    c = 'R';
                    break;
                }
                break;
            case 100360012:
                if (str.equals("int96")) {
                    c = 'S';
                    break;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    c = 'T';
                    break;
                }
                break;
            case 111289374:
                if (str.equals("uint8")) {
                    c = 'U';
                    break;
                }
                break;
            case 355424202:
                if (str.equals("bytes10")) {
                    c = 'V';
                    break;
                }
                break;
            case 355424203:
                if (str.equals("bytes11")) {
                    c = 'W';
                    break;
                }
                break;
            case 355424204:
                if (str.equals("bytes12")) {
                    c = 'X';
                    break;
                }
                break;
            case 355424205:
                if (str.equals("bytes13")) {
                    c = 'Y';
                    break;
                }
                break;
            case 355424206:
                if (str.equals("bytes14")) {
                    c = 'Z';
                    break;
                }
                break;
            case 355424207:
                if (str.equals("bytes15")) {
                    c = '[';
                    break;
                }
                break;
            case 355424208:
                if (str.equals("bytes16")) {
                    c = '\\';
                    break;
                }
                break;
            case 355424209:
                if (str.equals("bytes17")) {
                    c = ']';
                    break;
                }
                break;
            case 355424210:
                if (str.equals("bytes18")) {
                    c = '^';
                    break;
                }
                break;
            case 355424211:
                if (str.equals("bytes19")) {
                    c = '_';
                    break;
                }
                break;
            case 355424233:
                if (str.equals("bytes20")) {
                    c = '`';
                    break;
                }
                break;
            case 355424234:
                if (str.equals("bytes21")) {
                    c = 'a';
                    break;
                }
                break;
            case 355424235:
                if (str.equals("bytes22")) {
                    c = 'b';
                    break;
                }
                break;
            case 355424236:
                if (str.equals("bytes23")) {
                    c = 'c';
                    break;
                }
                break;
            case 355424237:
                if (str.equals("bytes24")) {
                    c = 'd';
                    break;
                }
                break;
            case 355424238:
                if (str.equals("bytes25")) {
                    c = 'e';
                    break;
                }
                break;
            case 355424239:
                if (str.equals("bytes26")) {
                    c = 'f';
                    break;
                }
                break;
            case 355424240:
                if (str.equals("bytes27")) {
                    c = 'g';
                    break;
                }
                break;
            case 355424241:
                if (str.equals("bytes28")) {
                    c = 'h';
                    break;
                }
                break;
            case 355424242:
                if (str.equals("bytes29")) {
                    c = 'i';
                    break;
                }
                break;
            case 355424264:
                if (str.equals("bytes30")) {
                    c = 'j';
                    break;
                }
                break;
            case 355424265:
                if (str.equals("bytes31")) {
                    c = 'k';
                    break;
                }
                break;
            case 355424266:
                if (str.equals("bytes32")) {
                    c = 'l';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Bytes1.class;
            case 1:
                return Bytes2.class;
            case 2:
                return Bytes3.class;
            case 3:
                return Bytes4.class;
            case 4:
                return Bytes5.class;
            case 5:
                return Bytes6.class;
            case 6:
                return Bytes7.class;
            case 7:
                return Bytes8.class;
            case 8:
                return Bytes9.class;
            case 9:
                return Double.class;
            case 10:
                return Int104.class;
            case 11:
                return Int112.class;
            case 12:
                return Int120.class;
            case 13:
                return Int128.class;
            case 14:
                return Int136.class;
            case 15:
                return Int144.class;
            case 16:
                return Int152.class;
            case 17:
                return Int160.class;
            case 18:
                return Int168.class;
            case 19:
                return Int176.class;
            case 20:
                return Int184.class;
            case 21:
                return Int192.class;
            case 22:
                return Int200.class;
            case 23:
                return Int208.class;
            case 24:
                return Int216.class;
            case 25:
                return Int224.class;
            case 26:
                return Int232.class;
            case 27:
                return Int240.class;
            case 28:
                return Int248.class;
            case 29:
                return Int256.class;
            case 30:
                return Address.class;
            case 31:
                return Utf8String.class;
            case ' ':
                return z ? cls2 : Uint16.class;
            case '!':
                return z ? cls2 : Uint24.class;
            case '\"':
                return z ? cls3 : Uint32.class;
            case '#':
                return z ? cls3 : Uint40.class;
            case '$':
                return z ? cls3 : Uint48.class;
            case '%':
                return z ? cls3 : Uint56.class;
            case '&':
                return Uint64.class;
            case '\'':
                return Uint72.class;
            case '(':
                return Uint80.class;
            case ')':
                return Uint88.class;
            case '*':
                return Uint96.class;
            case '+':
                return Uint104.class;
            case ',':
                return Uint112.class;
            case '-':
                return Uint120.class;
            case '.':
                return Uint128.class;
            case '/':
                return Uint136.class;
            case '0':
                return Uint144.class;
            case '1':
                return Uint152.class;
            case '2':
                return Uint160.class;
            case '3':
                return Uint168.class;
            case '4':
                return Uint176.class;
            case '5':
                return Uint184.class;
            case '6':
                return Uint192.class;
            case '7':
                return Uint200.class;
            case '8':
                return Uint208.class;
            case '9':
                return Uint216.class;
            case ':':
                return Uint224.class;
            case ';':
                return Uint232.class;
            case '<':
                return Uint240.class;
            case '=':
                return Uint248.class;
            case '>':
                return Uint256.class;
            case '?':
                return z ? cls2 : org.web3j.abi.datatypes.Int.class;
            case '@':
            case 'F':
                return Bool.class;
            case 'A':
                return Byte.class;
            case 'B':
                return Char.class;
            case 'C':
                return z ? cls : Int8.class;
            case 'D':
                return cls3;
            case 'E':
                return Uint.class;
            case 'G':
                return DynamicBytes.class;
            case 'H':
                return Float.class;
            case 'I':
                return z ? cls2 : Int16.class;
            case 'J':
                return z ? cls2 : Int24.class;
            case 'K':
                return z ? cls2 : Int32.class;
            case 'L':
                return z ? cls3 : Int40.class;
            case 'M':
                return z ? cls3 : Int48.class;
            case 'N':
                return z ? cls3 : Int56.class;
            case 'O':
                return z ? cls3 : Int64.class;
            case 'P':
                return Int72.class;
            case 'Q':
                return Int80.class;
            case 'R':
                return Int88.class;
            case 'S':
                return Int96.class;
            case 'T':
                return cls;
            case 'U':
                return Uint8.class;
            case 'V':
                return Bytes10.class;
            case 'W':
                return Bytes11.class;
            case 'X':
                return Bytes12.class;
            case 'Y':
                return Bytes13.class;
            case 'Z':
                return Bytes14.class;
            case '[':
                return Bytes15.class;
            case '\\':
                return Bytes16.class;
            case ']':
                return Bytes17.class;
            case '^':
                return Bytes18.class;
            case '_':
                return Bytes19.class;
            case '`':
                return Bytes20.class;
            case 'a':
                return Bytes21.class;
            case 'b':
                return Bytes22.class;
            case 'c':
                return Bytes23.class;
            case 'd':
                return Bytes24.class;
            case 'e':
                return Bytes25.class;
            case 'f':
                return Bytes26.class;
            case 'g':
                return Bytes27.class;
            case 'h':
                return Bytes28.class;
            case 'i':
                return Bytes29.class;
            case 'j':
                return Bytes30.class;
            case 'k':
                return Bytes31.class;
            case 'l':
                return Bytes32.class;
            default:
                try {
                    return Class.forName(str);
                } catch (ClassNotFoundException unused) {
                    throw new UnsupportedOperationException("Unsupported type encountered: " + str);
                }
        }
    }
}
