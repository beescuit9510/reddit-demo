package com.reddit.redditdemo.asynchronous;

import com.reddit.redditdemo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JmsUserMessagingService implements UserMessagingService {

    private final JmsTemplate jms;

    @Override
    public void sendUser(User user) {
//        jms.send( new MessageCreator() {
//                     @Override
//                     public Message createMessage(Session session)
//                             throws JMSException {
//                         return session.createObjectMessage(user);
//                     }
//                 }
//        );

        jms.send(session -> session.createObjectMessage(user));
    }
}
