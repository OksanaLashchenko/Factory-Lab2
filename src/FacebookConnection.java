public class FacebookConnection extends SocialNetworkConnection {

    private String login;

    public FacebookConnection(String password, String login) {
        super(password);
        this.login = login;
    }

}
