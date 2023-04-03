package zendesk.core;

public interface PushRegistrationProvider {
    boolean isRegisteredForPush();

    void registerWithDeviceIdentifier(String str, op7<String> op7);

    void registerWithUAChannelId(String str, op7<String> op7);

    void unregisterDevice(op7<Void> op7);
}
