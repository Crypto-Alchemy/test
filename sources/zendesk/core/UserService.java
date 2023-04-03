package zendesk.core;

interface UserService {
    @ak4("/api/mobile/user_tags.json")
    k90<UserResponse> addTags(@p30 UserTagRequest userTagRequest);

    @mz0("/api/mobile/user_tags/destroy_many.json")
    k90<UserResponse> deleteTags(@sz4("tags") String str);

    @le2("/api/mobile/users/me.json")
    k90<UserResponse> getUser();

    @le2("/api/mobile/user_fields.json")
    k90<UserFieldResponse> getUserFields();

    @dk4("/api/mobile/users/me.json")
    k90<UserResponse> setUserFields(@p30 UserFieldRequest userFieldRequest);
}
