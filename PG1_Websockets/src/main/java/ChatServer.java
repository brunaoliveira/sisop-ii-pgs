import javax.websocket.server.ServerEndpoint;
import javax.websocket.Session;
import java.util.logging.Logger;

@ServerEndpoint("/chat")
public class ChatServer {
    private static final Logger LOGGER = Logger.getLogger(ChatServer.class.getName());
    private static List<Session> openSessions = new ArrayList<Session>();

    @onOpen
    public void openSession(Session new_session) {
    
    } 

    @onClose
    public void closeSession(Session closing_session) {
        
    }

}
