package wallet.core.jni.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.C4949a;
import com.google.protobuf.C4956c0;
import com.google.protobuf.C4969g;
import com.google.protobuf.C4987l;
import com.google.protobuf.C5011t;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Harmony {

    /* renamed from: wallet.core.jni.proto.Harmony$1 */
    public static /* synthetic */ class C97471 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46560xa1df5c61;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46560xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46560xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46560xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46560xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46560xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46560xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46560xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Harmony.C97471.<clinit>():void");
        }
    }

    public static final class CommissionRate extends GeneratedMessageLite<CommissionRate, Builder> implements CommissionRateOrBuilder {
        /* access modifiers changed from: private */
        public static final CommissionRate DEFAULT_INSTANCE;
        public static final int MAX_CHANGE_RATE_FIELD_NUMBER = 3;
        public static final int MAX_RATE_FIELD_NUMBER = 2;
        private static volatile im4<CommissionRate> PARSER = null;
        public static final int RATE_FIELD_NUMBER = 1;
        private Decimal maxChangeRate_;
        private Decimal maxRate_;
        private Decimal rate_;

        public static final class Builder extends GeneratedMessageLite.C4930a<CommissionRate, Builder> implements CommissionRateOrBuilder {
            public /* synthetic */ Builder(C97471 r1) {
                this();
            }

            public Builder clearMaxChangeRate() {
                copyOnWrite();
                ((CommissionRate) this.instance).clearMaxChangeRate();
                return this;
            }

            public Builder clearMaxRate() {
                copyOnWrite();
                ((CommissionRate) this.instance).clearMaxRate();
                return this;
            }

            public Builder clearRate() {
                copyOnWrite();
                ((CommissionRate) this.instance).clearRate();
                return this;
            }

            public Decimal getMaxChangeRate() {
                return ((CommissionRate) this.instance).getMaxChangeRate();
            }

            public Decimal getMaxRate() {
                return ((CommissionRate) this.instance).getMaxRate();
            }

            public Decimal getRate() {
                return ((CommissionRate) this.instance).getRate();
            }

            public boolean hasMaxChangeRate() {
                return ((CommissionRate) this.instance).hasMaxChangeRate();
            }

            public boolean hasMaxRate() {
                return ((CommissionRate) this.instance).hasMaxRate();
            }

            public boolean hasRate() {
                return ((CommissionRate) this.instance).hasRate();
            }

            public Builder mergeMaxChangeRate(Decimal decimal) {
                copyOnWrite();
                ((CommissionRate) this.instance).mergeMaxChangeRate(decimal);
                return this;
            }

            public Builder mergeMaxRate(Decimal decimal) {
                copyOnWrite();
                ((CommissionRate) this.instance).mergeMaxRate(decimal);
                return this;
            }

            public Builder mergeRate(Decimal decimal) {
                copyOnWrite();
                ((CommissionRate) this.instance).mergeRate(decimal);
                return this;
            }

            public Builder setMaxChangeRate(Decimal decimal) {
                copyOnWrite();
                ((CommissionRate) this.instance).setMaxChangeRate(decimal);
                return this;
            }

            public Builder setMaxRate(Decimal decimal) {
                copyOnWrite();
                ((CommissionRate) this.instance).setMaxRate(decimal);
                return this;
            }

            public Builder setRate(Decimal decimal) {
                copyOnWrite();
                ((CommissionRate) this.instance).setRate(decimal);
                return this;
            }

            private Builder() {
                super(CommissionRate.DEFAULT_INSTANCE);
            }

            public Builder setMaxChangeRate(Decimal.Builder builder) {
                copyOnWrite();
                ((CommissionRate) this.instance).setMaxChangeRate((Decimal) builder.build());
                return this;
            }

            public Builder setMaxRate(Decimal.Builder builder) {
                copyOnWrite();
                ((CommissionRate) this.instance).setMaxRate((Decimal) builder.build());
                return this;
            }

            public Builder setRate(Decimal.Builder builder) {
                copyOnWrite();
                ((CommissionRate) this.instance).setRate((Decimal) builder.build());
                return this;
            }
        }

        static {
            CommissionRate commissionRate = new CommissionRate();
            DEFAULT_INSTANCE = commissionRate;
            GeneratedMessageLite.registerDefaultInstance(CommissionRate.class, commissionRate);
        }

        private CommissionRate() {
        }

        /* access modifiers changed from: private */
        public void clearMaxChangeRate() {
            this.maxChangeRate_ = null;
        }

        /* access modifiers changed from: private */
        public void clearMaxRate() {
            this.maxRate_ = null;
        }

        /* access modifiers changed from: private */
        public void clearRate() {
            this.rate_ = null;
        }

        public static CommissionRate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeMaxChangeRate(Decimal decimal) {
            decimal.getClass();
            Decimal decimal2 = this.maxChangeRate_;
            if (decimal2 == null || decimal2 == Decimal.getDefaultInstance()) {
                this.maxChangeRate_ = decimal;
            } else {
                this.maxChangeRate_ = (Decimal) ((Decimal.Builder) Decimal.newBuilder(this.maxChangeRate_).mergeFrom(decimal)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeMaxRate(Decimal decimal) {
            decimal.getClass();
            Decimal decimal2 = this.maxRate_;
            if (decimal2 == null || decimal2 == Decimal.getDefaultInstance()) {
                this.maxRate_ = decimal;
            } else {
                this.maxRate_ = (Decimal) ((Decimal.Builder) Decimal.newBuilder(this.maxRate_).mergeFrom(decimal)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeRate(Decimal decimal) {
            decimal.getClass();
            Decimal decimal2 = this.rate_;
            if (decimal2 == null || decimal2 == Decimal.getDefaultInstance()) {
                this.rate_ = decimal;
            } else {
                this.rate_ = (Decimal) ((Decimal.Builder) Decimal.newBuilder(this.rate_).mergeFrom(decimal)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CommissionRate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CommissionRate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommissionRate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CommissionRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<CommissionRate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setMaxChangeRate(Decimal decimal) {
            decimal.getClass();
            this.maxChangeRate_ = decimal;
        }

        /* access modifiers changed from: private */
        public void setMaxRate(Decimal decimal) {
            decimal.getClass();
            this.maxRate_ = decimal;
        }

        /* access modifiers changed from: private */
        public void setRate(Decimal decimal) {
            decimal.getClass();
            this.rate_ = decimal;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97471.f46560xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CommissionRate();
                case 2:
                    return new Builder((C97471) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"rate_", "maxRate_", "maxChangeRate_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<CommissionRate> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (CommissionRate.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public Decimal getMaxChangeRate() {
            Decimal decimal = this.maxChangeRate_;
            if (decimal == null) {
                return Decimal.getDefaultInstance();
            }
            return decimal;
        }

        public Decimal getMaxRate() {
            Decimal decimal = this.maxRate_;
            if (decimal == null) {
                return Decimal.getDefaultInstance();
            }
            return decimal;
        }

        public Decimal getRate() {
            Decimal decimal = this.rate_;
            if (decimal == null) {
                return Decimal.getDefaultInstance();
            }
            return decimal;
        }

        public boolean hasMaxChangeRate() {
            if (this.maxChangeRate_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasMaxRate() {
            if (this.maxRate_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasRate() {
            if (this.rate_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(CommissionRate commissionRate) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(commissionRate);
        }

        public static CommissionRate parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CommissionRate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CommissionRate parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (CommissionRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static CommissionRate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CommissionRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CommissionRate parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (CommissionRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static CommissionRate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CommissionRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CommissionRate parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (CommissionRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static CommissionRate parseFrom(InputStream inputStream) throws IOException {
            return (CommissionRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommissionRate parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CommissionRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CommissionRate parseFrom(C4969g gVar) throws IOException {
            return (CommissionRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static CommissionRate parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (CommissionRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface CommissionRateOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Decimal getMaxChangeRate();

        Decimal getMaxRate();

        Decimal getRate();

        boolean hasMaxChangeRate();

        boolean hasMaxRate();

        boolean hasRate();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Decimal extends GeneratedMessageLite<Decimal, Builder> implements DecimalOrBuilder {
        /* access modifiers changed from: private */
        public static final Decimal DEFAULT_INSTANCE;
        private static volatile im4<Decimal> PARSER = null;
        public static final int PRECISION_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private ByteString precision_;
        private ByteString value_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Decimal, Builder> implements DecimalOrBuilder {
            public /* synthetic */ Builder(C97471 r1) {
                this();
            }

            public Builder clearPrecision() {
                copyOnWrite();
                ((Decimal) this.instance).clearPrecision();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((Decimal) this.instance).clearValue();
                return this;
            }

            public ByteString getPrecision() {
                return ((Decimal) this.instance).getPrecision();
            }

            public ByteString getValue() {
                return ((Decimal) this.instance).getValue();
            }

            public Builder setPrecision(ByteString byteString) {
                copyOnWrite();
                ((Decimal) this.instance).setPrecision(byteString);
                return this;
            }

            public Builder setValue(ByteString byteString) {
                copyOnWrite();
                ((Decimal) this.instance).setValue(byteString);
                return this;
            }

            private Builder() {
                super(Decimal.DEFAULT_INSTANCE);
            }
        }

        static {
            Decimal decimal = new Decimal();
            DEFAULT_INSTANCE = decimal;
            GeneratedMessageLite.registerDefaultInstance(Decimal.class, decimal);
        }

        private Decimal() {
            ByteString byteString = ByteString.EMPTY;
            this.value_ = byteString;
            this.precision_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearPrecision() {
            this.precision_ = getDefaultInstance().getPrecision();
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static Decimal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Decimal parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Decimal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Decimal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Decimal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Decimal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPrecision(ByteString byteString) {
            byteString.getClass();
            this.precision_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97471.f46560xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Decimal();
                case 2:
                    return new Builder((C97471) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"value_", "precision_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Decimal> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Decimal.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ByteString getPrecision() {
            return this.precision_;
        }

        public ByteString getValue() {
            return this.value_;
        }

        public static Builder newBuilder(Decimal decimal) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(decimal);
        }

        public static Decimal parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Decimal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Decimal parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Decimal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Decimal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Decimal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Decimal parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Decimal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Decimal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Decimal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Decimal parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Decimal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Decimal parseFrom(InputStream inputStream) throws IOException {
            return (Decimal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Decimal parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Decimal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Decimal parseFrom(C4969g gVar) throws IOException {
            return (Decimal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Decimal parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Decimal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DecimalOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getPrecision();

        ByteString getValue();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Description extends GeneratedMessageLite<Description, Builder> implements DescriptionOrBuilder {
        /* access modifiers changed from: private */
        public static final Description DEFAULT_INSTANCE;
        public static final int DETAILS_FIELD_NUMBER = 5;
        public static final int IDENTITY_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile im4<Description> PARSER = null;
        public static final int SECURITY_CONTACT_FIELD_NUMBER = 4;
        public static final int WEBSITE_FIELD_NUMBER = 3;
        private String details_ = "";
        private String identity_ = "";
        private String name_ = "";
        private String securityContact_ = "";
        private String website_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Description, Builder> implements DescriptionOrBuilder {
            public /* synthetic */ Builder(C97471 r1) {
                this();
            }

            public Builder clearDetails() {
                copyOnWrite();
                ((Description) this.instance).clearDetails();
                return this;
            }

            public Builder clearIdentity() {
                copyOnWrite();
                ((Description) this.instance).clearIdentity();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Description) this.instance).clearName();
                return this;
            }

            public Builder clearSecurityContact() {
                copyOnWrite();
                ((Description) this.instance).clearSecurityContact();
                return this;
            }

            public Builder clearWebsite() {
                copyOnWrite();
                ((Description) this.instance).clearWebsite();
                return this;
            }

            public String getDetails() {
                return ((Description) this.instance).getDetails();
            }

            public ByteString getDetailsBytes() {
                return ((Description) this.instance).getDetailsBytes();
            }

            public String getIdentity() {
                return ((Description) this.instance).getIdentity();
            }

            public ByteString getIdentityBytes() {
                return ((Description) this.instance).getIdentityBytes();
            }

            public String getName() {
                return ((Description) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((Description) this.instance).getNameBytes();
            }

            public String getSecurityContact() {
                return ((Description) this.instance).getSecurityContact();
            }

            public ByteString getSecurityContactBytes() {
                return ((Description) this.instance).getSecurityContactBytes();
            }

            public String getWebsite() {
                return ((Description) this.instance).getWebsite();
            }

            public ByteString getWebsiteBytes() {
                return ((Description) this.instance).getWebsiteBytes();
            }

            public Builder setDetails(String str) {
                copyOnWrite();
                ((Description) this.instance).setDetails(str);
                return this;
            }

            public Builder setDetailsBytes(ByteString byteString) {
                copyOnWrite();
                ((Description) this.instance).setDetailsBytes(byteString);
                return this;
            }

            public Builder setIdentity(String str) {
                copyOnWrite();
                ((Description) this.instance).setIdentity(str);
                return this;
            }

            public Builder setIdentityBytes(ByteString byteString) {
                copyOnWrite();
                ((Description) this.instance).setIdentityBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Description) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Description) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setSecurityContact(String str) {
                copyOnWrite();
                ((Description) this.instance).setSecurityContact(str);
                return this;
            }

            public Builder setSecurityContactBytes(ByteString byteString) {
                copyOnWrite();
                ((Description) this.instance).setSecurityContactBytes(byteString);
                return this;
            }

            public Builder setWebsite(String str) {
                copyOnWrite();
                ((Description) this.instance).setWebsite(str);
                return this;
            }

            public Builder setWebsiteBytes(ByteString byteString) {
                copyOnWrite();
                ((Description) this.instance).setWebsiteBytes(byteString);
                return this;
            }

            private Builder() {
                super(Description.DEFAULT_INSTANCE);
            }
        }

        static {
            Description description = new Description();
            DEFAULT_INSTANCE = description;
            GeneratedMessageLite.registerDefaultInstance(Description.class, description);
        }

        private Description() {
        }

        /* access modifiers changed from: private */
        public void clearDetails() {
            this.details_ = getDefaultInstance().getDetails();
        }

        /* access modifiers changed from: private */
        public void clearIdentity() {
            this.identity_ = getDefaultInstance().getIdentity();
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearSecurityContact() {
            this.securityContact_ = getDefaultInstance().getSecurityContact();
        }

        /* access modifiers changed from: private */
        public void clearWebsite() {
            this.website_ = getDefaultInstance().getWebsite();
        }

        public static Description getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Description parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Description) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Description parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Description> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDetails(String str) {
            str.getClass();
            this.details_ = str;
        }

        /* access modifiers changed from: private */
        public void setDetailsBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.details_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setIdentity(String str) {
            str.getClass();
            this.identity_ = str;
        }

        /* access modifiers changed from: private */
        public void setIdentityBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.identity_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSecurityContact(String str) {
            str.getClass();
            this.securityContact_ = str;
        }

        /* access modifiers changed from: private */
        public void setSecurityContactBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.securityContact_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setWebsite(String str) {
            str.getClass();
            this.website_ = str;
        }

        /* access modifiers changed from: private */
        public void setWebsiteBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.website_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97471.f46560xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Description();
                case 2:
                    return new Builder((C97471) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"name_", "identity_", "website_", "securityContact_", "details_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Description> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Description.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getDetails() {
            return this.details_;
        }

        public ByteString getDetailsBytes() {
            return ByteString.copyFromUtf8(this.details_);
        }

        public String getIdentity() {
            return this.identity_;
        }

        public ByteString getIdentityBytes() {
            return ByteString.copyFromUtf8(this.identity_);
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public String getSecurityContact() {
            return this.securityContact_;
        }

        public ByteString getSecurityContactBytes() {
            return ByteString.copyFromUtf8(this.securityContact_);
        }

        public String getWebsite() {
            return this.website_;
        }

        public ByteString getWebsiteBytes() {
            return ByteString.copyFromUtf8(this.website_);
        }

        public static Builder newBuilder(Description description) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(description);
        }

        public static Description parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Description) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Description parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Description parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Description parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Description parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Description parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Description parseFrom(InputStream inputStream) throws IOException {
            return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Description parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Description parseFrom(C4969g gVar) throws IOException {
            return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Description parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Description) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DescriptionOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDetails();

        ByteString getDetailsBytes();

        String getIdentity();

        ByteString getIdentityBytes();

        String getName();

        ByteString getNameBytes();

        String getSecurityContact();

        ByteString getSecurityContactBytes();

        String getWebsite();

        ByteString getWebsiteBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DirectiveCollectRewards extends GeneratedMessageLite<DirectiveCollectRewards, Builder> implements DirectiveCollectRewardsOrBuilder {
        /* access modifiers changed from: private */
        public static final DirectiveCollectRewards DEFAULT_INSTANCE;
        public static final int DELEGATOR_ADDRESS_FIELD_NUMBER = 1;
        private static volatile im4<DirectiveCollectRewards> PARSER;
        private String delegatorAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<DirectiveCollectRewards, Builder> implements DirectiveCollectRewardsOrBuilder {
            public /* synthetic */ Builder(C97471 r1) {
                this();
            }

            public Builder clearDelegatorAddress() {
                copyOnWrite();
                ((DirectiveCollectRewards) this.instance).clearDelegatorAddress();
                return this;
            }

            public String getDelegatorAddress() {
                return ((DirectiveCollectRewards) this.instance).getDelegatorAddress();
            }

            public ByteString getDelegatorAddressBytes() {
                return ((DirectiveCollectRewards) this.instance).getDelegatorAddressBytes();
            }

            public Builder setDelegatorAddress(String str) {
                copyOnWrite();
                ((DirectiveCollectRewards) this.instance).setDelegatorAddress(str);
                return this;
            }

            public Builder setDelegatorAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DirectiveCollectRewards) this.instance).setDelegatorAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(DirectiveCollectRewards.DEFAULT_INSTANCE);
            }
        }

        static {
            DirectiveCollectRewards directiveCollectRewards = new DirectiveCollectRewards();
            DEFAULT_INSTANCE = directiveCollectRewards;
            GeneratedMessageLite.registerDefaultInstance(DirectiveCollectRewards.class, directiveCollectRewards);
        }

        private DirectiveCollectRewards() {
        }

        /* access modifiers changed from: private */
        public void clearDelegatorAddress() {
            this.delegatorAddress_ = getDefaultInstance().getDelegatorAddress();
        }

        public static DirectiveCollectRewards getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DirectiveCollectRewards parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DirectiveCollectRewards) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirectiveCollectRewards parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DirectiveCollectRewards) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DirectiveCollectRewards> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDelegatorAddress(String str) {
            str.getClass();
            this.delegatorAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setDelegatorAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.delegatorAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97471.f46560xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DirectiveCollectRewards();
                case 2:
                    return new Builder((C97471) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"delegatorAddress_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DirectiveCollectRewards> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DirectiveCollectRewards.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getDelegatorAddress() {
            return this.delegatorAddress_;
        }

        public ByteString getDelegatorAddressBytes() {
            return ByteString.copyFromUtf8(this.delegatorAddress_);
        }

        public static Builder newBuilder(DirectiveCollectRewards directiveCollectRewards) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(directiveCollectRewards);
        }

        public static DirectiveCollectRewards parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DirectiveCollectRewards) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DirectiveCollectRewards parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveCollectRewards) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DirectiveCollectRewards parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DirectiveCollectRewards) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DirectiveCollectRewards parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveCollectRewards) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DirectiveCollectRewards parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DirectiveCollectRewards) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DirectiveCollectRewards parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveCollectRewards) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DirectiveCollectRewards parseFrom(InputStream inputStream) throws IOException {
            return (DirectiveCollectRewards) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirectiveCollectRewards parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DirectiveCollectRewards) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DirectiveCollectRewards parseFrom(C4969g gVar) throws IOException {
            return (DirectiveCollectRewards) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DirectiveCollectRewards parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DirectiveCollectRewards) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DirectiveCollectRewardsOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDelegatorAddress();

        ByteString getDelegatorAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DirectiveCreateValidator extends GeneratedMessageLite<DirectiveCreateValidator, Builder> implements DirectiveCreateValidatorOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 8;
        public static final int COMMISSION_RATES_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final DirectiveCreateValidator DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int MAX_TOTAL_DELEGATION_FIELD_NUMBER = 5;
        public static final int MIN_SELF_DELEGATION_FIELD_NUMBER = 4;
        private static volatile im4<DirectiveCreateValidator> PARSER = null;
        public static final int SLOT_KEY_SIGS_FIELD_NUMBER = 7;
        public static final int SLOT_PUB_KEYS_FIELD_NUMBER = 6;
        public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 1;
        private ByteString amount_;
        private CommissionRate commissionRates_;
        private Description description_;
        private ByteString maxTotalDelegation_;
        private ByteString minSelfDelegation_;
        private C5011t.C5020i<ByteString> slotKeySigs_;
        private C5011t.C5020i<ByteString> slotPubKeys_;
        private String validatorAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<DirectiveCreateValidator, Builder> implements DirectiveCreateValidatorOrBuilder {
            public /* synthetic */ Builder(C97471 r1) {
                this();
            }

            public Builder addAllSlotKeySigs(Iterable<? extends ByteString> iterable) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).addAllSlotKeySigs(iterable);
                return this;
            }

            public Builder addAllSlotPubKeys(Iterable<? extends ByteString> iterable) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).addAllSlotPubKeys(iterable);
                return this;
            }

            public Builder addSlotKeySigs(ByteString byteString) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).addSlotKeySigs(byteString);
                return this;
            }

            public Builder addSlotPubKeys(ByteString byteString) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).addSlotPubKeys(byteString);
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).clearAmount();
                return this;
            }

            public Builder clearCommissionRates() {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).clearCommissionRates();
                return this;
            }

            public Builder clearDescription() {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).clearDescription();
                return this;
            }

            public Builder clearMaxTotalDelegation() {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).clearMaxTotalDelegation();
                return this;
            }

            public Builder clearMinSelfDelegation() {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).clearMinSelfDelegation();
                return this;
            }

            public Builder clearSlotKeySigs() {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).clearSlotKeySigs();
                return this;
            }

            public Builder clearSlotPubKeys() {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).clearSlotPubKeys();
                return this;
            }

            public Builder clearValidatorAddress() {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).clearValidatorAddress();
                return this;
            }

            public ByteString getAmount() {
                return ((DirectiveCreateValidator) this.instance).getAmount();
            }

            public CommissionRate getCommissionRates() {
                return ((DirectiveCreateValidator) this.instance).getCommissionRates();
            }

            public Description getDescription() {
                return ((DirectiveCreateValidator) this.instance).getDescription();
            }

            public ByteString getMaxTotalDelegation() {
                return ((DirectiveCreateValidator) this.instance).getMaxTotalDelegation();
            }

            public ByteString getMinSelfDelegation() {
                return ((DirectiveCreateValidator) this.instance).getMinSelfDelegation();
            }

            public ByteString getSlotKeySigs(int i) {
                return ((DirectiveCreateValidator) this.instance).getSlotKeySigs(i);
            }

            public int getSlotKeySigsCount() {
                return ((DirectiveCreateValidator) this.instance).getSlotKeySigsCount();
            }

            public List<ByteString> getSlotKeySigsList() {
                return Collections.unmodifiableList(((DirectiveCreateValidator) this.instance).getSlotKeySigsList());
            }

            public ByteString getSlotPubKeys(int i) {
                return ((DirectiveCreateValidator) this.instance).getSlotPubKeys(i);
            }

            public int getSlotPubKeysCount() {
                return ((DirectiveCreateValidator) this.instance).getSlotPubKeysCount();
            }

            public List<ByteString> getSlotPubKeysList() {
                return Collections.unmodifiableList(((DirectiveCreateValidator) this.instance).getSlotPubKeysList());
            }

            public String getValidatorAddress() {
                return ((DirectiveCreateValidator) this.instance).getValidatorAddress();
            }

            public ByteString getValidatorAddressBytes() {
                return ((DirectiveCreateValidator) this.instance).getValidatorAddressBytes();
            }

            public boolean hasCommissionRates() {
                return ((DirectiveCreateValidator) this.instance).hasCommissionRates();
            }

            public boolean hasDescription() {
                return ((DirectiveCreateValidator) this.instance).hasDescription();
            }

            public Builder mergeCommissionRates(CommissionRate commissionRate) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).mergeCommissionRates(commissionRate);
                return this;
            }

            public Builder mergeDescription(Description description) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).mergeDescription(description);
                return this;
            }

            public Builder setAmount(ByteString byteString) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).setAmount(byteString);
                return this;
            }

            public Builder setCommissionRates(CommissionRate commissionRate) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).setCommissionRates(commissionRate);
                return this;
            }

            public Builder setDescription(Description description) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).setDescription(description);
                return this;
            }

            public Builder setMaxTotalDelegation(ByteString byteString) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).setMaxTotalDelegation(byteString);
                return this;
            }

            public Builder setMinSelfDelegation(ByteString byteString) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).setMinSelfDelegation(byteString);
                return this;
            }

            public Builder setSlotKeySigs(int i, ByteString byteString) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).setSlotKeySigs(i, byteString);
                return this;
            }

            public Builder setSlotPubKeys(int i, ByteString byteString) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).setSlotPubKeys(i, byteString);
                return this;
            }

            public Builder setValidatorAddress(String str) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).setValidatorAddress(str);
                return this;
            }

            public Builder setValidatorAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).setValidatorAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(DirectiveCreateValidator.DEFAULT_INSTANCE);
            }

            public Builder setCommissionRates(CommissionRate.Builder builder) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).setCommissionRates((CommissionRate) builder.build());
                return this;
            }

            public Builder setDescription(Description.Builder builder) {
                copyOnWrite();
                ((DirectiveCreateValidator) this.instance).setDescription((Description) builder.build());
                return this;
            }
        }

        static {
            DirectiveCreateValidator directiveCreateValidator = new DirectiveCreateValidator();
            DEFAULT_INSTANCE = directiveCreateValidator;
            GeneratedMessageLite.registerDefaultInstance(DirectiveCreateValidator.class, directiveCreateValidator);
        }

        private DirectiveCreateValidator() {
            ByteString byteString = ByteString.EMPTY;
            this.minSelfDelegation_ = byteString;
            this.maxTotalDelegation_ = byteString;
            this.slotPubKeys_ = GeneratedMessageLite.emptyProtobufList();
            this.slotKeySigs_ = GeneratedMessageLite.emptyProtobufList();
            this.amount_ = byteString;
        }

        /* access modifiers changed from: private */
        public void addAllSlotKeySigs(Iterable<? extends ByteString> iterable) {
            ensureSlotKeySigsIsMutable();
            C4949a.addAll(iterable, this.slotKeySigs_);
        }

        /* access modifiers changed from: private */
        public void addAllSlotPubKeys(Iterable<? extends ByteString> iterable) {
            ensureSlotPubKeysIsMutable();
            C4949a.addAll(iterable, this.slotPubKeys_);
        }

        /* access modifiers changed from: private */
        public void addSlotKeySigs(ByteString byteString) {
            byteString.getClass();
            ensureSlotKeySigsIsMutable();
            this.slotKeySigs_.add(byteString);
        }

        /* access modifiers changed from: private */
        public void addSlotPubKeys(ByteString byteString) {
            byteString.getClass();
            ensureSlotPubKeysIsMutable();
            this.slotPubKeys_.add(byteString);
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearCommissionRates() {
            this.commissionRates_ = null;
        }

        /* access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = null;
        }

        /* access modifiers changed from: private */
        public void clearMaxTotalDelegation() {
            this.maxTotalDelegation_ = getDefaultInstance().getMaxTotalDelegation();
        }

        /* access modifiers changed from: private */
        public void clearMinSelfDelegation() {
            this.minSelfDelegation_ = getDefaultInstance().getMinSelfDelegation();
        }

        /* access modifiers changed from: private */
        public void clearSlotKeySigs() {
            this.slotKeySigs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSlotPubKeys() {
            this.slotPubKeys_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearValidatorAddress() {
            this.validatorAddress_ = getDefaultInstance().getValidatorAddress();
        }

        private void ensureSlotKeySigsIsMutable() {
            C5011t.C5020i<ByteString> iVar = this.slotKeySigs_;
            if (!iVar.mo37090v()) {
                this.slotKeySigs_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureSlotPubKeysIsMutable() {
            C5011t.C5020i<ByteString> iVar = this.slotPubKeys_;
            if (!iVar.mo37090v()) {
                this.slotPubKeys_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static DirectiveCreateValidator getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCommissionRates(CommissionRate commissionRate) {
            commissionRate.getClass();
            CommissionRate commissionRate2 = this.commissionRates_;
            if (commissionRate2 == null || commissionRate2 == CommissionRate.getDefaultInstance()) {
                this.commissionRates_ = commissionRate;
            } else {
                this.commissionRates_ = (CommissionRate) ((CommissionRate.Builder) CommissionRate.newBuilder(this.commissionRates_).mergeFrom(commissionRate)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeDescription(Description description) {
            description.getClass();
            Description description2 = this.description_;
            if (description2 == null || description2 == Description.getDefaultInstance()) {
                this.description_ = description;
            } else {
                this.description_ = (Description) ((Description.Builder) Description.newBuilder(this.description_).mergeFrom(description)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DirectiveCreateValidator parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DirectiveCreateValidator) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirectiveCreateValidator parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DirectiveCreateValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DirectiveCreateValidator> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(ByteString byteString) {
            byteString.getClass();
            this.amount_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setCommissionRates(CommissionRate commissionRate) {
            commissionRate.getClass();
            this.commissionRates_ = commissionRate;
        }

        /* access modifiers changed from: private */
        public void setDescription(Description description) {
            description.getClass();
            this.description_ = description;
        }

        /* access modifiers changed from: private */
        public void setMaxTotalDelegation(ByteString byteString) {
            byteString.getClass();
            this.maxTotalDelegation_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setMinSelfDelegation(ByteString byteString) {
            byteString.getClass();
            this.minSelfDelegation_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSlotKeySigs(int i, ByteString byteString) {
            byteString.getClass();
            ensureSlotKeySigsIsMutable();
            this.slotKeySigs_.set(i, byteString);
        }

        /* access modifiers changed from: private */
        public void setSlotPubKeys(int i, ByteString byteString) {
            byteString.getClass();
            ensureSlotPubKeysIsMutable();
            this.slotPubKeys_.set(i, byteString);
        }

        /* access modifiers changed from: private */
        public void setValidatorAddress(String str) {
            str.getClass();
            this.validatorAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setValidatorAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.validatorAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97471.f46560xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DirectiveCreateValidator();
                case 2:
                    return new Builder((C97471) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002\t\u0003\t\u0004\n\u0005\n\u0006\u001c\u0007\u001c\b\n", new Object[]{"validatorAddress_", "description_", "commissionRates_", "minSelfDelegation_", "maxTotalDelegation_", "slotPubKeys_", "slotKeySigs_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DirectiveCreateValidator> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DirectiveCreateValidator.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ByteString getAmount() {
            return this.amount_;
        }

        public CommissionRate getCommissionRates() {
            CommissionRate commissionRate = this.commissionRates_;
            if (commissionRate == null) {
                return CommissionRate.getDefaultInstance();
            }
            return commissionRate;
        }

        public Description getDescription() {
            Description description = this.description_;
            if (description == null) {
                return Description.getDefaultInstance();
            }
            return description;
        }

        public ByteString getMaxTotalDelegation() {
            return this.maxTotalDelegation_;
        }

        public ByteString getMinSelfDelegation() {
            return this.minSelfDelegation_;
        }

        public ByteString getSlotKeySigs(int i) {
            return this.slotKeySigs_.get(i);
        }

        public int getSlotKeySigsCount() {
            return this.slotKeySigs_.size();
        }

        public List<ByteString> getSlotKeySigsList() {
            return this.slotKeySigs_;
        }

        public ByteString getSlotPubKeys(int i) {
            return this.slotPubKeys_.get(i);
        }

        public int getSlotPubKeysCount() {
            return this.slotPubKeys_.size();
        }

        public List<ByteString> getSlotPubKeysList() {
            return this.slotPubKeys_;
        }

        public String getValidatorAddress() {
            return this.validatorAddress_;
        }

        public ByteString getValidatorAddressBytes() {
            return ByteString.copyFromUtf8(this.validatorAddress_);
        }

        public boolean hasCommissionRates() {
            if (this.commissionRates_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasDescription() {
            if (this.description_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(DirectiveCreateValidator directiveCreateValidator) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(directiveCreateValidator);
        }

        public static DirectiveCreateValidator parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DirectiveCreateValidator) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DirectiveCreateValidator parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveCreateValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DirectiveCreateValidator parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DirectiveCreateValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DirectiveCreateValidator parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveCreateValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DirectiveCreateValidator parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DirectiveCreateValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DirectiveCreateValidator parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveCreateValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DirectiveCreateValidator parseFrom(InputStream inputStream) throws IOException {
            return (DirectiveCreateValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirectiveCreateValidator parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DirectiveCreateValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DirectiveCreateValidator parseFrom(C4969g gVar) throws IOException {
            return (DirectiveCreateValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DirectiveCreateValidator parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DirectiveCreateValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DirectiveCreateValidatorOrBuilder extends qu3 {
        ByteString getAmount();

        CommissionRate getCommissionRates();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Description getDescription();

        ByteString getMaxTotalDelegation();

        ByteString getMinSelfDelegation();

        ByteString getSlotKeySigs(int i);

        int getSlotKeySigsCount();

        List<ByteString> getSlotKeySigsList();

        ByteString getSlotPubKeys(int i);

        int getSlotPubKeysCount();

        List<ByteString> getSlotPubKeysList();

        String getValidatorAddress();

        ByteString getValidatorAddressBytes();

        boolean hasCommissionRates();

        boolean hasDescription();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DirectiveDelegate extends GeneratedMessageLite<DirectiveDelegate, Builder> implements DirectiveDelegateOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final DirectiveDelegate DEFAULT_INSTANCE;
        public static final int DELEGATOR_ADDRESS_FIELD_NUMBER = 1;
        private static volatile im4<DirectiveDelegate> PARSER = null;
        public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 2;
        private ByteString amount_ = ByteString.EMPTY;
        private String delegatorAddress_ = "";
        private String validatorAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<DirectiveDelegate, Builder> implements DirectiveDelegateOrBuilder {
            public /* synthetic */ Builder(C97471 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((DirectiveDelegate) this.instance).clearAmount();
                return this;
            }

            public Builder clearDelegatorAddress() {
                copyOnWrite();
                ((DirectiveDelegate) this.instance).clearDelegatorAddress();
                return this;
            }

            public Builder clearValidatorAddress() {
                copyOnWrite();
                ((DirectiveDelegate) this.instance).clearValidatorAddress();
                return this;
            }

            public ByteString getAmount() {
                return ((DirectiveDelegate) this.instance).getAmount();
            }

            public String getDelegatorAddress() {
                return ((DirectiveDelegate) this.instance).getDelegatorAddress();
            }

            public ByteString getDelegatorAddressBytes() {
                return ((DirectiveDelegate) this.instance).getDelegatorAddressBytes();
            }

            public String getValidatorAddress() {
                return ((DirectiveDelegate) this.instance).getValidatorAddress();
            }

            public ByteString getValidatorAddressBytes() {
                return ((DirectiveDelegate) this.instance).getValidatorAddressBytes();
            }

            public Builder setAmount(ByteString byteString) {
                copyOnWrite();
                ((DirectiveDelegate) this.instance).setAmount(byteString);
                return this;
            }

            public Builder setDelegatorAddress(String str) {
                copyOnWrite();
                ((DirectiveDelegate) this.instance).setDelegatorAddress(str);
                return this;
            }

            public Builder setDelegatorAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DirectiveDelegate) this.instance).setDelegatorAddressBytes(byteString);
                return this;
            }

            public Builder setValidatorAddress(String str) {
                copyOnWrite();
                ((DirectiveDelegate) this.instance).setValidatorAddress(str);
                return this;
            }

            public Builder setValidatorAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DirectiveDelegate) this.instance).setValidatorAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(DirectiveDelegate.DEFAULT_INSTANCE);
            }
        }

        static {
            DirectiveDelegate directiveDelegate = new DirectiveDelegate();
            DEFAULT_INSTANCE = directiveDelegate;
            GeneratedMessageLite.registerDefaultInstance(DirectiveDelegate.class, directiveDelegate);
        }

        private DirectiveDelegate() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearDelegatorAddress() {
            this.delegatorAddress_ = getDefaultInstance().getDelegatorAddress();
        }

        /* access modifiers changed from: private */
        public void clearValidatorAddress() {
            this.validatorAddress_ = getDefaultInstance().getValidatorAddress();
        }

        public static DirectiveDelegate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DirectiveDelegate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DirectiveDelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirectiveDelegate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DirectiveDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DirectiveDelegate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(ByteString byteString) {
            byteString.getClass();
            this.amount_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setDelegatorAddress(String str) {
            str.getClass();
            this.delegatorAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setDelegatorAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.delegatorAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setValidatorAddress(String str) {
            str.getClass();
            this.validatorAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setValidatorAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.validatorAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97471.f46560xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DirectiveDelegate();
                case 2:
                    return new Builder((C97471) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n", new Object[]{"delegatorAddress_", "validatorAddress_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DirectiveDelegate> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DirectiveDelegate.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ByteString getAmount() {
            return this.amount_;
        }

        public String getDelegatorAddress() {
            return this.delegatorAddress_;
        }

        public ByteString getDelegatorAddressBytes() {
            return ByteString.copyFromUtf8(this.delegatorAddress_);
        }

        public String getValidatorAddress() {
            return this.validatorAddress_;
        }

        public ByteString getValidatorAddressBytes() {
            return ByteString.copyFromUtf8(this.validatorAddress_);
        }

        public static Builder newBuilder(DirectiveDelegate directiveDelegate) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(directiveDelegate);
        }

        public static DirectiveDelegate parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DirectiveDelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DirectiveDelegate parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DirectiveDelegate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DirectiveDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DirectiveDelegate parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DirectiveDelegate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DirectiveDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DirectiveDelegate parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DirectiveDelegate parseFrom(InputStream inputStream) throws IOException {
            return (DirectiveDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirectiveDelegate parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DirectiveDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DirectiveDelegate parseFrom(C4969g gVar) throws IOException {
            return (DirectiveDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DirectiveDelegate parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DirectiveDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DirectiveDelegateOrBuilder extends qu3 {
        ByteString getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDelegatorAddress();

        ByteString getDelegatorAddressBytes();

        String getValidatorAddress();

        ByteString getValidatorAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DirectiveEditValidator extends GeneratedMessageLite<DirectiveEditValidator, Builder> implements DirectiveEditValidatorOrBuilder {
        public static final int ACTIVE_FIELD_NUMBER = 9;
        public static final int COMMISSION_RATE_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final DirectiveEditValidator DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int MAX_TOTAL_DELEGATION_FIELD_NUMBER = 5;
        public static final int MIN_SELF_DELEGATION_FIELD_NUMBER = 4;
        private static volatile im4<DirectiveEditValidator> PARSER = null;
        public static final int SLOT_KEY_TO_ADD_FIELD_NUMBER = 7;
        public static final int SLOT_KEY_TO_ADD_SIG_FIELD_NUMBER = 8;
        public static final int SLOT_KEY_TO_REMOVE_FIELD_NUMBER = 6;
        public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 1;
        private ByteString active_;
        private Decimal commissionRate_;
        private Description description_;
        private ByteString maxTotalDelegation_;
        private ByteString minSelfDelegation_;
        private ByteString slotKeyToAddSig_;
        private ByteString slotKeyToAdd_;
        private ByteString slotKeyToRemove_;
        private String validatorAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<DirectiveEditValidator, Builder> implements DirectiveEditValidatorOrBuilder {
            public /* synthetic */ Builder(C97471 r1) {
                this();
            }

            public Builder clearActive() {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).clearActive();
                return this;
            }

            public Builder clearCommissionRate() {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).clearCommissionRate();
                return this;
            }

            public Builder clearDescription() {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).clearDescription();
                return this;
            }

            public Builder clearMaxTotalDelegation() {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).clearMaxTotalDelegation();
                return this;
            }

            public Builder clearMinSelfDelegation() {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).clearMinSelfDelegation();
                return this;
            }

            public Builder clearSlotKeyToAdd() {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).clearSlotKeyToAdd();
                return this;
            }

            public Builder clearSlotKeyToAddSig() {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).clearSlotKeyToAddSig();
                return this;
            }

            public Builder clearSlotKeyToRemove() {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).clearSlotKeyToRemove();
                return this;
            }

            public Builder clearValidatorAddress() {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).clearValidatorAddress();
                return this;
            }

            public ByteString getActive() {
                return ((DirectiveEditValidator) this.instance).getActive();
            }

            public Decimal getCommissionRate() {
                return ((DirectiveEditValidator) this.instance).getCommissionRate();
            }

            public Description getDescription() {
                return ((DirectiveEditValidator) this.instance).getDescription();
            }

            public ByteString getMaxTotalDelegation() {
                return ((DirectiveEditValidator) this.instance).getMaxTotalDelegation();
            }

            public ByteString getMinSelfDelegation() {
                return ((DirectiveEditValidator) this.instance).getMinSelfDelegation();
            }

            public ByteString getSlotKeyToAdd() {
                return ((DirectiveEditValidator) this.instance).getSlotKeyToAdd();
            }

            public ByteString getSlotKeyToAddSig() {
                return ((DirectiveEditValidator) this.instance).getSlotKeyToAddSig();
            }

            public ByteString getSlotKeyToRemove() {
                return ((DirectiveEditValidator) this.instance).getSlotKeyToRemove();
            }

            public String getValidatorAddress() {
                return ((DirectiveEditValidator) this.instance).getValidatorAddress();
            }

            public ByteString getValidatorAddressBytes() {
                return ((DirectiveEditValidator) this.instance).getValidatorAddressBytes();
            }

            public boolean hasCommissionRate() {
                return ((DirectiveEditValidator) this.instance).hasCommissionRate();
            }

            public boolean hasDescription() {
                return ((DirectiveEditValidator) this.instance).hasDescription();
            }

            public Builder mergeCommissionRate(Decimal decimal) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).mergeCommissionRate(decimal);
                return this;
            }

            public Builder mergeDescription(Description description) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).mergeDescription(description);
                return this;
            }

            public Builder setActive(ByteString byteString) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).setActive(byteString);
                return this;
            }

            public Builder setCommissionRate(Decimal decimal) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).setCommissionRate(decimal);
                return this;
            }

            public Builder setDescription(Description description) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).setDescription(description);
                return this;
            }

            public Builder setMaxTotalDelegation(ByteString byteString) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).setMaxTotalDelegation(byteString);
                return this;
            }

            public Builder setMinSelfDelegation(ByteString byteString) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).setMinSelfDelegation(byteString);
                return this;
            }

            public Builder setSlotKeyToAdd(ByteString byteString) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).setSlotKeyToAdd(byteString);
                return this;
            }

            public Builder setSlotKeyToAddSig(ByteString byteString) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).setSlotKeyToAddSig(byteString);
                return this;
            }

            public Builder setSlotKeyToRemove(ByteString byteString) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).setSlotKeyToRemove(byteString);
                return this;
            }

            public Builder setValidatorAddress(String str) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).setValidatorAddress(str);
                return this;
            }

            public Builder setValidatorAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).setValidatorAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(DirectiveEditValidator.DEFAULT_INSTANCE);
            }

            public Builder setCommissionRate(Decimal.Builder builder) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).setCommissionRate((Decimal) builder.build());
                return this;
            }

            public Builder setDescription(Description.Builder builder) {
                copyOnWrite();
                ((DirectiveEditValidator) this.instance).setDescription((Description) builder.build());
                return this;
            }
        }

        static {
            DirectiveEditValidator directiveEditValidator = new DirectiveEditValidator();
            DEFAULT_INSTANCE = directiveEditValidator;
            GeneratedMessageLite.registerDefaultInstance(DirectiveEditValidator.class, directiveEditValidator);
        }

        private DirectiveEditValidator() {
            ByteString byteString = ByteString.EMPTY;
            this.minSelfDelegation_ = byteString;
            this.maxTotalDelegation_ = byteString;
            this.slotKeyToRemove_ = byteString;
            this.slotKeyToAdd_ = byteString;
            this.slotKeyToAddSig_ = byteString;
            this.active_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearActive() {
            this.active_ = getDefaultInstance().getActive();
        }

        /* access modifiers changed from: private */
        public void clearCommissionRate() {
            this.commissionRate_ = null;
        }

        /* access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = null;
        }

        /* access modifiers changed from: private */
        public void clearMaxTotalDelegation() {
            this.maxTotalDelegation_ = getDefaultInstance().getMaxTotalDelegation();
        }

        /* access modifiers changed from: private */
        public void clearMinSelfDelegation() {
            this.minSelfDelegation_ = getDefaultInstance().getMinSelfDelegation();
        }

        /* access modifiers changed from: private */
        public void clearSlotKeyToAdd() {
            this.slotKeyToAdd_ = getDefaultInstance().getSlotKeyToAdd();
        }

        /* access modifiers changed from: private */
        public void clearSlotKeyToAddSig() {
            this.slotKeyToAddSig_ = getDefaultInstance().getSlotKeyToAddSig();
        }

        /* access modifiers changed from: private */
        public void clearSlotKeyToRemove() {
            this.slotKeyToRemove_ = getDefaultInstance().getSlotKeyToRemove();
        }

        /* access modifiers changed from: private */
        public void clearValidatorAddress() {
            this.validatorAddress_ = getDefaultInstance().getValidatorAddress();
        }

        public static DirectiveEditValidator getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCommissionRate(Decimal decimal) {
            decimal.getClass();
            Decimal decimal2 = this.commissionRate_;
            if (decimal2 == null || decimal2 == Decimal.getDefaultInstance()) {
                this.commissionRate_ = decimal;
            } else {
                this.commissionRate_ = (Decimal) ((Decimal.Builder) Decimal.newBuilder(this.commissionRate_).mergeFrom(decimal)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeDescription(Description description) {
            description.getClass();
            Description description2 = this.description_;
            if (description2 == null || description2 == Description.getDefaultInstance()) {
                this.description_ = description;
            } else {
                this.description_ = (Description) ((Description.Builder) Description.newBuilder(this.description_).mergeFrom(description)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DirectiveEditValidator parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DirectiveEditValidator) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirectiveEditValidator parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DirectiveEditValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DirectiveEditValidator> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setActive(ByteString byteString) {
            byteString.getClass();
            this.active_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setCommissionRate(Decimal decimal) {
            decimal.getClass();
            this.commissionRate_ = decimal;
        }

        /* access modifiers changed from: private */
        public void setDescription(Description description) {
            description.getClass();
            this.description_ = description;
        }

        /* access modifiers changed from: private */
        public void setMaxTotalDelegation(ByteString byteString) {
            byteString.getClass();
            this.maxTotalDelegation_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setMinSelfDelegation(ByteString byteString) {
            byteString.getClass();
            this.minSelfDelegation_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSlotKeyToAdd(ByteString byteString) {
            byteString.getClass();
            this.slotKeyToAdd_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSlotKeyToAddSig(ByteString byteString) {
            byteString.getClass();
            this.slotKeyToAddSig_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSlotKeyToRemove(ByteString byteString) {
            byteString.getClass();
            this.slotKeyToRemove_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setValidatorAddress(String str) {
            str.getClass();
            this.validatorAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setValidatorAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.validatorAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97471.f46560xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DirectiveEditValidator();
                case 2:
                    return new Builder((C97471) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t\u0004\n\u0005\n\u0006\n\u0007\n\b\n\t\n", new Object[]{"validatorAddress_", "description_", "commissionRate_", "minSelfDelegation_", "maxTotalDelegation_", "slotKeyToRemove_", "slotKeyToAdd_", "slotKeyToAddSig_", "active_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DirectiveEditValidator> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DirectiveEditValidator.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ByteString getActive() {
            return this.active_;
        }

        public Decimal getCommissionRate() {
            Decimal decimal = this.commissionRate_;
            if (decimal == null) {
                return Decimal.getDefaultInstance();
            }
            return decimal;
        }

        public Description getDescription() {
            Description description = this.description_;
            if (description == null) {
                return Description.getDefaultInstance();
            }
            return description;
        }

        public ByteString getMaxTotalDelegation() {
            return this.maxTotalDelegation_;
        }

        public ByteString getMinSelfDelegation() {
            return this.minSelfDelegation_;
        }

        public ByteString getSlotKeyToAdd() {
            return this.slotKeyToAdd_;
        }

        public ByteString getSlotKeyToAddSig() {
            return this.slotKeyToAddSig_;
        }

        public ByteString getSlotKeyToRemove() {
            return this.slotKeyToRemove_;
        }

        public String getValidatorAddress() {
            return this.validatorAddress_;
        }

        public ByteString getValidatorAddressBytes() {
            return ByteString.copyFromUtf8(this.validatorAddress_);
        }

        public boolean hasCommissionRate() {
            if (this.commissionRate_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasDescription() {
            if (this.description_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(DirectiveEditValidator directiveEditValidator) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(directiveEditValidator);
        }

        public static DirectiveEditValidator parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DirectiveEditValidator) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DirectiveEditValidator parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveEditValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DirectiveEditValidator parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DirectiveEditValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DirectiveEditValidator parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveEditValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DirectiveEditValidator parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DirectiveEditValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DirectiveEditValidator parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveEditValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DirectiveEditValidator parseFrom(InputStream inputStream) throws IOException {
            return (DirectiveEditValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirectiveEditValidator parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DirectiveEditValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DirectiveEditValidator parseFrom(C4969g gVar) throws IOException {
            return (DirectiveEditValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DirectiveEditValidator parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DirectiveEditValidator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DirectiveEditValidatorOrBuilder extends qu3 {
        ByteString getActive();

        Decimal getCommissionRate();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Description getDescription();

        ByteString getMaxTotalDelegation();

        ByteString getMinSelfDelegation();

        ByteString getSlotKeyToAdd();

        ByteString getSlotKeyToAddSig();

        ByteString getSlotKeyToRemove();

        String getValidatorAddress();

        ByteString getValidatorAddressBytes();

        boolean hasCommissionRate();

        boolean hasDescription();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DirectiveUndelegate extends GeneratedMessageLite<DirectiveUndelegate, Builder> implements DirectiveUndelegateOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final DirectiveUndelegate DEFAULT_INSTANCE;
        public static final int DELEGATOR_ADDRESS_FIELD_NUMBER = 1;
        private static volatile im4<DirectiveUndelegate> PARSER = null;
        public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 2;
        private ByteString amount_ = ByteString.EMPTY;
        private String delegatorAddress_ = "";
        private String validatorAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<DirectiveUndelegate, Builder> implements DirectiveUndelegateOrBuilder {
            public /* synthetic */ Builder(C97471 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((DirectiveUndelegate) this.instance).clearAmount();
                return this;
            }

            public Builder clearDelegatorAddress() {
                copyOnWrite();
                ((DirectiveUndelegate) this.instance).clearDelegatorAddress();
                return this;
            }

            public Builder clearValidatorAddress() {
                copyOnWrite();
                ((DirectiveUndelegate) this.instance).clearValidatorAddress();
                return this;
            }

            public ByteString getAmount() {
                return ((DirectiveUndelegate) this.instance).getAmount();
            }

            public String getDelegatorAddress() {
                return ((DirectiveUndelegate) this.instance).getDelegatorAddress();
            }

            public ByteString getDelegatorAddressBytes() {
                return ((DirectiveUndelegate) this.instance).getDelegatorAddressBytes();
            }

            public String getValidatorAddress() {
                return ((DirectiveUndelegate) this.instance).getValidatorAddress();
            }

            public ByteString getValidatorAddressBytes() {
                return ((DirectiveUndelegate) this.instance).getValidatorAddressBytes();
            }

            public Builder setAmount(ByteString byteString) {
                copyOnWrite();
                ((DirectiveUndelegate) this.instance).setAmount(byteString);
                return this;
            }

            public Builder setDelegatorAddress(String str) {
                copyOnWrite();
                ((DirectiveUndelegate) this.instance).setDelegatorAddress(str);
                return this;
            }

            public Builder setDelegatorAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DirectiveUndelegate) this.instance).setDelegatorAddressBytes(byteString);
                return this;
            }

            public Builder setValidatorAddress(String str) {
                copyOnWrite();
                ((DirectiveUndelegate) this.instance).setValidatorAddress(str);
                return this;
            }

            public Builder setValidatorAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DirectiveUndelegate) this.instance).setValidatorAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(DirectiveUndelegate.DEFAULT_INSTANCE);
            }
        }

        static {
            DirectiveUndelegate directiveUndelegate = new DirectiveUndelegate();
            DEFAULT_INSTANCE = directiveUndelegate;
            GeneratedMessageLite.registerDefaultInstance(DirectiveUndelegate.class, directiveUndelegate);
        }

        private DirectiveUndelegate() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearDelegatorAddress() {
            this.delegatorAddress_ = getDefaultInstance().getDelegatorAddress();
        }

        /* access modifiers changed from: private */
        public void clearValidatorAddress() {
            this.validatorAddress_ = getDefaultInstance().getValidatorAddress();
        }

        public static DirectiveUndelegate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DirectiveUndelegate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DirectiveUndelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirectiveUndelegate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DirectiveUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DirectiveUndelegate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(ByteString byteString) {
            byteString.getClass();
            this.amount_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setDelegatorAddress(String str) {
            str.getClass();
            this.delegatorAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setDelegatorAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.delegatorAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setValidatorAddress(String str) {
            str.getClass();
            this.validatorAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setValidatorAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.validatorAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97471.f46560xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DirectiveUndelegate();
                case 2:
                    return new Builder((C97471) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n", new Object[]{"delegatorAddress_", "validatorAddress_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DirectiveUndelegate> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DirectiveUndelegate.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ByteString getAmount() {
            return this.amount_;
        }

        public String getDelegatorAddress() {
            return this.delegatorAddress_;
        }

        public ByteString getDelegatorAddressBytes() {
            return ByteString.copyFromUtf8(this.delegatorAddress_);
        }

        public String getValidatorAddress() {
            return this.validatorAddress_;
        }

        public ByteString getValidatorAddressBytes() {
            return ByteString.copyFromUtf8(this.validatorAddress_);
        }

        public static Builder newBuilder(DirectiveUndelegate directiveUndelegate) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(directiveUndelegate);
        }

        public static DirectiveUndelegate parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DirectiveUndelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DirectiveUndelegate parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DirectiveUndelegate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DirectiveUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DirectiveUndelegate parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DirectiveUndelegate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DirectiveUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DirectiveUndelegate parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DirectiveUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DirectiveUndelegate parseFrom(InputStream inputStream) throws IOException {
            return (DirectiveUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirectiveUndelegate parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DirectiveUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DirectiveUndelegate parseFrom(C4969g gVar) throws IOException {
            return (DirectiveUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DirectiveUndelegate parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DirectiveUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DirectiveUndelegateOrBuilder extends qu3 {
        ByteString getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDelegatorAddress();

        ByteString getDelegatorAddressBytes();

        String getValidatorAddress();

        ByteString getValidatorAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int CHAIN_ID_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 2;
        public static final int STAKING_MESSAGE_FIELD_NUMBER = 4;
        public static final int TRANSACTION_MESSAGE_FIELD_NUMBER = 3;
        private ByteString chainId_;
        private int messageOneofCase_ = 0;
        private Object messageOneof_;
        private ByteString privateKey_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97471 r1) {
                this();
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearChainId();
                return this;
            }

            public Builder clearMessageOneof() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMessageOneof();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearStakingMessage() {
                copyOnWrite();
                ((SigningInput) this.instance).clearStakingMessage();
                return this;
            }

            public Builder clearTransactionMessage() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransactionMessage();
                return this;
            }

            public ByteString getChainId() {
                return ((SigningInput) this.instance).getChainId();
            }

            public MessageOneofCase getMessageOneofCase() {
                return ((SigningInput) this.instance).getMessageOneofCase();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public StakingMessage getStakingMessage() {
                return ((SigningInput) this.instance).getStakingMessage();
            }

            public TransactionMessage getTransactionMessage() {
                return ((SigningInput) this.instance).getTransactionMessage();
            }

            public boolean hasStakingMessage() {
                return ((SigningInput) this.instance).hasStakingMessage();
            }

            public boolean hasTransactionMessage() {
                return ((SigningInput) this.instance).hasTransactionMessage();
            }

            public Builder mergeStakingMessage(StakingMessage stakingMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeStakingMessage(stakingMessage);
                return this;
            }

            public Builder mergeTransactionMessage(TransactionMessage transactionMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransactionMessage(transactionMessage);
                return this;
            }

            public Builder setChainId(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setChainId(byteString);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setStakingMessage(StakingMessage stakingMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakingMessage(stakingMessage);
                return this;
            }

            public Builder setTransactionMessage(TransactionMessage transactionMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransactionMessage(transactionMessage);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setStakingMessage(StakingMessage.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakingMessage((StakingMessage) builder.build());
                return this;
            }

            public Builder setTransactionMessage(TransactionMessage.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransactionMessage((TransactionMessage) builder.build());
                return this;
            }
        }

        public enum MessageOneofCase {
            TRANSACTION_MESSAGE(3),
            STAKING_MESSAGE(4),
            MESSAGEONEOF_NOT_SET(0);
            
            private final int value;

            private MessageOneofCase(int i) {
                this.value = i;
            }

            public static MessageOneofCase forNumber(int i) {
                if (i == 0) {
                    return MESSAGEONEOF_NOT_SET;
                }
                if (i == 3) {
                    return TRANSACTION_MESSAGE;
                }
                if (i != 4) {
                    return null;
                }
                return STAKING_MESSAGE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MessageOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            SigningInput signingInput = new SigningInput();
            DEFAULT_INSTANCE = signingInput;
            GeneratedMessageLite.registerDefaultInstance(SigningInput.class, signingInput);
        }

        private SigningInput() {
            ByteString byteString = ByteString.EMPTY;
            this.chainId_ = byteString;
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = getDefaultInstance().getChainId();
        }

        /* access modifiers changed from: private */
        public void clearMessageOneof() {
            this.messageOneofCase_ = 0;
            this.messageOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearStakingMessage() {
            if (this.messageOneofCase_ == 4) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransactionMessage() {
            if (this.messageOneofCase_ == 3) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeStakingMessage(StakingMessage stakingMessage) {
            stakingMessage.getClass();
            if (this.messageOneofCase_ != 4 || this.messageOneof_ == StakingMessage.getDefaultInstance()) {
                this.messageOneof_ = stakingMessage;
            } else {
                this.messageOneof_ = ((StakingMessage.Builder) StakingMessage.newBuilder((StakingMessage) this.messageOneof_).mergeFrom(stakingMessage)).buildPartial();
            }
            this.messageOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void mergeTransactionMessage(TransactionMessage transactionMessage) {
            transactionMessage.getClass();
            if (this.messageOneofCase_ != 3 || this.messageOneof_ == TransactionMessage.getDefaultInstance()) {
                this.messageOneof_ = transactionMessage;
            } else {
                this.messageOneof_ = ((TransactionMessage.Builder) TransactionMessage.newBuilder((TransactionMessage) this.messageOneof_).mergeFrom(transactionMessage)).buildPartial();
            }
            this.messageOneofCase_ = 3;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SigningInput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SigningInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SigningInput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<SigningInput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setChainId(ByteString byteString) {
            byteString.getClass();
            this.chainId_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setStakingMessage(StakingMessage stakingMessage) {
            stakingMessage.getClass();
            this.messageOneof_ = stakingMessage;
            this.messageOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void setTransactionMessage(TransactionMessage transactionMessage) {
            transactionMessage.getClass();
            this.messageOneof_ = transactionMessage;
            this.messageOneofCase_ = 3;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97471.f46560xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97471) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003<\u0000\u0004<\u0000", new Object[]{"messageOneof_", "messageOneofCase_", "chainId_", "privateKey_", TransactionMessage.class, StakingMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<SigningInput> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (SigningInput.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ByteString getChainId() {
            return this.chainId_;
        }

        public MessageOneofCase getMessageOneofCase() {
            return MessageOneofCase.forNumber(this.messageOneofCase_);
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public StakingMessage getStakingMessage() {
            if (this.messageOneofCase_ == 4) {
                return (StakingMessage) this.messageOneof_;
            }
            return StakingMessage.getDefaultInstance();
        }

        public TransactionMessage getTransactionMessage() {
            if (this.messageOneofCase_ == 3) {
                return (TransactionMessage) this.messageOneof_;
            }
            return TransactionMessage.getDefaultInstance();
        }

        public boolean hasStakingMessage() {
            if (this.messageOneofCase_ == 4) {
                return true;
            }
            return false;
        }

        public boolean hasTransactionMessage() {
            if (this.messageOneofCase_ == 3) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(SigningInput signingInput) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(signingInput);
        }

        public static SigningInput parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SigningInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SigningInput parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static SigningInput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SigningInput parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static SigningInput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SigningInput parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static SigningInput parseFrom(InputStream inputStream) throws IOException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SigningInput parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SigningInput parseFrom(C4969g gVar) throws IOException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static SigningInput parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface SigningInputOrBuilder extends qu3 {
        ByteString getChainId();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        SigningInput.MessageOneofCase getMessageOneofCase();

        ByteString getPrivateKey();

        StakingMessage getStakingMessage();

        TransactionMessage getTransactionMessage();

        boolean hasStakingMessage();

        boolean hasTransactionMessage();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int R_FIELD_NUMBER = 3;
        public static final int S_FIELD_NUMBER = 4;
        public static final int V_FIELD_NUMBER = 2;
        private ByteString encoded_;

        /* renamed from: r_ */
        private ByteString f46561r_;

        /* renamed from: s_ */
        private ByteString f46562s_;

        /* renamed from: v_ */
        private ByteString f46563v_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97471 r1) {
                this();
            }

            public Builder clearEncoded() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearEncoded();
                return this;
            }

            public Builder clearR() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearR();
                return this;
            }

            public Builder clearS() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearS();
                return this;
            }

            public Builder clearV() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearV();
                return this;
            }

            public ByteString getEncoded() {
                return ((SigningOutput) this.instance).getEncoded();
            }

            public ByteString getR() {
                return ((SigningOutput) this.instance).getR();
            }

            public ByteString getS() {
                return ((SigningOutput) this.instance).getS();
            }

            public ByteString getV() {
                return ((SigningOutput) this.instance).getV();
            }

            public Builder setEncoded(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setEncoded(byteString);
                return this;
            }

            public Builder setR(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setR(byteString);
                return this;
            }

            public Builder setS(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setS(byteString);
                return this;
            }

            public Builder setV(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setV(byteString);
                return this;
            }

            private Builder() {
                super(SigningOutput.DEFAULT_INSTANCE);
            }
        }

        static {
            SigningOutput signingOutput = new SigningOutput();
            DEFAULT_INSTANCE = signingOutput;
            GeneratedMessageLite.registerDefaultInstance(SigningOutput.class, signingOutput);
        }

        private SigningOutput() {
            ByteString byteString = ByteString.EMPTY;
            this.encoded_ = byteString;
            this.f46563v_ = byteString;
            this.f46561r_ = byteString;
            this.f46562s_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearEncoded() {
            this.encoded_ = getDefaultInstance().getEncoded();
        }

        /* access modifiers changed from: private */
        public void clearR() {
            this.f46561r_ = getDefaultInstance().getR();
        }

        /* access modifiers changed from: private */
        public void clearS() {
            this.f46562s_ = getDefaultInstance().getS();
        }

        /* access modifiers changed from: private */
        public void clearV() {
            this.f46563v_ = getDefaultInstance().getV();
        }

        public static SigningOutput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SigningOutput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SigningOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SigningOutput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<SigningOutput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setEncoded(ByteString byteString) {
            byteString.getClass();
            this.encoded_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setR(ByteString byteString) {
            byteString.getClass();
            this.f46561r_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setS(ByteString byteString) {
            byteString.getClass();
            this.f46562s_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setV(ByteString byteString) {
            byteString.getClass();
            this.f46563v_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97471.f46560xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97471) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\n", new Object[]{"encoded_", "v_", "r_", "s_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<SigningOutput> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (SigningOutput.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ByteString getEncoded() {
            return this.encoded_;
        }

        public ByteString getR() {
            return this.f46561r_;
        }

        public ByteString getS() {
            return this.f46562s_;
        }

        public ByteString getV() {
            return this.f46563v_;
        }

        public static Builder newBuilder(SigningOutput signingOutput) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(signingOutput);
        }

        public static SigningOutput parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SigningOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SigningOutput parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static SigningOutput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SigningOutput parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static SigningOutput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SigningOutput parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static SigningOutput parseFrom(InputStream inputStream) throws IOException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SigningOutput parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SigningOutput parseFrom(C4969g gVar) throws IOException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static SigningOutput parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface SigningOutputOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getEncoded();

        ByteString getR();

        ByteString getS();

        ByteString getV();

        /* synthetic */ boolean isInitialized();
    }

    public static final class StakingMessage extends GeneratedMessageLite<StakingMessage, Builder> implements StakingMessageOrBuilder {
        public static final int COLLECT_REWARDS_FIELD_NUMBER = 5;
        public static final int CREATE_VALIDATOR_MESSAGE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final StakingMessage DEFAULT_INSTANCE;
        public static final int DELEGATE_MESSAGE_FIELD_NUMBER = 3;
        public static final int EDIT_VALIDATOR_MESSAGE_FIELD_NUMBER = 2;
        public static final int GAS_LIMIT_FIELD_NUMBER = 8;
        public static final int GAS_PRICE_FIELD_NUMBER = 7;
        public static final int NONCE_FIELD_NUMBER = 6;
        private static volatile im4<StakingMessage> PARSER = null;
        public static final int UNDELEGATE_MESSAGE_FIELD_NUMBER = 4;
        private ByteString gasLimit_;
        private ByteString gasPrice_;
        private ByteString nonce_;
        private int stakeMsgCase_ = 0;
        private Object stakeMsg_;

        public static final class Builder extends GeneratedMessageLite.C4930a<StakingMessage, Builder> implements StakingMessageOrBuilder {
            public /* synthetic */ Builder(C97471 r1) {
                this();
            }

            public Builder clearCollectRewards() {
                copyOnWrite();
                ((StakingMessage) this.instance).clearCollectRewards();
                return this;
            }

            public Builder clearCreateValidatorMessage() {
                copyOnWrite();
                ((StakingMessage) this.instance).clearCreateValidatorMessage();
                return this;
            }

            public Builder clearDelegateMessage() {
                copyOnWrite();
                ((StakingMessage) this.instance).clearDelegateMessage();
                return this;
            }

            public Builder clearEditValidatorMessage() {
                copyOnWrite();
                ((StakingMessage) this.instance).clearEditValidatorMessage();
                return this;
            }

            public Builder clearGasLimit() {
                copyOnWrite();
                ((StakingMessage) this.instance).clearGasLimit();
                return this;
            }

            public Builder clearGasPrice() {
                copyOnWrite();
                ((StakingMessage) this.instance).clearGasPrice();
                return this;
            }

            public Builder clearNonce() {
                copyOnWrite();
                ((StakingMessage) this.instance).clearNonce();
                return this;
            }

            public Builder clearStakeMsg() {
                copyOnWrite();
                ((StakingMessage) this.instance).clearStakeMsg();
                return this;
            }

            public Builder clearUndelegateMessage() {
                copyOnWrite();
                ((StakingMessage) this.instance).clearUndelegateMessage();
                return this;
            }

            public DirectiveCollectRewards getCollectRewards() {
                return ((StakingMessage) this.instance).getCollectRewards();
            }

            public DirectiveCreateValidator getCreateValidatorMessage() {
                return ((StakingMessage) this.instance).getCreateValidatorMessage();
            }

            public DirectiveDelegate getDelegateMessage() {
                return ((StakingMessage) this.instance).getDelegateMessage();
            }

            public DirectiveEditValidator getEditValidatorMessage() {
                return ((StakingMessage) this.instance).getEditValidatorMessage();
            }

            public ByteString getGasLimit() {
                return ((StakingMessage) this.instance).getGasLimit();
            }

            public ByteString getGasPrice() {
                return ((StakingMessage) this.instance).getGasPrice();
            }

            public ByteString getNonce() {
                return ((StakingMessage) this.instance).getNonce();
            }

            public StakeMsgCase getStakeMsgCase() {
                return ((StakingMessage) this.instance).getStakeMsgCase();
            }

            public DirectiveUndelegate getUndelegateMessage() {
                return ((StakingMessage) this.instance).getUndelegateMessage();
            }

            public boolean hasCollectRewards() {
                return ((StakingMessage) this.instance).hasCollectRewards();
            }

            public boolean hasCreateValidatorMessage() {
                return ((StakingMessage) this.instance).hasCreateValidatorMessage();
            }

            public boolean hasDelegateMessage() {
                return ((StakingMessage) this.instance).hasDelegateMessage();
            }

            public boolean hasEditValidatorMessage() {
                return ((StakingMessage) this.instance).hasEditValidatorMessage();
            }

            public boolean hasUndelegateMessage() {
                return ((StakingMessage) this.instance).hasUndelegateMessage();
            }

            public Builder mergeCollectRewards(DirectiveCollectRewards directiveCollectRewards) {
                copyOnWrite();
                ((StakingMessage) this.instance).mergeCollectRewards(directiveCollectRewards);
                return this;
            }

            public Builder mergeCreateValidatorMessage(DirectiveCreateValidator directiveCreateValidator) {
                copyOnWrite();
                ((StakingMessage) this.instance).mergeCreateValidatorMessage(directiveCreateValidator);
                return this;
            }

            public Builder mergeDelegateMessage(DirectiveDelegate directiveDelegate) {
                copyOnWrite();
                ((StakingMessage) this.instance).mergeDelegateMessage(directiveDelegate);
                return this;
            }

            public Builder mergeEditValidatorMessage(DirectiveEditValidator directiveEditValidator) {
                copyOnWrite();
                ((StakingMessage) this.instance).mergeEditValidatorMessage(directiveEditValidator);
                return this;
            }

            public Builder mergeUndelegateMessage(DirectiveUndelegate directiveUndelegate) {
                copyOnWrite();
                ((StakingMessage) this.instance).mergeUndelegateMessage(directiveUndelegate);
                return this;
            }

            public Builder setCollectRewards(DirectiveCollectRewards directiveCollectRewards) {
                copyOnWrite();
                ((StakingMessage) this.instance).setCollectRewards(directiveCollectRewards);
                return this;
            }

            public Builder setCreateValidatorMessage(DirectiveCreateValidator directiveCreateValidator) {
                copyOnWrite();
                ((StakingMessage) this.instance).setCreateValidatorMessage(directiveCreateValidator);
                return this;
            }

            public Builder setDelegateMessage(DirectiveDelegate directiveDelegate) {
                copyOnWrite();
                ((StakingMessage) this.instance).setDelegateMessage(directiveDelegate);
                return this;
            }

            public Builder setEditValidatorMessage(DirectiveEditValidator directiveEditValidator) {
                copyOnWrite();
                ((StakingMessage) this.instance).setEditValidatorMessage(directiveEditValidator);
                return this;
            }

            public Builder setGasLimit(ByteString byteString) {
                copyOnWrite();
                ((StakingMessage) this.instance).setGasLimit(byteString);
                return this;
            }

            public Builder setGasPrice(ByteString byteString) {
                copyOnWrite();
                ((StakingMessage) this.instance).setGasPrice(byteString);
                return this;
            }

            public Builder setNonce(ByteString byteString) {
                copyOnWrite();
                ((StakingMessage) this.instance).setNonce(byteString);
                return this;
            }

            public Builder setUndelegateMessage(DirectiveUndelegate directiveUndelegate) {
                copyOnWrite();
                ((StakingMessage) this.instance).setUndelegateMessage(directiveUndelegate);
                return this;
            }

            private Builder() {
                super(StakingMessage.DEFAULT_INSTANCE);
            }

            public Builder setCollectRewards(DirectiveCollectRewards.Builder builder) {
                copyOnWrite();
                ((StakingMessage) this.instance).setCollectRewards((DirectiveCollectRewards) builder.build());
                return this;
            }

            public Builder setCreateValidatorMessage(DirectiveCreateValidator.Builder builder) {
                copyOnWrite();
                ((StakingMessage) this.instance).setCreateValidatorMessage((DirectiveCreateValidator) builder.build());
                return this;
            }

            public Builder setDelegateMessage(DirectiveDelegate.Builder builder) {
                copyOnWrite();
                ((StakingMessage) this.instance).setDelegateMessage((DirectiveDelegate) builder.build());
                return this;
            }

            public Builder setEditValidatorMessage(DirectiveEditValidator.Builder builder) {
                copyOnWrite();
                ((StakingMessage) this.instance).setEditValidatorMessage((DirectiveEditValidator) builder.build());
                return this;
            }

            public Builder setUndelegateMessage(DirectiveUndelegate.Builder builder) {
                copyOnWrite();
                ((StakingMessage) this.instance).setUndelegateMessage((DirectiveUndelegate) builder.build());
                return this;
            }
        }

        public enum StakeMsgCase {
            CREATE_VALIDATOR_MESSAGE(1),
            EDIT_VALIDATOR_MESSAGE(2),
            DELEGATE_MESSAGE(3),
            UNDELEGATE_MESSAGE(4),
            COLLECT_REWARDS(5),
            STAKEMSG_NOT_SET(0);
            
            private final int value;

            private StakeMsgCase(int i) {
                this.value = i;
            }

            public static StakeMsgCase forNumber(int i) {
                if (i == 0) {
                    return STAKEMSG_NOT_SET;
                }
                if (i == 1) {
                    return CREATE_VALIDATOR_MESSAGE;
                }
                if (i == 2) {
                    return EDIT_VALIDATOR_MESSAGE;
                }
                if (i == 3) {
                    return DELEGATE_MESSAGE;
                }
                if (i == 4) {
                    return UNDELEGATE_MESSAGE;
                }
                if (i != 5) {
                    return null;
                }
                return COLLECT_REWARDS;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static StakeMsgCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            StakingMessage stakingMessage = new StakingMessage();
            DEFAULT_INSTANCE = stakingMessage;
            GeneratedMessageLite.registerDefaultInstance(StakingMessage.class, stakingMessage);
        }

        private StakingMessage() {
            ByteString byteString = ByteString.EMPTY;
            this.nonce_ = byteString;
            this.gasPrice_ = byteString;
            this.gasLimit_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearCollectRewards() {
            if (this.stakeMsgCase_ == 5) {
                this.stakeMsgCase_ = 0;
                this.stakeMsg_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearCreateValidatorMessage() {
            if (this.stakeMsgCase_ == 1) {
                this.stakeMsgCase_ = 0;
                this.stakeMsg_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDelegateMessage() {
            if (this.stakeMsgCase_ == 3) {
                this.stakeMsgCase_ = 0;
                this.stakeMsg_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearEditValidatorMessage() {
            if (this.stakeMsgCase_ == 2) {
                this.stakeMsgCase_ = 0;
                this.stakeMsg_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearGasLimit() {
            this.gasLimit_ = getDefaultInstance().getGasLimit();
        }

        /* access modifiers changed from: private */
        public void clearGasPrice() {
            this.gasPrice_ = getDefaultInstance().getGasPrice();
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = getDefaultInstance().getNonce();
        }

        /* access modifiers changed from: private */
        public void clearStakeMsg() {
            this.stakeMsgCase_ = 0;
            this.stakeMsg_ = null;
        }

        /* access modifiers changed from: private */
        public void clearUndelegateMessage() {
            if (this.stakeMsgCase_ == 4) {
                this.stakeMsgCase_ = 0;
                this.stakeMsg_ = null;
            }
        }

        public static StakingMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCollectRewards(DirectiveCollectRewards directiveCollectRewards) {
            directiveCollectRewards.getClass();
            if (this.stakeMsgCase_ != 5 || this.stakeMsg_ == DirectiveCollectRewards.getDefaultInstance()) {
                this.stakeMsg_ = directiveCollectRewards;
            } else {
                this.stakeMsg_ = ((DirectiveCollectRewards.Builder) DirectiveCollectRewards.newBuilder((DirectiveCollectRewards) this.stakeMsg_).mergeFrom(directiveCollectRewards)).buildPartial();
            }
            this.stakeMsgCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void mergeCreateValidatorMessage(DirectiveCreateValidator directiveCreateValidator) {
            directiveCreateValidator.getClass();
            if (this.stakeMsgCase_ != 1 || this.stakeMsg_ == DirectiveCreateValidator.getDefaultInstance()) {
                this.stakeMsg_ = directiveCreateValidator;
            } else {
                this.stakeMsg_ = ((DirectiveCreateValidator.Builder) DirectiveCreateValidator.newBuilder((DirectiveCreateValidator) this.stakeMsg_).mergeFrom(directiveCreateValidator)).buildPartial();
            }
            this.stakeMsgCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergeDelegateMessage(DirectiveDelegate directiveDelegate) {
            directiveDelegate.getClass();
            if (this.stakeMsgCase_ != 3 || this.stakeMsg_ == DirectiveDelegate.getDefaultInstance()) {
                this.stakeMsg_ = directiveDelegate;
            } else {
                this.stakeMsg_ = ((DirectiveDelegate.Builder) DirectiveDelegate.newBuilder((DirectiveDelegate) this.stakeMsg_).mergeFrom(directiveDelegate)).buildPartial();
            }
            this.stakeMsgCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeEditValidatorMessage(DirectiveEditValidator directiveEditValidator) {
            directiveEditValidator.getClass();
            if (this.stakeMsgCase_ != 2 || this.stakeMsg_ == DirectiveEditValidator.getDefaultInstance()) {
                this.stakeMsg_ = directiveEditValidator;
            } else {
                this.stakeMsg_ = ((DirectiveEditValidator.Builder) DirectiveEditValidator.newBuilder((DirectiveEditValidator) this.stakeMsg_).mergeFrom(directiveEditValidator)).buildPartial();
            }
            this.stakeMsgCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeUndelegateMessage(DirectiveUndelegate directiveUndelegate) {
            directiveUndelegate.getClass();
            if (this.stakeMsgCase_ != 4 || this.stakeMsg_ == DirectiveUndelegate.getDefaultInstance()) {
                this.stakeMsg_ = directiveUndelegate;
            } else {
                this.stakeMsg_ = ((DirectiveUndelegate.Builder) DirectiveUndelegate.newBuilder((DirectiveUndelegate) this.stakeMsg_).mergeFrom(directiveUndelegate)).buildPartial();
            }
            this.stakeMsgCase_ = 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static StakingMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StakingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StakingMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StakingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<StakingMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCollectRewards(DirectiveCollectRewards directiveCollectRewards) {
            directiveCollectRewards.getClass();
            this.stakeMsg_ = directiveCollectRewards;
            this.stakeMsgCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void setCreateValidatorMessage(DirectiveCreateValidator directiveCreateValidator) {
            directiveCreateValidator.getClass();
            this.stakeMsg_ = directiveCreateValidator;
            this.stakeMsgCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void setDelegateMessage(DirectiveDelegate directiveDelegate) {
            directiveDelegate.getClass();
            this.stakeMsg_ = directiveDelegate;
            this.stakeMsgCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void setEditValidatorMessage(DirectiveEditValidator directiveEditValidator) {
            directiveEditValidator.getClass();
            this.stakeMsg_ = directiveEditValidator;
            this.stakeMsgCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setGasLimit(ByteString byteString) {
            byteString.getClass();
            this.gasLimit_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setGasPrice(ByteString byteString) {
            byteString.getClass();
            this.gasPrice_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setNonce(ByteString byteString) {
            byteString.getClass();
            this.nonce_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setUndelegateMessage(DirectiveUndelegate directiveUndelegate) {
            directiveUndelegate.getClass();
            this.stakeMsg_ = directiveUndelegate;
            this.stakeMsgCase_ = 4;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97471.f46560xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new StakingMessage();
                case 2:
                    return new Builder((C97471) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\n\u0007\n\b\n", new Object[]{"stakeMsg_", "stakeMsgCase_", DirectiveCreateValidator.class, DirectiveEditValidator.class, DirectiveDelegate.class, DirectiveUndelegate.class, DirectiveCollectRewards.class, "nonce_", "gasPrice_", "gasLimit_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<StakingMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (StakingMessage.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DirectiveCollectRewards getCollectRewards() {
            if (this.stakeMsgCase_ == 5) {
                return (DirectiveCollectRewards) this.stakeMsg_;
            }
            return DirectiveCollectRewards.getDefaultInstance();
        }

        public DirectiveCreateValidator getCreateValidatorMessage() {
            if (this.stakeMsgCase_ == 1) {
                return (DirectiveCreateValidator) this.stakeMsg_;
            }
            return DirectiveCreateValidator.getDefaultInstance();
        }

        public DirectiveDelegate getDelegateMessage() {
            if (this.stakeMsgCase_ == 3) {
                return (DirectiveDelegate) this.stakeMsg_;
            }
            return DirectiveDelegate.getDefaultInstance();
        }

        public DirectiveEditValidator getEditValidatorMessage() {
            if (this.stakeMsgCase_ == 2) {
                return (DirectiveEditValidator) this.stakeMsg_;
            }
            return DirectiveEditValidator.getDefaultInstance();
        }

        public ByteString getGasLimit() {
            return this.gasLimit_;
        }

        public ByteString getGasPrice() {
            return this.gasPrice_;
        }

        public ByteString getNonce() {
            return this.nonce_;
        }

        public StakeMsgCase getStakeMsgCase() {
            return StakeMsgCase.forNumber(this.stakeMsgCase_);
        }

        public DirectiveUndelegate getUndelegateMessage() {
            if (this.stakeMsgCase_ == 4) {
                return (DirectiveUndelegate) this.stakeMsg_;
            }
            return DirectiveUndelegate.getDefaultInstance();
        }

        public boolean hasCollectRewards() {
            if (this.stakeMsgCase_ == 5) {
                return true;
            }
            return false;
        }

        public boolean hasCreateValidatorMessage() {
            if (this.stakeMsgCase_ == 1) {
                return true;
            }
            return false;
        }

        public boolean hasDelegateMessage() {
            if (this.stakeMsgCase_ == 3) {
                return true;
            }
            return false;
        }

        public boolean hasEditValidatorMessage() {
            if (this.stakeMsgCase_ == 2) {
                return true;
            }
            return false;
        }

        public boolean hasUndelegateMessage() {
            if (this.stakeMsgCase_ == 4) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(StakingMessage stakingMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(stakingMessage);
        }

        public static StakingMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (StakingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static StakingMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (StakingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static StakingMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StakingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StakingMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (StakingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static StakingMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StakingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StakingMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (StakingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static StakingMessage parseFrom(InputStream inputStream) throws IOException {
            return (StakingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StakingMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (StakingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static StakingMessage parseFrom(C4969g gVar) throws IOException {
            return (StakingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static StakingMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (StakingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface StakingMessageOrBuilder extends qu3 {
        DirectiveCollectRewards getCollectRewards();

        DirectiveCreateValidator getCreateValidatorMessage();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        DirectiveDelegate getDelegateMessage();

        DirectiveEditValidator getEditValidatorMessage();

        ByteString getGasLimit();

        ByteString getGasPrice();

        ByteString getNonce();

        StakingMessage.StakeMsgCase getStakeMsgCase();

        DirectiveUndelegate getUndelegateMessage();

        boolean hasCollectRewards();

        boolean hasCreateValidatorMessage();

        boolean hasDelegateMessage();

        boolean hasEditValidatorMessage();

        boolean hasUndelegateMessage();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransactionMessage extends GeneratedMessageLite<TransactionMessage, Builder> implements TransactionMessageOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final TransactionMessage DEFAULT_INSTANCE;
        public static final int FROM_SHARD_ID_FIELD_NUMBER = 7;
        public static final int GAS_LIMIT_FIELD_NUMBER = 3;
        public static final int GAS_PRICE_FIELD_NUMBER = 2;
        public static final int NONCE_FIELD_NUMBER = 1;
        private static volatile im4<TransactionMessage> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 6;
        public static final int TO_ADDRESS_FIELD_NUMBER = 4;
        public static final int TO_SHARD_ID_FIELD_NUMBER = 8;
        private ByteString amount_;
        private ByteString fromShardId_;
        private ByteString gasLimit_;
        private ByteString gasPrice_;
        private ByteString nonce_;
        private ByteString payload_;
        private String toAddress_ = "";
        private ByteString toShardId_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionMessage, Builder> implements TransactionMessageOrBuilder {
            public /* synthetic */ Builder(C97471 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransactionMessage) this.instance).clearAmount();
                return this;
            }

            public Builder clearFromShardId() {
                copyOnWrite();
                ((TransactionMessage) this.instance).clearFromShardId();
                return this;
            }

            public Builder clearGasLimit() {
                copyOnWrite();
                ((TransactionMessage) this.instance).clearGasLimit();
                return this;
            }

            public Builder clearGasPrice() {
                copyOnWrite();
                ((TransactionMessage) this.instance).clearGasPrice();
                return this;
            }

            public Builder clearNonce() {
                copyOnWrite();
                ((TransactionMessage) this.instance).clearNonce();
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((TransactionMessage) this.instance).clearPayload();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((TransactionMessage) this.instance).clearToAddress();
                return this;
            }

            public Builder clearToShardId() {
                copyOnWrite();
                ((TransactionMessage) this.instance).clearToShardId();
                return this;
            }

            public ByteString getAmount() {
                return ((TransactionMessage) this.instance).getAmount();
            }

            public ByteString getFromShardId() {
                return ((TransactionMessage) this.instance).getFromShardId();
            }

            public ByteString getGasLimit() {
                return ((TransactionMessage) this.instance).getGasLimit();
            }

            public ByteString getGasPrice() {
                return ((TransactionMessage) this.instance).getGasPrice();
            }

            public ByteString getNonce() {
                return ((TransactionMessage) this.instance).getNonce();
            }

            public ByteString getPayload() {
                return ((TransactionMessage) this.instance).getPayload();
            }

            public String getToAddress() {
                return ((TransactionMessage) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((TransactionMessage) this.instance).getToAddressBytes();
            }

            public ByteString getToShardId() {
                return ((TransactionMessage) this.instance).getToShardId();
            }

            public Builder setAmount(ByteString byteString) {
                copyOnWrite();
                ((TransactionMessage) this.instance).setAmount(byteString);
                return this;
            }

            public Builder setFromShardId(ByteString byteString) {
                copyOnWrite();
                ((TransactionMessage) this.instance).setFromShardId(byteString);
                return this;
            }

            public Builder setGasLimit(ByteString byteString) {
                copyOnWrite();
                ((TransactionMessage) this.instance).setGasLimit(byteString);
                return this;
            }

            public Builder setGasPrice(ByteString byteString) {
                copyOnWrite();
                ((TransactionMessage) this.instance).setGasPrice(byteString);
                return this;
            }

            public Builder setNonce(ByteString byteString) {
                copyOnWrite();
                ((TransactionMessage) this.instance).setNonce(byteString);
                return this;
            }

            public Builder setPayload(ByteString byteString) {
                copyOnWrite();
                ((TransactionMessage) this.instance).setPayload(byteString);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((TransactionMessage) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionMessage) this.instance).setToAddressBytes(byteString);
                return this;
            }

            public Builder setToShardId(ByteString byteString) {
                copyOnWrite();
                ((TransactionMessage) this.instance).setToShardId(byteString);
                return this;
            }

            private Builder() {
                super(TransactionMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            TransactionMessage transactionMessage = new TransactionMessage();
            DEFAULT_INSTANCE = transactionMessage;
            GeneratedMessageLite.registerDefaultInstance(TransactionMessage.class, transactionMessage);
        }

        private TransactionMessage() {
            ByteString byteString = ByteString.EMPTY;
            this.nonce_ = byteString;
            this.gasPrice_ = byteString;
            this.gasLimit_ = byteString;
            this.amount_ = byteString;
            this.payload_ = byteString;
            this.fromShardId_ = byteString;
            this.toShardId_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearFromShardId() {
            this.fromShardId_ = getDefaultInstance().getFromShardId();
        }

        /* access modifiers changed from: private */
        public void clearGasLimit() {
            this.gasLimit_ = getDefaultInstance().getGasLimit();
        }

        /* access modifiers changed from: private */
        public void clearGasPrice() {
            this.gasPrice_ = getDefaultInstance().getGasPrice();
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = getDefaultInstance().getNonce();
        }

        /* access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = getDefaultInstance().getPayload();
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        /* access modifiers changed from: private */
        public void clearToShardId() {
            this.toShardId_ = getDefaultInstance().getToShardId();
        }

        public static TransactionMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransactionMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransactionMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(ByteString byteString) {
            byteString.getClass();
            this.amount_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setFromShardId(ByteString byteString) {
            byteString.getClass();
            this.fromShardId_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setGasLimit(ByteString byteString) {
            byteString.getClass();
            this.gasLimit_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setGasPrice(ByteString byteString) {
            byteString.getClass();
            this.gasPrice_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setNonce(ByteString byteString) {
            byteString.getClass();
            this.nonce_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setPayload(ByteString byteString) {
            byteString.getClass();
            this.payload_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setToAddress(String str) {
            str.getClass();
            this.toAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setToAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.toAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setToShardId(ByteString byteString) {
            byteString.getClass();
            this.toShardId_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97471.f46560xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionMessage();
                case 2:
                    return new Builder((C97471) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004Ȉ\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"nonce_", "gasPrice_", "gasLimit_", "toAddress_", "amount_", "payload_", "fromShardId_", "toShardId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransactionMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransactionMessage.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ByteString getAmount() {
            return this.amount_;
        }

        public ByteString getFromShardId() {
            return this.fromShardId_;
        }

        public ByteString getGasLimit() {
            return this.gasLimit_;
        }

        public ByteString getGasPrice() {
            return this.gasPrice_;
        }

        public ByteString getNonce() {
            return this.nonce_;
        }

        public ByteString getPayload() {
            return this.payload_;
        }

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public ByteString getToShardId() {
            return this.toShardId_;
        }

        public static Builder newBuilder(TransactionMessage transactionMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionMessage);
        }

        public static TransactionMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransactionMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransactionMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransactionMessage parseFrom(InputStream inputStream) throws IOException {
            return (TransactionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionMessage parseFrom(C4969g gVar) throws IOException {
            return (TransactionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransactionMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransactionMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransactionMessageOrBuilder extends qu3 {
        ByteString getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getFromShardId();

        ByteString getGasLimit();

        ByteString getGasPrice();

        ByteString getNonce();

        ByteString getPayload();

        String getToAddress();

        ByteString getToAddressBytes();

        ByteString getToShardId();

        /* synthetic */ boolean isInitialized();
    }

    private Harmony() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
