package com.example.learnGit.ServiceImpl;

import com.example.learnGit.Service.CustomNotificationService;
import com.example.learnGit.model.NotificationMessagePOJO;

public class CustomNotificationServiceImpl implements CustomNotificationService {

	@Override
	public String sendNotification(NotificationMessagePOJO notificationMessagePOJO) {
		// TODO Auto-generated method stub
		
		notificationMessagePOJO.setSenderMessageStatus("Message send successfully");
		
		return notificationMessagePOJO.getSenderMessageStatus();
	}

}
