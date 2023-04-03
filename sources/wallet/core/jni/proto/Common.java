package wallet.core.jni.proto;

import com.google.protobuf.C4987l;
import com.google.protobuf.C5011t;

public final class Common {

    public enum SigningError implements C5011t.C5014c {
        OK(0),
        Error_general(1),
        Error_internal(2),
        Error_low_balance(3),
        Error_zero_amount_requested(4),
        Error_missing_private_key(5),
        Error_invalid_private_key(15),
        Error_invalid_address(16),
        Error_invalid_utxo(17),
        Error_invalid_utxo_amount(18),
        Error_wrong_fee(6),
        Error_signing(7),
        Error_tx_too_big(8),
        Error_missing_input_utxos(9),
        Error_not_enough_utxos(10),
        Error_script_redeem(11),
        Error_script_output(12),
        Error_script_witness_program(13),
        Error_invalid_memo(14),
        Error_input_parse(19),
        Error_no_support_n2n(20),
        Error_signatures_count(21),
        Error_invalid_params(22),
        Error_invalid_requested_token_amount(23),
        UNRECOGNIZED(-1);
        
        public static final int Error_general_VALUE = 1;
        public static final int Error_input_parse_VALUE = 19;
        public static final int Error_internal_VALUE = 2;
        public static final int Error_invalid_address_VALUE = 16;
        public static final int Error_invalid_memo_VALUE = 14;
        public static final int Error_invalid_params_VALUE = 22;
        public static final int Error_invalid_private_key_VALUE = 15;
        public static final int Error_invalid_requested_token_amount_VALUE = 23;
        public static final int Error_invalid_utxo_VALUE = 17;
        public static final int Error_invalid_utxo_amount_VALUE = 18;
        public static final int Error_low_balance_VALUE = 3;
        public static final int Error_missing_input_utxos_VALUE = 9;
        public static final int Error_missing_private_key_VALUE = 5;
        public static final int Error_no_support_n2n_VALUE = 20;
        public static final int Error_not_enough_utxos_VALUE = 10;
        public static final int Error_script_output_VALUE = 12;
        public static final int Error_script_redeem_VALUE = 11;
        public static final int Error_script_witness_program_VALUE = 13;
        public static final int Error_signatures_count_VALUE = 21;
        public static final int Error_signing_VALUE = 7;
        public static final int Error_tx_too_big_VALUE = 8;
        public static final int Error_wrong_fee_VALUE = 6;
        public static final int Error_zero_amount_requested_VALUE = 4;
        public static final int OK_VALUE = 0;
        private static final C5011t.C5015d<SigningError> internalValueMap = null;
        private final int value;

        public static final class SigningErrorVerifier implements C5011t.C5016e {
            public static final C5011t.C5016e INSTANCE = null;

            static {
                INSTANCE = new SigningErrorVerifier();
            }

            private SigningErrorVerifier() {
            }

            public boolean isInRange(int i) {
                if (SigningError.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C5011t.C5015d<SigningError>() {
                public SigningError findValueByNumber(int i) {
                    return SigningError.forNumber(i);
                }
            };
        }

        private SigningError(int i) {
            this.value = i;
        }

        public static SigningError forNumber(int i) {
            switch (i) {
                case 0:
                    return OK;
                case 1:
                    return Error_general;
                case 2:
                    return Error_internal;
                case 3:
                    return Error_low_balance;
                case 4:
                    return Error_zero_amount_requested;
                case 5:
                    return Error_missing_private_key;
                case 6:
                    return Error_wrong_fee;
                case 7:
                    return Error_signing;
                case 8:
                    return Error_tx_too_big;
                case 9:
                    return Error_missing_input_utxos;
                case 10:
                    return Error_not_enough_utxos;
                case 11:
                    return Error_script_redeem;
                case 12:
                    return Error_script_output;
                case 13:
                    return Error_script_witness_program;
                case 14:
                    return Error_invalid_memo;
                case 15:
                    return Error_invalid_private_key;
                case 16:
                    return Error_invalid_address;
                case 17:
                    return Error_invalid_utxo;
                case 18:
                    return Error_invalid_utxo_amount;
                case 19:
                    return Error_input_parse;
                case 20:
                    return Error_no_support_n2n;
                case 21:
                    return Error_signatures_count;
                case 22:
                    return Error_invalid_params;
                case 23:
                    return Error_invalid_requested_token_amount;
                default:
                    return null;
            }
        }

        public static C5011t.C5015d<SigningError> internalGetValueMap() {
            return internalValueMap;
        }

        public static C5011t.C5016e internalGetVerifier() {
            return SigningErrorVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static SigningError valueOf(int i) {
            return forNumber(i);
        }
    }

    private Common() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
