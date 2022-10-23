public class LinkedInConnection extends SocialNetworkConnection {

    private String email;

    public LinkedInConnection(String password, String email) {
        super(password);
        this.email = email;
    }

}
