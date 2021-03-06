package com.mhp.coding.challenges.dependency.notifications;

import com.mhp.coding.challenges.dependency.inquiry.Inquiry;
import com.mhp.coding.challenges.dependency.inquiry.InquiryEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailHandler {

    private static final Logger LOG = LoggerFactory.getLogger(EmailHandler.class);

    public void sendEmail(final Inquiry inquiry) {
        LOG.info("Sending email for: {}", inquiry);
    }

    @EventListener
    @Async
    public void handleEvent(InquiryEvent event) {
        sendEmail(event.getInquiry());
    }
}
