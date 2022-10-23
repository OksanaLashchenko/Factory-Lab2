public class LinkedInPostCreator implements PostCreator {

    @Override
    public LinkedInConnection createPost() {
        return new LinkedInConnection("password", "email");
    }

}
