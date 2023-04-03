package zendesk.core;

interface AccessProvider {
    public static final String NO_JWT_ERROR_MESSAGE = "The jwt user identifier is null or empty. We cannot proceed to get an access token";

    bg5<AuthenticationResponse> getAuthTokenViaAnonymous(AnonymousIdentity anonymousIdentity);

    bg5<AuthenticationResponse> getAuthTokenViaJwt(JwtIdentity jwtIdentity);
}
