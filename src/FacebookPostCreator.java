public class FacebookPostCreator implements PostCreator{

    @Override
    public FacebookConnection createPost() {
        return new FacebookConnection("password", "login");
    }

}
