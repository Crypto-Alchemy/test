package zendesk.core;

interface PushRegistrationService {
    @ak4("/api/mobile/push_notification_devices.json")
    k90<PushRegistrationResponseWrapper> registerDevice(@p30 PushRegistrationRequestWrapper pushRegistrationRequestWrapper);

    @mz0("/api/mobile/push_notification_devices/{id}.json")
    k90<Void> unregisterDevice(@sm4("id") String str);
}
