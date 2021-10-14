import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;
import javax.websocket.Session;

@ServerEndpoint("/chat")
public class ChatServer {
    private static final Logger logger = Logger.getLogger(ChatServer.class.getName());
    private static List<Session> sessions = new ArrayList<Session>();

    @OnOpen
    public void openSession(Session newSession) {
        if (sessions.add(newSession)) {
            logger.info("New session opened: " + newSession.getId());
        }
        else {
            logger.warning("Session was already being tracked: " + newSession.getId());
        }
    } 

    @OnClose
    public void closeSession(Session closingSession) {
        if (sessions.remove(closingSession)) {
            logger.info(String.format("Session closed: %d", closingSession.getId()));
        }
        else {
            logger.warning(String.format("Session is not being tracked: %d", closingSession.getId()));
        }
    }

    @OnMessage
    public void sendMessage(String message) throws IOException {
        for(Session session : sessions) {
            session.getBasicRemote().sendText(message);
        }
    }
}
