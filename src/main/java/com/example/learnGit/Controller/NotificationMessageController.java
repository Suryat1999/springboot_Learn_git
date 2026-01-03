package com.example.learnGit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnGit.Service.CustomNotificationService;
import com.example.learnGit.model.NotificationMessagePOJO;

@RestController
public class NotificationMessageController {

	@Autowired
	public CustomNotificationService NotificationService;

	
	@PostMapping(value = "/insert")
	public String insertOrderDetails(NotificationMessagePOJO notificationMessagePOJO) {
		
		String statusmessage = NotificationService.sendNotification(notificationMessagePOJO);
		
		return statusmessage;
		
	}
	

	
}
