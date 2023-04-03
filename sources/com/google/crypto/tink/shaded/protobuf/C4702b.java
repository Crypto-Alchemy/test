package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4705c0;

/* renamed from: com.google.crypto.tink.shaded.protobuf.b */
/* compiled from: AbstractParser */
public abstract class C4702b<MessageType extends C4705c0> implements km4<MessageType> {

    /* renamed from: a */
    public static final C4734l f25139a = C4734l.m38174b();

    /* renamed from: c */
    public final MessageType mo35617c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw mo35618d(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    /* renamed from: d */
    public final UninitializedMessageException mo35618d(MessageType messagetype) {
        if (messagetype instanceof C4699a) {
            return ((C4699a) messagetype).mo35603e();
        }
        return new UninitializedMessageException((C4705c0) messagetype);
    }

    /* renamed from: e */
    public MessageType mo35616b(ByteString byteString, C4734l lVar) throws InvalidProtocolBufferException {
        return mo35617c(mo35620f(byteString, lVar));
    }

    /* renamed from: f */
    public MessageType mo35620f(ByteString byteString, C4734l lVar) throws InvalidProtocolBufferException {
        MessageType messagetype;
        try {
            C4717g newCodedInput = byteString.newCodedInput();
            messagetype = (C4705c0) mo35473a(newCodedInput, lVar);
            newCodedInput.mo35786a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }
}
